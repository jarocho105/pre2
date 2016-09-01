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

import com.bydan.erp.contabilidad.util.TipoParametroFormularioIvaConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoParametroFormularioIvaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoParametroFormularioIvaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoParametroFormularioIvaBean;
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
public class TipoParametroFormularioIvaBeanSwingJInternalFrame extends TipoParametroFormularioIvaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoParametroFormularioIvaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoParametroFormularioIva> tipoparametroformularioivaValidator = new ClassValidator<TipoParametroFormularioIva>(TipoParametroFormularioIva.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoParametroFormularioIva tipoparametroformularioiva;	
	public TipoParametroFormularioIva tipoparametroformularioivaAux;
	public TipoParametroFormularioIva tipoparametroformularioivaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoParametroFormularioIva tipoparametroformularioivaTotales;
	public Long idTipoParametroFormularioIvaActual;
	public Long iIdNuevoTipoParametroFormularioIva=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosParametroFormularioIva=false;

	public Boolean getIsTienePermisosParametroFormularioIva() {
		return isTienePermisosParametroFormularioIva;
	}

	public void setIsTienePermisosParametroFormularioIva(Boolean isTienePermisosParametroFormularioIva) {
		this.isTienePermisosParametroFormularioIva= isTienePermisosParametroFormularioIva;
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
	
	public Boolean isPermisoTodoTipoParametroFormularioIva;
	public Boolean isPermisoNuevoTipoParametroFormularioIva;
	public Boolean isPermisoActualizarTipoParametroFormularioIva;
	public Boolean isPermisoActualizarOriginalTipoParametroFormularioIva;
	public Boolean isPermisoEliminarTipoParametroFormularioIva;
	public Boolean isPermisoGuardarCambiosTipoParametroFormularioIva;
	public Boolean isPermisoConsultaTipoParametroFormularioIva;
	public Boolean isPermisoBusquedaTipoParametroFormularioIva;
	public Boolean isPermisoReporteTipoParametroFormularioIva;
	public Boolean isPermisoPaginacionMedioTipoParametroFormularioIva;
	public Boolean isPermisoPaginacionAltoTipoParametroFormularioIva;
	public Boolean isPermisoPaginacionTodoTipoParametroFormularioIva;
	public Boolean isPermisoCopiarTipoParametroFormularioIva;
	public Boolean isPermisoVerFormTipoParametroFormularioIva;
	public Boolean isPermisoDuplicarTipoParametroFormularioIva;
	public Boolean isPermisoOrdenTipoParametroFormularioIva;
	
	
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
	
	public TipoParametroFormularioIvaParameterReturnGeneral tipoparametroformularioivaReturnGeneral;
	public TipoParametroFormularioIvaParameterReturnGeneral tipoparametroformularioivaParameterGeneral;
	
	

	public ParametroFormularioIvaLogic parametroformularioivaLogic=null;

	public ParametroFormularioIvaLogic getParametroFormularioIvaLogic() {
		return parametroformularioivaLogic;
	}

	public void setParametroFormularioIvaLogic(ParametroFormularioIvaLogic parametroformularioivaLogic) {
		this.parametroformularioivaLogic = parametroformularioivaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoParametroFormularioIva=false;
	public Boolean esParaAccionDesdeFormularioTipoParametroFormularioIva=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoParametroFormularioIvaSessionBeanAdditional tipoparametroformularioivaSessionBeanAdditional=null;
	
	public TipoParametroFormularioIvaSessionBeanAdditional getTipoParametroFormularioIvaSessionBeanAdditional() {
		return this.tipoparametroformularioivaSessionBeanAdditional;
	}
	
	public void setTipoParametroFormularioIvaSessionBeanAdditional(TipoParametroFormularioIvaSessionBeanAdditional tipoparametroformularioivaSessionBeanAdditional) {
		try {
			this.tipoparametroformularioivaSessionBeanAdditional=tipoparametroformularioivaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional tipoparametroformularioivaBeanSwingJInternalFrameAdditional=null;
	//public class TipoParametroFormularioIvaBeanSwingJInternalFrame
	
	public TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional getTipoParametroFormularioIvaBeanSwingJInternalFrameAdditional() {
		return this.tipoparametroformularioivaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoParametroFormularioIvaBeanSwingJInternalFrameAdditional(TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional tipoparametroformularioivaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoparametroformularioivaBeanSwingJInternalFrameAdditional=tipoparametroformularioivaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoParametroFormularioIvaLogic tipoparametroformularioivaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoParametroFormularioIva tipoparametroformularioivaBean;
	public TipoParametroFormularioIvaConstantesFunciones tipoparametroformularioivaConstantesFunciones;
	//public TipoParametroFormularioIvaParameterReturnGeneral tipoparametroformularioivaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoParametroFormularioIva> tipoparametroformularioivas;	
	//public List<TipoParametroFormularioIva> tipoparametroformularioivasEliminados;
	//public List<TipoParametroFormularioIva> tipoparametroformularioivasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoParametroFormularioIva=false;
	public Boolean isVisibilidadCeldaDuplicarTipoParametroFormularioIva=true;
	public Boolean isVisibilidadCeldaCopiarTipoParametroFormularioIva=true;
	public Boolean isVisibilidadCeldaVerFormTipoParametroFormularioIva=true;
	public Boolean isVisibilidadCeldaOrdenTipoParametroFormularioIva=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva=false;
	public Boolean isVisibilidadCeldaModificarTipoParametroFormularioIva=false;
	public Boolean isVisibilidadCeldaActualizarTipoParametroFormularioIva=false;
	public Boolean isVisibilidadCeldaEliminarTipoParametroFormularioIva=false;
	public Boolean isVisibilidadCeldaCancelarTipoParametroFormularioIva=false;
	public Boolean isVisibilidadCeldaGuardarTipoParametroFormularioIva=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva=false;	
	
	
	
	public Long getiIdNuevoTipoParametroFormularioIva() {
		return this.iIdNuevoTipoParametroFormularioIva;
	}

	public void setiIdNuevoTipoParametroFormularioIva(Long iIdNuevoTipoParametroFormularioIva) {
		this.iIdNuevoTipoParametroFormularioIva = iIdNuevoTipoParametroFormularioIva;
	}
	
	public Long getidTipoParametroFormularioIvaActual() {
		return this.idTipoParametroFormularioIvaActual;
	}

	public void setidTipoParametroFormularioIvaActual(Long idTipoParametroFormularioIvaActual) {
		this.idTipoParametroFormularioIvaActual = idTipoParametroFormularioIvaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoParametroFormularioIva gettipoparametroformularioiva() {
		return this.tipoparametroformularioiva;
	}

	public void settipoparametroformularioiva(TipoParametroFormularioIva tipoparametroformularioiva) {
		this.tipoparametroformularioiva = tipoparametroformularioiva;
	}
	
	public TipoParametroFormularioIva gettipoparametroformularioivaAux() {
		return this.tipoparametroformularioivaAux;
	}

	public void settipoparametroformularioivaAux(TipoParametroFormularioIva tipoparametroformularioivaAux) {
		this.tipoparametroformularioivaAux = tipoparametroformularioivaAux;
	}				
	
	public TipoParametroFormularioIva gettipoparametroformularioivaAnterior() {
		return this.tipoparametroformularioivaAnterior;
	}

	public void settipoparametroformularioivaAnterior(TipoParametroFormularioIva tipoparametroformularioivaAnterior) {
		this.tipoparametroformularioivaAnterior = tipoparametroformularioivaAnterior;
	}	
	
	public TipoParametroFormularioIva gettipoparametroformularioivaTotales() {
		return this.tipoparametroformularioivaTotales;
	}

	public void settipoparametroformularioivaTotales(TipoParametroFormularioIva tipoparametroformularioivaTotales) {
		this.tipoparametroformularioivaTotales = tipoparametroformularioivaTotales;
	}	
	
	public TipoParametroFormularioIva gettipoparametroformularioivaBean() {
		return this.tipoparametroformularioivaBean;
	}

	public void settipoparametroformularioivaBean(TipoParametroFormularioIva tipoparametroformularioivaBean) {
		this.tipoparametroformularioivaBean = tipoparametroformularioivaBean;
	}	
	
	public TipoParametroFormularioIvaParameterReturnGeneral gettipoparametroformularioivaReturnGeneral() {
		return this.tipoparametroformularioivaReturnGeneral;
	}

	public void settipoparametroformularioivaReturnGeneral(TipoParametroFormularioIvaParameterReturnGeneral tipoparametroformularioivaReturnGeneral) {
		this.tipoparametroformularioivaReturnGeneral = tipoparametroformularioivaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoParametroFormularioIvaLogic getTipoParametroFormularioIvaLogic()	{		
		return tipoparametroformularioivaLogic;
	}

	public void setTipoParametroFormularioIvaLogic(TipoParametroFormularioIvaLogic tipoparametroformularioivaLogic) {
		this.tipoparametroformularioivaLogic = tipoparametroformularioivaLogic;
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
	
	public Boolean getIsEsNuevoTipoParametroFormularioIva() {
		return isEsNuevoTipoParametroFormularioIva;
	}

	public void setIsEsNuevoTipoParametroFormularioIva(Boolean isEsNuevoTipoParametroFormularioIva) {
		this.isEsNuevoTipoParametroFormularioIva = isEsNuevoTipoParametroFormularioIva;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoParametroFormularioIva() {
		return esParaAccionDesdeFormularioTipoParametroFormularioIva;
	}
	
	public void setEsParaAccionDesdeFormularioTipoParametroFormularioIva(Boolean esParaAccionDesdeFormularioTipoParametroFormularioIva) {
		this.esParaAccionDesdeFormularioTipoParametroFormularioIva = esParaAccionDesdeFormularioTipoParametroFormularioIva;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoParametroFormularioIva() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoParametroFormularioIvaConstantesFunciones.refrescarForeignKeysDescripcionesTipoParametroFormularioIva(this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoParametroFormularioIvaConstantesFunciones.refrescarForeignKeysDescripcionesTipoParametroFormularioIva(this.tipoparametroformularioivas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoparametroformularioivaLogic.setTipoParametroFormularioIvas(this.tipoparametroformularioivas);
			tipoparametroformularioivaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoParametroFormularioIvaParameterReturnGeneral getTipoParametroFormularioIvaParameterGeneral() {
		return this.tipoparametroformularioivaParameterGeneral;
	}
	
	public void setTipoParametroFormularioIvaParameterGeneral(TipoParametroFormularioIvaParameterReturnGeneral tipoparametroformularioivaParameterGeneral) {
		this.tipoparametroformularioivaParameterGeneral = tipoparametroformularioivaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoParametroFormularioIva() {
		return isPermisoTodoTipoParametroFormularioIva;
	}

	public void setIsPermisoTodoTipoParametroFormularioIva(Boolean isPermisoTodoTipoParametroFormularioIva) {
		this.isPermisoTodoTipoParametroFormularioIva = isPermisoTodoTipoParametroFormularioIva;
	}

	public Boolean getIsPermisoNuevoTipoParametroFormularioIva() {
		return isPermisoNuevoTipoParametroFormularioIva;
	}

	public void setIsPermisoNuevoTipoParametroFormularioIva(Boolean isPermisoNuevoTipoParametroFormularioIva) {
		this.isPermisoNuevoTipoParametroFormularioIva = isPermisoNuevoTipoParametroFormularioIva;
	}

	public Boolean getIsPermisoActualizarTipoParametroFormularioIva() {
		return isPermisoActualizarTipoParametroFormularioIva;
	}

	public void setIsPermisoActualizarTipoParametroFormularioIva(Boolean isPermisoActualizarTipoParametroFormularioIva) {
		this.isPermisoActualizarTipoParametroFormularioIva = isPermisoActualizarTipoParametroFormularioIva;
	}

	public Boolean getIsPermisoEliminarTipoParametroFormularioIva() {
		return isPermisoEliminarTipoParametroFormularioIva;
	}

	public void setIsPermisoEliminarTipoParametroFormularioIva(Boolean isPermisoEliminarTipoParametroFormularioIva) {
		this.isPermisoEliminarTipoParametroFormularioIva = isPermisoEliminarTipoParametroFormularioIva;
	}

	public Boolean getIsPermisoGuardarCambiosTipoParametroFormularioIva() {
		return isPermisoGuardarCambiosTipoParametroFormularioIva;
	}

	public void setIsPermisoGuardarCambiosTipoParametroFormularioIva(Boolean isPermisoGuardarCambiosTipoParametroFormularioIva) {
		this.isPermisoGuardarCambiosTipoParametroFormularioIva = isPermisoGuardarCambiosTipoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoConsultaTipoParametroFormularioIva() {
		return isPermisoConsultaTipoParametroFormularioIva;
	}

	public void setIsPermisoConsultaTipoParametroFormularioIva(Boolean isPermisoConsultaTipoParametroFormularioIva) {
		this.isPermisoConsultaTipoParametroFormularioIva = isPermisoConsultaTipoParametroFormularioIva;
	}

	public Boolean getIsPermisoBusquedaTipoParametroFormularioIva() {
		return isPermisoBusquedaTipoParametroFormularioIva;
	}

	public void setIsPermisoBusquedaTipoParametroFormularioIva(Boolean isPermisoBusquedaTipoParametroFormularioIva) {
		this.isPermisoBusquedaTipoParametroFormularioIva = isPermisoBusquedaTipoParametroFormularioIva;
	}

	public Boolean getIsPermisoReporteTipoParametroFormularioIva() {
		return isPermisoReporteTipoParametroFormularioIva;
	}

	public void setIsPermisoReporteTipoParametroFormularioIva(Boolean isPermisoReporteTipoParametroFormularioIva) {
		this.isPermisoReporteTipoParametroFormularioIva = isPermisoReporteTipoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoParametroFormularioIva() {
		return isPermisoPaginacionMedioTipoParametroFormularioIva;
	}

	public void setIsPermisoPaginacionMedioTipoParametroFormularioIva(Boolean isPermisoPaginacionMedioTipoParametroFormularioIva) {
		this.isPermisoPaginacionMedioTipoParametroFormularioIva = isPermisoPaginacionMedioTipoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoParametroFormularioIva() {
		return isPermisoPaginacionTodoTipoParametroFormularioIva;
	}

	public void setIsPermisoPaginacionTodoTipoParametroFormularioIva(Boolean isPermisoPaginacionTodoTipoParametroFormularioIva) {
		this.isPermisoPaginacionTodoTipoParametroFormularioIva = isPermisoPaginacionTodoTipoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoParametroFormularioIva() {
		return isPermisoPaginacionAltoTipoParametroFormularioIva;
	}

	public void setIsPermisoPaginacionAltoTipoParametroFormularioIva(Boolean isPermisoPaginacionAltoTipoParametroFormularioIva) {
		this.isPermisoPaginacionAltoTipoParametroFormularioIva = isPermisoPaginacionAltoTipoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoCopiarTipoParametroFormularioIva() {
		return isPermisoCopiarTipoParametroFormularioIva;
	}

	public void setIsPermisoCopiarTipoParametroFormularioIva(Boolean isPermisoCopiarTipoParametroFormularioIva) {
		this.isPermisoCopiarTipoParametroFormularioIva = isPermisoCopiarTipoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoVerFormTipoParametroFormularioIva() {
		return isPermisoVerFormTipoParametroFormularioIva;
	}

	public void setIsPermisoVerFormTipoParametroFormularioIva(Boolean isPermisoVerFormTipoParametroFormularioIva) {
		this.isPermisoVerFormTipoParametroFormularioIva = isPermisoVerFormTipoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoDuplicarTipoParametroFormularioIva() {
		return isPermisoDuplicarTipoParametroFormularioIva;
	}

	public void setIsPermisoDuplicarTipoParametroFormularioIva(Boolean isPermisoDuplicarTipoParametroFormularioIva) {
		this.isPermisoDuplicarTipoParametroFormularioIva = isPermisoDuplicarTipoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoOrdenTipoParametroFormularioIva() {
		return isPermisoOrdenTipoParametroFormularioIva;
	}

	public void setIsPermisoOrdenTipoParametroFormularioIva(Boolean isPermisoOrdenTipoParametroFormularioIva) {
		this.isPermisoOrdenTipoParametroFormularioIva = isPermisoOrdenTipoParametroFormularioIva;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoParametroFormularioIva() {
		return isVisibilidadCeldaNuevoTipoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaNuevoTipoParametroFormularioIva(Boolean isVisibilidadCeldaNuevoTipoParametroFormularioIva) {
		this.isVisibilidadCeldaNuevoTipoParametroFormularioIva = isVisibilidadCeldaNuevoTipoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoParametroFormularioIva() {
		return isVisibilidadCeldaDuplicarTipoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaDuplicarTipoParametroFormularioIva(Boolean isVisibilidadCeldaDuplicarTipoParametroFormularioIva) {
		this.isVisibilidadCeldaDuplicarTipoParametroFormularioIva = isVisibilidadCeldaDuplicarTipoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoParametroFormularioIva() {
		return isVisibilidadCeldaCopiarTipoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaCopiarTipoParametroFormularioIva(Boolean isVisibilidadCeldaCopiarTipoParametroFormularioIva) {
		this.isVisibilidadCeldaCopiarTipoParametroFormularioIva = isVisibilidadCeldaCopiarTipoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoParametroFormularioIva() {
		return isVisibilidadCeldaVerFormTipoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaVerFormTipoParametroFormularioIva(Boolean isVisibilidadCeldaVerFormTipoParametroFormularioIva) {
		this.isVisibilidadCeldaVerFormTipoParametroFormularioIva = isVisibilidadCeldaVerFormTipoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoParametroFormularioIva() {
		return isVisibilidadCeldaOrdenTipoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaOrdenTipoParametroFormularioIva(Boolean isVisibilidadCeldaOrdenTipoParametroFormularioIva) {
		this.isVisibilidadCeldaOrdenTipoParametroFormularioIva = isVisibilidadCeldaOrdenTipoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva() {
		return isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva(Boolean isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva) {
		this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva = isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoParametroFormularioIva() {
		return isVisibilidadCeldaModificarTipoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaModificarTipoParametroFormularioIva(Boolean isVisibilidadCeldaModificarTipoParametroFormularioIva) {
		this.isVisibilidadCeldaModificarTipoParametroFormularioIva = isVisibilidadCeldaModificarTipoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoParametroFormularioIva() {
		return isVisibilidadCeldaActualizarTipoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaActualizarTipoParametroFormularioIva(Boolean isVisibilidadCeldaActualizarTipoParametroFormularioIva) {
		this.isVisibilidadCeldaActualizarTipoParametroFormularioIva = isVisibilidadCeldaActualizarTipoParametroFormularioIva;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoParametroFormularioIva() {
		return isVisibilidadCeldaEliminarTipoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaEliminarTipoParametroFormularioIva(Boolean isVisibilidadCeldaEliminarTipoParametroFormularioIva) {
		this.isVisibilidadCeldaEliminarTipoParametroFormularioIva = isVisibilidadCeldaEliminarTipoParametroFormularioIva;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoParametroFormularioIva() {
		return isVisibilidadCeldaCancelarTipoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaCancelarTipoParametroFormularioIva(Boolean isVisibilidadCeldaCancelarTipoParametroFormularioIva) {
		this.isVisibilidadCeldaCancelarTipoParametroFormularioIva = isVisibilidadCeldaCancelarTipoParametroFormularioIva;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoParametroFormularioIva() {
		return isVisibilidadCeldaGuardarTipoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaGuardarTipoParametroFormularioIva(Boolean isVisibilidadCeldaGuardarTipoParametroFormularioIva) {
		this.isVisibilidadCeldaGuardarTipoParametroFormularioIva = isVisibilidadCeldaGuardarTipoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva() {
		return isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva(Boolean isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva) {
		this.isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva = isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva;
	}
		
	public TipoParametroFormularioIvaSessionBean gettipoparametroformularioivaSessionBean() {
		return this.tipoparametroformularioivaSessionBean;
	}
	
	public void settipoparametroformularioivaSessionBean(TipoParametroFormularioIvaSessionBean tipoparametroformularioivaSessionBean) {
		this.tipoparametroformularioivaSessionBean=tipoparametroformularioivaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioiva)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(TipoParametroFormularioIva tipoparametroformularioiva,TipoParametroFormularioIva tipoparametroformularioivaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoParametroFormularioIva(tipoparametroformularioiva);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoparametroformularioivaAux.setId(tipoparametroformularioiva.getId());
		tipoparametroformularioivaAux.setVersionRow(tipoparametroformularioiva.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoParametroFormularioIva();
		
			int intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoParametroFormularioIva(this.tipoparametroformularioiva,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroFormularioIva(this.tipoparametroformularioiva);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoparametroformularioivaValidator.getInvalidValues(this.tipoparametroformularioiva);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoparametroformularioivaLogic.setDatosCliente(datosCliente);
			tipoparametroformularioivaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoparametroformularioivaAux=new  TipoParametroFormularioIva();
				
				tipoparametroformularioivaAux.setIsNew(true);
				tipoparametroformularioivaAux.setIsChanged(true);
				
				tipoparametroformularioivaAux.setTipoParametroFormularioIvaOriginal(this.tipoparametroformularioiva);
				
				tipoparametroformularioivaAux.setId(this.tipoparametroformularioiva.getId());	
				tipoparametroformularioivaAux.setVersionRow(this.tipoparametroformularioiva.getVersionRow());	
				tipoparametroformularioivaAux.setnombre(this.tipoparametroformularioiva.getnombre());	
				tipoparametroformularioivaAux.setcodigo_sri(this.tipoparametroformularioiva.getcodigo_sri());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoparametroformularioivaAux,tipoparametroformularioivaLogic.getTipoParametroFormularioIvas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparametroformularioivaAux,tipoparametroformularioivas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparametroformularioivaLogic.saveTipoParametroFormularioIvas();//WithConnection
						//tipoparametroformularioivaLogic.getSetVersionRowTipoParametroFormularioIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoparametroformularioiva,tipoparametroformularioivaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.getParametroFormularioIvas().addAll(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivas.addAll(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formulariorentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formulariorentaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formulariorentaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formularioivaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formularioivaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formulariorentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formulariorentaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formulariorentaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formularioivaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formularioivaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoparametroformularioivaLogic.saveTipoParametroFormularioIvaRelaciones(tipoparametroformularioivaAux,this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.getParametroFormularioIvas());//WithConnection
								//tipoparametroformularioivaLogic.getSetVersionRowTipoParametroFormularioIvas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoparametroformularioiva,tipoparametroformularioivaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.setParametroFormularioIvas(new ArrayList<ParametroFormularioIva>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivas= new ArrayList<ParametroFormularioIva>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoparametroformularioivaAux.setParametroFormularioIvas(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.getParametroFormularioIvas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoparametroformularioivaAux,tipoparametroformularioivaLogic.getTipoParametroFormularioIvas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoparametroformularioivaAux,tipoparametroformularioivas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoparametroformularioiva,tipoparametroformularioivaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoparametroformularioivaAux=new  TipoParametroFormularioIva();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado() && this.tipoparametroformularioiva.getId()>=0)) {
						
					tipoparametroformularioivaAux.setIsNew(false);
				}
				
				tipoparametroformularioivaAux.setIsDeleted(false);
			
				tipoparametroformularioivaAux.setId(this.tipoparametroformularioiva.getId());	
				tipoparametroformularioivaAux.setVersionRow(this.tipoparametroformularioiva.getVersionRow());	
				tipoparametroformularioivaAux.setnombre(this.tipoparametroformularioiva.getnombre());	
				tipoparametroformularioivaAux.setcodigo_sri(this.tipoparametroformularioiva.getcodigo_sri());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoparametroformularioivaAux,tipoparametroformularioivaLogic.getTipoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparametroformularioivaAux,tipoparametroformularioivas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparametroformularioivaLogic.saveTipoParametroFormularioIvas();//WithConnection
						//tipoparametroformularioivaLogic.getSetVersionRowTipoParametroFormularioIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoparametroformularioiva,tipoparametroformularioivaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.getParametroFormularioIvas().addAll(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivas.addAll(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formulariorentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formulariorentaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formulariorentaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formularioivaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formularioivaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formulariorentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formulariorentaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formulariorentaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formularioivaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formularioivaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoparametroformularioivaLogic.saveTipoParametroFormularioIvaRelaciones(tipoparametroformularioivaAux,this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.getParametroFormularioIvas());//WithConnection
								//tipoparametroformularioivaLogic.getSetVersionRowTipoParametroFormularioIvas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoparametroformularioiva,tipoparametroformularioivaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.setParametroFormularioIvas(new ArrayList<ParametroFormularioIva>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivas= new ArrayList<ParametroFormularioIva>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoparametroformularioivaAux.setParametroFormularioIvas(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.getParametroFormularioIvas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoparametroformularioivaAux,tipoparametroformularioivaLogic.getTipoParametroFormularioIvas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoparametroformularioivaAux,tipoparametroformularioivas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoparametroformularioiva,tipoparametroformularioivaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoparametroformularioivaAux=new  TipoParametroFormularioIva();
				
				tipoparametroformularioivaAux.setIsNew(false);
				tipoparametroformularioivaAux.setIsChanged(false);
				
				tipoparametroformularioivaAux.setIsDeleted(true);
				
				tipoparametroformularioivaAux.setId(this.tipoparametroformularioiva.getId());	
				tipoparametroformularioivaAux.setVersionRow(this.tipoparametroformularioiva.getVersionRow());	
				tipoparametroformularioivaAux.setnombre(this.tipoparametroformularioiva.getnombre());	
				tipoparametroformularioivaAux.setcodigo_sri(this.tipoparametroformularioiva.getcodigo_sri());	
				
				if(this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoparametroformularioivaAux.getId()>=0) {	
						this.tipoparametroformularioivasEliminados.add(tipoparametroformularioivaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoparametroformularioivaAux,tipoparametroformularioivaLogic.getTipoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparametroformularioivaAux,tipoparametroformularioivas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparametroformularioivaLogic.saveTipoParametroFormularioIvas();//WithConnection
						//tipoparametroformularioivaLogic.getSetVersionRowTipoParametroFormularioIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.getParametroFormularioIvas().addAll(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivas.addAll(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formulariorentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formulariorentaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formulariorentaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formularioivaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formularioivaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formulariorentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formulariorentaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formulariorentaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formularioivaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jInternalFrameDetalleFormParametroFormularioIva.formularioivaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoparametroformularioivaLogic.saveTipoParametroFormularioIvaRelaciones(tipoparametroformularioivaAux,this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.getParametroFormularioIvas());//WithConnection
								//tipoparametroformularioivaLogic.getSetVersionRowTipoParametroFormularioIvas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.setParametroFormularioIvas(new ArrayList<ParametroFormularioIva>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivas= new ArrayList<ParametroFormularioIva>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoparametroformularioivaAux.setParametroFormularioIvas(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.getParametroFormularioIvas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoparametroformularioivaAux,tipoparametroformularioivaLogic.getTipoParametroFormularioIvas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoparametroformularioivaAux,tipoparametroformularioivas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().addAll(this.tipoparametroformularioivasEliminados);
					
					tipoparametroformularioivaLogic.saveTipoParametroFormularioIvas();//WithConnection
					//tipoparametroformularioivaLogic.getSetVersionRowTipoParametroFormularioIvas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoparametroformularioivasEliminados= new ArrayList<TipoParametroFormularioIva>();		
			}
			
			if(this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Parametro Formulario Iva  GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoparametroformularioiva=tipoparametroformularioivaAux;
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
      		//this.finishProcessTipoParametroFormularioIva();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoParametroFormularioIva tipoparametroformularioivaLocal) throws Exception {
		
		if(this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoparametroformularioivaLocal.setParametroFormularioIvas(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.getParametroFormularioIvas());
			
			} else {
			
				tipoparametroformularioivaLocal.setParametroFormularioIvas(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoParametroFormularioIva tipoparametroformularioivaLocal) throws Exception {	
		if(this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoParametroFormularioIvaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoparametroformularioivaValidator.getInvalidValues(this.tipoparametroformularioiva);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoParametroFormularioIva tipoparametroformularioiva,List<TipoParametroFormularioIva> tipoparametroformularioivas) throws Exception {
		try	{		
			TipoParametroFormularioIvaConstantesFunciones.actualizarLista(tipoparametroformularioiva,tipoparametroformularioivas,this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoParametroFormularioIva tipoparametroformularioiva,List<TipoParametroFormularioIva> tipoparametroformularioivas) throws Exception {
		try	{			
			TipoParametroFormularioIvaConstantesFunciones.actualizarSelectedLista(tipoparametroformularioiva,tipoparametroformularioivas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoParametroFormularioIva> tipoparametroformularioivasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoparametroformularioivasLocal=this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoparametroformularioivasLocal=this.tipoparametroformularioivas;
			}
			//ARCHITECTURE
		
			for(TipoParametroFormularioIva tipoparametroformularioivaLocal:tipoparametroformularioivasLocal) {
				if(this.permiteMantenimiento(tipoparametroformularioivaLocal) && tipoparametroformularioivaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoParametroFormularioIvaConstantesFunciones.getTipoParametroFormularioIvaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoParametroFormularioIvaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParametroFormularioIva.jLabelnombreTipoParametroFormularioIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoParametroFormularioIvaConstantesFunciones.CODIGOSRI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParametroFormularioIva.jLabelcodigo_sriTipoParametroFormularioIva,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoParametroFormularioIva.jLabelnombreTipoParametroFormularioIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoParametroFormularioIva.jLabelcodigo_sriTipoParametroFormularioIva,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ParametroFormularioIva")) {
			if(this.tipoparametroformularioiva==null) {
				this.tipoparametroformularioiva= new TipoParametroFormularioIva();
			}

			if(this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoParametroFormularioIva
				this.setVariablesFormularioToObjetoActualTipoParametroFormularioIva(this.tipoparametroformularioiva,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroFormularioIva(this.tipoparametroformularioiva);

				this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.getparametroformularioiva().setTipoParametroFormularioIva(this.tipoparametroformularioiva);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoParametroFormularioIva--;	
		
		
		this.tipoparametroformularioivaAux=new TipoParametroFormularioIva();
		
		this.tipoparametroformularioivaAux.setId(this.iIdNuevoTipoParametroFormularioIva);
		this.tipoparametroformularioivaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().add(this.tipoparametroformularioivaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoparametroformularioivas.add(this.tipoparametroformularioivaAux);
		}
		//ARCHITECTURE
		
		this.tipoparametroformularioiva=this.tipoparametroformularioivaAux;
		
		if(TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoParametroFormularioIva(this.tipoparametroformularioiva);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoParametroFormularioIva(this.tipoparametroformularioiva);
		}
				
		//this.setDefaultControlesTipoParametroFormularioIva();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoParametroFormularioIva();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoParametroFormularioIva();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoParametroFormularioIva();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoParametroFormularioIva(this.tipoparametroformularioivaBean,this.tipoparametroformularioiva,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroFormularioIva(this.tipoparametroformularioiva);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
			classes=TipoParametroFormularioIvaConstantesFunciones.getClassesRelationshipsOfTipoParametroFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoparametroformularioivaReturnGeneral=tipoparametroformularioivaLogic.procesarEventosTipoParametroFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas(),this.tipoparametroformularioiva,this.tipoparametroformularioivaParameterGeneral,this.isEsNuevoTipoParametroFormularioIva,classes);//this.tipoparametroformularioivaLogic.getTipoParametroFormularioIva()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoParametroFormularioIva(this.tipoparametroformularioivaReturnGeneral,this.tipoparametroformularioivaBean,false);
		
		if(this.tipoparametroformularioivaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoParametroFormularioIva(this.tipoparametroformularioivaReturnGeneral.getTipoParametroFormularioIva());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoParametroFormularioIva(this.tipoparametroformularioivaReturnGeneral.getTipoParametroFormularioIva());
		}
		
		if(this.tipoparametroformularioivaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoParametroFormularioIva(this.tipoparametroformularioivaReturnGeneral.getTipoParametroFormularioIva(),classes);//this.tipoparametroformularioivaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoParametroFormularioIva(this.tipoparametroformularioiva,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoParametroFormularioIva();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoParametroFormularioIva();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.RecargarFormTipoParametroFormularioIva(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoParametroFormularioIva(false);
						
			if(tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.getEsGuardarRelacionado() && ParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroFormularioIvaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoParametroFormularioIva();
			}
			
			this.actualizarVisualTableDatosTipoParametroFormularioIva();
			
			this.jTableDatosTipoParametroFormularioIva.setRowSelectionInterval(this.getIndiceNuevoTipoParametroFormularioIva(), this.getIndiceNuevoTipoParametroFormularioIva());
			
			this.seleccionarFilaTablaTipoParametroFormularioIvaActual();
						
			this.actualizarEstadoCeldasBotonesTipoParametroFormularioIva("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoParametroFormularioIva(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextAreanombreTipoParametroFormularioIva.setEnabled(isHabilitar && this.tipoparametroformularioivaConstantesFunciones.activarnombreTipoParametroFormularioIva);
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldcodigo_sriTipoParametroFormularioIva.setEnabled(isHabilitar && this.tipoparametroformularioivaConstantesFunciones.activarcodigo_sriTipoParametroFormularioIva);	
		
	};
	
	public void setDefaultControlesTipoParametroFormularioIva() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoParametroFormularioIva(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoparametroformularioivaSessionBean.setConGuardarRelaciones(true);			
			this.tipoparametroformularioivaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTabbedPaneRelacionesTipoParametroFormularioIva.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoparametroformularioivaSessionBean.setConGuardarRelaciones(false);			
			this.tipoparametroformularioivaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTabbedPaneRelacionesTipoParametroFormularioIva.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoParametroFormularioIva() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParametroFormularioIva tipoparametroformularioivaAux:this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas()) {
				if(tipoparametroformularioivaAux.getId().equals(this.iIdNuevoTipoParametroFormularioIva)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParametroFormularioIva tipoparametroformularioivaAux:this.tipoparametroformularioivas) {
				if(tipoparametroformularioivaAux.getId().equals(this.iIdNuevoTipoParametroFormularioIva)) {
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
	
	public int getIndiceActualTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioiva,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParametroFormularioIva tipoparametroformularioivaAux:this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas()) {
				if(tipoparametroformularioivaAux.getId().equals(tipoparametroformularioiva.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParametroFormularioIva tipoparametroformularioivaAux:this.tipoparametroformularioivas) {
				if(tipoparametroformularioivaAux.getId().equals(tipoparametroformularioiva.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioivaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParametroFormularioIva tipoparametroformularioivaAux:this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas()) {
				if(tipoparametroformularioivaAux.getTipoParametroFormularioIvaOriginal().getId().equals(tipoparametroformularioivaOriginal.getId())) {
					existe=true;
					tipoparametroformularioivaOriginal.setId(tipoparametroformularioivaAux.getId());
					tipoparametroformularioivaOriginal.setVersionRow(tipoparametroformularioivaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParametroFormularioIva tipoparametroformularioivaAux:this.tipoparametroformularioivas) {
				if(tipoparametroformularioivaAux.getTipoParametroFormularioIvaOriginal().getId().equals(tipoparametroformularioivaOriginal.getId())) {
					existe=true;
					tipoparametroformularioivaOriginal.setId(tipoparametroformularioivaAux.getId());
					tipoparametroformularioivaOriginal.setVersionRow(tipoparametroformularioivaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoParametroFormularioIva(Boolean esParaCancelar) throws Exception {
		tipoparametroformularioivasAux=new ArrayList<TipoParametroFormularioIva>();
		tipoparametroformularioivaAux=new TipoParametroFormularioIva();
		
		if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoParametroFormularioIva tipoparametroformularioivaAux:this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas()) {
					if(tipoparametroformularioivaAux.getId()<0) {
						tipoparametroformularioivasAux.add(tipoparametroformularioivaAux);
					}		
				}
				this.iIdNuevoTipoParametroFormularioIva=0L;
				this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().removeAll(tipoparametroformularioivasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParametroFormularioIva tipoparametroformularioivaAux:this.tipoparametroformularioivas) {
					if(tipoparametroformularioivaAux.getId()<0) {
						tipoparametroformularioivasAux.add(tipoparametroformularioivaAux);
					}		
				}
				this.iIdNuevoTipoParametroFormularioIva=0L;
				this.tipoparametroformularioivas.removeAll(tipoparametroformularioivasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoParametroFormularioIva 
					&& this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().size()>0
					) {
					tipoparametroformularioivaAux=this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().get(this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().size() - 1);
				
					if(tipoparametroformularioivaAux.getId()<0) {
						this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().remove(tipoparametroformularioivaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoParametroFormularioIva && this.tipoparametroformularioivas.size()>0) {
					tipoparametroformularioivaAux=this.tipoparametroformularioivas.get(this.tipoparametroformularioivas.size() - 1);
				
					if(tipoparametroformularioivaAux.getId()<0) {
						this.tipoparametroformularioivas.remove(tipoparametroformularioivaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoParametroFormularioIva(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoparametroformularioiva.getId()<0) {
				this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().remove(this.tipoparametroformularioiva);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoparametroformularioiva.getId()<0) {
				this.tipoparametroformularioivas.remove(this.tipoparametroformularioiva);
			}
		}			
	}
	
	public void setEstadosInicialesTipoParametroFormularioIva(List<TipoParametroFormularioIva> tipoparametroformularioivasAux) throws Exception {
		TipoParametroFormularioIvaConstantesFunciones.setEstadosInicialesTipoParametroFormularioIva(tipoparametroformularioivasAux);
	}
	
	public void setEstadosInicialesTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioivaAux) throws Exception {
		TipoParametroFormularioIvaConstantesFunciones.setEstadosInicialesTipoParametroFormularioIva(tipoparametroformularioivaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoParametroFormularioIvaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoParametroFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoParametroFormularioIvaActual()) {
				if(!this.isEsNuevoTipoParametroFormularioIva) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoParametroFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoParametroFormularioIva=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoParametroFormularioIvaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Parametro Formulario Iva  ?", "MANTENIMIENTO DE Tipo Parametro Formulario Iva ", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoParametroFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoParametroFormularioIva tipoparametroformularioiva) throws Exception {
		TipoParametroFormularioIvaConstantesFunciones.seleccionarAsignar(this.tipoparametroformularioiva,tipoparametroformularioiva);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoParametroFormularioIva=this.isPermisoActualizarOriginalTipoParametroFormularioIva;
			
			
			this.seleccionarAsignar(tipoparametroformularioiva);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoParametroFormularioIvaConstantesFunciones.quitarEspaciosTipoParametroFormularioIva(this.tipoparametroformularioiva,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoParametroFormularioIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoparametroformularioivaSessionBean.setsFuncionBusquedaRapida(this.tipoparametroformularioivaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoParametroFormularioIva) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoParametroFormularioIva(esParaCancelar);				
				this.cancelarNuevoTipoParametroFormularioIva(esParaCancelar);								
			}
			
			this.tipoparametroformularioiva=new TipoParametroFormularioIva();
			
			this.inicializarTipoParametroFormularioIva();
			
			this.actualizarEstadoCeldasBotonesTipoParametroFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoParametroFormularioIva() throws Exception {
		try {
			TipoParametroFormularioIvaConstantesFunciones.inicializarTipoParametroFormularioIva(this.tipoparametroformularioiva);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoParametroFormularioIvas(String sAccionBusqueda,List<TipoParametroFormularioIva> tipoparametroformularioivasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoParametroFormularioIva"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoParametroFormularioIvaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoParametroFormularioIvaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoParametroFormularioIva"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Parametro Formulario Iva s");		
		parameters.put("busquedapor", TipoParametroFormularioIvaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ParametroFormularioIva.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoParametroFormularioIvaLogic tipoparametroformularioivaLogicAuxiliar=new TipoParametroFormularioIvaLogic();
					tipoparametroformularioivaLogicAuxiliar.setDatosCliente(tipoparametroformularioivaLogic.getDatosCliente());				
					tipoparametroformularioivaLogicAuxiliar.setTipoParametroFormularioIvas(tipoparametroformularioivasParaReportes);
					
					tipoparametroformularioivaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoParametroFormularioIvaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoparametroformularioivasParaReportes=tipoparametroformularioivaLogicAuxiliar.getTipoParametroFormularioIvas();
					
					//tipoparametroformularioivaLogic.getNewConnexionToDeep();
					
					//for (TipoParametroFormularioIva tipoparametroformularioiva:tipoparametroformularioivasParaReportes) {
					//	tipoparametroformularioivaLogic.deepLoad(tipoparametroformularioiva, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoparametroformularioivaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoparametroformularioivaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileParametroFormularioIva = AuxiliarReportes.class.getResourceAsStream("ParametroFormularioIvaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametroformularioiva", reportFileParametroFormularioIva);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoParametroFormularioIva=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoParametroFormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoParametroFormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoParametroFormularioIva=new JRBeanArrayDataSource(TipoParametroFormularioIvaJInternalFrame.TraerTipoParametroFormularioIvaBeans(tipoparametroformularioivasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoParametroFormularioIva);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoParametroFormularioIvaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoParametroFormularioIvaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoParametroFormularioIvaBean.TraerTipoParametroFormularioIvaBeans(tipoparametroformularioivasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoParametroFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,tipoparametroformularioivasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoParametroFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,tipoparametroformularioivasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoParametroFormularioIvaActionPerformed(null);
					//this.generarExcelReporteTipoParametroFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,tipoparametroformularioivasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoParametroFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,tipoparametroformularioivasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoParametroFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,tipoparametroformularioivasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoParametroFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,tipoparametroformularioivasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoParametroFormularioIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoParametroFormularioIva> tipoparametroformularioivasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparametroformularioiva";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoParametroFormularioIvas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoParametroFormularioIva("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoParametroFormularioIva tipoparametroformularioiva : tipoparametroformularioivasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoParametroFormularioIvaConstantesFunciones.generarExcelReporteDataTipoParametroFormularioIva("NORMAL",row,workbook,tipoparametroformularioiva,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoParametroFormularioIva(String sTipo,Row row,Workbook workbook) {
		
		TipoParametroFormularioIvaConstantesFunciones.generarExcelReporteHeaderTipoParametroFormularioIva(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoParametroFormularioIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoParametroFormularioIva> tipoparametroformularioivasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparametroformularioiva_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoParametroFormularioIvas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoParametroFormularioIva tipoparametroformularioiva : tipoparametroformularioivasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoParametroFormularioIvaConstantesFunciones.getTipoParametroFormularioIvaDescripcion(tipoparametroformularioiva));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoparametroformularioiva.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoparametroformularioiva.getcodigo_sri());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoParametroFormularioIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoParametroFormularioIva> tipoparametroformularioivasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoParametroFormularioIva> tipoparametroformularioivasRespaldo=null;
		
		classes=TipoParametroFormularioIvaConstantesFunciones.getClassesRelationshipsOfTipoParametroFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoparametroformularioivaLogic.setDatosCliente(this.datosCliente);
		this.tipoparametroformularioivaLogic.setDatosDeep(this.datosDeep);
		this.tipoparametroformularioivaLogic.setIsConDeep(true);
		
		tipoparametroformularioivasRespaldo=this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas();
		
		this.tipoparametroformularioivaLogic.setTipoParametroFormularioIvas(tipoparametroformularioivasParaReportes);	
		this.tipoparametroformularioivaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoparametroformularioivasParaReportes=this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas();
		this.tipoparametroformularioivaLogic.setTipoParametroFormularioIvas(tipoparametroformularioivasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparametroformularioiva_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoParametroFormularioIvas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoParametroFormularioIva("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoParametroFormularioIva tipoparametroformularioiva : tipoparametroformularioivasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoParametroFormularioIva("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoParametroFormularioIvaConstantesFunciones.generarExcelReporteDataTipoParametroFormularioIva("NORMAL",row,workbook,tipoparametroformularioiva,cellStyleDataAux);
		
			
			


				//ParametroFormularioIva
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoparametroformularioiva.getParametroFormularioIvas()!=null && tipoparametroformularioiva.getParametroFormularioIvas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroFormularioIvaConstantesFunciones.generarExcelReporteHeaderParametroFormularioIva("RELACIONADO",row,workbook);
				}

				if(tipoparametroformularioiva.getParametroFormularioIvas()!=null) {
					i2=0;
					for(ParametroFormularioIva parametroformularioiva : tipoparametroformularioiva.getParametroFormularioIvas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroFormularioIvaConstantesFunciones.generarExcelReporteDataParametroFormularioIva("RELACIONADO",row,workbook,parametroformularioiva,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoParametroFormularioIvaConstantesFunciones.getTipoParametroFormularioIvaDescripcion(tipoparametroformularioiva));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoParametroFormularioIva() throws Exception {		
		this.startProcessTipoParametroFormularioIva(true);
	}
	
	public void startProcessTipoParametroFormularioIva(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoParametroFormularioIva, this.jScrollPanelDatosTipoParametroFormularioIva,this.jPanelPaginacionTipoParametroFormularioIva, this.jScrollPanelDatosEdicionTipoParametroFormularioIva, this.jPanelAccionesTipoParametroFormularioIva,this.jPanelAccionesFormularioTipoParametroFormularioIva,this.jmenuBarTipoParametroFormularioIva,this.jmenuBarDetalleTipoParametroFormularioIva,this.jTtoolBarTipoParametroFormularioIva,this.jTtoolBarDetalleTipoParametroFormularioIva);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoParametroFormularioIva=null; 
		
		final JPanel jPanelParametrosReportesTipoParametroFormularioIva=this.jPanelParametrosReportesTipoParametroFormularioIva;
		//final JScrollPane jScrollPanelDatosTipoParametroFormularioIva=this.jScrollPanelDatosTipoParametroFormularioIva;
		final JTable jTableDatosTipoParametroFormularioIva=this.jTableDatosTipoParametroFormularioIva;		
		final JPanel jPanelPaginacionTipoParametroFormularioIva=this.jPanelPaginacionTipoParametroFormularioIva;
		//final JScrollPane jScrollPanelDatosEdicionTipoParametroFormularioIva=this.jScrollPanelDatosEdicionTipoParametroFormularioIva;
		final JPanel jPanelAccionesTipoParametroFormularioIva=this.jPanelAccionesTipoParametroFormularioIva;
		
		JPanel jPanelCamposAuxiliarTipoParametroFormularioIva=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoParametroFormularioIva=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {
			jPanelCamposAuxiliarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jPanelCamposTipoParametroFormularioIva;
			jPanelAccionesFormularioAuxiliarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jPanelAccionesFormularioTipoParametroFormularioIva;
		}
		
		final JPanel jPanelCamposTipoParametroFormularioIva=jPanelCamposAuxiliarTipoParametroFormularioIva;
		final JPanel jPanelAccionesFormularioTipoParametroFormularioIva=jPanelAccionesFormularioAuxiliarTipoParametroFormularioIva;
		
		
		final JMenuBar jmenuBarTipoParametroFormularioIva=this.jmenuBarTipoParametroFormularioIva;
		final JToolBar jTtoolBarTipoParametroFormularioIva=this.jTtoolBarTipoParametroFormularioIva;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoParametroFormularioIva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoParametroFormularioIva=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {
			jmenuBarDetalleAuxiliarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jmenuBarDetalleTipoParametroFormularioIva;
			jTtoolBarDetalleAuxiliarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTtoolBarDetalleTipoParametroFormularioIva;
		}
		
		final JMenuBar jmenuBarDetalleTipoParametroFormularioIva=jmenuBarDetalleAuxiliarTipoParametroFormularioIva;
		final JToolBar jTtoolBarDetalleTipoParametroFormularioIva=jTtoolBarDetalleAuxiliarTipoParametroFormularioIva;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoParametroFormularioIva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoParametroFormularioIva;
			processRunnable.jTableDatos=jTableDatosTipoParametroFormularioIva;
			processRunnable.jPanelCampos=jPanelCamposTipoParametroFormularioIva;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoParametroFormularioIva;
			processRunnable.jPanelAcciones=jPanelAccionesTipoParametroFormularioIva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoParametroFormularioIva;
			
			
			processRunnable.jmenuBar=jmenuBarTipoParametroFormularioIva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoParametroFormularioIva;
			processRunnable.jTtoolBar=jTtoolBarTipoParametroFormularioIva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoParametroFormularioIva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoParametroFormularioIva ,jPanelParametrosReportesTipoParametroFormularioIva,jTableDatosTipoParametroFormularioIva, /*jScrollPanelDatosTipoParametroFormularioIva,*/jPanelCamposTipoParametroFormularioIva,jPanelPaginacionTipoParametroFormularioIva, /*jScrollPanelDatosEdicionTipoParametroFormularioIva,*/ jPanelAccionesTipoParametroFormularioIva,jPanelAccionesFormularioTipoParametroFormularioIva,jmenuBarTipoParametroFormularioIva,jmenuBarDetalleTipoParametroFormularioIva,jTtoolBarTipoParametroFormularioIva,jTtoolBarDetalleTipoParametroFormularioIva);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoParametroFormularioIva, jScrollPanelDatosTipoParametroFormularioIva,jPanelPaginacionTipoParametroFormularioIva, jScrollPanelDatosEdicionTipoParametroFormularioIva, jPanelAccionesTipoParametroFormularioIva,jPanelAccionesFormularioTipoParametroFormularioIva,jmenuBarTipoParametroFormularioIva,jmenuBarDetalleTipoParametroFormularioIva,jTtoolBarTipoParametroFormularioIva,jTtoolBarDetalleTipoParametroFormularioIva);
						
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
	
	public void finishProcessTipoParametroFormularioIva() {// throws Exception 
		this.finishProcessTipoParametroFormularioIva(true);
	}
	
	public void finishProcessTipoParametroFormularioIva(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoParametroFormularioIva, this.jScrollPanelDatosTipoParametroFormularioIva,this.jPanelPaginacionTipoParametroFormularioIva, this.jScrollPanelDatosEdicionTipoParametroFormularioIva, this.jPanelAccionesTipoParametroFormularioIva,this.jPanelAccionesFormularioTipoParametroFormularioIva,this.jmenuBarTipoParametroFormularioIva,this.jmenuBarDetalleTipoParametroFormularioIva,this.jTtoolBarTipoParametroFormularioIva,this.jTtoolBarDetalleTipoParametroFormularioIva);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoParametroFormularioIva=null; 
		
		final JPanel jPanelParametrosReportesTipoParametroFormularioIva=this.jPanelParametrosReportesTipoParametroFormularioIva;
		//final JScrollPane jScrollPanelDatosTipoParametroFormularioIva=this.jScrollPanelDatosTipoParametroFormularioIva;
		final JTable jTableDatosTipoParametroFormularioIva=this.jTableDatosTipoParametroFormularioIva;		
		final JPanel jPanelPaginacionTipoParametroFormularioIva=this.jPanelPaginacionTipoParametroFormularioIva;
		//final JScrollPane jScrollPanelDatosEdicionTipoParametroFormularioIva=this.jScrollPanelDatosEdicionTipoParametroFormularioIva;
		final JPanel jPanelAccionesTipoParametroFormularioIva=this.jPanelAccionesTipoParametroFormularioIva;
		
		JPanel jPanelCamposAuxiliarTipoParametroFormularioIva=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoParametroFormularioIva=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {
			jPanelCamposAuxiliarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jPanelCamposTipoParametroFormularioIva;
			jPanelAccionesFormularioAuxiliarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jPanelAccionesFormularioTipoParametroFormularioIva;
		}
		
		final JPanel jPanelCamposTipoParametroFormularioIva=jPanelCamposAuxiliarTipoParametroFormularioIva;
		final JPanel jPanelAccionesFormularioTipoParametroFormularioIva=jPanelAccionesFormularioAuxiliarTipoParametroFormularioIva;
		
		
		final JMenuBar jmenuBarTipoParametroFormularioIva=this.jmenuBarTipoParametroFormularioIva;		
		final JToolBar jTtoolBarTipoParametroFormularioIva=this.jTtoolBarTipoParametroFormularioIva;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoParametroFormularioIva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoParametroFormularioIva=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {
			jmenuBarDetalleAuxiliarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jmenuBarDetalleTipoParametroFormularioIva;
			jTtoolBarDetalleAuxiliarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTtoolBarDetalleTipoParametroFormularioIva;		
		}
		
		final JMenuBar jmenuBarDetalleTipoParametroFormularioIva=jmenuBarDetalleAuxiliarTipoParametroFormularioIva;
		final JToolBar jTtoolBarDetalleTipoParametroFormularioIva=jTtoolBarDetalleAuxiliarTipoParametroFormularioIva;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoParametroFormularioIva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoParametroFormularioIva;
			processRunnable.jTableDatos=jTableDatosTipoParametroFormularioIva;
			processRunnable.jPanelCampos=jPanelCamposTipoParametroFormularioIva;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoParametroFormularioIva;
			processRunnable.jPanelAcciones=jPanelAccionesTipoParametroFormularioIva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoParametroFormularioIva;
			
			
			processRunnable.jmenuBar=jmenuBarTipoParametroFormularioIva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoParametroFormularioIva;
			processRunnable.jTtoolBar=jTtoolBarTipoParametroFormularioIva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoParametroFormularioIva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoParametroFormularioIva ,jPanelParametrosReportesTipoParametroFormularioIva, jTableDatosTipoParametroFormularioIva,/*jScrollPanelDatosTipoParametroFormularioIva,*/jPanelCamposTipoParametroFormularioIva,jPanelPaginacionTipoParametroFormularioIva, /*jScrollPanelDatosEdicionTipoParametroFormularioIva,*/ jPanelAccionesTipoParametroFormularioIva,jPanelAccionesFormularioTipoParametroFormularioIva,jmenuBarTipoParametroFormularioIva,jmenuBarDetalleTipoParametroFormularioIva,jTtoolBarTipoParametroFormularioIva,jTtoolBarDetalleTipoParametroFormularioIva));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoParametroFormularioIva(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoParametroFormularioIva(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoParametroFormularioIva(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoParametroFormularioIva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoParametroFormularioIva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoParametroFormularioIva,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoParametroFormularioIva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoParametroFormularioIva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoParametroFormularioIva,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoparametroformularioivaConstantesFunciones.getsFinalQueryTipoParametroFormularioIva();
		String  finalQueryPaginacionTodos=this.tipoparametroformularioivaConstantesFunciones.getsFinalQueryTipoParametroFormularioIva();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoParametroFormularioIvaConstantesFunciones.getArrayColumnasGlobalesNoTipoParametroFormularioIva(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoParametroFormularioIvaConstantesFunciones.getArrayColumnasGlobalesTipoParametroFormularioIva(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoParametroFormularioIvaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoparametroformularioivasEliminados= new ArrayList<TipoParametroFormularioIva>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoParametroFormularioIva();
		
				///*TipoParametroFormularioIvaSessionBean*/this.tipoparametroformularioivaSessionBean=new TipoParametroFormularioIvaSessionBean();
			
			if(this.tipoparametroformularioivaSessionBean==null) {
				this.tipoparametroformularioivaSessionBean=new TipoParametroFormularioIvaSessionBean();
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
					this.iNumeroPaginacion=TipoParametroFormularioIvaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoParametroFormularioIvaConstantesFunciones.getClassesForeignKeysOfTipoParametroFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoparametroformularioiva."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoparametroformularioivasAux= new ArrayList<TipoParametroFormularioIva>();
			
				
			tipoparametroformularioivaLogic.setDatosCliente(this.datosCliente);
			tipoparametroformularioivaLogic.setDatosDeep(this.datosDeep);
			tipoparametroformularioivaLogic.setIsConDeep(true);
			
			
			tipoparametroformularioivaLogic.getTipoParametroFormularioIvaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoparametroformularioivaLogic.getTodosTipoParametroFormularioIvas(finalQueryGlobal,pagination);
					
					//tipoparametroformularioivaLogic.getTodosTipoParametroFormularioIvasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoparametroformularioivaLogic.getTipoParametroFormularioIvas()==null|| tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoparametroformularioivasAux= new ArrayList<TipoParametroFormularioIva>();
							tipoparametroformularioivasAux.addAll(tipoparametroformularioivaLogic.getTipoParametroFormularioIvas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparametroformularioivasAux= new ArrayList<TipoParametroFormularioIva>();
							tipoparametroformularioivasAux.addAll(tipoparametroformularioivas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoparametroformularioivaLogic.getTodosTipoParametroFormularioIvas(finalQueryGlobal+"",this.pagination);												
							
							//tipoparametroformularioivaLogic.getTodosTipoParametroFormularioIvasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoParametroFormularioIvas("Todos",tipoparametroformularioivaLogic.getTipoParametroFormularioIvas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoparametroformularioivaLogic.setTipoParametroFormularioIvas(new ArrayList<TipoParametroFormularioIva>());					
							tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().addAll(tipoparametroformularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparametroformularioivas=new ArrayList<TipoParametroFormularioIva>();
							tipoparametroformularioivas.addAll(tipoparametroformularioivasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoParametroFormularioIva=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoParametroFormularioIva=this.idActual;
				
				} else if(this.idTipoParametroFormularioIvaActual!=null && this.idTipoParametroFormularioIvaActual!=0L) {
					idTipoParametroFormularioIva=idTipoParametroFormularioIvaActual;
				}
				
					
				this.sDetalleReporte=TipoParametroFormularioIvaConstantesFunciones.getDetalleIndicePorId(idTipoParametroFormularioIva);
				
				this.tipoparametroformularioivas=new ArrayList<TipoParametroFormularioIva>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoparametroformularioivaLogic.getEntity(idTipoParametroFormularioIva);
					
					//tipoparametroformularioivaLogic.getEntityWithConnection(idTipoParametroFormularioIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparametroformularioivaLogic.setTipoParametroFormularioIvas(new ArrayList<TipoParametroFormularioIva>());
					tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().add(tipoparametroformularioivaLogic.getTipoParametroFormularioIva());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoparametroformularioivas=new ArrayList<TipoParametroFormularioIva>();
					this.tipoparametroformularioivas.add(tipoparametroformularioiva);
				}
				
				if(tipoparametroformularioivaLogic.getTipoParametroFormularioIva()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoParametroFormularioIva();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoParametroFormularioIva();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoparametroformularioivas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoparametroformularioivas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoParametroFormularioIva tipoparametroformularioiva) {
		Boolean permite=true;
		
		if(this.tipoparametroformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoParametroFormularioIvaConstantesFunciones.getOrderByListaTipoParametroFormularioIva();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoParametroFormularioIvaConstantesFunciones.getOrderByListaTipoParametroFormularioIva();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParametroFormularioIva tipoparametroformularioiva:tipoparametroformularioivaLogic.getTipoParametroFormularioIvas()) {
				if(tipoparametroformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparametroformularioivaTotales=tipoparametroformularioiva;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParametroFormularioIva tipoparametroformularioiva:this.tipoparametroformularioivas) {
				if(tipoparametroformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparametroformularioivaTotales=tipoparametroformularioiva;
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
			this.tipoparametroformularioivaAux=new TipoParametroFormularioIva();
			this.tipoparametroformularioivaAux.setsType(Constantes2.S_TOTALES);
			this.tipoparametroformularioivaAux.setIsNew(false);
			this.tipoparametroformularioivaAux.setIsChanged(false);
			this.tipoparametroformularioivaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoParametroFormularioIvaConstantesFunciones.TotalizarValoresFilaTipoParametroFormularioIva(this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas(),this.tipoparametroformularioivaAux);
				
				this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().add(this.tipoparametroformularioivaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoParametroFormularioIvaConstantesFunciones.TotalizarValoresFilaTipoParametroFormularioIva(this.tipoparametroformularioivas,this.tipoparametroformularioivaAux);
				
				this.tipoparametroformularioivas.add(this.tipoparametroformularioivaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoparametroformularioivaTotales=new TipoParametroFormularioIva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().remove(tipoparametroformularioivaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoparametroformularioivas.remove(tipoparametroformularioivaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoparametroformularioivaTotales=new TipoParametroFormularioIva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParametroFormularioIva tipoparametroformularioiva:tipoparametroformularioivaLogic.getTipoParametroFormularioIvas()) {
				if(tipoparametroformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparametroformularioivaTotales=tipoparametroformularioiva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoParametroFormularioIvaConstantesFunciones.TotalizarValoresFilaTipoParametroFormularioIva(this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas(),tipoparametroformularioivaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParametroFormularioIva tipoparametroformularioiva:this.tipoparametroformularioivas) {
				if(tipoparametroformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparametroformularioivaTotales=tipoparametroformularioiva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoParametroFormularioIvaConstantesFunciones.TotalizarValoresFilaTipoParametroFormularioIva(this.tipoparametroformularioivas,tipoparametroformularioivaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoParametroFormularioIva() {
		this.isPermisoTodoTipoParametroFormularioIva=false;
		this.isPermisoNuevoTipoParametroFormularioIva=false;
		this.isPermisoActualizarTipoParametroFormularioIva=false;
		this.isPermisoActualizarOriginalTipoParametroFormularioIva=false;
		this.isPermisoEliminarTipoParametroFormularioIva=false;
		this.isPermisoGuardarCambiosTipoParametroFormularioIva=false;
		this.isPermisoConsultaTipoParametroFormularioIva=false;
		this.isPermisoBusquedaTipoParametroFormularioIva=false;
		this.isPermisoReporteTipoParametroFormularioIva=false;		
		this.isPermisoOrdenTipoParametroFormularioIva=false;		
		this.isPermisoPaginacionMedioTipoParametroFormularioIva=false;		
		this.isPermisoPaginacionAltoTipoParametroFormularioIva=false;
		this.isPermisoPaginacionTodoTipoParametroFormularioIva=false;
		this.isPermisoCopiarTipoParametroFormularioIva=false;		
		this.isPermisoVerFormTipoParametroFormularioIva=false;		
		this.isPermisoDuplicarTipoParametroFormularioIva=false;		
		this.isPermisoOrdenTipoParametroFormularioIva=false;		
	}
	
	public void setPermisosUsuarioTipoParametroFormularioIva(Boolean isPermiso) {
		this.isPermisoTodoTipoParametroFormularioIva=isPermiso;
		this.isPermisoNuevoTipoParametroFormularioIva=isPermiso;
		this.isPermisoActualizarTipoParametroFormularioIva=isPermiso;
		this.isPermisoActualizarOriginalTipoParametroFormularioIva=isPermiso;
		this.isPermisoEliminarTipoParametroFormularioIva=isPermiso;
		this.isPermisoGuardarCambiosTipoParametroFormularioIva=isPermiso;
		this.isPermisoConsultaTipoParametroFormularioIva=isPermiso;
		this.isPermisoBusquedaTipoParametroFormularioIva=isPermiso;
		this.isPermisoReporteTipoParametroFormularioIva=isPermiso;
		this.isPermisoOrdenTipoParametroFormularioIva=isPermiso;		
		this.isPermisoPaginacionMedioTipoParametroFormularioIva=isPermiso;		
		this.isPermisoPaginacionAltoTipoParametroFormularioIva=isPermiso;		
		this.isPermisoPaginacionTodoTipoParametroFormularioIva=isPermiso;		
		this.isPermisoCopiarTipoParametroFormularioIva=isPermiso;		
		this.isPermisoVerFormTipoParametroFormularioIva=isPermiso;		
		this.isPermisoDuplicarTipoParametroFormularioIva=isPermiso;
		this.isPermisoOrdenTipoParametroFormularioIva=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoParametroFormularioIva(Boolean isPermiso) {
		//this.isPermisoTodoTipoParametroFormularioIva=isPermiso;
		this.isPermisoNuevoTipoParametroFormularioIva=isPermiso;
		this.isPermisoActualizarTipoParametroFormularioIva=isPermiso;
		this.isPermisoActualizarOriginalTipoParametroFormularioIva=isPermiso;
		this.isPermisoEliminarTipoParametroFormularioIva=isPermiso;
		this.isPermisoGuardarCambiosTipoParametroFormularioIva=isPermiso;
		//this.isPermisoConsultaTipoParametroFormularioIva=isPermiso;
		//this.isPermisoBusquedaTipoParametroFormularioIva=isPermiso;
		//this.isPermisoReporteTipoParametroFormularioIva=isPermiso;
		//this.isPermisoOrdenTipoParametroFormularioIva=isPermiso;		
		//this.isPermisoPaginacionMedioTipoParametroFormularioIva=isPermiso;		
		//this.isPermisoPaginacionAltoTipoParametroFormularioIva=isPermiso;		
		//this.isPermisoPaginacionTodoTipoParametroFormularioIva=isPermiso;		
		//this.isPermisoCopiarTipoParametroFormularioIva=isPermiso;		
		//this.isPermisoDuplicarTipoParametroFormularioIva=isPermiso;
		//this.isPermisoOrdenTipoParametroFormularioIva=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoParametroFormularioIvaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ParametroFormularioIvaConstantesFunciones.SNOMBREOPCION);
		
		if(TipoParametroFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosParametroFormularioIva=false;
		this.isTienePermisosParametroFormularioIva=this.verificarGetPermisosUsuarioOpcionTipoParametroFormularioIvaClaseRelacionada(this.opcionsRelacionadas,ParametroFormularioIvaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoParametroFormularioIva(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoParametroFormularioIvaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosParametroFormularioIva=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoParametroFormularioIvaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoParametroFormularioIvaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoParametroFormularioIvaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosParametroFormularioIva && this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTabbedPaneRelacionesTipoParametroFormularioIva.remove(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoParametroFormularioIva() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoParametroFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoParametroFormularioIvaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoParametroFormularioIva=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoParametroFormularioIva=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoParametroFormularioIva=this.isPermisoActualizarTipoParametroFormularioIva;
			this.isPermisoEliminarTipoParametroFormularioIva=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoParametroFormularioIva=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoParametroFormularioIva=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoParametroFormularioIva=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoParametroFormularioIva=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoParametroFormularioIva=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoParametroFormularioIva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoParametroFormularioIva=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoParametroFormularioIva=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoParametroFormularioIva=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoParametroFormularioIva=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoParametroFormularioIva=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoParametroFormularioIva=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoParametroFormularioIva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoParametroFormularioIva.setToolTipText(this.jTableDatosTipoParametroFormularioIva.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoParametroFormularioIva(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoParametroFormularioIva(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoParametroFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoParametroFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoParametroFormularioIva() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosParametroFormularioIva && this.tipoparametroformularioivaConstantesFunciones.mostrarParametroFormularioIvaTipoParametroFormularioIva && !TipoParametroFormularioIvaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Formulario Iva");
			reporte.setsDescripcion("Parametro Formulario Iva");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	public void inicializarCombosForeignKeyTipoParametroFormularioIvaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoParametroFormularioIvaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoParametroFormularioIvaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoParametroFormularioIvaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoParametroFormularioIvaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoParametroFormularioIva()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoParametroFormularioIva()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoParametroFormularioIva(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoParametroFormularioIva()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoParametroFormularioIva();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioiva)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioiva,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoParametroFormularioIva()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoParametroFormularioIva()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoParametroFormularioIva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoParametroFormularioIva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoParametroFormularioIva()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoParametroFormularioIva()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoParametroFormularioIva(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoParametroFormularioIva()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoParametroFormularioIvaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoParametroFormularioIvaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoParametroFormularioIvaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoparametroformularioivaSessionBean=new TipoParametroFormularioIvaSessionBean(); 
		this.tipoparametroformularioivaConstantesFunciones=new TipoParametroFormularioIvaConstantesFunciones(); 
		this.tipoparametroformularioivaBean=new TipoParametroFormularioIva();//(this.tipoparametroformularioivaConstantesFunciones); 		
		this.tipoparametroformularioivaReturnGeneral=new TipoParametroFormularioIvaParameterReturnGeneral(); 
		
		this.tipoparametroformularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoparametroformularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoParametroFormularioIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoParametroFormularioIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoParametroFormularioIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoParametroFormularioIva(true);
			
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
			
			this.tipoparametroformularioivaConstantesFunciones=new TipoParametroFormularioIvaConstantesFunciones(); 
			this.tipoparametroformularioivaBean=new TipoParametroFormularioIva();//this.tipoparametroformularioivaConstantesFunciones); 			
			this.tipoparametroformularioivaReturnGeneral=new TipoParametroFormularioIvaParameterReturnGeneral(); 
		
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Parametro Formulario Iva  Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoparametroformularioiva=new TipoParametroFormularioIva();
			this.tipoparametroformularioivas = new ArrayList<TipoParametroFormularioIva>();
			this.tipoparametroformularioivasAux = new ArrayList<TipoParametroFormularioIva>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic=new TipoParametroFormularioIvaLogic();
				this.tipoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoparametroformularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoparametroformularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoParametroFormularioIva);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoParametroFormularioIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoParametroFormularioIva);	
					}
					
					if(this.jInternalFrameImportacionTipoParametroFormularioIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoParametroFormularioIva);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoParametroFormularioIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoParametroFormularioIva);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoParametroFormularioIva);
				this.jInternalFrameDetalleFormTipoParametroFormularioIva.setVisible(false);
				this.jInternalFrameDetalleFormTipoParametroFormularioIva.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoParametroFormularioIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoParametroFormularioIva);
					this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoParametroFormularioIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoParametroFormularioIva);
					this.jInternalFrameImportacionTipoParametroFormularioIva.setVisible(false);
					this.jInternalFrameImportacionTipoParametroFormularioIva.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoParametroFormularioIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoParametroFormularioIva);
					this.jInternalFrameOrderByTipoParametroFormularioIva.setVisible(false);
					this.jInternalFrameOrderByTipoParametroFormularioIva.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoParametroFormularioIvaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoParametroFormularioIvaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoparametroformularioivaReturnGeneral=new TipoParametroFormularioIvaParameterReturnGeneral();
			
			this.tipoparametroformularioivaParameterGeneral=new TipoParametroFormularioIvaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoparametroformularioivaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoParametroFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ParametroFormularioIvaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoParametroFormularioIvaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado(),this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoParametroFormularioIvaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado(),this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaDuplicarTipoParametroFormularioIva=true;
			this.isVisibilidadCeldaCopiarTipoParametroFormularioIva=true;
			this.isVisibilidadCeldaVerFormTipoParametroFormularioIva=true;
			this.isVisibilidadCeldaOrdenTipoParametroFormularioIva=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaModificarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaEliminarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoParametroFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoParametroFormularioIva();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoParametroFormularioIva(false);
			
			this.setPermisosUsuarioTipoParametroFormularioIva();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado() && this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoParametroFormularioIvaClasesRelacionadas();
			}
			
			if(this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoParametroFormularioIvaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoParametroFormularioIva();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoParametroFormularioIva();
			}
			
			if(!this.isPermisoBusquedaTipoParametroFormularioIva) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoParametroFormularioIva,this.isPermisoPaginacionMedioTipoParametroFormularioIva,this.isPermisoPaginacionTodoTipoParametroFormularioIva);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoParametroFormularioIvaConstantesFunciones.getTiposSeleccionarTipoParametroFormularioIva());
				
				this.tiposColumnasSelect=TipoParametroFormularioIvaConstantesFunciones.getTiposSeleccionarTipoParametroFormularioIva(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoParametroFormularioIva();				
				//this.tiposRelacionesSelect=TipoParametroFormularioIvaConstantesFunciones.getTiposRelacionesTipoParametroFormularioIva(true);
				
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
			//if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoParametroFormularioIva();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoParametroFormularioIva(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoParametroFormularioIva(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoParametroFormularioIva() ;
			
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
			
			
			this.parametroformularioivaLogic=new ParametroFormularioIvaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipoparametroformularioivaImplementable= (TipoParametroFormularioIvaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoParametroFormularioIvaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoparametroformularioivaImplementableHome= (TipoParametroFormularioIvaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoParametroFormularioIvaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoparametroformularioivas= new ArrayList<TipoParametroFormularioIva>();
			this.tipoparametroformularioivasEliminados= new ArrayList<TipoParametroFormularioIva>();
						
			this.isEsNuevoTipoParametroFormularioIva=false;
			this.esParaAccionDesdeFormularioTipoParametroFormularioIva=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoParametroFormularioIva(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoParametroFormularioIva();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoParametroFormularioIvaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoParametroFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoParametroFormularioIva(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoParametroFormularioIva();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoParametroFormularioIva();
			}
			
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoParametroFormularioIva(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoParametroFormularioIva: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoParametroFormularioIva() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoParametroFormularioIva")) {
				iIndex=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTabbedPaneRelacionesTipoParametroFormularioIva.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTabbedPaneRelacionesTipoParametroFormularioIva.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Formulario Ivas")) {
					if(!ParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoParametroFormularioIva();

						this.cargarParteTabPanelRelacionadaParametroFormularioIva(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoParametroFormularioIva();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroFormularioIva(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.cargarSessionConBeanSwingJInternalFrameParametroFormularioIva(false,true,iIndex);
		this.jButtonParametroFormularioIvaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroFormularioIva();

		//this.jTabbedPaneRelacionesTipoParametroFormularioIva.updateUI();
		//this.jTabbedPaneRelacionesTipoParametroFormularioIva.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoParametroFormularioIva.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ParametroFormularioIva")) {
				int row=this.jTableDatosTipoParametroFormularioIva.getSelectedRow();
				jButtonParametroFormularioIvaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Parametro Formulario Iva")) {

					if(this.isTienePermisosParametroFormularioIva && this.tipoparametroformularioivaConstantesFunciones.mostrarParametroFormularioIvaTipoParametroFormularioIva && !TipoParametroFormularioIvaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Formulario Ivas"+"("+ParametroFormularioIvaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Formulario Ivas");

						if(tipoparametroformularioivaConstantesFunciones.resaltarParametroFormularioIvaTipoParametroFormularioIva!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoparametroformularioivaConstantesFunciones.resaltarParametroFormularioIvaTipoParametroFormularioIva);
						}

						jmenuItem.setEnabled(this.tipoparametroformularioivaConstantesFunciones.activarParametroFormularioIvaTipoParametroFormularioIva);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroFormularioIva"));

						

						this.jInternalFrameDetalleFormTipoParametroFormularioIva.jmenuDetalleTipoParametroFormularioIva.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoParametroFormularioIva(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoParametroFormularioIva(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoParametroFormularioIva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoParametroFormularioIvaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoParametroFormularioIva();
		
		this.cargarCombosFrameForeignKeyTipoParametroFormularioIva();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoParametroFormularioIva();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoParametroFormularioIva();
		}
	}
	
	
	
	public void jButtonNuevoTipoParametroFormularioIvaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
			
			
			if(jTableDatosTipoParametroFormularioIva.getRowCount()>=1) {
				jTableDatosTipoParametroFormularioIva.removeRowSelectionInterval(0, jTableDatosTipoParametroFormularioIva.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoParametroFormularioIva=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoParametroFormularioIva(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoParametroFormularioIva(true);			
			//this.tipoparametroformularioiva=new TipoParametroFormularioIva();
			//this.tipoparametroformularioiva.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoParametroFormularioIva(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParametroFormularioIva() ;
			
			if(TipoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoParametroFormularioIva(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoparametroformularioiva);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroformularioiva);				
			
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
			
			if(this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoParametroFormularioIva: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoParametroFormularioIvaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoParametroFormularioIva> tipoparametroformularioivasSeleccionados=new ArrayList<TipoParametroFormularioIva>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoParametroFormularioIva.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoParametroFormularioIva.getSelectedRows().length;			
			}
			
			tipoparametroformularioivasSeleccionados=this.getTipoParametroFormularioIvasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoParametroFormularioIva--;			
				//TipoParametroFormularioIva tipoparametroformularioivaAux= new TipoParametroFormularioIva();			
				//tipoparametroformularioivaAux.setId(this.iIdNuevoTipoParametroFormularioIva);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoParametroFormularioIva tipoparametroformularioivaOrigen=new TipoParametroFormularioIva();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoParametroFormularioIva tipoparametroformularioivaOrigen : tipoparametroformularioivasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoparametroformularioivaOrigen =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparametroformularioivaOrigen =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoParametroFormularioIva();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoparametroformularioiva.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoParametroFormularioIva(tipoparametroformularioivaOrigen,this.tipoparametroformularioiva,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroFormularioIva(this.tipoparametroformularioiva);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().add(this.tipoparametroformularioivaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoparametroformularioivas.add(this.tipoparametroformularioivaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoParametroFormularioIva(false);
				
				this.jTableDatosTipoParametroFormularioIva.setRowSelectionInterval(this.getIndiceNuevoTipoParametroFormularioIva(), this.getIndiceNuevoTipoParametroFormularioIva());
				
				int iLastRow =  this.jTableDatosTipoParametroFormularioIva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoParametroFormularioIva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoParametroFormularioIva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoParametroFormularioIva(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoParametroFormularioIva> tipoparametroformularioivasSeleccionados=new ArrayList<TipoParametroFormularioIva>();									
		
			TipoParametroFormularioIva tipoparametroformularioivaOrigen=new TipoParametroFormularioIva();
			TipoParametroFormularioIva tipoparametroformularioivaDestino=new TipoParametroFormularioIva();
				
			tipoparametroformularioivasSeleccionados=this.getTipoParametroFormularioIvasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoParametroFormularioIva.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoparametroformularioivasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoParametroFormularioIva.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparametroformularioivaOrigen =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoparametroformularioivaOrigen =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparametroformularioivaDestino =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoparametroformularioivaDestino =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoparametroformularioivaOrigen =tipoparametroformularioivasSeleccionados.get(0);
				tipoparametroformularioivaDestino =tipoparametroformularioivasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoParametroFormularioIva(tipoparametroformularioivaOrigen,tipoparametroformularioivaDestino,true,false);
				
				tipoparametroformularioivaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoparametroformularioivaDestino,tipoparametroformularioivaLogic.getTipoParametroFormularioIvas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparametroformularioivaDestino,tipoparametroformularioivas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoParametroFormularioIva(false);
				
				//this.jTableDatosTipoParametroFormularioIva.setRowSelectionInterval(this.getIndiceNuevoTipoParametroFormularioIva(), this.getIndiceNuevoTipoParametroFormularioIva());
				
				int iLastRow =  this.jTableDatosTipoParametroFormularioIva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoParametroFormularioIva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoParametroFormularioIva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoParametroFormularioIva(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoParametroFormularioIva.isVisible();
			
			
			this.jPanelParametrosReportesTipoParametroFormularioIva.setVisible(!isVisible);
			this.jPanelPaginacionTipoParametroFormularioIva.setVisible(!isVisible);
			this.jPanelAccionesTipoParametroFormularioIva.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoParametroFormularioIva();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoParametroFormularioIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoParametroFormularioIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoParametroFormularioIva();
			
			this.abrirFrameOrderByTipoParametroFormularioIva();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoParametroFormularioIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoParametroFormularioIva(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoParametroFormularioIva);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.isMaximum()) {
					this.jInternalFrameDetalleFormTipoParametroFormularioIva.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoParametroFormularioIva.setSize(this.jInternalFrameDetalleFormTipoParametroFormularioIva.iWidthFormulario,this.jInternalFrameDetalleFormTipoParametroFormularioIva.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoParametroFormularioIva.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoParametroFormularioIva.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoParametroFormularioIva.isMaximum()) {
						this.jInternalFrameDetalleFormTipoParametroFormularioIva.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.jContentPaneDetalleTipoParametroFormularioIva.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTabbedPaneRelacionesTipoParametroFormularioIva.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoParametroFormularioIva.jContentPaneDetalleTipoParametroFormularioIva.getWidth(),TipoParametroFormularioIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTabbedPaneRelacionesTipoParametroFormularioIva.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoParametroFormularioIva.jContentPaneDetalleTipoParametroFormularioIva.getWidth(),TipoParametroFormularioIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTabbedPaneRelacionesTipoParametroFormularioIva.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoParametroFormularioIva.jContentPaneDetalleTipoParametroFormularioIva.getWidth(),TipoParametroFormularioIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroFormularioIva();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoParametroFormularioIva.setVisible(true);
	        this.jInternalFrameDetalleFormTipoParametroFormularioIva.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoParametroFormularioIva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoParametroFormularioIva==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoParametroFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParametroFormularioIva,false,this);
				} else {
					this.jInternalFrameOrderByTipoParametroFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParametroFormularioIva,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoParametroFormularioIva);
				this.jInternalFrameOrderByTipoParametroFormularioIva.setVisible(false);
				this.jInternalFrameOrderByTipoParametroFormularioIva.setSelected(false);
				
				this.jInternalFrameOrderByTipoParametroFormularioIva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoParametroFormularioIva"));
				
				this.inicializarActualizarBindingTablaOrderByTipoParametroFormularioIva();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoParametroFormularioIva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoParametroFormularioIva==null) {
				
				this.jInternalFrameImportacionTipoParametroFormularioIva=new ImportacionJInternalFrame(TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoParametroFormularioIva);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoParametroFormularioIva);
				this.jInternalFrameImportacionTipoParametroFormularioIva.setVisible(false);
				this.jInternalFrameImportacionTipoParametroFormularioIva.setSelected(false);


				this.jInternalFrameImportacionTipoParametroFormularioIva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoParametroFormularioIva"));
				this.jInternalFrameImportacionTipoParametroFormularioIva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoParametroFormularioIva"));
				this.jInternalFrameImportacionTipoParametroFormularioIva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoParametroFormularioIva"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoParametroFormularioIva() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoParametroFormularioIva==null) {
				this.jInternalFrameReporteDinamicoTipoParametroFormularioIva=new ReporteDinamicoJInternalFrame(TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoParametroFormularioIva);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoParametroFormularioIva);
				this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoParametroFormularioIva"));
				this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoParametroFormularioIva"));
				this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoParametroFormularioIva"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoParametroFormularioIva();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroFormularioIva() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jScrollPanelDatosParametroFormularioIva.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoParametroFormularioIva.jContentPaneDetalleTipoParametroFormularioIva.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jScrollPanelDatosParametroFormularioIva.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jScrollPanelDatosParametroFormularioIva.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jScrollPanelDatosParametroFormularioIva.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoParametroFormularioIva() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoParametroFormularioIva);
			
	       	this.jInternalFrameDetalleFormTipoParametroFormularioIva.setVisible(false);
	        this.jInternalFrameDetalleFormTipoParametroFormularioIva.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoParametroFormularioIva.dispose();
			//this.jInternalFrameDetalleFormTipoParametroFormularioIva=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoParametroFormularioIva() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoParametroFormularioIva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoParametroFormularioIva.setVisible(true);
	        this.jInternalFrameImportacionTipoParametroFormularioIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoParametroFormularioIva() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoParametroFormularioIva.setVisible(true);
	        this.jInternalFrameOrderByTipoParametroFormularioIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoParametroFormularioIva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoParametroFormularioIva.setVisible(false);
	        this.jInternalFrameOrderByTipoParametroFormularioIva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoParametroFormularioIva() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoParametroFormularioIva() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoParametroFormularioIva.setVisible(false);
	        this.jInternalFrameImportacionTipoParametroFormularioIva.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoParametroFormularioIva(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoParametroFormularioIva(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoParametroFormularioIva(true);
			//this.isEsNuevoTipoParametroFormularioIva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoParametroFormularioIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoParametroFormularioIva(false) ;
			
			if(tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.getEsGuardarRelacionado() && ParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroFormularioIvaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoParametroFormularioIva(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParametroFormularioIva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoParametroFormularioIvaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoParametroFormularioIva(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoParametroFormularioIva(true);
			//this.isEsNuevoTipoParametroFormularioIva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoparametroformularioiva.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoParametroFormularioIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoParametroFormularioIva(false) ;
			
			if(TipoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoParametroFormularioIva(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParametroFormularioIva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoParametroFormularioIva(false);
			
			//if(!this.isEsNuevoTipoParametroFormularioIva) {								
				int intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoParametroFormularioIva(this.tipoparametroformularioiva,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroFormularioIva(this.tipoparametroformularioiva);
				
			}
			
			if(this.permiteMantenimiento(this.tipoparametroformularioiva)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoParametroFormularioIva=true;
					this.inicializarActualizarBindingTablaTipoParametroFormularioIva(false);
					this.isEsNuevoTipoParametroFormularioIva=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoParametroFormularioIva=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoParametroFormularioIva=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoParametroFormularioIva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoParametroFormularioIva(false);
				
				this.habilitarDeshabilitarControlesTipoParametroFormularioIva(false);
			
												
				
				if(TipoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoParametroFormularioIva();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoParametroFormularioIvaActionPerformed(evt,tipoparametroformularioivaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoParametroFormularioIva(this.tipoparametroformularioiva,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoParametroFormularioIva.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoparametroformularioivaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoparametroformularioiva.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoParametroFormularioIva.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroFormularioIva.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				this.tipoparametroformularioiva.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				this.tipoparametroformularioiva.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoparametroformularioiva)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoParametroFormularioIvaModel) this.jTableDatosTipoParametroFormularioIva.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoParametroFormularioIva=true;
				this.inicializarActualizarBindingTablaTipoParametroFormularioIva(false);
				this.isEsNuevoTipoParametroFormularioIva=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoParametroFormularioIva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoParametroFormularioIva(false);
				
				this.habilitarDeshabilitarControlesTipoParametroFormularioIva(false);
				
				
				
				if(TipoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoParametroFormularioIva();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoParametroFormularioIva.getRowCount()>=1) {
				jTableDatosTipoParametroFormularioIva.removeRowSelectionInterval(0, jTableDatosTipoParametroFormularioIva.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoParametroFormularioIva(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoParametroFormularioIva(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoParametroFormularioIva(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParametroFormularioIva(false) ;
			
			this.isEsNuevoTipoParametroFormularioIva=false;
			
			if(TipoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoParametroFormularioIva();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoParametroFormularioIva(false);
				
				//SI ES MANUAL
				if(TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoParametroFormularioIva();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoParametroFormularioIva--;			
			//TipoParametroFormularioIva tipoparametroformularioivaAux= new TipoParametroFormularioIva();			
			//tipoparametroformularioivaAux.setId(this.iIdNuevoTipoParametroFormularioIva);
			
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoParametroFormularioIva();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroFormularioIva(this.tipoparametroformularioiva);
			
			this.tipoparametroformularioiva.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().add(this.tipoparametroformularioivaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoparametroformularioivas.add(this.tipoparametroformularioivaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoParametroFormularioIva(false);
			
			this.jTableDatosTipoParametroFormularioIva.setRowSelectionInterval(this.getIndiceNuevoTipoParametroFormularioIva(), this.getIndiceNuevoTipoParametroFormularioIva());
			
			int iLastRow =  this.jTableDatosTipoParametroFormularioIva.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoParametroFormularioIva.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoParametroFormularioIva.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoParametroFormularioIva(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoParametroFormularioIva(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParametroFormularioIva(false);
			
			//SI ES MANUAL
			if(TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoParametroFormularioIva();
			}
			
			//this.abrirFrameTreeTipoParametroFormularioIva();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Parametro Formulario Iva S ?", "MANTENIMIENTO DE Tipo Parametro Formulario Iva ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoParametroFormularioIva.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoParametroFormularioIva();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoparametroformularioivaReturnGeneral=tipoparametroformularioivaLogic.procesarImportacionTipoParametroFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoparametroformularioivaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoParametroFormularioIvaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoParametroFormularioIva.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoParametroFormularioIva.setFileImportacion(this.jInternalFrameImportacionTipoParametroFormularioIva.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoParametroFormularioIva.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoParametroFormularioIva.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoParametroFormularioIva.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoParametroFormularioIva.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoParametroFormularioIva> tipoparametroformularioivasSeleccionados=new ArrayList<TipoParametroFormularioIva>();		

		tipoparametroformularioivasSeleccionados=this.getTipoParametroFormularioIvasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoParametroFormularioIvaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoParametroFormularioIvaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoParametroFormularioIvas("Todos",tipoparametroformularioivasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoSri_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoSri_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoSri_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoSri_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI:
					sNombreCampoCategoria="codigo_sri";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI:
					sNombreCampoCategoriaValor="codigo_sri";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Sri",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_sri");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoParametroFormularioIva> tipoparametroformularioivasSeleccionados=new ArrayList<TipoParametroFormularioIva>();		
		
		tipoparametroformularioivasSeleccionados=this.getTipoParametroFormularioIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparametroformularioiva";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoParametroFormularioIvas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoParametroFormularioIva tipoparametroformularioiva:tipoparametroformularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoparametroformularioiva.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI);
					iRow++;

					for(TipoParametroFormularioIva tipoparametroformularioiva:tipoparametroformularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoparametroformularioiva.getcodigo_sri());
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
			//	this.getFilaCabeceraExportarExcelTipoParametroFormularioIva(row);				
			//	iRow++;
			//}				
			
			//for(TipoParametroFormularioIva tipoparametroformularioivaAux:tipoparametroformularioivasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoParametroFormularioIva(tipoparametroformularioivaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParametroFormularioIva(false);
			
			//SI ES MANUAL
			if(TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoParametroFormularioIva();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParametroFormularioIva(false);
			
			//SI ES MANUAL
			if(TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoParametroFormularioIva();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParametroFormularioIva(false);
			
			//SI ES MANUAL
			if(TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoParametroFormularioIva();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoParametroFormularioIva() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoParametroFormularioIva.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoParametroFormularioIva.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoParametroFormularioIva.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoParametroFormularioIva.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoParametroFormularioIva.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoParametroFormularioIva.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoParametroFormularioIva.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoParametroFormularioIva(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoParametroFormularioIva(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoParametroFormularioIva(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoParametroFormularioIva(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoParametroFormularioIva(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoParametroFormularioIva(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoParametroFormularioIva(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoParametroFormularioIva(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoParametroFormularioIva() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoParametroFormularioIva();
		
		this.inicializarActualizarBindingBotonesManualTipoParametroFormularioIva(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoParametroFormularioIva();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoParametroFormularioIva() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoParametroFormularioIva(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoParametroFormularioIva(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoParametroFormularioIva.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoParametroFormularioIva.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoParametroFormularioIva.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jCheckBoxPostAccionNuevoTipoParametroFormularioIva.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jCheckBoxPostAccionSinCerrarTipoParametroFormularioIva.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jCheckBoxPostAccionSinMensajeTipoParametroFormularioIva.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoParametroFormularioIva.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoParametroFormularioIva.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoParametroFormularioIva.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {
				this.jInternalFrameDetalleFormTipoParametroFormularioIva.jCheckBoxPostAccionNuevoTipoParametroFormularioIva.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoParametroFormularioIva.jCheckBoxPostAccionSinCerrarTipoParametroFormularioIva.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoParametroFormularioIva.jCheckBoxPostAccionSinMensajeTipoParametroFormularioIva.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoParametroFormularioIva.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoParametroFormularioIva.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoParametroFormularioIva.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoParametroFormularioIva.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoParametroFormularioIva!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoParametroFormularioIva.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoParametroFormularioIva.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoParametroFormularioIva.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoParametroFormularioIva.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoParametroFormularioIva!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoParametroFormularioIva.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoParametroFormularioIva.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoParametroFormularioIva(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoParametroFormularioIva(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoParametroFormularioIva() throws Exception {
		try	{
			if(TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoParametroFormularioIva();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoParametroFormularioIva() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoParametroFormularioIva() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoParametroFormularioIva.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoParametroFormularioIva.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoParametroFormularioIva.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoParametroFormularioIva.addItem(reporte);
			}
			
			
			if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoParametroFormularioIva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoParametroFormularioIva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoParametroFormularioIva.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoParametroFormularioIva.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoParametroFormularioIva.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoParametroFormularioIva.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoParametroFormularioIva.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoParametroFormularioIva.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoParametroFormularioIva();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoParametroFormularioIva() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoParametroFormularioIva!=null) {
				this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoParametroFormularioIva!=null) {
				this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoParametroFormularioIva!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoParametroFormularioIva()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoParametroFormularioIva(Boolean esInicializar) throws Exception {				
		if(TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoParametroFormularioIva();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoParametroFormularioIva() throws Exception {
		this.inicializarActualizarBindingTablaTipoParametroFormularioIva(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoParametroFormularioIva() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoParametroFormularioIva.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoParametroFormularioIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoParametroFormularioIva.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoParametroFormularioIvaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoParametroFormularioIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoParametroFormularioIva.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoParametroFormularioIvaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoParametroFormularioIvaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParametroFormularioIvaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoParametroFormularioIvaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoParametroFormularioIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoParametroFormularioIva.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoParametroFormularioIvaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoParametroFormularioIva.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoParametroFormularioIva(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoparametroformularioivas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoParametroFormularioIva.setModel(new TipoParametroFormularioIvaModel(this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoParametroFormularioIva.setModel(new TipoParametroFormularioIvaModel(this.tipoparametroformularioivas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoParametroFormularioIva!=null && this.jInternalFrameOrderByTipoParametroFormularioIva.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoParametroFormularioIva();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoParametroFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParametroFormularioIva,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoParametroFormularioIvaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,tipoparametroformularioivaConstantesFunciones.resaltarSeleccionarTipoParametroFormularioIva,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,tipoparametroformularioivaConstantesFunciones.resaltarSeleccionarTipoParametroFormularioIva,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoParametroFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParametroFormularioIva,TipoParametroFormularioIvaConstantesFunciones.LABEL_ID));

		if(this.tipoparametroformularioivaConstantesFunciones.mostraridTipoParametroFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoParametroFormularioIvaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoparametroformularioivaConstantesFunciones.resaltaridTipoParametroFormularioIva,this.tipoparametroformularioivaConstantesFunciones.activaridTipoParametroFormularioIva,this,true,"idTipoParametroFormularioIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoparametroformularioivaConstantesFunciones.resaltaridTipoParametroFormularioIva,this.tipoparametroformularioivaConstantesFunciones.activaridTipoParametroFormularioIva,this,true,"idTipoParametroFormularioIva","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoParametroFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParametroFormularioIva,TipoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoparametroformularioivaConstantesFunciones.mostrarnombreTipoParametroFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoparametroformularioivaConstantesFunciones.resaltarnombreTipoParametroFormularioIva,this.tipoparametroformularioivaConstantesFunciones.activarnombreTipoParametroFormularioIva,this,true,"nombreTipoParametroFormularioIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoparametroformularioivaConstantesFunciones.resaltarnombreTipoParametroFormularioIva,this.tipoparametroformularioivaConstantesFunciones.activarnombreTipoParametroFormularioIva,this,true,"nombreTipoParametroFormularioIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoParametroFormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoParametroFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParametroFormularioIva,TipoParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI));

		if(this.tipoparametroformularioivaConstantesFunciones.mostrarcodigo_sriTipoParametroFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoparametroformularioivaConstantesFunciones.resaltarcodigo_sriTipoParametroFormularioIva,this.tipoparametroformularioivaConstantesFunciones.activarcodigo_sriTipoParametroFormularioIva,this,true,"codigo_sriTipoParametroFormularioIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoparametroformularioivaConstantesFunciones.resaltarcodigo_sriTipoParametroFormularioIva,this.tipoparametroformularioivaConstantesFunciones.activarcodigo_sriTipoParametroFormularioIva,this,true,"codigo_sriTipoParametroFormularioIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoParametroFormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosParametroFormularioIva && this.tipoparametroformularioivaConstantesFunciones.mostrarParametroFormularioIvaTipoParametroFormularioIva && !TipoParametroFormularioIvaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Formulario Ivas");
				tableColumn.setHeaderValue("Parametro Formulario Ivas");
				tableColumn.setCellRenderer(new ParametroFormularioIvaTableCell(tipoparametroformularioivaConstantesFunciones.resaltarParametroFormularioIvaTipoParametroFormularioIva,this,this.tipoparametroformularioivaConstantesFunciones.activarParametroFormularioIvaTipoParametroFormularioIva));
				tableColumn.setCellEditor(new ParametroFormularioIvaTableCell(tipoparametroformularioivaConstantesFunciones.resaltarParametroFormularioIvaTipoParametroFormularioIva,this,this.tipoparametroformularioivaConstantesFunciones.activarParametroFormularioIvaTipoParametroFormularioIva));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoParametroFormularioIva.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoParametroFormularioIva.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoParametroFormularioIva.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoParametroFormularioIva && this.isPermisoGuardarCambiosTipoParametroFormularioIva) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoParametroFormularioIva.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoParametroFormularioIva.addColumn(tableColumn);
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
			
			this.jTableDatosTipoParametroFormularioIva.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoParametroFormularioIva && this.isPermisoGuardarCambiosTipoParametroFormularioIva) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoParametroFormularioIva && this.isPermisoGuardarCambiosTipoParametroFormularioIva) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoParametroFormularioIva.moveColumn(this.jTableDatosTipoParametroFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoParametroFormularioIva.moveColumn(this.jTableDatosTipoParametroFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoParametroFormularioIva.moveColumn(this.jTableDatosTipoParametroFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoParametroFormularioIva.moveColumn(this.jTableDatosTipoParametroFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoParametroFormularioIva.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoParametroFormularioIva.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoParametroFormularioIva,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoParametroFormularioIva.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoParametroFormularioIva.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoParametroFormularioIva.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoParametroFormularioIva.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoParametroFormularioIva.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoparametroformularioivas.size()-1;
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
		//this.jTableDatosTipoParametroFormularioIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoParametroFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoParametroFormularioIva();
			
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
				
				//this.isEsNuevoTipoParametroFormularioIva=false;
					
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
			
				if(this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoParametroFormularioIva==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoParametroFormularioIva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoParametroFormularioIva.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoparametroformularioiva.getsType().equals("DUPLICADO")
				   || this.tipoparametroformularioiva.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoParametroFormularioIva=true;
				
				} else {
					this.isEsNuevoTipoParametroFormularioIva=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoparametroformularioiva.getId()>=0 && !this.tipoparametroformularioiva.getIsNew()) {						
						this.isEsNuevoTipoParametroFormularioIva=false;
						
					} else {
						this.isEsNuevoTipoParametroFormularioIva=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoParametroFormularioIva(esRelaciones);						
				
				this.seleccionarTipoParametroFormularioIva(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoparametroformularioiva.getId()<0) {
					this.isEsNuevoTipoParametroFormularioIva=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoParametroFormularioIva(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoParametroFormularioIva(evt,rowIndex);
				}	
				
				if(this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoParametroFormularioIva: " + this.dDif); 
					}
				}								
				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoParametroFormularioIva(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoparametroformularioiva)) {
					if(this.tipoparametroformularioiva.getId()>0) {
						this.tipoparametroformularioiva.setIsDeleted(true);
						
						this.tipoparametroformularioivasEliminados.add(this.tipoparametroformularioiva);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().remove(this.tipoparametroformularioiva);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoparametroformularioivas.remove(this.tipoparametroformularioiva);				
					}
					
					
					((TipoParametroFormularioIvaModel) this.jTableDatosTipoParametroFormularioIva.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoParametroFormularioIva(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoParametroFormularioIva(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoParametroFormularioIva) {
			
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoParametroFormularioIva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoParametroFormularioIva.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoParametroFormularioIva(this.tipoparametroformularioiva);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoParametroFormularioIva("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoParametroFormularioIva(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoParametroFormularioIva() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioiva) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoParametroFormularioIva(tipoparametroformularioiva,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioiva,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoParametroFormularioIva(tipoparametroformularioiva);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoParametroFormularioIva(tipoparametroformularioiva,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoParametroFormularioIva(tipoparametroformularioiva);
	}
	
	public void setVariablesObjetoActualToFormularioTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioiva) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldidTipoParametroFormularioIva.setText(tipoparametroformularioiva.getId().toString());
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextAreanombreTipoParametroFormularioIva.setText(tipoparametroformularioiva.getnombre());
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldcodigo_sriTipoParametroFormularioIva.setText(tipoparametroformularioiva.getcodigo_sri());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoParametroFormularioIva tipoparametroformularioivaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoparametroformularioivaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoParametroFormularioIva tipoparametroformularioivaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoparametroformularioivaLocal=this.tipoparametroformularioiva;
			} else {
				tipoparametroformularioivaLocal=this.tipoparametroformularioivaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoparametroformularioivaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoParametroFormularioIva(tipoparametroformularioivaLocal,true);
					
					if(tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoparametroformularioivaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoparametroformularioivaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioiva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoParametroFormularioIva(tipoparametroformularioiva,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroFormularioIva(tipoparametroformularioiva);
	}
	
	public void setVariablesFormularioToObjetoActualTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioiva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoParametroFormularioIva(tipoparametroformularioiva,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioiva,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldidTipoParametroFormularioIva.getText()==null || this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldidTipoParametroFormularioIva.getText()=="" || this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldidTipoParametroFormularioIva.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldidTipoParametroFormularioIva.setText("0");
			}

			if(conColumnasBase) {tipoparametroformularioiva.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldidTipoParametroFormularioIva.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoParametroFormularioIvaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParametroFormularioIva.jLabelIdTipoParametroFormularioIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoparametroformularioiva.setnombre(this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextAreanombreTipoParametroFormularioIva.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParametroFormularioIva.jLabelnombreTipoParametroFormularioIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoparametroformularioiva.setcodigo_sri(this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldcodigo_sriTipoParametroFormularioIva.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParametroFormularioIva.jLabelcodigo_sriTipoParametroFormularioIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioivaBean,TipoParametroFormularioIva tipoparametroformularioiva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioivaOrigen,TipoParametroFormularioIva tipoparametroformularioiva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoparametroformularioivaOrigen.getId()!=null && !tipoparametroformularioivaOrigen.getId().equals(0L))) {tipoparametroformularioiva.setId(tipoparametroformularioivaOrigen.getId());}}
			if(conDefault || (!conDefault && tipoparametroformularioivaOrigen.getnombre()!=null && !tipoparametroformularioivaOrigen.getnombre().equals(""))) {tipoparametroformularioiva.setnombre(tipoparametroformularioivaOrigen.getnombre());}
			if(conDefault || (!conDefault && tipoparametroformularioivaOrigen.getcodigo_sri()!=null && !tipoparametroformularioivaOrigen.getcodigo_sri().equals(""))) {tipoparametroformularioiva.setcodigo_sri(tipoparametroformularioivaOrigen.getcodigo_sri());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioiva) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldidTipoParametroFormularioIva.setText(tipoparametroformularioiva.getId().toString());
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextAreanombreTipoParametroFormularioIva.setText(tipoparametroformularioiva.getnombre());
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldcodigo_sriTipoParametroFormularioIva.setText(tipoparametroformularioiva.getcodigo_sri());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoParametroFormularioIva(TipoParametroFormularioIvaBean tipoparametroformularioivaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldidTipoParametroFormularioIva.setText(tipoparametroformularioivaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextAreanombreTipoParametroFormularioIva.setText(tipoparametroformularioivaBean.getnombre());
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldcodigo_sriTipoParametroFormularioIva.setText(tipoparametroformularioivaBean.getcodigo_sri());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoParametroFormularioIva(TipoParametroFormularioIvaParameterReturnGeneral tipoparametroformularioivaReturnGeneral,TipoParametroFormularioIvaBean tipoparametroformularioivaBean,Boolean conDefault) throws Exception { 
		try {
			TipoParametroFormularioIva tipoparametroformularioivaLocal=new TipoParametroFormularioIva();
			
			tipoparametroformularioivaLocal=tipoparametroformularioivaReturnGeneral.getTipoParametroFormularioIva();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoparametroformularioivaLocal.getId()!=null && !tipoparametroformularioivaLocal.getId().equals(0L))) {tipoparametroformularioivaBean.setId(tipoparametroformularioivaLocal.getId());}}
			if(conDefault || (!conDefault && tipoparametroformularioivaLocal.getnombre()!=null && !tipoparametroformularioivaLocal.getnombre().equals(""))) {tipoparametroformularioivaBean.setnombre(tipoparametroformularioivaLocal.getnombre());}
			if(conDefault || (!conDefault && tipoparametroformularioivaLocal.getcodigo_sri()!=null && !tipoparametroformularioivaLocal.getcodigo_sri().equals(""))) {tipoparametroformularioivaBean.setcodigo_sri(tipoparametroformularioivaLocal.getcodigo_sri());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoParametroFormularioIvaGenerico(Long idTipoParametroFormularioIvaSeleccionado,JComboBox jComboBoxTipoParametroFormularioIva,List<TipoParametroFormularioIva> tipoparametroformularioivasLocal)throws Exception {
		try {
			TipoParametroFormularioIva  tipoparametroformularioivaTemp=null;

			for(TipoParametroFormularioIva tipoparametroformularioivaAux:tipoparametroformularioivasLocal) {
				if(tipoparametroformularioivaAux.getId()!=null && tipoparametroformularioivaAux.getId().equals(idTipoParametroFormularioIvaSeleccionado)) {
					tipoparametroformularioivaTemp=tipoparametroformularioivaAux;
					break;
				}
			}

			jComboBoxTipoParametroFormularioIva.setSelectedItem(tipoparametroformularioivaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoParametroFormularioIvaGenerico(JComboBox jComboBoxTipoParametroFormularioIva,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoParametroFormularioIva.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoParametroFormularioIva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoParametroFormularioIva.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoParametroFormularioIva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ParametroFormularioIva")) {
			jButtonParametroFormularioIvaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoparametroformularioiva=(TipoParametroFormularioIva) tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoparametroformularioiva =(TipoParametroFormularioIva) tipoparametroformularioivas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoParametroFormularioIva tipoparametroformularioivaRow=new TipoParametroFormularioIva();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoparametroformularioivaRow=(TipoParametroFormularioIva) tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoparametroformularioivaRow=(TipoParametroFormularioIva) tipoparametroformularioivas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonParametroFormularioIvaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoParametroFormularioIva tipoparametroformularioiva) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoParametroFormularioIva==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparametroformularioiva = (TipoParametroFormularioIva)this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoparametroformularioiva = (TipoParametroFormularioIva)this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoparametroformularioiva!=null) {
						this.tipoparametroformularioiva = tipoparametroformularioiva;
					} else {
						this.tipoparametroformularioiva = new TipoParametroFormularioIva();
					}
				}

				if(this.isTienePermisosParametroFormularioIva && this.permiteMantenimiento(this.tipoparametroformularioiva)) {
					ParametroFormularioIvaBeanSwingJInternalFrame parametroformularioivaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup=new ParametroFormularioIvaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametroformularioivaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup;
					} else {
						parametroformularioivaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame;
					}

					List<TipoParametroFormularioIva> tipoparametroformularioivas=new ArrayList<TipoParametroFormularioIva>();
					tipoparametroformularioivas.add(this.tipoparametroformularioiva);
					if(!esRelacionado) {
						//parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.setConGuardarRelaciones(false);
						//parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametroformularioivaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoParametroFormularioIva.cargarParametroFormularioIvaBeanSwingJInternalFrame(tipoparametroformularioivas,this.tipoparametroformularioiva,parametroformularioivaBeanSwingJInternalFrame,/*conInicializar,*/parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.getConGuardarRelaciones(),parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.getEsGuardarRelacionado());
					parametroformularioivaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametroformularioivaBeanSwingJInternalFrame.actualizarEstadoPanelsParametroFormularioIva("no_relacionado");

						parametroformularioivaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroFormularioIvaConstantesFunciones.ITAMANIOFILATABLA + (ParametroFormularioIvaConstantesFunciones.ITAMANIOFILATABLA/2));

						parametroformularioivaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoParametroFormularioIva=(TitledBorder)this.jScrollPanelDatosTipoParametroFormularioIva.getBorder();
						TitledBorder titledBorderParametroFormularioIva=(TitledBorder)parametroformularioivaBeanSwingJInternalFrame.jScrollPanelDatosParametroFormularioIva.getBorder();

						titledBorderParametroFormularioIva.setTitle(titledBorderTipoParametroFormularioIva.getTitle() + " -> Parametro Formulario Iva");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametroformularioivaBeanSwingJInternalFrame);
						}

						parametroformularioivaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametroformularioivaBeanSwingJInternalFrame);

						parametroformularioivaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Formulario Iva",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoParametroFormularioIva(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoTipoParametroFormularioIva && this.isPermisoNuevoTipoParametroFormularioIva));			
			this.jButtonDuplicarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaDuplicarTipoParametroFormularioIva && this.isPermisoDuplicarTipoParametroFormularioIva));			
			this.jButtonCopiarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaCopiarTipoParametroFormularioIva && this.isPermisoCopiarTipoParametroFormularioIva));
			this.jButtonVerFormTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaVerFormTipoParametroFormularioIva && this.isPermisoVerFormTipoParametroFormularioIva));
			
			this.jButtonAbrirOrderByTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaOrdenTipoParametroFormularioIva && this.isPermisoOrdenTipoParametroFormularioIva));			
			
			this.jButtonNuevoRelacionesTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva && this.isPermisoNuevoTipoParametroFormularioIva));			
			this.jButtonNuevoGuardarCambiosTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoTipoParametroFormularioIva && this.isPermisoNuevoTipoParametroFormularioIva && this.isPermisoGuardarCambiosTipoParametroFormularioIva));
			
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonModificarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaModificarTipoParametroFormularioIva && this.isPermisoActualizarTipoParametroFormularioIva));	
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonActualizarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaActualizarTipoParametroFormularioIva && this.isPermisoActualizarTipoParametroFormularioIva));	
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonEliminarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaEliminarTipoParametroFormularioIva && this.isPermisoEliminarTipoParametroFormularioIva));
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonCancelarTipoParametroFormularioIva.setVisible(this.isVisibilidadCeldaCancelarTipoParametroFormularioIva);							
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonGuardarCambiosTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarTipoParametroFormularioIva && this.isPermisoGuardarCambiosTipoParametroFormularioIva));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva && this.isPermisoGuardarCambiosTipoParametroFormularioIva));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoTipoParametroFormularioIva && this.isPermisoNuevoTipoParametroFormularioIva));						
			this.jButtonDuplicarToolBarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaDuplicarTipoParametroFormularioIva && this.isPermisoDuplicarTipoParametroFormularioIva));						
			this.jButtonCopiarToolBarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaCopiarTipoParametroFormularioIva && this.isPermisoCopiarTipoParametroFormularioIva));			
			this.jButtonVerFormToolBarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaVerFormTipoParametroFormularioIva && this.isPermisoVerFormTipoParametroFormularioIva));			
			this.jButtonAbrirOrderByToolBarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaOrdenTipoParametroFormularioIva && this.isPermisoOrdenTipoParametroFormularioIva));
			this.jButtonNuevoRelacionesToolBarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva && this.isPermisoNuevoTipoParametroFormularioIva));			
			this.jButtonNuevoGuardarCambiosToolBarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoTipoParametroFormularioIva && this.isPermisoNuevoTipoParametroFormularioIva && this.isPermisoGuardarCambiosTipoParametroFormularioIva));			
			
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonModificarToolBarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaModificarTipoParametroFormularioIva && this.isPermisoActualizarTipoParametroFormularioIva));	
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonActualizarToolBarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaActualizarTipoParametroFormularioIva  && this.isPermisoActualizarTipoParametroFormularioIva));	
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonEliminarToolBarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaEliminarTipoParametroFormularioIva && this.isPermisoEliminarTipoParametroFormularioIva));
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonCancelarToolBarTipoParametroFormularioIva.setVisible(this.isVisibilidadCeldaCancelarTipoParametroFormularioIva);				
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonGuardarCambiosToolBarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarTipoParametroFormularioIva && this.isPermisoGuardarCambiosTipoParametroFormularioIva));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva && this.isPermisoGuardarCambiosTipoParametroFormularioIva));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoTipoParametroFormularioIva && this.isPermisoNuevoTipoParametroFormularioIva));			
			this.jMenuItemDuplicarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaDuplicarTipoParametroFormularioIva && this.isPermisoDuplicarTipoParametroFormularioIva));			
			this.jMenuItemCopiarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaCopiarTipoParametroFormularioIva && this.isPermisoCopiarTipoParametroFormularioIva));			
			this.jMenuItemVerFormTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaVerFormTipoParametroFormularioIva && this.isPermisoVerFormTipoParametroFormularioIva));			
			this.jMenuItemAbrirOrderByTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaOrdenTipoParametroFormularioIva && this.isPermisoOrdenTipoParametroFormularioIva));			
			//this.jMenuItemMostrarOcultarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaOrdenTipoParametroFormularioIva && this.isPermisoOrdenTipoParametroFormularioIva));
			this.jMenuItemDetalleAbrirOrderByTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaOrdenTipoParametroFormularioIva && this.isPermisoOrdenTipoParametroFormularioIva));			
			//this.jMenuItemDetalleMostrarOcultarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaOrdenTipoParametroFormularioIva && this.isPermisoOrdenTipoParametroFormularioIva));			
			this.jMenuItemNuevoRelacionesTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva && this.isPermisoNuevoTipoParametroFormularioIva));			
			this.jMenuItemNuevoGuardarCambiosTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoTipoParametroFormularioIva && this.isPermisoNuevoTipoParametroFormularioIva && this.isPermisoGuardarCambiosTipoParametroFormularioIva));									
			
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jMenuItemModificarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaModificarTipoParametroFormularioIva && this.isPermisoActualizarTipoParametroFormularioIva));	
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jMenuItemActualizarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaActualizarTipoParametroFormularioIva && this.isPermisoActualizarTipoParametroFormularioIva));	
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jMenuItemEliminarTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaEliminarTipoParametroFormularioIva && this.isPermisoEliminarTipoParametroFormularioIva));
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jMenuItemCancelarTipoParametroFormularioIva.setVisible(this.isVisibilidadCeldaCancelarTipoParametroFormularioIva);				
			}
			
			this.jMenuItemGuardarCambiosTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarTipoParametroFormularioIva && this.isPermisoGuardarCambiosTipoParametroFormularioIva));						
			this.jMenuItemGuardarCambiosTablaTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva && this.isPermisoGuardarCambiosTipoParametroFormularioIva));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoParametroFormularioIva=this.jButtonNuevoTipoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaDuplicarTipoParametroFormularioIva=this.jButtonDuplicarTipoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaCopiarTipoParametroFormularioIva=this.jButtonCopiarTipoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaVerFormTipoParametroFormularioIva=this.jButtonVerFormTipoParametroFormularioIva.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoParametroFormularioIva=this.jButtonAbrirOrderByTipoParametroFormularioIva.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva=this.jButtonNuevoRelacionesTipoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaModificarTipoParametroFormularioIva=this.jButtonModificarTipoParametroFormularioIva.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {
			this.isVisibilidadCeldaActualizarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonActualizarTipoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaEliminarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonEliminarTipoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaCancelarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonCancelarTipoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaGuardarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonGuardarCambiosTipoParametroFormularioIva.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva=this.jButtonGuardarCambiosTablaTipoParametroFormularioIva.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoParametroFormularioIva=this.jButtonNuevoToolBarTipoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva=this.jButtonNuevoRelacionesToolBarTipoParametroFormularioIva.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {
			this.isVisibilidadCeldaModificarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonModificarToolBarTipoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaActualizarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonActualizarToolBarTipoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaEliminarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonEliminarToolBarTipoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaCancelarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonCancelarToolBarTipoParametroFormularioIva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoParametroFormularioIva=this.jButtonGuardarCambiosToolBarTipoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva=this.jButtonGuardarCambiosTablaToolBarTipoParametroFormularioIva.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoParametroFormularioIva=this.jMenuItemNuevoTipoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva=this.jMenuItemNuevoRelacionesTipoParametroFormularioIva.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {
			this.isVisibilidadCeldaModificarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jMenuItemModificarTipoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaActualizarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jMenuItemActualizarTipoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaEliminarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jMenuItemEliminarTipoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaCancelarTipoParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.jMenuItemCancelarTipoParametroFormularioIva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoParametroFormularioIva=this.jMenuItemGuardarCambiosTipoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva=this.jMenuItemGuardarCambiosTablaTipoParametroFormularioIva.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoParametroFormularioIva(Boolean esInicializar) {
		if(TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoParametroFormularioIva();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoParametroFormularioIva(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoParametroFormularioIva() {
		this.jButtonNuevoTipoParametroFormularioIva.setVisible(this.isPermisoNuevoTipoParametroFormularioIva);			
		this.jButtonDuplicarTipoParametroFormularioIva.setVisible(this.isPermisoDuplicarTipoParametroFormularioIva);			
		this.jButtonCopiarTipoParametroFormularioIva.setVisible(this.isPermisoCopiarTipoParametroFormularioIva);			
		this.jButtonVerFormTipoParametroFormularioIva.setVisible(this.isPermisoVerFormTipoParametroFormularioIva);			
		
		this.jButtonAbrirOrderByTipoParametroFormularioIva.setVisible(this.isPermisoOrdenTipoParametroFormularioIva);					
		
		this.jButtonNuevoRelacionesTipoParametroFormularioIva.setVisible(this.isPermisoNuevoTipoParametroFormularioIva);			
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonModificarTipoParametroFormularioIva.setVisible(this.isPermisoActualizarTipoParametroFormularioIva);	
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonActualizarTipoParametroFormularioIva.setVisible(this.isPermisoActualizarTipoParametroFormularioIva);	
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonEliminarTipoParametroFormularioIva.setVisible(this.isPermisoEliminarTipoParametroFormularioIva);
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonCancelarTipoParametroFormularioIva.setVisible(this.isVisibilidadCeldaCancelarTipoParametroFormularioIva);						
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonGuardarCambiosTipoParametroFormularioIva.setVisible(this.isPermisoGuardarCambiosTipoParametroFormularioIva);							
		}
		
		this.jButtonGuardarCambiosTablaTipoParametroFormularioIva.setVisible(this.isPermisoActualizarTipoParametroFormularioIva);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoParametroFormularioIva() {
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonModificarTipoParametroFormularioIva.setVisible(this.isPermisoActualizarTipoParametroFormularioIva);	
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonActualizarTipoParametroFormularioIva.setVisible(this.isPermisoActualizarTipoParametroFormularioIva);	
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonEliminarTipoParametroFormularioIva.setVisible(this.isPermisoEliminarTipoParametroFormularioIva);
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonCancelarTipoParametroFormularioIva.setVisible(this.isVisibilidadCeldaCancelarTipoParametroFormularioIva);							
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonGuardarCambiosTipoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarTipoParametroFormularioIva && this.isPermisoGuardarCambiosTipoParametroFormularioIva));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoParametroFormularioIva() {
		if(TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoParametroFormularioIva();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoParametroFormularioIva() {
	}
	
	public void jTableDatosTipoParametroFormularioIvaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoParametroFormularioIva(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoParametroFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoParametroFormularioIva(this.gettipoparametroformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroFormularioIva(this.tipoparametroformularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoparametroformularioiva==null) {
						this.tipoparametroformularioiva = new TipoParametroFormularioIva();
					}

					this.setVariablesFormularioToObjetoActualTipoParametroFormularioIva(this.tipoparametroformularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroFormularioIva(this.tipoparametroformularioiva);
				}

				if(this.tipoparametroformularioiva.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoparametroformularioiva.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoParametroFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoParametroFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoParametroFormularioIva(this.gettipoparametroformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroFormularioIva(this.tipoparametroformularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoparametroformularioiva==null) {
						this.tipoparametroformularioiva = new TipoParametroFormularioIva();
					}

					this.setVariablesFormularioToObjetoActualTipoParametroFormularioIva(this.tipoparametroformularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroFormularioIva(this.tipoparametroformularioiva);
				}

				if(this.tipoparametroformularioiva.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoparametroformularioiva.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoParametroFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_sriTipoParametroFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoParametroFormularioIva(this.gettipoparametroformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroFormularioIva(this.tipoparametroformularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoparametroformularioiva==null) {
						this.tipoparametroformularioiva = new TipoParametroFormularioIva();
					}

					this.setVariablesFormularioToObjetoActualTipoParametroFormularioIva(this.tipoparametroformularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroFormularioIva(this.tipoparametroformularioiva);
				}

				if(this.tipoparametroformularioiva.getcodigo_sri()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_sri like '%"+this.tipoparametroformularioiva.getcodigo_sri()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoParametroFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoParametroFormularioIva() {
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {
		

		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.dispose();
			this.jInternalFrameDetalleFormTipoParametroFormularioIva=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoParametroFormularioIva!=null) {
			this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.dispose();
			this.jInternalFrameReporteDinamicoTipoParametroFormularioIva=null;
		}
		
		if(this.jInternalFrameImportacionTipoParametroFormularioIva!=null) {
			this.jInternalFrameImportacionTipoParametroFormularioIva.setVisible(false);	    			
			this.jInternalFrameImportacionTipoParametroFormularioIva.dispose();
			this.jInternalFrameImportacionTipoParametroFormularioIva=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoParametroFormularioIva();
			
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoParametroFormularioIva")) {
				jButtonNuevoTipoParametroFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoParametroFormularioIva")) {
				jButtonDuplicarTipoParametroFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoParametroFormularioIva")) {
				jButtonCopiarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoParametroFormularioIva")) {
				jButtonVerFormTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoParametroFormularioIva")) {
				jButtonNuevoTipoParametroFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoParametroFormularioIva")) {
				jButtonDuplicarTipoParametroFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoParametroFormularioIva")) {
				jButtonNuevoTipoParametroFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoParametroFormularioIva")) {
				jButtonDuplicarTipoParametroFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoParametroFormularioIva")) {
				jButtonNuevoTipoParametroFormularioIvaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoParametroFormularioIva")) {
				jButtonNuevoTipoParametroFormularioIvaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoParametroFormularioIva")) {
				jButtonNuevoTipoParametroFormularioIvaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoParametroFormularioIva")) {
				jButtonModificarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoParametroFormularioIva")) {
				jButtonModificarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoParametroFormularioIva")) {
				jButtonModificarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoParametroFormularioIva")) {
				jButtonActualizarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoParametroFormularioIva")) {
				jButtonActualizarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoParametroFormularioIva")) {
				jButtonActualizarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoParametroFormularioIva")) {
				jButtonEliminarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoParametroFormularioIva")) {
				jButtonEliminarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoParametroFormularioIva")) {
				jButtonEliminarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoParametroFormularioIva")) {
				jButtonCancelarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoParametroFormularioIva")) {
				jButtonCancelarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoParametroFormularioIva")) {
				jButtonCancelarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoParametroFormularioIva")) {
				jButtonCerrarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoParametroFormularioIva")) {
				jButtonCerrarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoParametroFormularioIva")) {
				jButtonCerrarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoParametroFormularioIva")) {
				jButtonMostrarOcultarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoParametroFormularioIva")) {
				jButtonCancelarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoParametroFormularioIva")) {
				jButtonGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoParametroFormularioIva")) {
				jButtonGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoParametroFormularioIva")) {
				jButtonCopiarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoParametroFormularioIva")) {
				jButtonVerFormTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoParametroFormularioIva")) {
				jButtonGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoParametroFormularioIva")) {
				jButtonCopiarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoParametroFormularioIva")) {
				jButtonVerFormTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoParametroFormularioIva")) {
				jButtonGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoParametroFormularioIva")) {
				jButtonGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoParametroFormularioIva")) {
				jButtonGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoParametroFormularioIva")) {
				jButtonRecargarInformacionTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoParametroFormularioIva")) {
				jButtonRecargarInformacionTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoParametroFormularioIva")) {
				jButtonRecargarInformacionTipoParametroFormularioIvaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoParametroFormularioIva")) {
				jButtonAnterioresTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoParametroFormularioIva")) {
				jButtonAnterioresTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoParametroFormularioIva")) {
				jButtonAnterioresTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoParametroFormularioIva")) {
				jButtonSiguientesTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoParametroFormularioIva")) {
				jButtonSiguientesTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoParametroFormularioIva")) {
				jButtonSiguientesTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoParametroFormularioIva") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoParametroFormularioIva")) {
				jButtonAbrirOrderByTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoParametroFormularioIva") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoParametroFormularioIva")) {
				jButtonMostrarOcultarTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoParametroFormularioIva")) {
				jButtonNuevoGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoParametroFormularioIva")) {
				jButtonNuevoGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoParametroFormularioIva")) {
				jButtonNuevoGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoParametroFormularioIva")) {
				jButtonCerrarReporteDinamicoTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoParametroFormularioIva")) {
				jButtonGenerarReporteDinamicoTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoParametroFormularioIva")) {
				
				jButtonGenerarExcelReporteDinamicoTipoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoParametroFormularioIva")) {
				jButtonCerrarImportacionTipoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoParametroFormularioIva")) {
				
				jButtonGenerarImportacionTipoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoParametroFormularioIva")) {
				
				jButtonAbrirImportacionTipoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoParametroFormularioIva")) {
				jComboBoxTiposAccionesTipoParametroFormularioIvaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoParametroFormularioIva")) {
				jComboBoxTiposRelacionesTipoParametroFormularioIvaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoParametroFormularioIva")) {
				jComboBoxTiposAccionesTipoParametroFormularioIvaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoParametroFormularioIva")) {
				
				jComboBoxTiposSeleccionarTipoParametroFormularioIvaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoParametroFormularioIva")) {
				jTextFieldValorCampoGeneralTipoParametroFormularioIvaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoParametroFormularioIva")) {
				jButtonAbrirOrderByTipoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoParametroFormularioIva")) {
				jButtonAbrirOrderByTipoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoParametroFormularioIva")) {
				jButtonCerrarOrderByTipoParametroFormularioIvaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoParametroFormularioIvaBusqueda")) {
				this.jButtonidTipoParametroFormularioIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoParametroFormularioIvaBusqueda")) {
				this.jButtonnombreTipoParametroFormularioIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sriTipoParametroFormularioIvaBusqueda")) {
				this.jButtoncodigo_sriTipoParametroFormularioIvaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoParametroFormularioIva();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParametroFormularioIvaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroformularioiva);
				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
				
				


				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoParametroFormularioIva tipoparametroformularioivaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoparametroformularioivaLocal=this.tipoparametroformularioiva;
			} else {
				tipoparametroformularioivaLocal=this.tipoparametroformularioivaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroformularioiva);
				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
							
				
				


				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParametroFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaAnterior =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparametroformularioivaAnterior =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
			
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
			
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
			
			


			
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParametroFormularioIvaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroformularioiva);
				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
								
						
				


				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroFormularioIva.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroformularioiva);
				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
								
				
				


				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParametroFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaAnterior =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparametroformularioivaAnterior =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroformularioiva);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParametroFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaAnterior =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparametroformularioivaAnterior =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParametroFormularioIvaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroformularioiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroformularioiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroformularioiva);
				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
							
				
				


				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroFormularioIva.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParametroFormularioIvaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparametroformularioivaAnterior =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoparametroformularioivaAnterior =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
			
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
			
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
			
			


			
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParametroFormularioIvaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroformularioiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroformularioiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroformularioiva);
				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
								
				
				


				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParametroFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaAnterior =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparametroformularioivaAnterior =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParametroFormularioIvaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroformularioiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroformularioiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParametroFormularioIvaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroformularioiva);
				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoParametroFormularioIva")) {
					jCheckBoxSeleccionarTodosTipoParametroFormularioIvaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoParametroFormularioIva")) {
					jCheckBoxSeleccionadosTipoParametroFormularioIvaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoParametroFormularioIva")) {
					
				}
				
				


				
				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroformularioiva);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroformularioiva);
				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
												
				
				


				
				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParametroFormularioIvaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparametroformularioivaAnterior =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoparametroformularioivaAnterior =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParametroFormularioIvaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroformularioiva);
				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
				
				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
			
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
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
			
			


			
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParametroFormularioIvaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroformularioiva);
				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroFormularioIva.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroFormularioIva.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroformularioiva);
				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
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
				
				


				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroFormularioIva.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParametroFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroformularioivaAnterior =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparametroformularioivaAnterior =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoParametroFormularioIva")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoParametroFormularioIvaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoParametroFormularioIva.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoparametroformularioiva =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoparametroformularioiva);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoParametroFormularioIva")) {
				
				}
				
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoParametroFormularioIva")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoParametroFormularioIva.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoParametroFormularioIva")) {
			
			}
			
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoParametroFormularioIva();
			
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoParametroFormularioIva")) {
				jButtonNuevoTipoParametroFormularioIvaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoParametroFormularioIva")) {
				jButtonDuplicarTipoParametroFormularioIvaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoParametroFormularioIva")) {
				jButtonCopiarTipoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoParametroFormularioIva")) {
				jButtonVerFormTipoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoParametroFormularioIva")) {
				jButtonNuevoTipoParametroFormularioIvaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoParametroFormularioIva")) {
				jButtonModificarTipoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoParametroFormularioIva")) {
				jButtonActualizarTipoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoParametroFormularioIva")) {
				jButtonEliminarTipoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoParametroFormularioIva")) {
				jButtonGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoParametroFormularioIva")) {
				jButtonCancelarTipoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoParametroFormularioIva")) {
				jButtonCerrarTipoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoParametroFormularioIva")) {
				jButtonGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoParametroFormularioIva")) {
				jButtonNuevoGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoParametroFormularioIva")) {
				jButtonAbrirOrderByTipoParametroFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoParametroFormularioIva")) {
				jButtonRecargarInformacionTipoParametroFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoParametroFormularioIva")) {
				jButtonAnterioresTipoParametroFormularioIvaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoParametroFormularioIva")) {
				jButtonSiguientesTipoParametroFormularioIvaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoParametroFormularioIvaBusqueda")) {
				this.jButtonidTipoParametroFormularioIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoParametroFormularioIvaBusqueda")) {
				this.jButtonnombreTipoParametroFormularioIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sriTipoParametroFormularioIvaBusqueda")) {
				this.jButtoncodigo_sriTipoParametroFormularioIvaBusquedaActionPerformed(evt);
			}
			
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoParametroFormularioIva();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoParametroFormularioIva")) {
				closingInternalFrameTipoParametroFormularioIva();
				
			} else if(sTipo.equals("jButtonCancelarTipoParametroFormularioIva")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoParametroFormularioIva = (JInternalFrameBase)evt.getSource();
	            	
	            TipoParametroFormularioIvaBeanSwingJInternalFrame jInternalFrameParent=(TipoParametroFormularioIvaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoParametroFormularioIva.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoParametroFormularioIvaActionPerformed(null);
			}
			
			TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoparametroformularioiva,new Object(),this.tipoparametroformularioivaParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoParametroFormularioIva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoParametroFormularioIva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoParametroFormularioIva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoparametroformularioiva)) {
			if(!esControlTabla) {
				if(TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoParametroFormularioIva(this.tipoparametroformularioiva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroFormularioIva(this.tipoparametroformularioiva);			
				}
				
				if(this.tipoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoParametroFormularioIva(this.tipoparametroformularioiva,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoparametroformularioivaReturnGeneral=tipoparametroformularioivaLogic.procesarEventosTipoParametroFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas(),this.tipoparametroformularioiva,this.tipoparametroformularioivaParameterGeneral,this.isEsNuevoTipoParametroFormularioIva,classes);//this.tipoparametroformularioivaLogic.getTipoParametroFormularioIva()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoParametroFormularioIva(this.tipoparametroformularioivaReturnGeneral,this.tipoparametroformularioivaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoParametroFormularioIva(classes,this.tipoparametroformularioivaReturnGeneral,this.tipoparametroformularioivaBean,false);
					}
						
					if(this.tipoparametroformularioivaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoParametroFormularioIva(this.tipoparametroformularioivaReturnGeneral.getTipoParametroFormularioIva());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoParametroFormularioIva(this.tipoparametroformularioivaReturnGeneral.getTipoParametroFormularioIva());	
					}
						
					if(this.tipoparametroformularioivaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoParametroFormularioIva(this.tipoparametroformularioivaReturnGeneral.getTipoParametroFormularioIva(),classes);//this.tipoparametroformularioivaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoParametroFormularioIva(this.tipoparametroformularioiva,classes);//this.tipoparametroformularioivaBean);									
				}
			
				if(TipoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoParametroFormularioIva(this.tipoparametroformularioiva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroFormularioIva(this.tipoparametroformularioiva);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoparametroformularioivaAnterior!=null) {
						this.tipoparametroformularioiva=this.tipoparametroformularioivaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoparametroformularioivaReturnGeneral=tipoparametroformularioivaLogic.procesarEventosTipoParametroFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas(),this.tipoparametroformularioiva,this.tipoparametroformularioivaParameterGeneral,this.isEsNuevoTipoParametroFormularioIva,classes);//this.tipoparametroformularioivaLogic.getTipoParametroFormularioIva()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoparametroformularioivaReturnGeneral.getTipoParametroFormularioIva(),tipoparametroformularioivaLogic.getTipoParametroFormularioIvas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoparametroformularioivaReturnGeneral.getTipoParametroFormularioIva(),this.tipoparametroformularioivas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoParametroFormularioIva.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoParametroFormularioIva.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoParametroFormularioIva();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoParametroFormularioIva() throws Exception {
		
		TipoParametroFormularioIvaModel tipoparametroformularioivaModel=(TipoParametroFormularioIvaModel)this.jTableDatosTipoParametroFormularioIva.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoparametroformularioivaModel.tipoparametroformularioivas=this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoparametroformularioivaModel.tipoparametroformularioivas=this.tipoparametroformularioivas;
		}
		
		
		((TipoParametroFormularioIvaModel) this.jTableDatosTipoParametroFormularioIva.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoParametroFormularioIva() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoparametroformularioivaAnterior(),this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoparametroformularioivaAnterior(),this.tipoparametroformularioivas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoParametroFormularioIva();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioiva,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroFormularioIva.class)) {
					this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.setParametroFormularioIvas(tipoparametroformularioiva.getParametroFormularioIvas());
					this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroFormularioIva(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
										
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparametroformularioiva,new Object(),generalEntityParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoParametroFormularioIvaConstantesFunciones.getClassesRelationshipsOfTipoParametroFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoParametroFormularioIvaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoParametroFormularioIva(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoParametroFormularioIva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparametroformularioiva,new Object(),generalEntityParameterGeneral,this.tipoparametroformularioivaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoParametroFormularioIva(TipoParametroFormularioIvaBean tipoparametroformularioivaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroFormularioIva.class)) {
					this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.setParametroFormularioIvas(tipoparametroformularioiva.getParametroFormularioIvas());
					this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroFormularioIva(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoParametroFormularioIva(ArrayList<Classe> classes,TipoParametroFormularioIvaReturnGeneral tipoparametroformularioivaReturnGeneral,TipoParametroFormularioIvaBean tipoparametroformularioivaBean,Boolean conDefault) throws Exception {
		
			this.tipoparametroformularioivaBean.setParametroFormularioIvas(tipoparametroformularioivaReturnGeneral.getTipoParametroFormularioIva().getParametroFormularioIvas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioiva,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroFormularioIva.class)) {
					tipoparametroformularioiva.setParametroFormularioIvas(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.getParametroFormularioIvas());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoparametroformularioiva)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva = new TipoParametroFormularioIvaDetalleFormJInternalFrame(jDesktopPane,this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones(),this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoParametroFormularioIva);
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.setVisible(false);
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.tipoparametroformularioivaLogic=this.tipoparametroformularioivaLogic;
		
		this.cargarCombosFrameForeignKeyTipoParametroFormularioIva("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoParametroFormularioIva();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoParametroFormularioIva();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoParametroFormularioIva("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoParametroFormularioIva();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoParametroFormularioIva"));
		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonModificarTipoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarTipoParametroFormularioIva"));

		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonModificarToolBarTipoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoParametroFormularioIva"));
					
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jMenuItemModificarTipoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoParametroFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonActualizarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"ActualizarTipoParametroFormularioIva"));
		
		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonActualizarToolBarTipoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoParametroFormularioIva"));
						
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jMenuItemActualizarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoParametroFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonEliminarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarTipoParametroFormularioIva"));
		
		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonEliminarToolBarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoParametroFormularioIva"));
								
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jMenuItemEliminarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoParametroFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonCancelarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarTipoParametroFormularioIva"));
		
		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonCancelarToolBarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoParametroFormularioIva"));
					
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jMenuItemCancelarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoParametroFormularioIva"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jMenuItemDetalleCerrarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoParametroFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonGuardarCambiosToolBarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoParametroFormularioIva"));
		
		
		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonGuardarCambiosToolBarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoParametroFormularioIva"));
		
		
		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoParametroFormularioIva"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonidTipoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoParametroFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonnombreTipoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoParametroFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtoncodigo_sriTipoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sriTipoParametroFormularioIvaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTabbedPaneRelacionesTipoParametroFormularioIva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoParametroFormularioIva"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoParametroFormularioIva"));
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoParametroFormularioIva"));
		}
		
		this.jTableDatosTipoParametroFormularioIva.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoParametroFormularioIva"));
		
		this.jTableDatosTipoParametroFormularioIva.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoParametroFormularioIva"));
		
		this.jButtonNuevoTipoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"NuevoTipoParametroFormularioIva"));
		
		this.jButtonDuplicarTipoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"DuplicarTipoParametroFormularioIva"));
		
		this.jButtonCopiarTipoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"CopiarTipoParametroFormularioIva"));
		
		this.jButtonVerFormTipoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"VerFormTipoParametroFormularioIva"));
		
		
		this.jButtonNuevoToolBarTipoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoParametroFormularioIva"));
			
		this.jButtonDuplicarToolBarTipoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoParametroFormularioIva"));
			
		this.jMenuItemNuevoTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoParametroFormularioIva"));
			
		this.jMenuItemDuplicarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoParametroFormularioIva"));		
		
		
		this.jButtonNuevoRelacionesTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoParametroFormularioIva"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoParametroFormularioIva"));
			
		this.jMenuItemNuevoRelacionesTipoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoParametroFormularioIva"));		
		
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonModificarTipoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarTipoParametroFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonModificarToolBarTipoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoParametroFormularioIva"));
			
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jMenuItemModificarTipoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoParametroFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonActualizarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"ActualizarTipoParametroFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonActualizarToolBarTipoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoParametroFormularioIva"));
				
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jMenuItemActualizarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoParametroFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonEliminarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarTipoParametroFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonEliminarToolBarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoParametroFormularioIva"));
						
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jMenuItemEliminarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoParametroFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonCancelarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarTipoParametroFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonCancelarToolBarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoParametroFormularioIva"));
			
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jMenuItemCancelarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoParametroFormularioIva"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoParametroFormularioIva"));		
		
		
		this.jButtonCerrarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CerrarTipoParametroFormularioIva"));
		
		
		this.jButtonCerrarToolBarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoParametroFormularioIva"));
			
		this.jMenuItemCerrarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoParametroFormularioIva"));
			
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jMenuItemDetalleCerrarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoParametroFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonGuardarCambiosTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoParametroFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonGuardarCambiosToolBarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoParametroFormularioIva"));
		}
		
		this.jButtonCopiarToolBarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoParametroFormularioIva"));
			
		this.jButtonVerFormToolBarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoParametroFormularioIva"));
		
		this.jMenuItemGuardarCambiosTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoParametroFormularioIva"));
			
		this.jMenuItemCopiarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoParametroFormularioIva"));		
		
		this.jMenuItemVerFormTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoParametroFormularioIva"));		
		
		
		this.jButtonGuardarCambiosTablaTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoParametroFormularioIva"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoParametroFormularioIva"));
			
		this.jMenuItemGuardarCambiosTablaTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoParametroFormularioIva"));		
		
		
		
		this.jButtonRecargarInformacionTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoParametroFormularioIva"));
					
		this.jButtonRecargarInformacionToolBarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoParametroFormularioIva"));
		
		this.jMenuItemRecargarInformacionTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoParametroFormularioIva"));		
		
		
		
		this.jButtonAnterioresTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"AnterioresTipoParametroFormularioIva"));
		
		
		this.jButtonAnterioresToolBarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoParametroFormularioIva"));
		
		this.jMenuItemAnterioresTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoParametroFormularioIva"));		
		
		
		this.jButtonSiguientesTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"SiguientesTipoParametroFormularioIva"));
		
		
		this.jButtonSiguientesToolBarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoParametroFormularioIva"));
			
		this.jMenuItemSiguientesTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoParametroFormularioIva"));
			
		this.jMenuItemAbrirOrderByTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoParametroFormularioIva"));
			
		this.jMenuItemMostrarOcultarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoParametroFormularioIva"));
			
		this.jMenuItemDetalleAbrirOrderByTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoParametroFormularioIva"));
			
		this.jMenuItemDetalleMostarOcultarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoParametroFormularioIva"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoParametroFormularioIva"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoParametroFormularioIva"));
			
		this.jMenuItemNuevoGuardarCambiosTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoParametroFormularioIva"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoParametroFormularioIva.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoParametroFormularioIva"));

		this.jCheckBoxSeleccionadosTipoParametroFormularioIva.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoParametroFormularioIva"));
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoParametroFormularioIva"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoParametroFormularioIva"));
			
		this.jComboBoxTiposAccionesTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoParametroFormularioIva"));
					
		this.jComboBoxTiposSeleccionarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoParametroFormularioIva"));
			
		this.jTextFieldValorCampoGeneralTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoParametroFormularioIva"));		
		
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonidTipoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoParametroFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonnombreTipoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoParametroFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtoncodigo_sriTipoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sriTipoParametroFormularioIvaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoParametroFormularioIva!=null) {
				this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoParametroFormularioIva"));
				this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoParametroFormularioIva"));
				this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoParametroFormularioIva"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoParametroFormularioIva"));				
			//this.jButtonGenerarReporteDinamicoTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoParametroFormularioIva"));
			//this.jButtonGenerarExcelReporteDinamicoTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoParametroFormularioIva"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoParametroFormularioIva!=null) {
				this.jInternalFrameImportacionTipoParametroFormularioIva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoParametroFormularioIva"));
				this.jInternalFrameImportacionTipoParametroFormularioIva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoParametroFormularioIva"));
				this.jInternalFrameImportacionTipoParametroFormularioIva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoParametroFormularioIva"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoParametroFormularioIva"));
			
			this.jButtonAbrirOrderByToolBarTipoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoParametroFormularioIva"));			
			
			if(this.jInternalFrameOrderByTipoParametroFormularioIva!=null) {
				this.jInternalFrameOrderByTipoParametroFormularioIva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoParametroFormularioIva"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTabbedPaneRelacionesTipoParametroFormularioIva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoParametroFormularioIva"));
		
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
            		closingInternalFrameTipoParametroFormularioIva();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoParametroFormularioIva = (JInternalFrameBase)event.getSource();
	            	
	            TipoParametroFormularioIvaBeanSwingJInternalFrame jInternalFrameParent=(TipoParametroFormularioIvaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoParametroFormularioIva.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoParametroFormularioIvaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoParametroFormularioIva.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoParametroFormularioIvaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoParametroFormularioIva.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoParametroFormularioIva.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParametroFormularioIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParametroFormularioIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParametroFormularioIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoParametroFormularioIva";
		inputMap = this.jButtonNuevoTipoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoParametroFormularioIvaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParametroFormularioIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParametroFormularioIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParametroFormularioIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoParametroFormularioIva";
		inputMap = this.jButtonNuevoRelacionesTipoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoParametroFormularioIvaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoParametroFormularioIva";
		inputMap = this.jButtonModificarTipoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoParametroFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoParametroFormularioIva";
		inputMap = this.jButtonActualizarTipoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoParametroFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoParametroFormularioIva";
		inputMap = this.jButtonEliminarTipoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoParametroFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoParametroFormularioIva";
		inputMap = this.jButtonCancelarTipoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoParametroFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoParametroFormularioIva";
		inputMap = this.jButtonCerrarTipoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoParametroFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonGuardarCambiosTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoParametroFormularioIva";
		inputMap = this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonGuardarCambiosTipoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonGuardarCambiosTipoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoParametroFormularioIva.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoParametroFormularioIvaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoParametroFormularioIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoParametroFormularioIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoParametroFormularioIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoParametroFormularioIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoParametroFormularioIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoParametroFormularioIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonidTipoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoParametroFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtonnombreTipoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoParametroFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jButtoncodigo_sriTipoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sriTipoParametroFormularioIvaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoParametroFormularioIvaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoParametroFormularioIva.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoParametroFormularioIva(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoParametroFormularioIva tipoparametroformularioivaAux:this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas()) {
					tipoparametroformularioivaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParametroFormularioIva tipoparametroformularioivaAux:tipoparametroformularioivas) {
					tipoparametroformularioivaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoParametroFormularioIvaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoParametroFormularioIva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoParametroFormularioIva tipoparametroformularioivaAux:this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas()) {
						tipoparametroformularioivaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoParametroFormularioIva tipoparametroformularioivaAux:tipoparametroformularioivas) {
						tipoparametroformularioivaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoParametroFormularioIva tipoparametroformularioivaAux:this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoParametroFormularioIva tipoparametroformularioivaAux:tipoparametroformularioivas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoParametroFormularioIva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoParametroFormularioIva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoParametroFormularioIva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoParametroFormularioIva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoParametroFormularioIvaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoParametroFormularioIva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoParametroFormularioIva.getSelectedRows();
			
			TipoParametroFormularioIva tipoparametroformularioivaLocal=new TipoParametroFormularioIva();
			
			//this.seleccionarTodosTipoParametroFormularioIva(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparametroformularioivaLocal =(TipoParametroFormularioIva) this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoparametroformularioivaLocal =(TipoParametroFormularioIva) this.tipoparametroformularioivas.toArray()[this.jTableDatosTipoParametroFormularioIva.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoparametroformularioivaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoParametroFormularioIva tipoparametroformularioivaAux:this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas()) {
						tipoparametroformularioivaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoParametroFormularioIva tipoparametroformularioivaAux:tipoparametroformularioivas) {
						tipoparametroformularioivaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoParametroFormularioIva(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoParametroFormularioIva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoParametroFormularioIva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoParametroFormularioIva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoParametroFormularioIvaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoParametroFormularioIvaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoParametroFormularioIvaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoParametroFormularioIva(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoParametroFormularioIva.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoParametroFormularioIva tipoparametroformularioivaAux:this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas()) {
				
						if(sTipoSeleccionar.equals(TipoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoparametroformularioivaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI)) {
							existe=true;
							tipoparametroformularioivaAux.setcodigo_sri(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParametroFormularioIva tipoparametroformularioivaAux:tipoparametroformularioivas) {
					
						if(sTipoSeleccionar.equals(TipoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoparametroformularioivaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI)) {
							existe=true;
							tipoparametroformularioivaAux.setcodigo_sri(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoParametroFormularioIva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoParametroFormularioIvaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoParametroFormularioIva(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoParametroFormularioIva=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoParametroFormularioIva.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoParametroFormularioIva.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoParametroFormularioIva) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoParametroFormularioIva(conSplash);
				
					this.generarReporteTipoParametroFormularioIvasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParametroFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParametroFormularioIva.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoParametroFormularioIvasSeleccionados();
				//this.jComboBoxTiposAccionesTipoParametroFormularioIva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoParametroFormularioIvasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoParametroFormularioIva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoParametroFormularioIvasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoParametroFormularioIva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoParametroFormularioIva();
				
				this.exportarTipoParametroFormularioIvasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParametroFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParametroFormularioIva.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoParametroFormularioIvas();
				//this.importarTipoParametroFormularioIvas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParametroFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParametroFormularioIva.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoParametroFormularioIva();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoParametroFormularioIvasSeleccionados();
				//this.jComboBoxTiposAccionesTipoParametroFormularioIva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Parametro Formulario Iva ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoParametroFormularioIva();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoParametroFormularioIva)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoParametroFormularioIva(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParametroFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParametroFormularioIva.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoParametroFormularioIvaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoParametroFormularioIva) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoParametroFormularioIva(conSplash);
					
						//this.actualizarParametrosGeneralTipoParametroFormularioIva();
						
						this.generarReporteProcesoAccionTipoParametroFormularioIvasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoParametroFormularioIva.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoParametroFormularioIva.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Parametro Formulario Iva S SELECCIONADOS?", "MANTENIMIENTO DE Tipo Parametro Formulario Iva ", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoParametroFormularioIva();
				
						this.actualizarParametrosGeneralTipoParametroFormularioIva();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoparametroformularioivaReturnGeneral=tipoparametroformularioivaLogic.procesarAccionTipoParametroFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas(),this.tipoparametroformularioivaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoParametroFormularioIvaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoParametroFormularioIva.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoParametroFormularioIva.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoParametroFormularioIva();
					
					TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoParametroFormularioIvaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoParametroFormularioIva.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoParametroFormularioIva.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoParametroFormularioIva(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoParametroFormularioIvaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoParametroFormularioIva();
			
			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoParametroFormularioIva> tipoparametroformularioivasSeleccionados=new ArrayList<TipoParametroFormularioIva>();		
			TipoParametroFormularioIva tipoparametroformularioiva=new TipoParametroFormularioIva();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoParametroFormularioIva(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoParametroFormularioIva.getSelectedItem();
			
			
			
			
			tipoparametroformularioivasSeleccionados=this.getTipoParametroFormularioIvasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoparametroformularioivasSeleccionados.size()==1) {
				for(TipoParametroFormularioIva tipoparametroformularioivaAux:tipoparametroformularioivasSeleccionados) {
					tipoparametroformularioiva=tipoparametroformularioivaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Parametro Formulario Iva")) {
					jButtonParametroFormularioIvaActionPerformed(null,rowIndex,true,false,tipoparametroformularioiva);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoParametroFormularioIva();
			
      		//this.finishProcessTipoParametroFormularioIva(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoParametroFormularioIvaReturnGeneral() throws Exception {
		if(this.tipoparametroformularioivaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoparametroformularioivaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoparametroformularioivaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoparametroformularioivaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoparametroformularioivaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoparametroformularioivaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoParametroFormularioIva(false);
		}
		
		if(this.tipoparametroformularioivaReturnGeneral.getConRetornoLista() || this.tipoparametroformularioivaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoparametroformularioivaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoparametroformularioivaLogic.setTipoParametroFormularioIvas(this.tipoparametroformularioivaReturnGeneral.getTipoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoparametroformularioivaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoparametroformularioivaLogic.setTipoParametroFormularioIva(this.tipoparametroformularioivaReturnGeneral.getTipoParametroFormularioIva());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoParametroFormularioIva(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoParametroFormularioIva() throws Exception {
		
		
	}
	
	public ArrayList<TipoParametroFormularioIva> getTipoParametroFormularioIvasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoParametroFormularioIva> tipoparametroformularioivasSeleccionados=new ArrayList<TipoParametroFormularioIva>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoParametroFormularioIva) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoParametroFormularioIva tipoparametroformularioivaAux:tipoparametroformularioivaLogic.getTipoParametroFormularioIvas()) {
					if(tipoparametroformularioivaAux.getIsSelected()) {
						tipoparametroformularioivasSeleccionados.add(tipoparametroformularioivaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParametroFormularioIva tipoparametroformularioivaAux:this.tipoparametroformularioivas) {
					if(tipoparametroformularioivaAux.getIsSelected()) {
						tipoparametroformularioivasSeleccionados.add(tipoparametroformularioivaAux);				
					}
				}
			}
			
			if(tipoparametroformularioivasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoparametroformularioivasSeleccionados.addAll(this.tipoparametroformularioivaLogic.getTipoParametroFormularioIvas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoparametroformularioivasSeleccionados.addAll(this.tipoparametroformularioivas);				
					}
				}
			}
		} else {
			tipoparametroformularioivasSeleccionados.add(this.tipoparametroformularioiva);
		}
		
		return tipoparametroformularioivasSeleccionados;
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
	
	public void generarReporteTipoParametroFormularioIvasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoParametroFormularioIvasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoParametroFormularioIvasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoParametroFormularioIvasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoParametroFormularioIvasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoParametroFormularioIvasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Parametro Formulario Iva ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoParametroFormularioIvasSeleccionados() throws Exception {
		ArrayList<TipoParametroFormularioIva> tipoparametroformularioivasSeleccionados=new ArrayList<TipoParametroFormularioIva>();		
		
		tipoparametroformularioivasSeleccionados=this.getTipoParametroFormularioIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoParametroFormularioIvas("Todos",tipoparametroformularioivasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoParametroFormularioIvasSeleccionados() throws Exception {
		ArrayList<TipoParametroFormularioIva> tipoparametroformularioivasSeleccionados=new ArrayList<TipoParametroFormularioIva>();		
		
		tipoparametroformularioivasSeleccionados=this.getTipoParametroFormularioIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoParametroFormularioIvas("Todos",tipoparametroformularioivasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoParametroFormularioIvasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoParametroFormularioIva> tipoparametroformularioivasSeleccionados=new ArrayList<TipoParametroFormularioIva>();
		
		tipoparametroformularioivasSeleccionados=this.getTipoParametroFormularioIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoParametroFormularioIvas("Todos",tipoparametroformularioivasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoParametroFormularioIvasSeleccionados() throws Exception {
		ArrayList<TipoParametroFormularioIva> tipoparametroformularioivasSeleccionados=new ArrayList<TipoParametroFormularioIva>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoParametroFormularioIva();
		
		
		tipoparametroformularioivasSeleccionados=this.getTipoParametroFormularioIvasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoParametroFormularioIva();
		
		
		//this.generarReporteTipoParametroFormularioIvas("Todos",tipoparametroformularioivasSeleccionados ,tipoparametroformularioivaImplementable,tipoparametroformularioivaImplementableHome);
	}
	
	public void mostrarImportacionTipoParametroFormularioIvas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoParametroFormularioIva();
		
		this.abrirFrameImportacionTipoParametroFormularioIva();		
		
			
		//this.generarReporteTipoParametroFormularioIvas("Todos",tipoparametroformularioivasSeleccionados ,tipoparametroformularioivaImplementable,tipoparametroformularioivaImplementableHome);
	}
	
	public void importarTipoParametroFormularioIvas() throws Exception {		
	
	}
	
	public void exportarTipoParametroFormularioIvasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoParametroFormularioIvasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoParametroFormularioIvasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoParametroFormularioIvasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Parametro Formulario Iva ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoParametroFormularioIvasSeleccionados() throws Exception {
		ArrayList<TipoParametroFormularioIva> tipoparametroformularioivasSeleccionados=new ArrayList<TipoParametroFormularioIva>();		
		
		tipoparametroformularioivasSeleccionados=this.getTipoParametroFormularioIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparametroformularioiva."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoParametroFormularioIva(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoParametroFormularioIva tipoparametroformularioivaAux:tipoparametroformularioivasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoParametroFormularioIva(tipoparametroformularioivaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoparametroformularioivaAux.setsDetalleGeneralEntityReporte(tipoparametroformularioivaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoParametroFormularioIva(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoParametroFormularioIvaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoParametroFormularioIvaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioiva,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoparametroformularioiva.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoparametroformularioiva.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoparametroformularioiva.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoparametroformularioiva.getcodigo_sri();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoParametroFormularioIvasSeleccionados() throws Exception {
		ArrayList<TipoParametroFormularioIva> tipoparametroformularioivasSeleccionados=new ArrayList<TipoParametroFormularioIva>();		
		
		tipoparametroformularioivasSeleccionados=this.getTipoParametroFormularioIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparametroformularioiva.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoParametroFormularioIvas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoParametroFormularioIva(row);				
				iRow++;
			}				
			
			for(TipoParametroFormularioIva tipoparametroformularioivaAux:tipoparametroformularioivasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoParametroFormularioIva(tipoparametroformularioivaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoParametroFormularioIvasSeleccionados() throws Exception {
		ArrayList<TipoParametroFormularioIva> tipoparametroformularioivasSeleccionados=new ArrayList<TipoParametroFormularioIva>();		
		
		tipoparametroformularioivasSeleccionados=this.getTipoParametroFormularioIvasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparametroformularioiva.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoparametroformularioivas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoparametroformularioiva");
			//elementRoot.appendChild(element);
		
			for(TipoParametroFormularioIva tipoparametroformularioivaAux:tipoparametroformularioivasSeleccionados) {
				element = document.createElement("tipoparametroformularioiva");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoParametroFormularioIva(tipoparametroformularioivaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoParametroFormularioIva(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoParametroFormularioIvaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoParametroFormularioIvaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioiva,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoparametroformularioiva.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoparametroformularioiva.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoparametroformularioiva.getcodigo_sri());				
	}
	
	public void setFilaDatosExportarXmlTipoParametroFormularioIva(TipoParametroFormularioIva tipoparametroformularioiva,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoParametroFormularioIvaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoparametroformularioiva.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoParametroFormularioIvaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoparametroformularioiva.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoParametroFormularioIvaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoparametroformularioiva.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementcodigo_sri = document.createElement(TipoParametroFormularioIvaConstantesFunciones.CODIGOSRI);
		elementcodigo_sri.appendChild(document.createTextNode(tipoparametroformularioiva.getcodigo_sri().trim()));
		element.appendChild(elementcodigo_sri);
	}
	
	public void generarReporteGroupGenericoTipoParametroFormularioIvasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoParametroFormularioIva> tipoparametroformularioivasSeleccionados=new ArrayList<TipoParametroFormularioIva>();
		
		tipoparametroformularioivasSeleccionados=this.getTipoParametroFormularioIvasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoParametroFormularioIva(tipoparametroformularioivasSeleccionados);
		
		this.generarReporteTipoParametroFormularioIvas("Todos",tipoparametroformularioivasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoParametroFormularioIva(ArrayList<TipoParametroFormularioIva> tipoparametroformularioivasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoParametroFormularioIva tipoparametroformularioivaAux:tipoparametroformularioivasSeleccionados) {
				tipoparametroformularioivaAux.setsDetalleGeneralEntityReporte(tipoparametroformularioivaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoparametroformularioivaAux.setsDescripcionGeneralEntityReporte1(tipoparametroformularioivaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI)) {
					existe=true;
					tipoparametroformularioivaAux.setsDescripcionGeneralEntityReporte1(tipoparametroformularioivaAux.getcodigo_sri());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoParametroFormularioIva(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoParametroFormularioIva=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva=true;
				this.isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva=true;
			}
			
			this.isVisibilidadCeldaModificarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaEliminarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarTipoParametroFormularioIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParametroFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParametroFormularioIva=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaModificarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarTipoParametroFormularioIva=true;
			this.isVisibilidadCeldaEliminarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarTipoParametroFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParametroFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParametroFormularioIva=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaModificarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarTipoParametroFormularioIva=true;
			this.isVisibilidadCeldaEliminarTipoParametroFormularioIva=true;
			this.isVisibilidadCeldaCancelarTipoParametroFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParametroFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParametroFormularioIva=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaModificarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarTipoParametroFormularioIva=true;
			this.isVisibilidadCeldaEliminarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarTipoParametroFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParametroFormularioIva=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoParametroFormularioIva=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoParametroFormularioIva=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva=true;
			this.isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva=true;
			this.isVisibilidadCeldaModificarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaEliminarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarTipoParametroFormularioIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParametroFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParametroFormularioIva=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaEliminarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarTipoParametroFormularioIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParametroFormularioIva=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoParametroFormularioIva=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaModificarTipoParametroFormularioIva=true;
			this.isVisibilidadCeldaActualizarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaEliminarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarTipoParametroFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParametroFormularioIva=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoParametroFormularioIva=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoParametroFormularioIva=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva=true;
			this.isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva=true;
		} else {
			this.actualizarEstadoPanelsTipoParametroFormularioIva(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoParametroFormularioIva=false;
			//this.isVisibilidadCeldaVerFormTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaDuplicarTipoParametroFormularioIva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			if(!tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva=false;												
			}
			
			this.jButtonCerrarTipoParametroFormularioIva.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroFormularioIva=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoparametroformularioiva)) {
			this.isVisibilidadCeldaActualizarTipoParametroFormularioIva=false;
			this.isVisibilidadCeldaEliminarTipoParametroFormularioIva=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoParametroFormularioIva() {
		this.isVisibilidadCeldaNuevoTipoParametroFormularioIva=false;
		this.isVisibilidadCeldaGuardarCambiosTipoParametroFormularioIva=false;
	}
	
	public void actualizarEstadoPanelsTipoParametroFormularioIva(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionTipoParametroFormularioIva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoParametroFormularioIva!=null) {
				this.jScrollPanelDatosTipoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParametroFormularioIva!=null) {
				this.jPanelPaginacionTipoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesTipoParametroFormularioIva.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionTipoParametroFormularioIva.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoParametroFormularioIva!=null) {
				this.jScrollPanelDatosTipoParametroFormularioIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoParametroFormularioIva!=null) {
				this.jPanelPaginacionTipoParametroFormularioIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesTipoParametroFormularioIva.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionTipoParametroFormularioIva.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoParametroFormularioIva!=null) {
				this.jScrollPanelDatosTipoParametroFormularioIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoParametroFormularioIva!=null) {
				this.jPanelPaginacionTipoParametroFormularioIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesTipoParametroFormularioIva.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionTipoParametroFormularioIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParametroFormularioIva!=null) {
				this.jScrollPanelDatosTipoParametroFormularioIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoParametroFormularioIva!=null) {
				this.jPanelPaginacionTipoParametroFormularioIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesTipoParametroFormularioIva.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionTipoParametroFormularioIva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoParametroFormularioIva!=null) {
				this.jScrollPanelDatosTipoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParametroFormularioIva!=null) {
				this.jPanelPaginacionTipoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesTipoParametroFormularioIva.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionTipoParametroFormularioIva.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoParametroFormularioIva!=null) {
				this.jScrollPanelDatosTipoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParametroFormularioIva!=null) {
				this.jPanelPaginacionTipoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesTipoParametroFormularioIva.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionTipoParametroFormularioIva.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoParametroFormularioIva!=null) {
				this.jScrollPanelDatosTipoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParametroFormularioIva!=null) {
				this.jPanelPaginacionTipoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesTipoParametroFormularioIva.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoParametroFormularioIvaParaParametroFormularioIvas() throws Exception {
		Boolean isPaginaPopupParametroFormularioIva=false;

		try {

			if(this.tipoparametroformularioivaSessionBean==null) {
				this.tipoparametroformularioivaSessionBean=new TipoParametroFormularioIvaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaSessionBean=new ParametroFormularioIvaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaSessionBean.setsPathNavegacionActual(tipoparametroformularioivaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroFormularioIva=this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroFormularioIva(true);
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFormularioIva(TipoParametroFormularioIvaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaSessionBean.setisBusquedaDesdeForeignKeySesionTipoParametroFormularioIva(true);
			this.jInternalFrameDetalleFormTipoParametroFormularioIva.parametroformularioivaSessionBean.setlidTipoParametroFormularioIvaActual(this.idTipoParametroFormularioIvaActual);

			tipoparametroformularioivaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoParametroFormularioIva(true);
			tipoparametroformularioivaSessionBean.setlIdTipoParametroFormularioIvaActualForeignKey(this.idTipoParametroFormularioIvaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoParametroFormularioIvaSessionBean tipoparametroformularioivaSessionBean=new TipoParametroFormularioIvaSessionBean();
		
		if(this.tipoparametroformularioivaSessionBean==null) {
			this.tipoparametroformularioivaSessionBean=new TipoParametroFormularioIvaSessionBean();
		}
		
		this.tipoparametroformularioivaSessionBean.setsUltimaBusquedaTipoParametroFormularioIva(this.getsAccionBusqueda());
		this.tipoparametroformularioivaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoparametroformularioivaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoParametroFormularioIvaSessionBean tipoparametroformularioivaSessionBean=new TipoParametroFormularioIvaSessionBean();
		
		if(this.tipoparametroformularioivaSessionBean==null) {
			this.tipoparametroformularioivaSessionBean=new TipoParametroFormularioIvaSessionBean();
		}
		
		if(this.tipoparametroformularioivaSessionBean.getsUltimaBusquedaTipoParametroFormularioIva()!=null&&!this.tipoparametroformularioivaSessionBean.getsUltimaBusquedaTipoParametroFormularioIva().equals("")) {
			this.setsAccionBusqueda(tipoparametroformularioivaSessionBean.getsUltimaBusquedaTipoParametroFormularioIva());
			this.setiNumeroPaginacion(tipoparametroformularioivaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoparametroformularioivaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoparametroformularioivaSessionBean.setsUltimaBusquedaTipoParametroFormularioIva("");
		this.tipoparametroformularioivaSessionBean.setiNumeroPaginacion(TipoParametroFormularioIvaConstantesFunciones.INUMEROPAGINACION);
		this.tipoparametroformularioivaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoParametroFormularioIva(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoParametroFormularioIva() {
		this.updateBorderResaltarBusquedasFormularioTipoParametroFormularioIva();
		this.updateVisibilidadBusquedasFormularioTipoParametroFormularioIva();
		this.updateHabilitarBusquedasFormularioTipoParametroFormularioIva();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoParametroFormularioIva() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoParametroFormularioIva() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoParametroFormularioIva() {
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
	
	public void updateControlesFormularioTipoParametroFormularioIva() throws Exception {

		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoParametroFormularioIva();
		this.updateVisibilidadResaltarControlesFormularioTipoParametroFormularioIva();
		this.updateHabilitarResaltarControlesFormularioTipoParametroFormularioIva();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoParametroFormularioIva() throws Exception {
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoparametroformularioivaConstantesFunciones.resaltaridTipoParametroFormularioIva!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldidTipoParametroFormularioIva.setBorder(this.tipoparametroformularioivaConstantesFunciones.resaltaridTipoParametroFormularioIva);}
		if(this.tipoparametroformularioivaConstantesFunciones.resaltarnombreTipoParametroFormularioIva!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextAreanombreTipoParametroFormularioIva.setBorder(this.tipoparametroformularioivaConstantesFunciones.resaltarnombreTipoParametroFormularioIva);}
		if(this.tipoparametroformularioivaConstantesFunciones.resaltarcodigo_sriTipoParametroFormularioIva!=null && this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldcodigo_sriTipoParametroFormularioIva.setBorder(this.tipoparametroformularioivaConstantesFunciones.resaltarcodigo_sriTipoParametroFormularioIva);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoParametroFormularioIva() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {
	
		//this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldidTipoParametroFormularioIva.setVisible(this.tipoparametroformularioivaConstantesFunciones.mostraridTipoParametroFormularioIva);
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jPanelidTipoParametroFormularioIva.setVisible(this.tipoparametroformularioivaConstantesFunciones.mostraridTipoParametroFormularioIva);
		//this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextAreanombreTipoParametroFormularioIva.setVisible(this.tipoparametroformularioivaConstantesFunciones.mostrarnombreTipoParametroFormularioIva);
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jPanelnombreTipoParametroFormularioIva.setVisible(this.tipoparametroformularioivaConstantesFunciones.mostrarnombreTipoParametroFormularioIva);
		//this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldcodigo_sriTipoParametroFormularioIva.setVisible(this.tipoparametroformularioivaConstantesFunciones.mostrarcodigo_sriTipoParametroFormularioIva);
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jPanelcodigo_sriTipoParametroFormularioIva.setVisible(this.tipoparametroformularioivaConstantesFunciones.mostrarcodigo_sriTipoParametroFormularioIva);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoParametroFormularioIva() throws Exception {
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoParametroFormularioIva!=null) {
	
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldidTipoParametroFormularioIva.setEnabled(this.tipoparametroformularioivaConstantesFunciones.activaridTipoParametroFormularioIva);
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextAreanombreTipoParametroFormularioIva.setEnabled(this.tipoparametroformularioivaConstantesFunciones.activarnombreTipoParametroFormularioIva);
		this.jInternalFrameDetalleFormTipoParametroFormularioIva.jTextFieldcodigo_sriTipoParametroFormularioIva.setEnabled(this.tipoparametroformularioivaConstantesFunciones.activarcodigo_sriTipoParametroFormularioIva);
		}
	}
	
		
}