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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;




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

import com.bydan.erp.activosfijos.util.CuentaContaDetaGrupoActiConstantesFunciones;
import com.bydan.erp.activosfijos.util.CuentaContaDetaGrupoActiParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.CuentaContaDetaGrupoActiParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.CuentaContaDetaGrupoActiBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CuentaContaDetaGrupoActiBeanSwingJInternalFrame extends CuentaContaDetaGrupoActiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CuentaContaDetaGrupoActiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CuentaContaDetaGrupoActi> cuentacontadetagrupoactiValidator = new ClassValidator<CuentaContaDetaGrupoActi>(CuentaContaDetaGrupoActi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CuentaContaDetaGrupoActi cuentacontadetagrupoacti;	
	public CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux;
	public CuentaContaDetaGrupoActi cuentacontadetagrupoactiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CuentaContaDetaGrupoActi cuentacontadetagrupoactiTotales;
	public Long idCuentaContaDetaGrupoActiActual;
	public Long iIdNuevoCuentaContaDetaGrupoActi=0L;
	public int rowIndexActual=0;
	
	
	
	
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

	public String sFinalQueryComboDetalleGrupoActivoFijo="";

	public List<DetalleGrupoActivoFijo> detallegrupoactivofijosForeignKey;

	public List<DetalleGrupoActivoFijo> getdetallegrupoactivofijosForeignKey() {
		return detallegrupoactivofijosForeignKey;
	}

	public void setdetallegrupoactivofijosForeignKey(List<DetalleGrupoActivoFijo> detallegrupoactivofijosForeignKey) {
		this.detallegrupoactivofijosForeignKey = detallegrupoactivofijosForeignKey;
	}

	//OBJETO FK ACTUAL
	public DetalleGrupoActivoFijo detallegrupoactivofijoForeignKey;

	public DetalleGrupoActivoFijo getdetallegrupoactivofijoForeignKey() {
		return detallegrupoactivofijoForeignKey;
	}

	public void setdetallegrupoactivofijoForeignKey(DetalleGrupoActivoFijo detallegrupoactivofijoForeignKey) {
		this.detallegrupoactivofijoForeignKey = detallegrupoactivofijoForeignKey;
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
	
	public Boolean isPermisoTodoCuentaContaDetaGrupoActi;
	public Boolean isPermisoNuevoCuentaContaDetaGrupoActi;
	public Boolean isPermisoActualizarCuentaContaDetaGrupoActi;
	public Boolean isPermisoActualizarOriginalCuentaContaDetaGrupoActi;
	public Boolean isPermisoEliminarCuentaContaDetaGrupoActi;
	public Boolean isPermisoGuardarCambiosCuentaContaDetaGrupoActi;
	public Boolean isPermisoConsultaCuentaContaDetaGrupoActi;
	public Boolean isPermisoBusquedaCuentaContaDetaGrupoActi;
	public Boolean isPermisoReporteCuentaContaDetaGrupoActi;
	public Boolean isPermisoPaginacionMedioCuentaContaDetaGrupoActi;
	public Boolean isPermisoPaginacionAltoCuentaContaDetaGrupoActi;
	public Boolean isPermisoPaginacionTodoCuentaContaDetaGrupoActi;
	public Boolean isPermisoCopiarCuentaContaDetaGrupoActi;
	public Boolean isPermisoVerFormCuentaContaDetaGrupoActi;
	public Boolean isPermisoDuplicarCuentaContaDetaGrupoActi;
	public Boolean isPermisoOrdenCuentaContaDetaGrupoActi;
	
	
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
	
	public CuentaContaDetaGrupoActiParameterReturnGeneral cuentacontadetagrupoactiReturnGeneral;
	public CuentaContaDetaGrupoActiParameterReturnGeneral cuentacontadetagrupoactiParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCuentaContaDetaGrupoActi=false;
	public Boolean esParaAccionDesdeFormularioCuentaContaDetaGrupoActi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CuentaContaDetaGrupoActiSessionBeanAdditional cuentacontadetagrupoactiSessionBeanAdditional=null;
	
	public CuentaContaDetaGrupoActiSessionBeanAdditional getCuentaContaDetaGrupoActiSessionBeanAdditional() {
		return this.cuentacontadetagrupoactiSessionBeanAdditional;
	}
	
	public void setCuentaContaDetaGrupoActiSessionBeanAdditional(CuentaContaDetaGrupoActiSessionBeanAdditional cuentacontadetagrupoactiSessionBeanAdditional) {
		try {
			this.cuentacontadetagrupoactiSessionBeanAdditional=cuentacontadetagrupoactiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional cuentacontadetagrupoactiBeanSwingJInternalFrameAdditional=null;
	//public class CuentaContaDetaGrupoActiBeanSwingJInternalFrame
	
	public CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional getCuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional() {
		return this.cuentacontadetagrupoactiBeanSwingJInternalFrameAdditional;
	}
	
	public void setCuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional(CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional cuentacontadetagrupoactiBeanSwingJInternalFrameAdditional) {
		try {
			this.cuentacontadetagrupoactiBeanSwingJInternalFrameAdditional=cuentacontadetagrupoactiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CuentaContaDetaGrupoActiLogic cuentacontadetagrupoactiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CuentaContaDetaGrupoActi cuentacontadetagrupoactiBean;
	public CuentaContaDetaGrupoActiConstantesFunciones cuentacontadetagrupoactiConstantesFunciones;
	//public CuentaContaDetaGrupoActiParameterReturnGeneral cuentacontadetagrupoactiReturnGeneral;
	
	//FK
	
	public CuentaContableLogic cuentacontableLogic;
	public DetalleGrupoActivoFijoLogic detallegrupoactivofijoLogic;
	
	//PARAMETROS
	
	
	//public List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactis;	
	//public List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisEliminados;
	//public List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi=false;
	public Boolean isVisibilidadCeldaDuplicarCuentaContaDetaGrupoActi=true;
	public Boolean isVisibilidadCeldaCopiarCuentaContaDetaGrupoActi=true;
	public Boolean isVisibilidadCeldaVerFormCuentaContaDetaGrupoActi=true;
	public Boolean isVisibilidadCeldaOrdenCuentaContaDetaGrupoActi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi=false;
	public Boolean isVisibilidadCeldaModificarCuentaContaDetaGrupoActi=false;
	public Boolean isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi=false;
	public Boolean isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi=false;
	public Boolean isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi=false;
	public Boolean isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi=false;	
	
	
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdDetalleGrupoActivoFijo=false;
	
	public Long getiIdNuevoCuentaContaDetaGrupoActi() {
		return this.iIdNuevoCuentaContaDetaGrupoActi;
	}

	public void setiIdNuevoCuentaContaDetaGrupoActi(Long iIdNuevoCuentaContaDetaGrupoActi) {
		this.iIdNuevoCuentaContaDetaGrupoActi = iIdNuevoCuentaContaDetaGrupoActi;
	}
	
	public Long getidCuentaContaDetaGrupoActiActual() {
		return this.idCuentaContaDetaGrupoActiActual;
	}

	public void setidCuentaContaDetaGrupoActiActual(Long idCuentaContaDetaGrupoActiActual) {
		this.idCuentaContaDetaGrupoActiActual = idCuentaContaDetaGrupoActiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CuentaContaDetaGrupoActi getcuentacontadetagrupoacti() {
		return this.cuentacontadetagrupoacti;
	}

	public void setcuentacontadetagrupoacti(CuentaContaDetaGrupoActi cuentacontadetagrupoacti) {
		this.cuentacontadetagrupoacti = cuentacontadetagrupoacti;
	}
	
	public CuentaContaDetaGrupoActi getcuentacontadetagrupoactiAux() {
		return this.cuentacontadetagrupoactiAux;
	}

	public void setcuentacontadetagrupoactiAux(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux) {
		this.cuentacontadetagrupoactiAux = cuentacontadetagrupoactiAux;
	}				
	
	public CuentaContaDetaGrupoActi getcuentacontadetagrupoactiAnterior() {
		return this.cuentacontadetagrupoactiAnterior;
	}

	public void setcuentacontadetagrupoactiAnterior(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAnterior) {
		this.cuentacontadetagrupoactiAnterior = cuentacontadetagrupoactiAnterior;
	}	
	
	public CuentaContaDetaGrupoActi getcuentacontadetagrupoactiTotales() {
		return this.cuentacontadetagrupoactiTotales;
	}

	public void setcuentacontadetagrupoactiTotales(CuentaContaDetaGrupoActi cuentacontadetagrupoactiTotales) {
		this.cuentacontadetagrupoactiTotales = cuentacontadetagrupoactiTotales;
	}	
	
	public CuentaContaDetaGrupoActi getcuentacontadetagrupoactiBean() {
		return this.cuentacontadetagrupoactiBean;
	}

	public void setcuentacontadetagrupoactiBean(CuentaContaDetaGrupoActi cuentacontadetagrupoactiBean) {
		this.cuentacontadetagrupoactiBean = cuentacontadetagrupoactiBean;
	}	
	
	public CuentaContaDetaGrupoActiParameterReturnGeneral getcuentacontadetagrupoactiReturnGeneral() {
		return this.cuentacontadetagrupoactiReturnGeneral;
	}

	public void setcuentacontadetagrupoactiReturnGeneral(CuentaContaDetaGrupoActiParameterReturnGeneral cuentacontadetagrupoactiReturnGeneral) {
		this.cuentacontadetagrupoactiReturnGeneral = cuentacontadetagrupoactiReturnGeneral;
	}	
	
	
	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
	}

	public Long id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo=-1L;

	public Long getid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo() {
		return this.id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo;
	}

	public void setid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo(Long id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo) {
		this.id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo = id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CuentaContaDetaGrupoActiLogic getCuentaContaDetaGrupoActiLogic()	{		
		return cuentacontadetagrupoactiLogic;
	}

	public void setCuentaContaDetaGrupoActiLogic(CuentaContaDetaGrupoActiLogic cuentacontadetagrupoactiLogic) {
		this.cuentacontadetagrupoactiLogic = cuentacontadetagrupoactiLogic;
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
	
	public Boolean getIsEsNuevoCuentaContaDetaGrupoActi() {
		return isEsNuevoCuentaContaDetaGrupoActi;
	}

	public void setIsEsNuevoCuentaContaDetaGrupoActi(Boolean isEsNuevoCuentaContaDetaGrupoActi) {
		this.isEsNuevoCuentaContaDetaGrupoActi = isEsNuevoCuentaContaDetaGrupoActi;
	}

	public Boolean getEsParaAccionDesdeFormularioCuentaContaDetaGrupoActi() {
		return esParaAccionDesdeFormularioCuentaContaDetaGrupoActi;
	}
	
	public void setEsParaAccionDesdeFormularioCuentaContaDetaGrupoActi(Boolean esParaAccionDesdeFormularioCuentaContaDetaGrupoActi) {
		this.esParaAccionDesdeFormularioCuentaContaDetaGrupoActi = esParaAccionDesdeFormularioCuentaContaDetaGrupoActi;
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

			cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.cuentacontadetagrupoactiSessionBean==null) {
				this.cuentacontadetagrupoactiSessionBean=new CuentaContaDetaGrupoActiSessionBean();
			}

			if(!this.cuentacontadetagrupoactiSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

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
					cuentacontableLogic.getEntityWithConnection(cuentacontadetagrupoactiSessionBean.getlidCuentaContableActual());
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

	public void cargarCombosDetalleGrupoActivoFijosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.detallegrupoactivofijosForeignKey=new ArrayList<DetalleGrupoActivoFijo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DetalleGrupoActivoFijoLogic detallegrupoactivofijoLogic=new DetalleGrupoActivoFijoLogic();

			detallegrupoactivofijoLogic.getDetalleGrupoActivoFijoDataAccess().setIsForForeingKeyData(true);

			if(this.cuentacontadetagrupoactiSessionBean==null) {
				this.cuentacontadetagrupoactiSessionBean=new CuentaContaDetaGrupoActiSessionBean();
			}

			if(!this.cuentacontadetagrupoactiSessionBean.getisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallegrupoactivofijoLogic.getDetalleGrupoActivoFijoDataAccess().setIsForForeingKeyData(true);

					detallegrupoactivofijoLogic.getTodosDetalleGrupoActivoFijosWithConnection(sFinalQuery,new Pagination());

					this.detallegrupoactivofijosForeignKey=detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDetalleGrupoActivoFijo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallegrupoactivofijoLogic.getEntityWithConnection(cuentacontadetagrupoactiSessionBean.getlidDetalleGrupoActivoFijoActual());
					this.detallegrupoactivofijosForeignKey.add(detallegrupoactivofijoLogic.getDetalleGrupoActivoFijo());
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

					if(this.cuentacontadetagrupoacti!=null) {
						this.cuentacontadetagrupoacti.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
						this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
						if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableCuentaContaDetaGrupoActiGenerico)throws Exception
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
				jComboBoxid_cuenta_contableCuentaContaDetaGrupoActiGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableCuentaContaDetaGrupoActiGenerico!=null && jComboBoxid_cuenta_contableCuentaContaDetaGrupoActiGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableCuentaContaDetaGrupoActiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDetalleGrupoActivoFijoForeignKey(Long idDetalleGrupoActivoFijoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			DetalleGrupoActivoFijo  detallegrupoactivofijoTemp=null;

			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijosForeignKey) {
				if(detallegrupoactivofijoAux.getId()!=null && detallegrupoactivofijoAux.getId().equals(idDetalleGrupoActivoFijoSeleccionado)) {
					detallegrupoactivofijoTemp=detallegrupoactivofijoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(detallegrupoactivofijoTemp!=null) {

					if(this.cuentacontadetagrupoacti!=null) {
						this.cuentacontadetagrupoacti.setDetalleGrupoActivoFijo(detallegrupoactivofijoTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
						this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setSelectedItem(detallegrupoactivofijoTemp);
					}
				} else {
					//jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setSelectedItem(detallegrupoactivofijoTemp);
					if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
						if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDetalleGrupoActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){
					if(detallegrupoactivofijoTemp!=null && jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi!=null) {
						jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.setSelectedItem(detallegrupoactivofijoTemp);
					} else {
						if(jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi!=null) {
							//jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.setSelectedItem(detallegrupoactivofijoTemp);
							if(jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.getItemCount()>0) {
								jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.setSelectedIndex(0);
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

	public String getActualDetalleGrupoActivoFijoForeignKeyDescripcion(Long idDetalleGrupoActivoFijoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			DetalleGrupoActivoFijo  detallegrupoactivofijoTemp=null;

			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijosForeignKey) {
				if(detallegrupoactivofijoAux.getId()!=null && detallegrupoactivofijoAux.getId().equals(idDetalleGrupoActivoFijoSeleccionado)) {
					detallegrupoactivofijoTemp=detallegrupoactivofijoAux;
					break;
				}
			}


			sDescripcion=DetalleGrupoActivoFijoConstantesFunciones.getDetalleGrupoActivoFijoDescripcion(detallegrupoactivofijoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDetalleGrupoActivoFijoForeignKeyGenerico(Long idDetalleGrupoActivoFijoSeleccionado,JComboBox jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiGenerico)throws Exception
	{
		try
		{
			DetalleGrupoActivoFijo  detallegrupoactivofijoTemp=null;

			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijosForeignKey) {
				if(detallegrupoactivofijoAux.getId()!=null && detallegrupoactivofijoAux.getId().equals(idDetalleGrupoActivoFijoSeleccionado)) {
					detallegrupoactivofijoTemp=detallegrupoactivofijoAux;
					break;
				}
			}

			if(detallegrupoactivofijoTemp!=null) {
				jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiGenerico.setSelectedItem(detallegrupoactivofijoTemp);
			} else {
				if(jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiGenerico!=null && jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiGenerico.getItemCount()>0) {
					jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(CuentaContaDetaGrupoActi cuentacontadetagrupoacti,JComboBox jComboBoxid_cuenta_contableCuentaContaDetaGrupoActiGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableCuentaContaDetaGrupoActiGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableCuentaContaDetaGrupoActiGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				cuentacontadetagrupoacti.setid_cuenta_contable(cuentacontableAux.getId());
				cuentacontadetagrupoacti.setcuentacontable_descripcion(CuentaContaDetaGrupoActiConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				cuentacontadetagrupoacti.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDetalleGrupoActivoFijoForeignKey(CuentaContaDetaGrupoActi cuentacontadetagrupoacti,JComboBox jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiGenerico)throws Exception
	{
		try
		{
			DetalleGrupoActivoFijo  detallegrupoactivofijoAux=new DetalleGrupoActivoFijo();

			if(jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiGenerico==null) {
				detallegrupoactivofijoAux=(DetalleGrupoActivoFijo)this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.getSelectedItem();
			} else {
				detallegrupoactivofijoAux=(DetalleGrupoActivoFijo)jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiGenerico.getSelectedItem();
			}

			if(detallegrupoactivofijoAux!=null && detallegrupoactivofijoAux.getId()!=null) {
				cuentacontadetagrupoacti.setid_detalle_grupo_activo_fijo(detallegrupoactivofijoAux.getId());
				cuentacontadetagrupoacti.setdetallegrupoactivofijo_descripcion(CuentaContaDetaGrupoActiConstantesFunciones.getDetalleGrupoActivoFijoDescripcion(detallegrupoactivofijoAux));
				cuentacontadetagrupoacti.setDetalleGrupoActivoFijo(detallegrupoactivofijoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { 
							this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { 
					}

					if(!CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi.addItem(cuentacontable);
							}
						}

						if(!CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDetalleGrupoActivoFijosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDetalleGrupoActivoFijo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { 
							this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.removeAllItems();

							for(DetalleGrupoActivoFijo detallegrupoactivofijo:this.detallegrupoactivofijosForeignKey) {
								this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.addItem(detallegrupoactivofijo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { 
					}

					if(!CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDetalleGrupoActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.removeAllItems();

							for(DetalleGrupoActivoFijo detallegrupoactivofijo:this.detallegrupoactivofijosForeignKey) {
								this.jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.addItem(detallegrupoactivofijo);
							}
						}

						if(!CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameCuentaContableForeignKey(CuentaContable cuentacontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
							this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
							this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameDetalleGrupoActivoFijoForeignKey(DetalleGrupoActivoFijo detallegrupoactivofijo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
							this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setSelectedItem(detallegrupoactivofijo);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
							this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.setSelectedItem(detallegrupoactivofijo);
						} else {
							this.jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCuentaContaDetaGrupoActi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CuentaContaDetaGrupoActiConstantesFunciones.refrescarForeignKeysDescripcionesCuentaContaDetaGrupoActi(this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CuentaContaDetaGrupoActiConstantesFunciones.refrescarForeignKeysDescripcionesCuentaContaDetaGrupoActi(this.cuentacontadetagrupoactis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(CuentaContable.class));
		classes.add(new Classe(DetalleGrupoActivoFijo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cuentacontadetagrupoactiLogic.setCuentaContaDetaGrupoActis(this.cuentacontadetagrupoactis);
			cuentacontadetagrupoactiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CuentaContaDetaGrupoActiParameterReturnGeneral getCuentaContaDetaGrupoActiParameterGeneral() {
		return this.cuentacontadetagrupoactiParameterGeneral;
	}
	
	public void setCuentaContaDetaGrupoActiParameterGeneral(CuentaContaDetaGrupoActiParameterReturnGeneral cuentacontadetagrupoactiParameterGeneral) {
		this.cuentacontadetagrupoactiParameterGeneral = cuentacontadetagrupoactiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCuentaContaDetaGrupoActi() {
		return isPermisoTodoCuentaContaDetaGrupoActi;
	}

	public void setIsPermisoTodoCuentaContaDetaGrupoActi(Boolean isPermisoTodoCuentaContaDetaGrupoActi) {
		this.isPermisoTodoCuentaContaDetaGrupoActi = isPermisoTodoCuentaContaDetaGrupoActi;
	}

	public Boolean getIsPermisoNuevoCuentaContaDetaGrupoActi() {
		return isPermisoNuevoCuentaContaDetaGrupoActi;
	}

	public void setIsPermisoNuevoCuentaContaDetaGrupoActi(Boolean isPermisoNuevoCuentaContaDetaGrupoActi) {
		this.isPermisoNuevoCuentaContaDetaGrupoActi = isPermisoNuevoCuentaContaDetaGrupoActi;
	}

	public Boolean getIsPermisoActualizarCuentaContaDetaGrupoActi() {
		return isPermisoActualizarCuentaContaDetaGrupoActi;
	}

	public void setIsPermisoActualizarCuentaContaDetaGrupoActi(Boolean isPermisoActualizarCuentaContaDetaGrupoActi) {
		this.isPermisoActualizarCuentaContaDetaGrupoActi = isPermisoActualizarCuentaContaDetaGrupoActi;
	}

	public Boolean getIsPermisoEliminarCuentaContaDetaGrupoActi() {
		return isPermisoEliminarCuentaContaDetaGrupoActi;
	}

	public void setIsPermisoEliminarCuentaContaDetaGrupoActi(Boolean isPermisoEliminarCuentaContaDetaGrupoActi) {
		this.isPermisoEliminarCuentaContaDetaGrupoActi = isPermisoEliminarCuentaContaDetaGrupoActi;
	}

	public Boolean getIsPermisoGuardarCambiosCuentaContaDetaGrupoActi() {
		return isPermisoGuardarCambiosCuentaContaDetaGrupoActi;
	}

	public void setIsPermisoGuardarCambiosCuentaContaDetaGrupoActi(Boolean isPermisoGuardarCambiosCuentaContaDetaGrupoActi) {
		this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi = isPermisoGuardarCambiosCuentaContaDetaGrupoActi;
	}
	
	public Boolean getIsPermisoConsultaCuentaContaDetaGrupoActi() {
		return isPermisoConsultaCuentaContaDetaGrupoActi;
	}

	public void setIsPermisoConsultaCuentaContaDetaGrupoActi(Boolean isPermisoConsultaCuentaContaDetaGrupoActi) {
		this.isPermisoConsultaCuentaContaDetaGrupoActi = isPermisoConsultaCuentaContaDetaGrupoActi;
	}

	public Boolean getIsPermisoBusquedaCuentaContaDetaGrupoActi() {
		return isPermisoBusquedaCuentaContaDetaGrupoActi;
	}

	public void setIsPermisoBusquedaCuentaContaDetaGrupoActi(Boolean isPermisoBusquedaCuentaContaDetaGrupoActi) {
		this.isPermisoBusquedaCuentaContaDetaGrupoActi = isPermisoBusquedaCuentaContaDetaGrupoActi;
	}

	public Boolean getIsPermisoReporteCuentaContaDetaGrupoActi() {
		return isPermisoReporteCuentaContaDetaGrupoActi;
	}

	public void setIsPermisoReporteCuentaContaDetaGrupoActi(Boolean isPermisoReporteCuentaContaDetaGrupoActi) {
		this.isPermisoReporteCuentaContaDetaGrupoActi = isPermisoReporteCuentaContaDetaGrupoActi;
	}
	
	public Boolean getIsPermisoPaginacionMedioCuentaContaDetaGrupoActi() {
		return isPermisoPaginacionMedioCuentaContaDetaGrupoActi;
	}

	public void setIsPermisoPaginacionMedioCuentaContaDetaGrupoActi(Boolean isPermisoPaginacionMedioCuentaContaDetaGrupoActi) {
		this.isPermisoPaginacionMedioCuentaContaDetaGrupoActi = isPermisoPaginacionMedioCuentaContaDetaGrupoActi;
	}
	
	public Boolean getIsPermisoPaginacionTodoCuentaContaDetaGrupoActi() {
		return isPermisoPaginacionTodoCuentaContaDetaGrupoActi;
	}

	public void setIsPermisoPaginacionTodoCuentaContaDetaGrupoActi(Boolean isPermisoPaginacionTodoCuentaContaDetaGrupoActi) {
		this.isPermisoPaginacionTodoCuentaContaDetaGrupoActi = isPermisoPaginacionTodoCuentaContaDetaGrupoActi;
	}
	
	public Boolean getIsPermisoPaginacionAltoCuentaContaDetaGrupoActi() {
		return isPermisoPaginacionAltoCuentaContaDetaGrupoActi;
	}

	public void setIsPermisoPaginacionAltoCuentaContaDetaGrupoActi(Boolean isPermisoPaginacionAltoCuentaContaDetaGrupoActi) {
		this.isPermisoPaginacionAltoCuentaContaDetaGrupoActi = isPermisoPaginacionAltoCuentaContaDetaGrupoActi;
	}
	
	public Boolean getIsPermisoCopiarCuentaContaDetaGrupoActi() {
		return isPermisoCopiarCuentaContaDetaGrupoActi;
	}

	public void setIsPermisoCopiarCuentaContaDetaGrupoActi(Boolean isPermisoCopiarCuentaContaDetaGrupoActi) {
		this.isPermisoCopiarCuentaContaDetaGrupoActi = isPermisoCopiarCuentaContaDetaGrupoActi;
	}
	
	public Boolean getIsPermisoVerFormCuentaContaDetaGrupoActi() {
		return isPermisoVerFormCuentaContaDetaGrupoActi;
	}

	public void setIsPermisoVerFormCuentaContaDetaGrupoActi(Boolean isPermisoVerFormCuentaContaDetaGrupoActi) {
		this.isPermisoVerFormCuentaContaDetaGrupoActi = isPermisoVerFormCuentaContaDetaGrupoActi;
	}
	
	public Boolean getIsPermisoDuplicarCuentaContaDetaGrupoActi() {
		return isPermisoDuplicarCuentaContaDetaGrupoActi;
	}

	public void setIsPermisoDuplicarCuentaContaDetaGrupoActi(Boolean isPermisoDuplicarCuentaContaDetaGrupoActi) {
		this.isPermisoDuplicarCuentaContaDetaGrupoActi = isPermisoDuplicarCuentaContaDetaGrupoActi;
	}
	
	public Boolean getIsPermisoOrdenCuentaContaDetaGrupoActi() {
		return isPermisoOrdenCuentaContaDetaGrupoActi;
	}

	public void setIsPermisoOrdenCuentaContaDetaGrupoActi(Boolean isPermisoOrdenCuentaContaDetaGrupoActi) {
		this.isPermisoOrdenCuentaContaDetaGrupoActi = isPermisoOrdenCuentaContaDetaGrupoActi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCuentaContaDetaGrupoActi() {
		return isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi;
	}

	public void setIsVisibilidadCeldaNuevoCuentaContaDetaGrupoActi(Boolean isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi) {
		this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi = isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCuentaContaDetaGrupoActi() {
		return isVisibilidadCeldaDuplicarCuentaContaDetaGrupoActi;
	}

	public void setIsVisibilidadCeldaDuplicarCuentaContaDetaGrupoActi(Boolean isVisibilidadCeldaDuplicarCuentaContaDetaGrupoActi) {
		this.isVisibilidadCeldaDuplicarCuentaContaDetaGrupoActi = isVisibilidadCeldaDuplicarCuentaContaDetaGrupoActi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCuentaContaDetaGrupoActi() {
		return isVisibilidadCeldaCopiarCuentaContaDetaGrupoActi;
	}

	public void setIsVisibilidadCeldaCopiarCuentaContaDetaGrupoActi(Boolean isVisibilidadCeldaCopiarCuentaContaDetaGrupoActi) {
		this.isVisibilidadCeldaCopiarCuentaContaDetaGrupoActi = isVisibilidadCeldaCopiarCuentaContaDetaGrupoActi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCuentaContaDetaGrupoActi() {
		return isVisibilidadCeldaVerFormCuentaContaDetaGrupoActi;
	}

	public void setIsVisibilidadCeldaVerFormCuentaContaDetaGrupoActi(Boolean isVisibilidadCeldaVerFormCuentaContaDetaGrupoActi) {
		this.isVisibilidadCeldaVerFormCuentaContaDetaGrupoActi = isVisibilidadCeldaVerFormCuentaContaDetaGrupoActi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCuentaContaDetaGrupoActi() {
		return isVisibilidadCeldaOrdenCuentaContaDetaGrupoActi;
	}

	public void setIsVisibilidadCeldaOrdenCuentaContaDetaGrupoActi(Boolean isVisibilidadCeldaOrdenCuentaContaDetaGrupoActi) {
		this.isVisibilidadCeldaOrdenCuentaContaDetaGrupoActi = isVisibilidadCeldaOrdenCuentaContaDetaGrupoActi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi() {
		return isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi(Boolean isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi) {
		this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi = isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCuentaContaDetaGrupoActi() {
		return isVisibilidadCeldaModificarCuentaContaDetaGrupoActi;
	}

	public void setIsVisibilidadCeldaModificarCuentaContaDetaGrupoActi(Boolean isVisibilidadCeldaModificarCuentaContaDetaGrupoActi) {
		this.isVisibilidadCeldaModificarCuentaContaDetaGrupoActi = isVisibilidadCeldaModificarCuentaContaDetaGrupoActi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCuentaContaDetaGrupoActi() {
		return isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi;
	}

	public void setIsVisibilidadCeldaActualizarCuentaContaDetaGrupoActi(Boolean isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi) {
		this.isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi = isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi;
	}

	public Boolean getIsVisibilidadCeldaEliminarCuentaContaDetaGrupoActi() {
		return isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi;
	}

	public void setIsVisibilidadCeldaEliminarCuentaContaDetaGrupoActi(Boolean isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi) {
		this.isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi = isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi;
	}

	public Boolean getIsVisibilidadCeldaCancelarCuentaContaDetaGrupoActi() {
		return isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi;
	}

	public void setIsVisibilidadCeldaCancelarCuentaContaDetaGrupoActi(Boolean isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi) {
		this.isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi = isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi;
	}

	public Boolean getIsVisibilidadCeldaGuardarCuentaContaDetaGrupoActi() {
		return isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi;
	}

	public void setIsVisibilidadCeldaGuardarCuentaContaDetaGrupoActi(Boolean isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi) {
		this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi = isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi() {
		return isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi(Boolean isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi) {
		this.isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi = isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi;
	}
		
	public CuentaContaDetaGrupoActiSessionBean getcuentacontadetagrupoactiSessionBean() {
		return this.cuentacontadetagrupoactiSessionBean;
	}
	
	public void setcuentacontadetagrupoactiSessionBean(CuentaContaDetaGrupoActiSessionBean cuentacontadetagrupoactiSessionBean) {
		this.cuentacontadetagrupoactiSessionBean=cuentacontadetagrupoactiSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
	}

	public Boolean getisVisibilidadFK_IdDetalleGrupoActivoFijo() {
		return this.isVisibilidadFK_IdDetalleGrupoActivoFijo;
	}

	public void setisVisibilidadFK_IdDetalleGrupoActivoFijo(Boolean isVisibilidadFK_IdDetalleGrupoActivoFijo) {
		this.isVisibilidadFK_IdDetalleGrupoActivoFijo=isVisibilidadFK_IdDetalleGrupoActivoFijo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoacti)throws Exception {
		try {
			
				this.setActualParaGuardarCuentaContableForeignKey(cuentacontadetagrupoacti,null);
				this.setActualParaGuardarDetalleGrupoActivoFijoForeignKey(cuentacontadetagrupoacti,null);
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
	
	public void bugActualizarReferenciaActual(CuentaContaDetaGrupoActi cuentacontadetagrupoacti,CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCuentaContaDetaGrupoActi(cuentacontadetagrupoacti);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cuentacontadetagrupoactiAux.setId(cuentacontadetagrupoacti.getId());
		cuentacontadetagrupoactiAux.setVersionRow(cuentacontadetagrupoacti.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCuentaContaDetaGrupoActi();
		
			int intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cuentacontadetagrupoactiValidator.getInvalidValues(this.cuentacontadetagrupoacti);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cuentacontadetagrupoactiLogic.setDatosCliente(datosCliente);
			cuentacontadetagrupoactiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cuentacontadetagrupoactiAux=new  CuentaContaDetaGrupoActi();
				
				cuentacontadetagrupoactiAux.setIsNew(true);
				cuentacontadetagrupoactiAux.setIsChanged(true);
				
				cuentacontadetagrupoactiAux.setCuentaContaDetaGrupoActiOriginal(this.cuentacontadetagrupoacti);
				
				cuentacontadetagrupoactiAux.setId(this.cuentacontadetagrupoacti.getId());	
				cuentacontadetagrupoactiAux.setVersionRow(this.cuentacontadetagrupoacti.getVersionRow());	
				cuentacontadetagrupoactiAux.setid_cuenta_contable(this.cuentacontadetagrupoacti.getid_cuenta_contable());	
				cuentacontadetagrupoactiAux.setid_detalle_grupo_activo_fijo(this.cuentacontadetagrupoacti.getid_detalle_grupo_activo_fijo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cuentacontadetagrupoactiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cuentacontadetagrupoactiAux,cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentacontadetagrupoactiAux,cuentacontadetagrupoactis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cuentacontadetagrupoactiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontadetagrupoactiLogic.saveCuentaContaDetaGrupoActis();//WithConnection
						//cuentacontadetagrupoactiLogic.getSetVersionRowCuentaContaDetaGrupoActis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cuentacontadetagrupoacti,cuentacontadetagrupoactiAux);
					
					this.refrescarForeignKeysDescripcionesCuentaContaDetaGrupoActi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentacontadetagrupoactiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentacontadetagrupoactiLogic.saveCuentaContaDetaGrupoActiRelaciones(cuentacontadetagrupoactiAux);//WithConnection
								//cuentacontadetagrupoactiLogic.getSetVersionRowCuentaContaDetaGrupoActis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cuentacontadetagrupoacti,cuentacontadetagrupoactiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cuentacontadetagrupoactiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cuentacontadetagrupoactiAux,cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cuentacontadetagrupoactiAux,cuentacontadetagrupoactis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cuentacontadetagrupoacti,cuentacontadetagrupoactiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cuentacontadetagrupoactiAux=new  CuentaContaDetaGrupoActi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado() 
					|| (this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado() && this.cuentacontadetagrupoacti.getId()>=0)) {
						
					cuentacontadetagrupoactiAux.setIsNew(false);
				}
				
				cuentacontadetagrupoactiAux.setIsDeleted(false);
			
				cuentacontadetagrupoactiAux.setId(this.cuentacontadetagrupoacti.getId());	
				cuentacontadetagrupoactiAux.setVersionRow(this.cuentacontadetagrupoacti.getVersionRow());	
				cuentacontadetagrupoactiAux.setid_cuenta_contable(this.cuentacontadetagrupoacti.getid_cuenta_contable());	
				cuentacontadetagrupoactiAux.setid_detalle_grupo_activo_fijo(this.cuentacontadetagrupoacti.getid_detalle_grupo_activo_fijo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cuentacontadetagrupoactiAux,cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentacontadetagrupoactiAux,cuentacontadetagrupoactis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cuentacontadetagrupoactiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontadetagrupoactiLogic.saveCuentaContaDetaGrupoActis();//WithConnection
						//cuentacontadetagrupoactiLogic.getSetVersionRowCuentaContaDetaGrupoActis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cuentacontadetagrupoacti,cuentacontadetagrupoactiAux);
					
					this.refrescarForeignKeysDescripcionesCuentaContaDetaGrupoActi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentacontadetagrupoactiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentacontadetagrupoactiLogic.saveCuentaContaDetaGrupoActiRelaciones(cuentacontadetagrupoactiAux);//WithConnection
								//cuentacontadetagrupoactiLogic.getSetVersionRowCuentaContaDetaGrupoActis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cuentacontadetagrupoacti,cuentacontadetagrupoactiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cuentacontadetagrupoactiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cuentacontadetagrupoactiAux,cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cuentacontadetagrupoactiAux,cuentacontadetagrupoactis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cuentacontadetagrupoacti,cuentacontadetagrupoactiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cuentacontadetagrupoactiAux=new  CuentaContaDetaGrupoActi();
				
				cuentacontadetagrupoactiAux.setIsNew(false);
				cuentacontadetagrupoactiAux.setIsChanged(false);
				
				cuentacontadetagrupoactiAux.setIsDeleted(true);
				
				cuentacontadetagrupoactiAux.setId(this.cuentacontadetagrupoacti.getId());	
				cuentacontadetagrupoactiAux.setVersionRow(this.cuentacontadetagrupoacti.getVersionRow());	
				cuentacontadetagrupoactiAux.setid_cuenta_contable(this.cuentacontadetagrupoacti.getid_cuenta_contable());	
				cuentacontadetagrupoactiAux.setid_detalle_grupo_activo_fijo(this.cuentacontadetagrupoacti.getid_detalle_grupo_activo_fijo());	
				
				if(this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cuentacontadetagrupoactiAux.getId()>=0) {	
						this.cuentacontadetagrupoactisEliminados.add(cuentacontadetagrupoactiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cuentacontadetagrupoactiAux,cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentacontadetagrupoactiAux,cuentacontadetagrupoactis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cuentacontadetagrupoactiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontadetagrupoactiLogic.saveCuentaContaDetaGrupoActis();//WithConnection
						//cuentacontadetagrupoactiLogic.getSetVersionRowCuentaContaDetaGrupoActis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentacontadetagrupoactiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentacontadetagrupoactiLogic.saveCuentaContaDetaGrupoActiRelaciones(cuentacontadetagrupoactiAux);//WithConnection
								//cuentacontadetagrupoactiLogic.getSetVersionRowCuentaContaDetaGrupoActis();//WithConnection
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
							if(this.cuentacontadetagrupoactiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cuentacontadetagrupoactiAux,cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cuentacontadetagrupoactiAux,cuentacontadetagrupoactis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().addAll(this.cuentacontadetagrupoactisEliminados);
					
					cuentacontadetagrupoactiLogic.saveCuentaContaDetaGrupoActis();//WithConnection
					//cuentacontadetagrupoactiLogic.getSetVersionRowCuentaContaDetaGrupoActis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCuentaContaDetaGrupoActi();
				
				this.cuentacontadetagrupoactisEliminados= new ArrayList<CuentaContaDetaGrupoActi>();		
			}
			
			if(this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cuenta Conta Deta Grupo Acti GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cuenta Conta Deta Grupo Acti",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cuentacontadetagrupoacti=cuentacontadetagrupoactiAux;
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
      		//this.finishProcessCuentaContaDetaGrupoActi();
      	}
		
	}	
	
	public void actualizarRelaciones(CuentaContaDetaGrupoActi cuentacontadetagrupoactiLocal) throws Exception {
		
		if(this.cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CuentaContaDetaGrupoActi cuentacontadetagrupoactiLocal) throws Exception {	
		if(this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				cuentacontadetagrupoactiLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DetalleGrupoActivoFijoDetalleFormJInternalFrame.class)) {
				DetalleGrupoActivoFijoBeanSwingJInternalFrame detallegrupoactivofijoBeanSwingJInternalFrameLocal=(DetalleGrupoActivoFijoBeanSwingJInternalFrame) ((DetalleGrupoActivoFijoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				detallegrupoactivofijoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDetalleGrupoActivoFijo(detallegrupoactivofijoBeanSwingJInternalFrameLocal.getdetallegrupoactivofijo(),true);
				detallegrupoactivofijoBeanSwingJInternalFrameLocal.actualizarLista(detallegrupoactivofijoBeanSwingJInternalFrameLocal.detallegrupoactivofijo,this.detallegrupoactivofijosForeignKey);

				detallegrupoactivofijoBeanSwingJInternalFrameLocal.actualizarRelaciones(detallegrupoactivofijoBeanSwingJInternalFrameLocal.detallegrupoactivofijo);

				cuentacontadetagrupoactiLocal.setDetalleGrupoActivoFijo(detallegrupoactivofijoBeanSwingJInternalFrameLocal.detallegrupoactivofijo);

				this.addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo();
				this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey("Formulario");
				this.setActualDetalleGrupoActivoFijoForeignKey(detallegrupoactivofijoBeanSwingJInternalFrameLocal.detallegrupoactivofijo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCuentaContaDetaGrupoActiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cuentacontadetagrupoactiValidator.getInvalidValues(this.cuentacontadetagrupoacti);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CuentaContaDetaGrupoActi cuentacontadetagrupoacti,List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactis) throws Exception {
		try	{		
			CuentaContaDetaGrupoActiConstantesFunciones.actualizarLista(cuentacontadetagrupoacti,cuentacontadetagrupoactis,this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CuentaContaDetaGrupoActi cuentacontadetagrupoacti,List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactis) throws Exception {
		try	{			
			CuentaContaDetaGrupoActiConstantesFunciones.actualizarSelectedLista(cuentacontadetagrupoacti,cuentacontadetagrupoactis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cuentacontadetagrupoactisLocal=this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cuentacontadetagrupoactisLocal=this.cuentacontadetagrupoactis;
			}
			//ARCHITECTURE
		
			for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiLocal:cuentacontadetagrupoactisLocal) {
				if(this.permiteMantenimiento(cuentacontadetagrupoactiLocal) && cuentacontadetagrupoactiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CuentaContaDetaGrupoActiConstantesFunciones.getCuentaContaDetaGrupoActiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CuentaContaDetaGrupoActiConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jLabelid_cuenta_contableCuentaContaDetaGrupoActi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaContaDetaGrupoActiConstantesFunciones.IDDETALLEGRUPOACTIVOFIJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jLabelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jLabelid_cuenta_contableCuentaContaDetaGrupoActi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jLabelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi,"");
		
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
		this.iIdNuevoCuentaContaDetaGrupoActi--;	
		
		
		this.cuentacontadetagrupoactiAux=new CuentaContaDetaGrupoActi();
		
		this.cuentacontadetagrupoactiAux.setId(this.iIdNuevoCuentaContaDetaGrupoActi);
		this.cuentacontadetagrupoactiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().add(this.cuentacontadetagrupoactiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cuentacontadetagrupoactis.add(this.cuentacontadetagrupoactiAux);
		}
		//ARCHITECTURE
		
		this.cuentacontadetagrupoacti=this.cuentacontadetagrupoactiAux;
		
		if(CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);
			this.setVariablesObjetoActualToFormularioForeignKeyCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);
		}
				
		//this.setDefaultControlesCuentaContaDetaGrupoActi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCuentaContaDetaGrupoActi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCuentaContaDetaGrupoActi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaContaDetaGrupoActi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCuentaContaDetaGrupoActi(this.cuentacontadetagrupoactiBean,this.cuentacontadetagrupoacti,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones()) {
			classes=CuentaContaDetaGrupoActiConstantesFunciones.getClassesRelationshipsOfCuentaContaDetaGrupoActi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cuentacontadetagrupoactiReturnGeneral=cuentacontadetagrupoactiLogic.procesarEventosCuentaContaDetaGrupoActisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis(),this.cuentacontadetagrupoacti,this.cuentacontadetagrupoactiParameterGeneral,this.isEsNuevoCuentaContaDetaGrupoActi,classes);//this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCuentaContaDetaGrupoActi(this.cuentacontadetagrupoactiReturnGeneral,this.cuentacontadetagrupoactiBean,false);
		
		if(this.cuentacontadetagrupoactiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCuentaContaDetaGrupoActi(this.cuentacontadetagrupoactiReturnGeneral.getCuentaContaDetaGrupoActi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCuentaContaDetaGrupoActi(this.cuentacontadetagrupoactiReturnGeneral.getCuentaContaDetaGrupoActi());
		}
		
		if(this.cuentacontadetagrupoactiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCuentaContaDetaGrupoActi(this.cuentacontadetagrupoactiReturnGeneral.getCuentaContaDetaGrupoActi(),classes);//this.cuentacontadetagrupoactiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCuentaContaDetaGrupoActi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCuentaContaDetaGrupoActi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.RecargarFormCuentaContaDetaGrupoActi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false);
						
			if(cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaContaDetaGrupoActi();
			}
			
			this.actualizarVisualTableDatosCuentaContaDetaGrupoActi();
			
			this.jTableDatosCuentaContaDetaGrupoActi.setRowSelectionInterval(this.getIndiceNuevoCuentaContaDetaGrupoActi(), this.getIndiceNuevoCuentaContaDetaGrupoActi());
			
			this.seleccionarFilaTablaCuentaContaDetaGrupoActiActual();
						
			this.actualizarEstadoCeldasBotonesCuentaContaDetaGrupoActi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCuentaContaDetaGrupoActi(Boolean isHabilitar) throws Exception {
			
		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.setEnabled(isHabilitar && this.cuentacontadetagrupoactiConstantesFunciones.activarid_cuenta_contableCuentaContaDetaGrupoActi);
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setEnabled(isHabilitar && this.cuentacontadetagrupoactiConstantesFunciones.activarid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi);
	};
	
	public void setDefaultControlesCuentaContaDetaGrupoActi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCuentaContaDetaGrupoActi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cuentacontadetagrupoactiSessionBean.setConGuardarRelaciones(true);			
			this.cuentacontadetagrupoactiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jTabbedPaneRelacionesCuentaContaDetaGrupoActi.setVisible(true);
			
					
		} else {
			//this.cuentacontadetagrupoactiSessionBean.setConGuardarRelaciones(false);			
			this.cuentacontadetagrupoactiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jTabbedPaneRelacionesCuentaContaDetaGrupoActi.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCuentaContaDetaGrupoActi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis()) {
				if(cuentacontadetagrupoactiAux.getId().equals(this.iIdNuevoCuentaContaDetaGrupoActi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:this.cuentacontadetagrupoactis) {
				if(cuentacontadetagrupoactiAux.getId().equals(this.iIdNuevoCuentaContaDetaGrupoActi)) {
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
	
	public int getIndiceActualCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoacti,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis()) {
				if(cuentacontadetagrupoactiAux.getId().equals(cuentacontadetagrupoacti.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:this.cuentacontadetagrupoactis) {
				if(cuentacontadetagrupoactiAux.getId().equals(cuentacontadetagrupoacti.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoactiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis()) {
				if(cuentacontadetagrupoactiAux.getCuentaContaDetaGrupoActiOriginal().getId().equals(cuentacontadetagrupoactiOriginal.getId())) {
					existe=true;
					cuentacontadetagrupoactiOriginal.setId(cuentacontadetagrupoactiAux.getId());
					cuentacontadetagrupoactiOriginal.setVersionRow(cuentacontadetagrupoactiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:this.cuentacontadetagrupoactis) {
				if(cuentacontadetagrupoactiAux.getCuentaContaDetaGrupoActiOriginal().getId().equals(cuentacontadetagrupoactiOriginal.getId())) {
					existe=true;
					cuentacontadetagrupoactiOriginal.setId(cuentacontadetagrupoactiAux.getId());
					cuentacontadetagrupoactiOriginal.setVersionRow(cuentacontadetagrupoactiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCuentaContaDetaGrupoActi(Boolean esParaCancelar) throws Exception {
		cuentacontadetagrupoactisAux=new ArrayList<CuentaContaDetaGrupoActi>();
		cuentacontadetagrupoactiAux=new CuentaContaDetaGrupoActi();
		
		if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis()) {
					if(cuentacontadetagrupoactiAux.getId()<0) {
						cuentacontadetagrupoactisAux.add(cuentacontadetagrupoactiAux);
					}		
				}
				this.iIdNuevoCuentaContaDetaGrupoActi=0L;
				this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().removeAll(cuentacontadetagrupoactisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:this.cuentacontadetagrupoactis) {
					if(cuentacontadetagrupoactiAux.getId()<0) {
						cuentacontadetagrupoactisAux.add(cuentacontadetagrupoactiAux);
					}		
				}
				this.iIdNuevoCuentaContaDetaGrupoActi=0L;
				this.cuentacontadetagrupoactis.removeAll(cuentacontadetagrupoactisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCuentaContaDetaGrupoActi 
					&& this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().size()>0
					) {
					cuentacontadetagrupoactiAux=this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().get(this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().size() - 1);
				
					if(cuentacontadetagrupoactiAux.getId()<0) {
						this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().remove(cuentacontadetagrupoactiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCuentaContaDetaGrupoActi && this.cuentacontadetagrupoactis.size()>0) {
					cuentacontadetagrupoactiAux=this.cuentacontadetagrupoactis.get(this.cuentacontadetagrupoactis.size() - 1);
				
					if(cuentacontadetagrupoactiAux.getId()<0) {
						this.cuentacontadetagrupoactis.remove(cuentacontadetagrupoactiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCuentaContaDetaGrupoActi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cuentacontadetagrupoacti.getId()<0) {
				this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().remove(this.cuentacontadetagrupoacti);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cuentacontadetagrupoacti.getId()<0) {
				this.cuentacontadetagrupoactis.remove(this.cuentacontadetagrupoacti);
			}
		}			
	}
	
	public void setEstadosInicialesCuentaContaDetaGrupoActi(List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisAux) throws Exception {
		CuentaContaDetaGrupoActiConstantesFunciones.setEstadosInicialesCuentaContaDetaGrupoActi(cuentacontadetagrupoactisAux);
	}
	
	public void setEstadosInicialesCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux) throws Exception {
		CuentaContaDetaGrupoActiConstantesFunciones.setEstadosInicialesCuentaContaDetaGrupoActi(cuentacontadetagrupoactiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCuentaContaDetaGrupoActiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCuentaContaDetaGrupoActi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCuentaContaDetaGrupoActiActual()) {
				if(!this.isEsNuevoCuentaContaDetaGrupoActi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCuentaContaDetaGrupoActi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCuentaContaDetaGrupoActi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCuentaContaDetaGrupoActiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cuenta Conta Deta Grupo Acti ?", "MANTENIMIENTO DE Cuenta Conta Deta Grupo Acti", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCuentaContaDetaGrupoActi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CuentaContaDetaGrupoActi cuentacontadetagrupoacti) throws Exception {
		CuentaContaDetaGrupoActiConstantesFunciones.seleccionarAsignar(this.cuentacontadetagrupoacti,cuentacontadetagrupoacti);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCuentaContaDetaGrupoActi=this.isPermisoActualizarOriginalCuentaContaDetaGrupoActi;
			
			
			this.seleccionarAsignar(cuentacontadetagrupoacti);
			
			

			idCuentaContableActual=cuentacontadetagrupoacti.getid_cuenta_contable();
			this.seleccionarCuentaContableActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CuentaContaDetaGrupoActiConstantesFunciones.quitarEspaciosCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCuentaContaDetaGrupoActi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cuentacontadetagrupoactiSessionBean.setsFuncionBusquedaRapida(this.cuentacontadetagrupoactiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoCuentaContaDetaGrupoActi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCuentaContaDetaGrupoActi(esParaCancelar);				
				this.cancelarNuevoCuentaContaDetaGrupoActi(esParaCancelar);								
			}
			
			this.cuentacontadetagrupoacti=new CuentaContaDetaGrupoActi();
			
			this.inicializarCuentaContaDetaGrupoActi();
			
			this.actualizarEstadoCeldasBotonesCuentaContaDetaGrupoActi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCuentaContaDetaGrupoActi() throws Exception {
		try {
			CuentaContaDetaGrupoActiConstantesFunciones.inicializarCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);
			
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
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCuentaContaDetaGrupoActis(String sAccionBusqueda,List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisParaReportes) throws Exception {
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
					sPathReporteFinal="CuentaContaDetaGrupoActi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CuentaContaDetaGrupoActiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CuentaContaDetaGrupoActiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CuentaContaDetaGrupoActi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cuenta Conta Deta Grupo Actis");		
		parameters.put("busquedapor", CuentaContaDetaGrupoActiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCuentaContaDetaGrupoActi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CuentaContaDetaGrupoActiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CuentaContaDetaGrupoActiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCuentaContaDetaGrupoActi=new JRBeanArrayDataSource(CuentaContaDetaGrupoActiJInternalFrame.TraerCuentaContaDetaGrupoActiBeans(cuentacontadetagrupoactisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCuentaContaDetaGrupoActi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CuentaContaDetaGrupoActiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CuentaContaDetaGrupoActiBean.TraerCuentaContaDetaGrupoActiBeans(cuentacontadetagrupoactisParaReportes).toArray()));
							
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
				this.generarExcelReporteCuentaContaDetaGrupoActis(sAccionBusqueda,sTipoArchivoReporte,cuentacontadetagrupoactisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCuentaContaDetaGrupoActis(sAccionBusqueda,sTipoArchivoReporte,cuentacontadetagrupoactisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCuentaContaDetaGrupoActiActionPerformed(null);
					//this.generarExcelReporteCuentaContaDetaGrupoActis(sAccionBusqueda,sTipoArchivoReporte,cuentacontadetagrupoactisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCuentaContaDetaGrupoActis(sAccionBusqueda,sTipoArchivoReporte,cuentacontadetagrupoactisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCuentaContaDetaGrupoActis(sAccionBusqueda,sTipoArchivoReporte,cuentacontadetagrupoactisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCuentaContaDetaGrupoActis(sAccionBusqueda,sTipoArchivoReporte,cuentacontadetagrupoactisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCuentaContaDetaGrupoActis(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontadetagrupoacti";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaContaDetaGrupoActis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCuentaContaDetaGrupoActi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CuentaContaDetaGrupoActi cuentacontadetagrupoacti : cuentacontadetagrupoactisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CuentaContaDetaGrupoActiConstantesFunciones.generarExcelReporteDataCuentaContaDetaGrupoActi("NORMAL",row,workbook,cuentacontadetagrupoacti,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Conta Deta Grupo Acti",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCuentaContaDetaGrupoActi(String sTipo,Row row,Workbook workbook) {
		
		CuentaContaDetaGrupoActiConstantesFunciones.generarExcelReporteHeaderCuentaContaDetaGrupoActi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCuentaContaDetaGrupoActis(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontadetagrupoacti_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaContaDetaGrupoActis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CuentaContaDetaGrupoActi cuentacontadetagrupoacti : cuentacontadetagrupoactisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CuentaContaDetaGrupoActiConstantesFunciones.getCuentaContaDetaGrupoActiDescripcion(cuentacontadetagrupoacti));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentacontadetagrupoacti.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentacontadetagrupoacti.getdetallegrupoactivofijo_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Conta Deta Grupo Acti",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCuentaContaDetaGrupoActis(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisRespaldo=null;
		
		classes=CuentaContaDetaGrupoActiConstantesFunciones.getClassesRelationshipsOfCuentaContaDetaGrupoActi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cuentacontadetagrupoactiLogic.setDatosCliente(this.datosCliente);
		this.cuentacontadetagrupoactiLogic.setDatosDeep(this.datosDeep);
		this.cuentacontadetagrupoactiLogic.setIsConDeep(true);
		
		cuentacontadetagrupoactisRespaldo=this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis();
		
		this.cuentacontadetagrupoactiLogic.setCuentaContaDetaGrupoActis(cuentacontadetagrupoactisParaReportes);	
		this.cuentacontadetagrupoactiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cuentacontadetagrupoactisParaReportes=this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis();
		this.cuentacontadetagrupoactiLogic.setCuentaContaDetaGrupoActis(cuentacontadetagrupoactisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontadetagrupoacti_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaContaDetaGrupoActis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCuentaContaDetaGrupoActi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CuentaContaDetaGrupoActi cuentacontadetagrupoacti : cuentacontadetagrupoactisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCuentaContaDetaGrupoActi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CuentaContaDetaGrupoActiConstantesFunciones.generarExcelReporteDataCuentaContaDetaGrupoActi("NORMAL",row,workbook,cuentacontadetagrupoacti,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CuentaContaDetaGrupoActiConstantesFunciones.getCuentaContaDetaGrupoActiDescripcion(cuentacontadetagrupoacti));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Conta Deta Grupo Acti",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCuentaContaDetaGrupoActi() throws Exception {		
		this.startProcessCuentaContaDetaGrupoActi(true);
	}
	
	public void startProcessCuentaContaDetaGrupoActi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi ,this.jPanelParametrosReportesCuentaContaDetaGrupoActi, this.jScrollPanelDatosCuentaContaDetaGrupoActi,this.jPanelPaginacionCuentaContaDetaGrupoActi, this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi, this.jPanelAccionesCuentaContaDetaGrupoActi,this.jPanelAccionesFormularioCuentaContaDetaGrupoActi,this.jmenuBarCuentaContaDetaGrupoActi,this.jmenuBarDetalleCuentaContaDetaGrupoActi,this.jTtoolBarCuentaContaDetaGrupoActi,this.jTtoolBarDetalleCuentaContaDetaGrupoActi);		
		
		final JTabbedPane jTabbedPaneBusquedasCuentaContaDetaGrupoActi=this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi; 
		
		final JPanel jPanelParametrosReportesCuentaContaDetaGrupoActi=this.jPanelParametrosReportesCuentaContaDetaGrupoActi;
		//final JScrollPane jScrollPanelDatosCuentaContaDetaGrupoActi=this.jScrollPanelDatosCuentaContaDetaGrupoActi;
		final JTable jTableDatosCuentaContaDetaGrupoActi=this.jTableDatosCuentaContaDetaGrupoActi;		
		final JPanel jPanelPaginacionCuentaContaDetaGrupoActi=this.jPanelPaginacionCuentaContaDetaGrupoActi;
		//final JScrollPane jScrollPanelDatosEdicionCuentaContaDetaGrupoActi=this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi;
		final JPanel jPanelAccionesCuentaContaDetaGrupoActi=this.jPanelAccionesCuentaContaDetaGrupoActi;
		
		JPanel jPanelCamposAuxiliarCuentaContaDetaGrupoActi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCuentaContaDetaGrupoActi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
			jPanelCamposAuxiliarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jPanelCamposCuentaContaDetaGrupoActi;
			jPanelAccionesFormularioAuxiliarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jPanelAccionesFormularioCuentaContaDetaGrupoActi;
		}
		
		final JPanel jPanelCamposCuentaContaDetaGrupoActi=jPanelCamposAuxiliarCuentaContaDetaGrupoActi;
		final JPanel jPanelAccionesFormularioCuentaContaDetaGrupoActi=jPanelAccionesFormularioAuxiliarCuentaContaDetaGrupoActi;
		
		
		final JMenuBar jmenuBarCuentaContaDetaGrupoActi=this.jmenuBarCuentaContaDetaGrupoActi;
		final JToolBar jTtoolBarCuentaContaDetaGrupoActi=this.jTtoolBarCuentaContaDetaGrupoActi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCuentaContaDetaGrupoActi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCuentaContaDetaGrupoActi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
			jmenuBarDetalleAuxiliarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jmenuBarDetalleCuentaContaDetaGrupoActi;
			jTtoolBarDetalleAuxiliarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jTtoolBarDetalleCuentaContaDetaGrupoActi;
		}
		
		final JMenuBar jmenuBarDetalleCuentaContaDetaGrupoActi=jmenuBarDetalleAuxiliarCuentaContaDetaGrupoActi;
		final JToolBar jTtoolBarDetalleCuentaContaDetaGrupoActi=jTtoolBarDetalleAuxiliarCuentaContaDetaGrupoActi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCuentaContaDetaGrupoActi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCuentaContaDetaGrupoActi;
			processRunnable.jTableDatos=jTableDatosCuentaContaDetaGrupoActi;
			processRunnable.jPanelCampos=jPanelCamposCuentaContaDetaGrupoActi;
			processRunnable.jPanelPaginacion=jPanelPaginacionCuentaContaDetaGrupoActi;
			processRunnable.jPanelAcciones=jPanelAccionesCuentaContaDetaGrupoActi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCuentaContaDetaGrupoActi;
			
			
			processRunnable.jmenuBar=jmenuBarCuentaContaDetaGrupoActi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCuentaContaDetaGrupoActi;
			processRunnable.jTtoolBar=jTtoolBarCuentaContaDetaGrupoActi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCuentaContaDetaGrupoActi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCuentaContaDetaGrupoActi ,jPanelParametrosReportesCuentaContaDetaGrupoActi,jTableDatosCuentaContaDetaGrupoActi, /*jScrollPanelDatosCuentaContaDetaGrupoActi,*/jPanelCamposCuentaContaDetaGrupoActi,jPanelPaginacionCuentaContaDetaGrupoActi, /*jScrollPanelDatosEdicionCuentaContaDetaGrupoActi,*/ jPanelAccionesCuentaContaDetaGrupoActi,jPanelAccionesFormularioCuentaContaDetaGrupoActi,jmenuBarCuentaContaDetaGrupoActi,jmenuBarDetalleCuentaContaDetaGrupoActi,jTtoolBarCuentaContaDetaGrupoActi,jTtoolBarDetalleCuentaContaDetaGrupoActi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCuentaContaDetaGrupoActi ,jPanelParametrosReportesCuentaContaDetaGrupoActi, jScrollPanelDatosCuentaContaDetaGrupoActi,jPanelPaginacionCuentaContaDetaGrupoActi, jScrollPanelDatosEdicionCuentaContaDetaGrupoActi, jPanelAccionesCuentaContaDetaGrupoActi,jPanelAccionesFormularioCuentaContaDetaGrupoActi,jmenuBarCuentaContaDetaGrupoActi,jmenuBarDetalleCuentaContaDetaGrupoActi,jTtoolBarCuentaContaDetaGrupoActi,jTtoolBarDetalleCuentaContaDetaGrupoActi);
						
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
	
	public void finishProcessCuentaContaDetaGrupoActi() {// throws Exception 
		this.finishProcessCuentaContaDetaGrupoActi(true);
	}
	
	public void finishProcessCuentaContaDetaGrupoActi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi ,this.jPanelParametrosReportesCuentaContaDetaGrupoActi, this.jScrollPanelDatosCuentaContaDetaGrupoActi,this.jPanelPaginacionCuentaContaDetaGrupoActi, this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi, this.jPanelAccionesCuentaContaDetaGrupoActi,this.jPanelAccionesFormularioCuentaContaDetaGrupoActi,this.jmenuBarCuentaContaDetaGrupoActi,this.jmenuBarDetalleCuentaContaDetaGrupoActi,this.jTtoolBarCuentaContaDetaGrupoActi,this.jTtoolBarDetalleCuentaContaDetaGrupoActi);		
		
		final JTabbedPane jTabbedPaneBusquedasCuentaContaDetaGrupoActi=this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi; 
		
		final JPanel jPanelParametrosReportesCuentaContaDetaGrupoActi=this.jPanelParametrosReportesCuentaContaDetaGrupoActi;
		//final JScrollPane jScrollPanelDatosCuentaContaDetaGrupoActi=this.jScrollPanelDatosCuentaContaDetaGrupoActi;
		final JTable jTableDatosCuentaContaDetaGrupoActi=this.jTableDatosCuentaContaDetaGrupoActi;		
		final JPanel jPanelPaginacionCuentaContaDetaGrupoActi=this.jPanelPaginacionCuentaContaDetaGrupoActi;
		//final JScrollPane jScrollPanelDatosEdicionCuentaContaDetaGrupoActi=this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi;
		final JPanel jPanelAccionesCuentaContaDetaGrupoActi=this.jPanelAccionesCuentaContaDetaGrupoActi;
		
		JPanel jPanelCamposAuxiliarCuentaContaDetaGrupoActi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCuentaContaDetaGrupoActi=new JPanel();
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
			jPanelCamposAuxiliarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jPanelCamposCuentaContaDetaGrupoActi;
			jPanelAccionesFormularioAuxiliarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jPanelAccionesFormularioCuentaContaDetaGrupoActi;
		}
		
		final JPanel jPanelCamposCuentaContaDetaGrupoActi=jPanelCamposAuxiliarCuentaContaDetaGrupoActi;
		final JPanel jPanelAccionesFormularioCuentaContaDetaGrupoActi=jPanelAccionesFormularioAuxiliarCuentaContaDetaGrupoActi;
		
		
		final JMenuBar jmenuBarCuentaContaDetaGrupoActi=this.jmenuBarCuentaContaDetaGrupoActi;		
		final JToolBar jTtoolBarCuentaContaDetaGrupoActi=this.jTtoolBarCuentaContaDetaGrupoActi;
				
		JMenuBar jmenuBarDetalleAuxiliarCuentaContaDetaGrupoActi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCuentaContaDetaGrupoActi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
			jmenuBarDetalleAuxiliarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jmenuBarDetalleCuentaContaDetaGrupoActi;
			jTtoolBarDetalleAuxiliarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jTtoolBarDetalleCuentaContaDetaGrupoActi;		
		}
		
		final JMenuBar jmenuBarDetalleCuentaContaDetaGrupoActi=jmenuBarDetalleAuxiliarCuentaContaDetaGrupoActi;
		final JToolBar jTtoolBarDetalleCuentaContaDetaGrupoActi=jTtoolBarDetalleAuxiliarCuentaContaDetaGrupoActi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCuentaContaDetaGrupoActi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCuentaContaDetaGrupoActi;
			processRunnable.jTableDatos=jTableDatosCuentaContaDetaGrupoActi;
			processRunnable.jPanelCampos=jPanelCamposCuentaContaDetaGrupoActi;
			processRunnable.jPanelPaginacion=jPanelPaginacionCuentaContaDetaGrupoActi;
			processRunnable.jPanelAcciones=jPanelAccionesCuentaContaDetaGrupoActi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCuentaContaDetaGrupoActi;
			
			
			processRunnable.jmenuBar=jmenuBarCuentaContaDetaGrupoActi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCuentaContaDetaGrupoActi;
			processRunnable.jTtoolBar=jTtoolBarCuentaContaDetaGrupoActi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCuentaContaDetaGrupoActi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCuentaContaDetaGrupoActi ,jPanelParametrosReportesCuentaContaDetaGrupoActi, jTableDatosCuentaContaDetaGrupoActi,/*jScrollPanelDatosCuentaContaDetaGrupoActi,*/jPanelCamposCuentaContaDetaGrupoActi,jPanelPaginacionCuentaContaDetaGrupoActi, /*jScrollPanelDatosEdicionCuentaContaDetaGrupoActi,*/ jPanelAccionesCuentaContaDetaGrupoActi,jPanelAccionesFormularioCuentaContaDetaGrupoActi,jmenuBarCuentaContaDetaGrupoActi,jmenuBarDetalleCuentaContaDetaGrupoActi,jTtoolBarCuentaContaDetaGrupoActi,jTtoolBarDetalleCuentaContaDetaGrupoActi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCuentaContaDetaGrupoActi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCuentaContaDetaGrupoActi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCuentaContaDetaGrupoActi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCuentaContaDetaGrupoActi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCuentaContaDetaGrupoActi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCuentaContaDetaGrupoActi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCuentaContaDetaGrupoActi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCuentaContaDetaGrupoActi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCuentaContaDetaGrupoActi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cuentacontadetagrupoactiConstantesFunciones.getsFinalQueryCuentaContaDetaGrupoActi();
		String  finalQueryPaginacionTodos=this.cuentacontadetagrupoactiConstantesFunciones.getsFinalQueryCuentaContaDetaGrupoActi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CuentaContaDetaGrupoActiConstantesFunciones.getArrayColumnasGlobalesNoCuentaContaDetaGrupoActi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CuentaContaDetaGrupoActiConstantesFunciones.getArrayColumnasGlobalesCuentaContaDetaGrupoActi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CuentaContaDetaGrupoActiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cuentacontadetagrupoactisEliminados= new ArrayList<CuentaContaDetaGrupoActi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCuentaContaDetaGrupoActi();
		
				///*CuentaContaDetaGrupoActiSessionBean*/this.cuentacontadetagrupoactiSessionBean=new CuentaContaDetaGrupoActiSessionBean();
			
			if(this.cuentacontadetagrupoactiSessionBean==null) {
				this.cuentacontadetagrupoactiSessionBean=new CuentaContaDetaGrupoActiSessionBean();
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
					this.iNumeroPaginacion=CuentaContaDetaGrupoActiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CuentaContaDetaGrupoActiConstantesFunciones.getClassesForeignKeysOfCuentaContaDetaGrupoActi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cuentacontadetagrupoacti."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cuentacontadetagrupoactisAux= new ArrayList<CuentaContaDetaGrupoActi>();
			
				
			cuentacontadetagrupoactiLogic.setDatosCliente(this.datosCliente);
			cuentacontadetagrupoactiLogic.setDatosDeep(this.datosDeep);
			cuentacontadetagrupoactiLogic.setIsConDeep(true);
			
			
			cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cuentacontadetagrupoactiLogic.getTodosCuentaContaDetaGrupoActis(finalQueryGlobal,pagination);
					
					//cuentacontadetagrupoactiLogic.getTodosCuentaContaDetaGrupoActisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis()==null|| cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentacontadetagrupoactisAux= new ArrayList<CuentaContaDetaGrupoActi>();
							cuentacontadetagrupoactisAux.addAll(cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontadetagrupoactisAux= new ArrayList<CuentaContaDetaGrupoActi>();
							cuentacontadetagrupoactisAux.addAll(cuentacontadetagrupoactis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentacontadetagrupoactiLogic.getTodosCuentaContaDetaGrupoActis(finalQueryGlobal+"",this.pagination);												
							
							//cuentacontadetagrupoactiLogic.getTodosCuentaContaDetaGrupoActisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCuentaContaDetaGrupoActis("Todos",cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentacontadetagrupoactiLogic.setCuentaContaDetaGrupoActis(new ArrayList<CuentaContaDetaGrupoActi>());					
							cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().addAll(cuentacontadetagrupoactisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontadetagrupoactis=new ArrayList<CuentaContaDetaGrupoActi>();
							cuentacontadetagrupoactis.addAll(cuentacontadetagrupoactisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCuentaContaDetaGrupoActi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCuentaContaDetaGrupoActi=this.idActual;
				
				} else if(this.idCuentaContaDetaGrupoActiActual!=null && this.idCuentaContaDetaGrupoActiActual!=0L) {
					idCuentaContaDetaGrupoActi=idCuentaContaDetaGrupoActiActual;
				}
				
					
				this.sDetalleReporte=CuentaContaDetaGrupoActiConstantesFunciones.getDetalleIndicePorId(idCuentaContaDetaGrupoActi);
				
				this.cuentacontadetagrupoactis=new ArrayList<CuentaContaDetaGrupoActi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cuentacontadetagrupoactiLogic.getEntity(idCuentaContaDetaGrupoActi);
					
					//cuentacontadetagrupoactiLogic.getEntityWithConnection(idCuentaContaDetaGrupoActi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontadetagrupoactiLogic.setCuentaContaDetaGrupoActis(new ArrayList<CuentaContaDetaGrupoActi>());
					cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().add(cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacontadetagrupoactis=new ArrayList<CuentaContaDetaGrupoActi>();
					this.cuentacontadetagrupoactis.add(cuentacontadetagrupoacti);
				}
				
				if(cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActi()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=CuentaContaDetaGrupoActiConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActisFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaContaDetaGrupoActiConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaContaDetaGrupoActiConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis()==null||cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentacontadetagrupoactis==null|| cuentacontadetagrupoactis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontadetagrupoactisAux=new ArrayList<CuentaContaDetaGrupoActi>();
						cuentacontadetagrupoactisAux.addAll(cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontadetagrupoactisAux=new ArrayList<CuentaContaDetaGrupoActi>();
							cuentacontadetagrupoactisAux.addAll(cuentacontadetagrupoactis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActisFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaContaDetaGrupoActiConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaContaDetaGrupoActiConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaContaDetaGrupoActis("FK_IdCuentaContable",cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaContaDetaGrupoActis("FK_IdCuentaContable",cuentacontadetagrupoactis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontadetagrupoactiLogic.setCuentaContaDetaGrupoActis(new ArrayList<CuentaContaDetaGrupoActi>());
						cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().addAll(cuentacontadetagrupoactisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontadetagrupoactis=new ArrayList<CuentaContaDetaGrupoActi>();
							cuentacontadetagrupoactis.addAll(cuentacontadetagrupoactisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdDetalleGrupoActivoFijo")) {
				this.sDetalleReporte=CuentaContaDetaGrupoActiConstantesFunciones.getDetalleIndiceFK_IdDetalleGrupoActivoFijo(id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActisFK_IdDetalleGrupoActivoFijo(finalQueryGlobal,pagination,id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaContaDetaGrupoActiConstantesFunciones.getDetalleIndiceFK_IdDetalleGrupoActivoFijo(id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaContaDetaGrupoActiConstantesFunciones.getDetalleIndiceFK_IdDetalleGrupoActivoFijo(id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis()==null||cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentacontadetagrupoactis==null|| cuentacontadetagrupoactis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontadetagrupoactisAux=new ArrayList<CuentaContaDetaGrupoActi>();
						cuentacontadetagrupoactisAux.addAll(cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontadetagrupoactisAux=new ArrayList<CuentaContaDetaGrupoActi>();
							cuentacontadetagrupoactisAux.addAll(cuentacontadetagrupoactis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActisFK_IdDetalleGrupoActivoFijo(finalQueryGlobal,pagination,id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaContaDetaGrupoActiConstantesFunciones.getDetalleIndiceFK_IdDetalleGrupoActivoFijo(id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaContaDetaGrupoActiConstantesFunciones.getDetalleIndiceFK_IdDetalleGrupoActivoFijo(id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaContaDetaGrupoActis("FK_IdDetalleGrupoActivoFijo",cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaContaDetaGrupoActis("FK_IdDetalleGrupoActivoFijo",cuentacontadetagrupoactis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontadetagrupoactiLogic.setCuentaContaDetaGrupoActis(new ArrayList<CuentaContaDetaGrupoActi>());
						cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().addAll(cuentacontadetagrupoactisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontadetagrupoactis=new ArrayList<CuentaContaDetaGrupoActi>();
							cuentacontadetagrupoactis.addAll(cuentacontadetagrupoactisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCuentaContaDetaGrupoActi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCuentaContaDetaGrupoActi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentacontadetagrupoactis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentacontadetagrupoactis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CuentaContaDetaGrupoActi cuentacontadetagrupoacti) {
		Boolean permite=true;
		
		if(this.cuentacontadetagrupoacti.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CuentaContaDetaGrupoActiConstantesFunciones.getOrderByListaCuentaContaDetaGrupoActi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CuentaContaDetaGrupoActiConstantesFunciones.getOrderByListaCuentaContaDetaGrupoActi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaContaDetaGrupoActi cuentacontadetagrupoacti:cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis()) {
				if(cuentacontadetagrupoacti.getsType().equals(Constantes2.S_TOTALES)) {
					cuentacontadetagrupoactiTotales=cuentacontadetagrupoacti;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaContaDetaGrupoActi cuentacontadetagrupoacti:this.cuentacontadetagrupoactis) {
				if(cuentacontadetagrupoacti.getsType().equals(Constantes2.S_TOTALES)) {
					cuentacontadetagrupoactiTotales=cuentacontadetagrupoacti;
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
			this.cuentacontadetagrupoactiAux=new CuentaContaDetaGrupoActi();
			this.cuentacontadetagrupoactiAux.setsType(Constantes2.S_TOTALES);
			this.cuentacontadetagrupoactiAux.setIsNew(false);
			this.cuentacontadetagrupoactiAux.setIsChanged(false);
			this.cuentacontadetagrupoactiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CuentaContaDetaGrupoActiConstantesFunciones.TotalizarValoresFilaCuentaContaDetaGrupoActi(this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis(),this.cuentacontadetagrupoactiAux);
				
				this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().add(this.cuentacontadetagrupoactiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CuentaContaDetaGrupoActiConstantesFunciones.TotalizarValoresFilaCuentaContaDetaGrupoActi(this.cuentacontadetagrupoactis,this.cuentacontadetagrupoactiAux);
				
				this.cuentacontadetagrupoactis.add(this.cuentacontadetagrupoactiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cuentacontadetagrupoactiTotales=new CuentaContaDetaGrupoActi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().remove(cuentacontadetagrupoactiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cuentacontadetagrupoactis.remove(cuentacontadetagrupoactiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cuentacontadetagrupoactiTotales=new CuentaContaDetaGrupoActi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaContaDetaGrupoActi cuentacontadetagrupoacti:cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis()) {
				if(cuentacontadetagrupoacti.getsType().equals(Constantes2.S_TOTALES)) {
					cuentacontadetagrupoactiTotales=cuentacontadetagrupoacti;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CuentaContaDetaGrupoActiConstantesFunciones.TotalizarValoresFilaCuentaContaDetaGrupoActi(this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis(),cuentacontadetagrupoactiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaContaDetaGrupoActi cuentacontadetagrupoacti:this.cuentacontadetagrupoactis) {
				if(cuentacontadetagrupoacti.getsType().equals(Constantes2.S_TOTALES)) {
					cuentacontadetagrupoactiTotales=cuentacontadetagrupoacti;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CuentaContaDetaGrupoActiConstantesFunciones.TotalizarValoresFilaCuentaContaDetaGrupoActi(this.cuentacontadetagrupoactis,cuentacontadetagrupoactiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCuentaContaDetaGrupoActisFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaContaDetaGrupoActisFK_IdDetalleGrupoActivoFijo()throws Exception {
		try {
			sAccionBusqueda="FK_IdDetalleGrupoActivoFijo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCuentaContaDetaGrupoActisFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActisFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaContaDetaGrupoActisFK_IdDetalleGrupoActivoFijo(String sFinalQuery,Long id_detalle_grupo_activo_fijo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActisFK_IdDetalleGrupoActivoFijo(sFinalQuery,this.pagination,id_detalle_grupo_activo_fijo);
				
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
	
	public void inicializarPermisosCuentaContaDetaGrupoActi() {
		this.isPermisoTodoCuentaContaDetaGrupoActi=false;
		this.isPermisoNuevoCuentaContaDetaGrupoActi=false;
		this.isPermisoActualizarCuentaContaDetaGrupoActi=false;
		this.isPermisoActualizarOriginalCuentaContaDetaGrupoActi=false;
		this.isPermisoEliminarCuentaContaDetaGrupoActi=false;
		this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi=false;
		this.isPermisoConsultaCuentaContaDetaGrupoActi=false;
		this.isPermisoBusquedaCuentaContaDetaGrupoActi=false;
		this.isPermisoReporteCuentaContaDetaGrupoActi=false;		
		this.isPermisoOrdenCuentaContaDetaGrupoActi=false;		
		this.isPermisoPaginacionMedioCuentaContaDetaGrupoActi=false;		
		this.isPermisoPaginacionAltoCuentaContaDetaGrupoActi=false;
		this.isPermisoPaginacionTodoCuentaContaDetaGrupoActi=false;
		this.isPermisoCopiarCuentaContaDetaGrupoActi=false;		
		this.isPermisoVerFormCuentaContaDetaGrupoActi=false;		
		this.isPermisoDuplicarCuentaContaDetaGrupoActi=false;		
		this.isPermisoOrdenCuentaContaDetaGrupoActi=false;		
	}
	
	public void setPermisosUsuarioCuentaContaDetaGrupoActi(Boolean isPermiso) {
		this.isPermisoTodoCuentaContaDetaGrupoActi=isPermiso;
		this.isPermisoNuevoCuentaContaDetaGrupoActi=isPermiso;
		this.isPermisoActualizarCuentaContaDetaGrupoActi=isPermiso;
		this.isPermisoActualizarOriginalCuentaContaDetaGrupoActi=isPermiso;
		this.isPermisoEliminarCuentaContaDetaGrupoActi=isPermiso;
		this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi=isPermiso;
		this.isPermisoConsultaCuentaContaDetaGrupoActi=isPermiso;
		this.isPermisoBusquedaCuentaContaDetaGrupoActi=isPermiso;
		this.isPermisoReporteCuentaContaDetaGrupoActi=isPermiso;
		this.isPermisoOrdenCuentaContaDetaGrupoActi=isPermiso;		
		this.isPermisoPaginacionMedioCuentaContaDetaGrupoActi=isPermiso;		
		this.isPermisoPaginacionAltoCuentaContaDetaGrupoActi=isPermiso;		
		this.isPermisoPaginacionTodoCuentaContaDetaGrupoActi=isPermiso;		
		this.isPermisoCopiarCuentaContaDetaGrupoActi=isPermiso;		
		this.isPermisoVerFormCuentaContaDetaGrupoActi=isPermiso;		
		this.isPermisoDuplicarCuentaContaDetaGrupoActi=isPermiso;
		this.isPermisoOrdenCuentaContaDetaGrupoActi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCuentaContaDetaGrupoActi(Boolean isPermiso) {
		//this.isPermisoTodoCuentaContaDetaGrupoActi=isPermiso;
		this.isPermisoNuevoCuentaContaDetaGrupoActi=isPermiso;
		this.isPermisoActualizarCuentaContaDetaGrupoActi=isPermiso;
		this.isPermisoActualizarOriginalCuentaContaDetaGrupoActi=isPermiso;
		this.isPermisoEliminarCuentaContaDetaGrupoActi=isPermiso;
		this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi=isPermiso;
		//this.isPermisoConsultaCuentaContaDetaGrupoActi=isPermiso;
		//this.isPermisoBusquedaCuentaContaDetaGrupoActi=isPermiso;
		//this.isPermisoReporteCuentaContaDetaGrupoActi=isPermiso;
		//this.isPermisoOrdenCuentaContaDetaGrupoActi=isPermiso;		
		//this.isPermisoPaginacionMedioCuentaContaDetaGrupoActi=isPermiso;		
		//this.isPermisoPaginacionAltoCuentaContaDetaGrupoActi=isPermiso;		
		//this.isPermisoPaginacionTodoCuentaContaDetaGrupoActi=isPermiso;		
		//this.isPermisoCopiarCuentaContaDetaGrupoActi=isPermiso;		
		//this.isPermisoDuplicarCuentaContaDetaGrupoActi=isPermiso;
		//this.isPermisoOrdenCuentaContaDetaGrupoActi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCuentaContaDetaGrupoActiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CuentaContaDetaGrupoActiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCuentaContaDetaGrupoActi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCuentaContaDetaGrupoActiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCuentaContaDetaGrupoActiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCuentaContaDetaGrupoActiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCuentaContaDetaGrupoActiClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCuentaContaDetaGrupoActi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CuentaContaDetaGrupoActiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CuentaContaDetaGrupoActiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCuentaContaDetaGrupoActi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCuentaContaDetaGrupoActi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCuentaContaDetaGrupoActi=this.isPermisoActualizarCuentaContaDetaGrupoActi;
			this.isPermisoEliminarCuentaContaDetaGrupoActi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCuentaContaDetaGrupoActi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCuentaContaDetaGrupoActi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCuentaContaDetaGrupoActi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCuentaContaDetaGrupoActi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCuentaContaDetaGrupoActi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCuentaContaDetaGrupoActi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCuentaContaDetaGrupoActi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCuentaContaDetaGrupoActi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCuentaContaDetaGrupoActi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCuentaContaDetaGrupoActi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCuentaContaDetaGrupoActi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCuentaContaDetaGrupoActi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCuentaContaDetaGrupoActi.setToolTipText(this.jTableDatosCuentaContaDetaGrupoActi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCuentaContaDetaGrupoActi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCuentaContaDetaGrupoActi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CuentaContaDetaGrupoActiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CuentaContaDetaGrupoActiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCuentaContaDetaGrupoActi() throws Exception {
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
	public void inicializarCombosForeignKeyCuentaContaDetaGrupoActiListas()throws Exception {
		try	{						
			
				this.cuentacontablesForeignKey=new ArrayList();
				this.detallegrupoactivofijosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCuentaContaDetaGrupoActiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CuentaContaDetaGrupoActiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCuentaContaDetaGrupoActiListas(false);
			} else {
			
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDetalleGrupoActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyDetalleGrupoActivoFijoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.detallegrupoactivofijosForeignKey==null||this.detallegrupoactivofijosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DetalleGrupoActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleGrupoActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleGrupoActivoFijoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DetalleGrupoActivoFijoConstantesFunciones.SFINALQUERY;

				this.cargarCombosDetalleGrupoActivoFijosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCuentaContaDetaGrupoActiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CuentaContaDetaGrupoActiParameterReturnGeneral cuentacontadetagrupoactiReturnGeneral=new CuentaContaDetaGrupoActiParameterReturnGeneral();
						
			


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.cuentacontadetagrupoactiConstantesFunciones.cargarid_cuenta_contableCuentaContaDetaGrupoActi)
					 || (this.esRecargarFks && this.cuentacontadetagrupoactiConstantesFunciones.cargarid_cuenta_contableCuentaContaDetaGrupoActi)) {

					if(!this.cuentacontadetagrupoactiSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+cuentacontadetagrupoactiSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}


				String finalQueryGlobalDetalleGrupoActivoFijo="";

				if(((this.detallegrupoactivofijosForeignKey==null||this.detallegrupoactivofijosForeignKey.size()<=0) && this.cuentacontadetagrupoactiConstantesFunciones.cargarid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi)
					 || (this.esRecargarFks && this.cuentacontadetagrupoactiConstantesFunciones.cargarid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi)) {

					if(!this.cuentacontadetagrupoactiSessionBean.getisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DetalleGrupoActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleGrupoActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDetalleGrupoActivoFijo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleGrupoActivoFijoConstantesFunciones.TABLENAME);

						finalQueryGlobalDetalleGrupoActivoFijo=Funciones.GetFinalQueryAppend(finalQueryGlobalDetalleGrupoActivoFijo, "");
						finalQueryGlobalDetalleGrupoActivoFijo+=DetalleGrupoActivoFijoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDetalleGrupoActivoFijosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDetalleGrupoActivoFijo=" WHERE " + ConstantesSql.ID + "="+cuentacontadetagrupoactiSessionBean.getlidDetalleGrupoActivoFijoActual();
					}
				} else {
					finalQueryGlobalDetalleGrupoActivoFijo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cuentacontadetagrupoactiReturnGeneral=cuentacontadetagrupoactiLogic.cargarCombosLoteForeignKeyCuentaContaDetaGrupoActi(finalQueryGlobalCuentaContable,finalQueryGlobalDetalleGrupoActivoFijo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=cuentacontadetagrupoactiReturnGeneral.getcuentacontablesForeignKey();
			}

			if(!finalQueryGlobalDetalleGrupoActivoFijo.equals("NONE")) {
				this.detallegrupoactivofijosForeignKey=cuentacontadetagrupoactiReturnGeneral.getdetallegrupoactivofijosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCuentaContaDetaGrupoActi()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyCuentaContable();
			this.addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {
			if(this.cuentacontadetagrupoactiSessionBean==null) {
				this.cuentacontadetagrupoactiSessionBean=new CuentaContaDetaGrupoActiSessionBean();
			}

			if(!this.cuentacontadetagrupoactiSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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

	public void addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo()throws Exception {
		try {

			if(!this.cuentacontadetagrupoactiSessionBean.getisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo()) {
				DetalleGrupoActivoFijo detallegrupoactivofijo=new DetalleGrupoActivoFijo();
				DetalleGrupoActivoFijoConstantesFunciones.setDetalleGrupoActivoFijoDescripcion(detallegrupoactivofijo,Constantes.SMENSAJE_ESCOJA_OPCION);
				detallegrupoactivofijo.setId(null);

				if(!DetalleGrupoActivoFijoConstantesFunciones.ExisteEnLista(this.detallegrupoactivofijosForeignKey,detallegrupoactivofijo,true)) {

					this.detallegrupoactivofijosForeignKey.add(0,detallegrupoactivofijo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCuentaContaDetaGrupoActi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCuentaContaDetaGrupoActi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCuentaContaDetaGrupoActi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaContaDetaGrupoActi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoacti)throws Exception {	
		try {
			
			this.setActualCuentaContableForeignKey(cuentacontadetagrupoacti.getid_cuenta_contable(),false,"Formulario");
			this.setActualDetalleGrupoActivoFijoForeignKey(cuentacontadetagrupoacti.getid_detalle_grupo_activo_fijo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoacti,String sTipoEvento)throws Exception {	
		try {
			
			

				if(cuentacontadetagrupoacti.getCuentaContable()!=null && !sTipoEvento.equals("id_cuenta_contableCuentaContaDetaGrupoActi")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablesForeignKey.add(cuentacontadetagrupoacti.getCuentaContable());

					this.addItemDefectoCombosForeignKeyCuentaContable();
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCuentaContaDetaGrupoActi()throws Exception {	
		try {
			
			this.setActualCuentaContableForeignKey(this.cuentacontadetagrupoactiConstantesFunciones.getid_cuenta_contable(),false,"Formulario");
			this.setActualDetalleGrupoActivoFijoForeignKey(this.cuentacontadetagrupoactiConstantesFunciones.getid_detalle_grupo_activo_fijo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaContaDetaGrupoActi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCuentaContaDetaGrupoActi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCuentaContaDetaGrupoActi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCuentaContaDetaGrupoActi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCuentaContaDetaGrupoActi()throws Exception {
		try {
			

			this.cargarCombosFrameCuentaContablesForeignKey("Todos");
			this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCuentaContaDetaGrupoActi(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCuentaContaDetaGrupoActi()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi!=null && this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi!=null && this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public CuentaContaDetaGrupoActiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CuentaContaDetaGrupoActiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CuentaContaDetaGrupoActiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cuentacontadetagrupoactiSessionBean=new CuentaContaDetaGrupoActiSessionBean(); 
		this.cuentacontadetagrupoactiConstantesFunciones=new CuentaContaDetaGrupoActiConstantesFunciones(); 
		this.cuentacontadetagrupoactiBean=new CuentaContaDetaGrupoActi();//(this.cuentacontadetagrupoactiConstantesFunciones); 		
		this.cuentacontadetagrupoactiReturnGeneral=new CuentaContaDetaGrupoActiParameterReturnGeneral(); 
		
		this.cuentacontadetagrupoactiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentacontadetagrupoactiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CuentaContaDetaGrupoActiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CuentaContaDetaGrupoActiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CuentaContaDetaGrupoActiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCuentaContaDetaGrupoActi(true);
			
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
			
			this.cuentacontadetagrupoactiConstantesFunciones=new CuentaContaDetaGrupoActiConstantesFunciones(); 
			this.cuentacontadetagrupoactiBean=new CuentaContaDetaGrupoActi();//this.cuentacontadetagrupoactiConstantesFunciones); 			
			this.cuentacontadetagrupoactiReturnGeneral=new CuentaContaDetaGrupoActiParameterReturnGeneral(); 
		
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Conta Deta Grupo Acti Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.cuentacontadetagrupoacti=new CuentaContaDetaGrupoActi();
			this.cuentacontadetagrupoactis = new ArrayList<CuentaContaDetaGrupoActi>();
			this.cuentacontadetagrupoactisAux = new ArrayList<CuentaContaDetaGrupoActi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic=new CuentaContaDetaGrupoActiLogic();
				this.cuentacontadetagrupoactiLogic.getNewConnexionToDeep("");
			}
			
			//this.cuentacontadetagrupoactiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cuentacontadetagrupoactiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi);	
					}
					
					if(this.jInternalFrameImportacionCuentaContaDetaGrupoActi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCuentaContaDetaGrupoActi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCuentaContaDetaGrupoActi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCuentaContaDetaGrupoActi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi);
				this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.setVisible(false);
				this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi);
					this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.setVisible(false);
					this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCuentaContaDetaGrupoActi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCuentaContaDetaGrupoActi);
					this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setVisible(false);
					this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCuentaContaDetaGrupoActi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCuentaContaDetaGrupoActi);
					this.jInternalFrameOrderByCuentaContaDetaGrupoActi.setVisible(false);
					this.jInternalFrameOrderByCuentaContaDetaGrupoActi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCuentaContaDetaGrupoActiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CuentaContaDetaGrupoActiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cuentacontadetagrupoactiReturnGeneral=new CuentaContaDetaGrupoActiParameterReturnGeneral();
			
			this.cuentacontadetagrupoactiParameterGeneral=new CuentaContaDetaGrupoActiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cuentacontadetagrupoactiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CuentaContaDetaGrupoActiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CuentaContaDetaGrupoActiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado(),this.cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CuentaContaDetaGrupoActiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado(),this.cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaDuplicarCuentaContaDetaGrupoActi=true;
			this.isVisibilidadCeldaCopiarCuentaContaDetaGrupoActi=true;
			this.isVisibilidadCeldaVerFormCuentaContaDetaGrupoActi=true;
			this.isVisibilidadCeldaOrdenCuentaContaDetaGrupoActi=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaModificarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi=false;
			
			
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdDetalleGrupoActivoFijo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCuentaContaDetaGrupoActi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCuentaContaDetaGrupoActi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCuentaContaDetaGrupoActi(false);
			
			this.setPermisosUsuarioCuentaContaDetaGrupoActi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado() 
				|| (this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado() && this.cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCuentaContaDetaGrupoActiClasesRelacionadas();
			}
			
			if(this.cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCuentaContaDetaGrupoActiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCuentaContaDetaGrupoActi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCuentaContaDetaGrupoActi();
			}
			
			if(!this.isPermisoBusquedaCuentaContaDetaGrupoActi) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCuentaContaDetaGrupoActi,this.isPermisoPaginacionMedioCuentaContaDetaGrupoActi,this.isPermisoPaginacionTodoCuentaContaDetaGrupoActi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CuentaContaDetaGrupoActiConstantesFunciones.getTiposSeleccionarCuentaContaDetaGrupoActi());
				
				this.tiposColumnasSelect=CuentaContaDetaGrupoActiConstantesFunciones.getTiposSeleccionarCuentaContaDetaGrupoActi(true);
				
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
			//if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCuentaContaDetaGrupoActi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCuentaContaDetaGrupoActi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCuentaContaDetaGrupoActi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaContaDetaGrupoActi() ;
			
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
			
			this.cuentacontableLogic=new CuentaContableLogic();
			this.detallegrupoactivofijoLogic=new DetalleGrupoActivoFijoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cuentacontadetagrupoactiImplementable= (CuentaContaDetaGrupoActiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CuentaContaDetaGrupoActiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cuentacontadetagrupoactiImplementableHome= (CuentaContaDetaGrupoActiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CuentaContaDetaGrupoActiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cuentacontadetagrupoactis= new ArrayList<CuentaContaDetaGrupoActi>();
			this.cuentacontadetagrupoactisEliminados= new ArrayList<CuentaContaDetaGrupoActi>();
						
			this.isEsNuevoCuentaContaDetaGrupoActi=false;
			this.esParaAccionDesdeFormularioCuentaContaDetaGrupoActi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			this.detallegrupoactivofijosForeignKey=new ArrayList<DetalleGrupoActivoFijo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCuentaContaDetaGrupoActi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCuentaContaDetaGrupoActi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CuentaContaDetaGrupoActiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCuentaContaDetaGrupoActi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCuentaContaDetaGrupoActi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCuentaContaDetaGrupoActi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCuentaContaDetaGrupoActi();
			}
			
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCuentaContaDetaGrupoActi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CuentaContaDetaGrupoActi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCuentaContaDetaGrupoActi() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCuentaContaDetaGrupoActi")) {
				iIndex=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jTabbedPaneRelacionesCuentaContaDetaGrupoActi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jTabbedPaneRelacionesCuentaContaDetaGrupoActi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCuentaContaDetaGrupoActi();	
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
	
	public void cargarCombosForeignKeyCuentaContaDetaGrupoActi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCuentaContaDetaGrupoActi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCuentaContaDetaGrupoActi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCuentaContaDetaGrupoActiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCuentaContaDetaGrupoActi();
		
		this.cargarCombosFrameForeignKeyCuentaContaDetaGrupoActi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCuentaContaDetaGrupoActi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCuentaContaDetaGrupoActi();
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

	public void cargarCombosForeignKeyDetalleGrupoActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDetalleGrupoActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo();
				this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDetalleGrupoActivoFijo(this.detallegrupoactivofijosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
			
			
			if(jTableDatosCuentaContaDetaGrupoActi.getRowCount()>=1) {
				jTableDatosCuentaContaDetaGrupoActi.removeRowSelectionInterval(0, jTableDatosCuentaContaDetaGrupoActi.getRowCount()-1);						
			}
			
			this.isEsNuevoCuentaContaDetaGrupoActi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCuentaContaDetaGrupoActi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCuentaContaDetaGrupoActi(true);			
			//this.cuentacontadetagrupoacti=new CuentaContaDetaGrupoActi();
			//this.cuentacontadetagrupoacti.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaContaDetaGrupoActi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaContaDetaGrupoActi() ;
			
			if(CuentaContaDetaGrupoActiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaContaDetaGrupoActi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cuentacontadetagrupoacti);	
			this.actualizarInformacion("INFO_PADRE",false,this.cuentacontadetagrupoacti);				
			
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
			
			if(this.cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CuentaContaDetaGrupoActi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisSeleccionados=new ArrayList<CuentaContaDetaGrupoActi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRows().length;			
			}
			
			cuentacontadetagrupoactisSeleccionados=this.getCuentaContaDetaGrupoActisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCuentaContaDetaGrupoActi--;			
				//CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux= new CuentaContaDetaGrupoActi();			
				//cuentacontadetagrupoactiAux.setId(this.iIdNuevoCuentaContaDetaGrupoActi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CuentaContaDetaGrupoActi cuentacontadetagrupoactiOrigen=new CuentaContaDetaGrupoActi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiOrigen : cuentacontadetagrupoactisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cuentacontadetagrupoactiOrigen =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontadetagrupoactiOrigen =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCuentaContaDetaGrupoActi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cuentacontadetagrupoacti.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCuentaContaDetaGrupoActi(cuentacontadetagrupoactiOrigen,this.cuentacontadetagrupoacti,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().add(this.cuentacontadetagrupoactiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cuentacontadetagrupoactis.add(this.cuentacontadetagrupoactiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(false);
				
				this.jTableDatosCuentaContaDetaGrupoActi.setRowSelectionInterval(this.getIndiceNuevoCuentaContaDetaGrupoActi(), this.getIndiceNuevoCuentaContaDetaGrupoActi());
				
				int iLastRow =  this.jTableDatosCuentaContaDetaGrupoActi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCuentaContaDetaGrupoActi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCuentaContaDetaGrupoActi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisSeleccionados=new ArrayList<CuentaContaDetaGrupoActi>();									
		
			CuentaContaDetaGrupoActi cuentacontadetagrupoactiOrigen=new CuentaContaDetaGrupoActi();
			CuentaContaDetaGrupoActi cuentacontadetagrupoactiDestino=new CuentaContaDetaGrupoActi();
				
			cuentacontadetagrupoactisSeleccionados=this.getCuentaContaDetaGrupoActisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cuentacontadetagrupoactisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontadetagrupoactiOrigen =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cuentacontadetagrupoactiOrigen =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontadetagrupoactiDestino =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cuentacontadetagrupoactiDestino =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cuentacontadetagrupoactiOrigen =cuentacontadetagrupoactisSeleccionados.get(0);
				cuentacontadetagrupoactiDestino =cuentacontadetagrupoactisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCuentaContaDetaGrupoActi(cuentacontadetagrupoactiOrigen,cuentacontadetagrupoactiDestino,true,false);
				
				cuentacontadetagrupoactiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cuentacontadetagrupoactiDestino,cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentacontadetagrupoactiDestino,cuentacontadetagrupoactis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(false);
				
				//this.jTableDatosCuentaContaDetaGrupoActi.setRowSelectionInterval(this.getIndiceNuevoCuentaContaDetaGrupoActi(), this.getIndiceNuevoCuentaContaDetaGrupoActi());
				
				int iLastRow =  this.jTableDatosCuentaContaDetaGrupoActi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCuentaContaDetaGrupoActi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCuentaContaDetaGrupoActi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCuentaContaDetaGrupoActi.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCuentaContaDetaGrupoActi.setVisible(!isVisible);
			this.jPanelPaginacionCuentaContaDetaGrupoActi.setVisible(!isVisible);
			this.jPanelAccionesCuentaContaDetaGrupoActi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCuentaContaDetaGrupoActi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCuentaContaDetaGrupoActi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCuentaContaDetaGrupoActi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCuentaContaDetaGrupoActi();
			
			this.abrirFrameOrderByCuentaContaDetaGrupoActi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCuentaContaDetaGrupoActi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCuentaContaDetaGrupoActi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCuentaContaDetaGrupoActi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.isMaximum()) {
					this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.setSize(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.iWidthFormulario,this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.isMaximum()) {
						this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jContentPaneDetalleCuentaContaDetaGrupoActi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jTabbedPaneRelacionesCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jContentPaneDetalleCuentaContaDetaGrupoActi.getWidth(),CuentaContaDetaGrupoActiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jTabbedPaneRelacionesCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jContentPaneDetalleCuentaContaDetaGrupoActi.getWidth(),CuentaContaDetaGrupoActiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jTabbedPaneRelacionesCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jContentPaneDetalleCuentaContaDetaGrupoActi.getWidth(),CuentaContaDetaGrupoActiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.setVisible(true);
	        this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCuentaContaDetaGrupoActi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCuentaContaDetaGrupoActi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCuentaContaDetaGrupoActi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaContaDetaGrupoActi,false,this);
				} else {
					this.jInternalFrameOrderByCuentaContaDetaGrupoActi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaContaDetaGrupoActi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCuentaContaDetaGrupoActi);
				this.jInternalFrameOrderByCuentaContaDetaGrupoActi.setVisible(false);
				this.jInternalFrameOrderByCuentaContaDetaGrupoActi.setSelected(false);
				
				this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCuentaContaDetaGrupoActi"));
				
				this.inicializarActualizarBindingTablaOrderByCuentaContaDetaGrupoActi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCuentaContaDetaGrupoActi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCuentaContaDetaGrupoActi==null) {
				
				this.jInternalFrameImportacionCuentaContaDetaGrupoActi=new ImportacionJInternalFrame(CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCuentaContaDetaGrupoActi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCuentaContaDetaGrupoActi);
				this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setVisible(false);
				this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setSelected(false);


				this.jInternalFrameImportacionCuentaContaDetaGrupoActi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCuentaContaDetaGrupoActi"));
				this.jInternalFrameImportacionCuentaContaDetaGrupoActi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCuentaContaDetaGrupoActi"));
				this.jInternalFrameImportacionCuentaContaDetaGrupoActi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCuentaContaDetaGrupoActi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCuentaContaDetaGrupoActi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi==null) {
				this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi=new ReporteDinamicoJInternalFrame(CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi);
				this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.setVisible(false);
				this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaContaDetaGrupoActi"));
				this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaContaDetaGrupoActi"));
				this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaContaDetaGrupoActi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaContaDetaGrupoActi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCuentaContaDetaGrupoActi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCuentaContaDetaGrupoActi);
			
	       	this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.setVisible(false);
	        this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.setSelected(false);
			
			//this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.dispose();
			//this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCuentaContaDetaGrupoActi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.setVisible(true);
	        this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCuentaContaDetaGrupoActi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setVisible(true);
	        this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCuentaContaDetaGrupoActi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.setVisible(true);
	        this.jInternalFrameOrderByCuentaContaDetaGrupoActi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCuentaContaDetaGrupoActi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.setVisible(false);
	        this.jInternalFrameOrderByCuentaContaDetaGrupoActi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCuentaContaDetaGrupoActi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.setVisible(false);
	        this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCuentaContaDetaGrupoActi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setVisible(false);
	        this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderCuentaContaDetaGrupoActi=(TitledBorder)this.jScrollPanelDatosCuentaContaDetaGrupoActi.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderCuentaContaDetaGrupoActi.getTitle() + " -> Cuenta Contable");


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
	
	public void jButtonModificarCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCuentaContaDetaGrupoActi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCuentaContaDetaGrupoActi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCuentaContaDetaGrupoActi(true);
			//this.isEsNuevoCuentaContaDetaGrupoActi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCuentaContaDetaGrupoActi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaContaDetaGrupoActi(false) ;
			
			if(cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CuentaContaDetaGrupoActiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaContaDetaGrupoActi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaContaDetaGrupoActi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCuentaContaDetaGrupoActiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCuentaContaDetaGrupoActi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCuentaContaDetaGrupoActi(true);
			//this.isEsNuevoCuentaContaDetaGrupoActi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cuentacontadetagrupoacti.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCuentaContaDetaGrupoActi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCuentaContaDetaGrupoActi(false) ;
			
			if(CuentaContaDetaGrupoActiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaContaDetaGrupoActi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaContaDetaGrupoActi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContable")) {
				if(!this.cuentacontadetagrupoactiConstantesFunciones.cargarid_cuenta_contableCuentaContaDetaGrupoActi) {
					this.cargarCombosCuentaContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false,false);
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
		TableColumn tableColumnCuentaContable=this.jTableDatosCuentaContaDetaGrupoActi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContaDetaGrupoActi,CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaDetalleGrupoActivoFijo(List<DetalleGrupoActivoFijo> detallegrupoactivofijosForeignKey)throws Exception{
		TableColumn tableColumnDetalleGrupoActivoFijo=this.jTableDatosCuentaContaDetaGrupoActi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContaDetaGrupoActi,CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO));
		TableCellEditor tableCellEditorDetalleGrupoActivoFijo =tableColumnDetalleGrupoActivoFijo.getCellEditor();

		DetalleGrupoActivoFijoTableCell detallegrupoactivofijoTableCellFk=(DetalleGrupoActivoFijoTableCell)tableCellEditorDetalleGrupoActivoFijo;

		if(detallegrupoactivofijoTableCellFk!=null) {
			detallegrupoactivofijoTableCellFk.setdetallegrupoactivofijosForeignKey(detallegrupoactivofijosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//detallegrupoactivofijoTableCellFk.setRowActual(intSelectedRow);
			//detallegrupoactivofijoTableCellFk.setdetallegrupoactivofijosForeignKeyActual(detallegrupoactivofijosForeignKey);
		//}


		if(detallegrupoactivofijoTableCellFk!=null) {
			detallegrupoactivofijoTableCellFk.RecargarDetalleGrupoActivoFijosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable (Long id) throws Exception {
		this.setActualCuentaContableForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCuentaContaDetaGrupoActi(false);
			
			//if(!this.isEsNuevoCuentaContaDetaGrupoActi) {								
				int intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);
				
			}
			
			if(this.permiteMantenimiento(this.cuentacontadetagrupoacti)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCuentaContaDetaGrupoActi=true;
					this.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(false);
					this.isEsNuevoCuentaContaDetaGrupoActi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCuentaContaDetaGrupoActi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCuentaContaDetaGrupoActi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCuentaContaDetaGrupoActi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaContaDetaGrupoActi(false);
				
				this.habilitarDeshabilitarControlesCuentaContaDetaGrupoActi(false);
			
												
				
				if(CuentaContaDetaGrupoActiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCuentaContaDetaGrupoActi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCuentaContaDetaGrupoActiActionPerformed(evt,cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCuentaContaDetaGrupoActi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cuentacontadetagrupoacti.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CuentaContaDetaGrupoActi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaDetaGrupoActi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				this.cuentacontadetagrupoacti.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				this.cuentacontadetagrupoacti.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cuentacontadetagrupoacti)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CuentaContaDetaGrupoActiModel) this.jTableDatosCuentaContaDetaGrupoActi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCuentaContaDetaGrupoActi=true;
				this.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(false);
				this.isEsNuevoCuentaContaDetaGrupoActi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCuentaContaDetaGrupoActi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaContaDetaGrupoActi(false);
				
				this.habilitarDeshabilitarControlesCuentaContaDetaGrupoActi(false);
				
				
				
				if(CuentaContaDetaGrupoActiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCuentaContaDetaGrupoActi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCuentaContaDetaGrupoActi.getRowCount()>=1) {
				jTableDatosCuentaContaDetaGrupoActi.removeRowSelectionInterval(0, jTableDatosCuentaContaDetaGrupoActi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCuentaContaDetaGrupoActi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaContaDetaGrupoActi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaContaDetaGrupoActi(false) ;
			
			this.isEsNuevoCuentaContaDetaGrupoActi=false;
			
			if(CuentaContaDetaGrupoActiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCuentaContaDetaGrupoActi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false);
				
				//SI ES MANUAL
				if(CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCuentaContaDetaGrupoActi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCuentaContaDetaGrupoActi--;			
			//CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux= new CuentaContaDetaGrupoActi();			
			//cuentacontadetagrupoactiAux.setId(this.iIdNuevoCuentaContaDetaGrupoActi);
			
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCuentaContaDetaGrupoActi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);
			
			this.cuentacontadetagrupoacti.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().add(this.cuentacontadetagrupoactiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cuentacontadetagrupoactis.add(this.cuentacontadetagrupoactiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(false);
			
			this.jTableDatosCuentaContaDetaGrupoActi.setRowSelectionInterval(this.getIndiceNuevoCuentaContaDetaGrupoActi(), this.getIndiceNuevoCuentaContaDetaGrupoActi());
			
			int iLastRow =  this.jTableDatosCuentaContaDetaGrupoActi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCuentaContaDetaGrupoActi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCuentaContaDetaGrupoActi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false);
			
			//SI ES MANUAL
			if(CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaContaDetaGrupoActi();
			}
			
			//this.abrirFrameTreeCuentaContaDetaGrupoActi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Cuenta Conta Deta Grupo ActiS ?", "MANTENIMIENTO DE Cuenta Conta Deta Grupo Acti", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCuentaContaDetaGrupoActi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCuentaContaDetaGrupoActi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cuentacontadetagrupoactiReturnGeneral=cuentacontadetagrupoactiLogic.procesarImportacionCuentaContaDetaGrupoActisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cuentacontadetagrupoactiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCuentaContaDetaGrupoActiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCuentaContaDetaGrupoActi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setFileImportacion(this.jInternalFrameImportacionCuentaContaDetaGrupoActi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCuentaContaDetaGrupoActi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCuentaContaDetaGrupoActi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCuentaContaDetaGrupoActi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCuentaContaDetaGrupoActi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisSeleccionados=new ArrayList<CuentaContaDetaGrupoActi>();		

		cuentacontadetagrupoactisSeleccionados=this.getCuentaContaDetaGrupoActisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CuentaContaDetaGrupoActiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CuentaContaDetaGrupoActiBaseDesign.jrxml";
			
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
			
			this.generarReporteCuentaContaDetaGrupoActis("Todos",cuentacontadetagrupoactisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Conta Deta Grupo Acti",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DetalleGrupoActivoFijo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DetalleGrupoActivoFijo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DetalleGrupoActivoFijo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DetalleGrupoActivoFijo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					sNombreCampoCategoria="id_detalle_grupo_activo_fijo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					sNombreCampoCategoriaValor="id_detalle_grupo_activo_fijo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle Grupo Activo Fijo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_detalle_grupo_activo_fijo");
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
	
	public void jButtonGenerarExcelReporteDinamicoCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisSeleccionados=new ArrayList<CuentaContaDetaGrupoActi>();		
		
		cuentacontadetagrupoactisSeleccionados=this.getCuentaContaDetaGrupoActisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontadetagrupoacti";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CuentaContaDetaGrupoActis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(CuentaContaDetaGrupoActi cuentacontadetagrupoacti:cuentacontadetagrupoactisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentacontadetagrupoacti.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO);
					iRow++;

					for(CuentaContaDetaGrupoActi cuentacontadetagrupoacti:cuentacontadetagrupoactisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentacontadetagrupoacti.getdetallegrupoactivofijo_descripcion());
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
			//	this.getFilaCabeceraExportarExcelCuentaContaDetaGrupoActi(row);				
			//	iRow++;
			//}				
			
			//for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:cuentacontadetagrupoactisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCuentaContaDetaGrupoActi(cuentacontadetagrupoactiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Conta Deta Grupo Acti",JOptionPane.INFORMATION_MESSAGE);
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
				this.cuentacontadetagrupoactiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false);
			
			//SI ES MANUAL
			if(CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaContaDetaGrupoActi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false);
			
			//SI ES MANUAL
			if(CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCuentaContaDetaGrupoActi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false);
			
			//SI ES MANUAL
			if(CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCuentaContaDetaGrupoActi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCuentaContaDetaGrupoActi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCuentaContaDetaGrupoActi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCuentaContaDetaGrupoActi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCuentaContaDetaGrupoActi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCuentaContaDetaGrupoActi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCuentaContaDetaGrupoActi.setMinimumSize(dimensionMinimum);
		this.jTableDatosCuentaContaDetaGrupoActi.setMaximumSize(dimensionMaximum);
		this.jTableDatosCuentaContaDetaGrupoActi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCuentaContaDetaGrupoActi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCuentaContaDetaGrupoActi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCuentaContaDetaGrupoActi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCuentaContaDetaGrupoActi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCuentaContaDetaGrupoActi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaContaDetaGrupoActi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCuentaContaDetaGrupoActi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCuentaContaDetaGrupoActi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi();
		
		this.inicializarActualizarBindingBotonesManualCuentaContaDetaGrupoActi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCuentaContaDetaGrupoActi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaContaDetaGrupoActi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaContaDetaGrupoActi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaContaDetaGrupoActi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCuentaContaDetaGrupoActi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCuentaContaDetaGrupoActi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jCheckBoxPostAccionNuevoCuentaContaDetaGrupoActi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jCheckBoxPostAccionSinCerrarCuentaContaDetaGrupoActi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jCheckBoxPostAccionSinMensajeCuentaContaDetaGrupoActi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCuentaContaDetaGrupoActi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCuentaContaDetaGrupoActi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
				this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jCheckBoxPostAccionNuevoCuentaContaDetaGrupoActi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jCheckBoxPostAccionSinCerrarCuentaContaDetaGrupoActi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jCheckBoxPostAccionSinMensajeCuentaContaDetaGrupoActi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCuentaContaDetaGrupoActi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCuentaContaDetaGrupoActi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCuentaContaDetaGrupoActi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCuentaContaDetaGrupoActi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCuentaContaDetaGrupoActi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCuentaContaDetaGrupoActi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCuentaContaDetaGrupoActi(Boolean esInicializar) throws Exception {
		try	{	
			if(CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaContaDetaGrupoActi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCuentaContaDetaGrupoActi() throws Exception {
		try	{
			if(CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCuentaContaDetaGrupoActi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCuentaContaDetaGrupoActi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCuentaContaDetaGrupoActi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCuentaContaDetaGrupoActi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCuentaContaDetaGrupoActi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCuentaContaDetaGrupoActi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCuentaContaDetaGrupoActi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCuentaContaDetaGrupoActi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCuentaContaDetaGrupoActi.addItem(reporte);
			}
			
			
			if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCuentaContaDetaGrupoActi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCuentaContaDetaGrupoActi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCuentaContaDetaGrupoActi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCuentaContaDetaGrupoActi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaContaDetaGrupoActi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaContaDetaGrupoActi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi!=null) {
				this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi!=null) {
				this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi!=null) {
				
				if(this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCuentaContaDetaGrupoActi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi.getSelectedItem()).getId();}
		if(this.jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.getSelectedItem()!=null){this.id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo=((DetalleGrupoActivoFijo)this.jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCuentaContaDetaGrupoActi(Boolean esInicializar) throws Exception {				
		if(CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCuentaContaDetaGrupoActi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCuentaContaDetaGrupoActi() throws Exception {
		this.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCuentaContaDetaGrupoActi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CuentaContaDetaGrupoActiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CuentaContaDetaGrupoActiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCuentaContaDetaGrupoActiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContaDetaGrupoActiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CuentaContaDetaGrupoActiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CuentaContaDetaGrupoActiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cuentacontadetagrupoactis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCuentaContaDetaGrupoActi.setModel(new CuentaContaDetaGrupoActiModel(this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCuentaContaDetaGrupoActi.setModel(new CuentaContaDetaGrupoActiModel(this.cuentacontadetagrupoactis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCuentaContaDetaGrupoActi!=null && this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCuentaContaDetaGrupoActi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCuentaContaDetaGrupoActi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContaDetaGrupoActi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CuentaContaDetaGrupoActiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO,cuentacontadetagrupoactiConstantesFunciones.resaltarSeleccionarCuentaContaDetaGrupoActi,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO,cuentacontadetagrupoactiConstantesFunciones.resaltarSeleccionarCuentaContaDetaGrupoActi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCuentaContaDetaGrupoActi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContaDetaGrupoActi,CuentaContaDetaGrupoActiConstantesFunciones.LABEL_ID));

		if(this.cuentacontadetagrupoactiConstantesFunciones.mostraridCuentaContaDetaGrupoActi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaContaDetaGrupoActiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuentacontadetagrupoactiConstantesFunciones.resaltaridCuentaContaDetaGrupoActi,this.cuentacontadetagrupoactiConstantesFunciones.activaridCuentaContaDetaGrupoActi,this,true,"idCuentaContaDetaGrupoActi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuentacontadetagrupoactiConstantesFunciones.resaltaridCuentaContaDetaGrupoActi,this.cuentacontadetagrupoactiConstantesFunciones.activaridCuentaContaDetaGrupoActi,this,true,"idCuentaContaDetaGrupoActi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaContaDetaGrupoActi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContaDetaGrupoActi,CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.cuentacontadetagrupoactiConstantesFunciones.mostrarid_cuenta_contableCuentaContaDetaGrupoActi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.cuentacontadetagrupoactiConstantesFunciones.resaltarid_cuenta_contableCuentaContaDetaGrupoActi,this,this.cuentacontadetagrupoactiConstantesFunciones.activarid_cuenta_contableCuentaContaDetaGrupoActi));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.cuentacontadetagrupoactiConstantesFunciones.resaltarid_cuenta_contableCuentaContaDetaGrupoActi,this,this.cuentacontadetagrupoactiConstantesFunciones.activarid_cuenta_contableCuentaContaDetaGrupoActi,true,"id_cuenta_contableCuentaContaDetaGrupoActi","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new CuentaContaDetaGrupoActiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaContaDetaGrupoActi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContaDetaGrupoActi,CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO));

		if(this.cuentacontadetagrupoactiConstantesFunciones.mostrarid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DetalleGrupoActivoFijoTableCell(this.detallegrupoactivofijosForeignKey,this.cuentacontadetagrupoactiConstantesFunciones.resaltarid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi,this,this.cuentacontadetagrupoactiConstantesFunciones.activarid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi));
			tableColumn.setCellEditor(new DetalleGrupoActivoFijoTableCell(this.detallegrupoactivofijosForeignKey,this.cuentacontadetagrupoactiConstantesFunciones.resaltarid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi,this,this.cuentacontadetagrupoactiConstantesFunciones.activarid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi,true,"id_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaContaDetaGrupoActiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCuentaContaDetaGrupoActi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCuentaContaDetaGrupoActi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCuentaContaDetaGrupoActi && this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCuentaContaDetaGrupoActi.addColumn(tableColumn);
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
			
			this.jTableDatosCuentaContaDetaGrupoActi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCuentaContaDetaGrupoActi && this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCuentaContaDetaGrupoActi && this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCuentaContaDetaGrupoActi.moveColumn(this.jTableDatosCuentaContaDetaGrupoActi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCuentaContaDetaGrupoActi.moveColumn(this.jTableDatosCuentaContaDetaGrupoActi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCuentaContaDetaGrupoActi.moveColumn(this.jTableDatosCuentaContaDetaGrupoActi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCuentaContaDetaGrupoActi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCuentaContaDetaGrupoActi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCuentaContaDetaGrupoActi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCuentaContaDetaGrupoActi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCuentaContaDetaGrupoActi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCuentaContaDetaGrupoActi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCuentaContaDetaGrupoActi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCuentaContaDetaGrupoActi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cuentacontadetagrupoactis.size()-1;
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
		//this.jTableDatosCuentaContaDetaGrupoActi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCuentaContaDetaGrupoActi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCuentaContaDetaGrupoActi();
			
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
				
				//this.isEsNuevoCuentaContaDetaGrupoActi=false;
					
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
			
				if(this.cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCuentaContaDetaGrupoActi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cuentacontadetagrupoacti.getsType().equals("DUPLICADO")
				   || this.cuentacontadetagrupoacti.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCuentaContaDetaGrupoActi=true;
				
				} else {
					this.isEsNuevoCuentaContaDetaGrupoActi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
					if(this.cuentacontadetagrupoacti.getId()>=0 && !this.cuentacontadetagrupoacti.getIsNew()) {						
						this.isEsNuevoCuentaContaDetaGrupoActi=false;
						
					} else {
						this.isEsNuevoCuentaContaDetaGrupoActi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCuentaContaDetaGrupoActi(esRelaciones);						
				
				this.seleccionarCuentaContaDetaGrupoActi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cuentacontadetagrupoacti.getId()<0) {
					this.isEsNuevoCuentaContaDetaGrupoActi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCuentaContaDetaGrupoActi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCuentaContaDetaGrupoActi(evt,rowIndex);
				}	
				
				if(this.cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CuentaContaDetaGrupoActi: " + this.dDif); 
					}
				}								
				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCuentaContaDetaGrupoActi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cuentacontadetagrupoacti)) {
					if(this.cuentacontadetagrupoacti.getId()>0) {
						this.cuentacontadetagrupoacti.setIsDeleted(true);
						
						this.cuentacontadetagrupoactisEliminados.add(this.cuentacontadetagrupoacti);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().remove(this.cuentacontadetagrupoacti);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cuentacontadetagrupoactis.remove(this.cuentacontadetagrupoacti);				
					}
					
					
					((CuentaContaDetaGrupoActiModel) this.jTableDatosCuentaContaDetaGrupoActi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCuentaContaDetaGrupoActi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCuentaContaDetaGrupoActi) {
			
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCuentaContaDetaGrupoActi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);
				}
				
				//ARCHITECTURE
				try {
					

					//CuentaContable
					if(!this.cuentacontadetagrupoactiConstantesFunciones.cargarid_cuenta_contableCuentaContaDetaGrupoActi || this.cuentacontadetagrupoactiConstantesFunciones.event_dependid_cuenta_contableCuentaContaDetaGrupoActi) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.cuentacontadetagrupoacti.getid_cuenta_contable());
									//this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(cuentacontadetagrupoacti.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(cuentacontadetagrupoacti.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.cuentacontadetagrupoacti.getid_cuenta_contable(),false,"Formulario");

					//DetalleGrupoActivoFijo
					if(!this.cuentacontadetagrupoactiConstantesFunciones.cargarid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi || this.cuentacontadetagrupoactiConstantesFunciones.event_dependid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi) {
						//this.cargarCombosDetalleGrupoActivoFijosForeignKeyLista(" where id="+this.cuentacontadetagrupoacti.getid_detalle_grupo_activo_fijo());
									//this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false,false);
						this.detallegrupoactivofijosForeignKey=new ArrayList<DetalleGrupoActivoFijo>();

						if(cuentacontadetagrupoacti.getDetalleGrupoActivoFijo()!=null) {
							this.detallegrupoactivofijosForeignKey.add(cuentacontadetagrupoacti.getDetalleGrupoActivoFijo());
						}

						this.addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo();
						this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey("Todos");
					}
					this.setActualDetalleGrupoActivoFijoForeignKey(this.cuentacontadetagrupoacti.getid_detalle_grupo_activo_fijo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCuentaContaDetaGrupoActi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCuentaContaDetaGrupoActi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaContaDetaGrupoActi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoacti) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCuentaContaDetaGrupoActi(cuentacontadetagrupoacti,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoacti,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCuentaContaDetaGrupoActi(cuentacontadetagrupoacti);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCuentaContaDetaGrupoActi(cuentacontadetagrupoacti,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCuentaContaDetaGrupoActi(cuentacontadetagrupoacti);
	}
	
	public void setVariablesObjetoActualToFormularioCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoacti) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jLabelidCuentaContaDetaGrupoActi.setText(cuentacontadetagrupoacti.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CuentaContaDetaGrupoActi cuentacontadetagrupoactiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cuentacontadetagrupoactiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CuentaContaDetaGrupoActi cuentacontadetagrupoactiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cuentacontadetagrupoactiLocal=this.cuentacontadetagrupoacti;
			} else {
				cuentacontadetagrupoactiLocal=this.cuentacontadetagrupoactiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cuentacontadetagrupoactiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCuentaContaDetaGrupoActi(cuentacontadetagrupoactiLocal,true);
					
					if(cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cuentacontadetagrupoactiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cuentacontadetagrupoactiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoacti,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCuentaContaDetaGrupoActi(cuentacontadetagrupoacti,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaDetaGrupoActi(cuentacontadetagrupoacti);
	}
	
	public void setVariablesFormularioToObjetoActualCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoacti,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCuentaContaDetaGrupoActi(cuentacontadetagrupoacti,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoacti,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jLabelidCuentaContaDetaGrupoActi.getText()==null || this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jLabelidCuentaContaDetaGrupoActi.getText()=="" || this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jLabelidCuentaContaDetaGrupoActi.getText()=="Id") {
				this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jLabelidCuentaContaDetaGrupoActi.setText("0");
			}

			if(conColumnasBase) {cuentacontadetagrupoacti.setId(Long.parseLong(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jLabelidCuentaContaDetaGrupoActi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaContaDetaGrupoActiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jLabelIdCuentaContaDetaGrupoActi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoactiBean,CuentaContaDetaGrupoActi cuentacontadetagrupoacti,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cuentacontadetagrupoactiBean.getid_cuenta_contable()!=null && !cuentacontadetagrupoactiBean.getid_cuenta_contable().equals(-1L))) {cuentacontadetagrupoacti.setid_cuenta_contable(cuentacontadetagrupoactiBean.getid_cuenta_contable());}
			if(conDefault || (!conDefault && cuentacontadetagrupoactiBean.getid_detalle_grupo_activo_fijo()!=null && !cuentacontadetagrupoactiBean.getid_detalle_grupo_activo_fijo().equals(-1L))) {cuentacontadetagrupoacti.setid_detalle_grupo_activo_fijo(cuentacontadetagrupoactiBean.getid_detalle_grupo_activo_fijo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoactiOrigen,CuentaContaDetaGrupoActi cuentacontadetagrupoacti,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cuentacontadetagrupoactiOrigen.getId()!=null && !cuentacontadetagrupoactiOrigen.getId().equals(0L))) {cuentacontadetagrupoacti.setId(cuentacontadetagrupoactiOrigen.getId());}}
			if(conDefault || (!conDefault && cuentacontadetagrupoactiOrigen.getid_cuenta_contable()!=null && !cuentacontadetagrupoactiOrigen.getid_cuenta_contable().equals(-1L))) {cuentacontadetagrupoacti.setid_cuenta_contable(cuentacontadetagrupoactiOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && cuentacontadetagrupoactiOrigen.getid_detalle_grupo_activo_fijo()!=null && !cuentacontadetagrupoactiOrigen.getid_detalle_grupo_activo_fijo().equals(-1L))) {cuentacontadetagrupoacti.setid_detalle_grupo_activo_fijo(cuentacontadetagrupoactiOrigen.getid_detalle_grupo_activo_fijo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoacti) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jLabelidCuentaContaDetaGrupoActi.setText(cuentacontadetagrupoacti.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActiBean cuentacontadetagrupoactiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jLabelidCuentaContaDetaGrupoActi.setText(cuentacontadetagrupoactiBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActiParameterReturnGeneral cuentacontadetagrupoactiReturnGeneral,CuentaContaDetaGrupoActiBean cuentacontadetagrupoactiBean,Boolean conDefault) throws Exception { 
		try {
			CuentaContaDetaGrupoActi cuentacontadetagrupoactiLocal=new CuentaContaDetaGrupoActi();
			
			cuentacontadetagrupoactiLocal=cuentacontadetagrupoactiReturnGeneral.getCuentaContaDetaGrupoActi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cuentacontadetagrupoactiLocal.getId()!=null && !cuentacontadetagrupoactiLocal.getId().equals(0L))) {cuentacontadetagrupoactiBean.setId(cuentacontadetagrupoactiLocal.getId());}}
			if(conDefault || (!conDefault && cuentacontadetagrupoactiLocal.getid_cuenta_contable()!=null && !cuentacontadetagrupoactiLocal.getid_cuenta_contable().equals(-1L))) {cuentacontadetagrupoactiBean.setid_cuenta_contable(cuentacontadetagrupoactiLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && cuentacontadetagrupoactiLocal.getid_detalle_grupo_activo_fijo()!=null && !cuentacontadetagrupoactiLocal.getid_detalle_grupo_activo_fijo().equals(-1L))) {cuentacontadetagrupoactiBean.setid_detalle_grupo_activo_fijo(cuentacontadetagrupoactiLocal.getid_detalle_grupo_activo_fijo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCuentaContaDetaGrupoActiGenerico(Long idCuentaContaDetaGrupoActiSeleccionado,JComboBox jComboBoxCuentaContaDetaGrupoActi,List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisLocal)throws Exception {
		try {
			CuentaContaDetaGrupoActi  cuentacontadetagrupoactiTemp=null;

			for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:cuentacontadetagrupoactisLocal) {
				if(cuentacontadetagrupoactiAux.getId()!=null && cuentacontadetagrupoactiAux.getId().equals(idCuentaContaDetaGrupoActiSeleccionado)) {
					cuentacontadetagrupoactiTemp=cuentacontadetagrupoactiAux;
					break;
				}
			}

			jComboBoxCuentaContaDetaGrupoActi.setSelectedItem(cuentacontadetagrupoactiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCuentaContaDetaGrupoActiGenerico(JComboBox jComboBoxCuentaContaDetaGrupoActi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCuentaContaDetaGrupoActi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCuentaContaDetaGrupoActi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCuentaContaDetaGrupoActi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCuentaContaDetaGrupoActi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCuentaContaDetaGrupoActi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCuentaContaDetaGrupoActi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCuentaContaDetaGrupoActi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCuentaContaDetaGrupoActi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCuentaContaDetaGrupoActi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCuentaContaDetaGrupoActi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentacontadetagrupoacti=(CuentaContaDetaGrupoActi) cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) cuentacontadetagrupoactis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!cuentacontadetagrupoacti.getIsNew() && !cuentacontadetagrupoacti.getIsChanged() && !cuentacontadetagrupoacti.getIsDeleted()) {
				sDescripcion=cuentacontadetagrupoacti.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=cuentacontadetagrupoacti.getcuentacontable_descripcion();
			}
		}

		if(sTipo.equals("DetalleGrupoActivoFijo")) {
			//sDescripcion=this.getActualDetalleGrupoActivoFijoForeignKeyDescripcion((Long)value);
			if(!cuentacontadetagrupoacti.getIsNew() && !cuentacontadetagrupoacti.getIsChanged() && !cuentacontadetagrupoacti.getIsDeleted()) {
				sDescripcion=cuentacontadetagrupoacti.getdetallegrupoactivofijo_descripcion();
			} else {
				//sDescripcion=this.getActualDetalleGrupoActivoFijoForeignKeyDescripcion((Long)value);
				sDescripcion=cuentacontadetagrupoacti.getdetallegrupoactivofijo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CuentaContaDetaGrupoActi cuentacontadetagrupoactiRow=new CuentaContaDetaGrupoActi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentacontadetagrupoactiRow=(CuentaContaDetaGrupoActi) cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cuentacontadetagrupoactiRow=(CuentaContaDetaGrupoActi) cuentacontadetagrupoactis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCuentaContaDetaGrupoActi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi && this.isPermisoNuevoCuentaContaDetaGrupoActi));			
			this.jButtonDuplicarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaDuplicarCuentaContaDetaGrupoActi && this.isPermisoDuplicarCuentaContaDetaGrupoActi));			
			this.jButtonCopiarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaCopiarCuentaContaDetaGrupoActi && this.isPermisoCopiarCuentaContaDetaGrupoActi));
			this.jButtonVerFormCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaVerFormCuentaContaDetaGrupoActi && this.isPermisoVerFormCuentaContaDetaGrupoActi));
			
			this.jButtonAbrirOrderByCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaOrdenCuentaContaDetaGrupoActi && this.isPermisoOrdenCuentaContaDetaGrupoActi));			
			
			this.jButtonNuevoRelacionesCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi && this.isPermisoNuevoCuentaContaDetaGrupoActi));			
			this.jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi && this.isPermisoNuevoCuentaContaDetaGrupoActi && this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi));
			
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonModificarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaModificarCuentaContaDetaGrupoActi && this.isPermisoActualizarCuentaContaDetaGrupoActi));	
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonActualizarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi && this.isPermisoActualizarCuentaContaDetaGrupoActi));	
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonEliminarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi && this.isPermisoEliminarCuentaContaDetaGrupoActi));
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonCancelarCuentaContaDetaGrupoActi.setVisible(this.isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi);							
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonGuardarCambiosCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi && this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi));			
			
			}
						
			this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi && this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi && this.isPermisoNuevoCuentaContaDetaGrupoActi));						
			this.jButtonDuplicarToolBarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaDuplicarCuentaContaDetaGrupoActi && this.isPermisoDuplicarCuentaContaDetaGrupoActi));						
			this.jButtonCopiarToolBarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaCopiarCuentaContaDetaGrupoActi && this.isPermisoCopiarCuentaContaDetaGrupoActi));			
			this.jButtonVerFormToolBarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaVerFormCuentaContaDetaGrupoActi && this.isPermisoVerFormCuentaContaDetaGrupoActi));			
			this.jButtonAbrirOrderByToolBarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaOrdenCuentaContaDetaGrupoActi && this.isPermisoOrdenCuentaContaDetaGrupoActi));
			this.jButtonNuevoRelacionesToolBarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi && this.isPermisoNuevoCuentaContaDetaGrupoActi));			
			this.jButtonNuevoGuardarCambiosToolBarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi && this.isPermisoNuevoCuentaContaDetaGrupoActi && this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi));			
			
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonModificarToolBarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaModificarCuentaContaDetaGrupoActi && this.isPermisoActualizarCuentaContaDetaGrupoActi));	
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonActualizarToolBarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi  && this.isPermisoActualizarCuentaContaDetaGrupoActi));	
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonEliminarToolBarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi && this.isPermisoEliminarCuentaContaDetaGrupoActi));
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonCancelarToolBarCuentaContaDetaGrupoActi.setVisible(this.isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi);				
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonGuardarCambiosToolBarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi && this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi && this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi && this.isPermisoNuevoCuentaContaDetaGrupoActi));			
			this.jMenuItemDuplicarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaDuplicarCuentaContaDetaGrupoActi && this.isPermisoDuplicarCuentaContaDetaGrupoActi));			
			this.jMenuItemCopiarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaCopiarCuentaContaDetaGrupoActi && this.isPermisoCopiarCuentaContaDetaGrupoActi));			
			this.jMenuItemVerFormCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaVerFormCuentaContaDetaGrupoActi && this.isPermisoVerFormCuentaContaDetaGrupoActi));			
			this.jMenuItemAbrirOrderByCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaOrdenCuentaContaDetaGrupoActi && this.isPermisoOrdenCuentaContaDetaGrupoActi));			
			//this.jMenuItemMostrarOcultarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaOrdenCuentaContaDetaGrupoActi && this.isPermisoOrdenCuentaContaDetaGrupoActi));
			this.jMenuItemDetalleAbrirOrderByCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaOrdenCuentaContaDetaGrupoActi && this.isPermisoOrdenCuentaContaDetaGrupoActi));			
			//this.jMenuItemDetalleMostrarOcultarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaOrdenCuentaContaDetaGrupoActi && this.isPermisoOrdenCuentaContaDetaGrupoActi));			
			this.jMenuItemNuevoRelacionesCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi && this.isPermisoNuevoCuentaContaDetaGrupoActi));			
			this.jMenuItemNuevoGuardarCambiosCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi && this.isPermisoNuevoCuentaContaDetaGrupoActi && this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi));									
			
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jMenuItemModificarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaModificarCuentaContaDetaGrupoActi && this.isPermisoActualizarCuentaContaDetaGrupoActi));	
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jMenuItemActualizarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi && this.isPermisoActualizarCuentaContaDetaGrupoActi));	
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jMenuItemEliminarCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi && this.isPermisoEliminarCuentaContaDetaGrupoActi));
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jMenuItemCancelarCuentaContaDetaGrupoActi.setVisible(this.isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi);				
			}
			
			this.jMenuItemGuardarCambiosCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi && this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi));						
			this.jMenuItemGuardarCambiosTablaCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi && this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi=this.jButtonNuevoCuentaContaDetaGrupoActi.isVisible();
			this.isVisibilidadCeldaDuplicarCuentaContaDetaGrupoActi=this.jButtonDuplicarCuentaContaDetaGrupoActi.isVisible();
			this.isVisibilidadCeldaCopiarCuentaContaDetaGrupoActi=this.jButtonCopiarCuentaContaDetaGrupoActi.isVisible();
			this.isVisibilidadCeldaVerFormCuentaContaDetaGrupoActi=this.jButtonVerFormCuentaContaDetaGrupoActi.isVisible();
			
			this.isVisibilidadCeldaOrdenCuentaContaDetaGrupoActi=this.jButtonAbrirOrderByCuentaContaDetaGrupoActi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi=this.jButtonNuevoRelacionesCuentaContaDetaGrupoActi.isVisible();
			this.isVisibilidadCeldaModificarCuentaContaDetaGrupoActi=this.jButtonModificarCuentaContaDetaGrupoActi.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
			this.isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonActualizarCuentaContaDetaGrupoActi.isVisible();
			this.isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonEliminarCuentaContaDetaGrupoActi.isVisible();
			this.isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonCancelarCuentaContaDetaGrupoActi.isVisible();
			this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonGuardarCambiosCuentaContaDetaGrupoActi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi=this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi=this.jButtonNuevoToolBarCuentaContaDetaGrupoActi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi=this.jButtonNuevoRelacionesToolBarCuentaContaDetaGrupoActi.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
			this.isVisibilidadCeldaModificarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonModificarToolBarCuentaContaDetaGrupoActi.isVisible();
			this.isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonActualizarToolBarCuentaContaDetaGrupoActi.isVisible();
			this.isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonEliminarToolBarCuentaContaDetaGrupoActi.isVisible();
			this.isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonCancelarToolBarCuentaContaDetaGrupoActi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=this.jButtonGuardarCambiosToolBarCuentaContaDetaGrupoActi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi=this.jButtonGuardarCambiosTablaToolBarCuentaContaDetaGrupoActi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi=this.jMenuItemNuevoCuentaContaDetaGrupoActi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi=this.jMenuItemNuevoRelacionesCuentaContaDetaGrupoActi.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
			this.isVisibilidadCeldaModificarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jMenuItemModificarCuentaContaDetaGrupoActi.isVisible();
			this.isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jMenuItemActualizarCuentaContaDetaGrupoActi.isVisible();
			this.isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jMenuItemEliminarCuentaContaDetaGrupoActi.isVisible();
			this.isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jMenuItemCancelarCuentaContaDetaGrupoActi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=this.jMenuItemGuardarCambiosCuentaContaDetaGrupoActi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi=this.jMenuItemGuardarCambiosTablaCuentaContaDetaGrupoActi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCuentaContaDetaGrupoActi(Boolean esInicializar) {
		if(CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones()) {
				//if(this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCuentaContaDetaGrupoActi();
			}
			
			this.inicializarActualizarBindingBotonesManualCuentaContaDetaGrupoActi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCuentaContaDetaGrupoActi() {
		this.jButtonNuevoCuentaContaDetaGrupoActi.setVisible(this.isPermisoNuevoCuentaContaDetaGrupoActi);			
		this.jButtonDuplicarCuentaContaDetaGrupoActi.setVisible(this.isPermisoDuplicarCuentaContaDetaGrupoActi);			
		this.jButtonCopiarCuentaContaDetaGrupoActi.setVisible(this.isPermisoCopiarCuentaContaDetaGrupoActi);			
		this.jButtonVerFormCuentaContaDetaGrupoActi.setVisible(this.isPermisoVerFormCuentaContaDetaGrupoActi);			
		
		this.jButtonAbrirOrderByCuentaContaDetaGrupoActi.setVisible(this.isPermisoOrdenCuentaContaDetaGrupoActi);					
		
		this.jButtonNuevoRelacionesCuentaContaDetaGrupoActi.setVisible(this.isPermisoNuevoCuentaContaDetaGrupoActi);			
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonModificarCuentaContaDetaGrupoActi.setVisible(this.isPermisoActualizarCuentaContaDetaGrupoActi);	
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonActualizarCuentaContaDetaGrupoActi.setVisible(this.isPermisoActualizarCuentaContaDetaGrupoActi);	
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonEliminarCuentaContaDetaGrupoActi.setVisible(this.isPermisoEliminarCuentaContaDetaGrupoActi);
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonCancelarCuentaContaDetaGrupoActi.setVisible(this.isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi);						
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonGuardarCambiosCuentaContaDetaGrupoActi.setVisible(this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi);							
		}
		
		this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi.setVisible(this.isPermisoActualizarCuentaContaDetaGrupoActi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCuentaContaDetaGrupoActi() {
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonModificarCuentaContaDetaGrupoActi.setVisible(this.isPermisoActualizarCuentaContaDetaGrupoActi);	
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonActualizarCuentaContaDetaGrupoActi.setVisible(this.isPermisoActualizarCuentaContaDetaGrupoActi);	
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonEliminarCuentaContaDetaGrupoActi.setVisible(this.isPermisoEliminarCuentaContaDetaGrupoActi);
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonCancelarCuentaContaDetaGrupoActi.setVisible(this.isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi);							
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonGuardarCambiosCuentaContaDetaGrupoActi.setVisible((this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi && this.isPermisoGuardarCambiosCuentaContaDetaGrupoActi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCuentaContaDetaGrupoActi() {
		if(CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCuentaContaDetaGrupoActi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCuentaContaDetaGrupoActi() {
	}
	
	public void jTableDatosCuentaContaDetaGrupoActiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCuentaContaDetaGrupoActi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCuentaContaDetaGrupoActiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoactiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaContaDetaGrupoActi(this.getcuentacontadetagrupoacti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacontadetagrupoacti==null) {
						this.cuentacontadetagrupoacti = new CuentaContaDetaGrupoActi();
					}

					this.setVariablesFormularioToObjetoActualCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);
				}

				if(this.cuentacontadetagrupoacti.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cuentacontadetagrupoacti.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoactiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoactiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoactiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableCuentaContaDetaGrupoActiActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderCuentaContaDetaGrupoActi=null;
			TitledBorder titledBordercuentacontable=null;

			if(!this.jScrollPanelDatosCuentaContaDetaGrupoActi.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCuentaContaDetaGrupoActi=(TitledBorder)this.jScrollPanelDatosCuentaContaDetaGrupoActi.getBorder();
				titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderCuentaContaDetaGrupoActi.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contableCuentaContaDetaGrupoActiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebCuentaContaDetaGrupoActi(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaContaDetaGrupoActi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaContaDetaGrupoActi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaContaDetaGrupoActi(this.getcuentacontadetagrupoacti(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.cuentacontadetagrupoactiLogic.getConnexion());

				if(this.cuentacontadetagrupoacti.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.cuentacontadetagrupoacti.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaContaDetaGrupoActi=(TitledBorder)this.jScrollPanelDatosCuentaContaDetaGrupoActi.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderCuentaContaDetaGrupoActi.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableCuentaContaDetaGrupoActiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoactiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaContaDetaGrupoActi(this.getcuentacontadetagrupoacti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacontadetagrupoacti==null) {
						this.cuentacontadetagrupoacti = new CuentaContaDetaGrupoActi();
					}

					this.setVariablesFormularioToObjetoActualCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);
				}

				if(this.cuentacontadetagrupoacti.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.cuentacontadetagrupoacti.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoactiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoactiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoactiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodetallegrupoactivofijo=true;

			idTienePermisodetallegrupoactivofijo=this.tienePermisosUsuarioEnPaginaWebCuentaContaDetaGrupoActi(DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

			if(idTienePermisodetallegrupoactivofijo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaContaDetaGrupoActi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaContaDetaGrupoActi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaContaDetaGrupoActi(this.getcuentacontadetagrupoacti(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);

				this.detallegrupoactivofijoBeanSwingJInternalFrame=new DetalleGrupoActivoFijoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.detallegrupoactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.detallegrupoactivofijoBeanSwingJInternalFrame.getDetalleGrupoActivoFijoLogic().setConnexion(this.cuentacontadetagrupoactiLogic.getConnexion());

				if(this.cuentacontadetagrupoacti.getid_detalle_grupo_activo_fijo()!=null) {
					this.detallegrupoactivofijoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.detallegrupoactivofijoBeanSwingJInternalFrame.setIdActual(this.cuentacontadetagrupoacti.getid_detalle_grupo_activo_fijo());
					this.detallegrupoactivofijoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.detallegrupoactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.detallegrupoactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleGrupoActivoFijo();
				}

				JInternalFrameBase jinternalFrame =this.detallegrupoactivofijoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaContaDetaGrupoActi=(TitledBorder)this.jScrollPanelDatosCuentaContaDetaGrupoActi.getBorder();
				TitledBorder titledBorderdetallegrupoactivofijo=(TitledBorder)this.detallegrupoactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder();

				titledBorderdetallegrupoactivofijo.setTitle(titledBorderCuentaContaDetaGrupoActi.getTitle() + " -> Detalle Grupo Activo Fijo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoactiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaContaDetaGrupoActi(this.getcuentacontadetagrupoacti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacontadetagrupoacti==null) {
						this.cuentacontadetagrupoacti = new CuentaContaDetaGrupoActi();
					}

					this.setVariablesFormularioToObjetoActualCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);
				}

				if(this.cuentacontadetagrupoacti.getid_detalle_grupo_activo_fijo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_detalle_grupo_activo_fijo = "+this.cuentacontadetagrupoacti.getid_detalle_grupo_activo_fijo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoactiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoactiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoactiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCuentaContableCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false,false);

			this.getCuentaContaDetaGrupoActisFK_IdCuentaContable();

			this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false);

			//if(CuentaContaDetaGrupoActiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false,false);

			this.getCuentaContaDetaGrupoActisFK_IdDetalleGrupoActivoFijo();

			this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false);

			//if(CuentaContaDetaGrupoActiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontadetagrupoactiLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCuentaContaDetaGrupoActi() {
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.setVisible(false);	    			
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.dispose();
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi!=null) {
			this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.dispose();
			this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi=null;
		}
		
		if(this.jInternalFrameImportacionCuentaContaDetaGrupoActi!=null) {
			this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setVisible(false);	    			
			this.jInternalFrameImportacionCuentaContaDetaGrupoActi.dispose();
			this.jInternalFrameImportacionCuentaContaDetaGrupoActi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCuentaContaDetaGrupoActi();
			
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
			
			
			if(sTipo.equals("NuevoCuentaContaDetaGrupoActi")) {
				jButtonNuevoCuentaContaDetaGrupoActiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCuentaContaDetaGrupoActi")) {
				jButtonDuplicarCuentaContaDetaGrupoActiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCuentaContaDetaGrupoActi")) {
				jButtonCopiarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("VerFormCuentaContaDetaGrupoActi")) {
				jButtonVerFormCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCuentaContaDetaGrupoActi")) {
				jButtonNuevoCuentaContaDetaGrupoActiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCuentaContaDetaGrupoActi")) {
				jButtonDuplicarCuentaContaDetaGrupoActiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCuentaContaDetaGrupoActi")) {
				jButtonNuevoCuentaContaDetaGrupoActiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCuentaContaDetaGrupoActi")) {
				jButtonDuplicarCuentaContaDetaGrupoActiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCuentaContaDetaGrupoActi")) {
				jButtonNuevoCuentaContaDetaGrupoActiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCuentaContaDetaGrupoActi")) {
				jButtonNuevoCuentaContaDetaGrupoActiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCuentaContaDetaGrupoActi")) {
				jButtonNuevoCuentaContaDetaGrupoActiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCuentaContaDetaGrupoActi")) {
				jButtonModificarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCuentaContaDetaGrupoActi")) {
				jButtonModificarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCuentaContaDetaGrupoActi")) {
				jButtonModificarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCuentaContaDetaGrupoActi")) {
				jButtonActualizarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCuentaContaDetaGrupoActi")) {
				jButtonActualizarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCuentaContaDetaGrupoActi")) {
				jButtonActualizarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("EliminarCuentaContaDetaGrupoActi")) {
				jButtonEliminarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCuentaContaDetaGrupoActi")) {
				jButtonEliminarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCuentaContaDetaGrupoActi")) {
				jButtonEliminarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("CancelarCuentaContaDetaGrupoActi")) {
				jButtonCancelarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCuentaContaDetaGrupoActi")) {
				jButtonCancelarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCuentaContaDetaGrupoActi")) {
				jButtonCancelarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("CerrarCuentaContaDetaGrupoActi")) {
				jButtonCerrarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCuentaContaDetaGrupoActi")) {
				jButtonCerrarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCuentaContaDetaGrupoActi")) {
				jButtonCerrarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCuentaContaDetaGrupoActi")) {
				jButtonMostrarOcultarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCuentaContaDetaGrupoActi")) {
				jButtonCancelarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCuentaContaDetaGrupoActi")) {
				jButtonGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCuentaContaDetaGrupoActi")) {
				jButtonGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCuentaContaDetaGrupoActi")) {
				jButtonCopiarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCuentaContaDetaGrupoActi")) {
				jButtonVerFormCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCuentaContaDetaGrupoActi")) {
				jButtonGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCuentaContaDetaGrupoActi")) {
				jButtonCopiarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCuentaContaDetaGrupoActi")) {
				jButtonVerFormCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCuentaContaDetaGrupoActi")) {
				jButtonGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCuentaContaDetaGrupoActi")) {
				jButtonGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCuentaContaDetaGrupoActi")) {
				jButtonGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCuentaContaDetaGrupoActi")) {
				jButtonRecargarInformacionCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCuentaContaDetaGrupoActi")) {
				jButtonRecargarInformacionCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCuentaContaDetaGrupoActi")) {
				jButtonRecargarInformacionCuentaContaDetaGrupoActiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCuentaContaDetaGrupoActi")) {
				jButtonAnterioresCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCuentaContaDetaGrupoActi")) {
				jButtonAnterioresCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCuentaContaDetaGrupoActi")) {
				jButtonAnterioresCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCuentaContaDetaGrupoActi")) {
				jButtonSiguientesCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCuentaContaDetaGrupoActi")) {
				jButtonSiguientesCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCuentaContaDetaGrupoActi")) {
				jButtonSiguientesCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCuentaContaDetaGrupoActi") || sTipo.equals("MenuItemDetalleAbrirOrderByCuentaContaDetaGrupoActi")) {
				jButtonAbrirOrderByCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCuentaContaDetaGrupoActi") || sTipo.equals("MenuItemDetalleMostrarOcultarCuentaContaDetaGrupoActi")) {
				jButtonMostrarOcultarCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCuentaContaDetaGrupoActi")) {
				jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCuentaContaDetaGrupoActi")) {
				jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCuentaContaDetaGrupoActi")) {
				jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCuentaContaDetaGrupoActi")) {
				jButtonCerrarReporteDinamicoCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCuentaContaDetaGrupoActi")) {
				jButtonGenerarReporteDinamicoCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCuentaContaDetaGrupoActi")) {
				
				jButtonGenerarExcelReporteDinamicoCuentaContaDetaGrupoActiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCuentaContaDetaGrupoActi")) {
				jButtonCerrarImportacionCuentaContaDetaGrupoActiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCuentaContaDetaGrupoActi")) {
				
				jButtonGenerarImportacionCuentaContaDetaGrupoActiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCuentaContaDetaGrupoActi")) {
				
				jButtonAbrirImportacionCuentaContaDetaGrupoActiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCuentaContaDetaGrupoActi")) {
				jComboBoxTiposAccionesCuentaContaDetaGrupoActiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCuentaContaDetaGrupoActi")) {
				jComboBoxTiposRelacionesCuentaContaDetaGrupoActiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCuentaContaDetaGrupoActi")) {
				jComboBoxTiposAccionesCuentaContaDetaGrupoActiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCuentaContaDetaGrupoActi")) {
				
				jComboBoxTiposSeleccionarCuentaContaDetaGrupoActiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCuentaContaDetaGrupoActi")) {
				jTextFieldValorCampoGeneralCuentaContaDetaGrupoActiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCuentaContaDetaGrupoActi")) {
				jButtonAbrirOrderByCuentaContaDetaGrupoActiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCuentaContaDetaGrupoActi")) {
				jButtonAbrirOrderByCuentaContaDetaGrupoActiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCuentaContaDetaGrupoActi")) {
				jButtonCerrarOrderByCuentaContaDetaGrupoActiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCuentaContaDetaGrupoActiBusqueda")) {
				this.jButtonidCuentaContaDetaGrupoActiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaContaDetaGrupoActi")) {
				this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaContaDetaGrupoActiArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaContaDetaGrupoActiUpdate")) {
				this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaContaDetaGrupoActiBusqueda")) {
				this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate")) {
				this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda")) {
				this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contableCuentaContaDetaGrupoActi")) {
				this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCuentaContableCuentaContaDetaGrupoActi")) {
				this.jButtonFK_IdCuentaContableCuentaContaDetaGrupoActiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi")) {
				this.jButtonFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActiActionPerformed(evt);
			}
			
			;
			
			
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCuentaContaDetaGrupoActi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContaDetaGrupoActiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontadetagrupoacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontadetagrupoacti);
				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
				
				


				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaDetaGrupoActi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaDetaGrupoActi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CuentaContaDetaGrupoActi cuentacontadetagrupoactiLocal=null;
			
			if(!this.getEsControlTabla()) {
				cuentacontadetagrupoactiLocal=this.cuentacontadetagrupoacti;
			} else {
				cuentacontadetagrupoactiLocal=this.cuentacontadetagrupoactiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontadetagrupoacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontadetagrupoacti);
				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
							
				
				


				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaDetaGrupoActi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaDetaGrupoActi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContaDetaGrupoActiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoactiAnterior =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontadetagrupoactiAnterior =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
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
			
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
			
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
			
			


			
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContaDetaGrupoActiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontadetagrupoacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontadetagrupoacti);
				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
								
						
				


				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaDetaGrupoActi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaDetaGrupoActi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontadetagrupoacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontadetagrupoacti);
				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
								
				
				


				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaDetaGrupoActi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaDetaGrupoActi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContaDetaGrupoActiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoactiAnterior =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontadetagrupoactiAnterior =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontadetagrupoacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontadetagrupoacti);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContaDetaGrupoActiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoactiAnterior =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontadetagrupoactiAnterior =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContaDetaGrupoActiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontadetagrupoacti);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentacontadetagrupoacti);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontadetagrupoacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontadetagrupoacti);
				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
							
				
				


				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaDetaGrupoActi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaDetaGrupoActi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContaDetaGrupoActiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontadetagrupoactiAnterior =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cuentacontadetagrupoactiAnterior =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
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
			
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
			
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
			
			


			
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContaDetaGrupoActiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontadetagrupoacti);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentacontadetagrupoacti);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontadetagrupoacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontadetagrupoacti);
				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
								
				
				


				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaDetaGrupoActi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaDetaGrupoActi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContaDetaGrupoActiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoactiAnterior =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontadetagrupoactiAnterior =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContaDetaGrupoActiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontadetagrupoacti);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentacontadetagrupoacti);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContaDetaGrupoActiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontadetagrupoacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontadetagrupoacti);
				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCuentaContaDetaGrupoActi")) {
					jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCuentaContaDetaGrupoActi")) {
					jCheckBoxSeleccionadosCuentaContaDetaGrupoActiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCuentaContaDetaGrupoActi")) {
					
				}
				
				


				
				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaDetaGrupoActi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaDetaGrupoActi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontadetagrupoacti);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cuentacontadetagrupoacti);
				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
												
				
				


				
				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaDetaGrupoActi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaDetaGrupoActi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContaDetaGrupoActiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontadetagrupoactiAnterior =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cuentacontadetagrupoactiAnterior =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContaDetaGrupoActiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontadetagrupoacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontadetagrupoacti);
				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
				
				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
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
			
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
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
			
			


			
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContaDetaGrupoActiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontadetagrupoacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontadetagrupoacti);
				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaDetaGrupoActi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaDetaGrupoActi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontadetagrupoacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontadetagrupoacti);
				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
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
				
				


				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaDetaGrupoActi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaDetaGrupoActi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContaDetaGrupoActiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontadetagrupoactiAnterior =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontadetagrupoactiAnterior =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCuentaContaDetaGrupoActi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCuentaContaDetaGrupoActiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cuentacontadetagrupoacti =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cuentacontadetagrupoacti);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCuentaContaDetaGrupoActi")) {
				
				}
				
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCuentaContaDetaGrupoActi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCuentaContaDetaGrupoActi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCuentaContaDetaGrupoActi")) {
			
			}
			
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCuentaContaDetaGrupoActi();
			
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
			
			if(sTipo.equals("NuevoCuentaContaDetaGrupoActi")) {
				jButtonNuevoCuentaContaDetaGrupoActiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCuentaContaDetaGrupoActi")) {
				jButtonDuplicarCuentaContaDetaGrupoActiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCuentaContaDetaGrupoActi")) {
				jButtonCopiarCuentaContaDetaGrupoActiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCuentaContaDetaGrupoActi")) {
				jButtonVerFormCuentaContaDetaGrupoActiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCuentaContaDetaGrupoActi")) {
				jButtonNuevoCuentaContaDetaGrupoActiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCuentaContaDetaGrupoActi")) {
				jButtonModificarCuentaContaDetaGrupoActiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCuentaContaDetaGrupoActi")) {
				jButtonActualizarCuentaContaDetaGrupoActiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCuentaContaDetaGrupoActi")) {
				jButtonEliminarCuentaContaDetaGrupoActiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCuentaContaDetaGrupoActi")) {
				jButtonGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCuentaContaDetaGrupoActi")) {
				jButtonCancelarCuentaContaDetaGrupoActiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCuentaContaDetaGrupoActi")) {
				jButtonCerrarCuentaContaDetaGrupoActiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCuentaContaDetaGrupoActi")) {
				jButtonGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCuentaContaDetaGrupoActi")) {
				jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCuentaContaDetaGrupoActi")) {
				jButtonAbrirOrderByCuentaContaDetaGrupoActiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCuentaContaDetaGrupoActi")) {
				jButtonRecargarInformacionCuentaContaDetaGrupoActiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCuentaContaDetaGrupoActi")) {
				jButtonAnterioresCuentaContaDetaGrupoActiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCuentaContaDetaGrupoActi")) {
				jButtonSiguientesCuentaContaDetaGrupoActiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCuentaContaDetaGrupoActiBusqueda")) {
				this.jButtonidCuentaContaDetaGrupoActiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaContaDetaGrupoActi")) {
				this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaContaDetaGrupoActiArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaContaDetaGrupoActiUpdate")) {
				this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaContaDetaGrupoActiBusqueda")) {
				this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate")) {
				this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda")) {
				this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusquedaActionPerformed(evt);
			}
			
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCuentaContaDetaGrupoActi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCuentaContaDetaGrupoActi")) {
				closingInternalFrameCuentaContaDetaGrupoActi();
				
			} else if(sTipo.equals("jButtonCancelarCuentaContaDetaGrupoActi")) {
				JInternalFrameBase jInternalFrameDetalleFormCuentaContaDetaGrupoActi = (JInternalFrameBase)evt.getSource();
	            	
	            CuentaContaDetaGrupoActiBeanSwingJInternalFrame jInternalFrameParent=(CuentaContaDetaGrupoActiBeanSwingJInternalFrame)jInternalFrameDetalleFormCuentaContaDetaGrupoActi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCuentaContaDetaGrupoActiActionPerformed(null);
			}
			
			CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cuentacontadetagrupoacti,new Object(),this.cuentacontadetagrupoactiParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCuentaContaDetaGrupoActi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCuentaContaDetaGrupoActi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCuentaContaDetaGrupoActi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cuentacontadetagrupoacti)) {
			if(!esControlTabla) {
				if(CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);			
				}
				
				if(this.cuentacontadetagrupoactiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cuentacontadetagrupoactiReturnGeneral=cuentacontadetagrupoactiLogic.procesarEventosCuentaContaDetaGrupoActisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis(),this.cuentacontadetagrupoacti,this.cuentacontadetagrupoactiParameterGeneral,this.isEsNuevoCuentaContaDetaGrupoActi,classes);//this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCuentaContaDetaGrupoActi(this.cuentacontadetagrupoactiReturnGeneral,this.cuentacontadetagrupoactiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cuentacontadetagrupoactiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCuentaContaDetaGrupoActi(classes,this.cuentacontadetagrupoactiReturnGeneral,this.cuentacontadetagrupoactiBean,false);
					}
						
					if(this.cuentacontadetagrupoactiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCuentaContaDetaGrupoActi(this.cuentacontadetagrupoactiReturnGeneral.getCuentaContaDetaGrupoActi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCuentaContaDetaGrupoActi(this.cuentacontadetagrupoactiReturnGeneral.getCuentaContaDetaGrupoActi());	
					}
						
					if(this.cuentacontadetagrupoactiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCuentaContaDetaGrupoActi(this.cuentacontadetagrupoactiReturnGeneral.getCuentaContaDetaGrupoActi(),classes);//this.cuentacontadetagrupoactiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti,classes);//this.cuentacontadetagrupoactiBean);									
				}
			
				if(CuentaContaDetaGrupoActiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaDetaGrupoActi(this.cuentacontadetagrupoacti);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cuentacontadetagrupoactiAnterior!=null) {
						this.cuentacontadetagrupoacti=this.cuentacontadetagrupoactiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cuentacontadetagrupoactiReturnGeneral=cuentacontadetagrupoactiLogic.procesarEventosCuentaContaDetaGrupoActisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis(),this.cuentacontadetagrupoacti,this.cuentacontadetagrupoactiParameterGeneral,this.isEsNuevoCuentaContaDetaGrupoActi,classes);//this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cuentacontadetagrupoactiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cuentacontadetagrupoactiReturnGeneral.getCuentaContaDetaGrupoActi(),cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cuentacontadetagrupoactiReturnGeneral.getCuentaContaDetaGrupoActi(),this.cuentacontadetagrupoactis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCuentaContaDetaGrupoActi.repaint();
				
				//((AbstractTableModel) this.jTableDatosCuentaContaDetaGrupoActi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCuentaContaDetaGrupoActi();
			}
		}
	}
	
	public void actualizarVisualTableDatosCuentaContaDetaGrupoActi() throws Exception {
		
		CuentaContaDetaGrupoActiModel cuentacontadetagrupoactiModel=(CuentaContaDetaGrupoActiModel)this.jTableDatosCuentaContaDetaGrupoActi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentacontadetagrupoactiModel.cuentacontadetagrupoactis=this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cuentacontadetagrupoactiModel.cuentacontadetagrupoactis=this.cuentacontadetagrupoactis;
		}
		
		
		((CuentaContaDetaGrupoActiModel) this.jTableDatosCuentaContaDetaGrupoActi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCuentaContaDetaGrupoActi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcuentacontadetagrupoactiAnterior(),this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcuentacontadetagrupoactiAnterior(),this.cuentacontadetagrupoactis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCuentaContaDetaGrupoActi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoacti,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
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
										
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentacontadetagrupoacti,new Object(),generalEntityParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CuentaContaDetaGrupoActiConstantesFunciones.getClassesRelationshipsOfCuentaContaDetaGrupoActi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CuentaContaDetaGrupoActiConstantesFunciones.getClassesRelationshipsFromStringsOfCuentaContaDetaGrupoActi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCuentaContaDetaGrupoActi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentacontadetagrupoacti,new Object(),generalEntityParameterGeneral,this.cuentacontadetagrupoactiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActiBean cuentacontadetagrupoactiBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCuentaContaDetaGrupoActi(ArrayList<Classe> classes,CuentaContaDetaGrupoActiReturnGeneral cuentacontadetagrupoactiReturnGeneral,CuentaContaDetaGrupoActiBean cuentacontadetagrupoactiBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoacti,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cuentacontadetagrupoacti)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi = new CuentaContaDetaGrupoActiDetalleFormJInternalFrame(jDesktopPane,this.cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones(),this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi);
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.setVisible(false);
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.setSelected(false);						
		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.cuentacontadetagrupoactiLogic=this.cuentacontadetagrupoactiLogic;
		
		this.cargarCombosFrameForeignKeyCuentaContaDetaGrupoActi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCuentaContaDetaGrupoActi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCuentaContaDetaGrupoActi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCuentaContaDetaGrupoActi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCuentaContaDetaGrupoActi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCuentaContaDetaGrupoActi"));
		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonModificarCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"ModificarCuentaContaDetaGrupoActi"));

		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonModificarToolBarCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"ModificarToolBarCuentaContaDetaGrupoActi"));
					
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jMenuItemModificarCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"MenuItemModificarCuentaContaDetaGrupoActi"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonActualizarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"ActualizarCuentaContaDetaGrupoActi"));
		
		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonActualizarToolBarCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCuentaContaDetaGrupoActi"));
						
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jMenuItemActualizarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCuentaContaDetaGrupoActi"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonEliminarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"EliminarCuentaContaDetaGrupoActi"));
		
		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonEliminarToolBarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"EliminarToolBarCuentaContaDetaGrupoActi"));
								
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jMenuItemEliminarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCuentaContaDetaGrupoActi"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonCancelarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"CancelarCuentaContaDetaGrupoActi"));
		
		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonCancelarToolBarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"CancelarToolBarCuentaContaDetaGrupoActi"));
					
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jMenuItemCancelarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCuentaContaDetaGrupoActi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jMenuItemDetalleCerrarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCuentaContaDetaGrupoActi"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonGuardarCambiosToolBarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaContaDetaGrupoActi"));
		
		
		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonGuardarCambiosToolBarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaContaDetaGrupoActi"));
		
		
		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCuentaContaDetaGrupoActi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonidCuentaContaDetaGrupoActiBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaContaDetaGrupoActiBusqueda"));
		//jButtonid_cuenta_contableCuentaContaDetaGrupoActi.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableCuentaContaDetaGrupoActiActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_cuenta_contableCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaDetaGrupoActi"));
		//jButtonid_cuenta_contableCuentaContaDetaGrupoActiArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_cuenta_contableCuentaContaDetaGrupoActiArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaDetaGrupoActiArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_cuenta_contableCuentaContaDetaGrupoActiUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaDetaGrupoActiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_cuenta_contableCuentaContaDetaGrupoActiBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaDetaGrupoActiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jTabbedPaneRelacionesCuentaContaDetaGrupoActi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCuentaContaDetaGrupoActi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCuentaContaDetaGrupoActi"));
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCuentaContaDetaGrupoActi"));
		}
		
		this.jTableDatosCuentaContaDetaGrupoActi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCuentaContaDetaGrupoActi"));
		
		this.jTableDatosCuentaContaDetaGrupoActi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCuentaContaDetaGrupoActi"));
		
		this.jButtonNuevoCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"NuevoCuentaContaDetaGrupoActi"));
		
		this.jButtonDuplicarCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"DuplicarCuentaContaDetaGrupoActi"));
		
		this.jButtonCopiarCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"CopiarCuentaContaDetaGrupoActi"));
		
		this.jButtonVerFormCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"VerFormCuentaContaDetaGrupoActi"));
		
		
		this.jButtonNuevoToolBarCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"NuevoToolBarCuentaContaDetaGrupoActi"));
			
		this.jButtonDuplicarToolBarCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCuentaContaDetaGrupoActi"));
			
		this.jMenuItemNuevoCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCuentaContaDetaGrupoActi"));
			
		this.jMenuItemDuplicarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCuentaContaDetaGrupoActi"));		
		
		
		this.jButtonNuevoRelacionesCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCuentaContaDetaGrupoActi"));
		
		
		this.jButtonNuevoRelacionesToolBarCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCuentaContaDetaGrupoActi"));
			
		this.jMenuItemNuevoRelacionesCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCuentaContaDetaGrupoActi"));		
		
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonModificarCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"ModificarCuentaContaDetaGrupoActi"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonModificarToolBarCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"ModificarToolBarCuentaContaDetaGrupoActi"));
			
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jMenuItemModificarCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"MenuItemModificarCuentaContaDetaGrupoActi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonActualizarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"ActualizarCuentaContaDetaGrupoActi"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonActualizarToolBarCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCuentaContaDetaGrupoActi"));
				
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jMenuItemActualizarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCuentaContaDetaGrupoActi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonEliminarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"EliminarCuentaContaDetaGrupoActi"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonEliminarToolBarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"EliminarToolBarCuentaContaDetaGrupoActi"));
						
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jMenuItemEliminarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCuentaContaDetaGrupoActi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonCancelarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"CancelarCuentaContaDetaGrupoActi"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonCancelarToolBarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"CancelarToolBarCuentaContaDetaGrupoActi"));
			
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jMenuItemCancelarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCuentaContaDetaGrupoActi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCuentaContaDetaGrupoActi"));		
		
		
		this.jButtonCerrarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"CerrarCuentaContaDetaGrupoActi"));
		
		
		this.jButtonCerrarToolBarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"CerrarToolBarCuentaContaDetaGrupoActi"));
			
		this.jMenuItemCerrarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCuentaContaDetaGrupoActi"));
			
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jMenuItemDetalleCerrarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCuentaContaDetaGrupoActi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonGuardarCambiosCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"GuardarCambiosCuentaContaDetaGrupoActi"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonGuardarCambiosToolBarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaContaDetaGrupoActi"));
		}
		
		this.jButtonCopiarToolBarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"CopiarToolBarCuentaContaDetaGrupoActi"));
			
		this.jButtonVerFormToolBarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"VerFormToolBarCuentaContaDetaGrupoActi"));
		
		this.jMenuItemGuardarCambiosCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCuentaContaDetaGrupoActi"));
			
		this.jMenuItemCopiarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCuentaContaDetaGrupoActi"));		
		
		this.jMenuItemVerFormCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCuentaContaDetaGrupoActi"));		
		
		
		this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCuentaContaDetaGrupoActi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCuentaContaDetaGrupoActi"));
			
		this.jMenuItemGuardarCambiosTablaCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCuentaContaDetaGrupoActi"));		
		
		
		
		this.jButtonRecargarInformacionCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"RecargarInformacionCuentaContaDetaGrupoActi"));
					
		this.jButtonRecargarInformacionToolBarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCuentaContaDetaGrupoActi"));
		
		this.jMenuItemRecargarInformacionCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCuentaContaDetaGrupoActi"));		
		
		
		
		this.jButtonAnterioresCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"AnterioresCuentaContaDetaGrupoActi"));
		
		
		this.jButtonAnterioresToolBarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCuentaContaDetaGrupoActi"));
		
		this.jMenuItemAnterioresCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCuentaContaDetaGrupoActi"));		
		
		
		this.jButtonSiguientesCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"SiguientesCuentaContaDetaGrupoActi"));
		
		
		this.jButtonSiguientesToolBarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCuentaContaDetaGrupoActi"));
			
		this.jMenuItemSiguientesCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCuentaContaDetaGrupoActi"));
			
		this.jMenuItemAbrirOrderByCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCuentaContaDetaGrupoActi"));
			
		this.jMenuItemMostrarOcultarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCuentaContaDetaGrupoActi"));
			
		this.jMenuItemDetalleAbrirOrderByCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCuentaContaDetaGrupoActi"));
			
		this.jMenuItemDetalleMostarOcultarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCuentaContaDetaGrupoActi"));		
		
		
		this.jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCuentaContaDetaGrupoActi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCuentaContaDetaGrupoActi"));
			
		this.jMenuItemNuevoGuardarCambiosCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCuentaContaDetaGrupoActi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCuentaContaDetaGrupoActi"));

		this.jCheckBoxSeleccionadosCuentaContaDetaGrupoActi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCuentaContaDetaGrupoActi"));
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCuentaContaDetaGrupoActi"));
		}
		
		
		this.jComboBoxTiposRelacionesCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"TiposRelacionesCuentaContaDetaGrupoActi"));
			
		this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"TiposAccionesCuentaContaDetaGrupoActi"));
					
		this.jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCuentaContaDetaGrupoActi"));
			
		this.jTextFieldValorCampoGeneralCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCuentaContaDetaGrupoActi"));		
		
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonidCuentaContaDetaGrupoActiBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaContaDetaGrupoActiBusqueda"));
		//jButtonid_cuenta_contableCuentaContaDetaGrupoActi.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableCuentaContaDetaGrupoActiActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_cuenta_contableCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaDetaGrupoActi"));
		//jButtonid_cuenta_contableCuentaContaDetaGrupoActiArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_cuenta_contableCuentaContaDetaGrupoActiArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaDetaGrupoActiArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_cuenta_contableCuentaContaDetaGrupoActiUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaDetaGrupoActiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_cuenta_contableCuentaContaDetaGrupoActiBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaDetaGrupoActiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCuentaContableCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCuentaContaDetaGrupoActi"));

			this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaDetaGrupoActi"));

			this.jButtonFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"FK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi!=null) {
				this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaContaDetaGrupoActi"));
				this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaContaDetaGrupoActi"));
				this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaContaDetaGrupoActi"));
			}
			
			//this.jButtonCerrarReporteDinamicoCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaContaDetaGrupoActi"));				
			//this.jButtonGenerarReporteDinamicoCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaContaDetaGrupoActi"));
			//this.jButtonGenerarExcelReporteDinamicoCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaContaDetaGrupoActi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCuentaContaDetaGrupoActi!=null) {
				this.jInternalFrameImportacionCuentaContaDetaGrupoActi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCuentaContaDetaGrupoActi"));
				this.jInternalFrameImportacionCuentaContaDetaGrupoActi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCuentaContaDetaGrupoActi"));
				this.jInternalFrameImportacionCuentaContaDetaGrupoActi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCuentaContaDetaGrupoActi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"AbrirOrderByCuentaContaDetaGrupoActi"));
			
			this.jButtonAbrirOrderByToolBarCuentaContaDetaGrupoActi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCuentaContaDetaGrupoActi"));			
			
			if(this.jInternalFrameOrderByCuentaContaDetaGrupoActi!=null) {
				this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCuentaContaDetaGrupoActi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jTabbedPaneRelacionesCuentaContaDetaGrupoActi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCuentaContaDetaGrupoActi"));
		
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
            		closingInternalFrameCuentaContaDetaGrupoActi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCuentaContaDetaGrupoActi = (JInternalFrameBase)event.getSource();
	            	
	            CuentaContaDetaGrupoActiBeanSwingJInternalFrame jInternalFrameParent=(CuentaContaDetaGrupoActiBeanSwingJInternalFrame)jInternalFrameDetalleFormCuentaContaDetaGrupoActi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCuentaContaDetaGrupoActiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCuentaContaDetaGrupoActi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCuentaContaDetaGrupoActiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCuentaContaDetaGrupoActi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCuentaContaDetaGrupoActi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaContaDetaGrupoActiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaContaDetaGrupoActiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaContaDetaGrupoActiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCuentaContaDetaGrupoActi";
		inputMap = this.jButtonNuevoCuentaContaDetaGrupoActi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCuentaContaDetaGrupoActi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCuentaContaDetaGrupoActiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaContaDetaGrupoActiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaContaDetaGrupoActiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaContaDetaGrupoActiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCuentaContaDetaGrupoActi";
		inputMap = this.jButtonNuevoRelacionesCuentaContaDetaGrupoActi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCuentaContaDetaGrupoActi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCuentaContaDetaGrupoActiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCuentaContaDetaGrupoActi";
		inputMap = this.jButtonModificarCuentaContaDetaGrupoActi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCuentaContaDetaGrupoActi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCuentaContaDetaGrupoActiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCuentaContaDetaGrupoActi";
		inputMap = this.jButtonActualizarCuentaContaDetaGrupoActi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCuentaContaDetaGrupoActi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCuentaContaDetaGrupoActiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCuentaContaDetaGrupoActi";
		inputMap = this.jButtonEliminarCuentaContaDetaGrupoActi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCuentaContaDetaGrupoActi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCuentaContaDetaGrupoActiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCuentaContaDetaGrupoActi";
		inputMap = this.jButtonCancelarCuentaContaDetaGrupoActi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCuentaContaDetaGrupoActi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCuentaContaDetaGrupoActiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCuentaContaDetaGrupoActi";
		inputMap = this.jButtonCerrarCuentaContaDetaGrupoActi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCuentaContaDetaGrupoActi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCuentaContaDetaGrupoActiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonGuardarCambiosCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCuentaContaDetaGrupoActi";
		inputMap = this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonGuardarCambiosCuentaContaDetaGrupoActi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonGuardarCambiosCuentaContaDetaGrupoActi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCuentaContaDetaGrupoActiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCuentaContaDetaGrupoActiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCuentaContaDetaGrupoActi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCuentaContaDetaGrupoActiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonidCuentaContaDetaGrupoActiBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaContaDetaGrupoActiBusqueda"));
		//jButtonid_cuenta_contableCuentaContaDetaGrupoActi.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableCuentaContaDetaGrupoActiActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_cuenta_contableCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaDetaGrupoActi"));
		//jButtonid_cuenta_contableCuentaContaDetaGrupoActiArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_cuenta_contableCuentaContaDetaGrupoActiArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaDetaGrupoActiArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_cuenta_contableCuentaContaDetaGrupoActiUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaDetaGrupoActiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_cuenta_contableCuentaContaDetaGrupoActiBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaDetaGrupoActiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda"));
		
		
		this.jButtonFK_IdCuentaContableCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCuentaContaDetaGrupoActi"));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaDetaGrupoActi"));

		this.jButtonFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.addActionListener(new ButtonActionListener(this,"FK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCuentaContaDetaGrupoActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCuentaContaDetaGrupoActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCuentaContaDetaGrupoActiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCuentaContaDetaGrupoActi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis()) {
					cuentacontadetagrupoactiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:cuentacontadetagrupoactis) {
					cuentacontadetagrupoactiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis()) {
						cuentacontadetagrupoactiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:cuentacontadetagrupoactis) {
						cuentacontadetagrupoactiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:cuentacontadetagrupoactis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCuentaContaDetaGrupoActi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCuentaContaDetaGrupoActi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCuentaContaDetaGrupoActi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCuentaContaDetaGrupoActiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCuentaContaDetaGrupoActi.getSelectedRows();
			
			CuentaContaDetaGrupoActi cuentacontadetagrupoactiLocal=new CuentaContaDetaGrupoActi();
			
			//this.seleccionarTodosCuentaContaDetaGrupoActi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontadetagrupoactiLocal =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cuentacontadetagrupoactiLocal =(CuentaContaDetaGrupoActi) this.cuentacontadetagrupoactis.toArray()[this.jTableDatosCuentaContaDetaGrupoActi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cuentacontadetagrupoactiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis()) {
						cuentacontadetagrupoactiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:cuentacontadetagrupoactis) {
						cuentacontadetagrupoactiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCuentaContaDetaGrupoActi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCuentaContaDetaGrupoActi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCuentaContaDetaGrupoActi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCuentaContaDetaGrupoActiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCuentaContaDetaGrupoActiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCuentaContaDetaGrupoActiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCuentaContaDetaGrupoActi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:cuentacontadetagrupoactis) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCuentaContaDetaGrupoActiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCuentaContaDetaGrupoActi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCuentaContaDetaGrupoActi) {				
					conSplash=true;//false;										
					
					//this.startProcessCuentaContaDetaGrupoActi(conSplash);
				
					this.generarReporteCuentaContaDetaGrupoActisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCuentaContaDetaGrupoActisSeleccionados();
				//this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCuentaContaDetaGrupoActisSeleccionados(false);
				//this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCuentaContaDetaGrupoActisSeleccionados(true);
				//this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCuentaContaDetaGrupoActi();
				
				this.exportarCuentaContaDetaGrupoActisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCuentaContaDetaGrupoActis();
				//this.importarCuentaContaDetaGrupoActis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCuentaContaDetaGrupoActi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCuentaContaDetaGrupoActisSeleccionados();
				//this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cuenta Conta Deta Grupo Acti", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCuentaContaDetaGrupoActi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCuentaContaDetaGrupoActi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCuentaContaDetaGrupoActi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cuenta Conta Deta Grupo Acti",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.setSelectedIndex(0);					
				}	
			} 			
			else if(CuentaContaDetaGrupoActiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCuentaContaDetaGrupoActi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCuentaContaDetaGrupoActi(conSplash);
					
						//this.actualizarParametrosGeneralCuentaContaDetaGrupoActi();
						
						this.generarReporteProcesoAccionCuentaContaDetaGrupoActisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cuenta Conta Deta Grupo ActiS SELECCIONADOS?", "MANTENIMIENTO DE Cuenta Conta Deta Grupo Acti", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCuentaContaDetaGrupoActi();
				
						this.actualizarParametrosGeneralCuentaContaDetaGrupoActi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cuentacontadetagrupoactiReturnGeneral=cuentacontadetagrupoactiLogic.procesarAccionCuentaContaDetaGrupoActisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis(),this.cuentacontadetagrupoactiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCuentaContaDetaGrupoActiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCuentaContaDetaGrupoActi();
					
					CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCuentaContaDetaGrupoActiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCuentaContaDetaGrupoActi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCuentaContaDetaGrupoActiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCuentaContaDetaGrupoActi();
			
			if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisSeleccionados=new ArrayList<CuentaContaDetaGrupoActi>();		
			CuentaContaDetaGrupoActi cuentacontadetagrupoacti=new CuentaContaDetaGrupoActi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCuentaContaDetaGrupoActi.getSelectedItem();
			
			
			
			
			cuentacontadetagrupoactisSeleccionados=this.getCuentaContaDetaGrupoActisSeleccionados(true);
			//this.sTipoAccion;
			
			if(cuentacontadetagrupoactisSeleccionados.size()==1) {
				for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:cuentacontadetagrupoactisSeleccionados) {
					cuentacontadetagrupoacti=cuentacontadetagrupoactiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCuentaContaDetaGrupoActi();
			
      		//this.finishProcessCuentaContaDetaGrupoActi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCuentaContaDetaGrupoActiReturnGeneral() throws Exception {
		if(this.cuentacontadetagrupoactiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cuentacontadetagrupoactiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cuentacontadetagrupoactiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cuentacontadetagrupoactiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cuentacontadetagrupoactiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cuentacontadetagrupoactiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false);
		}
		
		if(this.cuentacontadetagrupoactiReturnGeneral.getConRetornoLista() || this.cuentacontadetagrupoactiReturnGeneral.getConRetornoObjeto()) {
			if(this.cuentacontadetagrupoactiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cuentacontadetagrupoactiLogic.setCuentaContaDetaGrupoActis(this.cuentacontadetagrupoactiReturnGeneral.getCuentaContaDetaGrupoActis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cuentacontadetagrupoactiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cuentacontadetagrupoactiLogic.setCuentaContaDetaGrupoActi(this.cuentacontadetagrupoactiReturnGeneral.getCuentaContaDetaGrupoActi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCuentaContaDetaGrupoActi(false);
		}
	}
	
	public void actualizarParametrosGeneralCuentaContaDetaGrupoActi() throws Exception {
		
		
	}
	
	public ArrayList<CuentaContaDetaGrupoActi> getCuentaContaDetaGrupoActisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisSeleccionados=new ArrayList<CuentaContaDetaGrupoActi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCuentaContaDetaGrupoActi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis()) {
					if(cuentacontadetagrupoactiAux.getIsSelected()) {
						cuentacontadetagrupoactisSeleccionados.add(cuentacontadetagrupoactiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:this.cuentacontadetagrupoactis) {
					if(cuentacontadetagrupoactiAux.getIsSelected()) {
						cuentacontadetagrupoactisSeleccionados.add(cuentacontadetagrupoactiAux);				
					}
				}
			}
			
			if(cuentacontadetagrupoactisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cuentacontadetagrupoactisSeleccionados.addAll(this.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cuentacontadetagrupoactisSeleccionados.addAll(this.cuentacontadetagrupoactis);				
					}
				}
			}
		} else {
			cuentacontadetagrupoactisSeleccionados.add(this.cuentacontadetagrupoacti);
		}
		
		return cuentacontadetagrupoactisSeleccionados;
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
	
	public void generarReporteCuentaContaDetaGrupoActisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCuentaContaDetaGrupoActisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCuentaContaDetaGrupoActisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCuentaContaDetaGrupoActisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCuentaContaDetaGrupoActisSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cuenta Conta Deta Grupo Acti",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCuentaContaDetaGrupoActisSeleccionados() throws Exception {
		ArrayList<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisSeleccionados=new ArrayList<CuentaContaDetaGrupoActi>();		
		
		cuentacontadetagrupoactisSeleccionados=this.getCuentaContaDetaGrupoActisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCuentaContaDetaGrupoActis("Todos",cuentacontadetagrupoactisSeleccionados);
		
	}	
	
	public void generarReporteNormalCuentaContaDetaGrupoActisSeleccionados() throws Exception {
		ArrayList<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisSeleccionados=new ArrayList<CuentaContaDetaGrupoActi>();		
		
		cuentacontadetagrupoactisSeleccionados=this.getCuentaContaDetaGrupoActisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCuentaContaDetaGrupoActis("Todos",cuentacontadetagrupoactisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCuentaContaDetaGrupoActisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisSeleccionados=new ArrayList<CuentaContaDetaGrupoActi>();
		
		cuentacontadetagrupoactisSeleccionados=this.getCuentaContaDetaGrupoActisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCuentaContaDetaGrupoActis("Todos",cuentacontadetagrupoactisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCuentaContaDetaGrupoActisSeleccionados() throws Exception {
		ArrayList<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisSeleccionados=new ArrayList<CuentaContaDetaGrupoActi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCuentaContaDetaGrupoActi();
		
		
		cuentacontadetagrupoactisSeleccionados=this.getCuentaContaDetaGrupoActisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCuentaContaDetaGrupoActi();
		
		
		//this.generarReporteCuentaContaDetaGrupoActis("Todos",cuentacontadetagrupoactisSeleccionados ,cuentacontadetagrupoactiImplementable,cuentacontadetagrupoactiImplementableHome);
	}
	
	public void mostrarImportacionCuentaContaDetaGrupoActis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCuentaContaDetaGrupoActi();
		
		this.abrirFrameImportacionCuentaContaDetaGrupoActi();		
		
			
		//this.generarReporteCuentaContaDetaGrupoActis("Todos",cuentacontadetagrupoactisSeleccionados ,cuentacontadetagrupoactiImplementable,cuentacontadetagrupoactiImplementableHome);
	}
	
	public void importarCuentaContaDetaGrupoActis() throws Exception {		
	
	}
	
	public void exportarCuentaContaDetaGrupoActisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCuentaContaDetaGrupoActisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCuentaContaDetaGrupoActisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCuentaContaDetaGrupoActisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cuenta Conta Deta Grupo Acti",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCuentaContaDetaGrupoActisSeleccionados() throws Exception {
		ArrayList<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisSeleccionados=new ArrayList<CuentaContaDetaGrupoActi>();		
		
		cuentacontadetagrupoactisSeleccionados=this.getCuentaContaDetaGrupoActisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontadetagrupoacti."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCuentaContaDetaGrupoActi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:cuentacontadetagrupoactisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCuentaContaDetaGrupoActi(cuentacontadetagrupoactiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cuentacontadetagrupoactiAux.setsDetalleGeneralEntityReporte(cuentacontadetagrupoactiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Conta Deta Grupo Acti",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCuentaContaDetaGrupoActi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CuentaContaDetaGrupoActiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaContaDetaGrupoActiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoacti,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cuentacontadetagrupoacti.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacontadetagrupoacti.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacontadetagrupoacti.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacontadetagrupoacti.getdetallegrupoactivofijo_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCuentaContaDetaGrupoActisSeleccionados() throws Exception {
		ArrayList<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisSeleccionados=new ArrayList<CuentaContaDetaGrupoActi>();		
		
		cuentacontadetagrupoactisSeleccionados=this.getCuentaContaDetaGrupoActisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontadetagrupoacti.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CuentaContaDetaGrupoActis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCuentaContaDetaGrupoActi(row);				
				iRow++;
			}				
			
			for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:cuentacontadetagrupoactisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCuentaContaDetaGrupoActi(cuentacontadetagrupoactiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Conta Deta Grupo Acti",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCuentaContaDetaGrupoActisSeleccionados() throws Exception {
		ArrayList<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisSeleccionados=new ArrayList<CuentaContaDetaGrupoActi>();		
		
		cuentacontadetagrupoactisSeleccionados=this.getCuentaContaDetaGrupoActisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontadetagrupoacti.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cuentacontadetagrupoactis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cuentacontadetagrupoacti");
			//elementRoot.appendChild(element);
		
			for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:cuentacontadetagrupoactisSeleccionados) {
				element = document.createElement("cuentacontadetagrupoacti");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCuentaContaDetaGrupoActi(cuentacontadetagrupoactiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Conta Deta Grupo Acti",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCuentaContaDetaGrupoActi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContaDetaGrupoActiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContaDetaGrupoActiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoacti,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacontadetagrupoacti.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacontadetagrupoacti.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacontadetagrupoacti.getdetallegrupoactivofijo_descripcion());				
	}
	
	public void setFilaDatosExportarXmlCuentaContaDetaGrupoActi(CuentaContaDetaGrupoActi cuentacontadetagrupoacti,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CuentaContaDetaGrupoActiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cuentacontadetagrupoacti.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CuentaContaDetaGrupoActiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cuentacontadetagrupoacti.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcuentacontable_descripcion = document.createElement(CuentaContaDetaGrupoActiConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(cuentacontadetagrupoacti.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementdetallegrupoactivofijo_descripcion = document.createElement(CuentaContaDetaGrupoActiConstantesFunciones.IDDETALLEGRUPOACTIVOFIJO);
		elementdetallegrupoactivofijo_descripcion.appendChild(document.createTextNode(cuentacontadetagrupoacti.getdetallegrupoactivofijo_descripcion()));
		element.appendChild(elementdetallegrupoactivofijo_descripcion);
	}
	
	public void generarReporteGroupGenericoCuentaContaDetaGrupoActisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisSeleccionados=new ArrayList<CuentaContaDetaGrupoActi>();
		
		cuentacontadetagrupoactisSeleccionados=this.getCuentaContaDetaGrupoActisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCuentaContaDetaGrupoActi(cuentacontadetagrupoactisSeleccionados);
		
		this.generarReporteCuentaContaDetaGrupoActis("Todos",cuentacontadetagrupoactisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCuentaContaDetaGrupoActi(ArrayList<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CuentaContaDetaGrupoActi cuentacontadetagrupoactiAux:cuentacontadetagrupoactisSeleccionados) {
				cuentacontadetagrupoactiAux.setsDetalleGeneralEntityReporte(cuentacontadetagrupoactiAux.toString());
			
				if(sTipoSeleccionar.equals(CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					cuentacontadetagrupoactiAux.setsDescripcionGeneralEntityReporte1(cuentacontadetagrupoactiAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO)) {
					existe=true;
					cuentacontadetagrupoactiAux.setsDescripcionGeneralEntityReporte1(cuentacontadetagrupoactiAux.getdetallegrupoactivofijo_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCuentaContaDetaGrupoActi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi=true;
				this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi=true;
				this.isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi=true;
			}
			
			this.isVisibilidadCeldaModificarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaModificarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi=true;
			this.isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaModificarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi=true;
			this.isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi=true;
			this.isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaModificarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi=true;
			this.isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi=true;
			this.isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi=true;
			this.isVisibilidadCeldaModificarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaModificarCuentaContaDetaGrupoActi=true;
			this.isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaCancelarCuentaContaDetaGrupoActi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContaDetaGrupoActi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CuentaContaDetaGrupoActiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi=true;
			this.isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi=true;
		} else {
			this.actualizarEstadoPanelsCuentaContaDetaGrupoActi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCuentaContaDetaGrupoActi=false;
			//this.isVisibilidadCeldaVerFormCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaDuplicarCuentaContaDetaGrupoActi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi=false;
		} else {
			this.isVisibilidadCeldaNuevoCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContaDetaGrupoActi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
			if(!cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi=false;												
			}
			
			this.jButtonCerrarCuentaContaDetaGrupoActi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaDetaGrupoActi=false;
		}
		
		if(!this.permiteMantenimiento(this.cuentacontadetagrupoacti)) {
			this.isVisibilidadCeldaActualizarCuentaContaDetaGrupoActi=false;
			this.isVisibilidadCeldaEliminarCuentaContaDetaGrupoActi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCuentaContaDetaGrupoActi() {
	}
	
	public void actualizarEstadoPanelsCuentaContaDetaGrupoActi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi!=null) {
				this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi!=null) {
				this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaContaDetaGrupoActi!=null) {
				this.jScrollPanelDatosCuentaContaDetaGrupoActi.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaContaDetaGrupoActi!=null) {
				this.jPanelPaginacionCuentaContaDetaGrupoActi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaContaDetaGrupoActi!=null) {
				this.jPanelParametrosReportesCuentaContaDetaGrupoActi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi!=null) {
				this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi!=null) {
				this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCuentaContaDetaGrupoActi!=null) {
				this.jScrollPanelDatosCuentaContaDetaGrupoActi.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaContaDetaGrupoActi!=null) {
				this.jPanelPaginacionCuentaContaDetaGrupoActi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaContaDetaGrupoActi!=null) {
				this.jPanelParametrosReportesCuentaContaDetaGrupoActi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi!=null) {
				this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi!=null) {
				this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCuentaContaDetaGrupoActi!=null) {
				this.jScrollPanelDatosCuentaContaDetaGrupoActi.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaContaDetaGrupoActi!=null) {
				this.jPanelPaginacionCuentaContaDetaGrupoActi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaContaDetaGrupoActi!=null) {
				this.jPanelParametrosReportesCuentaContaDetaGrupoActi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi!=null) {
				this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi!=null) {
				this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCuentaContaDetaGrupoActi!=null) {
				this.jScrollPanelDatosCuentaContaDetaGrupoActi.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaContaDetaGrupoActi!=null) {
				this.jPanelPaginacionCuentaContaDetaGrupoActi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaContaDetaGrupoActi!=null) {
				this.jPanelParametrosReportesCuentaContaDetaGrupoActi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi!=null) {
				this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi!=null) {
				this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaContaDetaGrupoActi!=null) {
				this.jScrollPanelDatosCuentaContaDetaGrupoActi.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaContaDetaGrupoActi!=null) {
				this.jPanelPaginacionCuentaContaDetaGrupoActi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaContaDetaGrupoActi!=null) {
				this.jPanelParametrosReportesCuentaContaDetaGrupoActi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi!=null) {
				this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi!=null) {
				this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaContaDetaGrupoActi!=null) {
				this.jScrollPanelDatosCuentaContaDetaGrupoActi.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaContaDetaGrupoActi!=null) {
				this.jPanelPaginacionCuentaContaDetaGrupoActi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaContaDetaGrupoActi!=null) {
				this.jPanelParametrosReportesCuentaContaDetaGrupoActi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi!=null) {
				this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi!=null) {
				this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaContaDetaGrupoActi!=null) {
				this.jScrollPanelDatosCuentaContaDetaGrupoActi.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaContaDetaGrupoActi!=null) {
				this.jPanelPaginacionCuentaContaDetaGrupoActi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaContaDetaGrupoActi!=null) {
				this.jPanelParametrosReportesCuentaContaDetaGrupoActi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi!=null) {
					this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCuentaContaDetaGrupoActi!=null) {
				this.jPanelParametrosReportesCuentaContaDetaGrupoActi.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi!=null) {
				this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCuentaContaDetaGrupoActi!=null) {
				this.jPanelParametrosReportesCuentaContaDetaGrupoActi.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.remove(jPanelFK_IdCuentaContableCuentaContaDetaGrupoActi);}

			this.isVisibilidadFK_IdDetalleGrupoActivoFijo=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdDetalleGrupoActivoFijo) {this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.remove(jPanelFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi);}
		}
		
	}

	public void setVisibilidadBusquedasParaDetalleGrupoActivoFijo(Boolean isParaDetalleGrupoActivoFijo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDetalleGrupoActivoFijoNegation=!isParaDetalleGrupoActivoFijo;

			this.isVisibilidadFK_IdCuentaContable=isParaDetalleGrupoActivoFijoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.remove(jPanelFK_IdCuentaContableCuentaContaDetaGrupoActi);}

			this.isVisibilidadFK_IdDetalleGrupoActivoFijo=isParaDetalleGrupoActivoFijo;
			if(!this.isVisibilidadFK_IdDetalleGrupoActivoFijo) {this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.remove(jPanelFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi);}
		}
		
	}
	
	
	
	

	public String registrarSesionCuentaContaDetaGrupoActiParaBusquedaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(cuentacontadetagrupoactiSessionBean==null) {
				cuentacontadetagrupoactiSessionBean=new CuentaContaDetaGrupoActiSessionBean();
			}

			if(cuentacontableSessionBean==null) {
				cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableSessionBean.setsPathNavegacionActual(cuentacontadetagrupoactiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableSessionBean.getisPaginaPopup();
			cuentacontableSessionBean.setisPaginaPopup(false);
			cuentacontableSessionBean.setEstaModoBusqueda(true);
			cuentacontableSessionBean.setsFuncionBusquedaRapida("window.opener.cuentacontadetagrupoactiFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable(TO_REPLACE);");
			cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(CuentaContaDetaGrupoActiConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionCuentaContaDetaGrupoActi(true);
			//cuentacontableSessionBean.setlidCuentaContaDetaGrupoActiActual(this.idCuentaContaDetaGrupoActiActual);

			cuentacontadetagrupoactiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCuentaContaDetaGrupoActi(true);
			cuentacontadetagrupoactiSessionBean.setlIdCuentaContaDetaGrupoActiActualForeignKey(this.idCuentaContaDetaGrupoActiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CuentaContaDetaGrupoActiSessionBean cuentacontadetagrupoactiSessionBean=new CuentaContaDetaGrupoActiSessionBean();
		
		if(this.cuentacontadetagrupoactiSessionBean==null) {
			this.cuentacontadetagrupoactiSessionBean=new CuentaContaDetaGrupoActiSessionBean();
		}
		
		this.cuentacontadetagrupoactiSessionBean.setsUltimaBusquedaCuentaContaDetaGrupoActi(this.getsAccionBusqueda());
		this.cuentacontadetagrupoactiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cuentacontadetagrupoactiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			cuentacontadetagrupoactiSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdDetalleGrupoActivoFijo")) {
			cuentacontadetagrupoactiSessionBean.setid_detalle_grupo_activo_fijo(this.getid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CuentaContaDetaGrupoActiSessionBean cuentacontadetagrupoactiSessionBean=new CuentaContaDetaGrupoActiSessionBean();
		
		if(this.cuentacontadetagrupoactiSessionBean==null) {
			this.cuentacontadetagrupoactiSessionBean=new CuentaContaDetaGrupoActiSessionBean();
		}
		
		if(this.cuentacontadetagrupoactiSessionBean.getsUltimaBusquedaCuentaContaDetaGrupoActi()!=null&&!this.cuentacontadetagrupoactiSessionBean.getsUltimaBusquedaCuentaContaDetaGrupoActi().equals("")) {
			this.setsAccionBusqueda(cuentacontadetagrupoactiSessionBean.getsUltimaBusquedaCuentaContaDetaGrupoActi());
			this.setiNumeroPaginacion(cuentacontadetagrupoactiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cuentacontadetagrupoactiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(cuentacontadetagrupoactiSessionBean.getid_cuenta_contable());
				cuentacontadetagrupoactiSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdDetalleGrupoActivoFijo")) {
				this.setid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo(cuentacontadetagrupoactiSessionBean.getid_detalle_grupo_activo_fijo());
				cuentacontadetagrupoactiSessionBean.setid_detalle_grupo_activo_fijo(-1L);
			}
		}
		
		this.cuentacontadetagrupoactiSessionBean.setsUltimaBusquedaCuentaContaDetaGrupoActi("");
		this.cuentacontadetagrupoactiSessionBean.setiNumeroPaginacion(CuentaContaDetaGrupoActiConstantesFunciones.INUMEROPAGINACION);
		this.cuentacontadetagrupoactiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCuentaContaDetaGrupoActi() {
		this.updateBorderResaltarBusquedasFormularioCuentaContaDetaGrupoActi();
		this.updateVisibilidadBusquedasFormularioCuentaContaDetaGrupoActi();
		this.updateHabilitarBusquedasFormularioCuentaContaDetaGrupoActi();
	}
	
	public void updateBorderResaltarBusquedasFormularioCuentaContaDetaGrupoActi() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.getComponents().length>0) {
	

		if(this.cuentacontadetagrupoactiConstantesFunciones.resaltarFK_IdCuentaContableCuentaContaDetaGrupoActi!=null) {
			index= this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaContaDetaGrupoActi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.getComponent(index);
				jPanel.setBorder(this.cuentacontadetagrupoactiConstantesFunciones.resaltarFK_IdCuentaContableCuentaContaDetaGrupoActi);
			}
		}

		if(this.cuentacontadetagrupoactiConstantesFunciones.resaltarFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi!=null) {
			index= this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.indexOfComponent(this.jPanelFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.getComponent(index);
				jPanel.setBorder(this.cuentacontadetagrupoactiConstantesFunciones.resaltarFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCuentaContaDetaGrupoActi() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaContaDetaGrupoActi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuentacontadetagrupoactiConstantesFunciones.mostrarFK_IdCuentaContableCuentaContaDetaGrupoActi);
			if(!this.cuentacontadetagrupoactiConstantesFunciones.mostrarFK_IdCuentaContableCuentaContaDetaGrupoActi && index>-1) {
				this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.remove(index);
			}

			index= this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.indexOfComponent(this.jPanelFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuentacontadetagrupoactiConstantesFunciones.mostrarFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi);
			if(!this.cuentacontadetagrupoactiConstantesFunciones.mostrarFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi && index>-1) {
				this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCuentaContaDetaGrupoActi() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaContaDetaGrupoActi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuentacontadetagrupoactiConstantesFunciones.activarFK_IdCuentaContableCuentaContaDetaGrupoActi);
				this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setEnabledAt(index,this.cuentacontadetagrupoactiConstantesFunciones.activarFK_IdCuentaContableCuentaContaDetaGrupoActi);
			}

			index= this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.indexOfComponent(this.jPanelFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuentacontadetagrupoactiConstantesFunciones.activarFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi);
				this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setEnabledAt(index,this.cuentacontadetagrupoactiConstantesFunciones.activarFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCuentaContaDetaGrupoActi(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaContaDetaGrupoActi);

			this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.getComponent(index);

			this.cuentacontadetagrupoactiConstantesFunciones.setResaltarFK_IdCuentaContableCuentaContaDetaGrupoActi(resaltar);

			jPanel.setBorder(this.cuentacontadetagrupoactiConstantesFunciones.resaltarFK_IdCuentaContableCuentaContaDetaGrupoActi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdDetalleGrupoActivoFijo")) {
			index= this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.indexOfComponent(this.jPanelFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi);

			this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.getComponent(index);

			this.cuentacontadetagrupoactiConstantesFunciones.setResaltarFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi(resaltar);

			jPanel.setBorder(this.cuentacontadetagrupoactiConstantesFunciones.resaltarFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCuentaContaDetaGrupoActi.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCuentaContaDetaGrupoActi() throws Exception {

		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCuentaContaDetaGrupoActi();
		this.updateVisibilidadResaltarControlesFormularioCuentaContaDetaGrupoActi();
		this.updateHabilitarResaltarControlesFormularioCuentaContaDetaGrupoActi();
		
	}
	
	public void updateBorderResaltarControlesFormularioCuentaContaDetaGrupoActi() throws Exception {
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cuentacontadetagrupoactiConstantesFunciones.resaltaridCuentaContaDetaGrupoActi!=null && this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jLabelidCuentaContaDetaGrupoActi.setBorder(this.cuentacontadetagrupoactiConstantesFunciones.resaltaridCuentaContaDetaGrupoActi);}
		if(this.cuentacontadetagrupoactiConstantesFunciones.resaltarid_cuenta_contableCuentaContaDetaGrupoActi!=null && this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.setBorder(this.cuentacontadetagrupoactiConstantesFunciones.resaltarid_cuenta_contableCuentaContaDetaGrupoActi);}
		if(this.cuentacontadetagrupoactiConstantesFunciones.resaltarid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi!=null && this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setBorder(this.cuentacontadetagrupoactiConstantesFunciones.resaltarid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCuentaContaDetaGrupoActi() throws Exception {		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
	
		//this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jLabelidCuentaContaDetaGrupoActi.setVisible(this.cuentacontadetagrupoactiConstantesFunciones.mostraridCuentaContaDetaGrupoActi);
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jPanelidCuentaContaDetaGrupoActi.setVisible(this.cuentacontadetagrupoactiConstantesFunciones.mostraridCuentaContaDetaGrupoActi);
		//this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.setVisible(this.cuentacontadetagrupoactiConstantesFunciones.mostrarid_cuenta_contableCuentaContaDetaGrupoActi);
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jPanelid_cuenta_contableCuentaContaDetaGrupoActi.setVisible(this.cuentacontadetagrupoactiConstantesFunciones.mostrarid_cuenta_contableCuentaContaDetaGrupoActi);
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_cuenta_contableCuentaContaDetaGrupoActi.setVisible(this.cuentacontadetagrupoactiConstantesFunciones.mostrarid_cuenta_contableCuentaContaDetaGrupoActi);
		//this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setVisible(this.cuentacontadetagrupoactiConstantesFunciones.mostrarid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi);
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jPanelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setVisible(this.cuentacontadetagrupoactiConstantesFunciones.mostrarid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCuentaContaDetaGrupoActi() throws Exception {
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi!=null) {
	
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jLabelidCuentaContaDetaGrupoActi.setEnabled(this.cuentacontadetagrupoactiConstantesFunciones.activaridCuentaContaDetaGrupoActi);
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.setEnabled(this.cuentacontadetagrupoactiConstantesFunciones.activarid_cuenta_contableCuentaContaDetaGrupoActi);
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jButtonid_cuenta_contableCuentaContaDetaGrupoActi.setEnabled(this.cuentacontadetagrupoactiConstantesFunciones.activarid_cuenta_contableCuentaContaDetaGrupoActi);
		this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi.jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setEnabled(this.cuentacontadetagrupoactiConstantesFunciones.activarid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi);
		}
	}
	
		
}