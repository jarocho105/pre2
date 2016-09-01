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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.activosfijos.util.ProcesarMayorizarConstantesFunciones;
import com.bydan.erp.activosfijos.util.report.ProcesarMayorizarParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.report.ProcesarMayorizarParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.report.ProcesarMayorizarBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.activosfijos.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.activosfijos.util.*;

import com.bydan.erp.activosfijos.util.report.*;
import com.bydan.erp.activosfijos.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.report.*;
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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;

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
public class ProcesarMayorizarBeanSwingJInternalFrame extends ProcesarMayorizarJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesarMayorizarBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesarMayorizar> procesarmayorizarValidator = new ClassValidator<ProcesarMayorizar>(ProcesarMayorizar.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesarMayorizar procesarmayorizar;	
	public ProcesarMayorizar procesarmayorizarAux;
	public ProcesarMayorizar procesarmayorizarAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesarMayorizar procesarmayorizarTotales;
	public Long idProcesarMayorizarActual;
	public Long iIdNuevoProcesarMayorizar=0L;
	public int rowIndexActual=0;
	
	
	
	
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

	public String sFinalQueryComboTipoDocumento="";

	public List<TipoDocumento> tipodocumentosForeignKey;

	public List<TipoDocumento> gettipodocumentosForeignKey() {
		return tipodocumentosForeignKey;
	}

	public void settipodocumentosForeignKey(List<TipoDocumento> tipodocumentosForeignKey) {
		this.tipodocumentosForeignKey = tipodocumentosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoDocumento tipodocumentoForeignKey;

	public TipoDocumento gettipodocumentoForeignKey() {
		return tipodocumentoForeignKey;
	}

	public void settipodocumentoForeignKey(TipoDocumento tipodocumentoForeignKey) {
		this.tipodocumentoForeignKey = tipodocumentoForeignKey;
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
	
	public Boolean isPermisoTodoProcesarMayorizar;
	public Boolean isPermisoNuevoProcesarMayorizar;
	public Boolean isPermisoActualizarProcesarMayorizar;
	public Boolean isPermisoActualizarOriginalProcesarMayorizar;
	public Boolean isPermisoEliminarProcesarMayorizar;
	public Boolean isPermisoGuardarCambiosProcesarMayorizar;
	public Boolean isPermisoConsultaProcesarMayorizar;
	public Boolean isPermisoBusquedaProcesarMayorizar;
	public Boolean isPermisoReporteProcesarMayorizar;
	public Boolean isPermisoPaginacionMedioProcesarMayorizar;
	public Boolean isPermisoPaginacionAltoProcesarMayorizar;
	public Boolean isPermisoPaginacionTodoProcesarMayorizar;
	public Boolean isPermisoCopiarProcesarMayorizar;
	public Boolean isPermisoVerFormProcesarMayorizar;
	public Boolean isPermisoDuplicarProcesarMayorizar;
	public Boolean isPermisoOrdenProcesarMayorizar;
	
	
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
	
	public ProcesarMayorizarParameterReturnGeneral procesarmayorizarReturnGeneral;
	public ProcesarMayorizarParameterReturnGeneral procesarmayorizarParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesarMayorizar=false;
	public Boolean esParaAccionDesdeFormularioProcesarMayorizar=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesarMayorizarSessionBeanAdditional procesarmayorizarSessionBeanAdditional=null;
	
	public ProcesarMayorizarSessionBeanAdditional getProcesarMayorizarSessionBeanAdditional() {
		return this.procesarmayorizarSessionBeanAdditional;
	}
	
	public void setProcesarMayorizarSessionBeanAdditional(ProcesarMayorizarSessionBeanAdditional procesarmayorizarSessionBeanAdditional) {
		try {
			this.procesarmayorizarSessionBeanAdditional=procesarmayorizarSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesarMayorizarBeanSwingJInternalFrameAdditional procesarmayorizarBeanSwingJInternalFrameAdditional=null;
	//public class ProcesarMayorizarBeanSwingJInternalFrame
	
	public ProcesarMayorizarBeanSwingJInternalFrameAdditional getProcesarMayorizarBeanSwingJInternalFrameAdditional() {
		return this.procesarmayorizarBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesarMayorizarBeanSwingJInternalFrameAdditional(ProcesarMayorizarBeanSwingJInternalFrameAdditional procesarmayorizarBeanSwingJInternalFrameAdditional) {
		try {
			this.procesarmayorizarBeanSwingJInternalFrameAdditional=procesarmayorizarBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesarMayorizarLogic procesarmayorizarLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesarMayorizar procesarmayorizarBean;
	public ProcesarMayorizarConstantesFunciones procesarmayorizarConstantesFunciones;
	//public ProcesarMayorizarParameterReturnGeneral procesarmayorizarReturnGeneral;
	
	//FK
	
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	public TipoDocumentoLogic tipodocumentoLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesarMayorizar> procesarmayorizars;	
	//public List<ProcesarMayorizar> procesarmayorizarsEliminados;
	//public List<ProcesarMayorizar> procesarmayorizarsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesarMayorizar=false;
	public Boolean isVisibilidadCeldaDuplicarProcesarMayorizar=true;
	public Boolean isVisibilidadCeldaCopiarProcesarMayorizar=true;
	public Boolean isVisibilidadCeldaVerFormProcesarMayorizar=true;
	public Boolean isVisibilidadCeldaOrdenProcesarMayorizar=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesarMayorizar=false;
	public Boolean isVisibilidadCeldaModificarProcesarMayorizar=false;
	public Boolean isVisibilidadCeldaActualizarProcesarMayorizar=false;
	public Boolean isVisibilidadCeldaEliminarProcesarMayorizar=false;
	public Boolean isVisibilidadCeldaCancelarProcesarMayorizar=false;
	public Boolean isVisibilidadCeldaGuardarProcesarMayorizar=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesarMayorizar=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesarMayorizar=false;
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdTipoDocumento=false;
	
	public Long getiIdNuevoProcesarMayorizar() {
		return this.iIdNuevoProcesarMayorizar;
	}

	public void setiIdNuevoProcesarMayorizar(Long iIdNuevoProcesarMayorizar) {
		this.iIdNuevoProcesarMayorizar = iIdNuevoProcesarMayorizar;
	}
	
	public Long getidProcesarMayorizarActual() {
		return this.idProcesarMayorizarActual;
	}

	public void setidProcesarMayorizarActual(Long idProcesarMayorizarActual) {
		this.idProcesarMayorizarActual = idProcesarMayorizarActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesarMayorizar getprocesarmayorizar() {
		return this.procesarmayorizar;
	}

	public void setprocesarmayorizar(ProcesarMayorizar procesarmayorizar) {
		this.procesarmayorizar = procesarmayorizar;
	}
	
	public ProcesarMayorizar getprocesarmayorizarAux() {
		return this.procesarmayorizarAux;
	}

	public void setprocesarmayorizarAux(ProcesarMayorizar procesarmayorizarAux) {
		this.procesarmayorizarAux = procesarmayorizarAux;
	}				
	
	public ProcesarMayorizar getprocesarmayorizarAnterior() {
		return this.procesarmayorizarAnterior;
	}

	public void setprocesarmayorizarAnterior(ProcesarMayorizar procesarmayorizarAnterior) {
		this.procesarmayorizarAnterior = procesarmayorizarAnterior;
	}	
	
	public ProcesarMayorizar getprocesarmayorizarTotales() {
		return this.procesarmayorizarTotales;
	}

	public void setprocesarmayorizarTotales(ProcesarMayorizar procesarmayorizarTotales) {
		this.procesarmayorizarTotales = procesarmayorizarTotales;
	}	
	
	public ProcesarMayorizar getprocesarmayorizarBean() {
		return this.procesarmayorizarBean;
	}

	public void setprocesarmayorizarBean(ProcesarMayorizar procesarmayorizarBean) {
		this.procesarmayorizarBean = procesarmayorizarBean;
	}	
	
	public ProcesarMayorizarParameterReturnGeneral getprocesarmayorizarReturnGeneral() {
		return this.procesarmayorizarReturnGeneral;
	}

	public void setprocesarmayorizarReturnGeneral(ProcesarMayorizarParameterReturnGeneral procesarmayorizarReturnGeneral) {
		this.procesarmayorizarReturnGeneral = procesarmayorizarReturnGeneral;
	}	
	
	
	public Long id_anioBusquedaProcesarMayorizar=null;

	public Long getid_anioBusquedaProcesarMayorizar() {
		return this.id_anioBusquedaProcesarMayorizar;
	}

	public void setid_anioBusquedaProcesarMayorizar(Long id_anioBusquedaProcesarMayorizar) {
		this.id_anioBusquedaProcesarMayorizar = id_anioBusquedaProcesarMayorizar;
	}

;
	public Long id_mesBusquedaProcesarMayorizar=null;

	public Long getid_mesBusquedaProcesarMayorizar() {
		return this.id_mesBusquedaProcesarMayorizar;
	}

	public void setid_mesBusquedaProcesarMayorizar(Long id_mesBusquedaProcesarMayorizar) {
		this.id_mesBusquedaProcesarMayorizar = id_mesBusquedaProcesarMayorizar;
	}

;
	public Long id_tipo_documentoBusquedaProcesarMayorizar=-1L;

	public Long getid_tipo_documentoBusquedaProcesarMayorizar() {
		return this.id_tipo_documentoBusquedaProcesarMayorizar;
	}

	public void setid_tipo_documentoBusquedaProcesarMayorizar(Long id_tipo_documentoBusquedaProcesarMayorizar) {
		this.id_tipo_documentoBusquedaProcesarMayorizar = id_tipo_documentoBusquedaProcesarMayorizar;
	}

	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

	public Long id_tipo_documentoFK_IdTipoDocumento=-1L;

	public Long getid_tipo_documentoFK_IdTipoDocumento() {
		return this.id_tipo_documentoFK_IdTipoDocumento;
	}

	public void setid_tipo_documentoFK_IdTipoDocumento(Long id_tipo_documentoFK_IdTipoDocumento) {
		this.id_tipo_documentoFK_IdTipoDocumento = id_tipo_documentoFK_IdTipoDocumento;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesarMayorizarLogic getProcesarMayorizarLogic()	{		
		return procesarmayorizarLogic;
	}

	public void setProcesarMayorizarLogic(ProcesarMayorizarLogic procesarmayorizarLogic) {
		this.procesarmayorizarLogic = procesarmayorizarLogic;
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
	
	public Boolean getIsEsNuevoProcesarMayorizar() {
		return isEsNuevoProcesarMayorizar;
	}

	public void setIsEsNuevoProcesarMayorizar(Boolean isEsNuevoProcesarMayorizar) {
		this.isEsNuevoProcesarMayorizar = isEsNuevoProcesarMayorizar;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesarMayorizar() {
		return esParaAccionDesdeFormularioProcesarMayorizar;
	}
	
	public void setEsParaAccionDesdeFormularioProcesarMayorizar(Boolean esParaAccionDesdeFormularioProcesarMayorizar) {
		this.esParaAccionDesdeFormularioProcesarMayorizar = esParaAccionDesdeFormularioProcesarMayorizar;
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

			anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.procesarmayorizarSessionBean==null) {
				this.procesarmayorizarSessionBean=new ProcesarMayorizarSessionBean();
			}

			if(!this.procesarmayorizarSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

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
					anioLogic.getEntityWithConnection(procesarmayorizarSessionBean.getlidAnioActual());
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

			mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.procesarmayorizarSessionBean==null) {
				this.procesarmayorizarSessionBean=new ProcesarMayorizarSessionBean();
			}

			if(!this.procesarmayorizarSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

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
					mesLogic.getEntityWithConnection(procesarmayorizarSessionBean.getlidMesActual());
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

	public void cargarCombosTipoDocumentosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipodocumentosForeignKey=new ArrayList<TipoDocumento>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoDocumentoLogic tipodocumentoLogic=new TipoDocumentoLogic();

			tipodocumentoLogic.getTipoDocumentoDataAccess().setIsForForeingKeyData(true);

			if(this.procesarmayorizarSessionBean==null) {
				this.procesarmayorizarSessionBean=new ProcesarMayorizarSessionBean();
			}

			if(!this.procesarmayorizarSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumento()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.getTipoDocumentoDataAccess().setIsForForeingKeyData(true);

					tipodocumentoLogic.getTodosTipoDocumentosWithConnection(sFinalQuery,new Pagination());

					this.tipodocumentosForeignKey=tipodocumentoLogic.getTipoDocumentos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoDocumento(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.getEntityWithConnection(procesarmayorizarSessionBean.getlidTipoDocumentoActual());
					this.tipodocumentosForeignKey.add(tipodocumentoLogic.getTipoDocumento());
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

					if(this.procesarmayorizar!=null) {
						this.procesarmayorizar.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
						this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_anioProcesarMayorizar.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioProcesarMayorizar.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
						if(this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_anioProcesarMayorizar.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_anioProcesarMayorizar.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesarMayorizar") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar!=null) {
						jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar!=null) {
							//jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar.setSelectedItem(anioTemp);
							if(jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar.getItemCount()>0) {
								jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioProcesarMayorizarGenerico)throws Exception
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
				jComboBoxid_anioProcesarMayorizarGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioProcesarMayorizarGenerico!=null && jComboBoxid_anioProcesarMayorizarGenerico.getItemCount()>0) {
					jComboBoxid_anioProcesarMayorizarGenerico.setSelectedIndex(0);
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

					if(this.procesarmayorizar!=null) {
						this.procesarmayorizar.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
						this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_mesProcesarMayorizar.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesProcesarMayorizar.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
						if(this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_mesProcesarMayorizar.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_mesProcesarMayorizar.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesarMayorizar") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar!=null) {
						jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar!=null) {
							//jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar.setSelectedItem(mesTemp);
							if(jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar.getItemCount()>0) {
								jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesProcesarMayorizarGenerico)throws Exception
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
				jComboBoxid_mesProcesarMayorizarGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesProcesarMayorizarGenerico!=null && jComboBoxid_mesProcesarMayorizarGenerico.getItemCount()>0) {
					jComboBoxid_mesProcesarMayorizarGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoDocumentoForeignKey(Long idTipoDocumentoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoDocumento  tipodocumentoTemp=null;

			for(TipoDocumento tipodocumentoAux:tipodocumentosForeignKey) {
				if(tipodocumentoAux.getId()!=null && tipodocumentoAux.getId().equals(idTipoDocumentoSeleccionado)) {
					tipodocumentoTemp=tipodocumentoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipodocumentoTemp!=null) {

					if(this.procesarmayorizar!=null) {
						this.procesarmayorizar.setTipoDocumento(tipodocumentoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
						this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_tipo_documentoProcesarMayorizar.setSelectedItem(tipodocumentoTemp);
					}
				} else {
					//jComboBoxid_tipo_documentoProcesarMayorizar.setSelectedItem(tipodocumentoTemp);
					if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
						if(this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_tipo_documentoProcesarMayorizar.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_tipo_documentoProcesarMayorizar.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesarMayorizar") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipodocumentoTemp!=null && jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar!=null) {
						jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar.setSelectedItem(tipodocumentoTemp);
					} else {
						if(jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar!=null) {
							//jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar.setSelectedItem(tipodocumentoTemp);
							if(jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar.getItemCount()>0) {
								jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar.setSelectedIndex(0);
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

	public String getActualTipoDocumentoForeignKeyDescripcion(Long idTipoDocumentoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoDocumento  tipodocumentoTemp=null;

			for(TipoDocumento tipodocumentoAux:tipodocumentosForeignKey) {
				if(tipodocumentoAux.getId()!=null && tipodocumentoAux.getId().equals(idTipoDocumentoSeleccionado)) {
					tipodocumentoTemp=tipodocumentoAux;
					break;
				}
			}


			sDescripcion=TipoDocumentoConstantesFunciones.getTipoDocumentoDescripcion(tipodocumentoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoDocumentoForeignKeyGenerico(Long idTipoDocumentoSeleccionado,JComboBox jComboBoxid_tipo_documentoProcesarMayorizarGenerico)throws Exception
	{
		try
		{
			TipoDocumento  tipodocumentoTemp=null;

			for(TipoDocumento tipodocumentoAux:tipodocumentosForeignKey) {
				if(tipodocumentoAux.getId()!=null && tipodocumentoAux.getId().equals(idTipoDocumentoSeleccionado)) {
					tipodocumentoTemp=tipodocumentoAux;
					break;
				}
			}

			if(tipodocumentoTemp!=null) {
				jComboBoxid_tipo_documentoProcesarMayorizarGenerico.setSelectedItem(tipodocumentoTemp);
			} else {
				if(jComboBoxid_tipo_documentoProcesarMayorizarGenerico!=null && jComboBoxid_tipo_documentoProcesarMayorizarGenerico.getItemCount()>0) {
					jComboBoxid_tipo_documentoProcesarMayorizarGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(ProcesarMayorizar procesarmayorizar,JComboBox jComboBoxid_anioProcesarMayorizarGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioProcesarMayorizarGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_anioProcesarMayorizar.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioProcesarMayorizarGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				procesarmayorizar.setid_anio(anioAux.getId());
				procesarmayorizar.setanio_descripcion(ProcesarMayorizarConstantesFunciones.getAnioDescripcion(anioAux));
				procesarmayorizar.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(ProcesarMayorizar procesarmayorizar,JComboBox jComboBoxid_mesProcesarMayorizarGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesProcesarMayorizarGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_mesProcesarMayorizar.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesProcesarMayorizarGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				procesarmayorizar.setid_mes(mesAux.getId());
				procesarmayorizar.setmes_descripcion(ProcesarMayorizarConstantesFunciones.getMesDescripcion(mesAux));
				procesarmayorizar.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoDocumentoForeignKey(ProcesarMayorizar procesarmayorizar,JComboBox jComboBoxid_tipo_documentoProcesarMayorizarGenerico)throws Exception
	{
		try
		{
			TipoDocumento  tipodocumentoAux=new TipoDocumento();

			if(jComboBoxid_tipo_documentoProcesarMayorizarGenerico==null) {
				tipodocumentoAux=(TipoDocumento)this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_tipo_documentoProcesarMayorizar.getSelectedItem();
			} else {
				tipodocumentoAux=(TipoDocumento)jComboBoxid_tipo_documentoProcesarMayorizarGenerico.getSelectedItem();
			}

			if(tipodocumentoAux!=null && tipodocumentoAux.getId()!=null) {
				procesarmayorizar.setid_tipo_documento(tipodocumentoAux.getId());
				procesarmayorizar.settipodocumento_descripcion(ProcesarMayorizarConstantesFunciones.getTipoDocumentoDescripcion(tipodocumentoAux));
				procesarmayorizar.setTipoDocumento(tipodocumentoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { 
							this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_anioProcesarMayorizar.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_anioProcesarMayorizar.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { 
					}

					if(!ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesarMayorizar") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar.addItem(anio);
							}
						}

						if(!ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { 
							this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_mesProcesarMayorizar.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_mesProcesarMayorizar.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { 
					}

					if(!ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesarMayorizar") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar.addItem(mes);
							}
						}

						if(!ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoDocumentosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoDocumento=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { 
							this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_tipo_documentoProcesarMayorizar.removeAllItems();

							for(TipoDocumento tipodocumento:this.tipodocumentosForeignKey) {
								this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_tipo_documentoProcesarMayorizar.addItem(tipodocumento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { 
					}

					if(!ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesarMayorizar") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar.removeAllItems();

							for(TipoDocumento tipodocumento:this.tipodocumentosForeignKey) {
								this.jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar.addItem(tipodocumento);
							}
						}

						if(!ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
							this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_anioProcesarMayorizar.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
							this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_anioProcesarMayorizar.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
							this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_mesProcesarMayorizar.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
							this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_mesProcesarMayorizar.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoDocumentoForeignKey(TipoDocumento tipodocumento,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
							this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_tipo_documentoProcesarMayorizar.setSelectedItem(tipodocumento);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
							this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_tipo_documentoProcesarMayorizar.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar.setSelectedItem(tipodocumento);
						} else {
							this.jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesarMayorizar() throws Exception {
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
		
	public ProcesarMayorizarParameterReturnGeneral getProcesarMayorizarParameterGeneral() {
		return this.procesarmayorizarParameterGeneral;
	}
	
	public void setProcesarMayorizarParameterGeneral(ProcesarMayorizarParameterReturnGeneral procesarmayorizarParameterGeneral) {
		this.procesarmayorizarParameterGeneral = procesarmayorizarParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesarMayorizar() {
		return isPermisoTodoProcesarMayorizar;
	}

	public void setIsPermisoTodoProcesarMayorizar(Boolean isPermisoTodoProcesarMayorizar) {
		this.isPermisoTodoProcesarMayorizar = isPermisoTodoProcesarMayorizar;
	}

	public Boolean getIsPermisoNuevoProcesarMayorizar() {
		return isPermisoNuevoProcesarMayorizar;
	}

	public void setIsPermisoNuevoProcesarMayorizar(Boolean isPermisoNuevoProcesarMayorizar) {
		this.isPermisoNuevoProcesarMayorizar = isPermisoNuevoProcesarMayorizar;
	}

	public Boolean getIsPermisoActualizarProcesarMayorizar() {
		return isPermisoActualizarProcesarMayorizar;
	}

	public void setIsPermisoActualizarProcesarMayorizar(Boolean isPermisoActualizarProcesarMayorizar) {
		this.isPermisoActualizarProcesarMayorizar = isPermisoActualizarProcesarMayorizar;
	}

	public Boolean getIsPermisoEliminarProcesarMayorizar() {
		return isPermisoEliminarProcesarMayorizar;
	}

	public void setIsPermisoEliminarProcesarMayorizar(Boolean isPermisoEliminarProcesarMayorizar) {
		this.isPermisoEliminarProcesarMayorizar = isPermisoEliminarProcesarMayorizar;
	}

	public Boolean getIsPermisoGuardarCambiosProcesarMayorizar() {
		return isPermisoGuardarCambiosProcesarMayorizar;
	}

	public void setIsPermisoGuardarCambiosProcesarMayorizar(Boolean isPermisoGuardarCambiosProcesarMayorizar) {
		this.isPermisoGuardarCambiosProcesarMayorizar = isPermisoGuardarCambiosProcesarMayorizar;
	}
	
	public Boolean getIsPermisoConsultaProcesarMayorizar() {
		return isPermisoConsultaProcesarMayorizar;
	}

	public void setIsPermisoConsultaProcesarMayorizar(Boolean isPermisoConsultaProcesarMayorizar) {
		this.isPermisoConsultaProcesarMayorizar = isPermisoConsultaProcesarMayorizar;
	}

	public Boolean getIsPermisoBusquedaProcesarMayorizar() {
		return isPermisoBusquedaProcesarMayorizar;
	}

	public void setIsPermisoBusquedaProcesarMayorizar(Boolean isPermisoBusquedaProcesarMayorizar) {
		this.isPermisoBusquedaProcesarMayorizar = isPermisoBusquedaProcesarMayorizar;
	}

	public Boolean getIsPermisoReporteProcesarMayorizar() {
		return isPermisoReporteProcesarMayorizar;
	}

	public void setIsPermisoReporteProcesarMayorizar(Boolean isPermisoReporteProcesarMayorizar) {
		this.isPermisoReporteProcesarMayorizar = isPermisoReporteProcesarMayorizar;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesarMayorizar() {
		return isPermisoPaginacionMedioProcesarMayorizar;
	}

	public void setIsPermisoPaginacionMedioProcesarMayorizar(Boolean isPermisoPaginacionMedioProcesarMayorizar) {
		this.isPermisoPaginacionMedioProcesarMayorizar = isPermisoPaginacionMedioProcesarMayorizar;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesarMayorizar() {
		return isPermisoPaginacionTodoProcesarMayorizar;
	}

	public void setIsPermisoPaginacionTodoProcesarMayorizar(Boolean isPermisoPaginacionTodoProcesarMayorizar) {
		this.isPermisoPaginacionTodoProcesarMayorizar = isPermisoPaginacionTodoProcesarMayorizar;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesarMayorizar() {
		return isPermisoPaginacionAltoProcesarMayorizar;
	}

	public void setIsPermisoPaginacionAltoProcesarMayorizar(Boolean isPermisoPaginacionAltoProcesarMayorizar) {
		this.isPermisoPaginacionAltoProcesarMayorizar = isPermisoPaginacionAltoProcesarMayorizar;
	}
	
	public Boolean getIsPermisoCopiarProcesarMayorizar() {
		return isPermisoCopiarProcesarMayorizar;
	}

	public void setIsPermisoCopiarProcesarMayorizar(Boolean isPermisoCopiarProcesarMayorizar) {
		this.isPermisoCopiarProcesarMayorizar = isPermisoCopiarProcesarMayorizar;
	}
	
	public Boolean getIsPermisoVerFormProcesarMayorizar() {
		return isPermisoVerFormProcesarMayorizar;
	}

	public void setIsPermisoVerFormProcesarMayorizar(Boolean isPermisoVerFormProcesarMayorizar) {
		this.isPermisoVerFormProcesarMayorizar = isPermisoVerFormProcesarMayorizar;
	}
	
	public Boolean getIsPermisoDuplicarProcesarMayorizar() {
		return isPermisoDuplicarProcesarMayorizar;
	}

	public void setIsPermisoDuplicarProcesarMayorizar(Boolean isPermisoDuplicarProcesarMayorizar) {
		this.isPermisoDuplicarProcesarMayorizar = isPermisoDuplicarProcesarMayorizar;
	}
	
	public Boolean getIsPermisoOrdenProcesarMayorizar() {
		return isPermisoOrdenProcesarMayorizar;
	}

	public void setIsPermisoOrdenProcesarMayorizar(Boolean isPermisoOrdenProcesarMayorizar) {
		this.isPermisoOrdenProcesarMayorizar = isPermisoOrdenProcesarMayorizar;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesarMayorizar() {
		return isVisibilidadCeldaNuevoProcesarMayorizar;
	}

	public void setIsVisibilidadCeldaNuevoProcesarMayorizar(Boolean isVisibilidadCeldaNuevoProcesarMayorizar) {
		this.isVisibilidadCeldaNuevoProcesarMayorizar = isVisibilidadCeldaNuevoProcesarMayorizar;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesarMayorizar() {
		return isVisibilidadCeldaDuplicarProcesarMayorizar;
	}

	public void setIsVisibilidadCeldaDuplicarProcesarMayorizar(Boolean isVisibilidadCeldaDuplicarProcesarMayorizar) {
		this.isVisibilidadCeldaDuplicarProcesarMayorizar = isVisibilidadCeldaDuplicarProcesarMayorizar;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesarMayorizar() {
		return isVisibilidadCeldaCopiarProcesarMayorizar;
	}

	public void setIsVisibilidadCeldaCopiarProcesarMayorizar(Boolean isVisibilidadCeldaCopiarProcesarMayorizar) {
		this.isVisibilidadCeldaCopiarProcesarMayorizar = isVisibilidadCeldaCopiarProcesarMayorizar;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesarMayorizar() {
		return isVisibilidadCeldaVerFormProcesarMayorizar;
	}

	public void setIsVisibilidadCeldaVerFormProcesarMayorizar(Boolean isVisibilidadCeldaVerFormProcesarMayorizar) {
		this.isVisibilidadCeldaVerFormProcesarMayorizar = isVisibilidadCeldaVerFormProcesarMayorizar;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesarMayorizar() {
		return isVisibilidadCeldaOrdenProcesarMayorizar;
	}

	public void setIsVisibilidadCeldaOrdenProcesarMayorizar(Boolean isVisibilidadCeldaOrdenProcesarMayorizar) {
		this.isVisibilidadCeldaOrdenProcesarMayorizar = isVisibilidadCeldaOrdenProcesarMayorizar;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesarMayorizar() {
		return isVisibilidadCeldaNuevoRelacionesProcesarMayorizar;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesarMayorizar(Boolean isVisibilidadCeldaNuevoRelacionesProcesarMayorizar) {
		this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar = isVisibilidadCeldaNuevoRelacionesProcesarMayorizar;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesarMayorizar() {
		return isVisibilidadCeldaModificarProcesarMayorizar;
	}

	public void setIsVisibilidadCeldaModificarProcesarMayorizar(Boolean isVisibilidadCeldaModificarProcesarMayorizar) {
		this.isVisibilidadCeldaModificarProcesarMayorizar = isVisibilidadCeldaModificarProcesarMayorizar;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesarMayorizar() {
		return isVisibilidadCeldaActualizarProcesarMayorizar;
	}

	public void setIsVisibilidadCeldaActualizarProcesarMayorizar(Boolean isVisibilidadCeldaActualizarProcesarMayorizar) {
		this.isVisibilidadCeldaActualizarProcesarMayorizar = isVisibilidadCeldaActualizarProcesarMayorizar;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesarMayorizar() {
		return isVisibilidadCeldaEliminarProcesarMayorizar;
	}

	public void setIsVisibilidadCeldaEliminarProcesarMayorizar(Boolean isVisibilidadCeldaEliminarProcesarMayorizar) {
		this.isVisibilidadCeldaEliminarProcesarMayorizar = isVisibilidadCeldaEliminarProcesarMayorizar;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesarMayorizar() {
		return isVisibilidadCeldaCancelarProcesarMayorizar;
	}

	public void setIsVisibilidadCeldaCancelarProcesarMayorizar(Boolean isVisibilidadCeldaCancelarProcesarMayorizar) {
		this.isVisibilidadCeldaCancelarProcesarMayorizar = isVisibilidadCeldaCancelarProcesarMayorizar;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesarMayorizar() {
		return isVisibilidadCeldaGuardarProcesarMayorizar;
	}

	public void setIsVisibilidadCeldaGuardarProcesarMayorizar(Boolean isVisibilidadCeldaGuardarProcesarMayorizar) {
		this.isVisibilidadCeldaGuardarProcesarMayorizar = isVisibilidadCeldaGuardarProcesarMayorizar;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesarMayorizar() {
		return isVisibilidadCeldaGuardarCambiosProcesarMayorizar;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesarMayorizar(Boolean isVisibilidadCeldaGuardarCambiosProcesarMayorizar) {
		this.isVisibilidadCeldaGuardarCambiosProcesarMayorizar = isVisibilidadCeldaGuardarCambiosProcesarMayorizar;
	}
		
	public ProcesarMayorizarSessionBean getprocesarmayorizarSessionBean() {
		return this.procesarmayorizarSessionBean;
	}
	
	public void setprocesarmayorizarSessionBean(ProcesarMayorizarSessionBean procesarmayorizarSessionBean) {
		this.procesarmayorizarSessionBean=procesarmayorizarSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesarMayorizar() {
		return this.isVisibilidadBusquedaProcesarMayorizar;
	}

	public void setisVisibilidadBusquedaProcesarMayorizar(Boolean isVisibilidadBusquedaProcesarMayorizar) {
		this.isVisibilidadBusquedaProcesarMayorizar=isVisibilidadBusquedaProcesarMayorizar;
	}

	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	public Boolean getisVisibilidadFK_IdTipoDocumento() {
		return this.isVisibilidadFK_IdTipoDocumento;
	}

	public void setisVisibilidadFK_IdTipoDocumento(Boolean isVisibilidadFK_IdTipoDocumento) {
		this.isVisibilidadFK_IdTipoDocumento=isVisibilidadFK_IdTipoDocumento;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(ProcesarMayorizar procesarmayorizar)throws Exception {
		try {
			
				this.setActualParaGuardarAnioForeignKey(procesarmayorizar,null);
				this.setActualParaGuardarMesForeignKey(procesarmayorizar,null);
				this.setActualParaGuardarTipoDocumentoForeignKey(procesarmayorizar,null);
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
	
	public void bugActualizarReferenciaActual(ProcesarMayorizar procesarmayorizar,ProcesarMayorizar procesarmayorizarAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesarMayorizar(procesarmayorizar);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesarmayorizarAux.setId(procesarmayorizar.getId());
		procesarmayorizarAux.setVersionRow(procesarmayorizar.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesarMayorizar procesarmayorizarLocal) throws Exception {
		
		if(this.procesarmayorizarSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesarMayorizar procesarmayorizarLocal) throws Exception {	
		if(this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				procesarmayorizarLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				procesarmayorizarLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoDocumentoDetalleFormJInternalFrame.class)) {
				TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrameLocal=(TipoDocumentoBeanSwingJInternalFrame) ((TipoDocumentoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipodocumentoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoDocumento(tipodocumentoBeanSwingJInternalFrameLocal.gettipodocumento(),true);
				tipodocumentoBeanSwingJInternalFrameLocal.actualizarLista(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento,this.tipodocumentosForeignKey);

				tipodocumentoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento);

				procesarmayorizarLocal.setTipoDocumento(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento);

				this.addItemDefectoCombosForeignKeyTipoDocumento();
				this.cargarCombosFrameTipoDocumentosForeignKey("Formulario");
				this.setActualTipoDocumentoForeignKey(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesarMayorizarActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesarmayorizarValidator.getInvalidValues(this.procesarmayorizar);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesarMayorizar procesarmayorizar,List<ProcesarMayorizar> procesarmayorizars) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesarMayorizar procesarmayorizar,List<ProcesarMayorizar> procesarmayorizars) throws Exception {
		try	{			
			ProcesarMayorizarConstantesFunciones.actualizarSelectedLista(procesarmayorizar,procesarmayorizars);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesarMayorizar> procesarmayorizarsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesarmayorizarsLocal=this.procesarmayorizarLogic.getProcesarMayorizars();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesarmayorizarsLocal=this.procesarmayorizars;
			}
			//ARCHITECTURE
		
			for(ProcesarMayorizar procesarmayorizarLocal:procesarmayorizarsLocal) {
				if(this.permiteMantenimiento(procesarmayorizarLocal) && procesarmayorizarLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesarMayorizarConstantesFunciones.getProcesarMayorizarLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesarMayorizarConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesarMayorizar.jLabelcodigoProcesarMayorizar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesarMayorizarConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesarMayorizar.jLabelnombreProcesarMayorizar,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesarMayorizar.jLabelcodigoProcesarMayorizar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesarMayorizar.jLabelnombreProcesarMayorizar,"");
		
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
		this.iIdNuevoProcesarMayorizar--;	
		
		
		this.procesarmayorizarAux=new ProcesarMayorizar();
		
		this.procesarmayorizarAux.setId(this.iIdNuevoProcesarMayorizar);
		this.procesarmayorizarAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesarmayorizarLogic.getProcesarMayorizars().add(this.procesarmayorizarAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesarmayorizars.add(this.procesarmayorizarAux);
		}
		//ARCHITECTURE
		
		this.procesarmayorizar=this.procesarmayorizarAux;
		
		if(ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesarMayorizar(this.procesarmayorizar);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesarMayorizar(this.procesarmayorizar);
		}
				
		//this.setDefaultControlesProcesarMayorizar();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesarMayorizar();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesarMayorizar();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesarMayorizar();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesarMayorizar(this.procesarmayorizarBean,this.procesarmayorizar,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesarMayorizar(this.procesarmayorizarReturnGeneral,this.procesarmayorizarBean,false);
		
		if(this.procesarmayorizarReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesarMayorizar(this.procesarmayorizarReturnGeneral.getProcesarMayorizar());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesarMayorizar(this.procesarmayorizarReturnGeneral.getProcesarMayorizar());
		}
		
		if(this.procesarmayorizarReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesarMayorizar(this.procesarmayorizarReturnGeneral.getProcesarMayorizar(),classes);//this.procesarmayorizarBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.procesarmayorizar,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesarMayorizar();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesarMayorizar();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.RecargarFormProcesarMayorizar(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesarMayorizar(false);
						
			if(procesarmayorizarSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesarMayorizar();
			}
			
			this.actualizarVisualTableDatosProcesarMayorizar();
			
			this.jTableDatosProcesarMayorizar.setRowSelectionInterval(this.getIndiceNuevoProcesarMayorizar(), this.getIndiceNuevoProcesarMayorizar());
			
			this.seleccionarFilaTablaProcesarMayorizarActual();
						
			this.actualizarEstadoCeldasBotonesProcesarMayorizar("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesarMayorizar(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesarMayorizar.jTextFieldcodigoProcesarMayorizar.setEnabled(isHabilitar && this.procesarmayorizarConstantesFunciones.activarcodigoProcesarMayorizar);
		this.jInternalFrameDetalleFormProcesarMayorizar.jTextAreanombreProcesarMayorizar.setEnabled(isHabilitar && this.procesarmayorizarConstantesFunciones.activarnombreProcesarMayorizar);	
		
		this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_anioProcesarMayorizar.setEnabled(isHabilitar && this.procesarmayorizarConstantesFunciones.activarid_anioProcesarMayorizar);
		this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_mesProcesarMayorizar.setEnabled(isHabilitar && this.procesarmayorizarConstantesFunciones.activarid_mesProcesarMayorizar);
		this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_tipo_documentoProcesarMayorizar.setEnabled(isHabilitar && this.procesarmayorizarConstantesFunciones.activarid_tipo_documentoProcesarMayorizar);
	};
	
	public void setDefaultControlesProcesarMayorizar() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesarMayorizar(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesarmayorizarSessionBean.setConGuardarRelaciones(true);			
			this.procesarmayorizarSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesarMayorizar.jTabbedPaneRelacionesProcesarMayorizar.setVisible(true);
			
					
		} else {
			//this.procesarmayorizarSessionBean.setConGuardarRelaciones(false);			
			this.procesarmayorizarSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesarMayorizar.jTabbedPaneRelacionesProcesarMayorizar.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesarMayorizar() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesarMayorizar procesarmayorizarAux:this.procesarmayorizarLogic.getProcesarMayorizars()) {
				if(procesarmayorizarAux.getId().equals(this.iIdNuevoProcesarMayorizar)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesarMayorizar procesarmayorizarAux:this.procesarmayorizars) {
				if(procesarmayorizarAux.getId().equals(this.iIdNuevoProcesarMayorizar)) {
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
	
	public int getIndiceActualProcesarMayorizar(ProcesarMayorizar procesarmayorizar,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesarMayorizar procesarmayorizarAux:this.procesarmayorizarLogic.getProcesarMayorizars()) {
				if(procesarmayorizarAux.getId().equals(procesarmayorizar.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesarMayorizar procesarmayorizarAux:this.procesarmayorizars) {
				if(procesarmayorizarAux.getId().equals(procesarmayorizar.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesarMayorizar(ProcesarMayorizar procesarmayorizarOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesarMayorizar procesarmayorizarAux:this.procesarmayorizarLogic.getProcesarMayorizars()) {
				if(procesarmayorizarAux.getProcesarMayorizarOriginal().getId().equals(procesarmayorizarOriginal.getId())) {
					existe=true;
					procesarmayorizarOriginal.setId(procesarmayorizarAux.getId());
					procesarmayorizarOriginal.setVersionRow(procesarmayorizarAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesarMayorizar procesarmayorizarAux:this.procesarmayorizars) {
				if(procesarmayorizarAux.getProcesarMayorizarOriginal().getId().equals(procesarmayorizarOriginal.getId())) {
					existe=true;
					procesarmayorizarOriginal.setId(procesarmayorizarAux.getId());
					procesarmayorizarOriginal.setVersionRow(procesarmayorizarAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesarMayorizar(Boolean esParaCancelar) throws Exception {
		procesarmayorizarsAux=new ArrayList<ProcesarMayorizar>();
		procesarmayorizarAux=new ProcesarMayorizar();
		
		if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesarMayorizar procesarmayorizarAux:this.procesarmayorizarLogic.getProcesarMayorizars()) {
					if(procesarmayorizarAux.getId()<0) {
						procesarmayorizarsAux.add(procesarmayorizarAux);
					}		
				}
				this.iIdNuevoProcesarMayorizar=0L;
				this.procesarmayorizarLogic.getProcesarMayorizars().removeAll(procesarmayorizarsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesarMayorizar procesarmayorizarAux:this.procesarmayorizars) {
					if(procesarmayorizarAux.getId()<0) {
						procesarmayorizarsAux.add(procesarmayorizarAux);
					}		
				}
				this.iIdNuevoProcesarMayorizar=0L;
				this.procesarmayorizars.removeAll(procesarmayorizarsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesarMayorizar 
					&& this.procesarmayorizarLogic.getProcesarMayorizars().size()>0
					) {
					procesarmayorizarAux=this.procesarmayorizarLogic.getProcesarMayorizars().get(this.procesarmayorizarLogic.getProcesarMayorizars().size() - 1);
				
					if(procesarmayorizarAux.getId()<0) {
						this.procesarmayorizarLogic.getProcesarMayorizars().remove(procesarmayorizarAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesarMayorizar && this.procesarmayorizars.size()>0) {
					procesarmayorizarAux=this.procesarmayorizars.get(this.procesarmayorizars.size() - 1);
				
					if(procesarmayorizarAux.getId()<0) {
						this.procesarmayorizars.remove(procesarmayorizarAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesarMayorizar(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesarmayorizar.getId()<0) {
				this.procesarmayorizarLogic.getProcesarMayorizars().remove(this.procesarmayorizar);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesarmayorizar.getId()<0) {
				this.procesarmayorizars.remove(this.procesarmayorizar);
			}
		}			
	}
	
	public void setEstadosInicialesProcesarMayorizar(List<ProcesarMayorizar> procesarmayorizarsAux) throws Exception {
		ProcesarMayorizarConstantesFunciones.setEstadosInicialesProcesarMayorizar(procesarmayorizarsAux);
	}
	
	public void setEstadosInicialesProcesarMayorizar(ProcesarMayorizar procesarmayorizarAux) throws Exception {
		ProcesarMayorizarConstantesFunciones.setEstadosInicialesProcesarMayorizar(procesarmayorizarAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesarMayorizarActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesarMayorizar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesarMayorizarActual()) {
				if(!this.isEsNuevoProcesarMayorizar) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesarMayorizar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesarMayorizar=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesarMayorizarActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Procesar Mayorizar ?", "MANTENIMIENTO DE Procesar Mayorizar", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesarMayorizar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesarMayorizar procesarmayorizar) throws Exception {
		ProcesarMayorizarConstantesFunciones.seleccionarAsignar(this.procesarmayorizar,procesarmayorizar);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesarMayorizar=this.isPermisoActualizarOriginalProcesarMayorizar;
			
			
			this.seleccionarAsignar(procesarmayorizar);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesarMayorizar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesarmayorizarSessionBean.setsFuncionBusquedaRapida(this.procesarmayorizarSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesarMayorizar) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesarMayorizar(esParaCancelar);				
				this.cancelarNuevoProcesarMayorizar(esParaCancelar);								
			}
			
			this.procesarmayorizar=new ProcesarMayorizar();
			
			this.inicializarProcesarMayorizar();
			
			this.actualizarEstadoCeldasBotonesProcesarMayorizar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesarMayorizar() throws Exception {
		try {
			ProcesarMayorizarConstantesFunciones.inicializarProcesarMayorizar(this.procesarmayorizar);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesarmayorizarLogic.getProcesarMayorizars().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesarMayorizars(String sAccionBusqueda,List<ProcesarMayorizar> procesarmayorizarsParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesarMayorizar"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesarMayorizarMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesarMayorizarMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesarMayorizar"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Procesar Mayorizares");		
		parameters.put("busquedapor", ProcesarMayorizarConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesarMayorizar=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProcesarMayorizarConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProcesarMayorizarConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProcesarMayorizar=new JRBeanArrayDataSource(ProcesarMayorizarJInternalFrame.TraerProcesarMayorizarBeans(procesarmayorizarsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesarMayorizar);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesarMayorizarConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesarMayorizarConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesarMayorizarBean.TraerProcesarMayorizarBeans(procesarmayorizarsParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesarMayorizars(sAccionBusqueda,sTipoArchivoReporte,procesarmayorizarsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesarMayorizars(sAccionBusqueda,sTipoArchivoReporte,procesarmayorizarsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesarMayorizarActionPerformed(null);
					//this.generarExcelReporteProcesarMayorizars(sAccionBusqueda,sTipoArchivoReporte,procesarmayorizarsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesarMayorizars(sAccionBusqueda,sTipoArchivoReporte,procesarmayorizarsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesarMayorizars(sAccionBusqueda,sTipoArchivoReporte,procesarmayorizarsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesarMayorizars(sAccionBusqueda,sTipoArchivoReporte,procesarmayorizarsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesarMayorizars(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesarMayorizar> procesarmayorizarsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarmayorizar";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesarMayorizars");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesarMayorizar("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesarMayorizar procesarmayorizar : procesarmayorizarsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesarMayorizarConstantesFunciones.generarExcelReporteDataProcesarMayorizar("NORMAL",row,workbook,procesarmayorizar,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Mayorizar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesarMayorizar(String sTipo,Row row,Workbook workbook) {
		
		ProcesarMayorizarConstantesFunciones.generarExcelReporteHeaderProcesarMayorizar(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesarMayorizars(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesarMayorizar> procesarmayorizarsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarmayorizar_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesarMayorizars");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesarMayorizar procesarmayorizar : procesarmayorizarsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesarMayorizarConstantesFunciones.getProcesarMayorizarDescripcion(procesarmayorizar));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesarMayorizarConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesarMayorizarConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesarmayorizar.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesarMayorizarConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesarMayorizarConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesarmayorizar.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesarMayorizarConstantesFunciones.LABEL_IDTIPODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesarMayorizarConstantesFunciones.LABEL_IDTIPODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesarmayorizar.gettipodocumento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesarMayorizarConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesarMayorizarConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesarmayorizar.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesarMayorizarConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesarMayorizarConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesarmayorizar.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Mayorizar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesarMayorizars(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesarMayorizar> procesarmayorizarsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesarMayorizar> procesarmayorizarsRespaldo=null;
		
		classes=ProcesarMayorizarConstantesFunciones.getClassesRelationshipsOfProcesarMayorizar(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesarmayorizarLogic.setDatosCliente(this.datosCliente);
		this.procesarmayorizarLogic.setDatosDeep(this.datosDeep);
		this.procesarmayorizarLogic.setIsConDeep(true);
		
		procesarmayorizarsRespaldo=this.procesarmayorizarLogic.getProcesarMayorizars();
		
		this.procesarmayorizarLogic.setProcesarMayorizars(procesarmayorizarsParaReportes);	
		this.procesarmayorizarLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesarmayorizarsParaReportes=this.procesarmayorizarLogic.getProcesarMayorizars();
		this.procesarmayorizarLogic.setProcesarMayorizars(procesarmayorizarsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarmayorizar_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesarMayorizars");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesarMayorizar("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesarMayorizar procesarmayorizar : procesarmayorizarsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesarMayorizar("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesarMayorizarConstantesFunciones.generarExcelReporteDataProcesarMayorizar("NORMAL",row,workbook,procesarmayorizar,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesarMayorizarConstantesFunciones.getProcesarMayorizarDescripcion(procesarmayorizar));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Mayorizar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesarMayorizar.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesarMayorizar.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesarMayorizar.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesarMayorizar.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesarMayorizar() throws Exception {		
		this.startProcessProcesarMayorizar(true);
	}
	
	public void startProcessProcesarMayorizar(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesarMayorizar ,this.jPanelParametrosReportesProcesarMayorizar, this.jScrollPanelDatosProcesarMayorizar,this.jPanelPaginacionProcesarMayorizar, this.jScrollPanelDatosEdicionProcesarMayorizar, this.jPanelAccionesProcesarMayorizar,this.jPanelAccionesFormularioProcesarMayorizar,this.jmenuBarProcesarMayorizar,this.jmenuBarDetalleProcesarMayorizar,this.jTtoolBarProcesarMayorizar,this.jTtoolBarDetalleProcesarMayorizar);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesarMayorizar=this.jTabbedPaneBusquedasProcesarMayorizar; 
		
		final JPanel jPanelParametrosReportesProcesarMayorizar=this.jPanelParametrosReportesProcesarMayorizar;
		//final JScrollPane jScrollPanelDatosProcesarMayorizar=this.jScrollPanelDatosProcesarMayorizar;
		final JTable jTableDatosProcesarMayorizar=this.jTableDatosProcesarMayorizar;		
		final JPanel jPanelPaginacionProcesarMayorizar=this.jPanelPaginacionProcesarMayorizar;
		//final JScrollPane jScrollPanelDatosEdicionProcesarMayorizar=this.jScrollPanelDatosEdicionProcesarMayorizar;
		final JPanel jPanelAccionesProcesarMayorizar=this.jPanelAccionesProcesarMayorizar;
		
		JPanel jPanelCamposAuxiliarProcesarMayorizar=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesarMayorizar=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
			jPanelCamposAuxiliarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jPanelCamposProcesarMayorizar;
			jPanelAccionesFormularioAuxiliarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jPanelAccionesFormularioProcesarMayorizar;
		}
		
		final JPanel jPanelCamposProcesarMayorizar=jPanelCamposAuxiliarProcesarMayorizar;
		final JPanel jPanelAccionesFormularioProcesarMayorizar=jPanelAccionesFormularioAuxiliarProcesarMayorizar;
		
		
		final JMenuBar jmenuBarProcesarMayorizar=this.jmenuBarProcesarMayorizar;
		final JToolBar jTtoolBarProcesarMayorizar=this.jTtoolBarProcesarMayorizar;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesarMayorizar=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesarMayorizar=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
			jmenuBarDetalleAuxiliarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jmenuBarDetalleProcesarMayorizar;
			jTtoolBarDetalleAuxiliarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jTtoolBarDetalleProcesarMayorizar;
		}
		
		final JMenuBar jmenuBarDetalleProcesarMayorizar=jmenuBarDetalleAuxiliarProcesarMayorizar;
		final JToolBar jTtoolBarDetalleProcesarMayorizar=jTtoolBarDetalleAuxiliarProcesarMayorizar;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesarMayorizar;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesarMayorizar;
			processRunnable.jTableDatos=jTableDatosProcesarMayorizar;
			processRunnable.jPanelCampos=jPanelCamposProcesarMayorizar;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesarMayorizar;
			processRunnable.jPanelAcciones=jPanelAccionesProcesarMayorizar;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesarMayorizar;
			
			
			processRunnable.jmenuBar=jmenuBarProcesarMayorizar;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesarMayorizar;
			processRunnable.jTtoolBar=jTtoolBarProcesarMayorizar;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesarMayorizar;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesarMayorizar ,jPanelParametrosReportesProcesarMayorizar,jTableDatosProcesarMayorizar, /*jScrollPanelDatosProcesarMayorizar,*/jPanelCamposProcesarMayorizar,jPanelPaginacionProcesarMayorizar, /*jScrollPanelDatosEdicionProcesarMayorizar,*/ jPanelAccionesProcesarMayorizar,jPanelAccionesFormularioProcesarMayorizar,jmenuBarProcesarMayorizar,jmenuBarDetalleProcesarMayorizar,jTtoolBarProcesarMayorizar,jTtoolBarDetalleProcesarMayorizar);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesarMayorizar ,jPanelParametrosReportesProcesarMayorizar, jScrollPanelDatosProcesarMayorizar,jPanelPaginacionProcesarMayorizar, jScrollPanelDatosEdicionProcesarMayorizar, jPanelAccionesProcesarMayorizar,jPanelAccionesFormularioProcesarMayorizar,jmenuBarProcesarMayorizar,jmenuBarDetalleProcesarMayorizar,jTtoolBarProcesarMayorizar,jTtoolBarDetalleProcesarMayorizar);
						
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
	
	public void finishProcessProcesarMayorizar() {// throws Exception 
		this.finishProcessProcesarMayorizar(true);
	}
	
	public void finishProcessProcesarMayorizar(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesarMayorizar ,this.jPanelParametrosReportesProcesarMayorizar, this.jScrollPanelDatosProcesarMayorizar,this.jPanelPaginacionProcesarMayorizar, this.jScrollPanelDatosEdicionProcesarMayorizar, this.jPanelAccionesProcesarMayorizar,this.jPanelAccionesFormularioProcesarMayorizar,this.jmenuBarProcesarMayorizar,this.jmenuBarDetalleProcesarMayorizar,this.jTtoolBarProcesarMayorizar,this.jTtoolBarDetalleProcesarMayorizar);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesarMayorizar=this.jTabbedPaneBusquedasProcesarMayorizar; 
		
		final JPanel jPanelParametrosReportesProcesarMayorizar=this.jPanelParametrosReportesProcesarMayorizar;
		//final JScrollPane jScrollPanelDatosProcesarMayorizar=this.jScrollPanelDatosProcesarMayorizar;
		final JTable jTableDatosProcesarMayorizar=this.jTableDatosProcesarMayorizar;		
		final JPanel jPanelPaginacionProcesarMayorizar=this.jPanelPaginacionProcesarMayorizar;
		//final JScrollPane jScrollPanelDatosEdicionProcesarMayorizar=this.jScrollPanelDatosEdicionProcesarMayorizar;
		final JPanel jPanelAccionesProcesarMayorizar=this.jPanelAccionesProcesarMayorizar;
		
		JPanel jPanelCamposAuxiliarProcesarMayorizar=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesarMayorizar=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
			jPanelCamposAuxiliarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jPanelCamposProcesarMayorizar;
			jPanelAccionesFormularioAuxiliarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jPanelAccionesFormularioProcesarMayorizar;
		}
		
		final JPanel jPanelCamposProcesarMayorizar=jPanelCamposAuxiliarProcesarMayorizar;
		final JPanel jPanelAccionesFormularioProcesarMayorizar=jPanelAccionesFormularioAuxiliarProcesarMayorizar;
		
		
		final JMenuBar jmenuBarProcesarMayorizar=this.jmenuBarProcesarMayorizar;		
		final JToolBar jTtoolBarProcesarMayorizar=this.jTtoolBarProcesarMayorizar;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesarMayorizar=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesarMayorizar=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
			jmenuBarDetalleAuxiliarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jmenuBarDetalleProcesarMayorizar;
			jTtoolBarDetalleAuxiliarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jTtoolBarDetalleProcesarMayorizar;		
		}
		
		final JMenuBar jmenuBarDetalleProcesarMayorizar=jmenuBarDetalleAuxiliarProcesarMayorizar;
		final JToolBar jTtoolBarDetalleProcesarMayorizar=jTtoolBarDetalleAuxiliarProcesarMayorizar;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesarMayorizar;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesarMayorizar;
			processRunnable.jTableDatos=jTableDatosProcesarMayorizar;
			processRunnable.jPanelCampos=jPanelCamposProcesarMayorizar;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesarMayorizar;
			processRunnable.jPanelAcciones=jPanelAccionesProcesarMayorizar;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesarMayorizar;
			
			
			processRunnable.jmenuBar=jmenuBarProcesarMayorizar;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesarMayorizar;
			processRunnable.jTtoolBar=jTtoolBarProcesarMayorizar;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesarMayorizar;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesarMayorizar ,jPanelParametrosReportesProcesarMayorizar, jTableDatosProcesarMayorizar,/*jScrollPanelDatosProcesarMayorizar,*/jPanelCamposProcesarMayorizar,jPanelPaginacionProcesarMayorizar, /*jScrollPanelDatosEdicionProcesarMayorizar,*/ jPanelAccionesProcesarMayorizar,jPanelAccionesFormularioProcesarMayorizar,jmenuBarProcesarMayorizar,jmenuBarDetalleProcesarMayorizar,jTtoolBarProcesarMayorizar,jTtoolBarDetalleProcesarMayorizar));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesarMayorizar(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesarMayorizar(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesarMayorizar(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesarMayorizar(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesarMayorizar,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesarMayorizar,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesarMayorizar(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesarMayorizar,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesarMayorizar,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesarmayorizarConstantesFunciones.getsFinalQueryProcesarMayorizar();
		String  finalQueryPaginacionTodos=this.procesarmayorizarConstantesFunciones.getsFinalQueryProcesarMayorizar();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesarMayorizarConstantesFunciones.getArrayColumnasGlobalesNoProcesarMayorizar(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesarMayorizarConstantesFunciones.getArrayColumnasGlobalesProcesarMayorizar(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesarMayorizarConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesarmayorizarsEliminados= new ArrayList<ProcesarMayorizar>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesarMayorizar();
		
				///*ProcesarMayorizarSessionBean*/this.procesarmayorizarSessionBean=new ProcesarMayorizarSessionBean();
			
			if(this.procesarmayorizarSessionBean==null) {
				this.procesarmayorizarSessionBean=new ProcesarMayorizarSessionBean();
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
					this.iNumeroPaginacion=ProcesarMayorizarConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesarMayorizarConstantesFunciones.getClassesForeignKeysOfProcesarMayorizar(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesarmayorizar."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesarmayorizarsAux= new ArrayList<ProcesarMayorizar>();
			
				
			procesarmayorizarLogic.setDatosCliente(this.datosCliente);
			procesarmayorizarLogic.setDatosDeep(this.datosDeep);
			procesarmayorizarLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesarMayorizar")) {
				this.sDetalleReporte=ProcesarMayorizarConstantesFunciones.getDetalleIndiceBusquedaProcesarMayorizar(id_anioBusquedaProcesarMayorizar,id_mesBusquedaProcesarMayorizar,id_tipo_documentoBusquedaProcesarMayorizar);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesarmayorizarLogic.getProcesarMayorizarsBusquedaProcesarMayorizar(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_anioBusquedaProcesarMayorizar,id_mesBusquedaProcesarMayorizar,id_tipo_documentoBusquedaProcesarMayorizar);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesarMayorizarConstantesFunciones.getDetalleIndiceBusquedaProcesarMayorizar(id_anioBusquedaProcesarMayorizar,id_mesBusquedaProcesarMayorizar,id_tipo_documentoBusquedaProcesarMayorizar);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesarMayorizarConstantesFunciones.getDetalleIndiceBusquedaProcesarMayorizar(id_anioBusquedaProcesarMayorizar,id_mesBusquedaProcesarMayorizar,id_tipo_documentoBusquedaProcesarMayorizar);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesarmayorizarLogic.getProcesarMayorizars()==null||procesarmayorizarLogic.getProcesarMayorizars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesarmayorizars==null|| procesarmayorizars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesarmayorizarsAux=new ArrayList<ProcesarMayorizar>();
						procesarmayorizarsAux.addAll(procesarmayorizarLogic.getProcesarMayorizars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesarmayorizarsAux=new ArrayList<ProcesarMayorizar>();
							procesarmayorizarsAux.addAll(procesarmayorizars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesarmayorizarLogic.getProcesarMayorizarsBusquedaProcesarMayorizar(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_anioBusquedaProcesarMayorizar,id_mesBusquedaProcesarMayorizar,id_tipo_documentoBusquedaProcesarMayorizar);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesarMayorizarConstantesFunciones.getDetalleIndiceBusquedaProcesarMayorizar(id_anioBusquedaProcesarMayorizar,id_mesBusquedaProcesarMayorizar,id_tipo_documentoBusquedaProcesarMayorizar);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesarMayorizarConstantesFunciones.getDetalleIndiceBusquedaProcesarMayorizar(id_anioBusquedaProcesarMayorizar,id_mesBusquedaProcesarMayorizar,id_tipo_documentoBusquedaProcesarMayorizar);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesarMayorizars("BusquedaProcesarMayorizar",procesarmayorizarLogic.getProcesarMayorizars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesarMayorizars("BusquedaProcesarMayorizar",procesarmayorizars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesarmayorizarLogic.setProcesarMayorizars(new ArrayList<ProcesarMayorizar>());
						procesarmayorizarLogic.getProcesarMayorizars().addAll(procesarmayorizarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesarmayorizars=new ArrayList<ProcesarMayorizar>();
							procesarmayorizars.addAll(procesarmayorizarsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesarMayorizar();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesarMayorizar();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesarmayorizarLogic.getProcesarMayorizars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesarmayorizars.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesarmayorizarLogic.getProcesarMayorizars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesarmayorizars.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesarMayorizar procesarmayorizar) {
		Boolean permite=true;
		
		if(this.procesarmayorizar.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesarMayorizarConstantesFunciones.getOrderByListaProcesarMayorizar();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesarMayorizarConstantesFunciones.getOrderByListaProcesarMayorizar();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesarMayorizar procesarmayorizar:procesarmayorizarLogic.getProcesarMayorizars()) {
				if(procesarmayorizar.getsType().equals(Constantes2.S_TOTALES)) {
					procesarmayorizarTotales=procesarmayorizar;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesarMayorizar procesarmayorizar:this.procesarmayorizars) {
				if(procesarmayorizar.getsType().equals(Constantes2.S_TOTALES)) {
					procesarmayorizarTotales=procesarmayorizar;
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
			this.procesarmayorizarAux=new ProcesarMayorizar();
			this.procesarmayorizarAux.setsType(Constantes2.S_TOTALES);
			this.procesarmayorizarAux.setIsNew(false);
			this.procesarmayorizarAux.setIsChanged(false);
			this.procesarmayorizarAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesarMayorizarConstantesFunciones.TotalizarValoresFilaProcesarMayorizar(this.procesarmayorizarLogic.getProcesarMayorizars(),this.procesarmayorizarAux);
				
				//this.procesarmayorizarLogic.getProcesarMayorizars().add(this.procesarmayorizarAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesarMayorizarConstantesFunciones.TotalizarValoresFilaProcesarMayorizar(this.procesarmayorizars,this.procesarmayorizarAux);
				
				this.procesarmayorizars.add(this.procesarmayorizarAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesarmayorizarTotales=new ProcesarMayorizar();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesarmayorizarLogic.getProcesarMayorizars().remove(procesarmayorizarTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesarmayorizars.remove(procesarmayorizarTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesarmayorizarTotales=new ProcesarMayorizar();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesarMayorizar procesarmayorizar:procesarmayorizarLogic.getProcesarMayorizars()) {
				if(procesarmayorizar.getsType().equals(Constantes2.S_TOTALES)) {
					procesarmayorizarTotales=procesarmayorizar;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesarMayorizarConstantesFunciones.TotalizarValoresFilaProcesarMayorizar(this.procesarmayorizarLogic.getProcesarMayorizars(),procesarmayorizarTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesarMayorizar procesarmayorizar:this.procesarmayorizars) {
				if(procesarmayorizar.getsType().equals(Constantes2.S_TOTALES)) {
					procesarmayorizarTotales=procesarmayorizar;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesarMayorizarConstantesFunciones.TotalizarValoresFilaProcesarMayorizar(this.procesarmayorizars,procesarmayorizarTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesarMayorizarsBusquedaProcesarMayorizar()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesarMayorizar";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesarMayorizarsFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesarMayorizarsFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesarMayorizarsFK_IdTipoDocumento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoDocumento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesarMayorizarsBusquedaProcesarMayorizar(String sFinalQuery,Long id_anio,Long id_mes,Long id_tipo_documento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesarmayorizarLogic.getProcesarMayorizarsBusquedaProcesarMayorizar(sFinalQuery,this.pagination,id_anio,id_mes,id_tipo_documento);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesarMayorizarsFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesarmayorizarLogic.getProcesarMayorizarsFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesarMayorizarsFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesarmayorizarLogic.getProcesarMayorizarsFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesarMayorizarsFK_IdTipoDocumento(String sFinalQuery,Long id_tipo_documento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesarmayorizarLogic.getProcesarMayorizarsFK_IdTipoDocumento(sFinalQuery,this.pagination,id_tipo_documento);
				
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
	
	public void inicializarPermisosProcesarMayorizar() {
		this.isPermisoTodoProcesarMayorizar=false;
		this.isPermisoNuevoProcesarMayorizar=false;
		this.isPermisoActualizarProcesarMayorizar=false;
		this.isPermisoActualizarOriginalProcesarMayorizar=false;
		this.isPermisoEliminarProcesarMayorizar=false;
		this.isPermisoGuardarCambiosProcesarMayorizar=false;
		this.isPermisoConsultaProcesarMayorizar=true;
		this.isPermisoBusquedaProcesarMayorizar=true;
		this.isPermisoReporteProcesarMayorizar=true;
		this.isPermisoOrdenProcesarMayorizar=false;		
		this.isPermisoPaginacionMedioProcesarMayorizar=false;		
		this.isPermisoPaginacionAltoProcesarMayorizar=false;		
		this.isPermisoPaginacionTodoProcesarMayorizar=false;		
		this.isPermisoCopiarProcesarMayorizar=false;		
		this.isPermisoVerFormProcesarMayorizar=false;		
		this.isPermisoDuplicarProcesarMayorizar=false;
		this.isPermisoOrdenProcesarMayorizar=false;
	}
	
	public void setPermisosUsuarioProcesarMayorizar(Boolean isPermiso) {
		this.isPermisoTodoProcesarMayorizar=isPermiso;
		this.isPermisoNuevoProcesarMayorizar=isPermiso;
		this.isPermisoActualizarProcesarMayorizar=isPermiso;
		this.isPermisoActualizarOriginalProcesarMayorizar=isPermiso;
		this.isPermisoEliminarProcesarMayorizar=isPermiso;
		this.isPermisoGuardarCambiosProcesarMayorizar=isPermiso;
		this.isPermisoConsultaProcesarMayorizar=isPermiso;
		this.isPermisoBusquedaProcesarMayorizar=isPermiso;
		this.isPermisoReporteProcesarMayorizar=isPermiso;
		this.isPermisoOrdenProcesarMayorizar=isPermiso;		
		this.isPermisoPaginacionMedioProcesarMayorizar=isPermiso;		
		this.isPermisoPaginacionAltoProcesarMayorizar=isPermiso;		
		this.isPermisoPaginacionTodoProcesarMayorizar=isPermiso;		
		this.isPermisoCopiarProcesarMayorizar=isPermiso;		
		this.isPermisoVerFormProcesarMayorizar=isPermiso;		
		this.isPermisoDuplicarProcesarMayorizar=isPermiso;
		this.isPermisoOrdenProcesarMayorizar=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesarMayorizar(Boolean isPermiso) {
		//this.isPermisoTodoProcesarMayorizar=isPermiso;
		this.isPermisoNuevoProcesarMayorizar=isPermiso;
		this.isPermisoActualizarProcesarMayorizar=isPermiso;
		this.isPermisoActualizarOriginalProcesarMayorizar=isPermiso;
		this.isPermisoEliminarProcesarMayorizar=isPermiso;
		this.isPermisoGuardarCambiosProcesarMayorizar=isPermiso;
		//this.isPermisoConsultaProcesarMayorizar=isPermiso;
		//this.isPermisoBusquedaProcesarMayorizar=isPermiso;
		//this.isPermisoReporteProcesarMayorizar=isPermiso;
		//this.isPermisoOrdenProcesarMayorizar=isPermiso;		
		//this.isPermisoPaginacionMedioProcesarMayorizar=isPermiso;		
		//this.isPermisoPaginacionAltoProcesarMayorizar=isPermiso;		
		//this.isPermisoPaginacionTodoProcesarMayorizar=isPermiso;		
		//this.isPermisoCopiarProcesarMayorizar=isPermiso;		
		//this.isPermisoDuplicarProcesarMayorizar=isPermiso;
		//this.isPermisoOrdenProcesarMayorizar=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesarMayorizarClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesarMayorizarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesarMayorizar(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesarMayorizarClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesarMayorizarClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesarMayorizarClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesarMayorizarClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesarMayorizar() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesarMayorizarJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesarMayorizarConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesarMayorizar=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesarMayorizar=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesarMayorizar=this.isPermisoActualizarProcesarMayorizar;
			this.isPermisoEliminarProcesarMayorizar=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesarMayorizar=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesarMayorizar=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesarMayorizar=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesarMayorizar=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesarMayorizar=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesarMayorizar=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesarMayorizar=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesarMayorizar=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesarMayorizar=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesarMayorizar=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesarMayorizar=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesarMayorizar=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesarMayorizar=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesarMayorizar.setToolTipText(this.jTableDatosProcesarMayorizar.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesarMayorizar(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesarMayorizar(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesarMayorizarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesarMayorizarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesarMayorizar() throws Exception {
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
	public void inicializarCombosForeignKeyProcesarMayorizarListas()throws Exception {
		try	{						
			
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
				this.tipodocumentosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesarMayorizarListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesarMayorizarJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoDocumentoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoDocumentoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipodocumentosForeignKey==null||this.tipodocumentosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoDocumentoConstantesFunciones.getArrayColumnasGlobalesTipoDocumento(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDocumentoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoDocumentoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoDocumentosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesarMayorizar()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
			this.addItemDefectoCombosForeignKeyTipoDocumento();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {
			if(this.procesarmayorizarSessionBean==null) {
				this.procesarmayorizarSessionBean=new ProcesarMayorizarSessionBean();
			}

			if(!this.procesarmayorizarSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

			if(!this.procesarmayorizarSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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

	public void addItemDefectoCombosForeignKeyTipoDocumento()throws Exception {
		try {

			if(!this.procesarmayorizarSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumento()) {
				TipoDocumento tipodocumento=new TipoDocumento();
				TipoDocumentoConstantesFunciones.setTipoDocumentoDescripcion(tipodocumento,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipodocumento.setId(null);

				if(!TipoDocumentoConstantesFunciones.ExisteEnLista(this.tipodocumentosForeignKey,tipodocumento,true)) {

					this.tipodocumentosForeignKey.add(0,tipodocumento);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProcesarMayorizar()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesarMayorizar(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesarMayorizar()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesarMayorizar();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesarMayorizar(ProcesarMayorizar procesarmayorizar)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesarMayorizar(ProcesarMayorizar procesarmayorizar,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesarMayorizar()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesarMayorizar()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesarMayorizar()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesarMayorizar()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesarMayorizar()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesarMayorizar()throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");
			this.cargarCombosFrameTipoDocumentosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesarMayorizar(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoDocumentosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesarMayorizar()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_anioProcesarMayorizar!=null && this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_anioProcesarMayorizar.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_anioProcesarMayorizar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_mesProcesarMayorizar!=null && this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_mesProcesarMayorizar.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_mesProcesarMayorizar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_tipo_documentoProcesarMayorizar!=null && this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_tipo_documentoProcesarMayorizar.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_tipo_documentoProcesarMayorizar.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ProcesarMayorizarBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesarMayorizarBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesarMayorizarBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesarmayorizarSessionBean=new ProcesarMayorizarSessionBean(); 
		this.procesarmayorizarConstantesFunciones=new ProcesarMayorizarConstantesFunciones(); 
		this.procesarmayorizarBean=new ProcesarMayorizar();//(this.procesarmayorizarConstantesFunciones); 		
		this.procesarmayorizarReturnGeneral=new ProcesarMayorizarParameterReturnGeneral(); 
		
		this.procesarmayorizarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesarmayorizarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesarMayorizarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesarMayorizarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesarMayorizarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesarMayorizar(true);
			
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
			
			this.procesarmayorizarConstantesFunciones=new ProcesarMayorizarConstantesFunciones(); 
			this.procesarmayorizarBean=new ProcesarMayorizar();//this.procesarmayorizarConstantesFunciones); 			
			this.procesarmayorizarReturnGeneral=new ProcesarMayorizarParameterReturnGeneral(); 
		
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Procesar Mayorizar Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesarmayorizar=new ProcesarMayorizar();
			this.procesarmayorizars = new ArrayList<ProcesarMayorizar>();
			this.procesarmayorizarsAux = new ArrayList<ProcesarMayorizar>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic=new ProcesarMayorizarLogic();
				this.procesarmayorizarLogic.getNewConnexionToDeep("");
			}
			
			//this.procesarmayorizarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesarmayorizarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesarMayorizar);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesarMayorizar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesarMayorizar);	
					}
					
					if(this.jInternalFrameImportacionProcesarMayorizar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesarMayorizar);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesarMayorizar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesarMayorizar);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesarMayorizar);
				this.jInternalFrameDetalleFormProcesarMayorizar.setVisible(false);
				this.jInternalFrameDetalleFormProcesarMayorizar.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesarMayorizar!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesarMayorizar);
					this.jInternalFrameReporteDinamicoProcesarMayorizar.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesarMayorizar.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesarMayorizar!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesarMayorizar);
					this.jInternalFrameImportacionProcesarMayorizar.setVisible(false);
					this.jInternalFrameImportacionProcesarMayorizar.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesarMayorizar!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesarMayorizar);
					this.jInternalFrameOrderByProcesarMayorizar.setVisible(false);
					this.jInternalFrameOrderByProcesarMayorizar.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesarMayorizarActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesarMayorizarConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesarmayorizarReturnGeneral=new ProcesarMayorizarParameterReturnGeneral();
			
			this.procesarmayorizarParameterGeneral=new ProcesarMayorizarParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesarmayorizarLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesarMayorizarJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesarMayorizarConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesarmayorizarSessionBean.getEsGuardarRelacionado(),this.procesarmayorizarSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesarMayorizarConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesarmayorizarSessionBean.getEsGuardarRelacionado(),this.procesarmayorizarSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesarMayorizar=false;
			this.isVisibilidadCeldaDuplicarProcesarMayorizar=true;
			this.isVisibilidadCeldaCopiarProcesarMayorizar=true;
			this.isVisibilidadCeldaVerFormProcesarMayorizar=true;
			this.isVisibilidadCeldaOrdenProcesarMayorizar=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar=false;
			this.isVisibilidadCeldaModificarProcesarMayorizar=false;
			this.isVisibilidadCeldaActualizarProcesarMayorizar=false;
			this.isVisibilidadCeldaEliminarProcesarMayorizar=false;
			this.isVisibilidadCeldaCancelarProcesarMayorizar=false;
			this.isVisibilidadCeldaGuardarProcesarMayorizar=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarMayorizar=false;
			
			
			this.isVisibilidadBusquedaProcesarMayorizar=true;
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdTipoDocumento=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesarMayorizar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesarMayorizar();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesarMayorizar(false);
			
			this.setPermisosUsuarioProcesarMayorizar();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado() 
				|| (this.procesarmayorizarSessionBean.getEsGuardarRelacionado() && this.procesarmayorizarSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesarMayorizarClasesRelacionadas();
			}
			
			if(this.procesarmayorizarSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesarMayorizarClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesarMayorizar();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesarMayorizar();
			}
			
			if(!this.isPermisoBusquedaProcesarMayorizar) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesarMayorizar.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesarMayorizarConstantesFunciones.getTiposSeleccionarProcesarMayorizar());
				
				this.tiposColumnasSelect=ProcesarMayorizarConstantesFunciones.getTiposSeleccionarProcesarMayorizar(true);
				
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
			//if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesarMayorizar();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesarMayorizar(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesarMayorizar(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesarMayorizar() ;
			
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
			
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			this.tipodocumentoLogic=new TipoDocumentoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesarmayorizarImplementable= (ProcesarMayorizarImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesarMayorizarConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesarmayorizarImplementableHome= (ProcesarMayorizarImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesarMayorizarConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesarmayorizars= new ArrayList<ProcesarMayorizar>();
			this.procesarmayorizarsEliminados= new ArrayList<ProcesarMayorizar>();
						
			this.isEsNuevoProcesarMayorizar=false;
			this.esParaAccionDesdeFormularioProcesarMayorizar=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			this.tipodocumentosForeignKey=new ArrayList<TipoDocumento>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesarMayorizar(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesarMayorizar();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesarMayorizarConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesarMayorizar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesarMayorizar(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesarMayorizar();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesarMayorizar();
			}
			
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesarMayorizar.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesarMayorizar.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesarMayorizar.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesarMayorizar(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesarMayorizar: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesarMayorizar() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesarMayorizar")) {
				iIndex=this.jInternalFrameDetalleFormProcesarMayorizar.jTabbedPaneRelacionesProcesarMayorizar.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesarMayorizar.jTabbedPaneRelacionesProcesarMayorizar.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesarMayorizar();	
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
	
	public void cargarCombosForeignKeyProcesarMayorizar(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesarMayorizar(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesarMayorizar(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesarMayorizarListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesarMayorizar();
		
		this.cargarCombosFrameForeignKeyProcesarMayorizar();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesarMayorizar();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesarMayorizar();
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

	public void cargarCombosForeignKeyTipoDocumento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoDocumentoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoDocumento();
				this.cargarCombosFrameTipoDocumentosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoDocumento(this.tipodocumentosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProcesarMayorizarActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesarmayorizarSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesarMayorizar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
			
			
			if(jTableDatosProcesarMayorizar.getRowCount()>=1) {
				jTableDatosProcesarMayorizar.removeRowSelectionInterval(0, jTableDatosProcesarMayorizar.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesarMayorizar=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesarMayorizar(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesarMayorizar(true);			
			//this.procesarmayorizar=new ProcesarMayorizar();
			//this.procesarmayorizar.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesarMayorizar(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesarMayorizar() ;
			
			if(ProcesarMayorizarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesarMayorizar(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesarmayorizar);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesarmayorizar);				
			
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
			
			if(this.procesarmayorizarSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesarMayorizar: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesarMayorizarActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesarMayorizar> procesarmayorizarsSeleccionados=new ArrayList<ProcesarMayorizar>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesarMayorizar.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesarMayorizar.getSelectedRows().length;			
			}
			
			procesarmayorizarsSeleccionados=this.getProcesarMayorizarsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesarMayorizar--;			
				//ProcesarMayorizar procesarmayorizarAux= new ProcesarMayorizar();			
				//procesarmayorizarAux.setId(this.iIdNuevoProcesarMayorizar);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesarMayorizar procesarmayorizarOrigen=new ProcesarMayorizar();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesarMayorizar procesarmayorizarOrigen : procesarmayorizarsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesarmayorizarOrigen =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesarmayorizarOrigen =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesarMayorizar();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesarmayorizar.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesarMayorizar(procesarmayorizarOrigen,this.procesarmayorizar,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesarmayorizarLogic.getProcesarMayorizars().add(this.procesarmayorizarAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesarmayorizars.add(this.procesarmayorizarAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesarMayorizar(false);
				
				this.jTableDatosProcesarMayorizar.setRowSelectionInterval(this.getIndiceNuevoProcesarMayorizar(), this.getIndiceNuevoProcesarMayorizar());
				
				int iLastRow =  this.jTableDatosProcesarMayorizar.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesarMayorizar.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesarMayorizar.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesarMayorizar(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesarMayorizar> procesarmayorizarsSeleccionados=new ArrayList<ProcesarMayorizar>();									
		
			ProcesarMayorizar procesarmayorizarOrigen=new ProcesarMayorizar();
			ProcesarMayorizar procesarmayorizarDestino=new ProcesarMayorizar();
				
			procesarmayorizarsSeleccionados=this.getProcesarMayorizarsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesarMayorizar.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesarmayorizarsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesarMayorizar.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesarmayorizarOrigen =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesarmayorizarOrigen =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesarmayorizarDestino =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesarmayorizarDestino =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesarmayorizarOrigen =procesarmayorizarsSeleccionados.get(0);
				procesarmayorizarDestino =procesarmayorizarsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesarMayorizar(procesarmayorizarOrigen,procesarmayorizarDestino,true,false);
				
				procesarmayorizarDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesarmayorizarDestino,procesarmayorizarLogic.getProcesarMayorizars());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesarmayorizarDestino,procesarmayorizars);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesarMayorizar(false);
				
				//this.jTableDatosProcesarMayorizar.setRowSelectionInterval(this.getIndiceNuevoProcesarMayorizar(), this.getIndiceNuevoProcesarMayorizar());
				
				int iLastRow =  this.jTableDatosProcesarMayorizar.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesarMayorizar.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesarMayorizar.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesarMayorizar(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesarMayorizar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesarMayorizar.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesarMayorizar.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesarMayorizar.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesarMayorizar.setVisible(!isVisible);
			this.jPanelPaginacionProcesarMayorizar.setVisible(!isVisible);
			this.jPanelAccionesProcesarMayorizar.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesarMayorizar();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesarMayorizar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesarMayorizar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesarMayorizar();
			
			this.abrirFrameOrderByProcesarMayorizar();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesarMayorizar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesarMayorizar(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesarMayorizar);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesarMayorizar.isMaximum()) {
					this.jInternalFrameDetalleFormProcesarMayorizar.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesarMayorizar.setSize(this.jInternalFrameDetalleFormProcesarMayorizar.iWidthFormulario,this.jInternalFrameDetalleFormProcesarMayorizar.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesarMayorizar.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesarMayorizar.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesarMayorizar.isMaximum()) {
						this.jInternalFrameDetalleFormProcesarMayorizar.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesarMayorizar.jContentPaneDetalleProcesarMayorizar.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesarMayorizar.jTabbedPaneRelacionesProcesarMayorizar.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesarMayorizar.jContentPaneDetalleProcesarMayorizar.getWidth(),ProcesarMayorizarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesarMayorizar.jTabbedPaneRelacionesProcesarMayorizar.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesarMayorizar.jContentPaneDetalleProcesarMayorizar.getWidth(),ProcesarMayorizarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesarMayorizar.jTabbedPaneRelacionesProcesarMayorizar.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesarMayorizar.jContentPaneDetalleProcesarMayorizar.getWidth(),ProcesarMayorizarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesarMayorizar.setVisible(true);
	        this.jInternalFrameDetalleFormProcesarMayorizar.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesarMayorizar() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesarMayorizar==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesarMayorizar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesarMayorizar,false,this);
				} else {
					this.jInternalFrameOrderByProcesarMayorizar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesarMayorizar,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesarMayorizar);
				this.jInternalFrameOrderByProcesarMayorizar.setVisible(false);
				this.jInternalFrameOrderByProcesarMayorizar.setSelected(false);
				
				this.jInternalFrameOrderByProcesarMayorizar.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesarMayorizar"));
				
				this.inicializarActualizarBindingTablaOrderByProcesarMayorizar();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesarMayorizar() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesarMayorizar==null) {
				
				this.jInternalFrameImportacionProcesarMayorizar=new ImportacionJInternalFrame(ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesarMayorizar);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesarMayorizar);
				this.jInternalFrameImportacionProcesarMayorizar.setVisible(false);
				this.jInternalFrameImportacionProcesarMayorizar.setSelected(false);


				this.jInternalFrameImportacionProcesarMayorizar.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesarMayorizar"));
				this.jInternalFrameImportacionProcesarMayorizar.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesarMayorizar"));
				this.jInternalFrameImportacionProcesarMayorizar.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesarMayorizar"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesarMayorizar() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesarMayorizar==null) {
				this.jInternalFrameReporteDinamicoProcesarMayorizar=new ReporteDinamicoJInternalFrame(ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesarMayorizar);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesarMayorizar);
				this.jInternalFrameReporteDinamicoProcesarMayorizar.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesarMayorizar.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesarMayorizar.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesarMayorizar"));
				this.jInternalFrameReporteDinamicoProcesarMayorizar.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesarMayorizar"));
				this.jInternalFrameReporteDinamicoProcesarMayorizar.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesarMayorizar"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesarMayorizar();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesarMayorizar() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesarMayorizar);
			
	       	this.jInternalFrameDetalleFormProcesarMayorizar.setVisible(false);
	        this.jInternalFrameDetalleFormProcesarMayorizar.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesarMayorizar.dispose();
			//this.jInternalFrameDetalleFormProcesarMayorizar=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesarMayorizar() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesarMayorizar.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesarMayorizar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesarMayorizar() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesarMayorizar.setVisible(true);
	        this.jInternalFrameImportacionProcesarMayorizar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesarMayorizar() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesarMayorizar.setVisible(true);
	        this.jInternalFrameOrderByProcesarMayorizar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesarMayorizar() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesarMayorizar.setVisible(false);
	        this.jInternalFrameOrderByProcesarMayorizar.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesarMayorizar() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesarMayorizar.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesarMayorizar.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesarMayorizar() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesarMayorizar.setVisible(false);
	        this.jInternalFrameImportacionProcesarMayorizar.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesarMayorizar(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesarMayorizar(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesarMayorizar(true);
			//this.isEsNuevoProcesarMayorizar=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesarMayorizar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesarMayorizar(false) ;
			
			if(procesarmayorizarSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesarMayorizarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesarMayorizar(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesarMayorizar(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesarMayorizarActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesarMayorizar(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesarMayorizar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesarMayorizar(true);
			//this.isEsNuevoProcesarMayorizar=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesarmayorizar.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesarMayorizar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesarMayorizar(false) ;
			
			if(ProcesarMayorizarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesarMayorizar(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesarMayorizar(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosProcesarMayorizar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarMayorizar,ProcesarMayorizarConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesarMayorizar.getSelectedRow();

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
		TableColumn tableColumnMes=this.jTableDatosProcesarMayorizar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarMayorizar,ProcesarMayorizarConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesarMayorizar.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoDocumento(List<TipoDocumento> tipodocumentosForeignKey)throws Exception{
		TableColumn tableColumnTipoDocumento=this.jTableDatosProcesarMayorizar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarMayorizar,ProcesarMayorizarConstantesFunciones.LABEL_IDTIPODOCUMENTO));
		TableCellEditor tableCellEditorTipoDocumento =tableColumnTipoDocumento.getCellEditor();

		TipoDocumentoTableCell tipodocumentoTableCellFk=(TipoDocumentoTableCell)tableCellEditorTipoDocumento;

		if(tipodocumentoTableCellFk!=null) {
			tipodocumentoTableCellFk.settipodocumentosForeignKey(tipodocumentosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesarMayorizar.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipodocumentoTableCellFk.setRowActual(intSelectedRow);
			//tipodocumentoTableCellFk.settipodocumentosForeignKeyActual(tipodocumentosForeignKey);
		//}


		if(tipodocumentoTableCellFk!=null) {
			tipodocumentoTableCellFk.RecargarTipoDocumentosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesarMayorizar(false);
			
			//if(!this.isEsNuevoProcesarMayorizar) {								
				int intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.procesarmayorizar,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);
				
			}
			
			if(this.permiteMantenimiento(this.procesarmayorizar)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesarMayorizar=true;
					this.inicializarActualizarBindingTablaProcesarMayorizar(false);
					this.isEsNuevoProcesarMayorizar=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesarMayorizar=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesarMayorizar=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesarMayorizar(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesarMayorizar(false);
				
				this.habilitarDeshabilitarControlesProcesarMayorizar(false);
			
												
				
				if(ProcesarMayorizarJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesarMayorizar();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesarMayorizarActionPerformed(evt,procesarmayorizarSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesarMayorizar(this.procesarmayorizar,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesarMayorizar.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesarmayorizarSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesarmayorizar.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesarMayorizar.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarMayorizar.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				this.procesarmayorizar.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				this.procesarmayorizar.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesarmayorizar)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesarMayorizarModel) this.jTableDatosProcesarMayorizar.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesarMayorizar=true;
				this.inicializarActualizarBindingTablaProcesarMayorizar(false);
				this.isEsNuevoProcesarMayorizar=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesarMayorizar(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesarMayorizar(false);
				
				this.habilitarDeshabilitarControlesProcesarMayorizar(false);
				
				
				
				if(ProcesarMayorizarJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesarMayorizar();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesarMayorizar.getRowCount()>=1) {
				jTableDatosProcesarMayorizar.removeRowSelectionInterval(0, jTableDatosProcesarMayorizar.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesarMayorizar(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesarMayorizar(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesarMayorizar(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesarMayorizar(false) ;
			
			this.isEsNuevoProcesarMayorizar=false;
			
			if(ProcesarMayorizarJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesarMayorizar();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesarMayorizar(false);
				
				//SI ES MANUAL
				if(ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesarMayorizar();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesarMayorizar--;			
			//ProcesarMayorizar procesarmayorizarAux= new ProcesarMayorizar();			
			//procesarmayorizarAux.setId(this.iIdNuevoProcesarMayorizar);
			
			if(this.jInternalFrameDetalleFormProcesarMayorizar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesarMayorizar();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);
			
			this.procesarmayorizar.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesarmayorizarLogic.getProcesarMayorizars().add(this.procesarmayorizarAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesarmayorizars.add(this.procesarmayorizarAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesarMayorizar(false);
			
			this.jTableDatosProcesarMayorizar.setRowSelectionInterval(this.getIndiceNuevoProcesarMayorizar(), this.getIndiceNuevoProcesarMayorizar());
			
			int iLastRow =  this.jTableDatosProcesarMayorizar.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesarMayorizar.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesarMayorizar.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesarMayorizar(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesarMayorizar(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesarMayorizar(false);
			
			//SI ES MANUAL
			if(ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesarMayorizar();
			}
			
			//this.abrirFrameTreeProcesarMayorizar();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesarMayorizar.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesarMayorizar.setFileImportacion(this.jInternalFrameImportacionProcesarMayorizar.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesarMayorizar.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesarMayorizar.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesarMayorizar.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesarMayorizar.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesarMayorizar> procesarmayorizarsSeleccionados=new ArrayList<ProcesarMayorizar>();		

		procesarmayorizarsSeleccionados=this.getProcesarMayorizarsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesarMayorizar.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesarMayorizar.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesarMayorizarBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesarMayorizarBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesarMayorizars("Todos",procesarmayorizarsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Mayorizar",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesarMayorizar.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesarMayorizar.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesarMayorizarConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesarMayorizarConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesarMayorizar.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesarMayorizar.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesarMayorizar.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesarMayorizarConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ProcesarMayorizarConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesarMayorizar.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesarMayorizarConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ProcesarMayorizarConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesarMayorizar.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesarMayorizar.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesarMayorizarConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ProcesarMayorizarConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesarMayorizar> procesarmayorizarsSeleccionados=new ArrayList<ProcesarMayorizar>();		
		
		procesarmayorizarsSeleccionados=this.getProcesarMayorizarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarmayorizar";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesarMayorizars");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesarMayorizar.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesarMayorizar.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesarMayorizarConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesarMayorizarConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(ProcesarMayorizar procesarmayorizar:procesarmayorizarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesarmayorizar.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesarMayorizarConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesarMayorizarConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(ProcesarMayorizar procesarmayorizar:procesarmayorizarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesarmayorizar.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesarMayorizarConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesarMayorizarConstantesFunciones.LABEL_IDTIPODOCUMENTO);
					iRow++;

					for(ProcesarMayorizar procesarmayorizar:procesarmayorizarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesarmayorizar.gettipodocumento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesarMayorizarConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesarMayorizarConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ProcesarMayorizar procesarmayorizar:procesarmayorizarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesarmayorizar.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesarMayorizarConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesarMayorizarConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ProcesarMayorizar procesarmayorizar:procesarmayorizarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesarmayorizar.getnombre());
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
			//	this.getFilaCabeceraExportarExcelProcesarMayorizar(row);				
			//	iRow++;
			//}				
			
			//for(ProcesarMayorizar procesarmayorizarAux:procesarmayorizarsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesarMayorizar(procesarmayorizarAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Mayorizar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesarMayorizar(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesarMayorizar(false);
			
			//SI ES MANUAL
			if(ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesarMayorizar();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesarMayorizar(false);
			
			//SI ES MANUAL
			if(ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesarMayorizar();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesarMayorizar(false);
			
			//SI ES MANUAL
			if(ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesarMayorizar();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesarMayorizar() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesarMayorizar.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesarMayorizar.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesarMayorizar.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesarMayorizar.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesarMayorizar.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesarMayorizar.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesarMayorizar.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesarMayorizar(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesarMayorizar(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesarMayorizar(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesarMayorizar(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesarMayorizar(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesarMayorizar(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesarMayorizar(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesarMayorizar(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesarMayorizar() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesarMayorizar();
		
		this.inicializarActualizarBindingBotonesManualProcesarMayorizar(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesarMayorizar();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesarMayorizar() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesarMayorizar(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesarMayorizar(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesarMayorizar.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesarMayorizar.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesarMayorizar.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesarMayorizar.jCheckBoxPostAccionNuevoProcesarMayorizar.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesarMayorizar.jCheckBoxPostAccionSinCerrarProcesarMayorizar.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesarMayorizar.jCheckBoxPostAccionSinMensajeProcesarMayorizar.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesarMayorizar.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesarMayorizar.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesarMayorizar.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
				this.jInternalFrameDetalleFormProcesarMayorizar.jCheckBoxPostAccionNuevoProcesarMayorizar.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesarMayorizar.jCheckBoxPostAccionSinCerrarProcesarMayorizar.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesarMayorizar.jCheckBoxPostAccionSinMensajeProcesarMayorizar.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesarMayorizar.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesarMayorizar.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxTiposAccionesFormularioProcesarMayorizar.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesarMayorizar.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesarMayorizar!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesarMayorizar.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesarMayorizar.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesarMayorizar.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesarMayorizar.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesarMayorizar.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesarMayorizar!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesarMayorizar.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesarMayorizar.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesarMayorizar.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesarMayorizar(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesarMayorizar(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesarMayorizar() throws Exception {
		try	{
			if(ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesarMayorizar();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesarMayorizar() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxTiposAccionesFormularioProcesarMayorizar.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxTiposAccionesFormularioProcesarMayorizar.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesarMayorizar() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesarMayorizar.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesarMayorizar.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesarMayorizar.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesarMayorizar.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesarMayorizar.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesarMayorizar.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesarMayorizar.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesarMayorizar.addItem(reporte);
			}
			
			
			if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesarMayorizar.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesarMayorizar.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesarMayorizar.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesarMayorizar.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesarMayorizar.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesarMayorizar.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxTiposAccionesFormularioProcesarMayorizar.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxTiposAccionesFormularioProcesarMayorizar.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesarMayorizar.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesarMayorizar.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesarMayorizar.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesarMayorizar();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesarMayorizar() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesarMayorizar!=null) {
				this.jInternalFrameReporteDinamicoProcesarMayorizar.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesarMayorizar.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesarMayorizar!=null) {
				this.jInternalFrameReporteDinamicoProcesarMayorizar.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesarMayorizar.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesarMayorizar!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesarMayorizar.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesarMayorizar.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesarMayorizar.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesarMayorizar.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesarMayorizar.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesarMayorizar.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesarMayorizar()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar.getSelectedItem()!=null){this.id_anioBusquedaProcesarMayorizar=((Anio)this.jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar.getSelectedItem()!=null){this.id_mesBusquedaProcesarMayorizar=((Mes)this.jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar.getSelectedItem()!=null){this.id_tipo_documentoBusquedaProcesarMayorizar=((TipoDocumento)this.jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesarMayorizar(Boolean esInicializar) throws Exception {				
		if(ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesarMayorizar();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesarMayorizar() throws Exception {
		this.inicializarActualizarBindingTablaProcesarMayorizar(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesarMayorizar() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesarMayorizar.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesarMayorizar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesarMayorizar.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesarMayorizarPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesarMayorizar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesarMayorizar.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesarMayorizarPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesarMayorizarOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarMayorizarOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesarMayorizarPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesarMayorizar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesarMayorizar.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesarMayorizarPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesarMayorizar.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesarMayorizar(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesarmayorizarLogic.getProcesarMayorizars().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesarmayorizars.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesarMayorizar.setModel(new ProcesarMayorizarModel(this.procesarmayorizarLogic.getProcesarMayorizars(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesarMayorizar.setModel(new ProcesarMayorizarModel(this.procesarmayorizars,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesarMayorizar!=null && this.jInternalFrameOrderByProcesarMayorizar.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesarMayorizar();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesarMayorizar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarMayorizar,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesarMayorizarPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO,procesarmayorizarConstantesFunciones.resaltarSeleccionarProcesarMayorizar,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO,procesarmayorizarConstantesFunciones.resaltarSeleccionarProcesarMayorizar,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesarMayorizar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarMayorizar,ProcesarMayorizarConstantesFunciones.LABEL_ID));

		if(this.procesarmayorizarConstantesFunciones.mostraridProcesarMayorizar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesarMayorizarConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesarmayorizarConstantesFunciones.resaltaridProcesarMayorizar,this.procesarmayorizarConstantesFunciones.activaridProcesarMayorizar,this,true,"idProcesarMayorizar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesarmayorizarConstantesFunciones.resaltaridProcesarMayorizar,this.procesarmayorizarConstantesFunciones.activaridProcesarMayorizar,this,true,"idProcesarMayorizar","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesarMayorizar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarMayorizar,ProcesarMayorizarConstantesFunciones.LABEL_CODIGO));

		if(this.procesarmayorizarConstantesFunciones.mostrarcodigoProcesarMayorizar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesarMayorizarConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesarmayorizarConstantesFunciones.resaltarcodigoProcesarMayorizar,this.procesarmayorizarConstantesFunciones.activarcodigoProcesarMayorizar,this,true,"codigoProcesarMayorizar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesarmayorizarConstantesFunciones.resaltarcodigoProcesarMayorizar,this.procesarmayorizarConstantesFunciones.activarcodigoProcesarMayorizar,this,true,"codigoProcesarMayorizar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesarMayorizarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesarMayorizar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarMayorizar,ProcesarMayorizarConstantesFunciones.LABEL_NOMBRE));

		if(this.procesarmayorizarConstantesFunciones.mostrarnombreProcesarMayorizar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesarMayorizarConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesarmayorizarConstantesFunciones.resaltarnombreProcesarMayorizar,this.procesarmayorizarConstantesFunciones.activarnombreProcesarMayorizar,this,true,"nombreProcesarMayorizar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesarmayorizarConstantesFunciones.resaltarnombreProcesarMayorizar,this.procesarmayorizarConstantesFunciones.activarnombreProcesarMayorizar,this,true,"nombreProcesarMayorizar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesarMayorizarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesarmayorizarSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesarmayorizarSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesarMayorizar.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesarmayorizarSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesarmayorizarSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesarMayorizar.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesarMayorizar && this.isPermisoGuardarCambiosProcesarMayorizar) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesarmayorizarSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesarmayorizarSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesarMayorizar.addColumn(tableColumn);
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
			
			this.jTableDatosProcesarMayorizar.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesarMayorizar && this.isPermisoGuardarCambiosProcesarMayorizar) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesarMayorizar && this.isPermisoGuardarCambiosProcesarMayorizar) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesarMayorizar.moveColumn(this.jTableDatosProcesarMayorizar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesarMayorizar.moveColumn(this.jTableDatosProcesarMayorizar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesarMayorizar.moveColumn(this.jTableDatosProcesarMayorizar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesarMayorizar.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesarMayorizar.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesarMayorizar,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesarMayorizar.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesarMayorizar.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesarMayorizar.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesarMayorizar.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesarMayorizar.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesarmayorizarLogic.getProcesarMayorizars().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesarmayorizars.size()-1;
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
		//this.jTableDatosProcesarMayorizar.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesarMayorizar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesarMayorizar();
			
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
				
				//this.isEsNuevoProcesarMayorizar=false;
					
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
			
				if(this.procesarmayorizarSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesarMayorizar==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesarMayorizar.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesarMayorizar.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesarmayorizar.getsType().equals("DUPLICADO")
				   || this.procesarmayorizar.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesarMayorizar=true;
				
				} else {
					this.isEsNuevoProcesarMayorizar=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
					if(this.procesarmayorizar.getId()>=0 && !this.procesarmayorizar.getIsNew()) {						
						this.isEsNuevoProcesarMayorizar=false;
						
					} else {
						this.isEsNuevoProcesarMayorizar=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesarMayorizar(esRelaciones);						
				
				this.seleccionarProcesarMayorizar(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesarmayorizar.getId()<0) {
					this.isEsNuevoProcesarMayorizar=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesarMayorizar(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesarMayorizar(evt,rowIndex);
				}	
				
				if(this.procesarmayorizarSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesarMayorizar: " + this.dDif); 
					}
				}								
				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesarMayorizar(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesarmayorizar)) {
					if(this.procesarmayorizar.getId()>0) {
						this.procesarmayorizar.setIsDeleted(true);
						
						this.procesarmayorizarsEliminados.add(this.procesarmayorizar);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesarmayorizarLogic.getProcesarMayorizars().remove(this.procesarmayorizar);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesarmayorizars.remove(this.procesarmayorizar);				
					}
					
					
					((ProcesarMayorizarModel) this.jTableDatosProcesarMayorizar.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesarMayorizar(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesarMayorizar(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesarMayorizar) {
			
			if(this.jInternalFrameDetalleFormProcesarMayorizar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesarMayorizar.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesarMayorizar.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesarMayorizar(this.procesarmayorizar);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesarMayorizar("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesarMayorizar(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesarMayorizar() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesarMayorizar(ProcesarMayorizar procesarmayorizar) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesarMayorizar(procesarmayorizar,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesarMayorizar(ProcesarMayorizar procesarmayorizar,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesarMayorizar(procesarmayorizar);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesarMayorizar(procesarmayorizar,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesarMayorizar(procesarmayorizar);
	}
	
	public void setVariablesObjetoActualToFormularioProcesarMayorizar(ProcesarMayorizar procesarmayorizar) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesarMayorizar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesarMayorizar.jLabelidProcesarMayorizar.setText(procesarmayorizar.getId().toString());
			this.jInternalFrameDetalleFormProcesarMayorizar.jTextFieldcodigoProcesarMayorizar.setText(procesarmayorizar.getcodigo());
			this.jInternalFrameDetalleFormProcesarMayorizar.jTextAreanombreProcesarMayorizar.setText(procesarmayorizar.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesarMayorizar procesarmayorizarLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesarmayorizarLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesarMayorizar procesarmayorizarLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesarmayorizarLocal=this.procesarmayorizar;
			} else {
				procesarmayorizarLocal=this.procesarmayorizarAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesarmayorizarLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesarMayorizar(procesarmayorizarLocal,true);
					
					if(procesarmayorizarSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesarmayorizarLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesarmayorizarLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesarMayorizar(ProcesarMayorizar procesarmayorizar,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesarMayorizar(procesarmayorizar,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(procesarmayorizar);
	}
	
	public void setVariablesFormularioToObjetoActualProcesarMayorizar(ProcesarMayorizar procesarmayorizar,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesarMayorizar(procesarmayorizar,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesarMayorizar(ProcesarMayorizar procesarmayorizar,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesarMayorizar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesarMayorizar.jLabelidProcesarMayorizar.getText()==null || this.jInternalFrameDetalleFormProcesarMayorizar.jLabelidProcesarMayorizar.getText()=="" || this.jInternalFrameDetalleFormProcesarMayorizar.jLabelidProcesarMayorizar.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesarMayorizar.jLabelidProcesarMayorizar.setText("0");
			}

			if(conColumnasBase) {procesarmayorizar.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesarMayorizar.jLabelidProcesarMayorizar.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesarMayorizarConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesarMayorizar.jLabelIdProcesarMayorizar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesarmayorizar.setcodigo(this.jInternalFrameDetalleFormProcesarMayorizar.jTextFieldcodigoProcesarMayorizar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesarMayorizarConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesarMayorizar.jLabelcodigoProcesarMayorizar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesarmayorizar.setnombre(this.jInternalFrameDetalleFormProcesarMayorizar.jTextAreanombreProcesarMayorizar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesarMayorizarConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesarMayorizar.jLabelnombreProcesarMayorizar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesarMayorizar(ProcesarMayorizar procesarmayorizarBean,ProcesarMayorizar procesarmayorizar,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesarMayorizar(ProcesarMayorizar procesarmayorizarOrigen,ProcesarMayorizar procesarmayorizar,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesarmayorizarOrigen.getId()!=null && !procesarmayorizarOrigen.getId().equals(0L))) {procesarmayorizar.setId(procesarmayorizarOrigen.getId());}}
			if(conDefault || (!conDefault && procesarmayorizarOrigen.getcodigo()!=null && !procesarmayorizarOrigen.getcodigo().equals(""))) {procesarmayorizar.setcodigo(procesarmayorizarOrigen.getcodigo());}
			if(conDefault || (!conDefault && procesarmayorizarOrigen.getnombre()!=null && !procesarmayorizarOrigen.getnombre().equals(""))) {procesarmayorizar.setnombre(procesarmayorizarOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesarMayorizar(ProcesarMayorizar procesarmayorizar) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesarMayorizar.jLabelidProcesarMayorizar.setText(procesarmayorizar.getId().toString());
			this.jInternalFrameDetalleFormProcesarMayorizar.jTextFieldcodigoProcesarMayorizar.setText(procesarmayorizar.getcodigo());
			this.jInternalFrameDetalleFormProcesarMayorizar.jTextAreanombreProcesarMayorizar.setText(procesarmayorizar.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesarMayorizar(ProcesarMayorizarBean procesarmayorizarBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesarMayorizar.jLabelidProcesarMayorizar.setText(procesarmayorizarBean.getId().toString());
			this.jInternalFrameDetalleFormProcesarMayorizar.jTextFieldcodigoProcesarMayorizar.setText(procesarmayorizarBean.getcodigo());
			this.jInternalFrameDetalleFormProcesarMayorizar.jTextAreanombreProcesarMayorizar.setText(procesarmayorizarBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesarMayorizar(ProcesarMayorizarParameterReturnGeneral procesarmayorizarReturnGeneral,ProcesarMayorizarBean procesarmayorizarBean,Boolean conDefault) throws Exception { 
		try {
			ProcesarMayorizar procesarmayorizarLocal=new ProcesarMayorizar();
			
			procesarmayorizarLocal=procesarmayorizarReturnGeneral.getProcesarMayorizar();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesarmayorizarLocal.getId()!=null && !procesarmayorizarLocal.getId().equals(0L))) {procesarmayorizarBean.setId(procesarmayorizarLocal.getId());}}
			if(conDefault || (!conDefault && procesarmayorizarLocal.getcodigo()!=null && !procesarmayorizarLocal.getcodigo().equals(""))) {procesarmayorizarBean.setcodigo(procesarmayorizarLocal.getcodigo());}
			if(conDefault || (!conDefault && procesarmayorizarLocal.getnombre()!=null && !procesarmayorizarLocal.getnombre().equals(""))) {procesarmayorizarBean.setnombre(procesarmayorizarLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesarMayorizarGenerico(Long idProcesarMayorizarSeleccionado,JComboBox jComboBoxProcesarMayorizar,List<ProcesarMayorizar> procesarmayorizarsLocal)throws Exception {
		try {
			ProcesarMayorizar  procesarmayorizarTemp=null;

			for(ProcesarMayorizar procesarmayorizarAux:procesarmayorizarsLocal) {
				if(procesarmayorizarAux.getId()!=null && procesarmayorizarAux.getId().equals(idProcesarMayorizarSeleccionado)) {
					procesarmayorizarTemp=procesarmayorizarAux;
					break;
				}
			}

			jComboBoxProcesarMayorizar.setSelectedItem(procesarmayorizarTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesarMayorizarGenerico(JComboBox jComboBoxProcesarMayorizar,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesarMayorizar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesarMayorizar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesarMayorizar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesarMayorizar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesarMayorizar.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesarMayorizar.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesarMayorizar.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesarMayorizar.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesarMayorizar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesarMayorizar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesarmayorizar=(ProcesarMayorizar) procesarmayorizarLogic.getProcesarMayorizars().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesarmayorizar =(ProcesarMayorizar) procesarmayorizars.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!procesarmayorizar.getIsNew() && !procesarmayorizar.getIsChanged() && !procesarmayorizar.getIsDeleted()) {
				sDescripcion=procesarmayorizar.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=procesarmayorizar.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!procesarmayorizar.getIsNew() && !procesarmayorizar.getIsChanged() && !procesarmayorizar.getIsDeleted()) {
				sDescripcion=procesarmayorizar.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=procesarmayorizar.getmes_descripcion();
			}
		}

		if(sTipo.equals("TipoDocumento")) {
			//sDescripcion=this.getActualTipoDocumentoForeignKeyDescripcion((Long)value);
			if(!procesarmayorizar.getIsNew() && !procesarmayorizar.getIsChanged() && !procesarmayorizar.getIsDeleted()) {
				sDescripcion=procesarmayorizar.gettipodocumento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoDocumentoForeignKeyDescripcion((Long)value);
				sDescripcion=procesarmayorizar.gettipodocumento_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesarMayorizar procesarmayorizarRow=new ProcesarMayorizar();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesarmayorizarRow=(ProcesarMayorizar) procesarmayorizarLogic.getProcesarMayorizars().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesarmayorizarRow=(ProcesarMayorizar) procesarmayorizars.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesarMayorizar(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesarMayorizar.setVisible((this.isVisibilidadCeldaNuevoProcesarMayorizar && this.isPermisoNuevoProcesarMayorizar));			
			this.jButtonDuplicarProcesarMayorizar.setVisible((this.isVisibilidadCeldaDuplicarProcesarMayorizar && this.isPermisoDuplicarProcesarMayorizar));			
			this.jButtonCopiarProcesarMayorizar.setVisible((this.isVisibilidadCeldaCopiarProcesarMayorizar && this.isPermisoCopiarProcesarMayorizar));
			this.jButtonVerFormProcesarMayorizar.setVisible((this.isVisibilidadCeldaVerFormProcesarMayorizar && this.isPermisoVerFormProcesarMayorizar));
			
			this.jButtonAbrirOrderByProcesarMayorizar.setVisible((this.isVisibilidadCeldaOrdenProcesarMayorizar && this.isPermisoOrdenProcesarMayorizar));			
			
			this.jButtonNuevoRelacionesProcesarMayorizar.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar && this.isPermisoNuevoProcesarMayorizar));			
			this.jButtonNuevoGuardarCambiosProcesarMayorizar.setVisible((this.isVisibilidadCeldaNuevoProcesarMayorizar && this.isPermisoNuevoProcesarMayorizar && this.isPermisoGuardarCambiosProcesarMayorizar));
			
			if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonModificarProcesarMayorizar.setVisible((this.isVisibilidadCeldaModificarProcesarMayorizar && this.isPermisoActualizarProcesarMayorizar));	
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonActualizarProcesarMayorizar.setVisible((this.isVisibilidadCeldaActualizarProcesarMayorizar && this.isPermisoActualizarProcesarMayorizar));	
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonEliminarProcesarMayorizar.setVisible((this.isVisibilidadCeldaEliminarProcesarMayorizar && this.isPermisoEliminarProcesarMayorizar));
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonCancelarProcesarMayorizar.setVisible(this.isVisibilidadCeldaCancelarProcesarMayorizar);							
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonGuardarCambiosProcesarMayorizar.setVisible((this.isVisibilidadCeldaGuardarProcesarMayorizar && this.isPermisoGuardarCambiosProcesarMayorizar));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesarMayorizar.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesarMayorizar && this.isPermisoGuardarCambiosProcesarMayorizar));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesarMayorizar.setVisible((this.isVisibilidadCeldaNuevoProcesarMayorizar && this.isPermisoNuevoProcesarMayorizar));						
			this.jButtonDuplicarToolBarProcesarMayorizar.setVisible((this.isVisibilidadCeldaDuplicarProcesarMayorizar && this.isPermisoDuplicarProcesarMayorizar));						
			this.jButtonCopiarToolBarProcesarMayorizar.setVisible((this.isVisibilidadCeldaCopiarProcesarMayorizar && this.isPermisoCopiarProcesarMayorizar));			
			this.jButtonVerFormToolBarProcesarMayorizar.setVisible((this.isVisibilidadCeldaVerFormProcesarMayorizar && this.isPermisoVerFormProcesarMayorizar));			
			this.jButtonAbrirOrderByToolBarProcesarMayorizar.setVisible((this.isVisibilidadCeldaOrdenProcesarMayorizar && this.isPermisoOrdenProcesarMayorizar));
			this.jButtonNuevoRelacionesToolBarProcesarMayorizar.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar && this.isPermisoNuevoProcesarMayorizar));			
			this.jButtonNuevoGuardarCambiosToolBarProcesarMayorizar.setVisible((this.isVisibilidadCeldaNuevoProcesarMayorizar && this.isPermisoNuevoProcesarMayorizar && this.isPermisoGuardarCambiosProcesarMayorizar));			
			
			if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonModificarToolBarProcesarMayorizar.setVisible((this.isVisibilidadCeldaModificarProcesarMayorizar && this.isPermisoActualizarProcesarMayorizar));	
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonActualizarToolBarProcesarMayorizar.setVisible((this.isVisibilidadCeldaActualizarProcesarMayorizar  && this.isPermisoActualizarProcesarMayorizar));	
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonEliminarToolBarProcesarMayorizar.setVisible((this.isVisibilidadCeldaEliminarProcesarMayorizar && this.isPermisoEliminarProcesarMayorizar));
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonCancelarToolBarProcesarMayorizar.setVisible(this.isVisibilidadCeldaCancelarProcesarMayorizar);				
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonGuardarCambiosToolBarProcesarMayorizar.setVisible((this.isVisibilidadCeldaGuardarProcesarMayorizar && this.isPermisoGuardarCambiosProcesarMayorizar));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesarMayorizar.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesarMayorizar && this.isPermisoGuardarCambiosProcesarMayorizar));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesarMayorizar.setVisible((this.isVisibilidadCeldaNuevoProcesarMayorizar && this.isPermisoNuevoProcesarMayorizar));			
			this.jMenuItemDuplicarProcesarMayorizar.setVisible((this.isVisibilidadCeldaDuplicarProcesarMayorizar && this.isPermisoDuplicarProcesarMayorizar));			
			this.jMenuItemCopiarProcesarMayorizar.setVisible((this.isVisibilidadCeldaCopiarProcesarMayorizar && this.isPermisoCopiarProcesarMayorizar));			
			this.jMenuItemVerFormProcesarMayorizar.setVisible((this.isVisibilidadCeldaVerFormProcesarMayorizar && this.isPermisoVerFormProcesarMayorizar));			
			this.jMenuItemAbrirOrderByProcesarMayorizar.setVisible((this.isVisibilidadCeldaOrdenProcesarMayorizar && this.isPermisoOrdenProcesarMayorizar));			
			//this.jMenuItemMostrarOcultarProcesarMayorizar.setVisible((this.isVisibilidadCeldaOrdenProcesarMayorizar && this.isPermisoOrdenProcesarMayorizar));
			this.jMenuItemDetalleAbrirOrderByProcesarMayorizar.setVisible((this.isVisibilidadCeldaOrdenProcesarMayorizar && this.isPermisoOrdenProcesarMayorizar));			
			//this.jMenuItemDetalleMostrarOcultarProcesarMayorizar.setVisible((this.isVisibilidadCeldaOrdenProcesarMayorizar && this.isPermisoOrdenProcesarMayorizar));			
			this.jMenuItemNuevoRelacionesProcesarMayorizar.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar && this.isPermisoNuevoProcesarMayorizar));			
			this.jMenuItemNuevoGuardarCambiosProcesarMayorizar.setVisible((this.isVisibilidadCeldaNuevoProcesarMayorizar && this.isPermisoNuevoProcesarMayorizar && this.isPermisoGuardarCambiosProcesarMayorizar));									
			
			if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
			this.jInternalFrameDetalleFormProcesarMayorizar.jMenuItemModificarProcesarMayorizar.setVisible((this.isVisibilidadCeldaModificarProcesarMayorizar && this.isPermisoActualizarProcesarMayorizar));	
			this.jInternalFrameDetalleFormProcesarMayorizar.jMenuItemActualizarProcesarMayorizar.setVisible((this.isVisibilidadCeldaActualizarProcesarMayorizar && this.isPermisoActualizarProcesarMayorizar));	
			this.jInternalFrameDetalleFormProcesarMayorizar.jMenuItemEliminarProcesarMayorizar.setVisible((this.isVisibilidadCeldaEliminarProcesarMayorizar && this.isPermisoEliminarProcesarMayorizar));
			this.jInternalFrameDetalleFormProcesarMayorizar.jMenuItemCancelarProcesarMayorizar.setVisible(this.isVisibilidadCeldaCancelarProcesarMayorizar);				
			}
			
			this.jMenuItemGuardarCambiosProcesarMayorizar.setVisible((this.isVisibilidadCeldaGuardarProcesarMayorizar && this.isPermisoGuardarCambiosProcesarMayorizar));						
			this.jMenuItemGuardarCambiosTablaProcesarMayorizar.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesarMayorizar && this.isPermisoGuardarCambiosProcesarMayorizar));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesarMayorizar=this.jButtonNuevoProcesarMayorizar.isVisible();
			this.isVisibilidadCeldaDuplicarProcesarMayorizar=this.jButtonDuplicarProcesarMayorizar.isVisible();
			this.isVisibilidadCeldaCopiarProcesarMayorizar=this.jButtonCopiarProcesarMayorizar.isVisible();
			this.isVisibilidadCeldaVerFormProcesarMayorizar=this.jButtonVerFormProcesarMayorizar.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesarMayorizar=this.jButtonAbrirOrderByProcesarMayorizar.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar=this.jButtonNuevoRelacionesProcesarMayorizar.isVisible();
			this.isVisibilidadCeldaModificarProcesarMayorizar=this.jButtonModificarProcesarMayorizar.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
			this.isVisibilidadCeldaActualizarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jButtonActualizarProcesarMayorizar.isVisible();
			this.isVisibilidadCeldaEliminarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jButtonEliminarProcesarMayorizar.isVisible();
			this.isVisibilidadCeldaCancelarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jButtonCancelarProcesarMayorizar.isVisible();
			this.isVisibilidadCeldaGuardarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jButtonGuardarCambiosProcesarMayorizar.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesarMayorizar=this.jButtonGuardarCambiosTablaProcesarMayorizar.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesarMayorizar=this.jButtonNuevoToolBarProcesarMayorizar.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar=this.jButtonNuevoRelacionesToolBarProcesarMayorizar.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
			this.isVisibilidadCeldaModificarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jButtonModificarToolBarProcesarMayorizar.isVisible();
			this.isVisibilidadCeldaActualizarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jButtonActualizarToolBarProcesarMayorizar.isVisible();
			this.isVisibilidadCeldaEliminarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jButtonEliminarToolBarProcesarMayorizar.isVisible();
			this.isVisibilidadCeldaCancelarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jButtonCancelarToolBarProcesarMayorizar.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesarMayorizar=this.jButtonGuardarCambiosToolBarProcesarMayorizar.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesarMayorizar=this.jButtonGuardarCambiosTablaToolBarProcesarMayorizar.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesarMayorizar=this.jMenuItemNuevoProcesarMayorizar.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar=this.jMenuItemNuevoRelacionesProcesarMayorizar.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
			this.isVisibilidadCeldaModificarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jMenuItemModificarProcesarMayorizar.isVisible();
			this.isVisibilidadCeldaActualizarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jMenuItemActualizarProcesarMayorizar.isVisible();
			this.isVisibilidadCeldaEliminarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jMenuItemEliminarProcesarMayorizar.isVisible();
			this.isVisibilidadCeldaCancelarProcesarMayorizar=this.jInternalFrameDetalleFormProcesarMayorizar.jMenuItemCancelarProcesarMayorizar.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesarMayorizar=this.jMenuItemGuardarCambiosProcesarMayorizar.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesarMayorizar=this.jMenuItemGuardarCambiosTablaProcesarMayorizar.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesarMayorizar(Boolean esInicializar) {
		if(ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesarmayorizarSessionBean.getConGuardarRelaciones()) {
				//if(this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesarMayorizar();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesarMayorizar(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesarMayorizar() {
		this.jButtonNuevoProcesarMayorizar.setVisible(this.isPermisoNuevoProcesarMayorizar);			
		this.jButtonDuplicarProcesarMayorizar.setVisible(this.isPermisoDuplicarProcesarMayorizar);			
		this.jButtonCopiarProcesarMayorizar.setVisible(this.isPermisoCopiarProcesarMayorizar);			
		this.jButtonVerFormProcesarMayorizar.setVisible(this.isPermisoVerFormProcesarMayorizar);			
		
		this.jButtonAbrirOrderByProcesarMayorizar.setVisible(this.isPermisoOrdenProcesarMayorizar);					
		
		this.jButtonNuevoRelacionesProcesarMayorizar.setVisible(this.isPermisoNuevoProcesarMayorizar);			
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonModificarProcesarMayorizar.setVisible(this.isPermisoActualizarProcesarMayorizar);	
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonActualizarProcesarMayorizar.setVisible(this.isPermisoActualizarProcesarMayorizar);	
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonEliminarProcesarMayorizar.setVisible(this.isPermisoEliminarProcesarMayorizar);
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonCancelarProcesarMayorizar.setVisible(this.isVisibilidadCeldaCancelarProcesarMayorizar);						
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonGuardarCambiosProcesarMayorizar.setVisible(this.isPermisoGuardarCambiosProcesarMayorizar);							
		}
		
		this.jButtonGuardarCambiosTablaProcesarMayorizar.setVisible(this.isPermisoActualizarProcesarMayorizar);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesarMayorizar() {
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonModificarProcesarMayorizar.setVisible(this.isPermisoActualizarProcesarMayorizar);	
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonActualizarProcesarMayorizar.setVisible(this.isPermisoActualizarProcesarMayorizar);	
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonEliminarProcesarMayorizar.setVisible(this.isPermisoEliminarProcesarMayorizar);
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonCancelarProcesarMayorizar.setVisible(this.isVisibilidadCeldaCancelarProcesarMayorizar);							
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonGuardarCambiosProcesarMayorizar.setVisible((this.isVisibilidadCeldaGuardarProcesarMayorizar && this.isPermisoGuardarCambiosProcesarMayorizar));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesarMayorizar() {
		if(ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesarMayorizar();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesarMayorizar() {
	}
	
	public void jTableDatosProcesarMayorizarListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesarMayorizar(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesarMayorizarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.getprocesarmayorizar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesarmayorizar==null) {
						this.procesarmayorizar = new ProcesarMayorizar();
					}

					this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.procesarmayorizar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);
				}

				if(this.procesarmayorizar.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesarmayorizar.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesarMayorizar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioProcesarMayorizarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebProcesarMayorizar(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesarMayorizar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesarMayorizar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.getprocesarmayorizar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.procesarmayorizarLogic.getConnexion());

				if(this.procesarmayorizar.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.procesarmayorizar.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesarMayorizar=(TitledBorder)this.jScrollPanelDatosProcesarMayorizar.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderProcesarMayorizar.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioProcesarMayorizarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.getprocesarmayorizar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesarmayorizar==null) {
						this.procesarmayorizar = new ProcesarMayorizar();
					}

					this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.procesarmayorizar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);
				}

				if(this.procesarmayorizar.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.procesarmayorizar.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesarMayorizar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesProcesarMayorizarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebProcesarMayorizar(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesarMayorizar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesarMayorizar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.getprocesarmayorizar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.procesarmayorizarLogic.getConnexion());

				if(this.procesarmayorizar.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.procesarmayorizar.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesarMayorizar=(TitledBorder)this.jScrollPanelDatosProcesarMayorizar.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderProcesarMayorizar.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesProcesarMayorizarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.getprocesarmayorizar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesarmayorizar==null) {
						this.procesarmayorizar = new ProcesarMayorizar();
					}

					this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.procesarmayorizar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);
				}

				if(this.procesarmayorizar.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.procesarmayorizar.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesarMayorizar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_documentoProcesarMayorizarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipodocumento=true;

			idTienePermisotipodocumento=this.tienePermisosUsuarioEnPaginaWebProcesarMayorizar(TipoDocumentoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipodocumento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesarMayorizar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesarMayorizar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.getprocesarmayorizar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);

				this.tipodocumentoBeanSwingJInternalFrame=new TipoDocumentoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipodocumentoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipodocumentoBeanSwingJInternalFrame.getTipoDocumentoLogic().setConnexion(this.procesarmayorizarLogic.getConnexion());

				if(this.procesarmayorizar.getid_tipo_documento()!=null) {
					this.tipodocumentoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipodocumentoBeanSwingJInternalFrame.setIdActual(this.procesarmayorizar.getid_tipo_documento());
					this.tipodocumentoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipodocumentoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipodocumentoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDocumento();
				}

				JInternalFrameBase jinternalFrame =this.tipodocumentoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesarMayorizar=(TitledBorder)this.jScrollPanelDatosProcesarMayorizar.getBorder();
				TitledBorder titledBordertipodocumento=(TitledBorder)this.tipodocumentoBeanSwingJInternalFrame.jScrollPanelDatosTipoDocumento.getBorder();

				titledBordertipodocumento.setTitle(titledBorderProcesarMayorizar.getTitle() + " -> Tipo Documento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_documentoProcesarMayorizarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.getprocesarmayorizar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesarmayorizar==null) {
						this.procesarmayorizar = new ProcesarMayorizar();
					}

					this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.procesarmayorizar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);
				}

				if(this.procesarmayorizar.getid_tipo_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_documento = "+this.procesarmayorizar.getid_tipo_documento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesarMayorizar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoProcesarMayorizarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.getprocesarmayorizar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesarmayorizar==null) {
						this.procesarmayorizar = new ProcesarMayorizar();
					}

					this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.procesarmayorizar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);
				}

				if(this.procesarmayorizar.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.procesarmayorizar.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesarMayorizar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreProcesarMayorizarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.getprocesarmayorizar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesarmayorizar==null) {
						this.procesarmayorizar = new ProcesarMayorizar();
					}

					this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.procesarmayorizar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);
				}

				if(this.procesarmayorizar.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.procesarmayorizar.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesarMayorizar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesarMayorizarProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesarMayorizar(false,false);

			this.getProcesarMayorizarsBusquedaProcesarMayorizar();

			this.inicializarActualizarBindingProcesarMayorizar(false);

			//if(ProcesarMayorizarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesarMayorizar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesarMayorizar(false,false);

			this.getProcesarMayorizarsFK_IdAnio();

			this.inicializarActualizarBindingProcesarMayorizar(false);

			//if(ProcesarMayorizarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesarMayorizar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesarMayorizar(false,false);

			this.getProcesarMayorizarsFK_IdMes();

			this.inicializarActualizarBindingProcesarMayorizar(false);

			//if(ProcesarMayorizarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesarMayorizar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoDocumentoProcesarMayorizarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesarMayorizar(false,false);

			this.getProcesarMayorizarsFK_IdTipoDocumento();

			this.inicializarActualizarBindingProcesarMayorizar(false);

			//if(ProcesarMayorizarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesarMayorizar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarmayorizarLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesarMayorizar() {
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
			this.jInternalFrameDetalleFormProcesarMayorizar.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesarMayorizar.dispose();
			this.jInternalFrameDetalleFormProcesarMayorizar=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesarMayorizar!=null) {
			this.jInternalFrameReporteDinamicoProcesarMayorizar.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesarMayorizar.dispose();
			this.jInternalFrameReporteDinamicoProcesarMayorizar=null;
		}
		
		if(this.jInternalFrameImportacionProcesarMayorizar!=null) {
			this.jInternalFrameImportacionProcesarMayorizar.setVisible(false);	    			
			this.jInternalFrameImportacionProcesarMayorizar.dispose();
			this.jInternalFrameImportacionProcesarMayorizar=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesarMayorizar();
			
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesarMayorizar")) {
				jButtonNuevoProcesarMayorizarActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesarMayorizar")) {
				jButtonDuplicarProcesarMayorizarActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesarMayorizar")) {
				jButtonCopiarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesarMayorizar")) {
				jButtonVerFormProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesarMayorizar")) {
				jButtonNuevoProcesarMayorizarActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesarMayorizar")) {
				jButtonDuplicarProcesarMayorizarActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesarMayorizar")) {
				jButtonNuevoProcesarMayorizarActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesarMayorizar")) {
				jButtonDuplicarProcesarMayorizarActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesarMayorizar")) {
				jButtonNuevoProcesarMayorizarActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesarMayorizar")) {
				jButtonNuevoProcesarMayorizarActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesarMayorizar")) {
				jButtonNuevoProcesarMayorizarActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesarMayorizar")) {
				jButtonModificarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesarMayorizar")) {
				jButtonModificarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesarMayorizar")) {
				jButtonModificarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesarMayorizar")) {
				jButtonActualizarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesarMayorizar")) {
				jButtonActualizarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesarMayorizar")) {
				jButtonActualizarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesarMayorizar")) {
				jButtonEliminarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesarMayorizar")) {
				jButtonEliminarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesarMayorizar")) {
				jButtonEliminarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesarMayorizar")) {
				jButtonCancelarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesarMayorizar")) {
				jButtonCancelarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesarMayorizar")) {
				jButtonCancelarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesarMayorizar")) {
				jButtonCerrarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesarMayorizar")) {
				jButtonCerrarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesarMayorizar")) {
				jButtonCerrarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesarMayorizar")) {
				jButtonMostrarOcultarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesarMayorizar")) {
				jButtonCancelarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesarMayorizar")) {
				jButtonGuardarCambiosProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesarMayorizar")) {
				jButtonGuardarCambiosProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesarMayorizar")) {
				jButtonCopiarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesarMayorizar")) {
				jButtonVerFormProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesarMayorizar")) {
				jButtonGuardarCambiosProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesarMayorizar")) {
				jButtonCopiarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesarMayorizar")) {
				jButtonVerFormProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesarMayorizar")) {
				jButtonGuardarCambiosProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesarMayorizar")) {
				jButtonGuardarCambiosProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesarMayorizar")) {
				jButtonGuardarCambiosProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesarMayorizar")) {
				jButtonRecargarInformacionProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesarMayorizar")) {
				jButtonRecargarInformacionProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesarMayorizar")) {
				jButtonRecargarInformacionProcesarMayorizarActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesarMayorizar")) {
				jButtonAnterioresProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesarMayorizar")) {
				jButtonAnterioresProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesarMayorizar")) {
				jButtonAnterioresProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesarMayorizar")) {
				jButtonSiguientesProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesarMayorizar")) {
				jButtonSiguientesProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesarMayorizar")) {
				jButtonSiguientesProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesarMayorizar") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesarMayorizar")) {
				jButtonAbrirOrderByProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesarMayorizar") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesarMayorizar")) {
				jButtonMostrarOcultarProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesarMayorizar")) {
				jButtonNuevoGuardarCambiosProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesarMayorizar")) {
				jButtonNuevoGuardarCambiosProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesarMayorizar")) {
				jButtonNuevoGuardarCambiosProcesarMayorizarActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesarMayorizar")) {
				jButtonProcesarInformacionProcesarMayorizarActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesarMayorizar")) {
				jButtonCerrarReporteDinamicoProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesarMayorizar")) {
				jButtonGenerarReporteDinamicoProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesarMayorizar")) {
				
				jButtonGenerarExcelReporteDinamicoProcesarMayorizarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesarMayorizar")) {
				jButtonCerrarImportacionProcesarMayorizarActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesarMayorizar")) {
				
				jButtonGenerarImportacionProcesarMayorizarActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesarMayorizar")) {
				
				jButtonAbrirImportacionProcesarMayorizarActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesarMayorizar")) {
				jComboBoxTiposAccionesProcesarMayorizarActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesarMayorizar")) {
				jComboBoxTiposRelacionesProcesarMayorizarActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesarMayorizar")) {
				jComboBoxTiposAccionesProcesarMayorizarActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesarMayorizar")) {
				
				jComboBoxTiposSeleccionarProcesarMayorizarActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesarMayorizar")) {
				jTextFieldValorCampoGeneralProcesarMayorizarActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesarMayorizar")) {
				jButtonAbrirOrderByProcesarMayorizarActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesarMayorizar")) {
				jButtonAbrirOrderByProcesarMayorizarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesarMayorizar")) {
				jButtonCerrarOrderByProcesarMayorizarActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesarMayorizarBusqueda")) {
				this.jButtonidProcesarMayorizarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioProcesarMayorizarUpdate")) {
				this.jButtonid_anioProcesarMayorizarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioProcesarMayorizarBusqueda")) {
				this.jButtonid_anioProcesarMayorizarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesProcesarMayorizarUpdate")) {
				this.jButtonid_mesProcesarMayorizarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesProcesarMayorizarBusqueda")) {
				this.jButtonid_mesProcesarMayorizarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documentoProcesarMayorizarUpdate")) {
				this.jButtonid_tipo_documentoProcesarMayorizarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documentoProcesarMayorizarBusqueda")) {
				this.jButtonid_tipo_documentoProcesarMayorizarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesarMayorizarBusqueda")) {
				this.jButtoncodigoProcesarMayorizarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProcesarMayorizarBusqueda")) {
				this.jButtonnombreProcesarMayorizarBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesarMayorizarProcesarMayorizar")) {
				this.jButtonBusquedaProcesarMayorizarProcesarMayorizarActionPerformed(evt);
			}
			
			;
			
			
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesarMayorizar();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarMayorizarActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarmayorizar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarmayorizar);
				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
				
				


				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarMayorizar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarMayorizar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesarMayorizar procesarmayorizarLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesarmayorizarLocal=this.procesarmayorizar;
			} else {
				procesarmayorizarLocal=this.procesarmayorizarAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarmayorizar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarmayorizar);
				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
							
				
				


				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarMayorizar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarMayorizar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarMayorizarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarAnterior =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarmayorizarAnterior =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
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
			
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
			
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
			
			


			
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarMayorizarActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarmayorizar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarmayorizar);
				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
								
						
				


				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarMayorizar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarMayorizar.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarmayorizar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarmayorizar);
				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
								
				
				


				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarMayorizar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarMayorizar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarMayorizarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarAnterior =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarmayorizarAnterior =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarmayorizar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarmayorizar);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarMayorizarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarAnterior =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarmayorizarAnterior =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarMayorizarActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarmayorizar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesarmayorizar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarmayorizar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarmayorizar);
				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
							
				
				


				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarMayorizar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarMayorizar.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarMayorizarActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesarmayorizarAnterior =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesarmayorizarAnterior =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
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
			
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
			
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
			
			


			
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarMayorizarActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarmayorizar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesarmayorizar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarmayorizar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarmayorizar);
				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
								
				
				


				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarMayorizar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarMayorizar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarMayorizarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarAnterior =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarmayorizarAnterior =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarMayorizarActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarmayorizar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesarmayorizar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarMayorizarActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarmayorizar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarmayorizar);
				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesarMayorizar")) {
					jCheckBoxSeleccionarTodosProcesarMayorizarItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesarMayorizar")) {
					jCheckBoxSeleccionadosProcesarMayorizarItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesarMayorizar")) {
					
				}
				
				


				
				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarMayorizar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarMayorizar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarmayorizar);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesarmayorizar);
				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
												
				
				


				
				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarMayorizar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarMayorizar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarMayorizarActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesarmayorizarAnterior =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesarmayorizarAnterior =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarMayorizarActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarmayorizar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarmayorizar);
				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
				
				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
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
			
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
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
			
			


			
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarMayorizarActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarmayorizar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarmayorizar);
				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarMayorizar.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarMayorizar.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarmayorizar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarmayorizar);
				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
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
				
				


				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarMayorizar.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarMayorizar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarMayorizarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarmayorizarAnterior =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarmayorizarAnterior =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesarMayorizar")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesarMayorizarListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesarMayorizar.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesarmayorizar =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesarmayorizar);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesarMayorizar")) {
				
				}
				
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesarMayorizar")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesarMayorizar.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesarMayorizar")) {
			
			}
			
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesarMayorizar();
			
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
			
			if(sTipo.equals("NuevoProcesarMayorizar")) {
				jButtonNuevoProcesarMayorizarActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesarMayorizar")) {
				jButtonDuplicarProcesarMayorizarActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesarMayorizar")) {
				jButtonCopiarProcesarMayorizarActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesarMayorizar")) {
				jButtonVerFormProcesarMayorizarActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesarMayorizar")) {
				jButtonNuevoProcesarMayorizarActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesarMayorizar")) {
				jButtonModificarProcesarMayorizarActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesarMayorizar")) {
				jButtonActualizarProcesarMayorizarActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesarMayorizar")) {
				jButtonEliminarProcesarMayorizarActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesarMayorizar")) {
				jButtonGuardarCambiosProcesarMayorizarActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesarMayorizar")) {
				jButtonCancelarProcesarMayorizarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesarMayorizar")) {
				jButtonCerrarProcesarMayorizarActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesarMayorizar")) {
				jButtonGuardarCambiosProcesarMayorizarActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesarMayorizar")) {
				jButtonNuevoGuardarCambiosProcesarMayorizarActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesarMayorizar")) {
				jButtonAbrirOrderByProcesarMayorizarActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesarMayorizar")) {
				jButtonRecargarInformacionProcesarMayorizarActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesarMayorizar")) {
				jButtonAnterioresProcesarMayorizarActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesarMayorizar")) {
				jButtonSiguientesProcesarMayorizarActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesarMayorizarBusqueda")) {
				this.jButtonidProcesarMayorizarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioProcesarMayorizarUpdate")) {
				this.jButtonid_anioProcesarMayorizarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioProcesarMayorizarBusqueda")) {
				this.jButtonid_anioProcesarMayorizarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesProcesarMayorizarUpdate")) {
				this.jButtonid_mesProcesarMayorizarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesProcesarMayorizarBusqueda")) {
				this.jButtonid_mesProcesarMayorizarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documentoProcesarMayorizarUpdate")) {
				this.jButtonid_tipo_documentoProcesarMayorizarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documentoProcesarMayorizarBusqueda")) {
				this.jButtonid_tipo_documentoProcesarMayorizarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesarMayorizarBusqueda")) {
				this.jButtoncodigoProcesarMayorizarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProcesarMayorizarBusqueda")) {
				this.jButtonnombreProcesarMayorizarBusquedaActionPerformed(evt);
			}
			
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesarMayorizar();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesarMayorizar")) {
				closingInternalFrameProcesarMayorizar();
				
			} else if(sTipo.equals("jButtonCancelarProcesarMayorizar")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesarMayorizar = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesarMayorizarBeanSwingJInternalFrame jInternalFrameParent=(ProcesarMayorizarBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesarMayorizar.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesarMayorizarActionPerformed(null);
			}
			
			ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesarmayorizar,new Object(),this.procesarmayorizarParameterGeneral,this.procesarmayorizarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesarMayorizar(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesarMayorizar(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesarMayorizar(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesarmayorizar)) {
			if(!esControlTabla) {
				if(ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.procesarmayorizar,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);			
				}
				
				if(this.procesarmayorizarSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesarMayorizar(this.procesarmayorizar,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesarMayorizar(this.procesarmayorizarReturnGeneral,this.procesarmayorizarBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesarmayorizarSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesarMayorizar(classes,this.procesarmayorizarReturnGeneral,this.procesarmayorizarBean,false);
					}
						
					if(this.procesarmayorizarReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesarMayorizar(this.procesarmayorizarReturnGeneral.getProcesarMayorizar());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesarMayorizar(this.procesarmayorizarReturnGeneral.getProcesarMayorizar());	
					}
						
					if(this.procesarmayorizarReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesarMayorizar(this.procesarmayorizarReturnGeneral.getProcesarMayorizar(),classes);//this.procesarmayorizarBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesarMayorizar(this.procesarmayorizar,classes);//this.procesarmayorizarBean);									
				}
			
				if(ProcesarMayorizarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesarMayorizar(this.procesarmayorizar,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarMayorizar(this.procesarmayorizar);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesarmayorizarAnterior!=null) {
						this.procesarmayorizar=this.procesarmayorizarAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesarmayorizarSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesarmayorizarSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesarmayorizarReturnGeneral.getProcesarMayorizar(),procesarmayorizarLogic.getProcesarMayorizars());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesarmayorizarReturnGeneral.getProcesarMayorizar(),this.procesarmayorizars);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesarMayorizar.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesarMayorizar.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesarMayorizar();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesarMayorizar() throws Exception {
		
		ProcesarMayorizarModel procesarmayorizarModel=(ProcesarMayorizarModel)this.jTableDatosProcesarMayorizar.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesarmayorizarModel.procesarmayorizars=this.procesarmayorizarLogic.getProcesarMayorizars();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesarmayorizarModel.procesarmayorizars=this.procesarmayorizars;
		}
		
		
		((ProcesarMayorizarModel) this.jTableDatosProcesarMayorizar.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesarMayorizar() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesarmayorizarAnterior(),this.procesarmayorizarLogic.getProcesarMayorizars());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesarmayorizarAnterior(),this.procesarmayorizars);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesarMayorizar();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesarMayorizar(ProcesarMayorizar procesarmayorizar,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
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
										
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesarmayorizar,new Object(),generalEntityParameterGeneral,this.procesarmayorizarReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesarmayorizarSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesarMayorizarConstantesFunciones.getClassesRelationshipsOfProcesarMayorizar(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesarMayorizarConstantesFunciones.getClassesRelationshipsFromStringsOfProcesarMayorizar(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesarMayorizar(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesarMayorizarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesarmayorizar,new Object(),generalEntityParameterGeneral,this.procesarmayorizarReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesarMayorizar(ProcesarMayorizarBean procesarmayorizarBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesarMayorizar(ArrayList<Classe> classes,ProcesarMayorizarReturnGeneral procesarmayorizarReturnGeneral,ProcesarMayorizarBean procesarmayorizarBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesarMayorizar(ProcesarMayorizar procesarmayorizar,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesarmayorizar)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesarMayorizar = new ProcesarMayorizarDetalleFormJInternalFrame(jDesktopPane,this.procesarmayorizarSessionBean.getConGuardarRelaciones(),this.procesarmayorizarSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesarMayorizar);
		this.jInternalFrameDetalleFormProcesarMayorizar.setVisible(false);
		this.jInternalFrameDetalleFormProcesarMayorizar.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesarMayorizar.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesarMayorizar.procesarmayorizarLogic=this.procesarmayorizarLogic;
		
		this.cargarCombosFrameForeignKeyProcesarMayorizar("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesarMayorizar();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesarMayorizar();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesarMayorizar("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesarMayorizar();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesarMayorizar.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesarMayorizar"));
		
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonModificarProcesarMayorizar.addActionListener(new ButtonActionListener(this,"ModificarProcesarMayorizar"));

		
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonModificarToolBarProcesarMayorizar.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesarMayorizar"));
					
		this.jInternalFrameDetalleFormProcesarMayorizar.jMenuItemModificarProcesarMayorizar.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesarMayorizar"));		
		
		
		
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonActualizarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"ActualizarProcesarMayorizar"));
		
		
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonActualizarToolBarProcesarMayorizar.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesarMayorizar"));
						
		this.jInternalFrameDetalleFormProcesarMayorizar.jMenuItemActualizarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesarMayorizar"));		
		
		
		
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonEliminarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"EliminarProcesarMayorizar"));
		
		
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonEliminarToolBarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesarMayorizar"));
								
		this.jInternalFrameDetalleFormProcesarMayorizar.jMenuItemEliminarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesarMayorizar"));		
		
		
		
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonCancelarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"CancelarProcesarMayorizar"));
		
		
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonCancelarToolBarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesarMayorizar"));
					
		this.jInternalFrameDetalleFormProcesarMayorizar.jMenuItemCancelarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesarMayorizar"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesarMayorizar.jMenuItemDetalleCerrarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesarMayorizar"));		
		
		
		
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonGuardarCambiosToolBarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesarMayorizar"));
		
		
		
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonGuardarCambiosToolBarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesarMayorizar"));
		
		
		
		this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxTiposAccionesFormularioProcesarMayorizar.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesarMayorizar"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonidProcesarMayorizarBusqueda.addActionListener(new ButtonActionListener(this,"idProcesarMayorizarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonid_anioProcesarMayorizarUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesarMayorizarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonid_anioProcesarMayorizarBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesarMayorizarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonid_mesProcesarMayorizarUpdate.addActionListener(new ButtonActionListener(this,"id_mesProcesarMayorizarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonid_mesProcesarMayorizarBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProcesarMayorizarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonid_tipo_documentoProcesarMayorizarUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoProcesarMayorizarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonid_tipo_documentoProcesarMayorizarBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoProcesarMayorizarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtoncodigoProcesarMayorizarBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesarMayorizarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonnombreProcesarMayorizarBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesarMayorizarBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesarMayorizar.jTabbedPaneRelacionesProcesarMayorizar.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesarMayorizar"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesarMayorizar"));
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarMayorizar.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesarMayorizar"));
		}
		
		this.jTableDatosProcesarMayorizar.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesarMayorizar"));
		
		this.jTableDatosProcesarMayorizar.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesarMayorizar"));
		
		this.jButtonNuevoProcesarMayorizar.addActionListener(new ButtonActionListener(this,"NuevoProcesarMayorizar"));
		
		this.jButtonDuplicarProcesarMayorizar.addActionListener(new ButtonActionListener(this,"DuplicarProcesarMayorizar"));
		
		this.jButtonCopiarProcesarMayorizar.addActionListener(new ButtonActionListener(this,"CopiarProcesarMayorizar"));
		
		this.jButtonVerFormProcesarMayorizar.addActionListener(new ButtonActionListener(this,"VerFormProcesarMayorizar"));
		
		
		this.jButtonNuevoToolBarProcesarMayorizar.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesarMayorizar"));
			
		this.jButtonDuplicarToolBarProcesarMayorizar.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesarMayorizar"));
			
		this.jMenuItemNuevoProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesarMayorizar"));
			
		this.jMenuItemDuplicarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesarMayorizar"));		
		
		
		this.jButtonNuevoRelacionesProcesarMayorizar.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesarMayorizar"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesarMayorizar.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesarMayorizar"));
			
		this.jMenuItemNuevoRelacionesProcesarMayorizar.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesarMayorizar"));		
		
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonModificarProcesarMayorizar.addActionListener(new ButtonActionListener(this,"ModificarProcesarMayorizar"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonModificarToolBarProcesarMayorizar.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesarMayorizar"));
			
			this.jInternalFrameDetalleFormProcesarMayorizar.jMenuItemModificarProcesarMayorizar.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesarMayorizar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonActualizarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"ActualizarProcesarMayorizar"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonActualizarToolBarProcesarMayorizar.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesarMayorizar"));
				
			this.jInternalFrameDetalleFormProcesarMayorizar.jMenuItemActualizarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesarMayorizar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonEliminarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"EliminarProcesarMayorizar"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonEliminarToolBarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesarMayorizar"));
						
			this.jInternalFrameDetalleFormProcesarMayorizar.jMenuItemEliminarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesarMayorizar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonCancelarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"CancelarProcesarMayorizar"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonCancelarToolBarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesarMayorizar"));
			
			this.jInternalFrameDetalleFormProcesarMayorizar.jMenuItemCancelarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesarMayorizar"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesarMayorizar"));		
		
		
		this.jButtonCerrarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"CerrarProcesarMayorizar"));
		
		
		this.jButtonCerrarToolBarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesarMayorizar"));
			
		this.jMenuItemCerrarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesarMayorizar"));
			
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarMayorizar.jMenuItemDetalleCerrarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesarMayorizar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonGuardarCambiosProcesarMayorizar.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesarMayorizar"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarMayorizar.jButtonGuardarCambiosToolBarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesarMayorizar"));
		}
		
		this.jButtonCopiarToolBarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesarMayorizar"));
			
		this.jButtonVerFormToolBarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesarMayorizar"));
		
		this.jMenuItemGuardarCambiosProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesarMayorizar"));
			
		this.jMenuItemCopiarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesarMayorizar"));		
		
		this.jMenuItemVerFormProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesarMayorizar"));		
		
		
		this.jButtonGuardarCambiosTablaProcesarMayorizar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesarMayorizar"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesarMayorizar"));
			
		this.jMenuItemGuardarCambiosTablaProcesarMayorizar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesarMayorizar"));		
		
		
		
		this.jButtonRecargarInformacionProcesarMayorizar.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesarMayorizar"));
					
		this.jButtonRecargarInformacionToolBarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesarMayorizar"));
		
		this.jMenuItemRecargarInformacionProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesarMayorizar"));		
		
		
		
		this.jButtonAnterioresProcesarMayorizar.addActionListener (new ButtonActionListener(this,"AnterioresProcesarMayorizar"));
		
		
		this.jButtonAnterioresToolBarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesarMayorizar"));
		
		this.jMenuItemAnterioresProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesarMayorizar"));		
		
		
		this.jButtonSiguientesProcesarMayorizar.addActionListener (new ButtonActionListener(this,"SiguientesProcesarMayorizar"));
		
		
		this.jButtonSiguientesToolBarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesarMayorizar"));
			
		this.jMenuItemSiguientesProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesarMayorizar"));
			
		this.jMenuItemAbrirOrderByProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesarMayorizar"));
			
		this.jMenuItemMostrarOcultarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesarMayorizar"));
			
		this.jMenuItemDetalleAbrirOrderByProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesarMayorizar"));
			
		this.jMenuItemDetalleMostarOcultarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesarMayorizar"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesarMayorizar.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesarMayorizar"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesarMayorizar"));
			
		this.jMenuItemNuevoGuardarCambiosProcesarMayorizar.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesarMayorizar"));		
		
		
		this.jButtonProcesarInformacionProcesarMayorizar.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesarMayorizar"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesarMayorizar.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesarMayorizar"));

		this.jCheckBoxSeleccionadosProcesarMayorizar.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesarMayorizar"));
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxTiposAccionesFormularioProcesarMayorizar.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesarMayorizar"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesarMayorizar.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesarMayorizar"));
			
		this.jComboBoxTiposAccionesProcesarMayorizar.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesarMayorizar"));
					
		this.jComboBoxTiposSeleccionarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesarMayorizar"));
			
		this.jTextFieldValorCampoGeneralProcesarMayorizar.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesarMayorizar"));		
		
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonidProcesarMayorizarBusqueda.addActionListener(new ButtonActionListener(this,"idProcesarMayorizarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonid_anioProcesarMayorizarUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesarMayorizarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonid_anioProcesarMayorizarBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesarMayorizarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonid_mesProcesarMayorizarUpdate.addActionListener(new ButtonActionListener(this,"id_mesProcesarMayorizarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonid_mesProcesarMayorizarBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProcesarMayorizarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonid_tipo_documentoProcesarMayorizarUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoProcesarMayorizarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonid_tipo_documentoProcesarMayorizarBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoProcesarMayorizarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtoncodigoProcesarMayorizarBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesarMayorizarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonnombreProcesarMayorizarBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesarMayorizarBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesarMayorizarProcesarMayorizar.addActionListener(new ButtonActionListener(this,"BusquedaProcesarMayorizarProcesarMayorizar"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesarMayorizar!=null) {
				this.jInternalFrameReporteDinamicoProcesarMayorizar.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesarMayorizar"));
				this.jInternalFrameReporteDinamicoProcesarMayorizar.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesarMayorizar"));
				this.jInternalFrameReporteDinamicoProcesarMayorizar.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesarMayorizar"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesarMayorizar.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesarMayorizar"));				
			//this.jButtonGenerarReporteDinamicoProcesarMayorizar.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesarMayorizar"));
			//this.jButtonGenerarExcelReporteDinamicoProcesarMayorizar.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesarMayorizar"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesarMayorizar!=null) {
				this.jInternalFrameImportacionProcesarMayorizar.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesarMayorizar"));
				this.jInternalFrameImportacionProcesarMayorizar.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesarMayorizar"));
				this.jInternalFrameImportacionProcesarMayorizar.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesarMayorizar"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesarMayorizar.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesarMayorizar"));
			
			this.jButtonAbrirOrderByToolBarProcesarMayorizar.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesarMayorizar"));			
			
			if(this.jInternalFrameOrderByProcesarMayorizar!=null) {
				this.jInternalFrameOrderByProcesarMayorizar.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesarMayorizar"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarMayorizar.jTabbedPaneRelacionesProcesarMayorizar.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesarMayorizar"));
		
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
            		closingInternalFrameProcesarMayorizar();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesarMayorizar.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesarMayorizar = (JInternalFrameBase)event.getSource();
	            	
	            ProcesarMayorizarBeanSwingJInternalFrame jInternalFrameParent=(ProcesarMayorizarBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesarMayorizar.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesarMayorizarActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesarMayorizar.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesarMayorizarListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesarMayorizar.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesarMayorizar.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesarMayorizarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesarMayorizarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesarMayorizarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesarMayorizar";
		inputMap = this.jButtonNuevoProcesarMayorizar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesarMayorizar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesarMayorizarActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesarMayorizarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesarMayorizarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesarMayorizarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesarMayorizar";
		inputMap = this.jButtonNuevoRelacionesProcesarMayorizar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesarMayorizar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesarMayorizarActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesarMayorizar";
		inputMap = this.jButtonModificarProcesarMayorizar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesarMayorizar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesarMayorizarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesarMayorizar";
		inputMap = this.jButtonActualizarProcesarMayorizar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesarMayorizar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesarMayorizarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesarMayorizar";
		inputMap = this.jButtonEliminarProcesarMayorizar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesarMayorizar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesarMayorizarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesarMayorizar";
		inputMap = this.jButtonCancelarProcesarMayorizar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesarMayorizar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesarMayorizarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesarMayorizar";
		inputMap = this.jButtonCerrarProcesarMayorizar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesarMayorizar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesarMayorizarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonGuardarCambiosProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesarMayorizar";
		inputMap = this.jInternalFrameDetalleFormProcesarMayorizar.jButtonGuardarCambiosProcesarMayorizar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonGuardarCambiosProcesarMayorizar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesarMayorizarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesarMayorizar.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesarMayorizarItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesarMayorizar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesarMayorizarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesarMayorizar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesarMayorizarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesarMayorizar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesarMayorizarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonidProcesarMayorizarBusqueda.addActionListener(new ButtonActionListener(this,"idProcesarMayorizarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonid_anioProcesarMayorizarUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesarMayorizarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonid_anioProcesarMayorizarBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesarMayorizarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonid_mesProcesarMayorizarUpdate.addActionListener(new ButtonActionListener(this,"id_mesProcesarMayorizarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonid_mesProcesarMayorizarBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProcesarMayorizarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonid_tipo_documentoProcesarMayorizarUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoProcesarMayorizarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonid_tipo_documentoProcesarMayorizarBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoProcesarMayorizarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtoncodigoProcesarMayorizarBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesarMayorizarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarMayorizar.jButtonnombreProcesarMayorizarBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesarMayorizarBusqueda"));
		
		
		this.jButtonBusquedaProcesarMayorizarProcesarMayorizar.addActionListener(new ButtonActionListener(this,"BusquedaProcesarMayorizarProcesarMayorizar"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesarMayorizar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesarMayorizarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesarMayorizarActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesarMayorizar.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesarMayorizar(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesarMayorizar procesarmayorizarAux:this.procesarmayorizarLogic.getProcesarMayorizars()) {
					procesarmayorizarAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesarMayorizar procesarmayorizarAux:procesarmayorizars) {
					procesarmayorizarAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesarMayorizarItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesarMayorizar(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesarMayorizar procesarmayorizarAux:this.procesarmayorizarLogic.getProcesarMayorizars()) {
						procesarmayorizarAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesarMayorizar procesarmayorizarAux:procesarmayorizars) {
						procesarmayorizarAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesarMayorizar procesarmayorizarAux:this.procesarmayorizarLogic.getProcesarMayorizars()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesarMayorizar procesarmayorizarAux:procesarmayorizars) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesarMayorizar(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesarMayorizar.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesarMayorizar.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesarMayorizar,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesarMayorizarItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesarMayorizar(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesarMayorizar.getSelectedRows();
			
			ProcesarMayorizar procesarmayorizarLocal=new ProcesarMayorizar();
			
			//this.seleccionarTodosProcesarMayorizar(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesarmayorizarLocal =(ProcesarMayorizar) this.procesarmayorizarLogic.getProcesarMayorizars().toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesarmayorizarLocal =(ProcesarMayorizar) this.procesarmayorizars.toArray()[this.jTableDatosProcesarMayorizar.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesarmayorizarLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesarMayorizar procesarmayorizarAux:this.procesarmayorizarLogic.getProcesarMayorizars()) {
						procesarmayorizarAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesarMayorizar procesarmayorizarAux:procesarmayorizars) {
						procesarmayorizarAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesarMayorizar(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesarMayorizar.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesarMayorizar.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesarMayorizar,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesarMayorizarItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesarMayorizarParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesarMayorizarActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesarMayorizar(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesarMayorizar.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesarMayorizar procesarmayorizarAux:this.procesarmayorizarLogic.getProcesarMayorizars()) {
				
						if(sTipoSeleccionar.equals(ProcesarMayorizarConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesarmayorizarAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesarMayorizarConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							procesarmayorizarAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesarMayorizar procesarmayorizarAux:procesarmayorizars) {
					
						if(sTipoSeleccionar.equals(ProcesarMayorizarConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesarmayorizarAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesarMayorizarConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							procesarmayorizarAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesarMayorizar(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesarMayorizarActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesarMayorizar(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesarMayorizar=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesarMayorizar.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxTiposAccionesFormularioProcesarMayorizar.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesarMayorizar) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesarMayorizar(conSplash);
				
					this.generarReporteProcesarMayorizarsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesarMayorizar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxTiposAccionesFormularioProcesarMayorizar.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesarMayorizarsSeleccionados();
				//this.jComboBoxTiposAccionesProcesarMayorizar.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesarMayorizarsSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesarMayorizar.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesarMayorizarsSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesarMayorizar.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesarMayorizar();
				
				this.exportarProcesarMayorizarsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesarMayorizar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxTiposAccionesFormularioProcesarMayorizar.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesarMayorizars();
				//this.importarProcesarMayorizars();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesarMayorizar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxTiposAccionesFormularioProcesarMayorizar.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesarMayorizar();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesarMayorizarsSeleccionados();
				//this.jComboBoxTiposAccionesProcesarMayorizar.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Procesar Mayorizar", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesarMayorizar();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesarMayorizar)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesarMayorizar(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Procesar Mayorizar",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesarMayorizar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxTiposAccionesFormularioProcesarMayorizar.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesarMayorizarBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesarMayorizar) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesarMayorizar(conSplash);
					
						//this.actualizarParametrosGeneralProcesarMayorizar();
						
						this.generarReporteProcesoAccionProcesarMayorizarsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesarMayorizar.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxTiposAccionesFormularioProcesarMayorizar.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesarMayorizarBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Procesar MayorizarES SELECCIONADOS?", "MANTENIMIENTO DE Procesar Mayorizar", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesarMayorizar();
				
						this.actualizarParametrosGeneralProcesarMayorizar();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesarmayorizarReturnGeneral=procesarmayorizarLogic.procesarAccionProcesarMayorizarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesarmayorizarLogic.getProcesarMayorizars(),this.procesarmayorizarParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesarMayorizarReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesarMayorizar.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxTiposAccionesFormularioProcesarMayorizar.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesarMayorizar();
					
					ProcesarMayorizarBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesarMayorizarReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesarMayorizar.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxTiposAccionesFormularioProcesarMayorizar.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesarMayorizar(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesarMayorizarActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesarMayorizar();
			
			if(this.jInternalFrameDetalleFormProcesarMayorizar==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesarMayorizar> procesarmayorizarsSeleccionados=new ArrayList<ProcesarMayorizar>();		
			ProcesarMayorizar procesarmayorizar=new ProcesarMayorizar();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesarMayorizar(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesarMayorizar.getSelectedItem();
			
			
			
			
			procesarmayorizarsSeleccionados=this.getProcesarMayorizarsSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesarmayorizarsSeleccionados.size()==1) {
				for(ProcesarMayorizar procesarmayorizarAux:procesarmayorizarsSeleccionados) {
					procesarmayorizar=procesarmayorizarAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesarMayorizar();
			
      		//this.finishProcessProcesarMayorizar(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesarMayorizarReturnGeneral() throws Exception {
		if(this.procesarmayorizarReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesarmayorizarReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesarmayorizarReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesarmayorizarReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesarmayorizarReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesarmayorizarReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesarMayorizar(false);
		}
		
		if(this.procesarmayorizarReturnGeneral.getConRetornoLista() || this.procesarmayorizarReturnGeneral.getConRetornoObjeto()) {
			if(this.procesarmayorizarReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesarmayorizarLogic.setProcesarMayorizars(this.procesarmayorizarReturnGeneral.getProcesarMayorizars());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesarMayorizar(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesarMayorizar() throws Exception {
		
		
	}
	
	public ArrayList<ProcesarMayorizar> getProcesarMayorizarsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesarMayorizar> procesarmayorizarsSeleccionados=new ArrayList<ProcesarMayorizar>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesarMayorizar) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesarMayorizar procesarmayorizarAux:procesarmayorizarLogic.getProcesarMayorizars()) {
					if(procesarmayorizarAux.getIsSelected()) {
						procesarmayorizarsSeleccionados.add(procesarmayorizarAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesarMayorizar procesarmayorizarAux:this.procesarmayorizars) {
					if(procesarmayorizarAux.getIsSelected()) {
						procesarmayorizarsSeleccionados.add(procesarmayorizarAux);				
					}
				}
			}
			
			if(procesarmayorizarsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesarmayorizarsSeleccionados.addAll(this.procesarmayorizarLogic.getProcesarMayorizars());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesarmayorizarsSeleccionados.addAll(this.procesarmayorizars);				
					}
				}
			}
		} else {
			procesarmayorizarsSeleccionados.add(this.procesarmayorizar);
		}
		
		return procesarmayorizarsSeleccionados;
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
	
	public void generarReporteProcesarMayorizarsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesarMayorizarsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesarMayorizarsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesarMayorizarsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesarMayorizarsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Procesar Mayorizar",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesarMayorizarsSeleccionados() throws Exception {
		ArrayList<ProcesarMayorizar> procesarmayorizarsSeleccionados=new ArrayList<ProcesarMayorizar>();		
		
		procesarmayorizarsSeleccionados=this.getProcesarMayorizarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesarMayorizars("Todos",procesarmayorizarsSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesarMayorizarsSeleccionados() throws Exception {
		ArrayList<ProcesarMayorizar> procesarmayorizarsSeleccionados=new ArrayList<ProcesarMayorizar>();		
		
		procesarmayorizarsSeleccionados=this.getProcesarMayorizarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesarMayorizars("Todos",procesarmayorizarsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesarMayorizarsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesarMayorizar> procesarmayorizarsSeleccionados=new ArrayList<ProcesarMayorizar>();
		
		procesarmayorizarsSeleccionados=this.getProcesarMayorizarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesarMayorizars("Todos",procesarmayorizarsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesarMayorizarsSeleccionados() throws Exception {
		ArrayList<ProcesarMayorizar> procesarmayorizarsSeleccionados=new ArrayList<ProcesarMayorizar>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesarMayorizar();
		
		
		procesarmayorizarsSeleccionados=this.getProcesarMayorizarsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesarMayorizar();
		
		
		//this.generarReporteProcesarMayorizars("Todos",procesarmayorizarsSeleccionados ,procesarmayorizarImplementable,procesarmayorizarImplementableHome);
	}
	
	public void mostrarImportacionProcesarMayorizars() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesarMayorizar();
		
		this.abrirFrameImportacionProcesarMayorizar();		
		
			
		//this.generarReporteProcesarMayorizars("Todos",procesarmayorizarsSeleccionados ,procesarmayorizarImplementable,procesarmayorizarImplementableHome);
	}
	
	public void importarProcesarMayorizars() throws Exception {		
	
	}
	
	public void exportarProcesarMayorizarsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesarMayorizarsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesarMayorizarsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesarMayorizarsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Procesar Mayorizar",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesarMayorizarsSeleccionados() throws Exception {
		ArrayList<ProcesarMayorizar> procesarmayorizarsSeleccionados=new ArrayList<ProcesarMayorizar>();		
		
		procesarmayorizarsSeleccionados=this.getProcesarMayorizarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarmayorizar."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesarMayorizar(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesarMayorizar procesarmayorizarAux:procesarmayorizarsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesarMayorizar(procesarmayorizarAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesarmayorizarAux.setsDetalleGeneralEntityReporte(procesarmayorizarAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Mayorizar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesarMayorizar(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesarMayorizarConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesarMayorizarConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesarMayorizarConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesarMayorizarConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesarMayorizarConstantesFunciones.LABEL_IDTIPODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesarMayorizarConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesarMayorizarConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesarMayorizar(ProcesarMayorizar procesarmayorizar,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesarmayorizar.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesarmayorizar.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesarmayorizar.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesarmayorizar.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesarmayorizar.gettipodocumento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesarmayorizar.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesarmayorizar.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesarMayorizarsSeleccionados() throws Exception {
		ArrayList<ProcesarMayorizar> procesarmayorizarsSeleccionados=new ArrayList<ProcesarMayorizar>();		
		
		procesarmayorizarsSeleccionados=this.getProcesarMayorizarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarmayorizar.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesarMayorizars");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesarMayorizar(row);				
				iRow++;
			}				
			
			for(ProcesarMayorizar procesarmayorizarAux:procesarmayorizarsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesarMayorizar(procesarmayorizarAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Mayorizar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesarMayorizarsSeleccionados() throws Exception {
		ArrayList<ProcesarMayorizar> procesarmayorizarsSeleccionados=new ArrayList<ProcesarMayorizar>();		
		
		procesarmayorizarsSeleccionados=this.getProcesarMayorizarsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarmayorizar.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesarmayorizars");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesarmayorizar");
			//elementRoot.appendChild(element);
		
			for(ProcesarMayorizar procesarmayorizarAux:procesarmayorizarsSeleccionados) {
				element = document.createElement("procesarmayorizar");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesarMayorizar(procesarmayorizarAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Mayorizar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesarMayorizar(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesarMayorizarConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesarMayorizarConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesarMayorizarConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesarMayorizarConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesarMayorizarConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesarMayorizarConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesarMayorizarConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesarMayorizar(ProcesarMayorizar procesarmayorizar,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesarmayorizar.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesarmayorizar.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesarmayorizar.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesarmayorizar.gettipodocumento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesarmayorizar.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(procesarmayorizar.getnombre());				
	}
	
	public void setFilaDatosExportarXmlProcesarMayorizar(ProcesarMayorizar procesarmayorizar,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesarMayorizarConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesarmayorizar.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesarMayorizarConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesarmayorizar.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementanio_descripcion = document.createElement(ProcesarMayorizarConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(procesarmayorizar.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(ProcesarMayorizarConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(procesarmayorizar.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementtipodocumento_descripcion = document.createElement(ProcesarMayorizarConstantesFunciones.IDTIPODOCUMENTO);
		elementtipodocumento_descripcion.appendChild(document.createTextNode(procesarmayorizar.gettipodocumento_descripcion()));
		element.appendChild(elementtipodocumento_descripcion);

		Element elementcodigo = document.createElement(ProcesarMayorizarConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(procesarmayorizar.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ProcesarMayorizarConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(procesarmayorizar.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoProcesarMayorizarsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesarMayorizar> procesarmayorizarsSeleccionados=new ArrayList<ProcesarMayorizar>();
		
		procesarmayorizarsSeleccionados=this.getProcesarMayorizarsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesarMayorizar(procesarmayorizarsSeleccionados);
		
		this.generarReporteProcesarMayorizars("Todos",procesarmayorizarsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesarMayorizar(ArrayList<ProcesarMayorizar> procesarmayorizarsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesarMayorizar procesarmayorizarAux:procesarmayorizarsSeleccionados) {
				procesarmayorizarAux.setsDetalleGeneralEntityReporte(procesarmayorizarAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesarMayorizarConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					procesarmayorizarAux.setsDescripcionGeneralEntityReporte1(procesarmayorizarAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesarMayorizarConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					procesarmayorizarAux.setsDescripcionGeneralEntityReporte1(procesarmayorizarAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesarMayorizarConstantesFunciones.LABEL_IDTIPODOCUMENTO)) {
					existe=true;
					procesarmayorizarAux.setsDescripcionGeneralEntityReporte1(procesarmayorizarAux.gettipodocumento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesarMayorizarConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					procesarmayorizarAux.setsDescripcionGeneralEntityReporte1(procesarmayorizarAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ProcesarMayorizarConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					procesarmayorizarAux.setsDescripcionGeneralEntityReporte1(procesarmayorizarAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarMayorizarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesarMayorizar(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesarMayorizar=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar=true;
				this.isVisibilidadCeldaGuardarCambiosProcesarMayorizar=true;
			}
			
			this.isVisibilidadCeldaModificarProcesarMayorizar=false;
			this.isVisibilidadCeldaActualizarProcesarMayorizar=false;
			this.isVisibilidadCeldaEliminarProcesarMayorizar=false;
			this.isVisibilidadCeldaCancelarProcesarMayorizar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarMayorizar=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesarMayorizar=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesarMayorizar=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarMayorizar=false;
			this.isVisibilidadCeldaModificarProcesarMayorizar=false;
			this.isVisibilidadCeldaActualizarProcesarMayorizar=true;
			this.isVisibilidadCeldaEliminarProcesarMayorizar=false;
			this.isVisibilidadCeldaCancelarProcesarMayorizar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarMayorizar=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesarMayorizar=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesarMayorizar=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarMayorizar=false;
			this.isVisibilidadCeldaModificarProcesarMayorizar=false;
			this.isVisibilidadCeldaActualizarProcesarMayorizar=true;
			this.isVisibilidadCeldaEliminarProcesarMayorizar=true;
			this.isVisibilidadCeldaCancelarProcesarMayorizar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarMayorizar=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesarMayorizar=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesarMayorizar=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarMayorizar=false;
			this.isVisibilidadCeldaModificarProcesarMayorizar=false;
			this.isVisibilidadCeldaActualizarProcesarMayorizar=true;
			this.isVisibilidadCeldaEliminarProcesarMayorizar=false;
			this.isVisibilidadCeldaCancelarProcesarMayorizar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarMayorizar=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesarMayorizar=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesarMayorizar=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar=true;
			this.isVisibilidadCeldaGuardarCambiosProcesarMayorizar=true;
			this.isVisibilidadCeldaModificarProcesarMayorizar=false;
			this.isVisibilidadCeldaActualizarProcesarMayorizar=false;
			this.isVisibilidadCeldaEliminarProcesarMayorizar=false;
			this.isVisibilidadCeldaCancelarProcesarMayorizar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarMayorizar=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesarMayorizar=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesarMayorizar=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarMayorizar=false;
			this.isVisibilidadCeldaActualizarProcesarMayorizar=false;
			this.isVisibilidadCeldaEliminarProcesarMayorizar=false;
			this.isVisibilidadCeldaCancelarProcesarMayorizar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarMayorizar=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesarMayorizar=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesarMayorizar=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarMayorizar=false;
			this.isVisibilidadCeldaModificarProcesarMayorizar=true;
			this.isVisibilidadCeldaActualizarProcesarMayorizar=false;
			this.isVisibilidadCeldaEliminarProcesarMayorizar=false;
			this.isVisibilidadCeldaCancelarProcesarMayorizar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarMayorizar=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesarMayorizar=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesarMayorizarJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesarMayorizar=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar=true;
			this.isVisibilidadCeldaGuardarCambiosProcesarMayorizar=true;
		} else {
			this.actualizarEstadoPanelsProcesarMayorizar(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesarMayorizar=false;
			//this.isVisibilidadCeldaVerFormProcesarMayorizar=false;
			this.isVisibilidadCeldaDuplicarProcesarMayorizar=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesarmayorizarSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesarMayorizar=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarMayorizar=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
			if(!procesarmayorizarSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar=false;												
			}
			
			this.jButtonCerrarProcesarMayorizar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar=false;
		}
		
		if(!this.permiteMantenimiento(this.procesarmayorizar)) {
			this.isVisibilidadCeldaActualizarProcesarMayorizar=false;
			this.isVisibilidadCeldaEliminarProcesarMayorizar=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesarMayorizar=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesarMayorizar=false;
		this.isVisibilidadCeldaGuardarCambiosProcesarMayorizar=false;
		//this.isVisibilidadCeldaModificarProcesarMayorizar=true;
		this.isVisibilidadCeldaActualizarProcesarMayorizar=false;
		this.isVisibilidadCeldaEliminarProcesarMayorizar=false;
		//this.isVisibilidadCeldaCancelarProcesarMayorizar=true;			
		this.isVisibilidadCeldaGuardarProcesarMayorizar=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesarMayorizar() {
	}
	
	public void actualizarEstadoPanelsProcesarMayorizar(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesarMayorizar!=null) {
				this.jScrollPanelDatosEdicionProcesarMayorizar.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarMayorizar!=null) {
				this.jTabbedPaneBusquedasProcesarMayorizar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesarMayorizar!=null) {
				this.jScrollPanelDatosProcesarMayorizar.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesarMayorizar!=null) {
				this.jPanelPaginacionProcesarMayorizar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesarMayorizar!=null) {
				this.jPanelParametrosReportesProcesarMayorizar.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesarMayorizar!=null) {
				this.jScrollPanelDatosEdicionProcesarMayorizar.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarMayorizar!=null) {
				this.jTabbedPaneBusquedasProcesarMayorizar.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesarMayorizar!=null) {
				this.jScrollPanelDatosProcesarMayorizar.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesarMayorizar!=null) {
				this.jPanelPaginacionProcesarMayorizar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesarMayorizar!=null) {
				this.jPanelParametrosReportesProcesarMayorizar.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesarMayorizar!=null) {
				this.jScrollPanelDatosEdicionProcesarMayorizar.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarMayorizar!=null) {
				this.jTabbedPaneBusquedasProcesarMayorizar.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesarMayorizar!=null) {
				this.jScrollPanelDatosProcesarMayorizar.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesarMayorizar!=null) {
				this.jPanelPaginacionProcesarMayorizar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesarMayorizar!=null) {
				this.jPanelParametrosReportesProcesarMayorizar.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesarMayorizar!=null) {
				this.jScrollPanelDatosEdicionProcesarMayorizar.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarMayorizar!=null) {
				this.jTabbedPaneBusquedasProcesarMayorizar.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesarMayorizar!=null) {
				this.jScrollPanelDatosProcesarMayorizar.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesarMayorizar!=null) {
				this.jPanelPaginacionProcesarMayorizar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesarMayorizar!=null) {
				this.jPanelParametrosReportesProcesarMayorizar.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesarMayorizar!=null) {
				this.jScrollPanelDatosEdicionProcesarMayorizar.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarMayorizar!=null) {
				this.jTabbedPaneBusquedasProcesarMayorizar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesarMayorizar!=null) {
				this.jScrollPanelDatosProcesarMayorizar.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesarMayorizar!=null) {
				this.jPanelPaginacionProcesarMayorizar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesarMayorizar!=null) {
				this.jPanelParametrosReportesProcesarMayorizar.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesarMayorizar!=null) {
				this.jScrollPanelDatosEdicionProcesarMayorizar.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarMayorizar!=null) {
				this.jTabbedPaneBusquedasProcesarMayorizar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesarMayorizar!=null) {
				this.jScrollPanelDatosProcesarMayorizar.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesarMayorizar!=null) {
				this.jPanelPaginacionProcesarMayorizar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesarMayorizar!=null) {
				this.jPanelParametrosReportesProcesarMayorizar.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesarMayorizar!=null) {
				this.jScrollPanelDatosEdicionProcesarMayorizar.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarMayorizar!=null) {
				this.jTabbedPaneBusquedasProcesarMayorizar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesarMayorizar!=null) {
				this.jScrollPanelDatosProcesarMayorizar.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesarMayorizar!=null) {
				this.jPanelPaginacionProcesarMayorizar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesarMayorizar!=null) {
				this.jPanelParametrosReportesProcesarMayorizar.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesarMayorizar!=null) {
					this.jTabbedPaneBusquedasProcesarMayorizar.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesarMayorizar!=null) {
				this.jPanelParametrosReportesProcesarMayorizar.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarMayorizar!=null) {
				this.jTabbedPaneBusquedasProcesarMayorizar.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesarMayorizar!=null) {
				this.jPanelParametrosReportesProcesarMayorizar.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadBusquedaProcesarMayorizar=isParaAnio;
			if(!this.isVisibilidadBusquedaProcesarMayorizar) {this.jTabbedPaneBusquedasProcesarMayorizar.remove(jPanelBusquedaProcesarMayorizarProcesarMayorizar);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadBusquedaProcesarMayorizar=isParaMes;
			if(!this.isVisibilidadBusquedaProcesarMayorizar) {this.jTabbedPaneBusquedasProcesarMayorizar.remove(jPanelBusquedaProcesarMayorizarProcesarMayorizar);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoDocumento(Boolean isParaTipoDocumento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoDocumentoNegation=!isParaTipoDocumento;

			this.isVisibilidadBusquedaProcesarMayorizar=isParaTipoDocumento;
			if(!this.isVisibilidadBusquedaProcesarMayorizar) {this.jTabbedPaneBusquedasProcesarMayorizar.remove(jPanelBusquedaProcesarMayorizarProcesarMayorizar);}
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
			
			this.inicializarActualizarBindingTablaProcesarMayorizar(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesarMayorizar() {
		this.updateBorderResaltarBusquedasFormularioProcesarMayorizar();
		this.updateVisibilidadBusquedasFormularioProcesarMayorizar();
		this.updateHabilitarBusquedasFormularioProcesarMayorizar();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesarMayorizar() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesarMayorizar.getComponents().length>0) {
	

		if(this.procesarmayorizarConstantesFunciones.resaltarBusquedaProcesarMayorizarProcesarMayorizar!=null) {
			index= this.jTabbedPaneBusquedasProcesarMayorizar.indexOfComponent(this.jPanelBusquedaProcesarMayorizarProcesarMayorizar);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesarMayorizar.getComponent(index);
				jPanel.setBorder(this.procesarmayorizarConstantesFunciones.resaltarBusquedaProcesarMayorizarProcesarMayorizar);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesarMayorizar() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesarMayorizar.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesarMayorizar.indexOfComponent(this.jPanelBusquedaProcesarMayorizarProcesarMayorizar);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesarMayorizar.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesarmayorizarConstantesFunciones.mostrarBusquedaProcesarMayorizarProcesarMayorizar);
			if(!this.procesarmayorizarConstantesFunciones.mostrarBusquedaProcesarMayorizarProcesarMayorizar && index>-1) {
				this.jTabbedPaneBusquedasProcesarMayorizar.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesarMayorizar() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesarMayorizar.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesarMayorizar.indexOfComponent(this.jPanelBusquedaProcesarMayorizarProcesarMayorizar);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesarMayorizar.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesarmayorizarConstantesFunciones.activarBusquedaProcesarMayorizarProcesarMayorizar);
				this.jTabbedPaneBusquedasProcesarMayorizar.setEnabledAt(index,this.procesarmayorizarConstantesFunciones.activarBusquedaProcesarMayorizarProcesarMayorizar);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesarMayorizar(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesarMayorizar")) {
			index= this.jTabbedPaneBusquedasProcesarMayorizar.indexOfComponent(this.jPanelBusquedaProcesarMayorizarProcesarMayorizar);

			this.jTabbedPaneBusquedasProcesarMayorizar.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesarMayorizar.getComponent(index);

			this.procesarmayorizarConstantesFunciones.setResaltarBusquedaProcesarMayorizarProcesarMayorizar(resaltar);

			jPanel.setBorder(this.procesarmayorizarConstantesFunciones.resaltarBusquedaProcesarMayorizarProcesarMayorizar);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesarMayorizar.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesarMayorizar() throws Exception {

		if(this.jInternalFrameDetalleFormProcesarMayorizar==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesarMayorizar();
		this.updateVisibilidadResaltarControlesFormularioProcesarMayorizar();
		this.updateHabilitarResaltarControlesFormularioProcesarMayorizar();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesarMayorizar() throws Exception {
		if(this.jInternalFrameDetalleFormProcesarMayorizar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesarmayorizarConstantesFunciones.resaltaridProcesarMayorizar!=null && this.jInternalFrameDetalleFormProcesarMayorizar!=null) {this.jInternalFrameDetalleFormProcesarMayorizar.jLabelidProcesarMayorizar.setBorder(this.procesarmayorizarConstantesFunciones.resaltaridProcesarMayorizar);}
		if(this.procesarmayorizarConstantesFunciones.resaltarid_anioProcesarMayorizar!=null && this.jInternalFrameDetalleFormProcesarMayorizar!=null) {this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_anioProcesarMayorizar.setBorder(this.procesarmayorizarConstantesFunciones.resaltarid_anioProcesarMayorizar);}
		if(this.procesarmayorizarConstantesFunciones.resaltarid_mesProcesarMayorizar!=null && this.jInternalFrameDetalleFormProcesarMayorizar!=null) {this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_mesProcesarMayorizar.setBorder(this.procesarmayorizarConstantesFunciones.resaltarid_mesProcesarMayorizar);}
		if(this.procesarmayorizarConstantesFunciones.resaltarid_tipo_documentoProcesarMayorizar!=null && this.jInternalFrameDetalleFormProcesarMayorizar!=null) {this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_tipo_documentoProcesarMayorizar.setBorder(this.procesarmayorizarConstantesFunciones.resaltarid_tipo_documentoProcesarMayorizar);}
		if(this.procesarmayorizarConstantesFunciones.resaltarcodigoProcesarMayorizar!=null && this.jInternalFrameDetalleFormProcesarMayorizar!=null) {this.jInternalFrameDetalleFormProcesarMayorizar.jTextFieldcodigoProcesarMayorizar.setBorder(this.procesarmayorizarConstantesFunciones.resaltarcodigoProcesarMayorizar);}
		if(this.procesarmayorizarConstantesFunciones.resaltarnombreProcesarMayorizar!=null && this.jInternalFrameDetalleFormProcesarMayorizar!=null) {this.jInternalFrameDetalleFormProcesarMayorizar.jTextAreanombreProcesarMayorizar.setBorder(this.procesarmayorizarConstantesFunciones.resaltarnombreProcesarMayorizar);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesarMayorizar() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesarMayorizar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
	
		//this.jInternalFrameDetalleFormProcesarMayorizar.jLabelidProcesarMayorizar.setVisible(this.procesarmayorizarConstantesFunciones.mostraridProcesarMayorizar);
		this.jInternalFrameDetalleFormProcesarMayorizar.jPanelidProcesarMayorizar.setVisible(this.procesarmayorizarConstantesFunciones.mostraridProcesarMayorizar);
		//this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_anioProcesarMayorizar.setVisible(this.procesarmayorizarConstantesFunciones.mostrarid_anioProcesarMayorizar);
		this.jInternalFrameDetalleFormProcesarMayorizar.jPanelid_anioProcesarMayorizar.setVisible(this.procesarmayorizarConstantesFunciones.mostrarid_anioProcesarMayorizar);
		//this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_mesProcesarMayorizar.setVisible(this.procesarmayorizarConstantesFunciones.mostrarid_mesProcesarMayorizar);
		this.jInternalFrameDetalleFormProcesarMayorizar.jPanelid_mesProcesarMayorizar.setVisible(this.procesarmayorizarConstantesFunciones.mostrarid_mesProcesarMayorizar);
		//this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_tipo_documentoProcesarMayorizar.setVisible(this.procesarmayorizarConstantesFunciones.mostrarid_tipo_documentoProcesarMayorizar);
		this.jInternalFrameDetalleFormProcesarMayorizar.jPanelid_tipo_documentoProcesarMayorizar.setVisible(this.procesarmayorizarConstantesFunciones.mostrarid_tipo_documentoProcesarMayorizar);
		//this.jInternalFrameDetalleFormProcesarMayorizar.jTextFieldcodigoProcesarMayorizar.setVisible(this.procesarmayorizarConstantesFunciones.mostrarcodigoProcesarMayorizar);
		this.jInternalFrameDetalleFormProcesarMayorizar.jPanelcodigoProcesarMayorizar.setVisible(this.procesarmayorizarConstantesFunciones.mostrarcodigoProcesarMayorizar);
		//this.jInternalFrameDetalleFormProcesarMayorizar.jTextAreanombreProcesarMayorizar.setVisible(this.procesarmayorizarConstantesFunciones.mostrarnombreProcesarMayorizar);
		this.jInternalFrameDetalleFormProcesarMayorizar.jPanelnombreProcesarMayorizar.setVisible(this.procesarmayorizarConstantesFunciones.mostrarnombreProcesarMayorizar);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesarMayorizar() throws Exception {
		if(this.jInternalFrameDetalleFormProcesarMayorizar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesarMayorizar!=null) {
	
		this.jInternalFrameDetalleFormProcesarMayorizar.jLabelidProcesarMayorizar.setEnabled(this.procesarmayorizarConstantesFunciones.activaridProcesarMayorizar);
		this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_anioProcesarMayorizar.setEnabled(this.procesarmayorizarConstantesFunciones.activarid_anioProcesarMayorizar);
		this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_mesProcesarMayorizar.setEnabled(this.procesarmayorizarConstantesFunciones.activarid_mesProcesarMayorizar);
		this.jInternalFrameDetalleFormProcesarMayorizar.jComboBoxid_tipo_documentoProcesarMayorizar.setEnabled(this.procesarmayorizarConstantesFunciones.activarid_tipo_documentoProcesarMayorizar);
		this.jInternalFrameDetalleFormProcesarMayorizar.jTextFieldcodigoProcesarMayorizar.setEnabled(this.procesarmayorizarConstantesFunciones.activarcodigoProcesarMayorizar);
		this.jInternalFrameDetalleFormProcesarMayorizar.jTextAreanombreProcesarMayorizar.setEnabled(this.procesarmayorizarConstantesFunciones.activarnombreProcesarMayorizar);
		}
	}
	
		
}