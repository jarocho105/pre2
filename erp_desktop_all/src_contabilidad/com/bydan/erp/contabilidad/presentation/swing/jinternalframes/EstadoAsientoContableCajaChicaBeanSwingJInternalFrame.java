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

import com.bydan.erp.contabilidad.util.EstadoAsientoContableCajaChicaConstantesFunciones;
import com.bydan.erp.contabilidad.util.EstadoAsientoContableCajaChicaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.EstadoAsientoContableCajaChicaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.EstadoAsientoContableCajaChicaBean;
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
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoAsientoContableCajaChicaBeanSwingJInternalFrame extends EstadoAsientoContableCajaChicaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoAsientoContableCajaChicaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoAsientoContableCajaChica> estadoasientocontablecajachicaValidator = new ClassValidator<EstadoAsientoContableCajaChica>(EstadoAsientoContableCajaChica.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoAsientoContableCajaChica estadoasientocontablecajachica;	
	public EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux;
	public EstadoAsientoContableCajaChica estadoasientocontablecajachicaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoAsientoContableCajaChica estadoasientocontablecajachicaTotales;
	public Long idEstadoAsientoContableCajaChicaActual;
	public Long iIdNuevoEstadoAsientoContableCajaChica=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoEstadoAsientoContableCajaChica;
	public Boolean isPermisoNuevoEstadoAsientoContableCajaChica;
	public Boolean isPermisoActualizarEstadoAsientoContableCajaChica;
	public Boolean isPermisoActualizarOriginalEstadoAsientoContableCajaChica;
	public Boolean isPermisoEliminarEstadoAsientoContableCajaChica;
	public Boolean isPermisoGuardarCambiosEstadoAsientoContableCajaChica;
	public Boolean isPermisoConsultaEstadoAsientoContableCajaChica;
	public Boolean isPermisoBusquedaEstadoAsientoContableCajaChica;
	public Boolean isPermisoReporteEstadoAsientoContableCajaChica;
	public Boolean isPermisoPaginacionMedioEstadoAsientoContableCajaChica;
	public Boolean isPermisoPaginacionAltoEstadoAsientoContableCajaChica;
	public Boolean isPermisoPaginacionTodoEstadoAsientoContableCajaChica;
	public Boolean isPermisoCopiarEstadoAsientoContableCajaChica;
	public Boolean isPermisoVerFormEstadoAsientoContableCajaChica;
	public Boolean isPermisoDuplicarEstadoAsientoContableCajaChica;
	public Boolean isPermisoOrdenEstadoAsientoContableCajaChica;
	
	
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
	
	public EstadoAsientoContableCajaChicaParameterReturnGeneral estadoasientocontablecajachicaReturnGeneral;
	public EstadoAsientoContableCajaChicaParameterReturnGeneral estadoasientocontablecajachicaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoAsientoContableCajaChica=false;
	public Boolean esParaAccionDesdeFormularioEstadoAsientoContableCajaChica=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoAsientoContableCajaChicaLogic estadoasientocontablecajachicaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoAsientoContableCajaChica estadoasientocontablecajachicaBean;
	public EstadoAsientoContableCajaChicaConstantesFunciones estadoasientocontablecajachicaConstantesFunciones;
	//public EstadoAsientoContableCajaChicaParameterReturnGeneral estadoasientocontablecajachicaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicas;	
	//public List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasEliminados;
	//public List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoAsientoContableCajaChica=true;
	public Boolean isVisibilidadCeldaCopiarEstadoAsientoContableCajaChica=true;
	public Boolean isVisibilidadCeldaVerFormEstadoAsientoContableCajaChica=true;
	public Boolean isVisibilidadCeldaOrdenEstadoAsientoContableCajaChica=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica=false;
	public Boolean isVisibilidadCeldaModificarEstadoAsientoContableCajaChica=false;
	public Boolean isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica=false;
	public Boolean isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica=false;
	public Boolean isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica=false;
	public Boolean isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica=false;	
	
	
	
	public Long getiIdNuevoEstadoAsientoContableCajaChica() {
		return this.iIdNuevoEstadoAsientoContableCajaChica;
	}

	public void setiIdNuevoEstadoAsientoContableCajaChica(Long iIdNuevoEstadoAsientoContableCajaChica) {
		this.iIdNuevoEstadoAsientoContableCajaChica = iIdNuevoEstadoAsientoContableCajaChica;
	}
	
	public Long getidEstadoAsientoContableCajaChicaActual() {
		return this.idEstadoAsientoContableCajaChicaActual;
	}

	public void setidEstadoAsientoContableCajaChicaActual(Long idEstadoAsientoContableCajaChicaActual) {
		this.idEstadoAsientoContableCajaChicaActual = idEstadoAsientoContableCajaChicaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoAsientoContableCajaChica getestadoasientocontablecajachica() {
		return this.estadoasientocontablecajachica;
	}

	public void setestadoasientocontablecajachica(EstadoAsientoContableCajaChica estadoasientocontablecajachica) {
		this.estadoasientocontablecajachica = estadoasientocontablecajachica;
	}
	
	public EstadoAsientoContableCajaChica getestadoasientocontablecajachicaAux() {
		return this.estadoasientocontablecajachicaAux;
	}

	public void setestadoasientocontablecajachicaAux(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux) {
		this.estadoasientocontablecajachicaAux = estadoasientocontablecajachicaAux;
	}				
	
	public EstadoAsientoContableCajaChica getestadoasientocontablecajachicaAnterior() {
		return this.estadoasientocontablecajachicaAnterior;
	}

	public void setestadoasientocontablecajachicaAnterior(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAnterior) {
		this.estadoasientocontablecajachicaAnterior = estadoasientocontablecajachicaAnterior;
	}	
	
	public EstadoAsientoContableCajaChica getestadoasientocontablecajachicaTotales() {
		return this.estadoasientocontablecajachicaTotales;
	}

	public void setestadoasientocontablecajachicaTotales(EstadoAsientoContableCajaChica estadoasientocontablecajachicaTotales) {
		this.estadoasientocontablecajachicaTotales = estadoasientocontablecajachicaTotales;
	}	
	
	public EstadoAsientoContableCajaChica getestadoasientocontablecajachicaBean() {
		return this.estadoasientocontablecajachicaBean;
	}

	public void setestadoasientocontablecajachicaBean(EstadoAsientoContableCajaChica estadoasientocontablecajachicaBean) {
		this.estadoasientocontablecajachicaBean = estadoasientocontablecajachicaBean;
	}	
	
	public EstadoAsientoContableCajaChicaParameterReturnGeneral getestadoasientocontablecajachicaReturnGeneral() {
		return this.estadoasientocontablecajachicaReturnGeneral;
	}

	public void setestadoasientocontablecajachicaReturnGeneral(EstadoAsientoContableCajaChicaParameterReturnGeneral estadoasientocontablecajachicaReturnGeneral) {
		this.estadoasientocontablecajachicaReturnGeneral = estadoasientocontablecajachicaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoAsientoContableCajaChicaLogic getEstadoAsientoContableCajaChicaLogic()	{		
		return estadoasientocontablecajachicaLogic;
	}

	public void setEstadoAsientoContableCajaChicaLogic(EstadoAsientoContableCajaChicaLogic estadoasientocontablecajachicaLogic) {
		this.estadoasientocontablecajachicaLogic = estadoasientocontablecajachicaLogic;
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
	
	public Boolean getIsEsNuevoEstadoAsientoContableCajaChica() {
		return isEsNuevoEstadoAsientoContableCajaChica;
	}

	public void setIsEsNuevoEstadoAsientoContableCajaChica(Boolean isEsNuevoEstadoAsientoContableCajaChica) {
		this.isEsNuevoEstadoAsientoContableCajaChica = isEsNuevoEstadoAsientoContableCajaChica;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoAsientoContableCajaChica() {
		return esParaAccionDesdeFormularioEstadoAsientoContableCajaChica;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoAsientoContableCajaChica(Boolean esParaAccionDesdeFormularioEstadoAsientoContableCajaChica) {
		this.esParaAccionDesdeFormularioEstadoAsientoContableCajaChica = esParaAccionDesdeFormularioEstadoAsientoContableCajaChica;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoAsientoContableCajaChica() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoAsientoContableCajaChicaConstantesFunciones.refrescarForeignKeysDescripcionesEstadoAsientoContableCajaChica(this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoAsientoContableCajaChicaConstantesFunciones.refrescarForeignKeysDescripcionesEstadoAsientoContableCajaChica(this.estadoasientocontablecajachicas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadoasientocontablecajachicaLogic.setEstadoAsientoContableCajaChicas(this.estadoasientocontablecajachicas);
			estadoasientocontablecajachicaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoAsientoContableCajaChicaParameterReturnGeneral getEstadoAsientoContableCajaChicaParameterGeneral() {
		return this.estadoasientocontablecajachicaParameterGeneral;
	}
	
	public void setEstadoAsientoContableCajaChicaParameterGeneral(EstadoAsientoContableCajaChicaParameterReturnGeneral estadoasientocontablecajachicaParameterGeneral) {
		this.estadoasientocontablecajachicaParameterGeneral = estadoasientocontablecajachicaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoAsientoContableCajaChica() {
		return isPermisoTodoEstadoAsientoContableCajaChica;
	}

	public void setIsPermisoTodoEstadoAsientoContableCajaChica(Boolean isPermisoTodoEstadoAsientoContableCajaChica) {
		this.isPermisoTodoEstadoAsientoContableCajaChica = isPermisoTodoEstadoAsientoContableCajaChica;
	}

	public Boolean getIsPermisoNuevoEstadoAsientoContableCajaChica() {
		return isPermisoNuevoEstadoAsientoContableCajaChica;
	}

	public void setIsPermisoNuevoEstadoAsientoContableCajaChica(Boolean isPermisoNuevoEstadoAsientoContableCajaChica) {
		this.isPermisoNuevoEstadoAsientoContableCajaChica = isPermisoNuevoEstadoAsientoContableCajaChica;
	}

	public Boolean getIsPermisoActualizarEstadoAsientoContableCajaChica() {
		return isPermisoActualizarEstadoAsientoContableCajaChica;
	}

	public void setIsPermisoActualizarEstadoAsientoContableCajaChica(Boolean isPermisoActualizarEstadoAsientoContableCajaChica) {
		this.isPermisoActualizarEstadoAsientoContableCajaChica = isPermisoActualizarEstadoAsientoContableCajaChica;
	}

	public Boolean getIsPermisoEliminarEstadoAsientoContableCajaChica() {
		return isPermisoEliminarEstadoAsientoContableCajaChica;
	}

	public void setIsPermisoEliminarEstadoAsientoContableCajaChica(Boolean isPermisoEliminarEstadoAsientoContableCajaChica) {
		this.isPermisoEliminarEstadoAsientoContableCajaChica = isPermisoEliminarEstadoAsientoContableCajaChica;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoAsientoContableCajaChica() {
		return isPermisoGuardarCambiosEstadoAsientoContableCajaChica;
	}

	public void setIsPermisoGuardarCambiosEstadoAsientoContableCajaChica(Boolean isPermisoGuardarCambiosEstadoAsientoContableCajaChica) {
		this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica = isPermisoGuardarCambiosEstadoAsientoContableCajaChica;
	}
	
	public Boolean getIsPermisoConsultaEstadoAsientoContableCajaChica() {
		return isPermisoConsultaEstadoAsientoContableCajaChica;
	}

	public void setIsPermisoConsultaEstadoAsientoContableCajaChica(Boolean isPermisoConsultaEstadoAsientoContableCajaChica) {
		this.isPermisoConsultaEstadoAsientoContableCajaChica = isPermisoConsultaEstadoAsientoContableCajaChica;
	}

	public Boolean getIsPermisoBusquedaEstadoAsientoContableCajaChica() {
		return isPermisoBusquedaEstadoAsientoContableCajaChica;
	}

	public void setIsPermisoBusquedaEstadoAsientoContableCajaChica(Boolean isPermisoBusquedaEstadoAsientoContableCajaChica) {
		this.isPermisoBusquedaEstadoAsientoContableCajaChica = isPermisoBusquedaEstadoAsientoContableCajaChica;
	}

	public Boolean getIsPermisoReporteEstadoAsientoContableCajaChica() {
		return isPermisoReporteEstadoAsientoContableCajaChica;
	}

	public void setIsPermisoReporteEstadoAsientoContableCajaChica(Boolean isPermisoReporteEstadoAsientoContableCajaChica) {
		this.isPermisoReporteEstadoAsientoContableCajaChica = isPermisoReporteEstadoAsientoContableCajaChica;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoAsientoContableCajaChica() {
		return isPermisoPaginacionMedioEstadoAsientoContableCajaChica;
	}

	public void setIsPermisoPaginacionMedioEstadoAsientoContableCajaChica(Boolean isPermisoPaginacionMedioEstadoAsientoContableCajaChica) {
		this.isPermisoPaginacionMedioEstadoAsientoContableCajaChica = isPermisoPaginacionMedioEstadoAsientoContableCajaChica;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoAsientoContableCajaChica() {
		return isPermisoPaginacionTodoEstadoAsientoContableCajaChica;
	}

	public void setIsPermisoPaginacionTodoEstadoAsientoContableCajaChica(Boolean isPermisoPaginacionTodoEstadoAsientoContableCajaChica) {
		this.isPermisoPaginacionTodoEstadoAsientoContableCajaChica = isPermisoPaginacionTodoEstadoAsientoContableCajaChica;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoAsientoContableCajaChica() {
		return isPermisoPaginacionAltoEstadoAsientoContableCajaChica;
	}

	public void setIsPermisoPaginacionAltoEstadoAsientoContableCajaChica(Boolean isPermisoPaginacionAltoEstadoAsientoContableCajaChica) {
		this.isPermisoPaginacionAltoEstadoAsientoContableCajaChica = isPermisoPaginacionAltoEstadoAsientoContableCajaChica;
	}
	
	public Boolean getIsPermisoCopiarEstadoAsientoContableCajaChica() {
		return isPermisoCopiarEstadoAsientoContableCajaChica;
	}

	public void setIsPermisoCopiarEstadoAsientoContableCajaChica(Boolean isPermisoCopiarEstadoAsientoContableCajaChica) {
		this.isPermisoCopiarEstadoAsientoContableCajaChica = isPermisoCopiarEstadoAsientoContableCajaChica;
	}
	
	public Boolean getIsPermisoVerFormEstadoAsientoContableCajaChica() {
		return isPermisoVerFormEstadoAsientoContableCajaChica;
	}

	public void setIsPermisoVerFormEstadoAsientoContableCajaChica(Boolean isPermisoVerFormEstadoAsientoContableCajaChica) {
		this.isPermisoVerFormEstadoAsientoContableCajaChica = isPermisoVerFormEstadoAsientoContableCajaChica;
	}
	
	public Boolean getIsPermisoDuplicarEstadoAsientoContableCajaChica() {
		return isPermisoDuplicarEstadoAsientoContableCajaChica;
	}

	public void setIsPermisoDuplicarEstadoAsientoContableCajaChica(Boolean isPermisoDuplicarEstadoAsientoContableCajaChica) {
		this.isPermisoDuplicarEstadoAsientoContableCajaChica = isPermisoDuplicarEstadoAsientoContableCajaChica;
	}
	
	public Boolean getIsPermisoOrdenEstadoAsientoContableCajaChica() {
		return isPermisoOrdenEstadoAsientoContableCajaChica;
	}

	public void setIsPermisoOrdenEstadoAsientoContableCajaChica(Boolean isPermisoOrdenEstadoAsientoContableCajaChica) {
		this.isPermisoOrdenEstadoAsientoContableCajaChica = isPermisoOrdenEstadoAsientoContableCajaChica;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoAsientoContableCajaChica() {
		return isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica;
	}

	public void setIsVisibilidadCeldaNuevoEstadoAsientoContableCajaChica(Boolean isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica) {
		this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica = isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoAsientoContableCajaChica() {
		return isVisibilidadCeldaDuplicarEstadoAsientoContableCajaChica;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoAsientoContableCajaChica(Boolean isVisibilidadCeldaDuplicarEstadoAsientoContableCajaChica) {
		this.isVisibilidadCeldaDuplicarEstadoAsientoContableCajaChica = isVisibilidadCeldaDuplicarEstadoAsientoContableCajaChica;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoAsientoContableCajaChica() {
		return isVisibilidadCeldaCopiarEstadoAsientoContableCajaChica;
	}

	public void setIsVisibilidadCeldaCopiarEstadoAsientoContableCajaChica(Boolean isVisibilidadCeldaCopiarEstadoAsientoContableCajaChica) {
		this.isVisibilidadCeldaCopiarEstadoAsientoContableCajaChica = isVisibilidadCeldaCopiarEstadoAsientoContableCajaChica;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoAsientoContableCajaChica() {
		return isVisibilidadCeldaVerFormEstadoAsientoContableCajaChica;
	}

	public void setIsVisibilidadCeldaVerFormEstadoAsientoContableCajaChica(Boolean isVisibilidadCeldaVerFormEstadoAsientoContableCajaChica) {
		this.isVisibilidadCeldaVerFormEstadoAsientoContableCajaChica = isVisibilidadCeldaVerFormEstadoAsientoContableCajaChica;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoAsientoContableCajaChica() {
		return isVisibilidadCeldaOrdenEstadoAsientoContableCajaChica;
	}

	public void setIsVisibilidadCeldaOrdenEstadoAsientoContableCajaChica(Boolean isVisibilidadCeldaOrdenEstadoAsientoContableCajaChica) {
		this.isVisibilidadCeldaOrdenEstadoAsientoContableCajaChica = isVisibilidadCeldaOrdenEstadoAsientoContableCajaChica;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica() {
		return isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica(Boolean isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica = isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoAsientoContableCajaChica() {
		return isVisibilidadCeldaModificarEstadoAsientoContableCajaChica;
	}

	public void setIsVisibilidadCeldaModificarEstadoAsientoContableCajaChica(Boolean isVisibilidadCeldaModificarEstadoAsientoContableCajaChica) {
		this.isVisibilidadCeldaModificarEstadoAsientoContableCajaChica = isVisibilidadCeldaModificarEstadoAsientoContableCajaChica;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoAsientoContableCajaChica() {
		return isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica;
	}

	public void setIsVisibilidadCeldaActualizarEstadoAsientoContableCajaChica(Boolean isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica) {
		this.isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica = isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoAsientoContableCajaChica() {
		return isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica;
	}

	public void setIsVisibilidadCeldaEliminarEstadoAsientoContableCajaChica(Boolean isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica) {
		this.isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica = isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoAsientoContableCajaChica() {
		return isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica;
	}

	public void setIsVisibilidadCeldaCancelarEstadoAsientoContableCajaChica(Boolean isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica) {
		this.isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica = isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoAsientoContableCajaChica() {
		return isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica;
	}

	public void setIsVisibilidadCeldaGuardarEstadoAsientoContableCajaChica(Boolean isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica) {
		this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica = isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica() {
		return isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica(Boolean isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica) {
		this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica = isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica;
	}
		
	public EstadoAsientoContableCajaChicaSessionBean getestadoasientocontablecajachicaSessionBean() {
		return this.estadoasientocontablecajachicaSessionBean;
	}
	
	public void setestadoasientocontablecajachicaSessionBean(EstadoAsientoContableCajaChicaSessionBean estadoasientocontablecajachicaSessionBean) {
		this.estadoasientocontablecajachicaSessionBean=estadoasientocontablecajachicaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachica)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoAsientoContableCajaChica estadoasientocontablecajachica,EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoAsientoContableCajaChica(estadoasientocontablecajachica);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadoasientocontablecajachicaAux.setId(estadoasientocontablecajachica.getId());
		estadoasientocontablecajachicaAux.setVersionRow(estadoasientocontablecajachica.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoAsientoContableCajaChica();
		
			int intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadoasientocontablecajachicaValidator.getInvalidValues(this.estadoasientocontablecajachica);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadoasientocontablecajachicaLogic.setDatosCliente(datosCliente);
			estadoasientocontablecajachicaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadoasientocontablecajachicaAux=new  EstadoAsientoContableCajaChica();
				
				estadoasientocontablecajachicaAux.setIsNew(true);
				estadoasientocontablecajachicaAux.setIsChanged(true);
				
				estadoasientocontablecajachicaAux.setEstadoAsientoContableCajaChicaOriginal(this.estadoasientocontablecajachica);
				
				estadoasientocontablecajachicaAux.setId(this.estadoasientocontablecajachica.getId());	
				estadoasientocontablecajachicaAux.setVersionRow(this.estadoasientocontablecajachica.getVersionRow());	
				estadoasientocontablecajachicaAux.setcodigo(this.estadoasientocontablecajachica.getcodigo());	
				estadoasientocontablecajachicaAux.setnombre(this.estadoasientocontablecajachica.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoasientocontablecajachicaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadoasientocontablecajachicaAux,estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoasientocontablecajachicaAux,estadoasientocontablecajachicas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadoasientocontablecajachicaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoasientocontablecajachicaLogic.saveEstadoAsientoContableCajaChicas();//WithConnection
						//estadoasientocontablecajachicaLogic.getSetVersionRowEstadoAsientoContableCajaChicas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoasientocontablecajachica,estadoasientocontablecajachicaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoasientocontablecajachicaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadoasientocontablecajachicaAux=new  EstadoAsientoContableCajaChica();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado() 
					|| (this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado() && this.estadoasientocontablecajachica.getId()>=0)) {
						
					estadoasientocontablecajachicaAux.setIsNew(false);
				}
				
				estadoasientocontablecajachicaAux.setIsDeleted(false);
			
				estadoasientocontablecajachicaAux.setId(this.estadoasientocontablecajachica.getId());	
				estadoasientocontablecajachicaAux.setVersionRow(this.estadoasientocontablecajachica.getVersionRow());	
				estadoasientocontablecajachicaAux.setcodigo(this.estadoasientocontablecajachica.getcodigo());	
				estadoasientocontablecajachicaAux.setnombre(this.estadoasientocontablecajachica.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoasientocontablecajachicaAux,estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoasientocontablecajachicaAux,estadoasientocontablecajachicas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadoasientocontablecajachicaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoasientocontablecajachicaLogic.saveEstadoAsientoContableCajaChicas();//WithConnection
						//estadoasientocontablecajachicaLogic.getSetVersionRowEstadoAsientoContableCajaChicas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoasientocontablecajachica,estadoasientocontablecajachicaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoasientocontablecajachicaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadoasientocontablecajachicaAux=new  EstadoAsientoContableCajaChica();
				
				estadoasientocontablecajachicaAux.setIsNew(false);
				estadoasientocontablecajachicaAux.setIsChanged(false);
				
				estadoasientocontablecajachicaAux.setIsDeleted(true);
				
				estadoasientocontablecajachicaAux.setId(this.estadoasientocontablecajachica.getId());	
				estadoasientocontablecajachicaAux.setVersionRow(this.estadoasientocontablecajachica.getVersionRow());	
				estadoasientocontablecajachicaAux.setcodigo(this.estadoasientocontablecajachica.getcodigo());	
				estadoasientocontablecajachicaAux.setnombre(this.estadoasientocontablecajachica.getnombre());	
				
				if(this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadoasientocontablecajachicaAux.getId()>=0) {	
						this.estadoasientocontablecajachicasEliminados.add(estadoasientocontablecajachicaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadoasientocontablecajachicaAux,estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoasientocontablecajachicaAux,estadoasientocontablecajachicas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadoasientocontablecajachicaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoasientocontablecajachicaLogic.saveEstadoAsientoContableCajaChicas();//WithConnection
						//estadoasientocontablecajachicaLogic.getSetVersionRowEstadoAsientoContableCajaChicas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoasientocontablecajachicaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadoasientocontablecajachicaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadoasientocontablecajachicaAux,estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadoasientocontablecajachicaAux,estadoasientocontablecajachicas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().addAll(this.estadoasientocontablecajachicasEliminados);
					
					estadoasientocontablecajachicaLogic.saveEstadoAsientoContableCajaChicas();//WithConnection
					//estadoasientocontablecajachicaLogic.getSetVersionRowEstadoAsientoContableCajaChicas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadoasientocontablecajachicasEliminados= new ArrayList<EstadoAsientoContableCajaChica>();		
			}
			
			if(this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Asiento Contable Caja Chica GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Asiento Contable Caja Chica",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadoasientocontablecajachica=estadoasientocontablecajachicaAux;
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
      		//this.finishProcessEstadoAsientoContableCajaChica();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoAsientoContableCajaChica estadoasientocontablecajachicaLocal) throws Exception {
		
		if(this.estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoAsientoContableCajaChica estadoasientocontablecajachicaLocal) throws Exception {	
		if(this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoAsientoContableCajaChicaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadoasientocontablecajachicaValidator.getInvalidValues(this.estadoasientocontablecajachica);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoAsientoContableCajaChica estadoasientocontablecajachica,List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicas) throws Exception {
		try	{		
			EstadoAsientoContableCajaChicaConstantesFunciones.actualizarLista(estadoasientocontablecajachica,estadoasientocontablecajachicas,this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoAsientoContableCajaChica estadoasientocontablecajachica,List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicas) throws Exception {
		try	{			
			EstadoAsientoContableCajaChicaConstantesFunciones.actualizarSelectedLista(estadoasientocontablecajachica,estadoasientocontablecajachicas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadoasientocontablecajachicasLocal=this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadoasientocontablecajachicasLocal=this.estadoasientocontablecajachicas;
			}
			//ARCHITECTURE
		
			for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaLocal:estadoasientocontablecajachicasLocal) {
				if(this.permiteMantenimiento(estadoasientocontablecajachicaLocal) && estadoasientocontablecajachicaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoAsientoContableCajaChicaConstantesFunciones.getEstadoAsientoContableCajaChicaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoAsientoContableCajaChicaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jLabelcodigoEstadoAsientoContableCajaChica,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoAsientoContableCajaChicaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jLabelnombreEstadoAsientoContableCajaChica,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jLabelcodigoEstadoAsientoContableCajaChica,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jLabelnombreEstadoAsientoContableCajaChica,"");
		
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
		this.iIdNuevoEstadoAsientoContableCajaChica--;	
		
		
		this.estadoasientocontablecajachicaAux=new EstadoAsientoContableCajaChica();
		
		this.estadoasientocontablecajachicaAux.setId(this.iIdNuevoEstadoAsientoContableCajaChica);
		this.estadoasientocontablecajachicaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().add(this.estadoasientocontablecajachicaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadoasientocontablecajachicas.add(this.estadoasientocontablecajachicaAux);
		}
		//ARCHITECTURE
		
		this.estadoasientocontablecajachica=this.estadoasientocontablecajachicaAux;
		
		if(EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica);
		}
				
		//this.setDefaultControlesEstadoAsientoContableCajaChica();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoAsientoContableCajaChica();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoAsientoContableCajaChica();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoAsientoContableCajaChica();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoAsientoContableCajaChica(this.estadoasientocontablecajachicaBean,this.estadoasientocontablecajachica,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones()) {
			classes=EstadoAsientoContableCajaChicaConstantesFunciones.getClassesRelationshipsOfEstadoAsientoContableCajaChica(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadoasientocontablecajachicaReturnGeneral=estadoasientocontablecajachicaLogic.procesarEventosEstadoAsientoContableCajaChicasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas(),this.estadoasientocontablecajachica,this.estadoasientocontablecajachicaParameterGeneral,this.isEsNuevoEstadoAsientoContableCajaChica,classes);//this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChica()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoAsientoContableCajaChica(this.estadoasientocontablecajachicaReturnGeneral,this.estadoasientocontablecajachicaBean,false);
		
		if(this.estadoasientocontablecajachicaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoAsientoContableCajaChica(this.estadoasientocontablecajachicaReturnGeneral.getEstadoAsientoContableCajaChica());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoAsientoContableCajaChica(this.estadoasientocontablecajachicaReturnGeneral.getEstadoAsientoContableCajaChica());
		}
		
		if(this.estadoasientocontablecajachicaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoAsientoContableCajaChica(this.estadoasientocontablecajachicaReturnGeneral.getEstadoAsientoContableCajaChica(),classes);//this.estadoasientocontablecajachicaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoAsientoContableCajaChica();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoAsientoContableCajaChica();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoAsientoContableCajaChica(false);
						
			if(estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoAsientoContableCajaChica();
			}
			
			this.actualizarVisualTableDatosEstadoAsientoContableCajaChica();
			
			this.jTableDatosEstadoAsientoContableCajaChica.setRowSelectionInterval(this.getIndiceNuevoEstadoAsientoContableCajaChica(), this.getIndiceNuevoEstadoAsientoContableCajaChica());
			
			this.seleccionarFilaTablaEstadoAsientoContableCajaChicaActual();
						
			this.actualizarEstadoCeldasBotonesEstadoAsientoContableCajaChica("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoAsientoContableCajaChica(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldcodigoEstadoAsientoContableCajaChica.setEnabled(isHabilitar && this.estadoasientocontablecajachicaConstantesFunciones.activarcodigoEstadoAsientoContableCajaChica);
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextAreanombreEstadoAsientoContableCajaChica.setEnabled(isHabilitar && this.estadoasientocontablecajachicaConstantesFunciones.activarnombreEstadoAsientoContableCajaChica);	
		
	};
	
	public void setDefaultControlesEstadoAsientoContableCajaChica() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoAsientoContableCajaChica(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadoasientocontablecajachicaSessionBean.setConGuardarRelaciones(true);			
			this.estadoasientocontablecajachicaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTabbedPaneRelacionesEstadoAsientoContableCajaChica.setVisible(true);
			
					
		} else {
			//this.estadoasientocontablecajachicaSessionBean.setConGuardarRelaciones(false);			
			this.estadoasientocontablecajachicaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTabbedPaneRelacionesEstadoAsientoContableCajaChica.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEstadoAsientoContableCajaChica() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas()) {
				if(estadoasientocontablecajachicaAux.getId().equals(this.iIdNuevoEstadoAsientoContableCajaChica)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:this.estadoasientocontablecajachicas) {
				if(estadoasientocontablecajachicaAux.getId().equals(this.iIdNuevoEstadoAsientoContableCajaChica)) {
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
	
	public int getIndiceActualEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachica,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas()) {
				if(estadoasientocontablecajachicaAux.getId().equals(estadoasientocontablecajachica.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:this.estadoasientocontablecajachicas) {
				if(estadoasientocontablecajachicaAux.getId().equals(estadoasientocontablecajachica.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachicaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas()) {
				if(estadoasientocontablecajachicaAux.getEstadoAsientoContableCajaChicaOriginal().getId().equals(estadoasientocontablecajachicaOriginal.getId())) {
					existe=true;
					estadoasientocontablecajachicaOriginal.setId(estadoasientocontablecajachicaAux.getId());
					estadoasientocontablecajachicaOriginal.setVersionRow(estadoasientocontablecajachicaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:this.estadoasientocontablecajachicas) {
				if(estadoasientocontablecajachicaAux.getEstadoAsientoContableCajaChicaOriginal().getId().equals(estadoasientocontablecajachicaOriginal.getId())) {
					existe=true;
					estadoasientocontablecajachicaOriginal.setId(estadoasientocontablecajachicaAux.getId());
					estadoasientocontablecajachicaOriginal.setVersionRow(estadoasientocontablecajachicaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoAsientoContableCajaChica(Boolean esParaCancelar) throws Exception {
		estadoasientocontablecajachicasAux=new ArrayList<EstadoAsientoContableCajaChica>();
		estadoasientocontablecajachicaAux=new EstadoAsientoContableCajaChica();
		
		if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas()) {
					if(estadoasientocontablecajachicaAux.getId()<0) {
						estadoasientocontablecajachicasAux.add(estadoasientocontablecajachicaAux);
					}		
				}
				this.iIdNuevoEstadoAsientoContableCajaChica=0L;
				this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().removeAll(estadoasientocontablecajachicasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:this.estadoasientocontablecajachicas) {
					if(estadoasientocontablecajachicaAux.getId()<0) {
						estadoasientocontablecajachicasAux.add(estadoasientocontablecajachicaAux);
					}		
				}
				this.iIdNuevoEstadoAsientoContableCajaChica=0L;
				this.estadoasientocontablecajachicas.removeAll(estadoasientocontablecajachicasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoAsientoContableCajaChica 
					&& this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().size()>0
					) {
					estadoasientocontablecajachicaAux=this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().get(this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().size() - 1);
				
					if(estadoasientocontablecajachicaAux.getId()<0) {
						this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().remove(estadoasientocontablecajachicaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoAsientoContableCajaChica && this.estadoasientocontablecajachicas.size()>0) {
					estadoasientocontablecajachicaAux=this.estadoasientocontablecajachicas.get(this.estadoasientocontablecajachicas.size() - 1);
				
					if(estadoasientocontablecajachicaAux.getId()<0) {
						this.estadoasientocontablecajachicas.remove(estadoasientocontablecajachicaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoAsientoContableCajaChica(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadoasientocontablecajachica.getId()<0) {
				this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().remove(this.estadoasientocontablecajachica);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadoasientocontablecajachica.getId()<0) {
				this.estadoasientocontablecajachicas.remove(this.estadoasientocontablecajachica);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoAsientoContableCajaChica(List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasAux) throws Exception {
		EstadoAsientoContableCajaChicaConstantesFunciones.setEstadosInicialesEstadoAsientoContableCajaChica(estadoasientocontablecajachicasAux);
	}
	
	public void setEstadosInicialesEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux) throws Exception {
		EstadoAsientoContableCajaChicaConstantesFunciones.setEstadosInicialesEstadoAsientoContableCajaChica(estadoasientocontablecajachicaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoAsientoContableCajaChicaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoAsientoContableCajaChica("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoAsientoContableCajaChicaActual()) {
				if(!this.isEsNuevoEstadoAsientoContableCajaChica) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoAsientoContableCajaChica("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoAsientoContableCajaChica=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoAsientoContableCajaChicaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Asiento Contable Caja Chica ?", "MANTENIMIENTO DE Estado Asiento Contable Caja Chica", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoAsientoContableCajaChica("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoAsientoContableCajaChica estadoasientocontablecajachica) throws Exception {
		EstadoAsientoContableCajaChicaConstantesFunciones.seleccionarAsignar(this.estadoasientocontablecajachica,estadoasientocontablecajachica);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoAsientoContableCajaChica=this.isPermisoActualizarOriginalEstadoAsientoContableCajaChica;
			
			
			this.seleccionarAsignar(estadoasientocontablecajachica);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoAsientoContableCajaChicaConstantesFunciones.quitarEspaciosEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoAsientoContableCajaChica("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadoasientocontablecajachicaSessionBean.setsFuncionBusquedaRapida(this.estadoasientocontablecajachicaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoAsientoContableCajaChica) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoAsientoContableCajaChica(esParaCancelar);				
				this.cancelarNuevoEstadoAsientoContableCajaChica(esParaCancelar);								
			}
			
			this.estadoasientocontablecajachica=new EstadoAsientoContableCajaChica();
			
			this.inicializarEstadoAsientoContableCajaChica();
			
			this.actualizarEstadoCeldasBotonesEstadoAsientoContableCajaChica("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoAsientoContableCajaChica() throws Exception {
		try {
			EstadoAsientoContableCajaChicaConstantesFunciones.inicializarEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoAsientoContableCajaChicas(String sAccionBusqueda,List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoAsientoContableCajaChica"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoAsientoContableCajaChicaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoAsientoContableCajaChicaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoAsientoContableCajaChica"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Asiento Contable Caja Chicas");		
		parameters.put("busquedapor", EstadoAsientoContableCajaChicaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoAsientoContableCajaChica=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoAsientoContableCajaChicaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoAsientoContableCajaChicaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoAsientoContableCajaChica=new JRBeanArrayDataSource(EstadoAsientoContableCajaChicaJInternalFrame.TraerEstadoAsientoContableCajaChicaBeans(estadoasientocontablecajachicasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoAsientoContableCajaChica);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoAsientoContableCajaChicaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoAsientoContableCajaChicaBean.TraerEstadoAsientoContableCajaChicaBeans(estadoasientocontablecajachicasParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoAsientoContableCajaChicas(sAccionBusqueda,sTipoArchivoReporte,estadoasientocontablecajachicasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoAsientoContableCajaChicas(sAccionBusqueda,sTipoArchivoReporte,estadoasientocontablecajachicasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoAsientoContableCajaChicaActionPerformed(null);
					//this.generarExcelReporteEstadoAsientoContableCajaChicas(sAccionBusqueda,sTipoArchivoReporte,estadoasientocontablecajachicasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoAsientoContableCajaChicas(sAccionBusqueda,sTipoArchivoReporte,estadoasientocontablecajachicasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoAsientoContableCajaChicas(sAccionBusqueda,sTipoArchivoReporte,estadoasientocontablecajachicasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoAsientoContableCajaChicas(sAccionBusqueda,sTipoArchivoReporte,estadoasientocontablecajachicasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoAsientoContableCajaChicas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoasientocontablecajachica";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoAsientoContableCajaChicas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoAsientoContableCajaChica("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoAsientoContableCajaChica estadoasientocontablecajachica : estadoasientocontablecajachicasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoAsientoContableCajaChicaConstantesFunciones.generarExcelReporteDataEstadoAsientoContableCajaChica("NORMAL",row,workbook,estadoasientocontablecajachica,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Asiento Contable Caja Chica",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoAsientoContableCajaChica(String sTipo,Row row,Workbook workbook) {
		
		EstadoAsientoContableCajaChicaConstantesFunciones.generarExcelReporteHeaderEstadoAsientoContableCajaChica(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoAsientoContableCajaChicas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoasientocontablecajachica_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoAsientoContableCajaChicas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoAsientoContableCajaChica estadoasientocontablecajachica : estadoasientocontablecajachicasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoAsientoContableCajaChicaConstantesFunciones.getEstadoAsientoContableCajaChicaDescripcion(estadoasientocontablecajachica));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoasientocontablecajachica.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoasientocontablecajachica.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Asiento Contable Caja Chica",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoAsientoContableCajaChicas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasRespaldo=null;
		
		classes=EstadoAsientoContableCajaChicaConstantesFunciones.getClassesRelationshipsOfEstadoAsientoContableCajaChica(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadoasientocontablecajachicaLogic.setDatosCliente(this.datosCliente);
		this.estadoasientocontablecajachicaLogic.setDatosDeep(this.datosDeep);
		this.estadoasientocontablecajachicaLogic.setIsConDeep(true);
		
		estadoasientocontablecajachicasRespaldo=this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas();
		
		this.estadoasientocontablecajachicaLogic.setEstadoAsientoContableCajaChicas(estadoasientocontablecajachicasParaReportes);	
		this.estadoasientocontablecajachicaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadoasientocontablecajachicasParaReportes=this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas();
		this.estadoasientocontablecajachicaLogic.setEstadoAsientoContableCajaChicas(estadoasientocontablecajachicasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoasientocontablecajachica_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoAsientoContableCajaChicas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoAsientoContableCajaChica("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoAsientoContableCajaChica estadoasientocontablecajachica : estadoasientocontablecajachicasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoAsientoContableCajaChica("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoAsientoContableCajaChicaConstantesFunciones.generarExcelReporteDataEstadoAsientoContableCajaChica("NORMAL",row,workbook,estadoasientocontablecajachica,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadoAsientoContableCajaChicaConstantesFunciones.getEstadoAsientoContableCajaChicaDescripcion(estadoasientocontablecajachica));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Asiento Contable Caja Chica",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoAsientoContableCajaChica() throws Exception {		
		this.startProcessEstadoAsientoContableCajaChica(true);
	}
	
	public void startProcessEstadoAsientoContableCajaChica(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoAsientoContableCajaChica, this.jScrollPanelDatosEstadoAsientoContableCajaChica,this.jPanelPaginacionEstadoAsientoContableCajaChica, this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica, this.jPanelAccionesEstadoAsientoContableCajaChica,this.jPanelAccionesFormularioEstadoAsientoContableCajaChica,this.jmenuBarEstadoAsientoContableCajaChica,this.jmenuBarDetalleEstadoAsientoContableCajaChica,this.jTtoolBarEstadoAsientoContableCajaChica,this.jTtoolBarDetalleEstadoAsientoContableCajaChica);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoAsientoContableCajaChica=null; 
		
		final JPanel jPanelParametrosReportesEstadoAsientoContableCajaChica=this.jPanelParametrosReportesEstadoAsientoContableCajaChica;
		//final JScrollPane jScrollPanelDatosEstadoAsientoContableCajaChica=this.jScrollPanelDatosEstadoAsientoContableCajaChica;
		final JTable jTableDatosEstadoAsientoContableCajaChica=this.jTableDatosEstadoAsientoContableCajaChica;		
		final JPanel jPanelPaginacionEstadoAsientoContableCajaChica=this.jPanelPaginacionEstadoAsientoContableCajaChica;
		//final JScrollPane jScrollPanelDatosEdicionEstadoAsientoContableCajaChica=this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica;
		final JPanel jPanelAccionesEstadoAsientoContableCajaChica=this.jPanelAccionesEstadoAsientoContableCajaChica;
		
		JPanel jPanelCamposAuxiliarEstadoAsientoContableCajaChica=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoAsientoContableCajaChica=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {
			jPanelCamposAuxiliarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jPanelCamposEstadoAsientoContableCajaChica;
			jPanelAccionesFormularioAuxiliarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jPanelAccionesFormularioEstadoAsientoContableCajaChica;
		}
		
		final JPanel jPanelCamposEstadoAsientoContableCajaChica=jPanelCamposAuxiliarEstadoAsientoContableCajaChica;
		final JPanel jPanelAccionesFormularioEstadoAsientoContableCajaChica=jPanelAccionesFormularioAuxiliarEstadoAsientoContableCajaChica;
		
		
		final JMenuBar jmenuBarEstadoAsientoContableCajaChica=this.jmenuBarEstadoAsientoContableCajaChica;
		final JToolBar jTtoolBarEstadoAsientoContableCajaChica=this.jTtoolBarEstadoAsientoContableCajaChica;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoAsientoContableCajaChica=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoAsientoContableCajaChica=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {
			jmenuBarDetalleAuxiliarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jmenuBarDetalleEstadoAsientoContableCajaChica;
			jTtoolBarDetalleAuxiliarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTtoolBarDetalleEstadoAsientoContableCajaChica;
		}
		
		final JMenuBar jmenuBarDetalleEstadoAsientoContableCajaChica=jmenuBarDetalleAuxiliarEstadoAsientoContableCajaChica;
		final JToolBar jTtoolBarDetalleEstadoAsientoContableCajaChica=jTtoolBarDetalleAuxiliarEstadoAsientoContableCajaChica;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoAsientoContableCajaChica;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoAsientoContableCajaChica;
			processRunnable.jTableDatos=jTableDatosEstadoAsientoContableCajaChica;
			processRunnable.jPanelCampos=jPanelCamposEstadoAsientoContableCajaChica;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoAsientoContableCajaChica;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoAsientoContableCajaChica;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoAsientoContableCajaChica;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoAsientoContableCajaChica;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoAsientoContableCajaChica;
			processRunnable.jTtoolBar=jTtoolBarEstadoAsientoContableCajaChica;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoAsientoContableCajaChica;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoAsientoContableCajaChica ,jPanelParametrosReportesEstadoAsientoContableCajaChica,jTableDatosEstadoAsientoContableCajaChica, /*jScrollPanelDatosEstadoAsientoContableCajaChica,*/jPanelCamposEstadoAsientoContableCajaChica,jPanelPaginacionEstadoAsientoContableCajaChica, /*jScrollPanelDatosEdicionEstadoAsientoContableCajaChica,*/ jPanelAccionesEstadoAsientoContableCajaChica,jPanelAccionesFormularioEstadoAsientoContableCajaChica,jmenuBarEstadoAsientoContableCajaChica,jmenuBarDetalleEstadoAsientoContableCajaChica,jTtoolBarEstadoAsientoContableCajaChica,jTtoolBarDetalleEstadoAsientoContableCajaChica);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoAsientoContableCajaChica, jScrollPanelDatosEstadoAsientoContableCajaChica,jPanelPaginacionEstadoAsientoContableCajaChica, jScrollPanelDatosEdicionEstadoAsientoContableCajaChica, jPanelAccionesEstadoAsientoContableCajaChica,jPanelAccionesFormularioEstadoAsientoContableCajaChica,jmenuBarEstadoAsientoContableCajaChica,jmenuBarDetalleEstadoAsientoContableCajaChica,jTtoolBarEstadoAsientoContableCajaChica,jTtoolBarDetalleEstadoAsientoContableCajaChica);
						
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
	
	public void finishProcessEstadoAsientoContableCajaChica() {// throws Exception 
		this.finishProcessEstadoAsientoContableCajaChica(true);
	}
	
	public void finishProcessEstadoAsientoContableCajaChica(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoAsientoContableCajaChica, this.jScrollPanelDatosEstadoAsientoContableCajaChica,this.jPanelPaginacionEstadoAsientoContableCajaChica, this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica, this.jPanelAccionesEstadoAsientoContableCajaChica,this.jPanelAccionesFormularioEstadoAsientoContableCajaChica,this.jmenuBarEstadoAsientoContableCajaChica,this.jmenuBarDetalleEstadoAsientoContableCajaChica,this.jTtoolBarEstadoAsientoContableCajaChica,this.jTtoolBarDetalleEstadoAsientoContableCajaChica);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoAsientoContableCajaChica=null; 
		
		final JPanel jPanelParametrosReportesEstadoAsientoContableCajaChica=this.jPanelParametrosReportesEstadoAsientoContableCajaChica;
		//final JScrollPane jScrollPanelDatosEstadoAsientoContableCajaChica=this.jScrollPanelDatosEstadoAsientoContableCajaChica;
		final JTable jTableDatosEstadoAsientoContableCajaChica=this.jTableDatosEstadoAsientoContableCajaChica;		
		final JPanel jPanelPaginacionEstadoAsientoContableCajaChica=this.jPanelPaginacionEstadoAsientoContableCajaChica;
		//final JScrollPane jScrollPanelDatosEdicionEstadoAsientoContableCajaChica=this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica;
		final JPanel jPanelAccionesEstadoAsientoContableCajaChica=this.jPanelAccionesEstadoAsientoContableCajaChica;
		
		JPanel jPanelCamposAuxiliarEstadoAsientoContableCajaChica=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoAsientoContableCajaChica=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {
			jPanelCamposAuxiliarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jPanelCamposEstadoAsientoContableCajaChica;
			jPanelAccionesFormularioAuxiliarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jPanelAccionesFormularioEstadoAsientoContableCajaChica;
		}
		
		final JPanel jPanelCamposEstadoAsientoContableCajaChica=jPanelCamposAuxiliarEstadoAsientoContableCajaChica;
		final JPanel jPanelAccionesFormularioEstadoAsientoContableCajaChica=jPanelAccionesFormularioAuxiliarEstadoAsientoContableCajaChica;
		
		
		final JMenuBar jmenuBarEstadoAsientoContableCajaChica=this.jmenuBarEstadoAsientoContableCajaChica;		
		final JToolBar jTtoolBarEstadoAsientoContableCajaChica=this.jTtoolBarEstadoAsientoContableCajaChica;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoAsientoContableCajaChica=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoAsientoContableCajaChica=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {
			jmenuBarDetalleAuxiliarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jmenuBarDetalleEstadoAsientoContableCajaChica;
			jTtoolBarDetalleAuxiliarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTtoolBarDetalleEstadoAsientoContableCajaChica;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoAsientoContableCajaChica=jmenuBarDetalleAuxiliarEstadoAsientoContableCajaChica;
		final JToolBar jTtoolBarDetalleEstadoAsientoContableCajaChica=jTtoolBarDetalleAuxiliarEstadoAsientoContableCajaChica;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoAsientoContableCajaChica;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoAsientoContableCajaChica;
			processRunnable.jTableDatos=jTableDatosEstadoAsientoContableCajaChica;
			processRunnable.jPanelCampos=jPanelCamposEstadoAsientoContableCajaChica;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoAsientoContableCajaChica;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoAsientoContableCajaChica;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoAsientoContableCajaChica;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoAsientoContableCajaChica;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoAsientoContableCajaChica;
			processRunnable.jTtoolBar=jTtoolBarEstadoAsientoContableCajaChica;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoAsientoContableCajaChica;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoAsientoContableCajaChica ,jPanelParametrosReportesEstadoAsientoContableCajaChica, jTableDatosEstadoAsientoContableCajaChica,/*jScrollPanelDatosEstadoAsientoContableCajaChica,*/jPanelCamposEstadoAsientoContableCajaChica,jPanelPaginacionEstadoAsientoContableCajaChica, /*jScrollPanelDatosEdicionEstadoAsientoContableCajaChica,*/ jPanelAccionesEstadoAsientoContableCajaChica,jPanelAccionesFormularioEstadoAsientoContableCajaChica,jmenuBarEstadoAsientoContableCajaChica,jmenuBarDetalleEstadoAsientoContableCajaChica,jTtoolBarEstadoAsientoContableCajaChica,jTtoolBarDetalleEstadoAsientoContableCajaChica));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoAsientoContableCajaChica(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoAsientoContableCajaChica(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoAsientoContableCajaChica(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoAsientoContableCajaChica(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoAsientoContableCajaChica,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoAsientoContableCajaChica,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoAsientoContableCajaChica(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoAsientoContableCajaChica,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoAsientoContableCajaChica,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadoasientocontablecajachicaConstantesFunciones.getsFinalQueryEstadoAsientoContableCajaChica();
		String  finalQueryPaginacionTodos=this.estadoasientocontablecajachicaConstantesFunciones.getsFinalQueryEstadoAsientoContableCajaChica();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoAsientoContableCajaChicaConstantesFunciones.getArrayColumnasGlobalesNoEstadoAsientoContableCajaChica(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoAsientoContableCajaChicaConstantesFunciones.getArrayColumnasGlobalesEstadoAsientoContableCajaChica(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoAsientoContableCajaChicaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadoasientocontablecajachicasEliminados= new ArrayList<EstadoAsientoContableCajaChica>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoAsientoContableCajaChica();
		
				///*EstadoAsientoContableCajaChicaSessionBean*/this.estadoasientocontablecajachicaSessionBean=new EstadoAsientoContableCajaChicaSessionBean();
			
			if(this.estadoasientocontablecajachicaSessionBean==null) {
				this.estadoasientocontablecajachicaSessionBean=new EstadoAsientoContableCajaChicaSessionBean();
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
					this.iNumeroPaginacion=EstadoAsientoContableCajaChicaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoAsientoContableCajaChicaConstantesFunciones.getClassesForeignKeysOfEstadoAsientoContableCajaChica(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadoasientocontablecajachica."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadoasientocontablecajachicasAux= new ArrayList<EstadoAsientoContableCajaChica>();
			
				
			estadoasientocontablecajachicaLogic.setDatosCliente(this.datosCliente);
			estadoasientocontablecajachicaLogic.setDatosDeep(this.datosDeep);
			estadoasientocontablecajachicaLogic.setIsConDeep(true);
			
			
			estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadoasientocontablecajachicaLogic.getTodosEstadoAsientoContableCajaChicas(finalQueryGlobal,pagination);
					
					//estadoasientocontablecajachicaLogic.getTodosEstadoAsientoContableCajaChicasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas()==null|| estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoasientocontablecajachicasAux= new ArrayList<EstadoAsientoContableCajaChica>();
							estadoasientocontablecajachicasAux.addAll(estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoasientocontablecajachicasAux= new ArrayList<EstadoAsientoContableCajaChica>();
							estadoasientocontablecajachicasAux.addAll(estadoasientocontablecajachicas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoasientocontablecajachicaLogic.getTodosEstadoAsientoContableCajaChicas(finalQueryGlobal+"",this.pagination);												
							
							//estadoasientocontablecajachicaLogic.getTodosEstadoAsientoContableCajaChicasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoAsientoContableCajaChicas("Todos",estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoasientocontablecajachicaLogic.setEstadoAsientoContableCajaChicas(new ArrayList<EstadoAsientoContableCajaChica>());					
							estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().addAll(estadoasientocontablecajachicasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoasientocontablecajachicas=new ArrayList<EstadoAsientoContableCajaChica>();
							estadoasientocontablecajachicas.addAll(estadoasientocontablecajachicasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoAsientoContableCajaChica=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoAsientoContableCajaChica=this.idActual;
				
				} else if(this.idEstadoAsientoContableCajaChicaActual!=null && this.idEstadoAsientoContableCajaChicaActual!=0L) {
					idEstadoAsientoContableCajaChica=idEstadoAsientoContableCajaChicaActual;
				}
				
					
				this.sDetalleReporte=EstadoAsientoContableCajaChicaConstantesFunciones.getDetalleIndicePorId(idEstadoAsientoContableCajaChica);
				
				this.estadoasientocontablecajachicas=new ArrayList<EstadoAsientoContableCajaChica>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadoasientocontablecajachicaLogic.getEntity(idEstadoAsientoContableCajaChica);
					
					//estadoasientocontablecajachicaLogic.getEntityWithConnection(idEstadoAsientoContableCajaChica);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoasientocontablecajachicaLogic.setEstadoAsientoContableCajaChicas(new ArrayList<EstadoAsientoContableCajaChica>());
					estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().add(estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChica());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoasientocontablecajachicas=new ArrayList<EstadoAsientoContableCajaChica>();
					this.estadoasientocontablecajachicas.add(estadoasientocontablecajachica);
				}
				
				if(estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChica()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoAsientoContableCajaChica();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoAsientoContableCajaChica();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoasientocontablecajachicas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoasientocontablecajachicas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoAsientoContableCajaChica estadoasientocontablecajachica) {
		Boolean permite=true;
		
		if(this.estadoasientocontablecajachica.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoAsientoContableCajaChicaConstantesFunciones.getOrderByListaEstadoAsientoContableCajaChica();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoAsientoContableCajaChicaConstantesFunciones.getOrderByListaEstadoAsientoContableCajaChica();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoAsientoContableCajaChica estadoasientocontablecajachica:estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas()) {
				if(estadoasientocontablecajachica.getsType().equals(Constantes2.S_TOTALES)) {
					estadoasientocontablecajachicaTotales=estadoasientocontablecajachica;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoAsientoContableCajaChica estadoasientocontablecajachica:this.estadoasientocontablecajachicas) {
				if(estadoasientocontablecajachica.getsType().equals(Constantes2.S_TOTALES)) {
					estadoasientocontablecajachicaTotales=estadoasientocontablecajachica;
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
			this.estadoasientocontablecajachicaAux=new EstadoAsientoContableCajaChica();
			this.estadoasientocontablecajachicaAux.setsType(Constantes2.S_TOTALES);
			this.estadoasientocontablecajachicaAux.setIsNew(false);
			this.estadoasientocontablecajachicaAux.setIsChanged(false);
			this.estadoasientocontablecajachicaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoAsientoContableCajaChicaConstantesFunciones.TotalizarValoresFilaEstadoAsientoContableCajaChica(this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas(),this.estadoasientocontablecajachicaAux);
				
				this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().add(this.estadoasientocontablecajachicaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoAsientoContableCajaChicaConstantesFunciones.TotalizarValoresFilaEstadoAsientoContableCajaChica(this.estadoasientocontablecajachicas,this.estadoasientocontablecajachicaAux);
				
				this.estadoasientocontablecajachicas.add(this.estadoasientocontablecajachicaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadoasientocontablecajachicaTotales=new EstadoAsientoContableCajaChica();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().remove(estadoasientocontablecajachicaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoasientocontablecajachicas.remove(estadoasientocontablecajachicaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadoasientocontablecajachicaTotales=new EstadoAsientoContableCajaChica();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoAsientoContableCajaChica estadoasientocontablecajachica:estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas()) {
				if(estadoasientocontablecajachica.getsType().equals(Constantes2.S_TOTALES)) {
					estadoasientocontablecajachicaTotales=estadoasientocontablecajachica;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoAsientoContableCajaChicaConstantesFunciones.TotalizarValoresFilaEstadoAsientoContableCajaChica(this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas(),estadoasientocontablecajachicaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoAsientoContableCajaChica estadoasientocontablecajachica:this.estadoasientocontablecajachicas) {
				if(estadoasientocontablecajachica.getsType().equals(Constantes2.S_TOTALES)) {
					estadoasientocontablecajachicaTotales=estadoasientocontablecajachica;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoAsientoContableCajaChicaConstantesFunciones.TotalizarValoresFilaEstadoAsientoContableCajaChica(this.estadoasientocontablecajachicas,estadoasientocontablecajachicaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoAsientoContableCajaChicaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoAsientoContableCajaChicaPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicaPorCodigo(codigo);
				
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
	
	public void inicializarPermisosEstadoAsientoContableCajaChica() {
		this.isPermisoTodoEstadoAsientoContableCajaChica=false;
		this.isPermisoNuevoEstadoAsientoContableCajaChica=false;
		this.isPermisoActualizarEstadoAsientoContableCajaChica=false;
		this.isPermisoActualizarOriginalEstadoAsientoContableCajaChica=false;
		this.isPermisoEliminarEstadoAsientoContableCajaChica=false;
		this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica=false;
		this.isPermisoConsultaEstadoAsientoContableCajaChica=false;
		this.isPermisoBusquedaEstadoAsientoContableCajaChica=false;
		this.isPermisoReporteEstadoAsientoContableCajaChica=false;		
		this.isPermisoOrdenEstadoAsientoContableCajaChica=false;		
		this.isPermisoPaginacionMedioEstadoAsientoContableCajaChica=false;		
		this.isPermisoPaginacionAltoEstadoAsientoContableCajaChica=false;
		this.isPermisoPaginacionTodoEstadoAsientoContableCajaChica=false;
		this.isPermisoCopiarEstadoAsientoContableCajaChica=false;		
		this.isPermisoVerFormEstadoAsientoContableCajaChica=false;		
		this.isPermisoDuplicarEstadoAsientoContableCajaChica=false;		
		this.isPermisoOrdenEstadoAsientoContableCajaChica=false;		
	}
	
	public void setPermisosUsuarioEstadoAsientoContableCajaChica(Boolean isPermiso) {
		this.isPermisoTodoEstadoAsientoContableCajaChica=isPermiso;
		this.isPermisoNuevoEstadoAsientoContableCajaChica=isPermiso;
		this.isPermisoActualizarEstadoAsientoContableCajaChica=isPermiso;
		this.isPermisoActualizarOriginalEstadoAsientoContableCajaChica=isPermiso;
		this.isPermisoEliminarEstadoAsientoContableCajaChica=isPermiso;
		this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica=isPermiso;
		this.isPermisoConsultaEstadoAsientoContableCajaChica=isPermiso;
		this.isPermisoBusquedaEstadoAsientoContableCajaChica=isPermiso;
		this.isPermisoReporteEstadoAsientoContableCajaChica=isPermiso;
		this.isPermisoOrdenEstadoAsientoContableCajaChica=isPermiso;		
		this.isPermisoPaginacionMedioEstadoAsientoContableCajaChica=isPermiso;		
		this.isPermisoPaginacionAltoEstadoAsientoContableCajaChica=isPermiso;		
		this.isPermisoPaginacionTodoEstadoAsientoContableCajaChica=isPermiso;		
		this.isPermisoCopiarEstadoAsientoContableCajaChica=isPermiso;		
		this.isPermisoVerFormEstadoAsientoContableCajaChica=isPermiso;		
		this.isPermisoDuplicarEstadoAsientoContableCajaChica=isPermiso;
		this.isPermisoOrdenEstadoAsientoContableCajaChica=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoAsientoContableCajaChica(Boolean isPermiso) {
		//this.isPermisoTodoEstadoAsientoContableCajaChica=isPermiso;
		this.isPermisoNuevoEstadoAsientoContableCajaChica=isPermiso;
		this.isPermisoActualizarEstadoAsientoContableCajaChica=isPermiso;
		this.isPermisoActualizarOriginalEstadoAsientoContableCajaChica=isPermiso;
		this.isPermisoEliminarEstadoAsientoContableCajaChica=isPermiso;
		this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica=isPermiso;
		//this.isPermisoConsultaEstadoAsientoContableCajaChica=isPermiso;
		//this.isPermisoBusquedaEstadoAsientoContableCajaChica=isPermiso;
		//this.isPermisoReporteEstadoAsientoContableCajaChica=isPermiso;
		//this.isPermisoOrdenEstadoAsientoContableCajaChica=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoAsientoContableCajaChica=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoAsientoContableCajaChica=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoAsientoContableCajaChica=isPermiso;		
		//this.isPermisoCopiarEstadoAsientoContableCajaChica=isPermiso;		
		//this.isPermisoDuplicarEstadoAsientoContableCajaChica=isPermiso;
		//this.isPermisoOrdenEstadoAsientoContableCajaChica=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoAsientoContableCajaChicaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EstadoAsientoContableCajaChicaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoAsientoContableCajaChica(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoAsientoContableCajaChicaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoAsientoContableCajaChicaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoAsientoContableCajaChicaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoAsientoContableCajaChicaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEstadoAsientoContableCajaChica() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoAsientoContableCajaChicaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoAsientoContableCajaChicaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoAsientoContableCajaChica=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoAsientoContableCajaChica=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoAsientoContableCajaChica=this.isPermisoActualizarEstadoAsientoContableCajaChica;
			this.isPermisoEliminarEstadoAsientoContableCajaChica=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoAsientoContableCajaChica=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoAsientoContableCajaChica=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoAsientoContableCajaChica=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoAsientoContableCajaChica=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoAsientoContableCajaChica=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoAsientoContableCajaChica=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoAsientoContableCajaChica=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoAsientoContableCajaChica=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoAsientoContableCajaChica=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoAsientoContableCajaChica=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoAsientoContableCajaChica=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoAsientoContableCajaChica=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoAsientoContableCajaChica.setToolTipText(this.jTableDatosEstadoAsientoContableCajaChica.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoAsientoContableCajaChica(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoAsientoContableCajaChica(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoAsientoContableCajaChicaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoAsientoContableCajaChicaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoAsientoContableCajaChica() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyEstadoAsientoContableCajaChicaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoAsientoContableCajaChicaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoAsientoContableCajaChicaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoAsientoContableCajaChicaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoAsientoContableCajaChicaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoAsientoContableCajaChica()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoAsientoContableCajaChica()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoAsientoContableCajaChica(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoAsientoContableCajaChica()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoAsientoContableCajaChica();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachica)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachica,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoAsientoContableCajaChica()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoAsientoContableCajaChica()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoAsientoContableCajaChica()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoAsientoContableCajaChica()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoAsientoContableCajaChica()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoAsientoContableCajaChica()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoAsientoContableCajaChica(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoAsientoContableCajaChica()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoAsientoContableCajaChicaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoAsientoContableCajaChicaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoAsientoContableCajaChicaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadoasientocontablecajachicaSessionBean=new EstadoAsientoContableCajaChicaSessionBean(); 
		this.estadoasientocontablecajachicaConstantesFunciones=new EstadoAsientoContableCajaChicaConstantesFunciones(); 
		this.estadoasientocontablecajachicaBean=new EstadoAsientoContableCajaChica();//(this.estadoasientocontablecajachicaConstantesFunciones); 		
		this.estadoasientocontablecajachicaReturnGeneral=new EstadoAsientoContableCajaChicaParameterReturnGeneral(); 
		
		this.estadoasientocontablecajachicaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoasientocontablecajachicaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoAsientoContableCajaChicaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoAsientoContableCajaChicaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoAsientoContableCajaChicaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoAsientoContableCajaChica(true);
			
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
			
			this.estadoasientocontablecajachicaConstantesFunciones=new EstadoAsientoContableCajaChicaConstantesFunciones(); 
			this.estadoasientocontablecajachicaBean=new EstadoAsientoContableCajaChica();//this.estadoasientocontablecajachicaConstantesFunciones); 			
			this.estadoasientocontablecajachicaReturnGeneral=new EstadoAsientoContableCajaChicaParameterReturnGeneral(); 
		
			EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Asiento Contable Caja Chica Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadoasientocontablecajachica=new EstadoAsientoContableCajaChica();
			this.estadoasientocontablecajachicas = new ArrayList<EstadoAsientoContableCajaChica>();
			this.estadoasientocontablecajachicasAux = new ArrayList<EstadoAsientoContableCajaChica>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic=new EstadoAsientoContableCajaChicaLogic();
				this.estadoasientocontablecajachicaLogic.getNewConnexionToDeep("");
			}
			
			//this.estadoasientocontablecajachicaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadoasientocontablecajachicaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica);	
					}
					
					if(this.jInternalFrameImportacionEstadoAsientoContableCajaChica!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoAsientoContableCajaChica);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoAsientoContableCajaChica!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoAsientoContableCajaChica);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica);
				this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.setVisible(false);
				this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica);
					this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoAsientoContableCajaChica!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoAsientoContableCajaChica);
					this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setVisible(false);
					this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoAsientoContableCajaChica!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoAsientoContableCajaChica);
					this.jInternalFrameOrderByEstadoAsientoContableCajaChica.setVisible(false);
					this.jInternalFrameOrderByEstadoAsientoContableCajaChica.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoAsientoContableCajaChicaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoAsientoContableCajaChicaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadoasientocontablecajachicaReturnGeneral=new EstadoAsientoContableCajaChicaParameterReturnGeneral();
			
			this.estadoasientocontablecajachicaParameterGeneral=new EstadoAsientoContableCajaChicaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadoasientocontablecajachicaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoAsientoContableCajaChicaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoAsientoContableCajaChicaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado(),this.estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoAsientoContableCajaChicaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado(),this.estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaDuplicarEstadoAsientoContableCajaChica=true;
			this.isVisibilidadCeldaCopiarEstadoAsientoContableCajaChica=true;
			this.isVisibilidadCeldaVerFormEstadoAsientoContableCajaChica=true;
			this.isVisibilidadCeldaOrdenEstadoAsientoContableCajaChica=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaModificarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoAsientoContableCajaChica("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoAsientoContableCajaChica();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoAsientoContableCajaChica(false);
			
			this.setPermisosUsuarioEstadoAsientoContableCajaChica();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado() 
				|| (this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado() && this.estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoAsientoContableCajaChicaClasesRelacionadas();
			}
			
			if(this.estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoAsientoContableCajaChicaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoAsientoContableCajaChica();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoAsientoContableCajaChica();
			}
			
			if(!this.isPermisoBusquedaEstadoAsientoContableCajaChica) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoAsientoContableCajaChica,this.isPermisoPaginacionMedioEstadoAsientoContableCajaChica,this.isPermisoPaginacionTodoEstadoAsientoContableCajaChica);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoAsientoContableCajaChicaConstantesFunciones.getTiposSeleccionarEstadoAsientoContableCajaChica());
				
				this.tiposColumnasSelect=EstadoAsientoContableCajaChicaConstantesFunciones.getTiposSeleccionarEstadoAsientoContableCajaChica(true);
				
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
			//if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoAsientoContableCajaChica();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoAsientoContableCajaChica(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoAsientoContableCajaChica(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoAsientoContableCajaChica() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadoasientocontablecajachicaImplementable= (EstadoAsientoContableCajaChicaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoAsientoContableCajaChicaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadoasientocontablecajachicaImplementableHome= (EstadoAsientoContableCajaChicaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoAsientoContableCajaChicaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadoasientocontablecajachicas= new ArrayList<EstadoAsientoContableCajaChica>();
			this.estadoasientocontablecajachicasEliminados= new ArrayList<EstadoAsientoContableCajaChica>();
						
			this.isEsNuevoEstadoAsientoContableCajaChica=false;
			this.esParaAccionDesdeFormularioEstadoAsientoContableCajaChica=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoAsientoContableCajaChica(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoAsientoContableCajaChica();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoAsientoContableCajaChicaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoAsientoContableCajaChica("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoAsientoContableCajaChica(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoAsientoContableCajaChica();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoAsientoContableCajaChica();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoAsientoContableCajaChica(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoAsientoContableCajaChica: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoAsientoContableCajaChica() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoAsientoContableCajaChica")) {
				iIndex=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTabbedPaneRelacionesEstadoAsientoContableCajaChica.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTabbedPaneRelacionesEstadoAsientoContableCajaChica.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoAsientoContableCajaChica();	
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
	
	public void cargarCombosForeignKeyEstadoAsientoContableCajaChica(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoAsientoContableCajaChica(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoAsientoContableCajaChica(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoAsientoContableCajaChicaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoAsientoContableCajaChica();
		
		this.cargarCombosFrameForeignKeyEstadoAsientoContableCajaChica();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoAsientoContableCajaChica();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoAsientoContableCajaChica();
		}
	}
	
	
	
	public void jButtonNuevoEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
			
			
			if(jTableDatosEstadoAsientoContableCajaChica.getRowCount()>=1) {
				jTableDatosEstadoAsientoContableCajaChica.removeRowSelectionInterval(0, jTableDatosEstadoAsientoContableCajaChica.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoAsientoContableCajaChica=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoAsientoContableCajaChica(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoAsientoContableCajaChica(true);			
			//this.estadoasientocontablecajachica=new EstadoAsientoContableCajaChica();
			//this.estadoasientocontablecajachica.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoAsientoContableCajaChica(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoAsientoContableCajaChica() ;
			
			if(EstadoAsientoContableCajaChicaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoAsientoContableCajaChica(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadoasientocontablecajachica);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontablecajachica);				
			
			EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
			
			if(this.estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoAsientoContableCajaChica: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasSeleccionados=new ArrayList<EstadoAsientoContableCajaChica>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRows().length;			
			}
			
			estadoasientocontablecajachicasSeleccionados=this.getEstadoAsientoContableCajaChicasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoAsientoContableCajaChica--;			
				//EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux= new EstadoAsientoContableCajaChica();			
				//estadoasientocontablecajachicaAux.setId(this.iIdNuevoEstadoAsientoContableCajaChica);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoAsientoContableCajaChica estadoasientocontablecajachicaOrigen=new EstadoAsientoContableCajaChica();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaOrigen : estadoasientocontablecajachicasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadoasientocontablecajachicaOrigen =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoasientocontablecajachicaOrigen =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoAsientoContableCajaChica();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadoasientocontablecajachica.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoAsientoContableCajaChica(estadoasientocontablecajachicaOrigen,this.estadoasientocontablecajachica,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().add(this.estadoasientocontablecajachicaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoasientocontablecajachicas.add(this.estadoasientocontablecajachicaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoAsientoContableCajaChica(false);
				
				this.jTableDatosEstadoAsientoContableCajaChica.setRowSelectionInterval(this.getIndiceNuevoEstadoAsientoContableCajaChica(), this.getIndiceNuevoEstadoAsientoContableCajaChica());
				
				int iLastRow =  this.jTableDatosEstadoAsientoContableCajaChica.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoAsientoContableCajaChica.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoAsientoContableCajaChica.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoAsientoContableCajaChica(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasSeleccionados=new ArrayList<EstadoAsientoContableCajaChica>();									
		
			EstadoAsientoContableCajaChica estadoasientocontablecajachicaOrigen=new EstadoAsientoContableCajaChica();
			EstadoAsientoContableCajaChica estadoasientocontablecajachicaDestino=new EstadoAsientoContableCajaChica();
				
			estadoasientocontablecajachicasSeleccionados=this.getEstadoAsientoContableCajaChicasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadoasientocontablecajachicasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoasientocontablecajachicaOrigen =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoasientocontablecajachicaOrigen =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoasientocontablecajachicaDestino =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoasientocontablecajachicaDestino =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadoasientocontablecajachicaOrigen =estadoasientocontablecajachicasSeleccionados.get(0);
				estadoasientocontablecajachicaDestino =estadoasientocontablecajachicasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoAsientoContableCajaChica(estadoasientocontablecajachicaOrigen,estadoasientocontablecajachicaDestino,true,false);
				
				estadoasientocontablecajachicaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoasientocontablecajachicaDestino,estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoasientocontablecajachicaDestino,estadoasientocontablecajachicas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoAsientoContableCajaChica(false);
				
				//this.jTableDatosEstadoAsientoContableCajaChica.setRowSelectionInterval(this.getIndiceNuevoEstadoAsientoContableCajaChica(), this.getIndiceNuevoEstadoAsientoContableCajaChica());
				
				int iLastRow =  this.jTableDatosEstadoAsientoContableCajaChica.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoAsientoContableCajaChica.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoAsientoContableCajaChica.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoAsientoContableCajaChica(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoAsientoContableCajaChica.isVisible();
			
			
			this.jPanelParametrosReportesEstadoAsientoContableCajaChica.setVisible(!isVisible);
			this.jPanelPaginacionEstadoAsientoContableCajaChica.setVisible(!isVisible);
			this.jPanelAccionesEstadoAsientoContableCajaChica.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoAsientoContableCajaChica();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoAsientoContableCajaChica();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoAsientoContableCajaChica();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoAsientoContableCajaChica();
			
			this.abrirFrameOrderByEstadoAsientoContableCajaChica();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoAsientoContableCajaChica();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoAsientoContableCajaChica(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoAsientoContableCajaChica);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.setSize(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.iWidthFormulario,this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jContentPaneDetalleEstadoAsientoContableCajaChica.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTabbedPaneRelacionesEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jContentPaneDetalleEstadoAsientoContableCajaChica.getWidth(),EstadoAsientoContableCajaChicaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTabbedPaneRelacionesEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jContentPaneDetalleEstadoAsientoContableCajaChica.getWidth(),EstadoAsientoContableCajaChicaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTabbedPaneRelacionesEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jContentPaneDetalleEstadoAsientoContableCajaChica.getWidth(),EstadoAsientoContableCajaChicaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoAsientoContableCajaChica() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoAsientoContableCajaChica==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoAsientoContableCajaChica=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoAsientoContableCajaChica,false,this);
				} else {
					this.jInternalFrameOrderByEstadoAsientoContableCajaChica=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoAsientoContableCajaChica,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoAsientoContableCajaChica);
				this.jInternalFrameOrderByEstadoAsientoContableCajaChica.setVisible(false);
				this.jInternalFrameOrderByEstadoAsientoContableCajaChica.setSelected(false);
				
				this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoAsientoContableCajaChica"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoAsientoContableCajaChica();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoAsientoContableCajaChica() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoAsientoContableCajaChica==null) {
				
				this.jInternalFrameImportacionEstadoAsientoContableCajaChica=new ImportacionJInternalFrame(EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoAsientoContableCajaChica);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoAsientoContableCajaChica);
				this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setVisible(false);
				this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setSelected(false);


				this.jInternalFrameImportacionEstadoAsientoContableCajaChica.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoAsientoContableCajaChica"));
				this.jInternalFrameImportacionEstadoAsientoContableCajaChica.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoAsientoContableCajaChica"));
				this.jInternalFrameImportacionEstadoAsientoContableCajaChica.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoAsientoContableCajaChica"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoAsientoContableCajaChica() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica==null) {
				this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica=new ReporteDinamicoJInternalFrame(EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica);
				this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoAsientoContableCajaChica"));
				this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoAsientoContableCajaChica"));
				this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoAsientoContableCajaChica"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoAsientoContableCajaChica();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEstadoAsientoContableCajaChica() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoAsientoContableCajaChica);
			
	       	this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.dispose();
			//this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoAsientoContableCajaChica() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoAsientoContableCajaChica() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setVisible(true);
	        this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoAsientoContableCajaChica() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.setVisible(true);
	        this.jInternalFrameOrderByEstadoAsientoContableCajaChica.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoAsientoContableCajaChica() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.setVisible(false);
	        this.jInternalFrameOrderByEstadoAsientoContableCajaChica.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoAsientoContableCajaChica() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoAsientoContableCajaChica() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setVisible(false);
	        this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoAsientoContableCajaChica(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoAsientoContableCajaChica(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoAsientoContableCajaChica(true);
			//this.isEsNuevoEstadoAsientoContableCajaChica=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoAsientoContableCajaChica("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoAsientoContableCajaChica(false) ;
			
			if(estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EstadoAsientoContableCajaChicaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoAsientoContableCajaChica(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoAsientoContableCajaChica(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoAsientoContableCajaChicaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoAsientoContableCajaChica(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoAsientoContableCajaChica(true);
			//this.isEsNuevoEstadoAsientoContableCajaChica=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadoasientocontablecajachica.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoAsientoContableCajaChica("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoAsientoContableCajaChica(false) ;
			
			if(EstadoAsientoContableCajaChicaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoAsientoContableCajaChica(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoAsientoContableCajaChica(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoAsientoContableCajaChica(false);
			
			//if(!this.isEsNuevoEstadoAsientoContableCajaChica) {								
				int intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica);
				
			}
			
			if(this.permiteMantenimiento(this.estadoasientocontablecajachica)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoAsientoContableCajaChica=true;
					this.inicializarActualizarBindingTablaEstadoAsientoContableCajaChica(false);
					this.isEsNuevoEstadoAsientoContableCajaChica=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoAsientoContableCajaChica=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoAsientoContableCajaChica=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoAsientoContableCajaChica(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoAsientoContableCajaChica(false);
				
				this.habilitarDeshabilitarControlesEstadoAsientoContableCajaChica(false);
			
												
				
				if(EstadoAsientoContableCajaChicaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoAsientoContableCajaChica();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoAsientoContableCajaChicaActionPerformed(evt,estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoAsientoContableCajaChica.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadoasientocontablecajachica.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContableCajaChica.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContableCajaChica.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				this.estadoasientocontablecajachica.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				this.estadoasientocontablecajachica.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadoasientocontablecajachica)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoAsientoContableCajaChicaModel) this.jTableDatosEstadoAsientoContableCajaChica.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoAsientoContableCajaChica=true;
				this.inicializarActualizarBindingTablaEstadoAsientoContableCajaChica(false);
				this.isEsNuevoEstadoAsientoContableCajaChica=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoAsientoContableCajaChica(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoAsientoContableCajaChica(false);
				
				this.habilitarDeshabilitarControlesEstadoAsientoContableCajaChica(false);
				
				
				
				if(EstadoAsientoContableCajaChicaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoAsientoContableCajaChica();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoAsientoContableCajaChica.getRowCount()>=1) {
				jTableDatosEstadoAsientoContableCajaChica.removeRowSelectionInterval(0, jTableDatosEstadoAsientoContableCajaChica.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoAsientoContableCajaChica(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoAsientoContableCajaChica(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoAsientoContableCajaChica(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoAsientoContableCajaChica(false) ;
			
			this.isEsNuevoEstadoAsientoContableCajaChica=false;
			
			if(EstadoAsientoContableCajaChicaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoAsientoContableCajaChica();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoAsientoContableCajaChica(false);
				
				//SI ES MANUAL
				if(EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoAsientoContableCajaChica();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoAsientoContableCajaChica--;			
			//EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux= new EstadoAsientoContableCajaChica();			
			//estadoasientocontablecajachicaAux.setId(this.iIdNuevoEstadoAsientoContableCajaChica);
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoAsientoContableCajaChica();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica);
			
			this.estadoasientocontablecajachica.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().add(this.estadoasientocontablecajachicaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadoasientocontablecajachicas.add(this.estadoasientocontablecajachicaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoAsientoContableCajaChica(false);
			
			this.jTableDatosEstadoAsientoContableCajaChica.setRowSelectionInterval(this.getIndiceNuevoEstadoAsientoContableCajaChica(), this.getIndiceNuevoEstadoAsientoContableCajaChica());
			
			int iLastRow =  this.jTableDatosEstadoAsientoContableCajaChica.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoAsientoContableCajaChica.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoAsientoContableCajaChica.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoAsientoContableCajaChica(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoAsientoContableCajaChica(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoAsientoContableCajaChica(false);
			
			//SI ES MANUAL
			if(EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoAsientoContableCajaChica();
			}
			
			//this.abrirFrameTreeEstadoAsientoContableCajaChica();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Asiento Contable Caja ChicaS ?", "MANTENIMIENTO DE Estado Asiento Contable Caja Chica", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoAsientoContableCajaChica.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoAsientoContableCajaChica();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadoasientocontablecajachicaReturnGeneral=estadoasientocontablecajachicaLogic.procesarImportacionEstadoAsientoContableCajaChicasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadoasientocontablecajachicaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoAsientoContableCajaChicaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoAsientoContableCajaChica.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setFileImportacion(this.jInternalFrameImportacionEstadoAsientoContableCajaChica.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoAsientoContableCajaChica.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoAsientoContableCajaChica.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoAsientoContableCajaChica.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoAsientoContableCajaChica.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasSeleccionados=new ArrayList<EstadoAsientoContableCajaChica>();		

		estadoasientocontablecajachicasSeleccionados=this.getEstadoAsientoContableCajaChicasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoAsientoContableCajaChicaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoAsientoContableCajaChicaBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoAsientoContableCajaChicas("Todos",estadoasientocontablecajachicasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Asiento Contable Caja Chica",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasSeleccionados=new ArrayList<EstadoAsientoContableCajaChica>();		
		
		estadoasientocontablecajachicasSeleccionados=this.getEstadoAsientoContableCajaChicasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoasientocontablecajachica";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoAsientoContableCajaChicas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoAsientoContableCajaChica estadoasientocontablecajachica:estadoasientocontablecajachicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoasientocontablecajachica.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoAsientoContableCajaChica estadoasientocontablecajachica:estadoasientocontablecajachicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoasientocontablecajachica.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoAsientoContableCajaChica(row);				
			//	iRow++;
			//}				
			
			//for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:estadoasientocontablecajachicasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoAsientoContableCajaChica(estadoasientocontablecajachicaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Asiento Contable Caja Chica",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadoasientocontablecajachicaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoAsientoContableCajaChica(false);
			
			//SI ES MANUAL
			if(EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoAsientoContableCajaChica();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoAsientoContableCajaChica(false);
			
			//SI ES MANUAL
			if(EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoAsientoContableCajaChica();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoAsientoContableCajaChicaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoAsientoContableCajaChica(false);
			
			//SI ES MANUAL
			if(EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoAsientoContableCajaChica();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontablecajachicaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoAsientoContableCajaChica() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoAsientoContableCajaChica.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoAsientoContableCajaChica.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoAsientoContableCajaChica.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoAsientoContableCajaChica.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoAsientoContableCajaChica.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoAsientoContableCajaChica.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoAsientoContableCajaChica.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoAsientoContableCajaChica(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoAsientoContableCajaChica(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoAsientoContableCajaChica(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoAsientoContableCajaChica(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoAsientoContableCajaChica(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoAsientoContableCajaChica(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoAsientoContableCajaChica(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoAsientoContableCajaChica(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoAsientoContableCajaChica() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoAsientoContableCajaChica();
		
		this.inicializarActualizarBindingBotonesManualEstadoAsientoContableCajaChica(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoAsientoContableCajaChica();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoAsientoContableCajaChica() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoAsientoContableCajaChica(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoAsientoContableCajaChica(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoAsientoContableCajaChica.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoAsientoContableCajaChica.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jCheckBoxPostAccionNuevoEstadoAsientoContableCajaChica.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jCheckBoxPostAccionSinCerrarEstadoAsientoContableCajaChica.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jCheckBoxPostAccionSinMensajeEstadoAsientoContableCajaChica.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoAsientoContableCajaChica.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoAsientoContableCajaChica.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {
				this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jCheckBoxPostAccionNuevoEstadoAsientoContableCajaChica.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jCheckBoxPostAccionSinCerrarEstadoAsientoContableCajaChica.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jCheckBoxPostAccionSinMensajeEstadoAsientoContableCajaChica.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoAsientoContableCajaChica.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoAsientoContableCajaChica.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoAsientoContableCajaChica.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoAsientoContableCajaChica.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoAsientoContableCajaChica.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoAsientoContableCajaChica.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoAsientoContableCajaChica(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoAsientoContableCajaChica(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoAsientoContableCajaChica() throws Exception {
		try	{
			if(EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoAsientoContableCajaChica();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoAsientoContableCajaChica() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoAsientoContableCajaChica() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoAsientoContableCajaChica.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoAsientoContableCajaChica.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoAsientoContableCajaChica.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoAsientoContableCajaChica.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoAsientoContableCajaChica.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoAsientoContableCajaChica.addItem(reporte);
			}
			
			
			if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoAsientoContableCajaChica.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoAsientoContableCajaChica.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoAsientoContableCajaChica.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoAsientoContableCajaChica.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoAsientoContableCajaChica();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoAsientoContableCajaChica() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica!=null) {
				this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica!=null) {
				this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoAsientoContableCajaChica()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoAsientoContableCajaChica(Boolean esInicializar) throws Exception {				
		if(EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoAsientoContableCajaChica();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoAsientoContableCajaChica() throws Exception {
		this.inicializarActualizarBindingTablaEstadoAsientoContableCajaChica(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoAsientoContableCajaChica() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoAsientoContableCajaChicaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoAsientoContableCajaChicaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoAsientoContableCajaChicaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoAsientoContableCajaChicaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoAsientoContableCajaChicaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoAsientoContableCajaChicaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoAsientoContableCajaChica(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadoasientocontablecajachicas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoAsientoContableCajaChica.setModel(new EstadoAsientoContableCajaChicaModel(this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoAsientoContableCajaChica.setModel(new EstadoAsientoContableCajaChicaModel(this.estadoasientocontablecajachicas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoAsientoContableCajaChica!=null && this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoAsientoContableCajaChica();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoAsientoContableCajaChica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoAsientoContableCajaChica,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoAsientoContableCajaChicaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO,estadoasientocontablecajachicaConstantesFunciones.resaltarSeleccionarEstadoAsientoContableCajaChica,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO,estadoasientocontablecajachicaConstantesFunciones.resaltarSeleccionarEstadoAsientoContableCajaChica,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoAsientoContableCajaChica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoAsientoContableCajaChica,EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_ID));

		if(this.estadoasientocontablecajachicaConstantesFunciones.mostraridEstadoAsientoContableCajaChica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadoasientocontablecajachicaConstantesFunciones.resaltaridEstadoAsientoContableCajaChica,this.estadoasientocontablecajachicaConstantesFunciones.activaridEstadoAsientoContableCajaChica,this,true,"idEstadoAsientoContableCajaChica","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoasientocontablecajachicaConstantesFunciones.resaltaridEstadoAsientoContableCajaChica,this.estadoasientocontablecajachicaConstantesFunciones.activaridEstadoAsientoContableCajaChica,this,true,"idEstadoAsientoContableCajaChica","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoAsientoContableCajaChica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoAsientoContableCajaChica,EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_CODIGO));

		if(this.estadoasientocontablecajachicaConstantesFunciones.mostrarcodigoEstadoAsientoContableCajaChica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoasientocontablecajachicaConstantesFunciones.resaltarcodigoEstadoAsientoContableCajaChica,this.estadoasientocontablecajachicaConstantesFunciones.activarcodigoEstadoAsientoContableCajaChica,this,true,"codigoEstadoAsientoContableCajaChica","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoasientocontablecajachicaConstantesFunciones.resaltarcodigoEstadoAsientoContableCajaChica,this.estadoasientocontablecajachicaConstantesFunciones.activarcodigoEstadoAsientoContableCajaChica,this,true,"codigoEstadoAsientoContableCajaChica","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoAsientoContableCajaChicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoAsientoContableCajaChica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoAsientoContableCajaChica,EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_NOMBRE));

		if(this.estadoasientocontablecajachicaConstantesFunciones.mostrarnombreEstadoAsientoContableCajaChica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoasientocontablecajachicaConstantesFunciones.resaltarnombreEstadoAsientoContableCajaChica,this.estadoasientocontablecajachicaConstantesFunciones.activarnombreEstadoAsientoContableCajaChica,this,true,"nombreEstadoAsientoContableCajaChica","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoasientocontablecajachicaConstantesFunciones.resaltarnombreEstadoAsientoContableCajaChica,this.estadoasientocontablecajachicaConstantesFunciones.activarnombreEstadoAsientoContableCajaChica,this,true,"nombreEstadoAsientoContableCajaChica","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoAsientoContableCajaChicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoAsientoContableCajaChica.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoAsientoContableCajaChica.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoAsientoContableCajaChica && this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoAsientoContableCajaChica.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoAsientoContableCajaChica.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoAsientoContableCajaChica && this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoAsientoContableCajaChica && this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoAsientoContableCajaChica.moveColumn(this.jTableDatosEstadoAsientoContableCajaChica.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoAsientoContableCajaChica.moveColumn(this.jTableDatosEstadoAsientoContableCajaChica.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoAsientoContableCajaChica.moveColumn(this.jTableDatosEstadoAsientoContableCajaChica.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoAsientoContableCajaChica.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoAsientoContableCajaChica.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoAsientoContableCajaChica,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoAsientoContableCajaChica.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoAsientoContableCajaChica.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoAsientoContableCajaChica.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoAsientoContableCajaChica.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoAsientoContableCajaChica.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadoasientocontablecajachicas.size()-1;
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
		//this.jTableDatosEstadoAsientoContableCajaChica.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoAsientoContableCajaChica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoAsientoContableCajaChica();
			
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
				
				//this.isEsNuevoEstadoAsientoContableCajaChica=false;
					
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
			
				if(this.estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoAsientoContableCajaChica.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadoasientocontablecajachica.getsType().equals("DUPLICADO")
				   || this.estadoasientocontablecajachica.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoAsientoContableCajaChica=true;
				
				} else {
					this.isEsNuevoEstadoAsientoContableCajaChica=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
					if(this.estadoasientocontablecajachica.getId()>=0 && !this.estadoasientocontablecajachica.getIsNew()) {						
						this.isEsNuevoEstadoAsientoContableCajaChica=false;
						
					} else {
						this.isEsNuevoEstadoAsientoContableCajaChica=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoAsientoContableCajaChica(esRelaciones);						
				
				this.seleccionarEstadoAsientoContableCajaChica(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadoasientocontablecajachica.getId()<0) {
					this.isEsNuevoEstadoAsientoContableCajaChica=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoAsientoContableCajaChica(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoAsientoContableCajaChica(evt,rowIndex);
				}	
				
				if(this.estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoAsientoContableCajaChica: " + this.dDif); 
					}
				}								
				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoAsientoContableCajaChica(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadoasientocontablecajachica)) {
					if(this.estadoasientocontablecajachica.getId()>0) {
						this.estadoasientocontablecajachica.setIsDeleted(true);
						
						this.estadoasientocontablecajachicasEliminados.add(this.estadoasientocontablecajachica);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().remove(this.estadoasientocontablecajachica);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoasientocontablecajachicas.remove(this.estadoasientocontablecajachica);				
					}
					
					
					((EstadoAsientoContableCajaChicaModel) this.jTableDatosEstadoAsientoContableCajaChica.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoAsientoContableCajaChica(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoAsientoContableCajaChica(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoAsientoContableCajaChica) {
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoAsientoContableCajaChica.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoAsientoContableCajaChica("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoAsientoContableCajaChica(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoAsientoContableCajaChica() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachica) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoAsientoContableCajaChica(estadoasientocontablecajachica,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachica,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoAsientoContableCajaChica(estadoasientocontablecajachica);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoAsientoContableCajaChica(estadoasientocontablecajachica,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoAsientoContableCajaChica(estadoasientocontablecajachica);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachica) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldidEstadoAsientoContableCajaChica.setText(estadoasientocontablecajachica.getId().toString());
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldcodigoEstadoAsientoContableCajaChica.setText(estadoasientocontablecajachica.getcodigo());
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextAreanombreEstadoAsientoContableCajaChica.setText(estadoasientocontablecajachica.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoAsientoContableCajaChica estadoasientocontablecajachicaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadoasientocontablecajachicaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoAsientoContableCajaChica estadoasientocontablecajachicaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadoasientocontablecajachicaLocal=this.estadoasientocontablecajachica;
			} else {
				estadoasientocontablecajachicaLocal=this.estadoasientocontablecajachicaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadoasientocontablecajachicaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoAsientoContableCajaChica(estadoasientocontablecajachicaLocal,true);
					
					if(estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadoasientocontablecajachicaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadoasientocontablecajachicaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachica,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoAsientoContableCajaChica(estadoasientocontablecajachica,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContableCajaChica(estadoasientocontablecajachica);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachica,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoAsientoContableCajaChica(estadoasientocontablecajachica,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachica,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldidEstadoAsientoContableCajaChica.getText()==null || this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldidEstadoAsientoContableCajaChica.getText()=="" || this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldidEstadoAsientoContableCajaChica.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldidEstadoAsientoContableCajaChica.setText("0");
			}

			if(conColumnasBase) {estadoasientocontablecajachica.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldidEstadoAsientoContableCajaChica.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jLabelIdEstadoAsientoContableCajaChica,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoasientocontablecajachica.setcodigo(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldcodigoEstadoAsientoContableCajaChica.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jLabelcodigoEstadoAsientoContableCajaChica,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoasientocontablecajachica.setnombre(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextAreanombreEstadoAsientoContableCajaChica.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jLabelnombreEstadoAsientoContableCajaChica,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachicaBean,EstadoAsientoContableCajaChica estadoasientocontablecajachica,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachicaOrigen,EstadoAsientoContableCajaChica estadoasientocontablecajachica,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoasientocontablecajachicaOrigen.getId()!=null && !estadoasientocontablecajachicaOrigen.getId().equals(0L))) {estadoasientocontablecajachica.setId(estadoasientocontablecajachicaOrigen.getId());}}
			if(conDefault || (!conDefault && estadoasientocontablecajachicaOrigen.getcodigo()!=null && !estadoasientocontablecajachicaOrigen.getcodigo().equals(""))) {estadoasientocontablecajachica.setcodigo(estadoasientocontablecajachicaOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadoasientocontablecajachicaOrigen.getnombre()!=null && !estadoasientocontablecajachicaOrigen.getnombre().equals(""))) {estadoasientocontablecajachica.setnombre(estadoasientocontablecajachicaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachica) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldidEstadoAsientoContableCajaChica.setText(estadoasientocontablecajachica.getId().toString());
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldcodigoEstadoAsientoContableCajaChica.setText(estadoasientocontablecajachica.getcodigo());
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextAreanombreEstadoAsientoContableCajaChica.setText(estadoasientocontablecajachica.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChicaBean estadoasientocontablecajachicaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldidEstadoAsientoContableCajaChica.setText(estadoasientocontablecajachicaBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldcodigoEstadoAsientoContableCajaChica.setText(estadoasientocontablecajachicaBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextAreanombreEstadoAsientoContableCajaChica.setText(estadoasientocontablecajachicaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChicaParameterReturnGeneral estadoasientocontablecajachicaReturnGeneral,EstadoAsientoContableCajaChicaBean estadoasientocontablecajachicaBean,Boolean conDefault) throws Exception { 
		try {
			EstadoAsientoContableCajaChica estadoasientocontablecajachicaLocal=new EstadoAsientoContableCajaChica();
			
			estadoasientocontablecajachicaLocal=estadoasientocontablecajachicaReturnGeneral.getEstadoAsientoContableCajaChica();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoasientocontablecajachicaLocal.getId()!=null && !estadoasientocontablecajachicaLocal.getId().equals(0L))) {estadoasientocontablecajachicaBean.setId(estadoasientocontablecajachicaLocal.getId());}}
			if(conDefault || (!conDefault && estadoasientocontablecajachicaLocal.getcodigo()!=null && !estadoasientocontablecajachicaLocal.getcodigo().equals(""))) {estadoasientocontablecajachicaBean.setcodigo(estadoasientocontablecajachicaLocal.getcodigo());}
			if(conDefault || (!conDefault && estadoasientocontablecajachicaLocal.getnombre()!=null && !estadoasientocontablecajachicaLocal.getnombre().equals(""))) {estadoasientocontablecajachicaBean.setnombre(estadoasientocontablecajachicaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoAsientoContableCajaChicaGenerico(Long idEstadoAsientoContableCajaChicaSeleccionado,JComboBox jComboBoxEstadoAsientoContableCajaChica,List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasLocal)throws Exception {
		try {
			EstadoAsientoContableCajaChica  estadoasientocontablecajachicaTemp=null;

			for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:estadoasientocontablecajachicasLocal) {
				if(estadoasientocontablecajachicaAux.getId()!=null && estadoasientocontablecajachicaAux.getId().equals(idEstadoAsientoContableCajaChicaSeleccionado)) {
					estadoasientocontablecajachicaTemp=estadoasientocontablecajachicaAux;
					break;
				}
			}

			jComboBoxEstadoAsientoContableCajaChica.setSelectedItem(estadoasientocontablecajachicaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoAsientoContableCajaChicaGenerico(JComboBox jComboBoxEstadoAsientoContableCajaChica,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoAsientoContableCajaChica.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoAsientoContableCajaChica.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoAsientoContableCajaChica.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoAsientoContableCajaChica.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoasientocontablecajachica=(EstadoAsientoContableCajaChica) estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) estadoasientocontablecajachicas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoAsientoContableCajaChica estadoasientocontablecajachicaRow=new EstadoAsientoContableCajaChica();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoasientocontablecajachicaRow=(EstadoAsientoContableCajaChica) estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoasientocontablecajachicaRow=(EstadoAsientoContableCajaChica) estadoasientocontablecajachicas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoAsientoContableCajaChica(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica && this.isPermisoNuevoEstadoAsientoContableCajaChica));			
			this.jButtonDuplicarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaDuplicarEstadoAsientoContableCajaChica && this.isPermisoDuplicarEstadoAsientoContableCajaChica));			
			this.jButtonCopiarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaCopiarEstadoAsientoContableCajaChica && this.isPermisoCopiarEstadoAsientoContableCajaChica));
			this.jButtonVerFormEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaVerFormEstadoAsientoContableCajaChica && this.isPermisoVerFormEstadoAsientoContableCajaChica));
			
			this.jButtonAbrirOrderByEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaOrdenEstadoAsientoContableCajaChica && this.isPermisoOrdenEstadoAsientoContableCajaChica));			
			
			this.jButtonNuevoRelacionesEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica && this.isPermisoNuevoEstadoAsientoContableCajaChica));			
			this.jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica && this.isPermisoNuevoEstadoAsientoContableCajaChica && this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica));
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonModificarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaModificarEstadoAsientoContableCajaChica && this.isPermisoActualizarEstadoAsientoContableCajaChica));	
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonActualizarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica && this.isPermisoActualizarEstadoAsientoContableCajaChica));	
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonEliminarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica && this.isPermisoEliminarEstadoAsientoContableCajaChica));
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonCancelarEstadoAsientoContableCajaChica.setVisible(this.isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica);							
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonGuardarCambiosEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica && this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica && this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica && this.isPermisoNuevoEstadoAsientoContableCajaChica));						
			this.jButtonDuplicarToolBarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaDuplicarEstadoAsientoContableCajaChica && this.isPermisoDuplicarEstadoAsientoContableCajaChica));						
			this.jButtonCopiarToolBarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaCopiarEstadoAsientoContableCajaChica && this.isPermisoCopiarEstadoAsientoContableCajaChica));			
			this.jButtonVerFormToolBarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaVerFormEstadoAsientoContableCajaChica && this.isPermisoVerFormEstadoAsientoContableCajaChica));			
			this.jButtonAbrirOrderByToolBarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaOrdenEstadoAsientoContableCajaChica && this.isPermisoOrdenEstadoAsientoContableCajaChica));
			this.jButtonNuevoRelacionesToolBarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica && this.isPermisoNuevoEstadoAsientoContableCajaChica));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica && this.isPermisoNuevoEstadoAsientoContableCajaChica && this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica));			
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonModificarToolBarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaModificarEstadoAsientoContableCajaChica && this.isPermisoActualizarEstadoAsientoContableCajaChica));	
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonActualizarToolBarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica  && this.isPermisoActualizarEstadoAsientoContableCajaChica));	
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonEliminarToolBarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica && this.isPermisoEliminarEstadoAsientoContableCajaChica));
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonCancelarToolBarEstadoAsientoContableCajaChica.setVisible(this.isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica);				
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonGuardarCambiosToolBarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica && this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica && this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica && this.isPermisoNuevoEstadoAsientoContableCajaChica));			
			this.jMenuItemDuplicarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaDuplicarEstadoAsientoContableCajaChica && this.isPermisoDuplicarEstadoAsientoContableCajaChica));			
			this.jMenuItemCopiarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaCopiarEstadoAsientoContableCajaChica && this.isPermisoCopiarEstadoAsientoContableCajaChica));			
			this.jMenuItemVerFormEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaVerFormEstadoAsientoContableCajaChica && this.isPermisoVerFormEstadoAsientoContableCajaChica));			
			this.jMenuItemAbrirOrderByEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaOrdenEstadoAsientoContableCajaChica && this.isPermisoOrdenEstadoAsientoContableCajaChica));			
			//this.jMenuItemMostrarOcultarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaOrdenEstadoAsientoContableCajaChica && this.isPermisoOrdenEstadoAsientoContableCajaChica));
			this.jMenuItemDetalleAbrirOrderByEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaOrdenEstadoAsientoContableCajaChica && this.isPermisoOrdenEstadoAsientoContableCajaChica));			
			//this.jMenuItemDetalleMostrarOcultarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaOrdenEstadoAsientoContableCajaChica && this.isPermisoOrdenEstadoAsientoContableCajaChica));			
			this.jMenuItemNuevoRelacionesEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica && this.isPermisoNuevoEstadoAsientoContableCajaChica));			
			this.jMenuItemNuevoGuardarCambiosEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica && this.isPermisoNuevoEstadoAsientoContableCajaChica && this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica));									
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jMenuItemModificarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaModificarEstadoAsientoContableCajaChica && this.isPermisoActualizarEstadoAsientoContableCajaChica));	
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jMenuItemActualizarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica && this.isPermisoActualizarEstadoAsientoContableCajaChica));	
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jMenuItemEliminarEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica && this.isPermisoEliminarEstadoAsientoContableCajaChica));
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jMenuItemCancelarEstadoAsientoContableCajaChica.setVisible(this.isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica);				
			}
			
			this.jMenuItemGuardarCambiosEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica && this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica));						
			this.jMenuItemGuardarCambiosTablaEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica && this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica=this.jButtonNuevoEstadoAsientoContableCajaChica.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoAsientoContableCajaChica=this.jButtonDuplicarEstadoAsientoContableCajaChica.isVisible();
			this.isVisibilidadCeldaCopiarEstadoAsientoContableCajaChica=this.jButtonCopiarEstadoAsientoContableCajaChica.isVisible();
			this.isVisibilidadCeldaVerFormEstadoAsientoContableCajaChica=this.jButtonVerFormEstadoAsientoContableCajaChica.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoAsientoContableCajaChica=this.jButtonAbrirOrderByEstadoAsientoContableCajaChica.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica=this.jButtonNuevoRelacionesEstadoAsientoContableCajaChica.isVisible();
			this.isVisibilidadCeldaModificarEstadoAsientoContableCajaChica=this.jButtonModificarEstadoAsientoContableCajaChica.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {
			this.isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonActualizarEstadoAsientoContableCajaChica.isVisible();
			this.isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonEliminarEstadoAsientoContableCajaChica.isVisible();
			this.isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonCancelarEstadoAsientoContableCajaChica.isVisible();
			this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonGuardarCambiosEstadoAsientoContableCajaChica.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica=this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica=this.jButtonNuevoToolBarEstadoAsientoContableCajaChica.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica=this.jButtonNuevoRelacionesToolBarEstadoAsientoContableCajaChica.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {
			this.isVisibilidadCeldaModificarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonModificarToolBarEstadoAsientoContableCajaChica.isVisible();
			this.isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonActualizarToolBarEstadoAsientoContableCajaChica.isVisible();
			this.isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonEliminarToolBarEstadoAsientoContableCajaChica.isVisible();
			this.isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonCancelarToolBarEstadoAsientoContableCajaChica.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=this.jButtonGuardarCambiosToolBarEstadoAsientoContableCajaChica.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica=this.jButtonGuardarCambiosTablaToolBarEstadoAsientoContableCajaChica.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica=this.jMenuItemNuevoEstadoAsientoContableCajaChica.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica=this.jMenuItemNuevoRelacionesEstadoAsientoContableCajaChica.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {
			this.isVisibilidadCeldaModificarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jMenuItemModificarEstadoAsientoContableCajaChica.isVisible();
			this.isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jMenuItemActualizarEstadoAsientoContableCajaChica.isVisible();
			this.isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jMenuItemEliminarEstadoAsientoContableCajaChica.isVisible();
			this.isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica=this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jMenuItemCancelarEstadoAsientoContableCajaChica.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=this.jMenuItemGuardarCambiosEstadoAsientoContableCajaChica.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica=this.jMenuItemGuardarCambiosTablaEstadoAsientoContableCajaChica.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoAsientoContableCajaChica(Boolean esInicializar) {
		if(EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones()) {
				//if(this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoAsientoContableCajaChica();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoAsientoContableCajaChica(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoAsientoContableCajaChica() {
		this.jButtonNuevoEstadoAsientoContableCajaChica.setVisible(this.isPermisoNuevoEstadoAsientoContableCajaChica);			
		this.jButtonDuplicarEstadoAsientoContableCajaChica.setVisible(this.isPermisoDuplicarEstadoAsientoContableCajaChica);			
		this.jButtonCopiarEstadoAsientoContableCajaChica.setVisible(this.isPermisoCopiarEstadoAsientoContableCajaChica);			
		this.jButtonVerFormEstadoAsientoContableCajaChica.setVisible(this.isPermisoVerFormEstadoAsientoContableCajaChica);			
		
		this.jButtonAbrirOrderByEstadoAsientoContableCajaChica.setVisible(this.isPermisoOrdenEstadoAsientoContableCajaChica);					
		
		this.jButtonNuevoRelacionesEstadoAsientoContableCajaChica.setVisible(this.isPermisoNuevoEstadoAsientoContableCajaChica);			
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonModificarEstadoAsientoContableCajaChica.setVisible(this.isPermisoActualizarEstadoAsientoContableCajaChica);	
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonActualizarEstadoAsientoContableCajaChica.setVisible(this.isPermisoActualizarEstadoAsientoContableCajaChica);	
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonEliminarEstadoAsientoContableCajaChica.setVisible(this.isPermisoEliminarEstadoAsientoContableCajaChica);
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonCancelarEstadoAsientoContableCajaChica.setVisible(this.isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica);						
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonGuardarCambiosEstadoAsientoContableCajaChica.setVisible(this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica.setVisible(this.isPermisoActualizarEstadoAsientoContableCajaChica);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoAsientoContableCajaChica() {
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonModificarEstadoAsientoContableCajaChica.setVisible(this.isPermisoActualizarEstadoAsientoContableCajaChica);	
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonActualizarEstadoAsientoContableCajaChica.setVisible(this.isPermisoActualizarEstadoAsientoContableCajaChica);	
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonEliminarEstadoAsientoContableCajaChica.setVisible(this.isPermisoEliminarEstadoAsientoContableCajaChica);
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonCancelarEstadoAsientoContableCajaChica.setVisible(this.isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica);							
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonGuardarCambiosEstadoAsientoContableCajaChica.setVisible((this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica && this.isPermisoGuardarCambiosEstadoAsientoContableCajaChica));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoAsientoContableCajaChica() {
		if(EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoAsientoContableCajaChica();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoAsientoContableCajaChica() {
	}
	
	public void jTableDatosEstadoAsientoContableCajaChicaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoAsientoContableCajaChica(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoAsientoContableCajaChicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoAsientoContableCajaChica(this.getestadoasientocontablecajachica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoasientocontablecajachica==null) {
						this.estadoasientocontablecajachica = new EstadoAsientoContableCajaChica();
					}

					this.setVariablesFormularioToObjetoActualEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica);
				}

				if(this.estadoasientocontablecajachica.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadoasientocontablecajachica.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoAsientoContableCajaChica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoAsientoContableCajaChicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoAsientoContableCajaChica(this.getestadoasientocontablecajachica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoasientocontablecajachica==null) {
						this.estadoasientocontablecajachica = new EstadoAsientoContableCajaChica();
					}

					this.setVariablesFormularioToObjetoActualEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica);
				}

				if(this.estadoasientocontablecajachica.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadoasientocontablecajachica.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoAsientoContableCajaChica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoAsientoContableCajaChicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoAsientoContableCajaChica(this.getestadoasientocontablecajachica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoasientocontablecajachica==null) {
						this.estadoasientocontablecajachica = new EstadoAsientoContableCajaChica();
					}

					this.setVariablesFormularioToObjetoActualEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica);
				}

				if(this.estadoasientocontablecajachica.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadoasientocontablecajachica.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoAsientoContableCajaChica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoAsientoContableCajaChica() {
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.dispose();
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica!=null) {
			this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.dispose();
			this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica=null;
		}
		
		if(this.jInternalFrameImportacionEstadoAsientoContableCajaChica!=null) {
			this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoAsientoContableCajaChica.dispose();
			this.jInternalFrameImportacionEstadoAsientoContableCajaChica=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoAsientoContableCajaChica();
			
			EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoAsientoContableCajaChica")) {
				jButtonNuevoEstadoAsientoContableCajaChicaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoAsientoContableCajaChica")) {
				jButtonDuplicarEstadoAsientoContableCajaChicaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoAsientoContableCajaChica")) {
				jButtonCopiarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoAsientoContableCajaChica")) {
				jButtonVerFormEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoAsientoContableCajaChica")) {
				jButtonNuevoEstadoAsientoContableCajaChicaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoAsientoContableCajaChica")) {
				jButtonDuplicarEstadoAsientoContableCajaChicaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoAsientoContableCajaChica")) {
				jButtonNuevoEstadoAsientoContableCajaChicaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoAsientoContableCajaChica")) {
				jButtonDuplicarEstadoAsientoContableCajaChicaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoAsientoContableCajaChica")) {
				jButtonNuevoEstadoAsientoContableCajaChicaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoAsientoContableCajaChica")) {
				jButtonNuevoEstadoAsientoContableCajaChicaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoAsientoContableCajaChica")) {
				jButtonNuevoEstadoAsientoContableCajaChicaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoAsientoContableCajaChica")) {
				jButtonModificarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoAsientoContableCajaChica")) {
				jButtonModificarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoAsientoContableCajaChica")) {
				jButtonModificarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoAsientoContableCajaChica")) {
				jButtonActualizarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoAsientoContableCajaChica")) {
				jButtonActualizarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoAsientoContableCajaChica")) {
				jButtonActualizarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoAsientoContableCajaChica")) {
				jButtonEliminarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoAsientoContableCajaChica")) {
				jButtonEliminarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoAsientoContableCajaChica")) {
				jButtonEliminarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoAsientoContableCajaChica")) {
				jButtonCancelarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoAsientoContableCajaChica")) {
				jButtonCancelarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoAsientoContableCajaChica")) {
				jButtonCancelarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoAsientoContableCajaChica")) {
				jButtonCerrarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoAsientoContableCajaChica")) {
				jButtonCerrarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoAsientoContableCajaChica")) {
				jButtonCerrarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoAsientoContableCajaChica")) {
				jButtonMostrarOcultarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoAsientoContableCajaChica")) {
				jButtonCancelarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoAsientoContableCajaChica")) {
				jButtonGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoAsientoContableCajaChica")) {
				jButtonGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoAsientoContableCajaChica")) {
				jButtonCopiarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoAsientoContableCajaChica")) {
				jButtonVerFormEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoAsientoContableCajaChica")) {
				jButtonGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoAsientoContableCajaChica")) {
				jButtonCopiarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoAsientoContableCajaChica")) {
				jButtonVerFormEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoAsientoContableCajaChica")) {
				jButtonGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoAsientoContableCajaChica")) {
				jButtonGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoAsientoContableCajaChica")) {
				jButtonGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoAsientoContableCajaChica")) {
				jButtonRecargarInformacionEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoAsientoContableCajaChica")) {
				jButtonRecargarInformacionEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoAsientoContableCajaChica")) {
				jButtonRecargarInformacionEstadoAsientoContableCajaChicaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoAsientoContableCajaChica")) {
				jButtonAnterioresEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoAsientoContableCajaChica")) {
				jButtonAnterioresEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoAsientoContableCajaChica")) {
				jButtonAnterioresEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoAsientoContableCajaChica")) {
				jButtonSiguientesEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoAsientoContableCajaChica")) {
				jButtonSiguientesEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoAsientoContableCajaChica")) {
				jButtonSiguientesEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoAsientoContableCajaChica") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoAsientoContableCajaChica")) {
				jButtonAbrirOrderByEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoAsientoContableCajaChica") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoAsientoContableCajaChica")) {
				jButtonMostrarOcultarEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoAsientoContableCajaChica")) {
				jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoAsientoContableCajaChica")) {
				jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoAsientoContableCajaChica")) {
				jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoAsientoContableCajaChica")) {
				jButtonCerrarReporteDinamicoEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoAsientoContableCajaChica")) {
				jButtonGenerarReporteDinamicoEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoAsientoContableCajaChica")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoAsientoContableCajaChicaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoAsientoContableCajaChica")) {
				jButtonCerrarImportacionEstadoAsientoContableCajaChicaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoAsientoContableCajaChica")) {
				
				jButtonGenerarImportacionEstadoAsientoContableCajaChicaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoAsientoContableCajaChica")) {
				
				jButtonAbrirImportacionEstadoAsientoContableCajaChicaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoAsientoContableCajaChica")) {
				jComboBoxTiposAccionesEstadoAsientoContableCajaChicaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoAsientoContableCajaChica")) {
				jComboBoxTiposRelacionesEstadoAsientoContableCajaChicaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoAsientoContableCajaChica")) {
				jComboBoxTiposAccionesEstadoAsientoContableCajaChicaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoAsientoContableCajaChica")) {
				
				jComboBoxTiposSeleccionarEstadoAsientoContableCajaChicaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoAsientoContableCajaChica")) {
				jTextFieldValorCampoGeneralEstadoAsientoContableCajaChicaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoAsientoContableCajaChica")) {
				jButtonAbrirOrderByEstadoAsientoContableCajaChicaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoAsientoContableCajaChica")) {
				jButtonAbrirOrderByEstadoAsientoContableCajaChicaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoAsientoContableCajaChica")) {
				jButtonCerrarOrderByEstadoAsientoContableCajaChicaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoAsientoContableCajaChicaBusqueda")) {
				this.jButtonidEstadoAsientoContableCajaChicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoAsientoContableCajaChicaBusqueda")) {
				this.jButtoncodigoEstadoAsientoContableCajaChicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoAsientoContableCajaChicaBusqueda")) {
				this.jButtonnombreEstadoAsientoContableCajaChicaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoAsientoContableCajaChica();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAsientoContableCajaChicaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontablecajachica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontablecajachica);
				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
				
				


				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContableCajaChica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContableCajaChica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoAsientoContableCajaChica estadoasientocontablecajachicaLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadoasientocontablecajachicaLocal=this.estadoasientocontablecajachica;
			} else {
				estadoasientocontablecajachicaLocal=this.estadoasientocontablecajachicaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontablecajachica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontablecajachica);
				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
							
				
				


				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContableCajaChica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContableCajaChica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAsientoContableCajaChicaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachicaAnterior =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoasientocontablecajachicaAnterior =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
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
			
			EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
			
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
			
			


			
			EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAsientoContableCajaChicaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontablecajachica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontablecajachica);
				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
								
						
				


				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContableCajaChica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContableCajaChica.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontablecajachica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontablecajachica);
				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
								
				
				


				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContableCajaChica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContableCajaChica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAsientoContableCajaChicaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachicaAnterior =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoasientocontablecajachicaAnterior =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontablecajachica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontablecajachica);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAsientoContableCajaChicaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachicaAnterior =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoasientocontablecajachicaAnterior =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAsientoContableCajaChicaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontablecajachica);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontablecajachica);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontablecajachica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontablecajachica);
				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
							
				
				


				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContableCajaChica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContableCajaChica.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAsientoContableCajaChicaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoasientocontablecajachicaAnterior =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoasientocontablecajachicaAnterior =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
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
			
			EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
			
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
			
			


			
			EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAsientoContableCajaChicaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontablecajachica);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontablecajachica);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontablecajachica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontablecajachica);
				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
								
				
				


				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContableCajaChica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContableCajaChica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAsientoContableCajaChicaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachicaAnterior =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoasientocontablecajachicaAnterior =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAsientoContableCajaChicaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontablecajachica);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontablecajachica);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAsientoContableCajaChicaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontablecajachica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontablecajachica);
				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoAsientoContableCajaChica")) {
					jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChicaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoAsientoContableCajaChica")) {
					jCheckBoxSeleccionadosEstadoAsientoContableCajaChicaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoAsientoContableCajaChica")) {
					
				}
				
				


				
				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContableCajaChica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContableCajaChica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontablecajachica);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontablecajachica);
				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
												
				
				


				
				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContableCajaChica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContableCajaChica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAsientoContableCajaChicaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoasientocontablecajachicaAnterior =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoasientocontablecajachicaAnterior =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAsientoContableCajaChicaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontablecajachica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontablecajachica);
				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
				
				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
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
			
			EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
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
			
			


			
			EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAsientoContableCajaChicaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontablecajachica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontablecajachica);
				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContableCajaChica.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContableCajaChica.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontablecajachica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontablecajachica);
				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
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
				
				


				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContableCajaChica.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContableCajaChica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAsientoContableCajaChicaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontablecajachicaAnterior =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoasientocontablecajachicaAnterior =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoAsientoContableCajaChica")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoAsientoContableCajaChicaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadoasientocontablecajachica =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadoasientocontablecajachica);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoAsientoContableCajaChica")) {
				
				}
				
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoAsientoContableCajaChica")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoAsientoContableCajaChica.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoAsientoContableCajaChica")) {
			
			}
			
			EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoAsientoContableCajaChica();
			
			EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoAsientoContableCajaChica")) {
				jButtonNuevoEstadoAsientoContableCajaChicaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoAsientoContableCajaChica")) {
				jButtonDuplicarEstadoAsientoContableCajaChicaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoAsientoContableCajaChica")) {
				jButtonCopiarEstadoAsientoContableCajaChicaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoAsientoContableCajaChica")) {
				jButtonVerFormEstadoAsientoContableCajaChicaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoAsientoContableCajaChica")) {
				jButtonNuevoEstadoAsientoContableCajaChicaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoAsientoContableCajaChica")) {
				jButtonModificarEstadoAsientoContableCajaChicaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoAsientoContableCajaChica")) {
				jButtonActualizarEstadoAsientoContableCajaChicaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoAsientoContableCajaChica")) {
				jButtonEliminarEstadoAsientoContableCajaChicaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoAsientoContableCajaChica")) {
				jButtonGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoAsientoContableCajaChica")) {
				jButtonCancelarEstadoAsientoContableCajaChicaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoAsientoContableCajaChica")) {
				jButtonCerrarEstadoAsientoContableCajaChicaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoAsientoContableCajaChica")) {
				jButtonGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoAsientoContableCajaChica")) {
				jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoAsientoContableCajaChica")) {
				jButtonAbrirOrderByEstadoAsientoContableCajaChicaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoAsientoContableCajaChica")) {
				jButtonRecargarInformacionEstadoAsientoContableCajaChicaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoAsientoContableCajaChica")) {
				jButtonAnterioresEstadoAsientoContableCajaChicaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoAsientoContableCajaChica")) {
				jButtonSiguientesEstadoAsientoContableCajaChicaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoAsientoContableCajaChicaBusqueda")) {
				this.jButtonidEstadoAsientoContableCajaChicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoAsientoContableCajaChicaBusqueda")) {
				this.jButtoncodigoEstadoAsientoContableCajaChicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoAsientoContableCajaChicaBusqueda")) {
				this.jButtonnombreEstadoAsientoContableCajaChicaBusquedaActionPerformed(evt);
			}
			
			EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoAsientoContableCajaChica();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoAsientoContableCajaChica")) {
				closingInternalFrameEstadoAsientoContableCajaChica();
				
			} else if(sTipo.equals("jButtonCancelarEstadoAsientoContableCajaChica")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoAsientoContableCajaChica = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoAsientoContableCajaChicaBeanSwingJInternalFrame jInternalFrameParent=(EstadoAsientoContableCajaChicaBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoAsientoContableCajaChica.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoAsientoContableCajaChicaActionPerformed(null);
			}
			
			EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoasientocontablecajachica,new Object(),this.estadoasientocontablecajachicaParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoAsientoContableCajaChica(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoAsientoContableCajaChica(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoAsientoContableCajaChica(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadoasientocontablecajachica)) {
			if(!esControlTabla) {
				if(EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica);			
				}
				
				if(this.estadoasientocontablecajachicaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoasientocontablecajachicaReturnGeneral=estadoasientocontablecajachicaLogic.procesarEventosEstadoAsientoContableCajaChicasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas(),this.estadoasientocontablecajachica,this.estadoasientocontablecajachicaParameterGeneral,this.isEsNuevoEstadoAsientoContableCajaChica,classes);//this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChica()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoAsientoContableCajaChica(this.estadoasientocontablecajachicaReturnGeneral,this.estadoasientocontablecajachicaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadoasientocontablecajachicaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoAsientoContableCajaChica(classes,this.estadoasientocontablecajachicaReturnGeneral,this.estadoasientocontablecajachicaBean,false);
					}
						
					if(this.estadoasientocontablecajachicaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoAsientoContableCajaChica(this.estadoasientocontablecajachicaReturnGeneral.getEstadoAsientoContableCajaChica());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoAsientoContableCajaChica(this.estadoasientocontablecajachicaReturnGeneral.getEstadoAsientoContableCajaChica());	
					}
						
					if(this.estadoasientocontablecajachicaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoAsientoContableCajaChica(this.estadoasientocontablecajachicaReturnGeneral.getEstadoAsientoContableCajaChica(),classes);//this.estadoasientocontablecajachicaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica,classes);//this.estadoasientocontablecajachicaBean);									
				}
			
				if(EstadoAsientoContableCajaChicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContableCajaChica(this.estadoasientocontablecajachica);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadoasientocontablecajachicaAnterior!=null) {
						this.estadoasientocontablecajachica=this.estadoasientocontablecajachicaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoasientocontablecajachicaReturnGeneral=estadoasientocontablecajachicaLogic.procesarEventosEstadoAsientoContableCajaChicasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas(),this.estadoasientocontablecajachica,this.estadoasientocontablecajachicaParameterGeneral,this.isEsNuevoEstadoAsientoContableCajaChica,classes);//this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChica()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoasientocontablecajachicaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadoasientocontablecajachicaReturnGeneral.getEstadoAsientoContableCajaChica(),estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadoasientocontablecajachicaReturnGeneral.getEstadoAsientoContableCajaChica(),this.estadoasientocontablecajachicas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoAsientoContableCajaChica.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoAsientoContableCajaChica.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoAsientoContableCajaChica();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoAsientoContableCajaChica() throws Exception {
		
		EstadoAsientoContableCajaChicaModel estadoasientocontablecajachicaModel=(EstadoAsientoContableCajaChicaModel)this.jTableDatosEstadoAsientoContableCajaChica.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoasientocontablecajachicaModel.estadoasientocontablecajachicas=this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadoasientocontablecajachicaModel.estadoasientocontablecajachicas=this.estadoasientocontablecajachicas;
		}
		
		
		((EstadoAsientoContableCajaChicaModel) this.jTableDatosEstadoAsientoContableCajaChica.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoAsientoContableCajaChica() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadoasientocontablecajachicaAnterior(),this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadoasientocontablecajachicaAnterior(),this.estadoasientocontablecajachicas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoAsientoContableCajaChica();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachica,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
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
										
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoasientocontablecajachica,new Object(),generalEntityParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoAsientoContableCajaChicaConstantesFunciones.getClassesRelationshipsOfEstadoAsientoContableCajaChica(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoAsientoContableCajaChicaConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoAsientoContableCajaChica(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoAsientoContableCajaChica(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoasientocontablecajachica,new Object(),generalEntityParameterGeneral,this.estadoasientocontablecajachicaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChicaBean estadoasientocontablecajachicaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoAsientoContableCajaChica(ArrayList<Classe> classes,EstadoAsientoContableCajaChicaReturnGeneral estadoasientocontablecajachicaReturnGeneral,EstadoAsientoContableCajaChicaBean estadoasientocontablecajachicaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachica,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadoasientocontablecajachica)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica = new EstadoAsientoContableCajaChicaDetalleFormJInternalFrame(jDesktopPane,this.estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones(),this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica);
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.setVisible(false);
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.estadoasientocontablecajachicaLogic=this.estadoasientocontablecajachicaLogic;
		
		this.cargarCombosFrameForeignKeyEstadoAsientoContableCajaChica("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoAsientoContableCajaChica();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoAsientoContableCajaChica();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoAsientoContableCajaChica("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoAsientoContableCajaChica();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoAsientoContableCajaChica"));
		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonModificarEstadoAsientoContableCajaChica.addActionListener(new ButtonActionListener(this,"ModificarEstadoAsientoContableCajaChica"));

		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonModificarToolBarEstadoAsientoContableCajaChica.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoAsientoContableCajaChica"));
					
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jMenuItemModificarEstadoAsientoContableCajaChica.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoAsientoContableCajaChica"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonActualizarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"ActualizarEstadoAsientoContableCajaChica"));
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonActualizarToolBarEstadoAsientoContableCajaChica.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoAsientoContableCajaChica"));
						
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jMenuItemActualizarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoAsientoContableCajaChica"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonEliminarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"EliminarEstadoAsientoContableCajaChica"));
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonEliminarToolBarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoAsientoContableCajaChica"));
								
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jMenuItemEliminarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoAsientoContableCajaChica"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonCancelarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"CancelarEstadoAsientoContableCajaChica"));
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonCancelarToolBarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoAsientoContableCajaChica"));
					
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jMenuItemCancelarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoAsientoContableCajaChica"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jMenuItemDetalleCerrarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoAsientoContableCajaChica"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonGuardarCambiosToolBarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoAsientoContableCajaChica"));
		
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonGuardarCambiosToolBarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoAsientoContableCajaChica"));
		
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoAsientoContableCajaChica"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonidEstadoAsientoContableCajaChicaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoAsientoContableCajaChicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtoncodigoEstadoAsientoContableCajaChicaBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoAsientoContableCajaChicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonnombreEstadoAsientoContableCajaChicaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoAsientoContableCajaChicaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTabbedPaneRelacionesEstadoAsientoContableCajaChica.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoAsientoContableCajaChica"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoAsientoContableCajaChica"));
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoAsientoContableCajaChica"));
		}
		
		this.jTableDatosEstadoAsientoContableCajaChica.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoAsientoContableCajaChica"));
		
		this.jTableDatosEstadoAsientoContableCajaChica.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoAsientoContableCajaChica"));
		
		this.jButtonNuevoEstadoAsientoContableCajaChica.addActionListener(new ButtonActionListener(this,"NuevoEstadoAsientoContableCajaChica"));
		
		this.jButtonDuplicarEstadoAsientoContableCajaChica.addActionListener(new ButtonActionListener(this,"DuplicarEstadoAsientoContableCajaChica"));
		
		this.jButtonCopiarEstadoAsientoContableCajaChica.addActionListener(new ButtonActionListener(this,"CopiarEstadoAsientoContableCajaChica"));
		
		this.jButtonVerFormEstadoAsientoContableCajaChica.addActionListener(new ButtonActionListener(this,"VerFormEstadoAsientoContableCajaChica"));
		
		
		this.jButtonNuevoToolBarEstadoAsientoContableCajaChica.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoAsientoContableCajaChica"));
			
		this.jButtonDuplicarToolBarEstadoAsientoContableCajaChica.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoAsientoContableCajaChica"));
			
		this.jMenuItemNuevoEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoAsientoContableCajaChica"));
			
		this.jMenuItemDuplicarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoAsientoContableCajaChica"));		
		
		
		this.jButtonNuevoRelacionesEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoAsientoContableCajaChica"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoAsientoContableCajaChica.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoAsientoContableCajaChica"));
			
		this.jMenuItemNuevoRelacionesEstadoAsientoContableCajaChica.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoAsientoContableCajaChica"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonModificarEstadoAsientoContableCajaChica.addActionListener(new ButtonActionListener(this,"ModificarEstadoAsientoContableCajaChica"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonModificarToolBarEstadoAsientoContableCajaChica.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoAsientoContableCajaChica"));
			
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jMenuItemModificarEstadoAsientoContableCajaChica.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoAsientoContableCajaChica"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonActualizarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"ActualizarEstadoAsientoContableCajaChica"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonActualizarToolBarEstadoAsientoContableCajaChica.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoAsientoContableCajaChica"));
				
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jMenuItemActualizarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoAsientoContableCajaChica"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonEliminarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"EliminarEstadoAsientoContableCajaChica"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonEliminarToolBarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoAsientoContableCajaChica"));
						
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jMenuItemEliminarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoAsientoContableCajaChica"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonCancelarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"CancelarEstadoAsientoContableCajaChica"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonCancelarToolBarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoAsientoContableCajaChica"));
			
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jMenuItemCancelarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoAsientoContableCajaChica"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoAsientoContableCajaChica"));		
		
		
		this.jButtonCerrarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"CerrarEstadoAsientoContableCajaChica"));
		
		
		this.jButtonCerrarToolBarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoAsientoContableCajaChica"));
			
		this.jMenuItemCerrarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoAsientoContableCajaChica"));
			
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jMenuItemDetalleCerrarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoAsientoContableCajaChica"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonGuardarCambiosEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoAsientoContableCajaChica"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonGuardarCambiosToolBarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoAsientoContableCajaChica"));
		}
		
		this.jButtonCopiarToolBarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoAsientoContableCajaChica"));
			
		this.jButtonVerFormToolBarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoAsientoContableCajaChica"));
		
		this.jMenuItemGuardarCambiosEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoAsientoContableCajaChica"));
			
		this.jMenuItemCopiarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoAsientoContableCajaChica"));		
		
		this.jMenuItemVerFormEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoAsientoContableCajaChica"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoAsientoContableCajaChica"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoAsientoContableCajaChica"));
			
		this.jMenuItemGuardarCambiosTablaEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoAsientoContableCajaChica"));		
		
		
		
		this.jButtonRecargarInformacionEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoAsientoContableCajaChica"));
					
		this.jButtonRecargarInformacionToolBarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoAsientoContableCajaChica"));
		
		this.jMenuItemRecargarInformacionEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoAsientoContableCajaChica"));		
		
		
		
		this.jButtonAnterioresEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"AnterioresEstadoAsientoContableCajaChica"));
		
		
		this.jButtonAnterioresToolBarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoAsientoContableCajaChica"));
		
		this.jMenuItemAnterioresEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoAsientoContableCajaChica"));		
		
		
		this.jButtonSiguientesEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"SiguientesEstadoAsientoContableCajaChica"));
		
		
		this.jButtonSiguientesToolBarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoAsientoContableCajaChica"));
			
		this.jMenuItemSiguientesEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoAsientoContableCajaChica"));
			
		this.jMenuItemAbrirOrderByEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoAsientoContableCajaChica"));
			
		this.jMenuItemMostrarOcultarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoAsientoContableCajaChica"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoAsientoContableCajaChica"));
			
		this.jMenuItemDetalleMostarOcultarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoAsientoContableCajaChica"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoAsientoContableCajaChica"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoAsientoContableCajaChica"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoAsientoContableCajaChica"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoAsientoContableCajaChica"));

		this.jCheckBoxSeleccionadosEstadoAsientoContableCajaChica.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoAsientoContableCajaChica"));
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoAsientoContableCajaChica"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoAsientoContableCajaChica"));
			
		this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoAsientoContableCajaChica"));
					
		this.jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoAsientoContableCajaChica"));
			
		this.jTextFieldValorCampoGeneralEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoAsientoContableCajaChica"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonidEstadoAsientoContableCajaChicaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoAsientoContableCajaChicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtoncodigoEstadoAsientoContableCajaChicaBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoAsientoContableCajaChicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonnombreEstadoAsientoContableCajaChicaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoAsientoContableCajaChicaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica!=null) {
				this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoAsientoContableCajaChica"));
				this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoAsientoContableCajaChica"));
				this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoAsientoContableCajaChica"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoAsientoContableCajaChica"));				
			//this.jButtonGenerarReporteDinamicoEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoAsientoContableCajaChica"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoAsientoContableCajaChica"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoAsientoContableCajaChica!=null) {
				this.jInternalFrameImportacionEstadoAsientoContableCajaChica.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoAsientoContableCajaChica"));
				this.jInternalFrameImportacionEstadoAsientoContableCajaChica.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoAsientoContableCajaChica"));
				this.jInternalFrameImportacionEstadoAsientoContableCajaChica.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoAsientoContableCajaChica"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoAsientoContableCajaChica"));
			
			this.jButtonAbrirOrderByToolBarEstadoAsientoContableCajaChica.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoAsientoContableCajaChica"));			
			
			if(this.jInternalFrameOrderByEstadoAsientoContableCajaChica!=null) {
				this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoAsientoContableCajaChica"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTabbedPaneRelacionesEstadoAsientoContableCajaChica.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoAsientoContableCajaChica"));
		
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
            		closingInternalFrameEstadoAsientoContableCajaChica();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoAsientoContableCajaChica = (JInternalFrameBase)event.getSource();
	            	
	            EstadoAsientoContableCajaChicaBeanSwingJInternalFrame jInternalFrameParent=(EstadoAsientoContableCajaChicaBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoAsientoContableCajaChica.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoAsientoContableCajaChicaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoAsientoContableCajaChica.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoAsientoContableCajaChicaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoAsientoContableCajaChica.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoAsientoContableCajaChica.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoAsientoContableCajaChicaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoAsientoContableCajaChicaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoAsientoContableCajaChicaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoAsientoContableCajaChica";
		inputMap = this.jButtonNuevoEstadoAsientoContableCajaChica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoAsientoContableCajaChica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoAsientoContableCajaChicaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoAsientoContableCajaChicaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoAsientoContableCajaChicaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoAsientoContableCajaChicaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoAsientoContableCajaChica";
		inputMap = this.jButtonNuevoRelacionesEstadoAsientoContableCajaChica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoAsientoContableCajaChica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoAsientoContableCajaChicaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoAsientoContableCajaChica";
		inputMap = this.jButtonModificarEstadoAsientoContableCajaChica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoAsientoContableCajaChica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoAsientoContableCajaChicaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoAsientoContableCajaChica";
		inputMap = this.jButtonActualizarEstadoAsientoContableCajaChica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoAsientoContableCajaChica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoAsientoContableCajaChicaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoAsientoContableCajaChica";
		inputMap = this.jButtonEliminarEstadoAsientoContableCajaChica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoAsientoContableCajaChica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoAsientoContableCajaChicaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoAsientoContableCajaChica";
		inputMap = this.jButtonCancelarEstadoAsientoContableCajaChica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoAsientoContableCajaChica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoAsientoContableCajaChicaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoAsientoContableCajaChica";
		inputMap = this.jButtonCerrarEstadoAsientoContableCajaChica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoAsientoContableCajaChica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoAsientoContableCajaChicaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonGuardarCambiosEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoAsientoContableCajaChica";
		inputMap = this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonGuardarCambiosEstadoAsientoContableCajaChica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonGuardarCambiosEstadoAsientoContableCajaChica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChicaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoAsientoContableCajaChicaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoAsientoContableCajaChicaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoAsientoContableCajaChica.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoAsientoContableCajaChicaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonidEstadoAsientoContableCajaChicaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoAsientoContableCajaChicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtoncodigoEstadoAsientoContableCajaChicaBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoAsientoContableCajaChicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jButtonnombreEstadoAsientoContableCajaChicaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoAsientoContableCajaChicaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoAsientoContableCajaChica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoAsientoContableCajaChicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoAsientoContableCajaChicaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoAsientoContableCajaChica(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas()) {
					estadoasientocontablecajachicaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:estadoasientocontablecajachicas) {
					estadoasientocontablecajachicaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChicaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoAsientoContableCajaChica(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas()) {
						estadoasientocontablecajachicaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:estadoasientocontablecajachicas) {
						estadoasientocontablecajachicaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:estadoasientocontablecajachicas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoAsientoContableCajaChica(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoAsientoContableCajaChica.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoAsientoContableCajaChica.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoAsientoContableCajaChica,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoAsientoContableCajaChicaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoAsientoContableCajaChica(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoAsientoContableCajaChica.getSelectedRows();
			
			EstadoAsientoContableCajaChica estadoasientocontablecajachicaLocal=new EstadoAsientoContableCajaChica();
			
			//this.seleccionarTodosEstadoAsientoContableCajaChica(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoasientocontablecajachicaLocal =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadoasientocontablecajachicaLocal =(EstadoAsientoContableCajaChica) this.estadoasientocontablecajachicas.toArray()[this.jTableDatosEstadoAsientoContableCajaChica.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadoasientocontablecajachicaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas()) {
						estadoasientocontablecajachicaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:estadoasientocontablecajachicas) {
						estadoasientocontablecajachicaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoAsientoContableCajaChica(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoAsientoContableCajaChica.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoAsientoContableCajaChica.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoAsientoContableCajaChica,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoAsientoContableCajaChicaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoAsientoContableCajaChicaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoAsientoContableCajaChicaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoAsientoContableCajaChica(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoAsientoContableCajaChica.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas()) {
				
						if(sTipoSeleccionar.equals(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoasientocontablecajachicaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoasientocontablecajachicaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:estadoasientocontablecajachicas) {
					
						if(sTipoSeleccionar.equals(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoasientocontablecajachicaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoasientocontablecajachicaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoAsientoContableCajaChica(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoAsientoContableCajaChicaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoAsientoContableCajaChica(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoAsientoContableCajaChica=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoAsientoContableCajaChica) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoAsientoContableCajaChica(conSplash);
				
					this.generarReporteEstadoAsientoContableCajaChicasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoAsientoContableCajaChicasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoAsientoContableCajaChicasSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoAsientoContableCajaChicasSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoAsientoContableCajaChica();
				
				this.exportarEstadoAsientoContableCajaChicasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoAsientoContableCajaChicas();
				//this.importarEstadoAsientoContableCajaChicas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoAsientoContableCajaChica();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoAsientoContableCajaChicasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Asiento Contable Caja Chica", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoAsientoContableCajaChica();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoAsientoContableCajaChica)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoAsientoContableCajaChica(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Asiento Contable Caja Chica",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoAsientoContableCajaChica();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoAsientoContableCajaChica(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoAsientoContableCajaChicaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoAsientoContableCajaChica();
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasSeleccionados=new ArrayList<EstadoAsientoContableCajaChica>();		
			EstadoAsientoContableCajaChica estadoasientocontablecajachica=new EstadoAsientoContableCajaChica();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoAsientoContableCajaChica(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoAsientoContableCajaChica.getSelectedItem();
			
			
			
			
			estadoasientocontablecajachicasSeleccionados=this.getEstadoAsientoContableCajaChicasSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadoasientocontablecajachicasSeleccionados.size()==1) {
				for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:estadoasientocontablecajachicasSeleccionados) {
					estadoasientocontablecajachica=estadoasientocontablecajachicaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoAsientoContableCajaChica();
			
      		//this.finishProcessEstadoAsientoContableCajaChica(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoAsientoContableCajaChicaReturnGeneral() throws Exception {
		if(this.estadoasientocontablecajachicaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadoasientocontablecajachicaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadoasientocontablecajachicaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadoasientocontablecajachicaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadoasientocontablecajachicaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadoasientocontablecajachicaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoAsientoContableCajaChica(false);
		}
		
		if(this.estadoasientocontablecajachicaReturnGeneral.getConRetornoLista() || this.estadoasientocontablecajachicaReturnGeneral.getConRetornoObjeto()) {
			if(this.estadoasientocontablecajachicaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoasientocontablecajachicaLogic.setEstadoAsientoContableCajaChicas(this.estadoasientocontablecajachicaReturnGeneral.getEstadoAsientoContableCajaChicas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadoasientocontablecajachicaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoasientocontablecajachicaLogic.setEstadoAsientoContableCajaChica(this.estadoasientocontablecajachicaReturnGeneral.getEstadoAsientoContableCajaChica());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoAsientoContableCajaChica(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoAsientoContableCajaChica() throws Exception {
		
		
	}
	
	public ArrayList<EstadoAsientoContableCajaChica> getEstadoAsientoContableCajaChicasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasSeleccionados=new ArrayList<EstadoAsientoContableCajaChica>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoAsientoContableCajaChica) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas()) {
					if(estadoasientocontablecajachicaAux.getIsSelected()) {
						estadoasientocontablecajachicasSeleccionados.add(estadoasientocontablecajachicaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:this.estadoasientocontablecajachicas) {
					if(estadoasientocontablecajachicaAux.getIsSelected()) {
						estadoasientocontablecajachicasSeleccionados.add(estadoasientocontablecajachicaAux);				
					}
				}
			}
			
			if(estadoasientocontablecajachicasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadoasientocontablecajachicasSeleccionados.addAll(this.estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadoasientocontablecajachicasSeleccionados.addAll(this.estadoasientocontablecajachicas);				
					}
				}
			}
		} else {
			estadoasientocontablecajachicasSeleccionados.add(this.estadoasientocontablecajachica);
		}
		
		return estadoasientocontablecajachicasSeleccionados;
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
	
	public void generarReporteEstadoAsientoContableCajaChicasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoAsientoContableCajaChicasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoAsientoContableCajaChicasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoAsientoContableCajaChicasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoAsientoContableCajaChicasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Asiento Contable Caja Chica",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoAsientoContableCajaChicasSeleccionados() throws Exception {
		ArrayList<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasSeleccionados=new ArrayList<EstadoAsientoContableCajaChica>();		
		
		estadoasientocontablecajachicasSeleccionados=this.getEstadoAsientoContableCajaChicasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoAsientoContableCajaChicas("Todos",estadoasientocontablecajachicasSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoAsientoContableCajaChicasSeleccionados() throws Exception {
		ArrayList<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasSeleccionados=new ArrayList<EstadoAsientoContableCajaChica>();		
		
		estadoasientocontablecajachicasSeleccionados=this.getEstadoAsientoContableCajaChicasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoAsientoContableCajaChicas("Todos",estadoasientocontablecajachicasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoAsientoContableCajaChicasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasSeleccionados=new ArrayList<EstadoAsientoContableCajaChica>();
		
		estadoasientocontablecajachicasSeleccionados=this.getEstadoAsientoContableCajaChicasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoAsientoContableCajaChicas("Todos",estadoasientocontablecajachicasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoAsientoContableCajaChicasSeleccionados() throws Exception {
		ArrayList<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasSeleccionados=new ArrayList<EstadoAsientoContableCajaChica>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoAsientoContableCajaChica();
		
		
		estadoasientocontablecajachicasSeleccionados=this.getEstadoAsientoContableCajaChicasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoAsientoContableCajaChica();
		
		
		//this.generarReporteEstadoAsientoContableCajaChicas("Todos",estadoasientocontablecajachicasSeleccionados ,estadoasientocontablecajachicaImplementable,estadoasientocontablecajachicaImplementableHome);
	}
	
	public void mostrarImportacionEstadoAsientoContableCajaChicas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoAsientoContableCajaChica();
		
		this.abrirFrameImportacionEstadoAsientoContableCajaChica();		
		
			
		//this.generarReporteEstadoAsientoContableCajaChicas("Todos",estadoasientocontablecajachicasSeleccionados ,estadoasientocontablecajachicaImplementable,estadoasientocontablecajachicaImplementableHome);
	}
	
	public void importarEstadoAsientoContableCajaChicas() throws Exception {		
	
	}
	
	public void exportarEstadoAsientoContableCajaChicasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoAsientoContableCajaChicasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoAsientoContableCajaChicasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoAsientoContableCajaChicasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Asiento Contable Caja Chica",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoAsientoContableCajaChicasSeleccionados() throws Exception {
		ArrayList<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasSeleccionados=new ArrayList<EstadoAsientoContableCajaChica>();		
		
		estadoasientocontablecajachicasSeleccionados=this.getEstadoAsientoContableCajaChicasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoasientocontablecajachica."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoAsientoContableCajaChica(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:estadoasientocontablecajachicasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoAsientoContableCajaChica(estadoasientocontablecajachicaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadoasientocontablecajachicaAux.setsDetalleGeneralEntityReporte(estadoasientocontablecajachicaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Asiento Contable Caja Chica",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoAsientoContableCajaChica(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachica,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadoasientocontablecajachica.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoasientocontablecajachica.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoasientocontablecajachica.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoasientocontablecajachica.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoAsientoContableCajaChicasSeleccionados() throws Exception {
		ArrayList<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasSeleccionados=new ArrayList<EstadoAsientoContableCajaChica>();		
		
		estadoasientocontablecajachicasSeleccionados=this.getEstadoAsientoContableCajaChicasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoasientocontablecajachica.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoAsientoContableCajaChicas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoAsientoContableCajaChica(row);				
				iRow++;
			}				
			
			for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:estadoasientocontablecajachicasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoAsientoContableCajaChica(estadoasientocontablecajachicaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Asiento Contable Caja Chica",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoAsientoContableCajaChicasSeleccionados() throws Exception {
		ArrayList<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasSeleccionados=new ArrayList<EstadoAsientoContableCajaChica>();		
		
		estadoasientocontablecajachicasSeleccionados=this.getEstadoAsientoContableCajaChicasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoasientocontablecajachica.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadoasientocontablecajachicas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadoasientocontablecajachica");
			//elementRoot.appendChild(element);
		
			for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:estadoasientocontablecajachicasSeleccionados) {
				element = document.createElement("estadoasientocontablecajachica");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoAsientoContableCajaChica(estadoasientocontablecajachicaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Asiento Contable Caja Chica",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoAsientoContableCajaChica(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachica,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadoasientocontablecajachica.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoasientocontablecajachica.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoasientocontablecajachica.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoAsientoContableCajaChica(EstadoAsientoContableCajaChica estadoasientocontablecajachica,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoAsientoContableCajaChicaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadoasientocontablecajachica.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoAsientoContableCajaChicaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadoasientocontablecajachica.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoAsientoContableCajaChicaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadoasientocontablecajachica.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoAsientoContableCajaChicaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadoasientocontablecajachica.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoAsientoContableCajaChicasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasSeleccionados=new ArrayList<EstadoAsientoContableCajaChica>();
		
		estadoasientocontablecajachicasSeleccionados=this.getEstadoAsientoContableCajaChicasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoAsientoContableCajaChica(estadoasientocontablecajachicasSeleccionados);
		
		this.generarReporteEstadoAsientoContableCajaChicas("Todos",estadoasientocontablecajachicasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoAsientoContableCajaChica(ArrayList<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoAsientoContableCajaChica estadoasientocontablecajachicaAux:estadoasientocontablecajachicasSeleccionados) {
				estadoasientocontablecajachicaAux.setsDetalleGeneralEntityReporte(estadoasientocontablecajachicaAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadoasientocontablecajachicaAux.setsDescripcionGeneralEntityReporte1(estadoasientocontablecajachicaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadoasientocontablecajachicaAux.setsDescripcionGeneralEntityReporte1(estadoasientocontablecajachicaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoAsientoContableCajaChica(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaModificarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica=true;
			this.isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaModificarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica=true;
			this.isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica=true;
			this.isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaModificarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica=true;
			this.isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica=true;
			this.isVisibilidadCeldaModificarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaModificarEstadoAsientoContableCajaChica=true;
			this.isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaCancelarEstadoAsientoContableCajaChica=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAsientoContableCajaChica=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoAsientoContableCajaChicaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica=true;
		} else {
			this.actualizarEstadoPanelsEstadoAsientoContableCajaChica(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoAsientoContableCajaChica=false;
			//this.isVisibilidadCeldaVerFormEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaDuplicarEstadoAsientoContableCajaChica=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContableCajaChica=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
			if(!estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica=false;												
			}
			
			this.jButtonCerrarEstadoAsientoContableCajaChica.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContableCajaChica=false;
		}
		
		if(!this.permiteMantenimiento(this.estadoasientocontablecajachica)) {
			this.isVisibilidadCeldaActualizarEstadoAsientoContableCajaChica=false;
			this.isVisibilidadCeldaEliminarEstadoAsientoContableCajaChica=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoAsientoContableCajaChica() {
	}
	
	public void actualizarEstadoPanelsEstadoAsientoContableCajaChica(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica!=null) {
				this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoAsientoContableCajaChica!=null) {
				this.jScrollPanelDatosEstadoAsientoContableCajaChica.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoAsientoContableCajaChica!=null) {
				this.jPanelPaginacionEstadoAsientoContableCajaChica.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoAsientoContableCajaChica!=null) {
				this.jPanelParametrosReportesEstadoAsientoContableCajaChica.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica!=null) {
				this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoAsientoContableCajaChica!=null) {
				this.jScrollPanelDatosEstadoAsientoContableCajaChica.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoAsientoContableCajaChica!=null) {
				this.jPanelPaginacionEstadoAsientoContableCajaChica.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoAsientoContableCajaChica!=null) {
				this.jPanelParametrosReportesEstadoAsientoContableCajaChica.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica!=null) {
				this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoAsientoContableCajaChica!=null) {
				this.jScrollPanelDatosEstadoAsientoContableCajaChica.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoAsientoContableCajaChica!=null) {
				this.jPanelPaginacionEstadoAsientoContableCajaChica.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoAsientoContableCajaChica!=null) {
				this.jPanelParametrosReportesEstadoAsientoContableCajaChica.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica!=null) {
				this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoAsientoContableCajaChica!=null) {
				this.jScrollPanelDatosEstadoAsientoContableCajaChica.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoAsientoContableCajaChica!=null) {
				this.jPanelPaginacionEstadoAsientoContableCajaChica.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoAsientoContableCajaChica!=null) {
				this.jPanelParametrosReportesEstadoAsientoContableCajaChica.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica!=null) {
				this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoAsientoContableCajaChica!=null) {
				this.jScrollPanelDatosEstadoAsientoContableCajaChica.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoAsientoContableCajaChica!=null) {
				this.jPanelPaginacionEstadoAsientoContableCajaChica.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoAsientoContableCajaChica!=null) {
				this.jPanelParametrosReportesEstadoAsientoContableCajaChica.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica!=null) {
				this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoAsientoContableCajaChica!=null) {
				this.jScrollPanelDatosEstadoAsientoContableCajaChica.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoAsientoContableCajaChica!=null) {
				this.jPanelPaginacionEstadoAsientoContableCajaChica.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoAsientoContableCajaChica!=null) {
				this.jPanelParametrosReportesEstadoAsientoContableCajaChica.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica!=null) {
				this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoAsientoContableCajaChica!=null) {
				this.jScrollPanelDatosEstadoAsientoContableCajaChica.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoAsientoContableCajaChica!=null) {
				this.jPanelPaginacionEstadoAsientoContableCajaChica.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoAsientoContableCajaChica!=null) {
				this.jPanelParametrosReportesEstadoAsientoContableCajaChica.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoAsientoContableCajaChicaSessionBean estadoasientocontablecajachicaSessionBean=new EstadoAsientoContableCajaChicaSessionBean();
		
		if(this.estadoasientocontablecajachicaSessionBean==null) {
			this.estadoasientocontablecajachicaSessionBean=new EstadoAsientoContableCajaChicaSessionBean();
		}
		
		this.estadoasientocontablecajachicaSessionBean.setsUltimaBusquedaEstadoAsientoContableCajaChica(this.getsAccionBusqueda());
		this.estadoasientocontablecajachicaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadoasientocontablecajachicaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoAsientoContableCajaChicaSessionBean estadoasientocontablecajachicaSessionBean=new EstadoAsientoContableCajaChicaSessionBean();
		
		if(this.estadoasientocontablecajachicaSessionBean==null) {
			this.estadoasientocontablecajachicaSessionBean=new EstadoAsientoContableCajaChicaSessionBean();
		}
		
		if(this.estadoasientocontablecajachicaSessionBean.getsUltimaBusquedaEstadoAsientoContableCajaChica()!=null&&!this.estadoasientocontablecajachicaSessionBean.getsUltimaBusquedaEstadoAsientoContableCajaChica().equals("")) {
			this.setsAccionBusqueda(estadoasientocontablecajachicaSessionBean.getsUltimaBusquedaEstadoAsientoContableCajaChica());
			this.setiNumeroPaginacion(estadoasientocontablecajachicaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadoasientocontablecajachicaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadoasientocontablecajachicaSessionBean.setsUltimaBusquedaEstadoAsientoContableCajaChica("");
		this.estadoasientocontablecajachicaSessionBean.setiNumeroPaginacion(EstadoAsientoContableCajaChicaConstantesFunciones.INUMEROPAGINACION);
		this.estadoasientocontablecajachicaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoAsientoContableCajaChica(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoAsientoContableCajaChica() {
		this.updateBorderResaltarBusquedasFormularioEstadoAsientoContableCajaChica();
		this.updateVisibilidadBusquedasFormularioEstadoAsientoContableCajaChica();
		this.updateHabilitarBusquedasFormularioEstadoAsientoContableCajaChica();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoAsientoContableCajaChica() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoAsientoContableCajaChica() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoAsientoContableCajaChica() {
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
	
	public void updateControlesFormularioEstadoAsientoContableCajaChica() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoAsientoContableCajaChica();
		this.updateVisibilidadResaltarControlesFormularioEstadoAsientoContableCajaChica();
		this.updateHabilitarResaltarControlesFormularioEstadoAsientoContableCajaChica();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoAsientoContableCajaChica() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadoasientocontablecajachicaConstantesFunciones.resaltaridEstadoAsientoContableCajaChica!=null && this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldidEstadoAsientoContableCajaChica.setBorder(this.estadoasientocontablecajachicaConstantesFunciones.resaltaridEstadoAsientoContableCajaChica);}
		if(this.estadoasientocontablecajachicaConstantesFunciones.resaltarcodigoEstadoAsientoContableCajaChica!=null && this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldcodigoEstadoAsientoContableCajaChica.setBorder(this.estadoasientocontablecajachicaConstantesFunciones.resaltarcodigoEstadoAsientoContableCajaChica);}
		if(this.estadoasientocontablecajachicaConstantesFunciones.resaltarnombreEstadoAsientoContableCajaChica!=null && this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextAreanombreEstadoAsientoContableCajaChica.setBorder(this.estadoasientocontablecajachicaConstantesFunciones.resaltarnombreEstadoAsientoContableCajaChica);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoAsientoContableCajaChica() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {
	
		//this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldidEstadoAsientoContableCajaChica.setVisible(this.estadoasientocontablecajachicaConstantesFunciones.mostraridEstadoAsientoContableCajaChica);
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jPanelidEstadoAsientoContableCajaChica.setVisible(this.estadoasientocontablecajachicaConstantesFunciones.mostraridEstadoAsientoContableCajaChica);
		//this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldcodigoEstadoAsientoContableCajaChica.setVisible(this.estadoasientocontablecajachicaConstantesFunciones.mostrarcodigoEstadoAsientoContableCajaChica);
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jPanelcodigoEstadoAsientoContableCajaChica.setVisible(this.estadoasientocontablecajachicaConstantesFunciones.mostrarcodigoEstadoAsientoContableCajaChica);
		//this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextAreanombreEstadoAsientoContableCajaChica.setVisible(this.estadoasientocontablecajachicaConstantesFunciones.mostrarnombreEstadoAsientoContableCajaChica);
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jPanelnombreEstadoAsientoContableCajaChica.setVisible(this.estadoasientocontablecajachicaConstantesFunciones.mostrarnombreEstadoAsientoContableCajaChica);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoAsientoContableCajaChica() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica!=null) {
	
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldidEstadoAsientoContableCajaChica.setEnabled(this.estadoasientocontablecajachicaConstantesFunciones.activaridEstadoAsientoContableCajaChica);
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextFieldcodigoEstadoAsientoContableCajaChica.setEnabled(this.estadoasientocontablecajachicaConstantesFunciones.activarcodigoEstadoAsientoContableCajaChica);
		this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica.jTextAreanombreEstadoAsientoContableCajaChica.setEnabled(this.estadoasientocontablecajachicaConstantesFunciones.activarnombreEstadoAsientoContableCajaChica);
		}
	}
	
		
}