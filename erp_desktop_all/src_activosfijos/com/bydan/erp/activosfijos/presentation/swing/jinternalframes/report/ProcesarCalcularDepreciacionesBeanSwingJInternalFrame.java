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

//import com.bydan.erp.activosfijos.util.ProcesarCalcularDepreciacionesConstantesFunciones;
import com.bydan.erp.activosfijos.util.report.ProcesarCalcularDepreciacionesParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.report.ProcesarCalcularDepreciacionesParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.report.ProcesarCalcularDepreciacionesBean;
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
import com.bydan.erp.activosfijos.business.logic.*;

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
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesarCalcularDepreciacionesBeanSwingJInternalFrame extends ProcesarCalcularDepreciacionesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesarCalcularDepreciacionesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionesValidator = new ClassValidator<ProcesarCalcularDepreciaciones>(ProcesarCalcularDepreciaciones.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesarCalcularDepreciaciones procesarcalculardepreciaciones;	
	public ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux;
	public ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesarCalcularDepreciaciones procesarcalculardepreciacionesTotales;
	public Long idProcesarCalcularDepreciacionesActual;
	public Long iIdNuevoProcesarCalcularDepreciaciones=0L;
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

	public String sFinalQueryComboSubGrupoActivoFijo="";

	public List<SubGrupoActivoFijo> subgrupoactivofijosForeignKey;

	public List<SubGrupoActivoFijo> getsubgrupoactivofijosForeignKey() {
		return subgrupoactivofijosForeignKey;
	}

	public void setsubgrupoactivofijosForeignKey(List<SubGrupoActivoFijo> subgrupoactivofijosForeignKey) {
		this.subgrupoactivofijosForeignKey = subgrupoactivofijosForeignKey;
	}

	//OBJETO FK ACTUAL
	public SubGrupoActivoFijo subgrupoactivofijoForeignKey;

	public SubGrupoActivoFijo getsubgrupoactivofijoForeignKey() {
		return subgrupoactivofijoForeignKey;
	}

	public void setsubgrupoactivofijoForeignKey(SubGrupoActivoFijo subgrupoactivofijoForeignKey) {
		this.subgrupoactivofijoForeignKey = subgrupoactivofijoForeignKey;
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
	
	public Boolean isPermisoTodoProcesarCalcularDepreciaciones;
	public Boolean isPermisoNuevoProcesarCalcularDepreciaciones;
	public Boolean isPermisoActualizarProcesarCalcularDepreciaciones;
	public Boolean isPermisoActualizarOriginalProcesarCalcularDepreciaciones;
	public Boolean isPermisoEliminarProcesarCalcularDepreciaciones;
	public Boolean isPermisoGuardarCambiosProcesarCalcularDepreciaciones;
	public Boolean isPermisoConsultaProcesarCalcularDepreciaciones;
	public Boolean isPermisoBusquedaProcesarCalcularDepreciaciones;
	public Boolean isPermisoReporteProcesarCalcularDepreciaciones;
	public Boolean isPermisoPaginacionMedioProcesarCalcularDepreciaciones;
	public Boolean isPermisoPaginacionAltoProcesarCalcularDepreciaciones;
	public Boolean isPermisoPaginacionTodoProcesarCalcularDepreciaciones;
	public Boolean isPermisoCopiarProcesarCalcularDepreciaciones;
	public Boolean isPermisoVerFormProcesarCalcularDepreciaciones;
	public Boolean isPermisoDuplicarProcesarCalcularDepreciaciones;
	public Boolean isPermisoOrdenProcesarCalcularDepreciaciones;
	
	
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
	
	public ProcesarCalcularDepreciacionesParameterReturnGeneral procesarcalculardepreciacionesReturnGeneral;
	public ProcesarCalcularDepreciacionesParameterReturnGeneral procesarcalculardepreciacionesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesarCalcularDepreciaciones=false;
	public Boolean esParaAccionDesdeFormularioProcesarCalcularDepreciaciones=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesarCalcularDepreciacionesSessionBeanAdditional procesarcalculardepreciacionesSessionBeanAdditional=null;
	
	public ProcesarCalcularDepreciacionesSessionBeanAdditional getProcesarCalcularDepreciacionesSessionBeanAdditional() {
		return this.procesarcalculardepreciacionesSessionBeanAdditional;
	}
	
	public void setProcesarCalcularDepreciacionesSessionBeanAdditional(ProcesarCalcularDepreciacionesSessionBeanAdditional procesarcalculardepreciacionesSessionBeanAdditional) {
		try {
			this.procesarcalculardepreciacionesSessionBeanAdditional=procesarcalculardepreciacionesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional procesarcalculardepreciacionesBeanSwingJInternalFrameAdditional=null;
	//public class ProcesarCalcularDepreciacionesBeanSwingJInternalFrame
	
	public ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional getProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional() {
		return this.procesarcalculardepreciacionesBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional(ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional procesarcalculardepreciacionesBeanSwingJInternalFrameAdditional) {
		try {
			this.procesarcalculardepreciacionesBeanSwingJInternalFrameAdditional=procesarcalculardepreciacionesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesarCalcularDepreciacionesLogic procesarcalculardepreciacionesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesarCalcularDepreciaciones procesarcalculardepreciacionesBean;
	public ProcesarCalcularDepreciacionesConstantesFunciones procesarcalculardepreciacionesConstantesFunciones;
	//public ProcesarCalcularDepreciacionesParameterReturnGeneral procesarcalculardepreciacionesReturnGeneral;
	
	//FK
	
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	public DetalleGrupoActivoFijoLogic detallegrupoactivofijoLogic;
	public SubGrupoActivoFijoLogic subgrupoactivofijoLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacioness;	
	//public List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessEliminados;
	//public List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones=false;
	public Boolean isVisibilidadCeldaDuplicarProcesarCalcularDepreciaciones=true;
	public Boolean isVisibilidadCeldaCopiarProcesarCalcularDepreciaciones=true;
	public Boolean isVisibilidadCeldaVerFormProcesarCalcularDepreciaciones=true;
	public Boolean isVisibilidadCeldaOrdenProcesarCalcularDepreciaciones=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones=false;
	public Boolean isVisibilidadCeldaModificarProcesarCalcularDepreciaciones=false;
	public Boolean isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones=false;
	public Boolean isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones=false;
	public Boolean isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones=false;
	public Boolean isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesarCalcularDepreciaciones=false;
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdDetalleGrupoActivoFijo=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdSubGrupoActivoFijo=false;
	
	public Long getiIdNuevoProcesarCalcularDepreciaciones() {
		return this.iIdNuevoProcesarCalcularDepreciaciones;
	}

	public void setiIdNuevoProcesarCalcularDepreciaciones(Long iIdNuevoProcesarCalcularDepreciaciones) {
		this.iIdNuevoProcesarCalcularDepreciaciones = iIdNuevoProcesarCalcularDepreciaciones;
	}
	
	public Long getidProcesarCalcularDepreciacionesActual() {
		return this.idProcesarCalcularDepreciacionesActual;
	}

	public void setidProcesarCalcularDepreciacionesActual(Long idProcesarCalcularDepreciacionesActual) {
		this.idProcesarCalcularDepreciacionesActual = idProcesarCalcularDepreciacionesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesarCalcularDepreciaciones getprocesarcalculardepreciaciones() {
		return this.procesarcalculardepreciaciones;
	}

	public void setprocesarcalculardepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones) {
		this.procesarcalculardepreciaciones = procesarcalculardepreciaciones;
	}
	
	public ProcesarCalcularDepreciaciones getprocesarcalculardepreciacionesAux() {
		return this.procesarcalculardepreciacionesAux;
	}

	public void setprocesarcalculardepreciacionesAux(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux) {
		this.procesarcalculardepreciacionesAux = procesarcalculardepreciacionesAux;
	}				
	
	public ProcesarCalcularDepreciaciones getprocesarcalculardepreciacionesAnterior() {
		return this.procesarcalculardepreciacionesAnterior;
	}

	public void setprocesarcalculardepreciacionesAnterior(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAnterior) {
		this.procesarcalculardepreciacionesAnterior = procesarcalculardepreciacionesAnterior;
	}	
	
	public ProcesarCalcularDepreciaciones getprocesarcalculardepreciacionesTotales() {
		return this.procesarcalculardepreciacionesTotales;
	}

	public void setprocesarcalculardepreciacionesTotales(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesTotales) {
		this.procesarcalculardepreciacionesTotales = procesarcalculardepreciacionesTotales;
	}	
	
	public ProcesarCalcularDepreciaciones getprocesarcalculardepreciacionesBean() {
		return this.procesarcalculardepreciacionesBean;
	}

	public void setprocesarcalculardepreciacionesBean(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesBean) {
		this.procesarcalculardepreciacionesBean = procesarcalculardepreciacionesBean;
	}	
	
	public ProcesarCalcularDepreciacionesParameterReturnGeneral getprocesarcalculardepreciacionesReturnGeneral() {
		return this.procesarcalculardepreciacionesReturnGeneral;
	}

	public void setprocesarcalculardepreciacionesReturnGeneral(ProcesarCalcularDepreciacionesParameterReturnGeneral procesarcalculardepreciacionesReturnGeneral) {
		this.procesarcalculardepreciacionesReturnGeneral = procesarcalculardepreciacionesReturnGeneral;
	}	
	
	
	public Long id_anioBusquedaProcesarCalcularDepreciaciones=null;

	public Long getid_anioBusquedaProcesarCalcularDepreciaciones() {
		return this.id_anioBusquedaProcesarCalcularDepreciaciones;
	}

	public void setid_anioBusquedaProcesarCalcularDepreciaciones(Long id_anioBusquedaProcesarCalcularDepreciaciones) {
		this.id_anioBusquedaProcesarCalcularDepreciaciones = id_anioBusquedaProcesarCalcularDepreciaciones;
	}

;
	public Long id_mesBusquedaProcesarCalcularDepreciaciones=null;

	public Long getid_mesBusquedaProcesarCalcularDepreciaciones() {
		return this.id_mesBusquedaProcesarCalcularDepreciaciones;
	}

	public void setid_mesBusquedaProcesarCalcularDepreciaciones(Long id_mesBusquedaProcesarCalcularDepreciaciones) {
		this.id_mesBusquedaProcesarCalcularDepreciaciones = id_mesBusquedaProcesarCalcularDepreciaciones;
	}

;
	public Long id_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones=-1L;

	public Long getid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones() {
		return this.id_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones;
	}

	public void setid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones(Long id_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones) {
		this.id_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones = id_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones;
	}

;
	public Long id_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones=-1L;

	public Long getid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones() {
		return this.id_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones;
	}

	public void setid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones(Long id_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones) {
		this.id_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones = id_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones;
	}

	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo=-1L;

	public Long getid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo() {
		return this.id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo;
	}

	public void setid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo(Long id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo) {
		this.id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo = id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

	public Long id_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijo=-1L;

	public Long getid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijo() {
		return this.id_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijo;
	}

	public void setid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijo(Long id_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijo) {
		this.id_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijo = id_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesarCalcularDepreciacionesLogic getProcesarCalcularDepreciacionesLogic()	{		
		return procesarcalculardepreciacionesLogic;
	}

	public void setProcesarCalcularDepreciacionesLogic(ProcesarCalcularDepreciacionesLogic procesarcalculardepreciacionesLogic) {
		this.procesarcalculardepreciacionesLogic = procesarcalculardepreciacionesLogic;
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
	
	public Boolean getIsEsNuevoProcesarCalcularDepreciaciones() {
		return isEsNuevoProcesarCalcularDepreciaciones;
	}

	public void setIsEsNuevoProcesarCalcularDepreciaciones(Boolean isEsNuevoProcesarCalcularDepreciaciones) {
		this.isEsNuevoProcesarCalcularDepreciaciones = isEsNuevoProcesarCalcularDepreciaciones;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesarCalcularDepreciaciones() {
		return esParaAccionDesdeFormularioProcesarCalcularDepreciaciones;
	}
	
	public void setEsParaAccionDesdeFormularioProcesarCalcularDepreciaciones(Boolean esParaAccionDesdeFormularioProcesarCalcularDepreciaciones) {
		this.esParaAccionDesdeFormularioProcesarCalcularDepreciaciones = esParaAccionDesdeFormularioProcesarCalcularDepreciaciones;
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

			if(this.procesarcalculardepreciacionesSessionBean==null) {
				this.procesarcalculardepreciacionesSessionBean=new ProcesarCalcularDepreciacionesSessionBean();
			}

			if(!this.procesarcalculardepreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(procesarcalculardepreciacionesSessionBean.getlidAnioActual());
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

			if(this.procesarcalculardepreciacionesSessionBean==null) {
				this.procesarcalculardepreciacionesSessionBean=new ProcesarCalcularDepreciacionesSessionBean();
			}

			if(!this.procesarcalculardepreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(procesarcalculardepreciacionesSessionBean.getlidMesActual());
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

			if(this.procesarcalculardepreciacionesSessionBean==null) {
				this.procesarcalculardepreciacionesSessionBean=new ProcesarCalcularDepreciacionesSessionBean();
			}

			if(!this.procesarcalculardepreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo()) {
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
					detallegrupoactivofijoLogic.getEntityWithConnection(procesarcalculardepreciacionesSessionBean.getlidDetalleGrupoActivoFijoActual());
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

	public void cargarCombosSubGrupoActivoFijosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.subgrupoactivofijosForeignKey=new ArrayList<SubGrupoActivoFijo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SubGrupoActivoFijoLogic subgrupoactivofijoLogic=new SubGrupoActivoFijoLogic();

			subgrupoactivofijoLogic.getSubGrupoActivoFijoDataAccess().setIsForForeingKeyData(true);

			if(this.procesarcalculardepreciacionesSessionBean==null) {
				this.procesarcalculardepreciacionesSessionBean=new ProcesarCalcularDepreciacionesSessionBean();
			}

			if(!this.procesarcalculardepreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionSubGrupoActivoFijo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subgrupoactivofijoLogic.getSubGrupoActivoFijoDataAccess().setIsForForeingKeyData(true);

					subgrupoactivofijoLogic.getTodosSubGrupoActivoFijosWithConnection(sFinalQuery,new Pagination());

					this.subgrupoactivofijosForeignKey=subgrupoactivofijoLogic.getSubGrupoActivoFijos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSubGrupoActivoFijo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					subgrupoactivofijoLogic.getEntityWithConnection(procesarcalculardepreciacionesSessionBean.getlidSubGrupoActivoFijoActual());
					this.subgrupoactivofijosForeignKey.add(subgrupoactivofijoLogic.getSubGrupoActivoFijo());
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

					if(this.procesarcalculardepreciaciones!=null) {
						this.procesarcalculardepreciaciones.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
						this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_anioProcesarCalcularDepreciaciones.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioProcesarCalcularDepreciaciones.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
						if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_anioProcesarCalcularDepreciaciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_anioProcesarCalcularDepreciaciones.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesarCalcularDepreciaciones") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones!=null) {
						jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones!=null) {
							//jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedItem(anioTemp);
							if(jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.getItemCount()>0) {
								jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioProcesarCalcularDepreciacionesGenerico)throws Exception
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
				jComboBoxid_anioProcesarCalcularDepreciacionesGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioProcesarCalcularDepreciacionesGenerico!=null && jComboBoxid_anioProcesarCalcularDepreciacionesGenerico.getItemCount()>0) {
					jComboBoxid_anioProcesarCalcularDepreciacionesGenerico.setSelectedIndex(0);
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

					if(this.procesarcalculardepreciaciones!=null) {
						this.procesarcalculardepreciaciones.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
						this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_mesProcesarCalcularDepreciaciones.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesProcesarCalcularDepreciaciones.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
						if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_mesProcesarCalcularDepreciaciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_mesProcesarCalcularDepreciaciones.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesarCalcularDepreciaciones") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones!=null) {
						jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones!=null) {
							//jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedItem(mesTemp);
							if(jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.getItemCount()>0) {
								jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesProcesarCalcularDepreciacionesGenerico)throws Exception
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
				jComboBoxid_mesProcesarCalcularDepreciacionesGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesProcesarCalcularDepreciacionesGenerico!=null && jComboBoxid_mesProcesarCalcularDepreciacionesGenerico.getItemCount()>0) {
					jComboBoxid_mesProcesarCalcularDepreciacionesGenerico.setSelectedIndex(0);
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

					if(this.procesarcalculardepreciaciones!=null) {
						this.procesarcalculardepreciaciones.setDetalleGrupoActivoFijo(detallegrupoactivofijoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
						this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setSelectedItem(detallegrupoactivofijoTemp);
					}
				} else {
					//jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setSelectedItem(detallegrupoactivofijoTemp);
					if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
						if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesarCalcularDepreciaciones") || sFormularioTipoBusqueda.equals("Todos")){
					if(detallegrupoactivofijoTemp!=null && jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones!=null) {
						jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedItem(detallegrupoactivofijoTemp);
					} else {
						if(jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones!=null) {
							//jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedItem(detallegrupoactivofijoTemp);
							if(jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.getItemCount()>0) {
								jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedIndex(0);
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
	public void setActualDetalleGrupoActivoFijoForeignKeyGenerico(Long idDetalleGrupoActivoFijoSeleccionado,JComboBox jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesGenerico)throws Exception
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
				jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesGenerico.setSelectedItem(detallegrupoactivofijoTemp);
			} else {
				if(jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesGenerico!=null && jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesGenerico.getItemCount()>0) {
					jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSubGrupoActivoFijoForeignKey(Long idSubGrupoActivoFijoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			SubGrupoActivoFijo  subgrupoactivofijoTemp=null;

			for(SubGrupoActivoFijo subgrupoactivofijoAux:subgrupoactivofijosForeignKey) {
				if(subgrupoactivofijoAux.getId()!=null && subgrupoactivofijoAux.getId().equals(idSubGrupoActivoFijoSeleccionado)) {
					subgrupoactivofijoTemp=subgrupoactivofijoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(subgrupoactivofijoTemp!=null) {

					if(this.procesarcalculardepreciaciones!=null) {
						this.procesarcalculardepreciaciones.setSubGrupoActivoFijo(subgrupoactivofijoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
						this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setSelectedItem(subgrupoactivofijoTemp);
					}
				} else {
					//jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setSelectedItem(subgrupoactivofijoTemp);
					if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
						if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesarCalcularDepreciaciones") || sFormularioTipoBusqueda.equals("Todos")){
					if(subgrupoactivofijoTemp!=null && jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones!=null) {
						jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedItem(subgrupoactivofijoTemp);
					} else {
						if(jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones!=null) {
							//jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedItem(subgrupoactivofijoTemp);
							if(jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.getItemCount()>0) {
								jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedIndex(0);
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

	public String getActualSubGrupoActivoFijoForeignKeyDescripcion(Long idSubGrupoActivoFijoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			SubGrupoActivoFijo  subgrupoactivofijoTemp=null;

			for(SubGrupoActivoFijo subgrupoactivofijoAux:subgrupoactivofijosForeignKey) {
				if(subgrupoactivofijoAux.getId()!=null && subgrupoactivofijoAux.getId().equals(idSubGrupoActivoFijoSeleccionado)) {
					subgrupoactivofijoTemp=subgrupoactivofijoAux;
					break;
				}
			}


			sDescripcion=SubGrupoActivoFijoConstantesFunciones.getSubGrupoActivoFijoDescripcion(subgrupoactivofijoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSubGrupoActivoFijoForeignKeyGenerico(Long idSubGrupoActivoFijoSeleccionado,JComboBox jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesGenerico)throws Exception
	{
		try
		{
			SubGrupoActivoFijo  subgrupoactivofijoTemp=null;

			for(SubGrupoActivoFijo subgrupoactivofijoAux:subgrupoactivofijosForeignKey) {
				if(subgrupoactivofijoAux.getId()!=null && subgrupoactivofijoAux.getId().equals(idSubGrupoActivoFijoSeleccionado)) {
					subgrupoactivofijoTemp=subgrupoactivofijoAux;
					break;
				}
			}

			if(subgrupoactivofijoTemp!=null) {
				jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesGenerico.setSelectedItem(subgrupoactivofijoTemp);
			} else {
				if(jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesGenerico!=null && jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesGenerico.getItemCount()>0) {
					jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,JComboBox jComboBoxid_anioProcesarCalcularDepreciacionesGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioProcesarCalcularDepreciacionesGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_anioProcesarCalcularDepreciaciones.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioProcesarCalcularDepreciacionesGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				procesarcalculardepreciaciones.setid_anio(anioAux.getId());
				procesarcalculardepreciaciones.setanio_descripcion(ProcesarCalcularDepreciacionesConstantesFunciones.getAnioDescripcion(anioAux));
				procesarcalculardepreciaciones.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,JComboBox jComboBoxid_mesProcesarCalcularDepreciacionesGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesProcesarCalcularDepreciacionesGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_mesProcesarCalcularDepreciaciones.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesProcesarCalcularDepreciacionesGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				procesarcalculardepreciaciones.setid_mes(mesAux.getId());
				procesarcalculardepreciaciones.setmes_descripcion(ProcesarCalcularDepreciacionesConstantesFunciones.getMesDescripcion(mesAux));
				procesarcalculardepreciaciones.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDetalleGrupoActivoFijoForeignKey(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,JComboBox jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesGenerico)throws Exception
	{
		try
		{
			DetalleGrupoActivoFijo  detallegrupoactivofijoAux=new DetalleGrupoActivoFijo();

			if(jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesGenerico==null) {
				detallegrupoactivofijoAux=(DetalleGrupoActivoFijo)this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.getSelectedItem();
			} else {
				detallegrupoactivofijoAux=(DetalleGrupoActivoFijo)jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesGenerico.getSelectedItem();
			}

			if(detallegrupoactivofijoAux!=null && detallegrupoactivofijoAux.getId()!=null) {
				procesarcalculardepreciaciones.setid_detalle_grupo_activo_fijo(detallegrupoactivofijoAux.getId());
				procesarcalculardepreciaciones.setdetallegrupoactivofijo_descripcion(ProcesarCalcularDepreciacionesConstantesFunciones.getDetalleGrupoActivoFijoDescripcion(detallegrupoactivofijoAux));
				procesarcalculardepreciaciones.setDetalleGrupoActivoFijo(detallegrupoactivofijoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSubGrupoActivoFijoForeignKey(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,JComboBox jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesGenerico)throws Exception
	{
		try
		{
			SubGrupoActivoFijo  subgrupoactivofijoAux=new SubGrupoActivoFijo();

			if(jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesGenerico==null) {
				subgrupoactivofijoAux=(SubGrupoActivoFijo)this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.getSelectedItem();
			} else {
				subgrupoactivofijoAux=(SubGrupoActivoFijo)jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesGenerico.getSelectedItem();
			}

			if(subgrupoactivofijoAux!=null && subgrupoactivofijoAux.getId()!=null) {
				procesarcalculardepreciaciones.setid_sub_grupo_activo_fijo(subgrupoactivofijoAux.getId());
				procesarcalculardepreciaciones.setsubgrupoactivofijo_descripcion(ProcesarCalcularDepreciacionesConstantesFunciones.getSubGrupoActivoFijoDescripcion(subgrupoactivofijoAux));
				procesarcalculardepreciaciones.setSubGrupoActivoFijo(subgrupoactivofijoAux);			}
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

					if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { 
							this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_anioProcesarCalcularDepreciaciones.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_anioProcesarCalcularDepreciaciones.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { 
					}

					if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesarCalcularDepreciaciones") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.addItem(anio);
							}
						}

						if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { 
							this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_mesProcesarCalcularDepreciaciones.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_mesProcesarCalcularDepreciaciones.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { 
					}

					if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesarCalcularDepreciaciones") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.addItem(mes);
							}
						}

						if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { 
							this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.removeAllItems();

							for(DetalleGrupoActivoFijo detallegrupoactivofijo:this.detallegrupoactivofijosForeignKey) {
								this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.addItem(detallegrupoactivofijo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { 
					}

					if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesarCalcularDepreciaciones") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.removeAllItems();

							for(DetalleGrupoActivoFijo detallegrupoactivofijo:this.detallegrupoactivofijosForeignKey) {
								this.jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.addItem(detallegrupoactivofijo);
							}
						}

						if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSubGrupoActivoFijosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSubGrupoActivoFijo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { 
							this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.removeAllItems();

							for(SubGrupoActivoFijo subgrupoactivofijo:this.subgrupoactivofijosForeignKey) {
								this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.addItem(subgrupoactivofijo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { 
					}

					if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesarCalcularDepreciaciones") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.removeAllItems();

							for(SubGrupoActivoFijo subgrupoactivofijo:this.subgrupoactivofijosForeignKey) {
								this.jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.addItem(subgrupoactivofijo);
							}
						}

						if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
							this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_anioProcesarCalcularDepreciaciones.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
							this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_anioProcesarCalcularDepreciaciones.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
							this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_mesProcesarCalcularDepreciaciones.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
							this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_mesProcesarCalcularDepreciaciones.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
							this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setSelectedItem(detallegrupoactivofijo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
							this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedItem(detallegrupoactivofijo);
						} else {
							this.jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameSubGrupoActivoFijoForeignKey(SubGrupoActivoFijo subgrupoactivofijo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
							this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setSelectedItem(subgrupoactivofijo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
							this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedItem(subgrupoactivofijo);
						} else {
							this.jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesarCalcularDepreciaciones() throws Exception {
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
		
	public ProcesarCalcularDepreciacionesParameterReturnGeneral getProcesarCalcularDepreciacionesParameterGeneral() {
		return this.procesarcalculardepreciacionesParameterGeneral;
	}
	
	public void setProcesarCalcularDepreciacionesParameterGeneral(ProcesarCalcularDepreciacionesParameterReturnGeneral procesarcalculardepreciacionesParameterGeneral) {
		this.procesarcalculardepreciacionesParameterGeneral = procesarcalculardepreciacionesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesarCalcularDepreciaciones() {
		return isPermisoTodoProcesarCalcularDepreciaciones;
	}

	public void setIsPermisoTodoProcesarCalcularDepreciaciones(Boolean isPermisoTodoProcesarCalcularDepreciaciones) {
		this.isPermisoTodoProcesarCalcularDepreciaciones = isPermisoTodoProcesarCalcularDepreciaciones;
	}

	public Boolean getIsPermisoNuevoProcesarCalcularDepreciaciones() {
		return isPermisoNuevoProcesarCalcularDepreciaciones;
	}

	public void setIsPermisoNuevoProcesarCalcularDepreciaciones(Boolean isPermisoNuevoProcesarCalcularDepreciaciones) {
		this.isPermisoNuevoProcesarCalcularDepreciaciones = isPermisoNuevoProcesarCalcularDepreciaciones;
	}

	public Boolean getIsPermisoActualizarProcesarCalcularDepreciaciones() {
		return isPermisoActualizarProcesarCalcularDepreciaciones;
	}

	public void setIsPermisoActualizarProcesarCalcularDepreciaciones(Boolean isPermisoActualizarProcesarCalcularDepreciaciones) {
		this.isPermisoActualizarProcesarCalcularDepreciaciones = isPermisoActualizarProcesarCalcularDepreciaciones;
	}

	public Boolean getIsPermisoEliminarProcesarCalcularDepreciaciones() {
		return isPermisoEliminarProcesarCalcularDepreciaciones;
	}

	public void setIsPermisoEliminarProcesarCalcularDepreciaciones(Boolean isPermisoEliminarProcesarCalcularDepreciaciones) {
		this.isPermisoEliminarProcesarCalcularDepreciaciones = isPermisoEliminarProcesarCalcularDepreciaciones;
	}

	public Boolean getIsPermisoGuardarCambiosProcesarCalcularDepreciaciones() {
		return isPermisoGuardarCambiosProcesarCalcularDepreciaciones;
	}

	public void setIsPermisoGuardarCambiosProcesarCalcularDepreciaciones(Boolean isPermisoGuardarCambiosProcesarCalcularDepreciaciones) {
		this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones = isPermisoGuardarCambiosProcesarCalcularDepreciaciones;
	}
	
	public Boolean getIsPermisoConsultaProcesarCalcularDepreciaciones() {
		return isPermisoConsultaProcesarCalcularDepreciaciones;
	}

	public void setIsPermisoConsultaProcesarCalcularDepreciaciones(Boolean isPermisoConsultaProcesarCalcularDepreciaciones) {
		this.isPermisoConsultaProcesarCalcularDepreciaciones = isPermisoConsultaProcesarCalcularDepreciaciones;
	}

	public Boolean getIsPermisoBusquedaProcesarCalcularDepreciaciones() {
		return isPermisoBusquedaProcesarCalcularDepreciaciones;
	}

	public void setIsPermisoBusquedaProcesarCalcularDepreciaciones(Boolean isPermisoBusquedaProcesarCalcularDepreciaciones) {
		this.isPermisoBusquedaProcesarCalcularDepreciaciones = isPermisoBusquedaProcesarCalcularDepreciaciones;
	}

	public Boolean getIsPermisoReporteProcesarCalcularDepreciaciones() {
		return isPermisoReporteProcesarCalcularDepreciaciones;
	}

	public void setIsPermisoReporteProcesarCalcularDepreciaciones(Boolean isPermisoReporteProcesarCalcularDepreciaciones) {
		this.isPermisoReporteProcesarCalcularDepreciaciones = isPermisoReporteProcesarCalcularDepreciaciones;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesarCalcularDepreciaciones() {
		return isPermisoPaginacionMedioProcesarCalcularDepreciaciones;
	}

	public void setIsPermisoPaginacionMedioProcesarCalcularDepreciaciones(Boolean isPermisoPaginacionMedioProcesarCalcularDepreciaciones) {
		this.isPermisoPaginacionMedioProcesarCalcularDepreciaciones = isPermisoPaginacionMedioProcesarCalcularDepreciaciones;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesarCalcularDepreciaciones() {
		return isPermisoPaginacionTodoProcesarCalcularDepreciaciones;
	}

	public void setIsPermisoPaginacionTodoProcesarCalcularDepreciaciones(Boolean isPermisoPaginacionTodoProcesarCalcularDepreciaciones) {
		this.isPermisoPaginacionTodoProcesarCalcularDepreciaciones = isPermisoPaginacionTodoProcesarCalcularDepreciaciones;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesarCalcularDepreciaciones() {
		return isPermisoPaginacionAltoProcesarCalcularDepreciaciones;
	}

	public void setIsPermisoPaginacionAltoProcesarCalcularDepreciaciones(Boolean isPermisoPaginacionAltoProcesarCalcularDepreciaciones) {
		this.isPermisoPaginacionAltoProcesarCalcularDepreciaciones = isPermisoPaginacionAltoProcesarCalcularDepreciaciones;
	}
	
	public Boolean getIsPermisoCopiarProcesarCalcularDepreciaciones() {
		return isPermisoCopiarProcesarCalcularDepreciaciones;
	}

	public void setIsPermisoCopiarProcesarCalcularDepreciaciones(Boolean isPermisoCopiarProcesarCalcularDepreciaciones) {
		this.isPermisoCopiarProcesarCalcularDepreciaciones = isPermisoCopiarProcesarCalcularDepreciaciones;
	}
	
	public Boolean getIsPermisoVerFormProcesarCalcularDepreciaciones() {
		return isPermisoVerFormProcesarCalcularDepreciaciones;
	}

	public void setIsPermisoVerFormProcesarCalcularDepreciaciones(Boolean isPermisoVerFormProcesarCalcularDepreciaciones) {
		this.isPermisoVerFormProcesarCalcularDepreciaciones = isPermisoVerFormProcesarCalcularDepreciaciones;
	}
	
	public Boolean getIsPermisoDuplicarProcesarCalcularDepreciaciones() {
		return isPermisoDuplicarProcesarCalcularDepreciaciones;
	}

	public void setIsPermisoDuplicarProcesarCalcularDepreciaciones(Boolean isPermisoDuplicarProcesarCalcularDepreciaciones) {
		this.isPermisoDuplicarProcesarCalcularDepreciaciones = isPermisoDuplicarProcesarCalcularDepreciaciones;
	}
	
	public Boolean getIsPermisoOrdenProcesarCalcularDepreciaciones() {
		return isPermisoOrdenProcesarCalcularDepreciaciones;
	}

	public void setIsPermisoOrdenProcesarCalcularDepreciaciones(Boolean isPermisoOrdenProcesarCalcularDepreciaciones) {
		this.isPermisoOrdenProcesarCalcularDepreciaciones = isPermisoOrdenProcesarCalcularDepreciaciones;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesarCalcularDepreciaciones() {
		return isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones;
	}

	public void setIsVisibilidadCeldaNuevoProcesarCalcularDepreciaciones(Boolean isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones) {
		this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones = isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesarCalcularDepreciaciones() {
		return isVisibilidadCeldaDuplicarProcesarCalcularDepreciaciones;
	}

	public void setIsVisibilidadCeldaDuplicarProcesarCalcularDepreciaciones(Boolean isVisibilidadCeldaDuplicarProcesarCalcularDepreciaciones) {
		this.isVisibilidadCeldaDuplicarProcesarCalcularDepreciaciones = isVisibilidadCeldaDuplicarProcesarCalcularDepreciaciones;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesarCalcularDepreciaciones() {
		return isVisibilidadCeldaCopiarProcesarCalcularDepreciaciones;
	}

	public void setIsVisibilidadCeldaCopiarProcesarCalcularDepreciaciones(Boolean isVisibilidadCeldaCopiarProcesarCalcularDepreciaciones) {
		this.isVisibilidadCeldaCopiarProcesarCalcularDepreciaciones = isVisibilidadCeldaCopiarProcesarCalcularDepreciaciones;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesarCalcularDepreciaciones() {
		return isVisibilidadCeldaVerFormProcesarCalcularDepreciaciones;
	}

	public void setIsVisibilidadCeldaVerFormProcesarCalcularDepreciaciones(Boolean isVisibilidadCeldaVerFormProcesarCalcularDepreciaciones) {
		this.isVisibilidadCeldaVerFormProcesarCalcularDepreciaciones = isVisibilidadCeldaVerFormProcesarCalcularDepreciaciones;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesarCalcularDepreciaciones() {
		return isVisibilidadCeldaOrdenProcesarCalcularDepreciaciones;
	}

	public void setIsVisibilidadCeldaOrdenProcesarCalcularDepreciaciones(Boolean isVisibilidadCeldaOrdenProcesarCalcularDepreciaciones) {
		this.isVisibilidadCeldaOrdenProcesarCalcularDepreciaciones = isVisibilidadCeldaOrdenProcesarCalcularDepreciaciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones() {
		return isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones(Boolean isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones) {
		this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones = isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesarCalcularDepreciaciones() {
		return isVisibilidadCeldaModificarProcesarCalcularDepreciaciones;
	}

	public void setIsVisibilidadCeldaModificarProcesarCalcularDepreciaciones(Boolean isVisibilidadCeldaModificarProcesarCalcularDepreciaciones) {
		this.isVisibilidadCeldaModificarProcesarCalcularDepreciaciones = isVisibilidadCeldaModificarProcesarCalcularDepreciaciones;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesarCalcularDepreciaciones() {
		return isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones;
	}

	public void setIsVisibilidadCeldaActualizarProcesarCalcularDepreciaciones(Boolean isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones) {
		this.isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones = isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesarCalcularDepreciaciones() {
		return isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones;
	}

	public void setIsVisibilidadCeldaEliminarProcesarCalcularDepreciaciones(Boolean isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones) {
		this.isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones = isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesarCalcularDepreciaciones() {
		return isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones;
	}

	public void setIsVisibilidadCeldaCancelarProcesarCalcularDepreciaciones(Boolean isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones) {
		this.isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones = isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesarCalcularDepreciaciones() {
		return isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones;
	}

	public void setIsVisibilidadCeldaGuardarProcesarCalcularDepreciaciones(Boolean isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones) {
		this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones = isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones() {
		return isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones(Boolean isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones) {
		this.isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones = isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones;
	}
		
	public ProcesarCalcularDepreciacionesSessionBean getprocesarcalculardepreciacionesSessionBean() {
		return this.procesarcalculardepreciacionesSessionBean;
	}
	
	public void setprocesarcalculardepreciacionesSessionBean(ProcesarCalcularDepreciacionesSessionBean procesarcalculardepreciacionesSessionBean) {
		this.procesarcalculardepreciacionesSessionBean=procesarcalculardepreciacionesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesarCalcularDepreciaciones() {
		return this.isVisibilidadBusquedaProcesarCalcularDepreciaciones;
	}

	public void setisVisibilidadBusquedaProcesarCalcularDepreciaciones(Boolean isVisibilidadBusquedaProcesarCalcularDepreciaciones) {
		this.isVisibilidadBusquedaProcesarCalcularDepreciaciones=isVisibilidadBusquedaProcesarCalcularDepreciaciones;
	}

	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdDetalleGrupoActivoFijo() {
		return this.isVisibilidadFK_IdDetalleGrupoActivoFijo;
	}

	public void setisVisibilidadFK_IdDetalleGrupoActivoFijo(Boolean isVisibilidadFK_IdDetalleGrupoActivoFijo) {
		this.isVisibilidadFK_IdDetalleGrupoActivoFijo=isVisibilidadFK_IdDetalleGrupoActivoFijo;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	public Boolean getisVisibilidadFK_IdSubGrupoActivoFijo() {
		return this.isVisibilidadFK_IdSubGrupoActivoFijo;
	}

	public void setisVisibilidadFK_IdSubGrupoActivoFijo(Boolean isVisibilidadFK_IdSubGrupoActivoFijo) {
		this.isVisibilidadFK_IdSubGrupoActivoFijo=isVisibilidadFK_IdSubGrupoActivoFijo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones)throws Exception {
		try {
			
				this.setActualParaGuardarAnioForeignKey(procesarcalculardepreciaciones,null);
				this.setActualParaGuardarMesForeignKey(procesarcalculardepreciaciones,null);
				this.setActualParaGuardarDetalleGrupoActivoFijoForeignKey(procesarcalculardepreciaciones,null);
				this.setActualParaGuardarSubGrupoActivoFijoForeignKey(procesarcalculardepreciaciones,null);
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
	
	public void bugActualizarReferenciaActual(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesarCalcularDepreciaciones(procesarcalculardepreciaciones);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesarcalculardepreciacionesAux.setId(procesarcalculardepreciaciones.getId());
		procesarcalculardepreciacionesAux.setVersionRow(procesarcalculardepreciaciones.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesLocal) throws Exception {
		
		if(this.procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesLocal) throws Exception {	
		if(this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				procesarcalculardepreciacionesLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				procesarcalculardepreciacionesLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DetalleGrupoActivoFijoDetalleFormJInternalFrame.class)) {
				DetalleGrupoActivoFijoBeanSwingJInternalFrame detallegrupoactivofijoBeanSwingJInternalFrameLocal=(DetalleGrupoActivoFijoBeanSwingJInternalFrame) ((DetalleGrupoActivoFijoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				detallegrupoactivofijoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDetalleGrupoActivoFijo(detallegrupoactivofijoBeanSwingJInternalFrameLocal.getdetallegrupoactivofijo(),true);
				detallegrupoactivofijoBeanSwingJInternalFrameLocal.actualizarLista(detallegrupoactivofijoBeanSwingJInternalFrameLocal.detallegrupoactivofijo,this.detallegrupoactivofijosForeignKey);

				detallegrupoactivofijoBeanSwingJInternalFrameLocal.actualizarRelaciones(detallegrupoactivofijoBeanSwingJInternalFrameLocal.detallegrupoactivofijo);

				procesarcalculardepreciacionesLocal.setDetalleGrupoActivoFijo(detallegrupoactivofijoBeanSwingJInternalFrameLocal.detallegrupoactivofijo);

				this.addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo();
				this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey("Formulario");
				this.setActualDetalleGrupoActivoFijoForeignKey(detallegrupoactivofijoBeanSwingJInternalFrameLocal.detallegrupoactivofijo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SubGrupoActivoFijoDetalleFormJInternalFrame.class)) {
				SubGrupoActivoFijoBeanSwingJInternalFrame subgrupoactivofijoBeanSwingJInternalFrameLocal=(SubGrupoActivoFijoBeanSwingJInternalFrame) ((SubGrupoActivoFijoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				subgrupoactivofijoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSubGrupoActivoFijo(subgrupoactivofijoBeanSwingJInternalFrameLocal.getsubgrupoactivofijo(),true);
				subgrupoactivofijoBeanSwingJInternalFrameLocal.actualizarLista(subgrupoactivofijoBeanSwingJInternalFrameLocal.subgrupoactivofijo,this.subgrupoactivofijosForeignKey);

				subgrupoactivofijoBeanSwingJInternalFrameLocal.actualizarRelaciones(subgrupoactivofijoBeanSwingJInternalFrameLocal.subgrupoactivofijo);

				procesarcalculardepreciacionesLocal.setSubGrupoActivoFijo(subgrupoactivofijoBeanSwingJInternalFrameLocal.subgrupoactivofijo);

				this.addItemDefectoCombosForeignKeySubGrupoActivoFijo();
				this.cargarCombosFrameSubGrupoActivoFijosForeignKey("Formulario");
				this.setActualSubGrupoActivoFijoForeignKey(subgrupoactivofijoBeanSwingJInternalFrameLocal.subgrupoactivofijo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesarCalcularDepreciacionesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesarcalculardepreciacionesValidator.getInvalidValues(this.procesarcalculardepreciaciones);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacioness) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacioness) throws Exception {
		try	{			
			ProcesarCalcularDepreciacionesConstantesFunciones.actualizarSelectedLista(procesarcalculardepreciaciones,procesarcalculardepreciacioness);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesarcalculardepreciacionessLocal=this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesarcalculardepreciacionessLocal=this.procesarcalculardepreciacioness;
			}
			//ARCHITECTURE
		
			for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesLocal:procesarcalculardepreciacionessLocal) {
				if(this.permiteMantenimiento(procesarcalculardepreciacionesLocal) && procesarcalculardepreciacionesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesarCalcularDepreciacionesConstantesFunciones.getProcesarCalcularDepreciacionesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesarCalcularDepreciacionesConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelid_anioProcesarCalcularDepreciaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesarCalcularDepreciacionesConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelid_mesProcesarCalcularDepreciaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesarCalcularDepreciacionesConstantesFunciones.IDDETALLEGRUPOACTIVOFIJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesarCalcularDepreciacionesConstantesFunciones.IDSUBGRUPOACTIVOFIJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelid_anioProcesarCalcularDepreciaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelid_mesProcesarCalcularDepreciaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones,"");
		
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
		this.iIdNuevoProcesarCalcularDepreciaciones--;	
		
		
		this.procesarcalculardepreciacionesAux=new ProcesarCalcularDepreciaciones();
		
		this.procesarcalculardepreciacionesAux.setId(this.iIdNuevoProcesarCalcularDepreciaciones);
		this.procesarcalculardepreciacionesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().add(this.procesarcalculardepreciacionesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesarcalculardepreciacioness.add(this.procesarcalculardepreciacionesAux);
		}
		//ARCHITECTURE
		
		this.procesarcalculardepreciaciones=this.procesarcalculardepreciacionesAux;
		
		if(ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);
		}
				
		//this.setDefaultControlesProcesarCalcularDepreciaciones();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesarCalcularDepreciaciones();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesarCalcularDepreciaciones();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesarCalcularDepreciaciones();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesarCalcularDepreciaciones(this.procesarcalculardepreciacionesBean,this.procesarcalculardepreciaciones,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesarCalcularDepreciaciones(this.procesarcalculardepreciacionesReturnGeneral,this.procesarcalculardepreciacionesBean,false);
		
		if(this.procesarcalculardepreciacionesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesarCalcularDepreciaciones(this.procesarcalculardepreciacionesReturnGeneral.getProcesarCalcularDepreciaciones());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesarCalcularDepreciaciones(this.procesarcalculardepreciacionesReturnGeneral.getProcesarCalcularDepreciaciones());
		}
		
		if(this.procesarcalculardepreciacionesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesarCalcularDepreciaciones(this.procesarcalculardepreciacionesReturnGeneral.getProcesarCalcularDepreciaciones(),classes);//this.procesarcalculardepreciacionesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesarCalcularDepreciaciones();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesarCalcularDepreciaciones();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.RecargarFormProcesarCalcularDepreciaciones(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false);
						
			if(procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesarCalcularDepreciaciones();
			}
			
			this.actualizarVisualTableDatosProcesarCalcularDepreciaciones();
			
			this.jTableDatosProcesarCalcularDepreciaciones.setRowSelectionInterval(this.getIndiceNuevoProcesarCalcularDepreciaciones(), this.getIndiceNuevoProcesarCalcularDepreciaciones());
			
			this.seleccionarFilaTablaProcesarCalcularDepreciacionesActual();
						
			this.actualizarEstadoCeldasBotonesProcesarCalcularDepreciaciones("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesarCalcularDepreciaciones(Boolean isHabilitar) throws Exception {
			
		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_anioProcesarCalcularDepreciaciones.setEnabled(isHabilitar && this.procesarcalculardepreciacionesConstantesFunciones.activarid_anioProcesarCalcularDepreciaciones);
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_mesProcesarCalcularDepreciaciones.setEnabled(isHabilitar && this.procesarcalculardepreciacionesConstantesFunciones.activarid_mesProcesarCalcularDepreciaciones);
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setEnabled(isHabilitar && this.procesarcalculardepreciacionesConstantesFunciones.activarid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones);
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setEnabled(isHabilitar && this.procesarcalculardepreciacionesConstantesFunciones.activarid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones);
	};
	
	public void setDefaultControlesProcesarCalcularDepreciaciones() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesarCalcularDepreciaciones(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesarcalculardepreciacionesSessionBean.setConGuardarRelaciones(true);			
			this.procesarcalculardepreciacionesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jTabbedPaneRelacionesProcesarCalcularDepreciaciones.setVisible(true);
			
					
		} else {
			//this.procesarcalculardepreciacionesSessionBean.setConGuardarRelaciones(false);			
			this.procesarcalculardepreciacionesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jTabbedPaneRelacionesProcesarCalcularDepreciaciones.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesarCalcularDepreciaciones() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness()) {
				if(procesarcalculardepreciacionesAux.getId().equals(this.iIdNuevoProcesarCalcularDepreciaciones)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:this.procesarcalculardepreciacioness) {
				if(procesarcalculardepreciacionesAux.getId().equals(this.iIdNuevoProcesarCalcularDepreciaciones)) {
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
	
	public int getIndiceActualProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness()) {
				if(procesarcalculardepreciacionesAux.getId().equals(procesarcalculardepreciaciones.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:this.procesarcalculardepreciacioness) {
				if(procesarcalculardepreciacionesAux.getId().equals(procesarcalculardepreciaciones.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness()) {
				if(procesarcalculardepreciacionesAux.getProcesarCalcularDepreciacionesOriginal().getId().equals(procesarcalculardepreciacionesOriginal.getId())) {
					existe=true;
					procesarcalculardepreciacionesOriginal.setId(procesarcalculardepreciacionesAux.getId());
					procesarcalculardepreciacionesOriginal.setVersionRow(procesarcalculardepreciacionesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:this.procesarcalculardepreciacioness) {
				if(procesarcalculardepreciacionesAux.getProcesarCalcularDepreciacionesOriginal().getId().equals(procesarcalculardepreciacionesOriginal.getId())) {
					existe=true;
					procesarcalculardepreciacionesOriginal.setId(procesarcalculardepreciacionesAux.getId());
					procesarcalculardepreciacionesOriginal.setVersionRow(procesarcalculardepreciacionesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesarCalcularDepreciaciones(Boolean esParaCancelar) throws Exception {
		procesarcalculardepreciacionessAux=new ArrayList<ProcesarCalcularDepreciaciones>();
		procesarcalculardepreciacionesAux=new ProcesarCalcularDepreciaciones();
		
		if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness()) {
					if(procesarcalculardepreciacionesAux.getId()<0) {
						procesarcalculardepreciacionessAux.add(procesarcalculardepreciacionesAux);
					}		
				}
				this.iIdNuevoProcesarCalcularDepreciaciones=0L;
				this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().removeAll(procesarcalculardepreciacionessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:this.procesarcalculardepreciacioness) {
					if(procesarcalculardepreciacionesAux.getId()<0) {
						procesarcalculardepreciacionessAux.add(procesarcalculardepreciacionesAux);
					}		
				}
				this.iIdNuevoProcesarCalcularDepreciaciones=0L;
				this.procesarcalculardepreciacioness.removeAll(procesarcalculardepreciacionessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesarCalcularDepreciaciones 
					&& this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().size()>0
					) {
					procesarcalculardepreciacionesAux=this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().get(this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().size() - 1);
				
					if(procesarcalculardepreciacionesAux.getId()<0) {
						this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().remove(procesarcalculardepreciacionesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesarCalcularDepreciaciones && this.procesarcalculardepreciacioness.size()>0) {
					procesarcalculardepreciacionesAux=this.procesarcalculardepreciacioness.get(this.procesarcalculardepreciacioness.size() - 1);
				
					if(procesarcalculardepreciacionesAux.getId()<0) {
						this.procesarcalculardepreciacioness.remove(procesarcalculardepreciacionesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesarCalcularDepreciaciones(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesarcalculardepreciaciones.getId()<0) {
				this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().remove(this.procesarcalculardepreciaciones);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesarcalculardepreciaciones.getId()<0) {
				this.procesarcalculardepreciacioness.remove(this.procesarcalculardepreciaciones);
			}
		}			
	}
	
	public void setEstadosInicialesProcesarCalcularDepreciaciones(List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessAux) throws Exception {
		ProcesarCalcularDepreciacionesConstantesFunciones.setEstadosInicialesProcesarCalcularDepreciaciones(procesarcalculardepreciacionessAux);
	}
	
	public void setEstadosInicialesProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux) throws Exception {
		ProcesarCalcularDepreciacionesConstantesFunciones.setEstadosInicialesProcesarCalcularDepreciaciones(procesarcalculardepreciacionesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesarCalcularDepreciacionesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesarCalcularDepreciaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesarCalcularDepreciacionesActual()) {
				if(!this.isEsNuevoProcesarCalcularDepreciaciones) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesarCalcularDepreciaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesarCalcularDepreciaciones=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesarCalcularDepreciacionesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Procesar Calcular Depreciaciones ?", "MANTENIMIENTO DE Procesar Calcular Depreciaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesarCalcularDepreciaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones) throws Exception {
		ProcesarCalcularDepreciacionesConstantesFunciones.seleccionarAsignar(this.procesarcalculardepreciaciones,procesarcalculardepreciaciones);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesarCalcularDepreciaciones=this.isPermisoActualizarOriginalProcesarCalcularDepreciaciones;
			
			
			this.seleccionarAsignar(procesarcalculardepreciaciones);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesarCalcularDepreciaciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesarcalculardepreciacionesSessionBean.setsFuncionBusquedaRapida(this.procesarcalculardepreciacionesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesarCalcularDepreciaciones) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesarCalcularDepreciaciones(esParaCancelar);				
				this.cancelarNuevoProcesarCalcularDepreciaciones(esParaCancelar);								
			}
			
			this.procesarcalculardepreciaciones=new ProcesarCalcularDepreciaciones();
			
			this.inicializarProcesarCalcularDepreciaciones();
			
			this.actualizarEstadoCeldasBotonesProcesarCalcularDepreciaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesarCalcularDepreciaciones() throws Exception {
		try {
			ProcesarCalcularDepreciacionesConstantesFunciones.inicializarProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesarCalcularDepreciacioness(String sAccionBusqueda,List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesarCalcularDepreciaciones"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesarCalcularDepreciacionesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesarCalcularDepreciacionesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesarCalcularDepreciaciones"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Procesar Calcular Depreciacioneses");		
		parameters.put("busquedapor", ProcesarCalcularDepreciacionesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesarCalcularDepreciaciones=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesarCalcularDepreciaciones);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesarCalcularDepreciacionesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesarCalcularDepreciacionesBean.TraerProcesarCalcularDepreciacionesBeans(procesarcalculardepreciacionessParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesarCalcularDepreciacioness(sAccionBusqueda,sTipoArchivoReporte,procesarcalculardepreciacionessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesarCalcularDepreciacioness(sAccionBusqueda,sTipoArchivoReporte,procesarcalculardepreciacionessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesarCalcularDepreciacionesActionPerformed(null);
					//this.generarExcelReporteProcesarCalcularDepreciacioness(sAccionBusqueda,sTipoArchivoReporte,procesarcalculardepreciacionessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesarCalcularDepreciacioness(sAccionBusqueda,sTipoArchivoReporte,procesarcalculardepreciacionessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesarCalcularDepreciacioness(sAccionBusqueda,sTipoArchivoReporte,procesarcalculardepreciacionessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesarCalcularDepreciacioness(sAccionBusqueda,sTipoArchivoReporte,procesarcalculardepreciacionessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesarCalcularDepreciacioness(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarcalculardepreciaciones";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesarCalcularDepreciacioness");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesarCalcularDepreciaciones("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones : procesarcalculardepreciacionessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesarCalcularDepreciacionesConstantesFunciones.generarExcelReporteDataProcesarCalcularDepreciaciones("NORMAL",row,workbook,procesarcalculardepreciaciones,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Calcular Depreciaciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesarCalcularDepreciaciones(String sTipo,Row row,Workbook workbook) {
		
		ProcesarCalcularDepreciacionesConstantesFunciones.generarExcelReporteHeaderProcesarCalcularDepreciaciones(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesarCalcularDepreciacioness(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarcalculardepreciaciones_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesarCalcularDepreciacioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones : procesarcalculardepreciacionessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesarCalcularDepreciacionesConstantesFunciones.getProcesarCalcularDepreciacionesDescripcion(procesarcalculardepreciaciones));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesarcalculardepreciaciones.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesarcalculardepreciaciones.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesarcalculardepreciaciones.getdetallegrupoactivofijo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesarcalculardepreciaciones.getsubgrupoactivofijo_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Calcular Depreciaciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesarCalcularDepreciacioness(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessRespaldo=null;
		
		classes=ProcesarCalcularDepreciacionesConstantesFunciones.getClassesRelationshipsOfProcesarCalcularDepreciaciones(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesarcalculardepreciacionesLogic.setDatosCliente(this.datosCliente);
		this.procesarcalculardepreciacionesLogic.setDatosDeep(this.datosDeep);
		this.procesarcalculardepreciacionesLogic.setIsConDeep(true);
		
		procesarcalculardepreciacionessRespaldo=this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness();
		
		this.procesarcalculardepreciacionesLogic.setProcesarCalcularDepreciacioness(procesarcalculardepreciacionessParaReportes);	
		this.procesarcalculardepreciacionesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesarcalculardepreciacionessParaReportes=this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness();
		this.procesarcalculardepreciacionesLogic.setProcesarCalcularDepreciacioness(procesarcalculardepreciacionessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarcalculardepreciaciones_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesarCalcularDepreciacioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesarCalcularDepreciaciones("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones : procesarcalculardepreciacionessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesarCalcularDepreciaciones("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesarCalcularDepreciacionesConstantesFunciones.generarExcelReporteDataProcesarCalcularDepreciaciones("NORMAL",row,workbook,procesarcalculardepreciaciones,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesarCalcularDepreciacionesConstantesFunciones.getProcesarCalcularDepreciacionesDescripcion(procesarcalculardepreciaciones));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Calcular Depreciaciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesarCalcularDepreciaciones() throws Exception {		
		this.startProcessProcesarCalcularDepreciaciones(true);
	}
	
	public void startProcessProcesarCalcularDepreciaciones(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones ,this.jPanelParametrosReportesProcesarCalcularDepreciaciones, this.jScrollPanelDatosProcesarCalcularDepreciaciones,this.jPanelPaginacionProcesarCalcularDepreciaciones, this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones, this.jPanelAccionesProcesarCalcularDepreciaciones,this.jPanelAccionesFormularioProcesarCalcularDepreciaciones,this.jmenuBarProcesarCalcularDepreciaciones,this.jmenuBarDetalleProcesarCalcularDepreciaciones,this.jTtoolBarProcesarCalcularDepreciaciones,this.jTtoolBarDetalleProcesarCalcularDepreciaciones);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesarCalcularDepreciaciones=this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones; 
		
		final JPanel jPanelParametrosReportesProcesarCalcularDepreciaciones=this.jPanelParametrosReportesProcesarCalcularDepreciaciones;
		//final JScrollPane jScrollPanelDatosProcesarCalcularDepreciaciones=this.jScrollPanelDatosProcesarCalcularDepreciaciones;
		final JTable jTableDatosProcesarCalcularDepreciaciones=this.jTableDatosProcesarCalcularDepreciaciones;		
		final JPanel jPanelPaginacionProcesarCalcularDepreciaciones=this.jPanelPaginacionProcesarCalcularDepreciaciones;
		//final JScrollPane jScrollPanelDatosEdicionProcesarCalcularDepreciaciones=this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones;
		final JPanel jPanelAccionesProcesarCalcularDepreciaciones=this.jPanelAccionesProcesarCalcularDepreciaciones;
		
		JPanel jPanelCamposAuxiliarProcesarCalcularDepreciaciones=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesarCalcularDepreciaciones=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
			jPanelCamposAuxiliarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jPanelCamposProcesarCalcularDepreciaciones;
			jPanelAccionesFormularioAuxiliarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jPanelAccionesFormularioProcesarCalcularDepreciaciones;
		}
		
		final JPanel jPanelCamposProcesarCalcularDepreciaciones=jPanelCamposAuxiliarProcesarCalcularDepreciaciones;
		final JPanel jPanelAccionesFormularioProcesarCalcularDepreciaciones=jPanelAccionesFormularioAuxiliarProcesarCalcularDepreciaciones;
		
		
		final JMenuBar jmenuBarProcesarCalcularDepreciaciones=this.jmenuBarProcesarCalcularDepreciaciones;
		final JToolBar jTtoolBarProcesarCalcularDepreciaciones=this.jTtoolBarProcesarCalcularDepreciaciones;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesarCalcularDepreciaciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesarCalcularDepreciaciones=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
			jmenuBarDetalleAuxiliarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jmenuBarDetalleProcesarCalcularDepreciaciones;
			jTtoolBarDetalleAuxiliarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jTtoolBarDetalleProcesarCalcularDepreciaciones;
		}
		
		final JMenuBar jmenuBarDetalleProcesarCalcularDepreciaciones=jmenuBarDetalleAuxiliarProcesarCalcularDepreciaciones;
		final JToolBar jTtoolBarDetalleProcesarCalcularDepreciaciones=jTtoolBarDetalleAuxiliarProcesarCalcularDepreciaciones;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesarCalcularDepreciaciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesarCalcularDepreciaciones;
			processRunnable.jTableDatos=jTableDatosProcesarCalcularDepreciaciones;
			processRunnable.jPanelCampos=jPanelCamposProcesarCalcularDepreciaciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesarCalcularDepreciaciones;
			processRunnable.jPanelAcciones=jPanelAccionesProcesarCalcularDepreciaciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesarCalcularDepreciaciones;
			
			
			processRunnable.jmenuBar=jmenuBarProcesarCalcularDepreciaciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesarCalcularDepreciaciones;
			processRunnable.jTtoolBar=jTtoolBarProcesarCalcularDepreciaciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesarCalcularDepreciaciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesarCalcularDepreciaciones ,jPanelParametrosReportesProcesarCalcularDepreciaciones,jTableDatosProcesarCalcularDepreciaciones, /*jScrollPanelDatosProcesarCalcularDepreciaciones,*/jPanelCamposProcesarCalcularDepreciaciones,jPanelPaginacionProcesarCalcularDepreciaciones, /*jScrollPanelDatosEdicionProcesarCalcularDepreciaciones,*/ jPanelAccionesProcesarCalcularDepreciaciones,jPanelAccionesFormularioProcesarCalcularDepreciaciones,jmenuBarProcesarCalcularDepreciaciones,jmenuBarDetalleProcesarCalcularDepreciaciones,jTtoolBarProcesarCalcularDepreciaciones,jTtoolBarDetalleProcesarCalcularDepreciaciones);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesarCalcularDepreciaciones ,jPanelParametrosReportesProcesarCalcularDepreciaciones, jScrollPanelDatosProcesarCalcularDepreciaciones,jPanelPaginacionProcesarCalcularDepreciaciones, jScrollPanelDatosEdicionProcesarCalcularDepreciaciones, jPanelAccionesProcesarCalcularDepreciaciones,jPanelAccionesFormularioProcesarCalcularDepreciaciones,jmenuBarProcesarCalcularDepreciaciones,jmenuBarDetalleProcesarCalcularDepreciaciones,jTtoolBarProcesarCalcularDepreciaciones,jTtoolBarDetalleProcesarCalcularDepreciaciones);
						
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
	
	public void finishProcessProcesarCalcularDepreciaciones() {// throws Exception 
		this.finishProcessProcesarCalcularDepreciaciones(true);
	}
	
	public void finishProcessProcesarCalcularDepreciaciones(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones ,this.jPanelParametrosReportesProcesarCalcularDepreciaciones, this.jScrollPanelDatosProcesarCalcularDepreciaciones,this.jPanelPaginacionProcesarCalcularDepreciaciones, this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones, this.jPanelAccionesProcesarCalcularDepreciaciones,this.jPanelAccionesFormularioProcesarCalcularDepreciaciones,this.jmenuBarProcesarCalcularDepreciaciones,this.jmenuBarDetalleProcesarCalcularDepreciaciones,this.jTtoolBarProcesarCalcularDepreciaciones,this.jTtoolBarDetalleProcesarCalcularDepreciaciones);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesarCalcularDepreciaciones=this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones; 
		
		final JPanel jPanelParametrosReportesProcesarCalcularDepreciaciones=this.jPanelParametrosReportesProcesarCalcularDepreciaciones;
		//final JScrollPane jScrollPanelDatosProcesarCalcularDepreciaciones=this.jScrollPanelDatosProcesarCalcularDepreciaciones;
		final JTable jTableDatosProcesarCalcularDepreciaciones=this.jTableDatosProcesarCalcularDepreciaciones;		
		final JPanel jPanelPaginacionProcesarCalcularDepreciaciones=this.jPanelPaginacionProcesarCalcularDepreciaciones;
		//final JScrollPane jScrollPanelDatosEdicionProcesarCalcularDepreciaciones=this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones;
		final JPanel jPanelAccionesProcesarCalcularDepreciaciones=this.jPanelAccionesProcesarCalcularDepreciaciones;
		
		JPanel jPanelCamposAuxiliarProcesarCalcularDepreciaciones=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesarCalcularDepreciaciones=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
			jPanelCamposAuxiliarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jPanelCamposProcesarCalcularDepreciaciones;
			jPanelAccionesFormularioAuxiliarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jPanelAccionesFormularioProcesarCalcularDepreciaciones;
		}
		
		final JPanel jPanelCamposProcesarCalcularDepreciaciones=jPanelCamposAuxiliarProcesarCalcularDepreciaciones;
		final JPanel jPanelAccionesFormularioProcesarCalcularDepreciaciones=jPanelAccionesFormularioAuxiliarProcesarCalcularDepreciaciones;
		
		
		final JMenuBar jmenuBarProcesarCalcularDepreciaciones=this.jmenuBarProcesarCalcularDepreciaciones;		
		final JToolBar jTtoolBarProcesarCalcularDepreciaciones=this.jTtoolBarProcesarCalcularDepreciaciones;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesarCalcularDepreciaciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesarCalcularDepreciaciones=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
			jmenuBarDetalleAuxiliarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jmenuBarDetalleProcesarCalcularDepreciaciones;
			jTtoolBarDetalleAuxiliarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jTtoolBarDetalleProcesarCalcularDepreciaciones;		
		}
		
		final JMenuBar jmenuBarDetalleProcesarCalcularDepreciaciones=jmenuBarDetalleAuxiliarProcesarCalcularDepreciaciones;
		final JToolBar jTtoolBarDetalleProcesarCalcularDepreciaciones=jTtoolBarDetalleAuxiliarProcesarCalcularDepreciaciones;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesarCalcularDepreciaciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesarCalcularDepreciaciones;
			processRunnable.jTableDatos=jTableDatosProcesarCalcularDepreciaciones;
			processRunnable.jPanelCampos=jPanelCamposProcesarCalcularDepreciaciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesarCalcularDepreciaciones;
			processRunnable.jPanelAcciones=jPanelAccionesProcesarCalcularDepreciaciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesarCalcularDepreciaciones;
			
			
			processRunnable.jmenuBar=jmenuBarProcesarCalcularDepreciaciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesarCalcularDepreciaciones;
			processRunnable.jTtoolBar=jTtoolBarProcesarCalcularDepreciaciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesarCalcularDepreciaciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesarCalcularDepreciaciones ,jPanelParametrosReportesProcesarCalcularDepreciaciones, jTableDatosProcesarCalcularDepreciaciones,/*jScrollPanelDatosProcesarCalcularDepreciaciones,*/jPanelCamposProcesarCalcularDepreciaciones,jPanelPaginacionProcesarCalcularDepreciaciones, /*jScrollPanelDatosEdicionProcesarCalcularDepreciaciones,*/ jPanelAccionesProcesarCalcularDepreciaciones,jPanelAccionesFormularioProcesarCalcularDepreciaciones,jmenuBarProcesarCalcularDepreciaciones,jmenuBarDetalleProcesarCalcularDepreciaciones,jTtoolBarProcesarCalcularDepreciaciones,jTtoolBarDetalleProcesarCalcularDepreciaciones));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesarCalcularDepreciaciones(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesarCalcularDepreciaciones(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesarCalcularDepreciaciones(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesarCalcularDepreciaciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesarCalcularDepreciaciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesarCalcularDepreciaciones,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesarCalcularDepreciaciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesarCalcularDepreciaciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesarCalcularDepreciaciones,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesarcalculardepreciacionesConstantesFunciones.getsFinalQueryProcesarCalcularDepreciaciones();
		String  finalQueryPaginacionTodos=this.procesarcalculardepreciacionesConstantesFunciones.getsFinalQueryProcesarCalcularDepreciaciones();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesarCalcularDepreciacionesConstantesFunciones.getArrayColumnasGlobalesNoProcesarCalcularDepreciaciones(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesarCalcularDepreciacionesConstantesFunciones.getArrayColumnasGlobalesProcesarCalcularDepreciaciones(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesarCalcularDepreciacionesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesarcalculardepreciacionessEliminados= new ArrayList<ProcesarCalcularDepreciaciones>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesarCalcularDepreciaciones();
		
				///*ProcesarCalcularDepreciacionesSessionBean*/this.procesarcalculardepreciacionesSessionBean=new ProcesarCalcularDepreciacionesSessionBean();
			
			if(this.procesarcalculardepreciacionesSessionBean==null) {
				this.procesarcalculardepreciacionesSessionBean=new ProcesarCalcularDepreciacionesSessionBean();
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
					this.iNumeroPaginacion=ProcesarCalcularDepreciacionesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesarCalcularDepreciacionesConstantesFunciones.getClassesForeignKeysOfProcesarCalcularDepreciaciones(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesarcalculardepreciaciones."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesarcalculardepreciacionessAux= new ArrayList<ProcesarCalcularDepreciaciones>();
			
				
			procesarcalculardepreciacionesLogic.setDatosCliente(this.datosCliente);
			procesarcalculardepreciacionesLogic.setDatosDeep(this.datosDeep);
			procesarcalculardepreciacionesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesarCalcularDepreciaciones")) {
				this.sDetalleReporte=ProcesarCalcularDepreciacionesConstantesFunciones.getDetalleIndiceBusquedaProcesarCalcularDepreciaciones(id_anioBusquedaProcesarCalcularDepreciaciones,id_mesBusquedaProcesarCalcularDepreciaciones,id_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones,id_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacionessBusquedaProcesarCalcularDepreciaciones(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_anioBusquedaProcesarCalcularDepreciaciones,id_mesBusquedaProcesarCalcularDepreciaciones,id_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones,id_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesarCalcularDepreciacionesConstantesFunciones.getDetalleIndiceBusquedaProcesarCalcularDepreciaciones(id_anioBusquedaProcesarCalcularDepreciaciones,id_mesBusquedaProcesarCalcularDepreciaciones,id_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones,id_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesarCalcularDepreciacionesConstantesFunciones.getDetalleIndiceBusquedaProcesarCalcularDepreciaciones(id_anioBusquedaProcesarCalcularDepreciaciones,id_mesBusquedaProcesarCalcularDepreciaciones,id_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones,id_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness()==null||procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesarcalculardepreciacioness==null|| procesarcalculardepreciacioness.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesarcalculardepreciacionessAux=new ArrayList<ProcesarCalcularDepreciaciones>();
						procesarcalculardepreciacionessAux.addAll(procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesarcalculardepreciacionessAux=new ArrayList<ProcesarCalcularDepreciaciones>();
							procesarcalculardepreciacionessAux.addAll(procesarcalculardepreciacioness);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacionessBusquedaProcesarCalcularDepreciaciones(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_anioBusquedaProcesarCalcularDepreciaciones,id_mesBusquedaProcesarCalcularDepreciaciones,id_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones,id_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesarCalcularDepreciacionesConstantesFunciones.getDetalleIndiceBusquedaProcesarCalcularDepreciaciones(id_anioBusquedaProcesarCalcularDepreciaciones,id_mesBusquedaProcesarCalcularDepreciaciones,id_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones,id_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesarCalcularDepreciacionesConstantesFunciones.getDetalleIndiceBusquedaProcesarCalcularDepreciaciones(id_anioBusquedaProcesarCalcularDepreciaciones,id_mesBusquedaProcesarCalcularDepreciaciones,id_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones,id_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesarCalcularDepreciacioness("BusquedaProcesarCalcularDepreciaciones",procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesarCalcularDepreciacioness("BusquedaProcesarCalcularDepreciaciones",procesarcalculardepreciacioness);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesarcalculardepreciacionesLogic.setProcesarCalcularDepreciacioness(new ArrayList<ProcesarCalcularDepreciaciones>());
						procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().addAll(procesarcalculardepreciacionessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesarcalculardepreciacioness=new ArrayList<ProcesarCalcularDepreciaciones>();
							procesarcalculardepreciacioness.addAll(procesarcalculardepreciacionessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesarCalcularDepreciaciones();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesarCalcularDepreciaciones();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesarcalculardepreciacioness.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesarcalculardepreciacioness.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones) {
		Boolean permite=true;
		
		if(this.procesarcalculardepreciaciones.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesarCalcularDepreciacionesConstantesFunciones.getOrderByListaProcesarCalcularDepreciaciones();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesarCalcularDepreciacionesConstantesFunciones.getOrderByListaProcesarCalcularDepreciaciones();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones:procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness()) {
				if(procesarcalculardepreciaciones.getsType().equals(Constantes2.S_TOTALES)) {
					procesarcalculardepreciacionesTotales=procesarcalculardepreciaciones;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones:this.procesarcalculardepreciacioness) {
				if(procesarcalculardepreciaciones.getsType().equals(Constantes2.S_TOTALES)) {
					procesarcalculardepreciacionesTotales=procesarcalculardepreciaciones;
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
			this.procesarcalculardepreciacionesAux=new ProcesarCalcularDepreciaciones();
			this.procesarcalculardepreciacionesAux.setsType(Constantes2.S_TOTALES);
			this.procesarcalculardepreciacionesAux.setIsNew(false);
			this.procesarcalculardepreciacionesAux.setIsChanged(false);
			this.procesarcalculardepreciacionesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesarCalcularDepreciacionesConstantesFunciones.TotalizarValoresFilaProcesarCalcularDepreciaciones(this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness(),this.procesarcalculardepreciacionesAux);
				
				//this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().add(this.procesarcalculardepreciacionesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesarCalcularDepreciacionesConstantesFunciones.TotalizarValoresFilaProcesarCalcularDepreciaciones(this.procesarcalculardepreciacioness,this.procesarcalculardepreciacionesAux);
				
				this.procesarcalculardepreciacioness.add(this.procesarcalculardepreciacionesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesarcalculardepreciacionesTotales=new ProcesarCalcularDepreciaciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().remove(procesarcalculardepreciacionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesarcalculardepreciacioness.remove(procesarcalculardepreciacionesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesarcalculardepreciacionesTotales=new ProcesarCalcularDepreciaciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones:procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness()) {
				if(procesarcalculardepreciaciones.getsType().equals(Constantes2.S_TOTALES)) {
					procesarcalculardepreciacionesTotales=procesarcalculardepreciaciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesarCalcularDepreciacionesConstantesFunciones.TotalizarValoresFilaProcesarCalcularDepreciaciones(this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness(),procesarcalculardepreciacionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones:this.procesarcalculardepreciacioness) {
				if(procesarcalculardepreciaciones.getsType().equals(Constantes2.S_TOTALES)) {
					procesarcalculardepreciacionesTotales=procesarcalculardepreciaciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesarCalcularDepreciacionesConstantesFunciones.TotalizarValoresFilaProcesarCalcularDepreciaciones(this.procesarcalculardepreciacioness,procesarcalculardepreciacionesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesarCalcularDepreciacionessBusquedaProcesarCalcularDepreciaciones()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesarCalcularDepreciaciones";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesarCalcularDepreciacionessFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesarCalcularDepreciacionessFK_IdDetalleGrupoActivoFijo()throws Exception {
		try {
			sAccionBusqueda="FK_IdDetalleGrupoActivoFijo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesarCalcularDepreciacionessFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesarCalcularDepreciacionessFK_IdSubGrupoActivoFijo()throws Exception {
		try {
			sAccionBusqueda="FK_IdSubGrupoActivoFijo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesarCalcularDepreciacionessBusquedaProcesarCalcularDepreciaciones(String sFinalQuery,Long id_anio,Long id_mes,Long id_detalle_grupo_activo_fijo,Long id_sub_grupo_activo_fijo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacionessBusquedaProcesarCalcularDepreciaciones(sFinalQuery,this.pagination,id_anio,id_mes,id_detalle_grupo_activo_fijo,id_sub_grupo_activo_fijo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesarCalcularDepreciacionessFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacionessFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesarCalcularDepreciacionessFK_IdDetalleGrupoActivoFijo(String sFinalQuery,Long id_detalle_grupo_activo_fijo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacionessFK_IdDetalleGrupoActivoFijo(sFinalQuery,this.pagination,id_detalle_grupo_activo_fijo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesarCalcularDepreciacionessFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacionessFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesarCalcularDepreciacionessFK_IdSubGrupoActivoFijo(String sFinalQuery,Long id_sub_grupo_activo_fijo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacionessFK_IdSubGrupoActivoFijo(sFinalQuery,this.pagination,id_sub_grupo_activo_fijo);
				
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
	
	public void inicializarPermisosProcesarCalcularDepreciaciones() {
		this.isPermisoTodoProcesarCalcularDepreciaciones=false;
		this.isPermisoNuevoProcesarCalcularDepreciaciones=false;
		this.isPermisoActualizarProcesarCalcularDepreciaciones=false;
		this.isPermisoActualizarOriginalProcesarCalcularDepreciaciones=false;
		this.isPermisoEliminarProcesarCalcularDepreciaciones=false;
		this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones=false;
		this.isPermisoConsultaProcesarCalcularDepreciaciones=true;
		this.isPermisoBusquedaProcesarCalcularDepreciaciones=true;
		this.isPermisoReporteProcesarCalcularDepreciaciones=true;
		this.isPermisoOrdenProcesarCalcularDepreciaciones=false;		
		this.isPermisoPaginacionMedioProcesarCalcularDepreciaciones=false;		
		this.isPermisoPaginacionAltoProcesarCalcularDepreciaciones=false;		
		this.isPermisoPaginacionTodoProcesarCalcularDepreciaciones=false;		
		this.isPermisoCopiarProcesarCalcularDepreciaciones=false;		
		this.isPermisoVerFormProcesarCalcularDepreciaciones=false;		
		this.isPermisoDuplicarProcesarCalcularDepreciaciones=false;
		this.isPermisoOrdenProcesarCalcularDepreciaciones=false;
	}
	
	public void setPermisosUsuarioProcesarCalcularDepreciaciones(Boolean isPermiso) {
		this.isPermisoTodoProcesarCalcularDepreciaciones=isPermiso;
		this.isPermisoNuevoProcesarCalcularDepreciaciones=isPermiso;
		this.isPermisoActualizarProcesarCalcularDepreciaciones=isPermiso;
		this.isPermisoActualizarOriginalProcesarCalcularDepreciaciones=isPermiso;
		this.isPermisoEliminarProcesarCalcularDepreciaciones=isPermiso;
		this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones=isPermiso;
		this.isPermisoConsultaProcesarCalcularDepreciaciones=isPermiso;
		this.isPermisoBusquedaProcesarCalcularDepreciaciones=isPermiso;
		this.isPermisoReporteProcesarCalcularDepreciaciones=isPermiso;
		this.isPermisoOrdenProcesarCalcularDepreciaciones=isPermiso;		
		this.isPermisoPaginacionMedioProcesarCalcularDepreciaciones=isPermiso;		
		this.isPermisoPaginacionAltoProcesarCalcularDepreciaciones=isPermiso;		
		this.isPermisoPaginacionTodoProcesarCalcularDepreciaciones=isPermiso;		
		this.isPermisoCopiarProcesarCalcularDepreciaciones=isPermiso;		
		this.isPermisoVerFormProcesarCalcularDepreciaciones=isPermiso;		
		this.isPermisoDuplicarProcesarCalcularDepreciaciones=isPermiso;
		this.isPermisoOrdenProcesarCalcularDepreciaciones=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesarCalcularDepreciaciones(Boolean isPermiso) {
		//this.isPermisoTodoProcesarCalcularDepreciaciones=isPermiso;
		this.isPermisoNuevoProcesarCalcularDepreciaciones=isPermiso;
		this.isPermisoActualizarProcesarCalcularDepreciaciones=isPermiso;
		this.isPermisoActualizarOriginalProcesarCalcularDepreciaciones=isPermiso;
		this.isPermisoEliminarProcesarCalcularDepreciaciones=isPermiso;
		this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones=isPermiso;
		//this.isPermisoConsultaProcesarCalcularDepreciaciones=isPermiso;
		//this.isPermisoBusquedaProcesarCalcularDepreciaciones=isPermiso;
		//this.isPermisoReporteProcesarCalcularDepreciaciones=isPermiso;
		//this.isPermisoOrdenProcesarCalcularDepreciaciones=isPermiso;		
		//this.isPermisoPaginacionMedioProcesarCalcularDepreciaciones=isPermiso;		
		//this.isPermisoPaginacionAltoProcesarCalcularDepreciaciones=isPermiso;		
		//this.isPermisoPaginacionTodoProcesarCalcularDepreciaciones=isPermiso;		
		//this.isPermisoCopiarProcesarCalcularDepreciaciones=isPermiso;		
		//this.isPermisoDuplicarProcesarCalcularDepreciaciones=isPermiso;
		//this.isPermisoOrdenProcesarCalcularDepreciaciones=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesarCalcularDepreciacionesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesarCalcularDepreciacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesarCalcularDepreciaciones(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesarCalcularDepreciacionesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesarCalcularDepreciacionesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesarCalcularDepreciacionesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesarCalcularDepreciacionesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesarCalcularDepreciaciones() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesarCalcularDepreciacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesarCalcularDepreciacionesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesarCalcularDepreciaciones=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesarCalcularDepreciaciones=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesarCalcularDepreciaciones=this.isPermisoActualizarProcesarCalcularDepreciaciones;
			this.isPermisoEliminarProcesarCalcularDepreciaciones=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesarCalcularDepreciaciones=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesarCalcularDepreciaciones=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesarCalcularDepreciaciones=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesarCalcularDepreciaciones=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesarCalcularDepreciaciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesarCalcularDepreciaciones=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesarCalcularDepreciaciones=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesarCalcularDepreciaciones=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesarCalcularDepreciaciones=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesarCalcularDepreciaciones=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesarCalcularDepreciaciones=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesarCalcularDepreciaciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesarCalcularDepreciaciones.setToolTipText(this.jTableDatosProcesarCalcularDepreciaciones.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesarCalcularDepreciaciones(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesarCalcularDepreciaciones(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesarCalcularDepreciacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesarCalcularDepreciacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesarCalcularDepreciaciones() throws Exception {
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
	public void inicializarCombosForeignKeyProcesarCalcularDepreciacionesListas()throws Exception {
		try	{						
			
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
				this.detallegrupoactivofijosForeignKey=new ArrayList();
				this.subgrupoactivofijosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesarCalcularDepreciacionesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesarCalcularDepreciacionesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDetalleGrupoActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySubGrupoActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySubGrupoActivoFijoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.subgrupoactivofijosForeignKey==null||this.subgrupoactivofijosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SubGrupoActivoFijoConstantesFunciones.getArrayColumnasGlobalesSubGrupoActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SubGrupoActivoFijoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SubGrupoActivoFijoConstantesFunciones.SFINALQUERY;

				this.cargarCombosSubGrupoActivoFijosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesarCalcularDepreciaciones()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
			this.addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo();
			this.addItemDefectoCombosForeignKeySubGrupoActivoFijo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {
			if(this.procesarcalculardepreciacionesSessionBean==null) {
				this.procesarcalculardepreciacionesSessionBean=new ProcesarCalcularDepreciacionesSessionBean();
			}

			if(!this.procesarcalculardepreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

			if(!this.procesarcalculardepreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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

	public void addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo()throws Exception {
		try {

			if(!this.procesarcalculardepreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo()) {
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

	public void addItemDefectoCombosForeignKeySubGrupoActivoFijo()throws Exception {
		try {

			if(!this.procesarcalculardepreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionSubGrupoActivoFijo()) {
				SubGrupoActivoFijo subgrupoactivofijo=new SubGrupoActivoFijo();
				SubGrupoActivoFijoConstantesFunciones.setSubGrupoActivoFijoDescripcion(subgrupoactivofijo,Constantes.SMENSAJE_ESCOJA_OPCION);
				subgrupoactivofijo.setId(null);

				if(!SubGrupoActivoFijoConstantesFunciones.ExisteEnLista(this.subgrupoactivofijosForeignKey,subgrupoactivofijo,true)) {

					this.subgrupoactivofijosForeignKey.add(0,subgrupoactivofijo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProcesarCalcularDepreciaciones()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyDetalleGrupoActivoFijo("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesarCalcularDepreciaciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyDetalleGrupoActivoFijo(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyDetalleGrupoActivoFijo(JComboBox jComboBoxDetalleGrupoActivoFijoGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			DetalleGrupoActivoFijo detallegrupoactivofijoLocal=(DetalleGrupoActivoFijo)jComboBoxDetalleGrupoActivoFijoGenerico.getSelectedItem();

			if(detallegrupoactivofijoLocal!=null  && detallegrupoactivofijoLocal.getId()!=null  && detallegrupoactivofijoLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_detalle_grupo_activo_fijo="+detallegrupoactivofijoLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboSubGrupoActivoFijo=sFinalQueryCombo;

			this.subgrupoactivofijosForeignKey=new ArrayList<SubGrupoActivoFijo>();
			this.cargarCombosForeignKeySubGrupoActivoFijo(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyDetalleGrupoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
						this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.addItemListener(new ComboBoxItemListener(this,"id_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones"));
						this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.addFocusListener(new ComboBoxFocusListener(this,"id_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones"));
					}
				} else {
					if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
						this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.addActionListener(new ComboBoxActionListener(this,"id_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones"));
						this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.addFocusListener(new ComboBoxFocusListener(this,"id_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones"));

						this.jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones"));

					} else {
						this.jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones"));

						this.jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyProcesarCalcularDepreciaciones()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesarCalcularDepreciaciones();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones)throws Exception {	
		try {
			
			this.setActualDetalleGrupoActivoFijoForeignKey(procesarcalculardepreciaciones.getid_detalle_grupo_activo_fijo(),false,"Formulario");
			this.setActualSubGrupoActivoFijoForeignKey(procesarcalculardepreciaciones.getid_sub_grupo_activo_fijo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesarCalcularDepreciaciones()throws Exception {	
		try {
			
			this.setActualDetalleGrupoActivoFijoForeignKey(this.procesarcalculardepreciacionesConstantesFunciones.getid_detalle_grupo_activo_fijo(),false,"Formulario");
			this.setActualSubGrupoActivoFijoForeignKey(this.procesarcalculardepreciacionesConstantesFunciones.getid_sub_grupo_activo_fijo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesarCalcularDepreciaciones()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesarCalcularDepreciaciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesarCalcularDepreciaciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesarCalcularDepreciaciones()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesarCalcularDepreciaciones()throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");
			this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey("Todos");
			this.cargarCombosFrameSubGrupoActivoFijosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesarCalcularDepreciaciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSubGrupoActivoFijosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesarCalcularDepreciaciones()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_anioProcesarCalcularDepreciaciones!=null && this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_anioProcesarCalcularDepreciaciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_anioProcesarCalcularDepreciaciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_mesProcesarCalcularDepreciaciones!=null && this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_mesProcesarCalcularDepreciaciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_mesProcesarCalcularDepreciaciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones!=null && this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones!=null && this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	





	public void recargarFormProcesarCalcularDepreciacionesDetalleGrupoActivoFijo(JComboBox<?> jComboBoxGenericoDetalleGrupoActivoFijo,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormProcesarCalcularDepreciacionesid_sub_grupo_activo_fijo(jComboBoxGenericoDetalleGrupoActivoFijo,sFormularioTipoBusqueda,"DetalleGrupoActivoFijo",false);
	}


	
	



	public void recargarFormProcesarCalcularDepreciacionesid_sub_grupo_activo_fijo(JComboBox<?> jComboBoxGenericoSubGrupoActivoFijo,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("DetalleGrupoActivoFijo")){
				this.setActualParaGuardarDetalleGrupoActivoFijoForeignKey(this.procesarcalculardepreciaciones,jComboBoxGenericoSubGrupoActivoFijo);
			}

			if(this.procesarcalculardepreciaciones.getid_detalle_grupo_activo_fijo()!=null && this.procesarcalculardepreciaciones.getid_detalle_grupo_activo_fijo()!=0L) {
				sFinalQuery+="  WHERE  id_detalle_grupo_activo_fijo="+this.procesarcalculardepreciaciones.getid_detalle_grupo_activo_fijo();
			} else {
				sFinalQuery+="  WHERE  id_detalle_grupo_activo_fijo=-1";
			}



			//BUCLE RECURSIVO
			this.setActualSubGrupoActivoFijoForeignKey(this.procesarcalculardepreciaciones.getid_detalle_grupo_activo_fijo(),true,sFormularioTipoBusqueda);

			this.cargarCombosSubGrupoActivoFijosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameSubGrupoActivoFijosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public ProcesarCalcularDepreciacionesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesarCalcularDepreciacionesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesarCalcularDepreciacionesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesarcalculardepreciacionesSessionBean=new ProcesarCalcularDepreciacionesSessionBean(); 
		this.procesarcalculardepreciacionesConstantesFunciones=new ProcesarCalcularDepreciacionesConstantesFunciones(); 
		this.procesarcalculardepreciacionesBean=new ProcesarCalcularDepreciaciones();//(this.procesarcalculardepreciacionesConstantesFunciones); 		
		this.procesarcalculardepreciacionesReturnGeneral=new ProcesarCalcularDepreciacionesParameterReturnGeneral(); 
		
		this.procesarcalculardepreciacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesarcalculardepreciacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesarCalcularDepreciacionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesarCalcularDepreciacionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesarCalcularDepreciacionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesarCalcularDepreciaciones(true);
			
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
			
			this.procesarcalculardepreciacionesConstantesFunciones=new ProcesarCalcularDepreciacionesConstantesFunciones(); 
			this.procesarcalculardepreciacionesBean=new ProcesarCalcularDepreciaciones();//this.procesarcalculardepreciacionesConstantesFunciones); 			
			this.procesarcalculardepreciacionesReturnGeneral=new ProcesarCalcularDepreciacionesParameterReturnGeneral(); 
		
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Procesar Calcular Depreciaciones Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesarcalculardepreciaciones=new ProcesarCalcularDepreciaciones();
			this.procesarcalculardepreciacioness = new ArrayList<ProcesarCalcularDepreciaciones>();
			this.procesarcalculardepreciacionessAux = new ArrayList<ProcesarCalcularDepreciaciones>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic=new ProcesarCalcularDepreciacionesLogic();
				this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
			}
			
			//this.procesarcalculardepreciacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesarcalculardepreciacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones);	
					}
					
					if(this.jInternalFrameImportacionProcesarCalcularDepreciaciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesarCalcularDepreciaciones);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesarCalcularDepreciaciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesarCalcularDepreciaciones);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones);
				this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.setVisible(false);
				this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones);
					this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesarCalcularDepreciaciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesarCalcularDepreciaciones);
					this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setVisible(false);
					this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesarCalcularDepreciaciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesarCalcularDepreciaciones);
					this.jInternalFrameOrderByProcesarCalcularDepreciaciones.setVisible(false);
					this.jInternalFrameOrderByProcesarCalcularDepreciaciones.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesarCalcularDepreciacionesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesarCalcularDepreciacionesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesarcalculardepreciacionesReturnGeneral=new ProcesarCalcularDepreciacionesParameterReturnGeneral();
			
			this.procesarcalculardepreciacionesParameterGeneral=new ProcesarCalcularDepreciacionesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesarcalculardepreciacionesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesarCalcularDepreciacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesarCalcularDepreciacionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado(),this.procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesarCalcularDepreciacionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado(),this.procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaDuplicarProcesarCalcularDepreciaciones=true;
			this.isVisibilidadCeldaCopiarProcesarCalcularDepreciaciones=true;
			this.isVisibilidadCeldaVerFormProcesarCalcularDepreciaciones=true;
			this.isVisibilidadCeldaOrdenProcesarCalcularDepreciaciones=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaModificarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones=false;
			
			
			this.isVisibilidadBusquedaProcesarCalcularDepreciaciones=true;
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdDetalleGrupoActivoFijo=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdSubGrupoActivoFijo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesarCalcularDepreciaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesarCalcularDepreciaciones();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesarCalcularDepreciaciones(false);
			
			this.setPermisosUsuarioProcesarCalcularDepreciaciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado() 
				|| (this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado() && this.procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesarCalcularDepreciacionesClasesRelacionadas();
			}
			
			if(this.procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesarCalcularDepreciacionesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesarCalcularDepreciaciones();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesarCalcularDepreciaciones();
			}
			
			if(!this.isPermisoBusquedaProcesarCalcularDepreciaciones) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesarCalcularDepreciacionesConstantesFunciones.getTiposSeleccionarProcesarCalcularDepreciaciones());
				
				this.tiposColumnasSelect=ProcesarCalcularDepreciacionesConstantesFunciones.getTiposSeleccionarProcesarCalcularDepreciaciones(true);
				
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
			//if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesarCalcularDepreciaciones();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesarCalcularDepreciaciones(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesarCalcularDepreciaciones(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesarCalcularDepreciaciones() ;
			
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
			this.detallegrupoactivofijoLogic=new DetalleGrupoActivoFijoLogic();
			this.subgrupoactivofijoLogic=new SubGrupoActivoFijoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesarcalculardepreciacionesImplementable= (ProcesarCalcularDepreciacionesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesarCalcularDepreciacionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesarcalculardepreciacionesImplementableHome= (ProcesarCalcularDepreciacionesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesarCalcularDepreciacionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesarcalculardepreciacioness= new ArrayList<ProcesarCalcularDepreciaciones>();
			this.procesarcalculardepreciacionessEliminados= new ArrayList<ProcesarCalcularDepreciaciones>();
						
			this.isEsNuevoProcesarCalcularDepreciaciones=false;
			this.esParaAccionDesdeFormularioProcesarCalcularDepreciaciones=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			this.detallegrupoactivofijosForeignKey=new ArrayList<DetalleGrupoActivoFijo>() ;
			this.subgrupoactivofijosForeignKey=new ArrayList<SubGrupoActivoFijo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesarCalcularDepreciaciones(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesarCalcularDepreciaciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesarCalcularDepreciacionesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesarCalcularDepreciaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesarCalcularDepreciaciones();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesarCalcularDepreciaciones();
			}
			
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesarCalcularDepreciaciones(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesarCalcularDepreciaciones: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesarCalcularDepreciaciones() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesarCalcularDepreciaciones")) {
				iIndex=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jTabbedPaneRelacionesProcesarCalcularDepreciaciones.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jTabbedPaneRelacionesProcesarCalcularDepreciaciones.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesarCalcularDepreciaciones();	
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
	
	public void cargarCombosForeignKeyProcesarCalcularDepreciaciones(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesarCalcularDepreciaciones(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesarCalcularDepreciaciones(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesarCalcularDepreciacionesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesarCalcularDepreciaciones();
		
		this.cargarCombosFrameForeignKeyProcesarCalcularDepreciaciones();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesarCalcularDepreciaciones();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesarCalcularDepreciaciones();
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

	public void cargarCombosForeignKeyDetalleGrupoActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDetalleGrupoActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo();
				this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyDetalleGrupoActivoFijo("Todos");
				}

			this.recargarComboTablaDetalleGrupoActivoFijo(this.detallegrupoactivofijosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySubGrupoActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeySubGrupoActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeySubGrupoActivoFijo();
				this.cargarCombosFrameSubGrupoActivoFijosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyDetalleGrupoActivoFijo("Todos");
				}

			this.recargarComboTablaSubGrupoActivoFijo(this.subgrupoactivofijosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
			
			
			if(jTableDatosProcesarCalcularDepreciaciones.getRowCount()>=1) {
				jTableDatosProcesarCalcularDepreciaciones.removeRowSelectionInterval(0, jTableDatosProcesarCalcularDepreciaciones.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesarCalcularDepreciaciones=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesarCalcularDepreciaciones(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesarCalcularDepreciaciones(true);			
			//this.procesarcalculardepreciaciones=new ProcesarCalcularDepreciaciones();
			//this.procesarcalculardepreciaciones.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesarCalcularDepreciaciones(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesarCalcularDepreciaciones() ;
			
			if(ProcesarCalcularDepreciacionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesarCalcularDepreciaciones(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesarcalculardepreciaciones);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesarcalculardepreciaciones);				
			
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
			
			if(this.procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesarCalcularDepreciaciones: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessSeleccionados=new ArrayList<ProcesarCalcularDepreciaciones>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRows().length;			
			}
			
			procesarcalculardepreciacionessSeleccionados=this.getProcesarCalcularDepreciacionessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesarCalcularDepreciaciones--;			
				//ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux= new ProcesarCalcularDepreciaciones();			
				//procesarcalculardepreciacionesAux.setId(this.iIdNuevoProcesarCalcularDepreciaciones);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesarCalcularDepreciaciones procesarcalculardepreciacionesOrigen=new ProcesarCalcularDepreciaciones();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesOrigen : procesarcalculardepreciacionessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesarcalculardepreciacionesOrigen =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesarcalculardepreciacionesOrigen =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesarCalcularDepreciaciones();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesarcalculardepreciaciones.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesarCalcularDepreciaciones(procesarcalculardepreciacionesOrigen,this.procesarcalculardepreciaciones,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().add(this.procesarcalculardepreciacionesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesarcalculardepreciacioness.add(this.procesarcalculardepreciacionesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesarCalcularDepreciaciones(false);
				
				this.jTableDatosProcesarCalcularDepreciaciones.setRowSelectionInterval(this.getIndiceNuevoProcesarCalcularDepreciaciones(), this.getIndiceNuevoProcesarCalcularDepreciaciones());
				
				int iLastRow =  this.jTableDatosProcesarCalcularDepreciaciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesarCalcularDepreciaciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesarCalcularDepreciaciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesarCalcularDepreciaciones(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessSeleccionados=new ArrayList<ProcesarCalcularDepreciaciones>();									
		
			ProcesarCalcularDepreciaciones procesarcalculardepreciacionesOrigen=new ProcesarCalcularDepreciaciones();
			ProcesarCalcularDepreciaciones procesarcalculardepreciacionesDestino=new ProcesarCalcularDepreciaciones();
				
			procesarcalculardepreciacionessSeleccionados=this.getProcesarCalcularDepreciacionessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesarcalculardepreciacionessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesarcalculardepreciacionesOrigen =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesarcalculardepreciacionesOrigen =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesarcalculardepreciacionesDestino =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesarcalculardepreciacionesDestino =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesarcalculardepreciacionesOrigen =procesarcalculardepreciacionessSeleccionados.get(0);
				procesarcalculardepreciacionesDestino =procesarcalculardepreciacionessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesarCalcularDepreciaciones(procesarcalculardepreciacionesOrigen,procesarcalculardepreciacionesDestino,true,false);
				
				procesarcalculardepreciacionesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesarcalculardepreciacionesDestino,procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesarcalculardepreciacionesDestino,procesarcalculardepreciacioness);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesarCalcularDepreciaciones(false);
				
				//this.jTableDatosProcesarCalcularDepreciaciones.setRowSelectionInterval(this.getIndiceNuevoProcesarCalcularDepreciaciones(), this.getIndiceNuevoProcesarCalcularDepreciaciones());
				
				int iLastRow =  this.jTableDatosProcesarCalcularDepreciaciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesarCalcularDepreciaciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesarCalcularDepreciaciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesarCalcularDepreciaciones(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesarCalcularDepreciaciones.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesarCalcularDepreciaciones.setVisible(!isVisible);
			this.jPanelPaginacionProcesarCalcularDepreciaciones.setVisible(!isVisible);
			this.jPanelAccionesProcesarCalcularDepreciaciones.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesarCalcularDepreciaciones();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesarCalcularDepreciaciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesarCalcularDepreciaciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesarCalcularDepreciaciones();
			
			this.abrirFrameOrderByProcesarCalcularDepreciaciones();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesarCalcularDepreciaciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesarCalcularDepreciaciones(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesarCalcularDepreciaciones);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.isMaximum()) {
					this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.setSize(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.iWidthFormulario,this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.isMaximum()) {
						this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jContentPaneDetalleProcesarCalcularDepreciaciones.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jTabbedPaneRelacionesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jContentPaneDetalleProcesarCalcularDepreciaciones.getWidth(),ProcesarCalcularDepreciacionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jTabbedPaneRelacionesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jContentPaneDetalleProcesarCalcularDepreciaciones.getWidth(),ProcesarCalcularDepreciacionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jTabbedPaneRelacionesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jContentPaneDetalleProcesarCalcularDepreciaciones.getWidth(),ProcesarCalcularDepreciacionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.setVisible(true);
	        this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesarCalcularDepreciaciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesarCalcularDepreciaciones==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesarCalcularDepreciaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesarCalcularDepreciaciones,false,this);
				} else {
					this.jInternalFrameOrderByProcesarCalcularDepreciaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesarCalcularDepreciaciones,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesarCalcularDepreciaciones);
				this.jInternalFrameOrderByProcesarCalcularDepreciaciones.setVisible(false);
				this.jInternalFrameOrderByProcesarCalcularDepreciaciones.setSelected(false);
				
				this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesarCalcularDepreciaciones"));
				
				this.inicializarActualizarBindingTablaOrderByProcesarCalcularDepreciaciones();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesarCalcularDepreciaciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesarCalcularDepreciaciones==null) {
				
				this.jInternalFrameImportacionProcesarCalcularDepreciaciones=new ImportacionJInternalFrame(ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesarCalcularDepreciaciones);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesarCalcularDepreciaciones);
				this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setVisible(false);
				this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setSelected(false);


				this.jInternalFrameImportacionProcesarCalcularDepreciaciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesarCalcularDepreciaciones"));
				this.jInternalFrameImportacionProcesarCalcularDepreciaciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesarCalcularDepreciaciones"));
				this.jInternalFrameImportacionProcesarCalcularDepreciaciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesarCalcularDepreciaciones"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesarCalcularDepreciaciones() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones==null) {
				this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones=new ReporteDinamicoJInternalFrame(ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones);
				this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesarCalcularDepreciaciones"));
				this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesarCalcularDepreciaciones"));
				this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesarCalcularDepreciaciones"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesarCalcularDepreciaciones();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesarCalcularDepreciaciones() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesarCalcularDepreciaciones);
			
	       	this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.setVisible(false);
	        this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.dispose();
			//this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesarCalcularDepreciaciones() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesarCalcularDepreciaciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setVisible(true);
	        this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesarCalcularDepreciaciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.setVisible(true);
	        this.jInternalFrameOrderByProcesarCalcularDepreciaciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesarCalcularDepreciaciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.setVisible(false);
	        this.jInternalFrameOrderByProcesarCalcularDepreciaciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesarCalcularDepreciaciones() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesarCalcularDepreciaciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setVisible(false);
	        this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesarCalcularDepreciaciones(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesarCalcularDepreciaciones(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesarCalcularDepreciaciones(true);
			//this.isEsNuevoProcesarCalcularDepreciaciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesarCalcularDepreciaciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesarCalcularDepreciaciones(false) ;
			
			if(procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesarCalcularDepreciacionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesarCalcularDepreciaciones(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesarCalcularDepreciaciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesarCalcularDepreciacionesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesarCalcularDepreciaciones(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesarCalcularDepreciaciones(true);
			//this.isEsNuevoProcesarCalcularDepreciaciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesarcalculardepreciaciones.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesarCalcularDepreciaciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesarCalcularDepreciaciones(false) ;
			
			if(ProcesarCalcularDepreciacionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesarCalcularDepreciaciones(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesarCalcularDepreciaciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarCalcularDepreciaciones,ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();

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
		TableColumn tableColumnMes=this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarCalcularDepreciaciones,ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaDetalleGrupoActivoFijo(List<DetalleGrupoActivoFijo> detallegrupoactivofijosForeignKey)throws Exception{
		TableColumn tableColumnDetalleGrupoActivoFijo=this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarCalcularDepreciaciones,ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO));
		TableCellEditor tableCellEditorDetalleGrupoActivoFijo =tableColumnDetalleGrupoActivoFijo.getCellEditor();

		DetalleGrupoActivoFijoTableCell detallegrupoactivofijoTableCellFk=(DetalleGrupoActivoFijoTableCell)tableCellEditorDetalleGrupoActivoFijo;

		if(detallegrupoactivofijoTableCellFk!=null) {
			detallegrupoactivofijoTableCellFk.setdetallegrupoactivofijosForeignKey(detallegrupoactivofijosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();

		//if(intSelectedRow<=0) {
			//detallegrupoactivofijoTableCellFk.setRowActual(intSelectedRow);
			//detallegrupoactivofijoTableCellFk.setdetallegrupoactivofijosForeignKeyActual(detallegrupoactivofijosForeignKey);
		//}


		if(detallegrupoactivofijoTableCellFk!=null) {
			detallegrupoactivofijoTableCellFk.RecargarDetalleGrupoActivoFijosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaSubGrupoActivoFijo(List<SubGrupoActivoFijo> subgrupoactivofijosForeignKey)throws Exception{
		TableColumn tableColumnSubGrupoActivoFijo=this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarCalcularDepreciaciones,ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO));
		TableCellEditor tableCellEditorSubGrupoActivoFijo =tableColumnSubGrupoActivoFijo.getCellEditor();

		SubGrupoActivoFijoTableCell subgrupoactivofijoTableCellFk=(SubGrupoActivoFijoTableCell)tableCellEditorSubGrupoActivoFijo;

		if(subgrupoactivofijoTableCellFk!=null) {
			subgrupoactivofijoTableCellFk.setsubgrupoactivofijosForeignKey(subgrupoactivofijosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();

		//if(intSelectedRow<=0) {
			//subgrupoactivofijoTableCellFk.setRowActual(intSelectedRow);
			//subgrupoactivofijoTableCellFk.setsubgrupoactivofijosForeignKeyActual(subgrupoactivofijosForeignKey);
		//}


		if(subgrupoactivofijoTableCellFk!=null) {
			subgrupoactivofijoTableCellFk.RecargarSubGrupoActivoFijosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesarCalcularDepreciaciones(false);
			
			//if(!this.isEsNuevoProcesarCalcularDepreciaciones) {								
				int intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);
				
			}
			
			if(this.permiteMantenimiento(this.procesarcalculardepreciaciones)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesarCalcularDepreciaciones=true;
					this.inicializarActualizarBindingTablaProcesarCalcularDepreciaciones(false);
					this.isEsNuevoProcesarCalcularDepreciaciones=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesarCalcularDepreciaciones=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesarCalcularDepreciaciones=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesarCalcularDepreciaciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesarCalcularDepreciaciones(false);
				
				this.habilitarDeshabilitarControlesProcesarCalcularDepreciaciones(false);
			
												
				
				if(ProcesarCalcularDepreciacionesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesarCalcularDepreciaciones();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesarCalcularDepreciacionesActionPerformed(evt,procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesarCalcularDepreciaciones.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesarcalculardepreciaciones.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesarCalcularDepreciaciones.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCalcularDepreciaciones.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				this.procesarcalculardepreciaciones.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				this.procesarcalculardepreciaciones.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesarcalculardepreciaciones)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesarCalcularDepreciacionesModel) this.jTableDatosProcesarCalcularDepreciaciones.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesarCalcularDepreciaciones=true;
				this.inicializarActualizarBindingTablaProcesarCalcularDepreciaciones(false);
				this.isEsNuevoProcesarCalcularDepreciaciones=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesarCalcularDepreciaciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesarCalcularDepreciaciones(false);
				
				this.habilitarDeshabilitarControlesProcesarCalcularDepreciaciones(false);
				
				
				
				if(ProcesarCalcularDepreciacionesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesarCalcularDepreciaciones();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesarCalcularDepreciaciones.getRowCount()>=1) {
				jTableDatosProcesarCalcularDepreciaciones.removeRowSelectionInterval(0, jTableDatosProcesarCalcularDepreciaciones.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesarCalcularDepreciaciones(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesarCalcularDepreciaciones(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesarCalcularDepreciaciones(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesarCalcularDepreciaciones(false) ;
			
			this.isEsNuevoProcesarCalcularDepreciaciones=false;
			
			if(ProcesarCalcularDepreciacionesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesarCalcularDepreciaciones();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false);
				
				//SI ES MANUAL
				if(ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesarCalcularDepreciaciones();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesarCalcularDepreciaciones--;			
			//ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux= new ProcesarCalcularDepreciaciones();			
			//procesarcalculardepreciacionesAux.setId(this.iIdNuevoProcesarCalcularDepreciaciones);
			
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesarCalcularDepreciaciones();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);
			
			this.procesarcalculardepreciaciones.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().add(this.procesarcalculardepreciacionesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesarcalculardepreciacioness.add(this.procesarcalculardepreciacionesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesarCalcularDepreciaciones(false);
			
			this.jTableDatosProcesarCalcularDepreciaciones.setRowSelectionInterval(this.getIndiceNuevoProcesarCalcularDepreciaciones(), this.getIndiceNuevoProcesarCalcularDepreciaciones());
			
			int iLastRow =  this.jTableDatosProcesarCalcularDepreciaciones.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesarCalcularDepreciaciones.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesarCalcularDepreciaciones.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesarCalcularDepreciaciones(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false);
			
			//SI ES MANUAL
			if(ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesarCalcularDepreciaciones();
			}
			
			//this.abrirFrameTreeProcesarCalcularDepreciaciones();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesarCalcularDepreciaciones.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setFileImportacion(this.jInternalFrameImportacionProcesarCalcularDepreciaciones.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesarCalcularDepreciaciones.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesarCalcularDepreciaciones.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesarCalcularDepreciaciones.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesarCalcularDepreciaciones.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessSeleccionados=new ArrayList<ProcesarCalcularDepreciaciones>();		

		procesarcalculardepreciacionessSeleccionados=this.getProcesarCalcularDepreciacionessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesarCalcularDepreciacionesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesarCalcularDepreciacionesBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesarCalcularDepreciacioness("Todos",procesarcalculardepreciacionessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Calcular Depreciaciones",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DetalleGrupoActivoFijo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DetalleGrupoActivoFijo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DetalleGrupoActivoFijo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DetalleGrupoActivoFijo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_SubGrupoActivoFijo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_SubGrupoActivoFijo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_SubGrupoActivoFijo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_SubGrupoActivoFijo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					sNombreCampoCategoria="id_detalle_grupo_activo_fijo";
					break;

				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO:
					sNombreCampoCategoria="id_sub_grupo_activo_fijo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					sNombreCampoCategoriaValor="id_detalle_grupo_activo_fijo";
					break;

				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO:
					sNombreCampoCategoriaValor="id_sub_grupo_activo_fijo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle Grupo Activo Fijo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_detalle_grupo_activo_fijo");
					break;

				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sub Grupo Activo Fijo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sub_grupo_activo_fijo");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessSeleccionados=new ArrayList<ProcesarCalcularDepreciaciones>();		
		
		procesarcalculardepreciacionessSeleccionados=this.getProcesarCalcularDepreciacionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarcalculardepreciaciones";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesarCalcularDepreciacioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones:procesarcalculardepreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesarcalculardepreciaciones.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones:procesarcalculardepreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesarcalculardepreciaciones.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO);
					iRow++;

					for(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones:procesarcalculardepreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesarcalculardepreciaciones.getdetallegrupoactivofijo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO);
					iRow++;

					for(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones:procesarcalculardepreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesarcalculardepreciaciones.getsubgrupoactivofijo_descripcion());
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
			//	this.getFilaCabeceraExportarExcelProcesarCalcularDepreciaciones(row);				
			//	iRow++;
			//}				
			
			//for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:procesarcalculardepreciacionessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesarCalcularDepreciaciones(procesarcalculardepreciacionesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Calcular Depreciaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesarCalcularDepreciaciones(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false);
			
			//SI ES MANUAL
			if(ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesarCalcularDepreciaciones();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false);
			
			//SI ES MANUAL
			if(ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesarCalcularDepreciaciones();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false);
			
			//SI ES MANUAL
			if(ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesarCalcularDepreciaciones();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesarCalcularDepreciaciones() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesarCalcularDepreciaciones.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesarCalcularDepreciaciones.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesarCalcularDepreciaciones.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesarCalcularDepreciaciones.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesarCalcularDepreciaciones.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesarCalcularDepreciaciones.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesarCalcularDepreciaciones.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesarCalcularDepreciaciones(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesarCalcularDepreciaciones(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesarCalcularDepreciaciones(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesarCalcularDepreciaciones(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesarCalcularDepreciaciones(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesarCalcularDepreciaciones(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesarCalcularDepreciaciones(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesarCalcularDepreciaciones(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesarCalcularDepreciaciones() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesarCalcularDepreciaciones();
		
		this.inicializarActualizarBindingBotonesManualProcesarCalcularDepreciaciones(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesarCalcularDepreciaciones();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesarCalcularDepreciaciones() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesarCalcularDepreciaciones(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesarCalcularDepreciaciones(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesarCalcularDepreciaciones.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesarCalcularDepreciaciones.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jCheckBoxPostAccionNuevoProcesarCalcularDepreciaciones.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jCheckBoxPostAccionSinCerrarProcesarCalcularDepreciaciones.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jCheckBoxPostAccionSinMensajeProcesarCalcularDepreciaciones.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesarCalcularDepreciaciones.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesarCalcularDepreciaciones.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
				this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jCheckBoxPostAccionNuevoProcesarCalcularDepreciaciones.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jCheckBoxPostAccionSinCerrarProcesarCalcularDepreciaciones.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jCheckBoxPostAccionSinMensajeProcesarCalcularDepreciaciones.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesarCalcularDepreciaciones.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesarCalcularDepreciaciones.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesarCalcularDepreciaciones.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesarCalcularDepreciaciones.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesarCalcularDepreciaciones.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesarCalcularDepreciaciones.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesarCalcularDepreciaciones(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesarCalcularDepreciaciones(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesarCalcularDepreciaciones() throws Exception {
		try	{
			if(ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesarCalcularDepreciaciones();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesarCalcularDepreciaciones() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesarCalcularDepreciaciones() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesarCalcularDepreciaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesarCalcularDepreciaciones.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesarCalcularDepreciaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesarCalcularDepreciaciones.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesarCalcularDepreciaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesarCalcularDepreciaciones.addItem(reporte);
			}
			
			
			if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesarCalcularDepreciaciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesarCalcularDepreciaciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesarCalcularDepreciaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesarCalcularDepreciaciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesarCalcularDepreciaciones();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesarCalcularDepreciaciones() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones!=null) {
				this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones!=null) {
				this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesarCalcularDepreciaciones()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.getSelectedItem()!=null){this.id_anioBusquedaProcesarCalcularDepreciaciones=((Anio)this.jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.getSelectedItem()!=null){this.id_mesBusquedaProcesarCalcularDepreciaciones=((Mes)this.jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.getSelectedItem()).getId();}
		if(this.jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.getSelectedItem()!=null){this.id_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones=((DetalleGrupoActivoFijo)this.jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.getSelectedItem()).getId();}
		if(this.jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.getSelectedItem()!=null){this.id_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciaciones=((SubGrupoActivoFijo)this.jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesarCalcularDepreciaciones(Boolean esInicializar) throws Exception {				
		if(ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesarCalcularDepreciaciones();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesarCalcularDepreciaciones() throws Exception {
		this.inicializarActualizarBindingTablaProcesarCalcularDepreciaciones(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesarCalcularDepreciaciones() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesarCalcularDepreciacionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesarCalcularDepreciacionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesarCalcularDepreciacionesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarCalcularDepreciacionesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesarCalcularDepreciacionesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesarCalcularDepreciacionesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesarCalcularDepreciaciones(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesarcalculardepreciacioness.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesarCalcularDepreciaciones.setModel(new ProcesarCalcularDepreciacionesModel(this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesarCalcularDepreciaciones.setModel(new ProcesarCalcularDepreciacionesModel(this.procesarcalculardepreciacioness,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesarCalcularDepreciaciones!=null && this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesarCalcularDepreciaciones();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarCalcularDepreciaciones,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesarCalcularDepreciacionesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO,procesarcalculardepreciacionesConstantesFunciones.resaltarSeleccionarProcesarCalcularDepreciaciones,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO,procesarcalculardepreciacionesConstantesFunciones.resaltarSeleccionarProcesarCalcularDepreciaciones,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarCalcularDepreciaciones,ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_ID));

		if(this.procesarcalculardepreciacionesConstantesFunciones.mostraridProcesarCalcularDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesarcalculardepreciacionesConstantesFunciones.resaltaridProcesarCalcularDepreciaciones,this.procesarcalculardepreciacionesConstantesFunciones.activaridProcesarCalcularDepreciaciones,this,true,"idProcesarCalcularDepreciaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesarcalculardepreciacionesConstantesFunciones.resaltaridProcesarCalcularDepreciaciones,this.procesarcalculardepreciacionesConstantesFunciones.activaridProcesarCalcularDepreciaciones,this,true,"idProcesarCalcularDepreciaciones","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarCalcularDepreciaciones,ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDANIO));

		if(this.procesarcalculardepreciacionesConstantesFunciones.mostrarid_anioProcesarCalcularDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.procesarcalculardepreciacionesConstantesFunciones.resaltarid_anioProcesarCalcularDepreciaciones,this,this.procesarcalculardepreciacionesConstantesFunciones.activarid_anioProcesarCalcularDepreciaciones));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.procesarcalculardepreciacionesConstantesFunciones.resaltarid_anioProcesarCalcularDepreciaciones,this,this.procesarcalculardepreciacionesConstantesFunciones.activarid_anioProcesarCalcularDepreciaciones,true,"id_anioProcesarCalcularDepreciaciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesarCalcularDepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarCalcularDepreciaciones,ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDMES));

		if(this.procesarcalculardepreciacionesConstantesFunciones.mostrarid_mesProcesarCalcularDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.procesarcalculardepreciacionesConstantesFunciones.resaltarid_mesProcesarCalcularDepreciaciones,this,this.procesarcalculardepreciacionesConstantesFunciones.activarid_mesProcesarCalcularDepreciaciones));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.procesarcalculardepreciacionesConstantesFunciones.resaltarid_mesProcesarCalcularDepreciaciones,this,this.procesarcalculardepreciacionesConstantesFunciones.activarid_mesProcesarCalcularDepreciaciones,true,"id_mesProcesarCalcularDepreciaciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesarCalcularDepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarCalcularDepreciaciones,ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO));

		if(this.procesarcalculardepreciacionesConstantesFunciones.mostrarid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DetalleGrupoActivoFijoTableCell(this.detallegrupoactivofijosForeignKey,this.procesarcalculardepreciacionesConstantesFunciones.resaltarid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones,this,this.procesarcalculardepreciacionesConstantesFunciones.activarid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones));
			tableColumn.setCellEditor(new DetalleGrupoActivoFijoTableCell(this.detallegrupoactivofijosForeignKey,this.procesarcalculardepreciacionesConstantesFunciones.resaltarid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones,this,this.procesarcalculardepreciacionesConstantesFunciones.activarid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones,true,"id_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesarCalcularDepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarCalcularDepreciaciones,ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO));

		if(this.procesarcalculardepreciacionesConstantesFunciones.mostrarid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new SubGrupoActivoFijoTableCell(this.subgrupoactivofijosForeignKey,this.procesarcalculardepreciacionesConstantesFunciones.resaltarid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones,this,this.procesarcalculardepreciacionesConstantesFunciones.activarid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones));
			tableColumn.setCellEditor(new SubGrupoActivoFijoTableCell(this.subgrupoactivofijosForeignKey,this.procesarcalculardepreciacionesConstantesFunciones.resaltarid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones,this,this.procesarcalculardepreciacionesConstantesFunciones.activarid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones,true,"id_sub_grupo_activo_fijoProcesarCalcularDepreciaciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesarCalcularDepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesarCalcularDepreciaciones.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesarCalcularDepreciaciones.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesarCalcularDepreciaciones && this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesarCalcularDepreciaciones.addColumn(tableColumn);
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
			
			this.jTableDatosProcesarCalcularDepreciaciones.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesarCalcularDepreciaciones && this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesarCalcularDepreciaciones && this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesarCalcularDepreciaciones.moveColumn(this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesarCalcularDepreciaciones.moveColumn(this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesarCalcularDepreciaciones.moveColumn(this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesarCalcularDepreciaciones.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesarCalcularDepreciaciones.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesarCalcularDepreciaciones,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesarCalcularDepreciaciones.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesarCalcularDepreciaciones.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesarCalcularDepreciaciones.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesarcalculardepreciacioness.size()-1;
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
		//this.jTableDatosProcesarCalcularDepreciaciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesarCalcularDepreciaciones();
			
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
				
				//this.isEsNuevoProcesarCalcularDepreciaciones=false;
					
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
			
				if(this.procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesarCalcularDepreciaciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesarcalculardepreciaciones.getsType().equals("DUPLICADO")
				   || this.procesarcalculardepreciaciones.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesarCalcularDepreciaciones=true;
				
				} else {
					this.isEsNuevoProcesarCalcularDepreciaciones=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
					if(this.procesarcalculardepreciaciones.getId()>=0 && !this.procesarcalculardepreciaciones.getIsNew()) {						
						this.isEsNuevoProcesarCalcularDepreciaciones=false;
						
					} else {
						this.isEsNuevoProcesarCalcularDepreciaciones=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesarCalcularDepreciaciones(esRelaciones);						
				
				this.seleccionarProcesarCalcularDepreciaciones(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesarcalculardepreciaciones.getId()<0) {
					this.isEsNuevoProcesarCalcularDepreciaciones=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesarCalcularDepreciaciones(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesarCalcularDepreciaciones(evt,rowIndex);
				}	
				
				if(this.procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesarCalcularDepreciaciones: " + this.dDif); 
					}
				}								
				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesarCalcularDepreciaciones(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesarcalculardepreciaciones)) {
					if(this.procesarcalculardepreciaciones.getId()>0) {
						this.procesarcalculardepreciaciones.setIsDeleted(true);
						
						this.procesarcalculardepreciacionessEliminados.add(this.procesarcalculardepreciaciones);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().remove(this.procesarcalculardepreciaciones);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesarcalculardepreciacioness.remove(this.procesarcalculardepreciaciones);				
					}
					
					
					((ProcesarCalcularDepreciacionesModel) this.jTableDatosProcesarCalcularDepreciaciones.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesarCalcularDepreciaciones(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesarCalcularDepreciaciones(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesarCalcularDepreciaciones) {
			
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesarCalcularDepreciaciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);
				}
				
				//ARCHITECTURE
				try {
					

					//Anio
					if(!this.procesarcalculardepreciacionesConstantesFunciones.cargarid_anioProcesarCalcularDepreciaciones || this.procesarcalculardepreciacionesConstantesFunciones.event_dependid_anioProcesarCalcularDepreciaciones) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.procesarcalculardepreciaciones.getid_anio());
									//this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(procesarcalculardepreciaciones.getAnio()!=null) {
							this.aniosForeignKey.add(procesarcalculardepreciaciones.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.procesarcalculardepreciaciones.getid_anio(),false,"Formulario");

					//Mes
					if(!this.procesarcalculardepreciacionesConstantesFunciones.cargarid_mesProcesarCalcularDepreciaciones || this.procesarcalculardepreciacionesConstantesFunciones.event_dependid_mesProcesarCalcularDepreciaciones) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.procesarcalculardepreciaciones.getid_mes());
									//this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(procesarcalculardepreciaciones.getMes()!=null) {
							this.messForeignKey.add(procesarcalculardepreciaciones.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.procesarcalculardepreciaciones.getid_mes(),false,"Formulario");

					//DetalleGrupoActivoFijo
					if(!this.procesarcalculardepreciacionesConstantesFunciones.cargarid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones || this.procesarcalculardepreciacionesConstantesFunciones.event_dependid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones) {
						//this.cargarCombosDetalleGrupoActivoFijosForeignKeyLista(" where id="+this.procesarcalculardepreciaciones.getid_detalle_grupo_activo_fijo());
									//this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);
						this.detallegrupoactivofijosForeignKey=new ArrayList<DetalleGrupoActivoFijo>();

						if(procesarcalculardepreciaciones.getDetalleGrupoActivoFijo()!=null) {
							this.detallegrupoactivofijosForeignKey.add(procesarcalculardepreciaciones.getDetalleGrupoActivoFijo());
						}

						this.addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo();
						this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey("Todos");
					}
					this.setActualDetalleGrupoActivoFijoForeignKey(this.procesarcalculardepreciaciones.getid_detalle_grupo_activo_fijo(),false,"Formulario");

					//SubGrupoActivoFijo
					if(!this.procesarcalculardepreciacionesConstantesFunciones.cargarid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones || this.procesarcalculardepreciacionesConstantesFunciones.event_dependid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones) {
						//this.cargarCombosSubGrupoActivoFijosForeignKeyLista(" where id="+this.procesarcalculardepreciaciones.getid_sub_grupo_activo_fijo());
									//this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);
						this.subgrupoactivofijosForeignKey=new ArrayList<SubGrupoActivoFijo>();

						if(procesarcalculardepreciaciones.getSubGrupoActivoFijo()!=null) {
							this.subgrupoactivofijosForeignKey.add(procesarcalculardepreciaciones.getSubGrupoActivoFijo());
						}

						this.addItemDefectoCombosForeignKeySubGrupoActivoFijo();
						this.cargarCombosFrameSubGrupoActivoFijosForeignKey("Todos");
					}
					this.setActualSubGrupoActivoFijoForeignKey(this.procesarcalculardepreciaciones.getid_sub_grupo_activo_fijo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesarCalcularDepreciaciones("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesarCalcularDepreciaciones(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesarCalcularDepreciaciones() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesarCalcularDepreciaciones(procesarcalculardepreciaciones,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesarCalcularDepreciaciones(procesarcalculardepreciaciones);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesarCalcularDepreciaciones(procesarcalculardepreciaciones,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesarCalcularDepreciaciones(procesarcalculardepreciaciones);
	}
	
	public void setVariablesObjetoActualToFormularioProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelidProcesarCalcularDepreciaciones.setText(procesarcalculardepreciaciones.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesarCalcularDepreciaciones procesarcalculardepreciacionesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesarcalculardepreciacionesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesarCalcularDepreciaciones procesarcalculardepreciacionesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesarcalculardepreciacionesLocal=this.procesarcalculardepreciaciones;
			} else {
				procesarcalculardepreciacionesLocal=this.procesarcalculardepreciacionesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesarcalculardepreciacionesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesarCalcularDepreciaciones(procesarcalculardepreciacionesLocal,true);
					
					if(procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesarcalculardepreciacionesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesarcalculardepreciacionesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(procesarcalculardepreciaciones,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(procesarcalculardepreciaciones);
	}
	
	public void setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(procesarcalculardepreciaciones,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelidProcesarCalcularDepreciaciones.getText()==null || this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelidProcesarCalcularDepreciaciones.getText()=="" || this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelidProcesarCalcularDepreciaciones.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelidProcesarCalcularDepreciaciones.setText("0");
			}

			if(conColumnasBase) {procesarcalculardepreciaciones.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelidProcesarCalcularDepreciaciones.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelIdProcesarCalcularDepreciaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesBean,ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesOrigen,ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesarcalculardepreciacionesOrigen.getId()!=null && !procesarcalculardepreciacionesOrigen.getId().equals(0L))) {procesarcalculardepreciaciones.setId(procesarcalculardepreciacionesOrigen.getId());}}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelidProcesarCalcularDepreciaciones.setText(procesarcalculardepreciaciones.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesarCalcularDepreciaciones(ProcesarCalcularDepreciacionesBean procesarcalculardepreciacionesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelidProcesarCalcularDepreciaciones.setText(procesarcalculardepreciacionesBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesarCalcularDepreciaciones(ProcesarCalcularDepreciacionesParameterReturnGeneral procesarcalculardepreciacionesReturnGeneral,ProcesarCalcularDepreciacionesBean procesarcalculardepreciacionesBean,Boolean conDefault) throws Exception { 
		try {
			ProcesarCalcularDepreciaciones procesarcalculardepreciacionesLocal=new ProcesarCalcularDepreciaciones();
			
			procesarcalculardepreciacionesLocal=procesarcalculardepreciacionesReturnGeneral.getProcesarCalcularDepreciaciones();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesarcalculardepreciacionesLocal.getId()!=null && !procesarcalculardepreciacionesLocal.getId().equals(0L))) {procesarcalculardepreciacionesBean.setId(procesarcalculardepreciacionesLocal.getId());}}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesarCalcularDepreciacionesGenerico(Long idProcesarCalcularDepreciacionesSeleccionado,JComboBox jComboBoxProcesarCalcularDepreciaciones,List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessLocal)throws Exception {
		try {
			ProcesarCalcularDepreciaciones  procesarcalculardepreciacionesTemp=null;

			for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:procesarcalculardepreciacionessLocal) {
				if(procesarcalculardepreciacionesAux.getId()!=null && procesarcalculardepreciacionesAux.getId().equals(idProcesarCalcularDepreciacionesSeleccionado)) {
					procesarcalculardepreciacionesTemp=procesarcalculardepreciacionesAux;
					break;
				}
			}

			jComboBoxProcesarCalcularDepreciaciones.setSelectedItem(procesarcalculardepreciacionesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesarCalcularDepreciacionesGenerico(JComboBox jComboBoxProcesarCalcularDepreciaciones,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesarCalcularDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesarCalcularDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesarCalcularDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesarCalcularDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesarCalcularDepreciaciones.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesarCalcularDepreciaciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesarCalcularDepreciaciones.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesarCalcularDepreciaciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesarCalcularDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesarCalcularDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesarcalculardepreciaciones=(ProcesarCalcularDepreciaciones) procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) procesarcalculardepreciacioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!procesarcalculardepreciaciones.getIsNew() && !procesarcalculardepreciaciones.getIsChanged() && !procesarcalculardepreciaciones.getIsDeleted()) {
				sDescripcion=procesarcalculardepreciaciones.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=procesarcalculardepreciaciones.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!procesarcalculardepreciaciones.getIsNew() && !procesarcalculardepreciaciones.getIsChanged() && !procesarcalculardepreciaciones.getIsDeleted()) {
				sDescripcion=procesarcalculardepreciaciones.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=procesarcalculardepreciaciones.getmes_descripcion();
			}
		}

		if(sTipo.equals("DetalleGrupoActivoFijo")) {
			//sDescripcion=this.getActualDetalleGrupoActivoFijoForeignKeyDescripcion((Long)value);
			if(!procesarcalculardepreciaciones.getIsNew() && !procesarcalculardepreciaciones.getIsChanged() && !procesarcalculardepreciaciones.getIsDeleted()) {
				sDescripcion=procesarcalculardepreciaciones.getdetallegrupoactivofijo_descripcion();
			} else {
				//sDescripcion=this.getActualDetalleGrupoActivoFijoForeignKeyDescripcion((Long)value);
				sDescripcion=procesarcalculardepreciaciones.getdetallegrupoactivofijo_descripcion();
			}
		}

		if(sTipo.equals("SubGrupoActivoFijo")) {
			//sDescripcion=this.getActualSubGrupoActivoFijoForeignKeyDescripcion((Long)value);
			if(!procesarcalculardepreciaciones.getIsNew() && !procesarcalculardepreciaciones.getIsChanged() && !procesarcalculardepreciaciones.getIsDeleted()) {
				sDescripcion=procesarcalculardepreciaciones.getsubgrupoactivofijo_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=procesarcalculardepreciaciones.getsubgrupoactivofijo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesarCalcularDepreciaciones procesarcalculardepreciacionesRow=new ProcesarCalcularDepreciaciones();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesarcalculardepreciacionesRow=(ProcesarCalcularDepreciaciones) procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesarcalculardepreciacionesRow=(ProcesarCalcularDepreciaciones) procesarcalculardepreciacioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesarCalcularDepreciaciones(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones && this.isPermisoNuevoProcesarCalcularDepreciaciones));			
			this.jButtonDuplicarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaDuplicarProcesarCalcularDepreciaciones && this.isPermisoDuplicarProcesarCalcularDepreciaciones));			
			this.jButtonCopiarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaCopiarProcesarCalcularDepreciaciones && this.isPermisoCopiarProcesarCalcularDepreciaciones));
			this.jButtonVerFormProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaVerFormProcesarCalcularDepreciaciones && this.isPermisoVerFormProcesarCalcularDepreciaciones));
			
			this.jButtonAbrirOrderByProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaOrdenProcesarCalcularDepreciaciones && this.isPermisoOrdenProcesarCalcularDepreciaciones));			
			
			this.jButtonNuevoRelacionesProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones && this.isPermisoNuevoProcesarCalcularDepreciaciones));			
			this.jButtonNuevoGuardarCambiosProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones && this.isPermisoNuevoProcesarCalcularDepreciaciones && this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones));
			
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonModificarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaModificarProcesarCalcularDepreciaciones && this.isPermisoActualizarProcesarCalcularDepreciaciones));	
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonActualizarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones && this.isPermisoActualizarProcesarCalcularDepreciaciones));	
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonEliminarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones && this.isPermisoEliminarProcesarCalcularDepreciaciones));
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonCancelarProcesarCalcularDepreciaciones.setVisible(this.isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones);							
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonGuardarCambiosProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones && this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones && this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones && this.isPermisoNuevoProcesarCalcularDepreciaciones));						
			this.jButtonDuplicarToolBarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaDuplicarProcesarCalcularDepreciaciones && this.isPermisoDuplicarProcesarCalcularDepreciaciones));						
			this.jButtonCopiarToolBarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaCopiarProcesarCalcularDepreciaciones && this.isPermisoCopiarProcesarCalcularDepreciaciones));			
			this.jButtonVerFormToolBarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaVerFormProcesarCalcularDepreciaciones && this.isPermisoVerFormProcesarCalcularDepreciaciones));			
			this.jButtonAbrirOrderByToolBarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaOrdenProcesarCalcularDepreciaciones && this.isPermisoOrdenProcesarCalcularDepreciaciones));
			this.jButtonNuevoRelacionesToolBarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones && this.isPermisoNuevoProcesarCalcularDepreciaciones));			
			this.jButtonNuevoGuardarCambiosToolBarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones && this.isPermisoNuevoProcesarCalcularDepreciaciones && this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones));			
			
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonModificarToolBarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaModificarProcesarCalcularDepreciaciones && this.isPermisoActualizarProcesarCalcularDepreciaciones));	
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonActualizarToolBarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones  && this.isPermisoActualizarProcesarCalcularDepreciaciones));	
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonEliminarToolBarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones && this.isPermisoEliminarProcesarCalcularDepreciaciones));
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonCancelarToolBarProcesarCalcularDepreciaciones.setVisible(this.isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones);				
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonGuardarCambiosToolBarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones && this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones && this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones && this.isPermisoNuevoProcesarCalcularDepreciaciones));			
			this.jMenuItemDuplicarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaDuplicarProcesarCalcularDepreciaciones && this.isPermisoDuplicarProcesarCalcularDepreciaciones));			
			this.jMenuItemCopiarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaCopiarProcesarCalcularDepreciaciones && this.isPermisoCopiarProcesarCalcularDepreciaciones));			
			this.jMenuItemVerFormProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaVerFormProcesarCalcularDepreciaciones && this.isPermisoVerFormProcesarCalcularDepreciaciones));			
			this.jMenuItemAbrirOrderByProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaOrdenProcesarCalcularDepreciaciones && this.isPermisoOrdenProcesarCalcularDepreciaciones));			
			//this.jMenuItemMostrarOcultarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaOrdenProcesarCalcularDepreciaciones && this.isPermisoOrdenProcesarCalcularDepreciaciones));
			this.jMenuItemDetalleAbrirOrderByProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaOrdenProcesarCalcularDepreciaciones && this.isPermisoOrdenProcesarCalcularDepreciaciones));			
			//this.jMenuItemDetalleMostrarOcultarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaOrdenProcesarCalcularDepreciaciones && this.isPermisoOrdenProcesarCalcularDepreciaciones));			
			this.jMenuItemNuevoRelacionesProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones && this.isPermisoNuevoProcesarCalcularDepreciaciones));			
			this.jMenuItemNuevoGuardarCambiosProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones && this.isPermisoNuevoProcesarCalcularDepreciaciones && this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones));									
			
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jMenuItemModificarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaModificarProcesarCalcularDepreciaciones && this.isPermisoActualizarProcesarCalcularDepreciaciones));	
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jMenuItemActualizarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones && this.isPermisoActualizarProcesarCalcularDepreciaciones));	
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jMenuItemEliminarProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones && this.isPermisoEliminarProcesarCalcularDepreciaciones));
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jMenuItemCancelarProcesarCalcularDepreciaciones.setVisible(this.isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones);				
			}
			
			this.jMenuItemGuardarCambiosProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones && this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones));						
			this.jMenuItemGuardarCambiosTablaProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones && this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones=this.jButtonNuevoProcesarCalcularDepreciaciones.isVisible();
			this.isVisibilidadCeldaDuplicarProcesarCalcularDepreciaciones=this.jButtonDuplicarProcesarCalcularDepreciaciones.isVisible();
			this.isVisibilidadCeldaCopiarProcesarCalcularDepreciaciones=this.jButtonCopiarProcesarCalcularDepreciaciones.isVisible();
			this.isVisibilidadCeldaVerFormProcesarCalcularDepreciaciones=this.jButtonVerFormProcesarCalcularDepreciaciones.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesarCalcularDepreciaciones=this.jButtonAbrirOrderByProcesarCalcularDepreciaciones.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones=this.jButtonNuevoRelacionesProcesarCalcularDepreciaciones.isVisible();
			this.isVisibilidadCeldaModificarProcesarCalcularDepreciaciones=this.jButtonModificarProcesarCalcularDepreciaciones.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
			this.isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonActualizarProcesarCalcularDepreciaciones.isVisible();
			this.isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonEliminarProcesarCalcularDepreciaciones.isVisible();
			this.isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonCancelarProcesarCalcularDepreciaciones.isVisible();
			this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonGuardarCambiosProcesarCalcularDepreciaciones.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones=this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones=this.jButtonNuevoToolBarProcesarCalcularDepreciaciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones=this.jButtonNuevoRelacionesToolBarProcesarCalcularDepreciaciones.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
			this.isVisibilidadCeldaModificarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonModificarToolBarProcesarCalcularDepreciaciones.isVisible();
			this.isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonActualizarToolBarProcesarCalcularDepreciaciones.isVisible();
			this.isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonEliminarToolBarProcesarCalcularDepreciaciones.isVisible();
			this.isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonCancelarToolBarProcesarCalcularDepreciaciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=this.jButtonGuardarCambiosToolBarProcesarCalcularDepreciaciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones=this.jButtonGuardarCambiosTablaToolBarProcesarCalcularDepreciaciones.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones=this.jMenuItemNuevoProcesarCalcularDepreciaciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones=this.jMenuItemNuevoRelacionesProcesarCalcularDepreciaciones.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
			this.isVisibilidadCeldaModificarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jMenuItemModificarProcesarCalcularDepreciaciones.isVisible();
			this.isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jMenuItemActualizarProcesarCalcularDepreciaciones.isVisible();
			this.isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jMenuItemEliminarProcesarCalcularDepreciaciones.isVisible();
			this.isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jMenuItemCancelarProcesarCalcularDepreciaciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=this.jMenuItemGuardarCambiosProcesarCalcularDepreciaciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones=this.jMenuItemGuardarCambiosTablaProcesarCalcularDepreciaciones.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesarCalcularDepreciaciones(Boolean esInicializar) {
		if(ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()) {
				//if(this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesarCalcularDepreciaciones();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesarCalcularDepreciaciones(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesarCalcularDepreciaciones() {
		this.jButtonNuevoProcesarCalcularDepreciaciones.setVisible(this.isPermisoNuevoProcesarCalcularDepreciaciones);			
		this.jButtonDuplicarProcesarCalcularDepreciaciones.setVisible(this.isPermisoDuplicarProcesarCalcularDepreciaciones);			
		this.jButtonCopiarProcesarCalcularDepreciaciones.setVisible(this.isPermisoCopiarProcesarCalcularDepreciaciones);			
		this.jButtonVerFormProcesarCalcularDepreciaciones.setVisible(this.isPermisoVerFormProcesarCalcularDepreciaciones);			
		
		this.jButtonAbrirOrderByProcesarCalcularDepreciaciones.setVisible(this.isPermisoOrdenProcesarCalcularDepreciaciones);					
		
		this.jButtonNuevoRelacionesProcesarCalcularDepreciaciones.setVisible(this.isPermisoNuevoProcesarCalcularDepreciaciones);			
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonModificarProcesarCalcularDepreciaciones.setVisible(this.isPermisoActualizarProcesarCalcularDepreciaciones);	
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonActualizarProcesarCalcularDepreciaciones.setVisible(this.isPermisoActualizarProcesarCalcularDepreciaciones);	
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonEliminarProcesarCalcularDepreciaciones.setVisible(this.isPermisoEliminarProcesarCalcularDepreciaciones);
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonCancelarProcesarCalcularDepreciaciones.setVisible(this.isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones);						
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonGuardarCambiosProcesarCalcularDepreciaciones.setVisible(this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones);							
		}
		
		this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones.setVisible(this.isPermisoActualizarProcesarCalcularDepreciaciones);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesarCalcularDepreciaciones() {
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonModificarProcesarCalcularDepreciaciones.setVisible(this.isPermisoActualizarProcesarCalcularDepreciaciones);	
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonActualizarProcesarCalcularDepreciaciones.setVisible(this.isPermisoActualizarProcesarCalcularDepreciaciones);	
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonEliminarProcesarCalcularDepreciaciones.setVisible(this.isPermisoEliminarProcesarCalcularDepreciaciones);
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonCancelarProcesarCalcularDepreciaciones.setVisible(this.isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones);							
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonGuardarCambiosProcesarCalcularDepreciaciones.setVisible((this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones && this.isPermisoGuardarCambiosProcesarCalcularDepreciaciones));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesarCalcularDepreciaciones() {
		if(ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesarCalcularDepreciaciones();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesarCalcularDepreciaciones() {
	}
	
	public void jTableDatosProcesarCalcularDepreciacionesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesarCalcularDepreciaciones(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesarCalcularDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(this.getprocesarcalculardepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesarcalculardepreciaciones==null) {
						this.procesarcalculardepreciaciones = new ProcesarCalcularDepreciaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);
				}

				if(this.procesarcalculardepreciaciones.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesarcalculardepreciaciones.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioProcesarCalcularDepreciacionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebProcesarCalcularDepreciaciones(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesarCalcularDepreciaciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesarCalcularDepreciaciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(this.getprocesarcalculardepreciaciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.procesarcalculardepreciacionesLogic.getConnexion());

				if(this.procesarcalculardepreciaciones.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.procesarcalculardepreciaciones.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesarCalcularDepreciaciones=(TitledBorder)this.jScrollPanelDatosProcesarCalcularDepreciaciones.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderProcesarCalcularDepreciaciones.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioProcesarCalcularDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(this.getprocesarcalculardepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesarcalculardepreciaciones==null) {
						this.procesarcalculardepreciaciones = new ProcesarCalcularDepreciaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);
				}

				if(this.procesarcalculardepreciaciones.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.procesarcalculardepreciaciones.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesProcesarCalcularDepreciacionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebProcesarCalcularDepreciaciones(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesarCalcularDepreciaciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesarCalcularDepreciaciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(this.getprocesarcalculardepreciaciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.procesarcalculardepreciacionesLogic.getConnexion());

				if(this.procesarcalculardepreciaciones.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.procesarcalculardepreciaciones.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesarCalcularDepreciaciones=(TitledBorder)this.jScrollPanelDatosProcesarCalcularDepreciaciones.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderProcesarCalcularDepreciaciones.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesProcesarCalcularDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(this.getprocesarcalculardepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesarcalculardepreciaciones==null) {
						this.procesarcalculardepreciaciones = new ProcesarCalcularDepreciaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);
				}

				if(this.procesarcalculardepreciaciones.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.procesarcalculardepreciaciones.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodetallegrupoactivofijo=true;

			idTienePermisodetallegrupoactivofijo=this.tienePermisosUsuarioEnPaginaWebProcesarCalcularDepreciaciones(DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

			if(idTienePermisodetallegrupoactivofijo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesarCalcularDepreciaciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesarCalcularDepreciaciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(this.getprocesarcalculardepreciaciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);

				this.detallegrupoactivofijoBeanSwingJInternalFrame=new DetalleGrupoActivoFijoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.detallegrupoactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.detallegrupoactivofijoBeanSwingJInternalFrame.getDetalleGrupoActivoFijoLogic().setConnexion(this.procesarcalculardepreciacionesLogic.getConnexion());

				if(this.procesarcalculardepreciaciones.getid_detalle_grupo_activo_fijo()!=null) {
					this.detallegrupoactivofijoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.detallegrupoactivofijoBeanSwingJInternalFrame.setIdActual(this.procesarcalculardepreciaciones.getid_detalle_grupo_activo_fijo());
					this.detallegrupoactivofijoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.detallegrupoactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.detallegrupoactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleGrupoActivoFijo();
				}

				JInternalFrameBase jinternalFrame =this.detallegrupoactivofijoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesarCalcularDepreciaciones=(TitledBorder)this.jScrollPanelDatosProcesarCalcularDepreciaciones.getBorder();
				TitledBorder titledBorderdetallegrupoactivofijo=(TitledBorder)this.detallegrupoactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder();

				titledBorderdetallegrupoactivofijo.setTitle(titledBorderProcesarCalcularDepreciaciones.getTitle() + " -> Detalle Grupo Activo Fijo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(this.getprocesarcalculardepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesarcalculardepreciaciones==null) {
						this.procesarcalculardepreciaciones = new ProcesarCalcularDepreciaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);
				}

				if(this.procesarcalculardepreciaciones.getid_detalle_grupo_activo_fijo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_detalle_grupo_activo_fijo = "+this.procesarcalculardepreciaciones.getid_detalle_grupo_activo_fijo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosubgrupoactivofijo=true;

			idTienePermisosubgrupoactivofijo=this.tienePermisosUsuarioEnPaginaWebProcesarCalcularDepreciaciones(SubGrupoActivoFijoConstantesFunciones.CLASSNAME);

			if(idTienePermisosubgrupoactivofijo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesarCalcularDepreciaciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesarCalcularDepreciaciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(this.getprocesarcalculardepreciaciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);

				this.subgrupoactivofijoBeanSwingJInternalFrame=new SubGrupoActivoFijoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.subgrupoactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.subgrupoactivofijoBeanSwingJInternalFrame.getSubGrupoActivoFijoLogic().setConnexion(this.procesarcalculardepreciacionesLogic.getConnexion());

				if(this.procesarcalculardepreciaciones.getid_sub_grupo_activo_fijo()!=null) {
					this.subgrupoactivofijoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.subgrupoactivofijoBeanSwingJInternalFrame.setIdActual(this.procesarcalculardepreciaciones.getid_sub_grupo_activo_fijo());
					this.subgrupoactivofijoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.subgrupoactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.subgrupoactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubGrupoActivoFijo();
				}

				JInternalFrameBase jinternalFrame =this.subgrupoactivofijoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesarCalcularDepreciaciones=(TitledBorder)this.jScrollPanelDatosProcesarCalcularDepreciaciones.getBorder();
				TitledBorder titledBordersubgrupoactivofijo=(TitledBorder)this.subgrupoactivofijoBeanSwingJInternalFrame.jScrollPanelDatosSubGrupoActivoFijo.getBorder();

				titledBordersubgrupoactivofijo.setTitle(titledBorderProcesarCalcularDepreciaciones.getTitle() + " -> Sub Grupo Activo Fijo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(this.getprocesarcalculardepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesarcalculardepreciaciones==null) {
						this.procesarcalculardepreciaciones = new ProcesarCalcularDepreciaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);
				}

				if(this.procesarcalculardepreciaciones.getid_sub_grupo_activo_fijo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sub_grupo_activo_fijo = "+this.procesarcalculardepreciaciones.getid_sub_grupo_activo_fijo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);

			this.getProcesarCalcularDepreciacionessBusquedaProcesarCalcularDepreciaciones();

			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false);

			//if(ProcesarCalcularDepreciacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);

			this.getProcesarCalcularDepreciacionessFK_IdAnio();

			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false);

			//if(ProcesarCalcularDepreciacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdDetalleGrupoActivoFijoProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);

			this.getProcesarCalcularDepreciacionessFK_IdDetalleGrupoActivoFijo();

			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false);

			//if(ProcesarCalcularDepreciacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);

			this.getProcesarCalcularDepreciacionessFK_IdMes();

			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false);

			//if(ProcesarCalcularDepreciacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSubGrupoActivoFijoProcesarCalcularDepreciacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);

			this.getProcesarCalcularDepreciacionessFK_IdSubGrupoActivoFijo();

			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false);

			//if(ProcesarCalcularDepreciacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcalculardepreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesarCalcularDepreciaciones() {
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.dispose();
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones!=null) {
			this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.dispose();
			this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones=null;
		}
		
		if(this.jInternalFrameImportacionProcesarCalcularDepreciaciones!=null) {
			this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setVisible(false);	    			
			this.jInternalFrameImportacionProcesarCalcularDepreciaciones.dispose();
			this.jInternalFrameImportacionProcesarCalcularDepreciaciones=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesarCalcularDepreciaciones();
			
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesarCalcularDepreciaciones")) {
				jButtonNuevoProcesarCalcularDepreciacionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesarCalcularDepreciaciones")) {
				jButtonDuplicarProcesarCalcularDepreciacionesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesarCalcularDepreciaciones")) {
				jButtonCopiarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesarCalcularDepreciaciones")) {
				jButtonVerFormProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesarCalcularDepreciaciones")) {
				jButtonNuevoProcesarCalcularDepreciacionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesarCalcularDepreciaciones")) {
				jButtonDuplicarProcesarCalcularDepreciacionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesarCalcularDepreciaciones")) {
				jButtonNuevoProcesarCalcularDepreciacionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesarCalcularDepreciaciones")) {
				jButtonDuplicarProcesarCalcularDepreciacionesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesarCalcularDepreciaciones")) {
				jButtonNuevoProcesarCalcularDepreciacionesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesarCalcularDepreciaciones")) {
				jButtonNuevoProcesarCalcularDepreciacionesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesarCalcularDepreciaciones")) {
				jButtonNuevoProcesarCalcularDepreciacionesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesarCalcularDepreciaciones")) {
				jButtonModificarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesarCalcularDepreciaciones")) {
				jButtonModificarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesarCalcularDepreciaciones")) {
				jButtonModificarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesarCalcularDepreciaciones")) {
				jButtonActualizarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesarCalcularDepreciaciones")) {
				jButtonActualizarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesarCalcularDepreciaciones")) {
				jButtonActualizarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesarCalcularDepreciaciones")) {
				jButtonEliminarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesarCalcularDepreciaciones")) {
				jButtonEliminarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesarCalcularDepreciaciones")) {
				jButtonEliminarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesarCalcularDepreciaciones")) {
				jButtonCancelarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesarCalcularDepreciaciones")) {
				jButtonCancelarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesarCalcularDepreciaciones")) {
				jButtonCancelarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesarCalcularDepreciaciones")) {
				jButtonCerrarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesarCalcularDepreciaciones")) {
				jButtonCerrarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesarCalcularDepreciaciones")) {
				jButtonCerrarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesarCalcularDepreciaciones")) {
				jButtonMostrarOcultarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesarCalcularDepreciaciones")) {
				jButtonCancelarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesarCalcularDepreciaciones")) {
				jButtonGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesarCalcularDepreciaciones")) {
				jButtonGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesarCalcularDepreciaciones")) {
				jButtonCopiarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesarCalcularDepreciaciones")) {
				jButtonVerFormProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesarCalcularDepreciaciones")) {
				jButtonGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesarCalcularDepreciaciones")) {
				jButtonCopiarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesarCalcularDepreciaciones")) {
				jButtonVerFormProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesarCalcularDepreciaciones")) {
				jButtonGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesarCalcularDepreciaciones")) {
				jButtonGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesarCalcularDepreciaciones")) {
				jButtonGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesarCalcularDepreciaciones")) {
				jButtonRecargarInformacionProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesarCalcularDepreciaciones")) {
				jButtonRecargarInformacionProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesarCalcularDepreciaciones")) {
				jButtonRecargarInformacionProcesarCalcularDepreciacionesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesarCalcularDepreciaciones")) {
				jButtonAnterioresProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesarCalcularDepreciaciones")) {
				jButtonAnterioresProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesarCalcularDepreciaciones")) {
				jButtonAnterioresProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesarCalcularDepreciaciones")) {
				jButtonSiguientesProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesarCalcularDepreciaciones")) {
				jButtonSiguientesProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesarCalcularDepreciaciones")) {
				jButtonSiguientesProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesarCalcularDepreciaciones") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesarCalcularDepreciaciones")) {
				jButtonAbrirOrderByProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesarCalcularDepreciaciones") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesarCalcularDepreciaciones")) {
				jButtonMostrarOcultarProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesarCalcularDepreciaciones")) {
				jButtonNuevoGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesarCalcularDepreciaciones")) {
				jButtonNuevoGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesarCalcularDepreciaciones")) {
				jButtonNuevoGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesarCalcularDepreciaciones")) {
				jButtonProcesarInformacionProcesarCalcularDepreciacionesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesarCalcularDepreciaciones")) {
				jButtonCerrarReporteDinamicoProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesarCalcularDepreciaciones")) {
				jButtonGenerarReporteDinamicoProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesarCalcularDepreciaciones")) {
				
				jButtonGenerarExcelReporteDinamicoProcesarCalcularDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesarCalcularDepreciaciones")) {
				jButtonCerrarImportacionProcesarCalcularDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesarCalcularDepreciaciones")) {
				
				jButtonGenerarImportacionProcesarCalcularDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesarCalcularDepreciaciones")) {
				
				jButtonAbrirImportacionProcesarCalcularDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesarCalcularDepreciaciones")) {
				jComboBoxTiposAccionesProcesarCalcularDepreciacionesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesarCalcularDepreciaciones")) {
				jComboBoxTiposRelacionesProcesarCalcularDepreciacionesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesarCalcularDepreciaciones")) {
				jComboBoxTiposAccionesProcesarCalcularDepreciacionesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesarCalcularDepreciaciones")) {
				
				jComboBoxTiposSeleccionarProcesarCalcularDepreciacionesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesarCalcularDepreciaciones")) {
				jTextFieldValorCampoGeneralProcesarCalcularDepreciacionesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesarCalcularDepreciaciones")) {
				jButtonAbrirOrderByProcesarCalcularDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesarCalcularDepreciaciones")) {
				jButtonAbrirOrderByProcesarCalcularDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesarCalcularDepreciaciones")) {
				jButtonCerrarOrderByProcesarCalcularDepreciacionesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesarCalcularDepreciacionesBusqueda")) {
				this.jButtonidProcesarCalcularDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioProcesarCalcularDepreciacionesUpdate")) {
				this.jButtonid_anioProcesarCalcularDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioProcesarCalcularDepreciacionesBusqueda")) {
				this.jButtonid_anioProcesarCalcularDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesProcesarCalcularDepreciacionesUpdate")) {
				this.jButtonid_mesProcesarCalcularDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesProcesarCalcularDepreciacionesBusqueda")) {
				this.jButtonid_mesProcesarCalcularDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate")) {
				this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda")) {
				this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate")) {
				this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda")) {
				this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones")) {
				this.jButtonBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciacionesActionPerformed(evt);
			}
			
			;
			
			
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesarCalcularDepreciaciones();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarCalcularDepreciacionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcalculardepreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcalculardepreciaciones);
				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
				
				


				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCalcularDepreciaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCalcularDepreciaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesarCalcularDepreciaciones procesarcalculardepreciacionesLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesarcalculardepreciacionesLocal=this.procesarcalculardepreciaciones;
			} else {
				procesarcalculardepreciacionesLocal=this.procesarcalculardepreciacionesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcalculardepreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcalculardepreciaciones);
				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
							
				
				


				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCalcularDepreciaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCalcularDepreciaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarCalcularDepreciacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesAnterior =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarcalculardepreciacionesAnterior =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
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
			
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
			
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
			
			


			
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarCalcularDepreciacionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcalculardepreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcalculardepreciaciones);
				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
								
						
				


				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCalcularDepreciaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCalcularDepreciaciones.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcalculardepreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcalculardepreciaciones);
				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
								
				
				


				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCalcularDepreciaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCalcularDepreciaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarCalcularDepreciacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesAnterior =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarcalculardepreciacionesAnterior =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcalculardepreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcalculardepreciaciones);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarCalcularDepreciacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesAnterior =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarcalculardepreciacionesAnterior =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarCalcularDepreciacionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcalculardepreciaciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesarcalculardepreciaciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcalculardepreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcalculardepreciaciones);
				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
							
				
				


				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCalcularDepreciaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCalcularDepreciaciones.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarCalcularDepreciacionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesarcalculardepreciacionesAnterior =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesarcalculardepreciacionesAnterior =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
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
			
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
			
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
			
			


			
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarCalcularDepreciacionesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcalculardepreciaciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesarcalculardepreciaciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcalculardepreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcalculardepreciaciones);
				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
								
				
				


				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCalcularDepreciaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCalcularDepreciaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarCalcularDepreciacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesAnterior =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarcalculardepreciacionesAnterior =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarCalcularDepreciacionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcalculardepreciaciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesarcalculardepreciaciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarCalcularDepreciacionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcalculardepreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcalculardepreciaciones);
				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesarCalcularDepreciaciones")) {
					jCheckBoxSeleccionarTodosProcesarCalcularDepreciacionesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesarCalcularDepreciaciones")) {
					jCheckBoxSeleccionadosProcesarCalcularDepreciacionesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesarCalcularDepreciaciones")) {
					
				}
				
				


				
				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCalcularDepreciaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCalcularDepreciaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcalculardepreciaciones);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesarcalculardepreciaciones);
				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
												
				
				


				
				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCalcularDepreciaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCalcularDepreciaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarCalcularDepreciacionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesarcalculardepreciacionesAnterior =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesarcalculardepreciacionesAnterior =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarCalcularDepreciacionesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcalculardepreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcalculardepreciaciones);
				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
				
				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
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
			
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
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
			
			


			if(sTipo.equals("id_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones;
				}

				if(this.procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()) {
					//classes=ProcesarCalcularDepreciacionesConstantesFunciones.getClassesRelationshipsOfProcesarCalcularDepreciaciones(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyDetalleGrupoActivoFijo(jComboBoxGenerico,"Formulario");

				this.recargarFormProcesarCalcularDepreciaciones(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones")) {
				this.procesarActionsCombosForeignKeyDetalleGrupoActivoFijo(jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones,"BusquedaProcesarCalcularDepreciaciones");
				//recargarFormProcesarCalcularDepreciacionesDetalleGrupoActivoFijo(jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones,"BusquedaProcesarCalcularDepreciaciones");
			}
			
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarCalcularDepreciacionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcalculardepreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcalculardepreciaciones);
				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones;
				}

				if(this.procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()) {
					//classes=ProcesarCalcularDepreciacionesConstantesFunciones.getClassesRelationshipsOfProcesarCalcularDepreciaciones(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyDetalleGrupoActivoFijo(jComboBoxGenerico,"Formulario");

				this.recargarFormProcesarCalcularDepreciaciones(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones")) {
				this.procesarActionsCombosForeignKeyDetalleGrupoActivoFijo(jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones,"BusquedaProcesarCalcularDepreciaciones");
				//recargarFormProcesarCalcularDepreciacionesDetalleGrupoActivoFijo(jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones,"BusquedaProcesarCalcularDepreciaciones");
			}
				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCalcularDepreciaciones.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCalcularDepreciaciones.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcalculardepreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcalculardepreciaciones);
				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
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
				
				


			if(sTipo.equals("id_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones;
				}

				if(this.procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()) {
					//classes=ProcesarCalcularDepreciacionesConstantesFunciones.getClassesRelationshipsOfProcesarCalcularDepreciaciones(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyDetalleGrupoActivoFijo(jComboBoxGenerico,"Formulario");

				this.recargarFormProcesarCalcularDepreciaciones(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones")) {
				this.procesarActionsCombosForeignKeyDetalleGrupoActivoFijo(jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones,"BusquedaProcesarCalcularDepreciaciones");
				//recargarFormProcesarCalcularDepreciacionesDetalleGrupoActivoFijo(jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones,"BusquedaProcesarCalcularDepreciaciones");
			}
				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCalcularDepreciaciones.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCalcularDepreciaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarCalcularDepreciacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcalculardepreciacionesAnterior =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarcalculardepreciacionesAnterior =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesarCalcularDepreciaciones")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesarCalcularDepreciacionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesarcalculardepreciaciones =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesarcalculardepreciaciones);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesarCalcularDepreciaciones")) {
				
				}
				
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesarCalcularDepreciaciones")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesarCalcularDepreciaciones.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesarCalcularDepreciaciones")) {
			
			}
			
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesarCalcularDepreciaciones();
			
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
			
			if(sTipo.equals("NuevoProcesarCalcularDepreciaciones")) {
				jButtonNuevoProcesarCalcularDepreciacionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesarCalcularDepreciaciones")) {
				jButtonDuplicarProcesarCalcularDepreciacionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesarCalcularDepreciaciones")) {
				jButtonCopiarProcesarCalcularDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesarCalcularDepreciaciones")) {
				jButtonVerFormProcesarCalcularDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesarCalcularDepreciaciones")) {
				jButtonNuevoProcesarCalcularDepreciacionesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesarCalcularDepreciaciones")) {
				jButtonModificarProcesarCalcularDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesarCalcularDepreciaciones")) {
				jButtonActualizarProcesarCalcularDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesarCalcularDepreciaciones")) {
				jButtonEliminarProcesarCalcularDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesarCalcularDepreciaciones")) {
				jButtonGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesarCalcularDepreciaciones")) {
				jButtonCancelarProcesarCalcularDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesarCalcularDepreciaciones")) {
				jButtonCerrarProcesarCalcularDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesarCalcularDepreciaciones")) {
				jButtonGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesarCalcularDepreciaciones")) {
				jButtonNuevoGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesarCalcularDepreciaciones")) {
				jButtonAbrirOrderByProcesarCalcularDepreciacionesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesarCalcularDepreciaciones")) {
				jButtonRecargarInformacionProcesarCalcularDepreciacionesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesarCalcularDepreciaciones")) {
				jButtonAnterioresProcesarCalcularDepreciacionesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesarCalcularDepreciaciones")) {
				jButtonSiguientesProcesarCalcularDepreciacionesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesarCalcularDepreciacionesBusqueda")) {
				this.jButtonidProcesarCalcularDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioProcesarCalcularDepreciacionesUpdate")) {
				this.jButtonid_anioProcesarCalcularDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioProcesarCalcularDepreciacionesBusqueda")) {
				this.jButtonid_anioProcesarCalcularDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesProcesarCalcularDepreciacionesUpdate")) {
				this.jButtonid_mesProcesarCalcularDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesProcesarCalcularDepreciacionesBusqueda")) {
				this.jButtonid_mesProcesarCalcularDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate")) {
				this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda")) {
				this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate")) {
				this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda")) {
				this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusquedaActionPerformed(evt);
			}
			
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesarCalcularDepreciaciones();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesarCalcularDepreciaciones")) {
				closingInternalFrameProcesarCalcularDepreciaciones();
				
			} else if(sTipo.equals("jButtonCancelarProcesarCalcularDepreciaciones")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesarCalcularDepreciaciones = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesarCalcularDepreciacionesBeanSwingJInternalFrame jInternalFrameParent=(ProcesarCalcularDepreciacionesBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesarCalcularDepreciaciones.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesarCalcularDepreciacionesActionPerformed(null);
			}
			
			ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesarcalculardepreciaciones,new Object(),this.procesarcalculardepreciacionesParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesarCalcularDepreciaciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesarCalcularDepreciaciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesarCalcularDepreciaciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesarcalculardepreciaciones)) {
			if(!esControlTabla) {
				if(ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);			
				}
				
				if(this.procesarcalculardepreciacionesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesarCalcularDepreciaciones(this.procesarcalculardepreciacionesReturnGeneral,this.procesarcalculardepreciacionesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesarcalculardepreciacionesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesarCalcularDepreciaciones(classes,this.procesarcalculardepreciacionesReturnGeneral,this.procesarcalculardepreciacionesBean,false);
					}
						
					if(this.procesarcalculardepreciacionesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesarCalcularDepreciaciones(this.procesarcalculardepreciacionesReturnGeneral.getProcesarCalcularDepreciaciones());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesarCalcularDepreciaciones(this.procesarcalculardepreciacionesReturnGeneral.getProcesarCalcularDepreciaciones());	
					}
						
					if(this.procesarcalculardepreciacionesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesarCalcularDepreciaciones(this.procesarcalculardepreciacionesReturnGeneral.getProcesarCalcularDepreciaciones(),classes);//this.procesarcalculardepreciacionesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones,classes);//this.procesarcalculardepreciacionesBean);									
				}
			
				if(ProcesarCalcularDepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarCalcularDepreciaciones(this.procesarcalculardepreciaciones);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesarcalculardepreciacionesAnterior!=null) {
						this.procesarcalculardepreciaciones=this.procesarcalculardepreciacionesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesarcalculardepreciacionesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesarcalculardepreciacionesReturnGeneral.getProcesarCalcularDepreciaciones(),procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesarcalculardepreciacionesReturnGeneral.getProcesarCalcularDepreciaciones(),this.procesarcalculardepreciacioness);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesarCalcularDepreciaciones.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesarCalcularDepreciaciones.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesarCalcularDepreciaciones();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesarCalcularDepreciaciones() throws Exception {
		
		ProcesarCalcularDepreciacionesModel procesarcalculardepreciacionesModel=(ProcesarCalcularDepreciacionesModel)this.jTableDatosProcesarCalcularDepreciaciones.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesarcalculardepreciacionesModel.procesarcalculardepreciacioness=this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesarcalculardepreciacionesModel.procesarcalculardepreciacioness=this.procesarcalculardepreciacioness;
		}
		
		
		((ProcesarCalcularDepreciacionesModel) this.jTableDatosProcesarCalcularDepreciaciones.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesarCalcularDepreciaciones() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesarcalculardepreciacionesAnterior(),this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesarcalculardepreciacionesAnterior(),this.procesarcalculardepreciacioness);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesarCalcularDepreciaciones();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
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
										
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesarcalculardepreciaciones,new Object(),generalEntityParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesarCalcularDepreciacionesConstantesFunciones.getClassesRelationshipsOfProcesarCalcularDepreciaciones(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesarCalcularDepreciacionesConstantesFunciones.getClassesRelationshipsFromStringsOfProcesarCalcularDepreciaciones(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesarCalcularDepreciaciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesarcalculardepreciaciones,new Object(),generalEntityParameterGeneral,this.procesarcalculardepreciacionesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesarCalcularDepreciaciones(ProcesarCalcularDepreciacionesBean procesarcalculardepreciacionesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesarCalcularDepreciaciones(ArrayList<Classe> classes,ProcesarCalcularDepreciacionesReturnGeneral procesarcalculardepreciacionesReturnGeneral,ProcesarCalcularDepreciacionesBean procesarcalculardepreciacionesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesarcalculardepreciaciones)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones = new ProcesarCalcularDepreciacionesDetalleFormJInternalFrame(jDesktopPane,this.procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones(),this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones);
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.setVisible(false);
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.procesarcalculardepreciacionesLogic=this.procesarcalculardepreciacionesLogic;
		
		this.cargarCombosFrameForeignKeyProcesarCalcularDepreciaciones("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesarCalcularDepreciaciones();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesarCalcularDepreciaciones();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesarCalcularDepreciaciones("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesarCalcularDepreciaciones();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesarCalcularDepreciaciones"));
		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonModificarProcesarCalcularDepreciaciones.addActionListener(new ButtonActionListener(this,"ModificarProcesarCalcularDepreciaciones"));

		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonModificarToolBarProcesarCalcularDepreciaciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesarCalcularDepreciaciones"));
					
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jMenuItemModificarProcesarCalcularDepreciaciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesarCalcularDepreciaciones"));		
		
		
		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonActualizarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"ActualizarProcesarCalcularDepreciaciones"));
		
		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonActualizarToolBarProcesarCalcularDepreciaciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesarCalcularDepreciaciones"));
						
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jMenuItemActualizarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesarCalcularDepreciaciones"));		
		
		
		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonEliminarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"EliminarProcesarCalcularDepreciaciones"));
		
		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonEliminarToolBarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesarCalcularDepreciaciones"));
								
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jMenuItemEliminarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesarCalcularDepreciaciones"));		
		
		
		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonCancelarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"CancelarProcesarCalcularDepreciaciones"));
		
		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonCancelarToolBarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesarCalcularDepreciaciones"));
					
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jMenuItemCancelarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesarCalcularDepreciaciones"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jMenuItemDetalleCerrarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesarCalcularDepreciaciones"));		
		
		
		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonGuardarCambiosToolBarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesarCalcularDepreciaciones"));
		
		
		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonGuardarCambiosToolBarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesarCalcularDepreciaciones"));
		
		
		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesarCalcularDepreciaciones"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonidProcesarCalcularDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesarCalcularDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_anioProcesarCalcularDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesarCalcularDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_anioProcesarCalcularDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesarCalcularDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_mesProcesarCalcularDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_mesProcesarCalcularDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_mesProcesarCalcularDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProcesarCalcularDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jTabbedPaneRelacionesProcesarCalcularDepreciaciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesarCalcularDepreciaciones"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesarCalcularDepreciaciones"));
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesarCalcularDepreciaciones"));
		}
		
		this.jTableDatosProcesarCalcularDepreciaciones.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesarCalcularDepreciaciones"));
		
		this.jTableDatosProcesarCalcularDepreciaciones.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesarCalcularDepreciaciones"));
		
		this.jButtonNuevoProcesarCalcularDepreciaciones.addActionListener(new ButtonActionListener(this,"NuevoProcesarCalcularDepreciaciones"));
		
		this.jButtonDuplicarProcesarCalcularDepreciaciones.addActionListener(new ButtonActionListener(this,"DuplicarProcesarCalcularDepreciaciones"));
		
		this.jButtonCopiarProcesarCalcularDepreciaciones.addActionListener(new ButtonActionListener(this,"CopiarProcesarCalcularDepreciaciones"));
		
		this.jButtonVerFormProcesarCalcularDepreciaciones.addActionListener(new ButtonActionListener(this,"VerFormProcesarCalcularDepreciaciones"));
		
		
		this.jButtonNuevoToolBarProcesarCalcularDepreciaciones.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesarCalcularDepreciaciones"));
			
		this.jButtonDuplicarToolBarProcesarCalcularDepreciaciones.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesarCalcularDepreciaciones"));
			
		this.jMenuItemNuevoProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesarCalcularDepreciaciones"));
			
		this.jMenuItemDuplicarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesarCalcularDepreciaciones"));		
		
		
		this.jButtonNuevoRelacionesProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesarCalcularDepreciaciones"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesarCalcularDepreciaciones.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesarCalcularDepreciaciones"));
			
		this.jMenuItemNuevoRelacionesProcesarCalcularDepreciaciones.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesarCalcularDepreciaciones"));		
		
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonModificarProcesarCalcularDepreciaciones.addActionListener(new ButtonActionListener(this,"ModificarProcesarCalcularDepreciaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonModificarToolBarProcesarCalcularDepreciaciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesarCalcularDepreciaciones"));
			
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jMenuItemModificarProcesarCalcularDepreciaciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesarCalcularDepreciaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonActualizarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"ActualizarProcesarCalcularDepreciaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonActualizarToolBarProcesarCalcularDepreciaciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesarCalcularDepreciaciones"));
				
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jMenuItemActualizarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesarCalcularDepreciaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonEliminarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"EliminarProcesarCalcularDepreciaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonEliminarToolBarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesarCalcularDepreciaciones"));
						
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jMenuItemEliminarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesarCalcularDepreciaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonCancelarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"CancelarProcesarCalcularDepreciaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonCancelarToolBarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesarCalcularDepreciaciones"));
			
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jMenuItemCancelarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesarCalcularDepreciaciones"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesarCalcularDepreciaciones"));		
		
		
		this.jButtonCerrarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"CerrarProcesarCalcularDepreciaciones"));
		
		
		this.jButtonCerrarToolBarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesarCalcularDepreciaciones"));
			
		this.jMenuItemCerrarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesarCalcularDepreciaciones"));
			
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jMenuItemDetalleCerrarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesarCalcularDepreciaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonGuardarCambiosProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesarCalcularDepreciaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonGuardarCambiosToolBarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesarCalcularDepreciaciones"));
		}
		
		this.jButtonCopiarToolBarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesarCalcularDepreciaciones"));
			
		this.jButtonVerFormToolBarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesarCalcularDepreciaciones"));
		
		this.jMenuItemGuardarCambiosProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesarCalcularDepreciaciones"));
			
		this.jMenuItemCopiarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesarCalcularDepreciaciones"));		
		
		this.jMenuItemVerFormProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesarCalcularDepreciaciones"));		
		
		
		this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesarCalcularDepreciaciones"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesarCalcularDepreciaciones"));
			
		this.jMenuItemGuardarCambiosTablaProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesarCalcularDepreciaciones"));		
		
		
		
		this.jButtonRecargarInformacionProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesarCalcularDepreciaciones"));
					
		this.jButtonRecargarInformacionToolBarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesarCalcularDepreciaciones"));
		
		this.jMenuItemRecargarInformacionProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesarCalcularDepreciaciones"));		
		
		
		
		this.jButtonAnterioresProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"AnterioresProcesarCalcularDepreciaciones"));
		
		
		this.jButtonAnterioresToolBarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesarCalcularDepreciaciones"));
		
		this.jMenuItemAnterioresProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesarCalcularDepreciaciones"));		
		
		
		this.jButtonSiguientesProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"SiguientesProcesarCalcularDepreciaciones"));
		
		
		this.jButtonSiguientesToolBarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesarCalcularDepreciaciones"));
			
		this.jMenuItemSiguientesProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesarCalcularDepreciaciones"));
			
		this.jMenuItemAbrirOrderByProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesarCalcularDepreciaciones"));
			
		this.jMenuItemMostrarOcultarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesarCalcularDepreciaciones"));
			
		this.jMenuItemDetalleAbrirOrderByProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesarCalcularDepreciaciones"));
			
		this.jMenuItemDetalleMostarOcultarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesarCalcularDepreciaciones"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesarCalcularDepreciaciones"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesarCalcularDepreciaciones"));
			
		this.jMenuItemNuevoGuardarCambiosProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesarCalcularDepreciaciones"));		
		
		
		this.jButtonProcesarInformacionProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesarCalcularDepreciaciones"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesarCalcularDepreciaciones"));

		this.jCheckBoxSeleccionadosProcesarCalcularDepreciaciones.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesarCalcularDepreciaciones"));
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesarCalcularDepreciaciones"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesarCalcularDepreciaciones"));
			
		this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesarCalcularDepreciaciones"));
					
		this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesarCalcularDepreciaciones"));
			
		this.jTextFieldValorCampoGeneralProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesarCalcularDepreciaciones"));		
		
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonidProcesarCalcularDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesarCalcularDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_anioProcesarCalcularDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesarCalcularDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_anioProcesarCalcularDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesarCalcularDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_mesProcesarCalcularDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_mesProcesarCalcularDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_mesProcesarCalcularDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProcesarCalcularDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.addActionListener(new ButtonActionListener(this,"BusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones!=null) {
				this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesarCalcularDepreciaciones"));
				this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesarCalcularDepreciaciones"));
				this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesarCalcularDepreciaciones"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesarCalcularDepreciaciones"));				
			//this.jButtonGenerarReporteDinamicoProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesarCalcularDepreciaciones"));
			//this.jButtonGenerarExcelReporteDinamicoProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesarCalcularDepreciaciones"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesarCalcularDepreciaciones!=null) {
				this.jInternalFrameImportacionProcesarCalcularDepreciaciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesarCalcularDepreciaciones"));
				this.jInternalFrameImportacionProcesarCalcularDepreciaciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesarCalcularDepreciaciones"));
				this.jInternalFrameImportacionProcesarCalcularDepreciaciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesarCalcularDepreciaciones"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesarCalcularDepreciaciones"));
			
			this.jButtonAbrirOrderByToolBarProcesarCalcularDepreciaciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesarCalcularDepreciaciones"));			
			
			if(this.jInternalFrameOrderByProcesarCalcularDepreciaciones!=null) {
				this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesarCalcularDepreciaciones"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jTabbedPaneRelacionesProcesarCalcularDepreciaciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesarCalcularDepreciaciones"));
		
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
            		closingInternalFrameProcesarCalcularDepreciaciones();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesarCalcularDepreciaciones = (JInternalFrameBase)event.getSource();
	            	
	            ProcesarCalcularDepreciacionesBeanSwingJInternalFrame jInternalFrameParent=(ProcesarCalcularDepreciacionesBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesarCalcularDepreciaciones.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesarCalcularDepreciacionesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesarCalcularDepreciaciones.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesarCalcularDepreciacionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesarCalcularDepreciaciones.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesarCalcularDepreciaciones.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesarCalcularDepreciacionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesarCalcularDepreciacionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesarCalcularDepreciacionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesarCalcularDepreciaciones";
		inputMap = this.jButtonNuevoProcesarCalcularDepreciaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesarCalcularDepreciaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesarCalcularDepreciacionesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesarCalcularDepreciacionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesarCalcularDepreciacionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesarCalcularDepreciacionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesarCalcularDepreciaciones";
		inputMap = this.jButtonNuevoRelacionesProcesarCalcularDepreciaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesarCalcularDepreciaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesarCalcularDepreciacionesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesarCalcularDepreciaciones";
		inputMap = this.jButtonModificarProcesarCalcularDepreciaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesarCalcularDepreciaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesarCalcularDepreciacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesarCalcularDepreciaciones";
		inputMap = this.jButtonActualizarProcesarCalcularDepreciaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesarCalcularDepreciaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesarCalcularDepreciacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesarCalcularDepreciaciones";
		inputMap = this.jButtonEliminarProcesarCalcularDepreciaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesarCalcularDepreciaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesarCalcularDepreciacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesarCalcularDepreciaciones";
		inputMap = this.jButtonCancelarProcesarCalcularDepreciaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesarCalcularDepreciaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesarCalcularDepreciacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesarCalcularDepreciaciones";
		inputMap = this.jButtonCerrarProcesarCalcularDepreciaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesarCalcularDepreciaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesarCalcularDepreciacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonGuardarCambiosProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesarCalcularDepreciaciones";
		inputMap = this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonGuardarCambiosProcesarCalcularDepreciaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonGuardarCambiosProcesarCalcularDepreciaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesarCalcularDepreciacionesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesarCalcularDepreciacionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesarCalcularDepreciacionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesarCalcularDepreciaciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesarCalcularDepreciacionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonidProcesarCalcularDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesarCalcularDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_anioProcesarCalcularDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesarCalcularDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_anioProcesarCalcularDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesarCalcularDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_mesProcesarCalcularDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_mesProcesarCalcularDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_mesProcesarCalcularDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProcesarCalcularDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda"));
		
		
		this.jButtonBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.addActionListener(new ButtonActionListener(this,"BusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesarCalcularDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesarCalcularDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesarCalcularDepreciacionesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesarCalcularDepreciaciones(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness()) {
					procesarcalculardepreciacionesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:procesarcalculardepreciacioness) {
					procesarcalculardepreciacionesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesarCalcularDepreciacionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness()) {
						procesarcalculardepreciacionesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:procesarcalculardepreciacioness) {
						procesarcalculardepreciacionesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:procesarcalculardepreciacioness) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesarCalcularDepreciaciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesarCalcularDepreciaciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesarCalcularDepreciaciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesarCalcularDepreciaciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesarCalcularDepreciacionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesarCalcularDepreciaciones.getSelectedRows();
			
			ProcesarCalcularDepreciaciones procesarcalculardepreciacionesLocal=new ProcesarCalcularDepreciaciones();
			
			//this.seleccionarTodosProcesarCalcularDepreciaciones(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesarcalculardepreciacionesLocal =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesarcalculardepreciacionesLocal =(ProcesarCalcularDepreciaciones) this.procesarcalculardepreciacioness.toArray()[this.jTableDatosProcesarCalcularDepreciaciones.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesarcalculardepreciacionesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness()) {
						procesarcalculardepreciacionesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:procesarcalculardepreciacioness) {
						procesarcalculardepreciacionesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesarCalcularDepreciaciones(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesarCalcularDepreciaciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesarCalcularDepreciaciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesarCalcularDepreciaciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesarCalcularDepreciacionesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesarCalcularDepreciacionesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesarCalcularDepreciacionesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesarCalcularDepreciaciones.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:procesarcalculardepreciacioness) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesarCalcularDepreciaciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesarCalcularDepreciacionesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesarCalcularDepreciaciones=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesarCalcularDepreciaciones) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesarCalcularDepreciaciones(conSplash);
				
					this.generarReporteProcesarCalcularDepreciacionessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesarCalcularDepreciacionessSeleccionados();
				//this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesarCalcularDepreciacionessSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesarCalcularDepreciacionessSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesarCalcularDepreciaciones();
				
				this.exportarProcesarCalcularDepreciacionessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesarCalcularDepreciacioness();
				//this.importarProcesarCalcularDepreciacioness();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesarCalcularDepreciaciones();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesarCalcularDepreciacionessSeleccionados();
				//this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Procesar Calcular Depreciaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesarCalcularDepreciaciones();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesarCalcularDepreciaciones)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesarCalcularDepreciaciones(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Procesar Calcular Depreciaciones",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesarCalcularDepreciacionesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesarCalcularDepreciaciones) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesarCalcularDepreciaciones(conSplash);
					
						//this.actualizarParametrosGeneralProcesarCalcularDepreciaciones();
						
						this.generarReporteProcesoAccionProcesarCalcularDepreciacionessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Procesar Calcular DepreciacionesES SELECCIONADOS?", "MANTENIMIENTO DE Procesar Calcular Depreciaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesarCalcularDepreciaciones();
				
						this.actualizarParametrosGeneralProcesarCalcularDepreciaciones();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesarcalculardepreciacionesReturnGeneral=procesarcalculardepreciacionesLogic.procesarAccionProcesarCalcularDepreciacionessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness(),this.procesarcalculardepreciacionesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesarCalcularDepreciacionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesarCalcularDepreciaciones();
					
					ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesarCalcularDepreciacionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesarCalcularDepreciaciones(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesarCalcularDepreciacionesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesarCalcularDepreciaciones();
			
			if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessSeleccionados=new ArrayList<ProcesarCalcularDepreciaciones>();		
			ProcesarCalcularDepreciaciones procesarcalculardepreciaciones=new ProcesarCalcularDepreciaciones();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesarCalcularDepreciaciones.getSelectedItem();
			
			
			
			
			procesarcalculardepreciacionessSeleccionados=this.getProcesarCalcularDepreciacionessSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesarcalculardepreciacionessSeleccionados.size()==1) {
				for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:procesarcalculardepreciacionessSeleccionados) {
					procesarcalculardepreciaciones=procesarcalculardepreciacionesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesarCalcularDepreciaciones();
			
      		//this.finishProcessProcesarCalcularDepreciaciones(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesarCalcularDepreciacionesReturnGeneral() throws Exception {
		if(this.procesarcalculardepreciacionesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesarcalculardepreciacionesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesarcalculardepreciacionesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesarcalculardepreciacionesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesarcalculardepreciacionesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesarcalculardepreciacionesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false);
		}
		
		if(this.procesarcalculardepreciacionesReturnGeneral.getConRetornoLista() || this.procesarcalculardepreciacionesReturnGeneral.getConRetornoObjeto()) {
			if(this.procesarcalculardepreciacionesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesarcalculardepreciacionesLogic.setProcesarCalcularDepreciacioness(this.procesarcalculardepreciacionesReturnGeneral.getProcesarCalcularDepreciacioness());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesarCalcularDepreciaciones(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesarCalcularDepreciaciones() throws Exception {
		
		
	}
	
	public ArrayList<ProcesarCalcularDepreciaciones> getProcesarCalcularDepreciacionessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessSeleccionados=new ArrayList<ProcesarCalcularDepreciaciones>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesarCalcularDepreciaciones) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness()) {
					if(procesarcalculardepreciacionesAux.getIsSelected()) {
						procesarcalculardepreciacionessSeleccionados.add(procesarcalculardepreciacionesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:this.procesarcalculardepreciacioness) {
					if(procesarcalculardepreciacionesAux.getIsSelected()) {
						procesarcalculardepreciacionessSeleccionados.add(procesarcalculardepreciacionesAux);				
					}
				}
			}
			
			if(procesarcalculardepreciacionessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesarcalculardepreciacionessSeleccionados.addAll(this.procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesarcalculardepreciacionessSeleccionados.addAll(this.procesarcalculardepreciacioness);				
					}
				}
			}
		} else {
			procesarcalculardepreciacionessSeleccionados.add(this.procesarcalculardepreciaciones);
		}
		
		return procesarcalculardepreciacionessSeleccionados;
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
	
	public void generarReporteProcesarCalcularDepreciacionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesarCalcularDepreciacionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesarCalcularDepreciacionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesarCalcularDepreciacionessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesarCalcularDepreciacionessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Procesar Calcular Depreciaciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesarCalcularDepreciacionessSeleccionados() throws Exception {
		ArrayList<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessSeleccionados=new ArrayList<ProcesarCalcularDepreciaciones>();		
		
		procesarcalculardepreciacionessSeleccionados=this.getProcesarCalcularDepreciacionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesarCalcularDepreciacioness("Todos",procesarcalculardepreciacionessSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesarCalcularDepreciacionessSeleccionados() throws Exception {
		ArrayList<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessSeleccionados=new ArrayList<ProcesarCalcularDepreciaciones>();		
		
		procesarcalculardepreciacionessSeleccionados=this.getProcesarCalcularDepreciacionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesarCalcularDepreciacioness("Todos",procesarcalculardepreciacionessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesarCalcularDepreciacionessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessSeleccionados=new ArrayList<ProcesarCalcularDepreciaciones>();
		
		procesarcalculardepreciacionessSeleccionados=this.getProcesarCalcularDepreciacionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesarCalcularDepreciacioness("Todos",procesarcalculardepreciacionessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesarCalcularDepreciacionessSeleccionados() throws Exception {
		ArrayList<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessSeleccionados=new ArrayList<ProcesarCalcularDepreciaciones>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesarCalcularDepreciaciones();
		
		
		procesarcalculardepreciacionessSeleccionados=this.getProcesarCalcularDepreciacionessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesarCalcularDepreciaciones();
		
		
		//this.generarReporteProcesarCalcularDepreciacioness("Todos",procesarcalculardepreciacionessSeleccionados ,procesarcalculardepreciacionesImplementable,procesarcalculardepreciacionesImplementableHome);
	}
	
	public void mostrarImportacionProcesarCalcularDepreciacioness() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesarCalcularDepreciaciones();
		
		this.abrirFrameImportacionProcesarCalcularDepreciaciones();		
		
			
		//this.generarReporteProcesarCalcularDepreciacioness("Todos",procesarcalculardepreciacionessSeleccionados ,procesarcalculardepreciacionesImplementable,procesarcalculardepreciacionesImplementableHome);
	}
	
	public void importarProcesarCalcularDepreciacioness() throws Exception {		
	
	}
	
	public void exportarProcesarCalcularDepreciacionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesarCalcularDepreciacionessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesarCalcularDepreciacionessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesarCalcularDepreciacionessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Procesar Calcular Depreciaciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesarCalcularDepreciacionessSeleccionados() throws Exception {
		ArrayList<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessSeleccionados=new ArrayList<ProcesarCalcularDepreciaciones>();		
		
		procesarcalculardepreciacionessSeleccionados=this.getProcesarCalcularDepreciacionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarcalculardepreciaciones."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesarCalcularDepreciaciones(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:procesarcalculardepreciacionessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesarCalcularDepreciaciones(procesarcalculardepreciacionesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesarcalculardepreciacionesAux.setsDetalleGeneralEntityReporte(procesarcalculardepreciacionesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Calcular Depreciaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesarCalcularDepreciaciones(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesarcalculardepreciaciones.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesarcalculardepreciaciones.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesarcalculardepreciaciones.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesarcalculardepreciaciones.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesarcalculardepreciaciones.getdetallegrupoactivofijo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesarcalculardepreciaciones.getsubgrupoactivofijo_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesarCalcularDepreciacionessSeleccionados() throws Exception {
		ArrayList<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessSeleccionados=new ArrayList<ProcesarCalcularDepreciaciones>();		
		
		procesarcalculardepreciacionessSeleccionados=this.getProcesarCalcularDepreciacionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarcalculardepreciaciones.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesarCalcularDepreciacioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesarCalcularDepreciaciones(row);				
				iRow++;
			}				
			
			for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:procesarcalculardepreciacionessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesarCalcularDepreciaciones(procesarcalculardepreciacionesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Calcular Depreciaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesarCalcularDepreciacionessSeleccionados() throws Exception {
		ArrayList<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessSeleccionados=new ArrayList<ProcesarCalcularDepreciaciones>();		
		
		procesarcalculardepreciacionessSeleccionados=this.getProcesarCalcularDepreciacionessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarcalculardepreciaciones.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesarcalculardepreciacioness");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesarcalculardepreciaciones");
			//elementRoot.appendChild(element);
		
			for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:procesarcalculardepreciacionessSeleccionados) {
				element = document.createElement("procesarcalculardepreciaciones");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesarCalcularDepreciaciones(procesarcalculardepreciacionesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Calcular Depreciaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesarCalcularDepreciaciones(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesarcalculardepreciaciones.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesarcalculardepreciaciones.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesarcalculardepreciaciones.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesarcalculardepreciaciones.getdetallegrupoactivofijo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesarcalculardepreciaciones.getsubgrupoactivofijo_descripcion());				
	}
	
	public void setFilaDatosExportarXmlProcesarCalcularDepreciaciones(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesarCalcularDepreciacionesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesarcalculardepreciaciones.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesarCalcularDepreciacionesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesarcalculardepreciaciones.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementanio_descripcion = document.createElement(ProcesarCalcularDepreciacionesConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(procesarcalculardepreciaciones.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(ProcesarCalcularDepreciacionesConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(procesarcalculardepreciaciones.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementdetallegrupoactivofijo_descripcion = document.createElement(ProcesarCalcularDepreciacionesConstantesFunciones.IDDETALLEGRUPOACTIVOFIJO);
		elementdetallegrupoactivofijo_descripcion.appendChild(document.createTextNode(procesarcalculardepreciaciones.getdetallegrupoactivofijo_descripcion()));
		element.appendChild(elementdetallegrupoactivofijo_descripcion);

		Element elementsubgrupoactivofijo_descripcion = document.createElement(ProcesarCalcularDepreciacionesConstantesFunciones.IDSUBGRUPOACTIVOFIJO);
		elementsubgrupoactivofijo_descripcion.appendChild(document.createTextNode(procesarcalculardepreciaciones.getsubgrupoactivofijo_descripcion()));
		element.appendChild(elementsubgrupoactivofijo_descripcion);
	}
	
	public void generarReporteGroupGenericoProcesarCalcularDepreciacionessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessSeleccionados=new ArrayList<ProcesarCalcularDepreciaciones>();
		
		procesarcalculardepreciacionessSeleccionados=this.getProcesarCalcularDepreciacionessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesarCalcularDepreciaciones(procesarcalculardepreciacionessSeleccionados);
		
		this.generarReporteProcesarCalcularDepreciacioness("Todos",procesarcalculardepreciacionessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesarCalcularDepreciaciones(ArrayList<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesarCalcularDepreciaciones procesarcalculardepreciacionesAux:procesarcalculardepreciacionessSeleccionados) {
				procesarcalculardepreciacionesAux.setsDetalleGeneralEntityReporte(procesarcalculardepreciacionesAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					procesarcalculardepreciacionesAux.setsDescripcionGeneralEntityReporte1(procesarcalculardepreciacionesAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					procesarcalculardepreciacionesAux.setsDescripcionGeneralEntityReporte1(procesarcalculardepreciacionesAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO)) {
					existe=true;
					procesarcalculardepreciacionesAux.setsDescripcionGeneralEntityReporte1(procesarcalculardepreciacionesAux.getdetallegrupoactivofijo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO)) {
					existe=true;
					procesarcalculardepreciacionesAux.setsDescripcionGeneralEntityReporte1(procesarcalculardepreciacionesAux.getsubgrupoactivofijo_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesarCalcularDepreciaciones(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones=true;
				this.isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones=true;
			}
			
			this.isVisibilidadCeldaModificarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaModificarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones=true;
			this.isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaModificarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones=true;
			this.isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones=true;
			this.isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaModificarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones=true;
			this.isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones=true;
			this.isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones=true;
			this.isVisibilidadCeldaModificarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaModificarProcesarCalcularDepreciaciones=true;
			this.isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesarCalcularDepreciacionesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones=true;
			this.isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones=true;
		} else {
			this.actualizarEstadoPanelsProcesarCalcularDepreciaciones(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesarCalcularDepreciaciones=false;
			//this.isVisibilidadCeldaVerFormProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaDuplicarProcesarCalcularDepreciaciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
			if(!procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones=false;												
			}
			
			this.jButtonCerrarProcesarCalcularDepreciaciones.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.procesarcalculardepreciaciones)) {
			this.isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones=false;
			this.isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesarCalcularDepreciaciones=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesarCalcularDepreciaciones=false;
		this.isVisibilidadCeldaGuardarCambiosProcesarCalcularDepreciaciones=false;
		//this.isVisibilidadCeldaModificarProcesarCalcularDepreciaciones=true;
		this.isVisibilidadCeldaActualizarProcesarCalcularDepreciaciones=false;
		this.isVisibilidadCeldaEliminarProcesarCalcularDepreciaciones=false;
		//this.isVisibilidadCeldaCancelarProcesarCalcularDepreciaciones=true;			
		this.isVisibilidadCeldaGuardarProcesarCalcularDepreciaciones=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesarCalcularDepreciaciones() {
	}
	
	public void actualizarEstadoPanelsProcesarCalcularDepreciaciones(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones!=null) {
				this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones!=null) {
				this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesarCalcularDepreciaciones!=null) {
				this.jScrollPanelDatosProcesarCalcularDepreciaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesarCalcularDepreciaciones!=null) {
				this.jPanelPaginacionProcesarCalcularDepreciaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesarCalcularDepreciaciones!=null) {
				this.jPanelParametrosReportesProcesarCalcularDepreciaciones.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones!=null) {
				this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones!=null) {
				this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesarCalcularDepreciaciones!=null) {
				this.jScrollPanelDatosProcesarCalcularDepreciaciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesarCalcularDepreciaciones!=null) {
				this.jPanelPaginacionProcesarCalcularDepreciaciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesarCalcularDepreciaciones!=null) {
				this.jPanelParametrosReportesProcesarCalcularDepreciaciones.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones!=null) {
				this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones!=null) {
				this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesarCalcularDepreciaciones!=null) {
				this.jScrollPanelDatosProcesarCalcularDepreciaciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesarCalcularDepreciaciones!=null) {
				this.jPanelPaginacionProcesarCalcularDepreciaciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesarCalcularDepreciaciones!=null) {
				this.jPanelParametrosReportesProcesarCalcularDepreciaciones.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones!=null) {
				this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones!=null) {
				this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesarCalcularDepreciaciones!=null) {
				this.jScrollPanelDatosProcesarCalcularDepreciaciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesarCalcularDepreciaciones!=null) {
				this.jPanelPaginacionProcesarCalcularDepreciaciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesarCalcularDepreciaciones!=null) {
				this.jPanelParametrosReportesProcesarCalcularDepreciaciones.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones!=null) {
				this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones!=null) {
				this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesarCalcularDepreciaciones!=null) {
				this.jScrollPanelDatosProcesarCalcularDepreciaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesarCalcularDepreciaciones!=null) {
				this.jPanelPaginacionProcesarCalcularDepreciaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesarCalcularDepreciaciones!=null) {
				this.jPanelParametrosReportesProcesarCalcularDepreciaciones.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones!=null) {
				this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones!=null) {
				this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesarCalcularDepreciaciones!=null) {
				this.jScrollPanelDatosProcesarCalcularDepreciaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesarCalcularDepreciaciones!=null) {
				this.jPanelPaginacionProcesarCalcularDepreciaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesarCalcularDepreciaciones!=null) {
				this.jPanelParametrosReportesProcesarCalcularDepreciaciones.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones!=null) {
				this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones!=null) {
				this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesarCalcularDepreciaciones!=null) {
				this.jScrollPanelDatosProcesarCalcularDepreciaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesarCalcularDepreciaciones!=null) {
				this.jPanelPaginacionProcesarCalcularDepreciaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesarCalcularDepreciaciones!=null) {
				this.jPanelParametrosReportesProcesarCalcularDepreciaciones.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones!=null) {
					this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesarCalcularDepreciaciones!=null) {
				this.jPanelParametrosReportesProcesarCalcularDepreciaciones.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones!=null) {
				this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesarCalcularDepreciaciones!=null) {
				this.jPanelParametrosReportesProcesarCalcularDepreciaciones.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadBusquedaProcesarCalcularDepreciaciones=isParaAnio;
			if(!this.isVisibilidadBusquedaProcesarCalcularDepreciaciones) {this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.remove(jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadBusquedaProcesarCalcularDepreciaciones=isParaMes;
			if(!this.isVisibilidadBusquedaProcesarCalcularDepreciaciones) {this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.remove(jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaDetalleGrupoActivoFijo(Boolean isParaDetalleGrupoActivoFijo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDetalleGrupoActivoFijoNegation=!isParaDetalleGrupoActivoFijo;

			this.isVisibilidadBusquedaProcesarCalcularDepreciaciones=isParaDetalleGrupoActivoFijo;
			if(!this.isVisibilidadBusquedaProcesarCalcularDepreciaciones) {this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.remove(jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaSubGrupoActivoFijo(Boolean isParaSubGrupoActivoFijo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSubGrupoActivoFijoNegation=!isParaSubGrupoActivoFijo;

			this.isVisibilidadBusquedaProcesarCalcularDepreciaciones=isParaSubGrupoActivoFijo;
			if(!this.isVisibilidadBusquedaProcesarCalcularDepreciaciones) {this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.remove(jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones);}
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
			
			this.inicializarActualizarBindingTablaProcesarCalcularDepreciaciones(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesarCalcularDepreciaciones() {
		this.updateBorderResaltarBusquedasFormularioProcesarCalcularDepreciaciones();
		this.updateVisibilidadBusquedasFormularioProcesarCalcularDepreciaciones();
		this.updateHabilitarBusquedasFormularioProcesarCalcularDepreciaciones();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesarCalcularDepreciaciones() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.getComponents().length>0) {
	

		if(this.procesarcalculardepreciacionesConstantesFunciones.resaltarBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones!=null) {
			index= this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.indexOfComponent(this.jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.getComponent(index);
				jPanel.setBorder(this.procesarcalculardepreciacionesConstantesFunciones.resaltarBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesarCalcularDepreciaciones() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.indexOfComponent(this.jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesarcalculardepreciacionesConstantesFunciones.mostrarBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones);
			if(!this.procesarcalculardepreciacionesConstantesFunciones.mostrarBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones && index>-1) {
				this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesarCalcularDepreciaciones() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.indexOfComponent(this.jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesarcalculardepreciacionesConstantesFunciones.activarBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones);
				this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setEnabledAt(index,this.procesarcalculardepreciacionesConstantesFunciones.activarBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesarCalcularDepreciaciones(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesarCalcularDepreciaciones")) {
			index= this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.indexOfComponent(this.jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones);

			this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.getComponent(index);

			this.procesarcalculardepreciacionesConstantesFunciones.setResaltarBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones(resaltar);

			jPanel.setBorder(this.procesarcalculardepreciacionesConstantesFunciones.resaltarBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesarCalcularDepreciaciones.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesarCalcularDepreciaciones() throws Exception {

		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesarCalcularDepreciaciones();
		this.updateVisibilidadResaltarControlesFormularioProcesarCalcularDepreciaciones();
		this.updateHabilitarResaltarControlesFormularioProcesarCalcularDepreciaciones();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesarCalcularDepreciaciones() throws Exception {
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesarcalculardepreciacionesConstantesFunciones.resaltaridProcesarCalcularDepreciaciones!=null && this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelidProcesarCalcularDepreciaciones.setBorder(this.procesarcalculardepreciacionesConstantesFunciones.resaltaridProcesarCalcularDepreciaciones);}
		if(this.procesarcalculardepreciacionesConstantesFunciones.resaltarid_anioProcesarCalcularDepreciaciones!=null && this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_anioProcesarCalcularDepreciaciones.setBorder(this.procesarcalculardepreciacionesConstantesFunciones.resaltarid_anioProcesarCalcularDepreciaciones);}
		if(this.procesarcalculardepreciacionesConstantesFunciones.resaltarid_mesProcesarCalcularDepreciaciones!=null && this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_mesProcesarCalcularDepreciaciones.setBorder(this.procesarcalculardepreciacionesConstantesFunciones.resaltarid_mesProcesarCalcularDepreciaciones);}
		if(this.procesarcalculardepreciacionesConstantesFunciones.resaltarid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones!=null && this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setBorder(this.procesarcalculardepreciacionesConstantesFunciones.resaltarid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones);}
		if(this.procesarcalculardepreciacionesConstantesFunciones.resaltarid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones!=null && this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setBorder(this.procesarcalculardepreciacionesConstantesFunciones.resaltarid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesarCalcularDepreciaciones() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
	
		//this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelidProcesarCalcularDepreciaciones.setVisible(this.procesarcalculardepreciacionesConstantesFunciones.mostraridProcesarCalcularDepreciaciones);
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jPanelidProcesarCalcularDepreciaciones.setVisible(this.procesarcalculardepreciacionesConstantesFunciones.mostraridProcesarCalcularDepreciaciones);
		//this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_anioProcesarCalcularDepreciaciones.setVisible(this.procesarcalculardepreciacionesConstantesFunciones.mostrarid_anioProcesarCalcularDepreciaciones);
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jPanelid_anioProcesarCalcularDepreciaciones.setVisible(this.procesarcalculardepreciacionesConstantesFunciones.mostrarid_anioProcesarCalcularDepreciaciones);
		//this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_mesProcesarCalcularDepreciaciones.setVisible(this.procesarcalculardepreciacionesConstantesFunciones.mostrarid_mesProcesarCalcularDepreciaciones);
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jPanelid_mesProcesarCalcularDepreciaciones.setVisible(this.procesarcalculardepreciacionesConstantesFunciones.mostrarid_mesProcesarCalcularDepreciaciones);
		//this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setVisible(this.procesarcalculardepreciacionesConstantesFunciones.mostrarid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones);
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jPanelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setVisible(this.procesarcalculardepreciacionesConstantesFunciones.mostrarid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones);
		//this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setVisible(this.procesarcalculardepreciacionesConstantesFunciones.mostrarid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones);
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jPanelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setVisible(this.procesarcalculardepreciacionesConstantesFunciones.mostrarid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesarCalcularDepreciaciones() throws Exception {
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones!=null) {
	
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jLabelidProcesarCalcularDepreciaciones.setEnabled(this.procesarcalculardepreciacionesConstantesFunciones.activaridProcesarCalcularDepreciaciones);
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_anioProcesarCalcularDepreciaciones.setEnabled(this.procesarcalculardepreciacionesConstantesFunciones.activarid_anioProcesarCalcularDepreciaciones);
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_mesProcesarCalcularDepreciaciones.setEnabled(this.procesarcalculardepreciacionesConstantesFunciones.activarid_mesProcesarCalcularDepreciaciones);
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setEnabled(this.procesarcalculardepreciacionesConstantesFunciones.activarid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones);
		this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones.jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setEnabled(this.procesarcalculardepreciacionesConstantesFunciones.activarid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones);
		}
	}
	
		
}