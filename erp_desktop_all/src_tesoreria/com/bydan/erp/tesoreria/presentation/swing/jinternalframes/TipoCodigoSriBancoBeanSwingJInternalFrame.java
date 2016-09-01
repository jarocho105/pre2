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

import com.bydan.erp.tesoreria.util.TipoCodigoSriBancoConstantesFunciones;
import com.bydan.erp.tesoreria.util.TipoCodigoSriBancoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.TipoCodigoSriBancoParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.TipoCodigoSriBancoBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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




@SuppressWarnings("unused")
public class TipoCodigoSriBancoBeanSwingJInternalFrame extends TipoCodigoSriBancoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCodigoSriBancoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCodigoSriBanco> tipocodigosribancoValidator = new ClassValidator<TipoCodigoSriBanco>(TipoCodigoSriBanco.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCodigoSriBanco tipocodigosribanco;	
	public TipoCodigoSriBanco tipocodigosribancoAux;
	public TipoCodigoSriBanco tipocodigosribancoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCodigoSriBanco tipocodigosribancoTotales;
	public Long idTipoCodigoSriBancoActual;
	public Long iIdNuevoTipoCodigoSriBanco=0L;
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
	
	public Boolean isPermisoTodoTipoCodigoSriBanco;
	public Boolean isPermisoNuevoTipoCodigoSriBanco;
	public Boolean isPermisoActualizarTipoCodigoSriBanco;
	public Boolean isPermisoActualizarOriginalTipoCodigoSriBanco;
	public Boolean isPermisoEliminarTipoCodigoSriBanco;
	public Boolean isPermisoGuardarCambiosTipoCodigoSriBanco;
	public Boolean isPermisoConsultaTipoCodigoSriBanco;
	public Boolean isPermisoBusquedaTipoCodigoSriBanco;
	public Boolean isPermisoReporteTipoCodigoSriBanco;
	public Boolean isPermisoPaginacionMedioTipoCodigoSriBanco;
	public Boolean isPermisoPaginacionAltoTipoCodigoSriBanco;
	public Boolean isPermisoPaginacionTodoTipoCodigoSriBanco;
	public Boolean isPermisoCopiarTipoCodigoSriBanco;
	public Boolean isPermisoVerFormTipoCodigoSriBanco;
	public Boolean isPermisoDuplicarTipoCodigoSriBanco;
	public Boolean isPermisoOrdenTipoCodigoSriBanco;
	
	
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
	
	public TipoCodigoSriBancoParameterReturnGeneral tipocodigosribancoReturnGeneral;
	public TipoCodigoSriBancoParameterReturnGeneral tipocodigosribancoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCodigoSriBanco=false;
	public Boolean esParaAccionDesdeFormularioTipoCodigoSriBanco=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoCodigoSriBancoSessionBeanAdditional tipocodigosribancoSessionBeanAdditional=null;
	
	public TipoCodigoSriBancoSessionBeanAdditional getTipoCodigoSriBancoSessionBeanAdditional() {
		return this.tipocodigosribancoSessionBeanAdditional;
	}
	
	public void setTipoCodigoSriBancoSessionBeanAdditional(TipoCodigoSriBancoSessionBeanAdditional tipocodigosribancoSessionBeanAdditional) {
		try {
			this.tipocodigosribancoSessionBeanAdditional=tipocodigosribancoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoCodigoSriBancoBeanSwingJInternalFrameAdditional tipocodigosribancoBeanSwingJInternalFrameAdditional=null;
	//public class TipoCodigoSriBancoBeanSwingJInternalFrame
	
	public TipoCodigoSriBancoBeanSwingJInternalFrameAdditional getTipoCodigoSriBancoBeanSwingJInternalFrameAdditional() {
		return this.tipocodigosribancoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoCodigoSriBancoBeanSwingJInternalFrameAdditional(TipoCodigoSriBancoBeanSwingJInternalFrameAdditional tipocodigosribancoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipocodigosribancoBeanSwingJInternalFrameAdditional=tipocodigosribancoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCodigoSriBancoLogic tipocodigosribancoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCodigoSriBanco tipocodigosribancoBean;
	public TipoCodigoSriBancoConstantesFunciones tipocodigosribancoConstantesFunciones;
	//public TipoCodigoSriBancoParameterReturnGeneral tipocodigosribancoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoCodigoSriBanco> tipocodigosribancos;	
	//public List<TipoCodigoSriBanco> tipocodigosribancosEliminados;
	//public List<TipoCodigoSriBanco> tipocodigosribancosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCodigoSriBanco=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCodigoSriBanco=true;
	public Boolean isVisibilidadCeldaCopiarTipoCodigoSriBanco=true;
	public Boolean isVisibilidadCeldaVerFormTipoCodigoSriBanco=true;
	public Boolean isVisibilidadCeldaOrdenTipoCodigoSriBanco=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco=false;
	public Boolean isVisibilidadCeldaModificarTipoCodigoSriBanco=false;
	public Boolean isVisibilidadCeldaActualizarTipoCodigoSriBanco=false;
	public Boolean isVisibilidadCeldaEliminarTipoCodigoSriBanco=false;
	public Boolean isVisibilidadCeldaCancelarTipoCodigoSriBanco=false;
	public Boolean isVisibilidadCeldaGuardarTipoCodigoSriBanco=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco=false;	
	
	
	
	public Long getiIdNuevoTipoCodigoSriBanco() {
		return this.iIdNuevoTipoCodigoSriBanco;
	}

	public void setiIdNuevoTipoCodigoSriBanco(Long iIdNuevoTipoCodigoSriBanco) {
		this.iIdNuevoTipoCodigoSriBanco = iIdNuevoTipoCodigoSriBanco;
	}
	
	public Long getidTipoCodigoSriBancoActual() {
		return this.idTipoCodigoSriBancoActual;
	}

	public void setidTipoCodigoSriBancoActual(Long idTipoCodigoSriBancoActual) {
		this.idTipoCodigoSriBancoActual = idTipoCodigoSriBancoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCodigoSriBanco gettipocodigosribanco() {
		return this.tipocodigosribanco;
	}

	public void settipocodigosribanco(TipoCodigoSriBanco tipocodigosribanco) {
		this.tipocodigosribanco = tipocodigosribanco;
	}
	
	public TipoCodigoSriBanco gettipocodigosribancoAux() {
		return this.tipocodigosribancoAux;
	}

	public void settipocodigosribancoAux(TipoCodigoSriBanco tipocodigosribancoAux) {
		this.tipocodigosribancoAux = tipocodigosribancoAux;
	}				
	
	public TipoCodigoSriBanco gettipocodigosribancoAnterior() {
		return this.tipocodigosribancoAnterior;
	}

	public void settipocodigosribancoAnterior(TipoCodigoSriBanco tipocodigosribancoAnterior) {
		this.tipocodigosribancoAnterior = tipocodigosribancoAnterior;
	}	
	
	public TipoCodigoSriBanco gettipocodigosribancoTotales() {
		return this.tipocodigosribancoTotales;
	}

	public void settipocodigosribancoTotales(TipoCodigoSriBanco tipocodigosribancoTotales) {
		this.tipocodigosribancoTotales = tipocodigosribancoTotales;
	}	
	
	public TipoCodigoSriBanco gettipocodigosribancoBean() {
		return this.tipocodigosribancoBean;
	}

	public void settipocodigosribancoBean(TipoCodigoSriBanco tipocodigosribancoBean) {
		this.tipocodigosribancoBean = tipocodigosribancoBean;
	}	
	
	public TipoCodigoSriBancoParameterReturnGeneral gettipocodigosribancoReturnGeneral() {
		return this.tipocodigosribancoReturnGeneral;
	}

	public void settipocodigosribancoReturnGeneral(TipoCodigoSriBancoParameterReturnGeneral tipocodigosribancoReturnGeneral) {
		this.tipocodigosribancoReturnGeneral = tipocodigosribancoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoCodigoSriBancoLogic getTipoCodigoSriBancoLogic()	{		
		return tipocodigosribancoLogic;
	}

	public void setTipoCodigoSriBancoLogic(TipoCodigoSriBancoLogic tipocodigosribancoLogic) {
		this.tipocodigosribancoLogic = tipocodigosribancoLogic;
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
	
	public Boolean getIsEsNuevoTipoCodigoSriBanco() {
		return isEsNuevoTipoCodigoSriBanco;
	}

	public void setIsEsNuevoTipoCodigoSriBanco(Boolean isEsNuevoTipoCodigoSriBanco) {
		this.isEsNuevoTipoCodigoSriBanco = isEsNuevoTipoCodigoSriBanco;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCodigoSriBanco() {
		return esParaAccionDesdeFormularioTipoCodigoSriBanco;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCodigoSriBanco(Boolean esParaAccionDesdeFormularioTipoCodigoSriBanco) {
		this.esParaAccionDesdeFormularioTipoCodigoSriBanco = esParaAccionDesdeFormularioTipoCodigoSriBanco;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoCodigoSriBanco() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCodigoSriBancoConstantesFunciones.refrescarForeignKeysDescripcionesTipoCodigoSriBanco(this.tipocodigosribancoLogic.getTipoCodigoSriBancos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCodigoSriBancoConstantesFunciones.refrescarForeignKeysDescripcionesTipoCodigoSriBanco(this.tipocodigosribancos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocodigosribancoLogic.setTipoCodigoSriBancos(this.tipocodigosribancos);
			tipocodigosribancoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCodigoSriBancoParameterReturnGeneral getTipoCodigoSriBancoParameterGeneral() {
		return this.tipocodigosribancoParameterGeneral;
	}
	
	public void setTipoCodigoSriBancoParameterGeneral(TipoCodigoSriBancoParameterReturnGeneral tipocodigosribancoParameterGeneral) {
		this.tipocodigosribancoParameterGeneral = tipocodigosribancoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCodigoSriBanco() {
		return isPermisoTodoTipoCodigoSriBanco;
	}

	public void setIsPermisoTodoTipoCodigoSriBanco(Boolean isPermisoTodoTipoCodigoSriBanco) {
		this.isPermisoTodoTipoCodigoSriBanco = isPermisoTodoTipoCodigoSriBanco;
	}

	public Boolean getIsPermisoNuevoTipoCodigoSriBanco() {
		return isPermisoNuevoTipoCodigoSriBanco;
	}

	public void setIsPermisoNuevoTipoCodigoSriBanco(Boolean isPermisoNuevoTipoCodigoSriBanco) {
		this.isPermisoNuevoTipoCodigoSriBanco = isPermisoNuevoTipoCodigoSriBanco;
	}

	public Boolean getIsPermisoActualizarTipoCodigoSriBanco() {
		return isPermisoActualizarTipoCodigoSriBanco;
	}

	public void setIsPermisoActualizarTipoCodigoSriBanco(Boolean isPermisoActualizarTipoCodigoSriBanco) {
		this.isPermisoActualizarTipoCodigoSriBanco = isPermisoActualizarTipoCodigoSriBanco;
	}

	public Boolean getIsPermisoEliminarTipoCodigoSriBanco() {
		return isPermisoEliminarTipoCodigoSriBanco;
	}

	public void setIsPermisoEliminarTipoCodigoSriBanco(Boolean isPermisoEliminarTipoCodigoSriBanco) {
		this.isPermisoEliminarTipoCodigoSriBanco = isPermisoEliminarTipoCodigoSriBanco;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCodigoSriBanco() {
		return isPermisoGuardarCambiosTipoCodigoSriBanco;
	}

	public void setIsPermisoGuardarCambiosTipoCodigoSriBanco(Boolean isPermisoGuardarCambiosTipoCodigoSriBanco) {
		this.isPermisoGuardarCambiosTipoCodigoSriBanco = isPermisoGuardarCambiosTipoCodigoSriBanco;
	}
	
	public Boolean getIsPermisoConsultaTipoCodigoSriBanco() {
		return isPermisoConsultaTipoCodigoSriBanco;
	}

	public void setIsPermisoConsultaTipoCodigoSriBanco(Boolean isPermisoConsultaTipoCodigoSriBanco) {
		this.isPermisoConsultaTipoCodigoSriBanco = isPermisoConsultaTipoCodigoSriBanco;
	}

	public Boolean getIsPermisoBusquedaTipoCodigoSriBanco() {
		return isPermisoBusquedaTipoCodigoSriBanco;
	}

	public void setIsPermisoBusquedaTipoCodigoSriBanco(Boolean isPermisoBusquedaTipoCodigoSriBanco) {
		this.isPermisoBusquedaTipoCodigoSriBanco = isPermisoBusquedaTipoCodigoSriBanco;
	}

	public Boolean getIsPermisoReporteTipoCodigoSriBanco() {
		return isPermisoReporteTipoCodigoSriBanco;
	}

	public void setIsPermisoReporteTipoCodigoSriBanco(Boolean isPermisoReporteTipoCodigoSriBanco) {
		this.isPermisoReporteTipoCodigoSriBanco = isPermisoReporteTipoCodigoSriBanco;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCodigoSriBanco() {
		return isPermisoPaginacionMedioTipoCodigoSriBanco;
	}

	public void setIsPermisoPaginacionMedioTipoCodigoSriBanco(Boolean isPermisoPaginacionMedioTipoCodigoSriBanco) {
		this.isPermisoPaginacionMedioTipoCodigoSriBanco = isPermisoPaginacionMedioTipoCodigoSriBanco;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCodigoSriBanco() {
		return isPermisoPaginacionTodoTipoCodigoSriBanco;
	}

	public void setIsPermisoPaginacionTodoTipoCodigoSriBanco(Boolean isPermisoPaginacionTodoTipoCodigoSriBanco) {
		this.isPermisoPaginacionTodoTipoCodigoSriBanco = isPermisoPaginacionTodoTipoCodigoSriBanco;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCodigoSriBanco() {
		return isPermisoPaginacionAltoTipoCodigoSriBanco;
	}

	public void setIsPermisoPaginacionAltoTipoCodigoSriBanco(Boolean isPermisoPaginacionAltoTipoCodigoSriBanco) {
		this.isPermisoPaginacionAltoTipoCodigoSriBanco = isPermisoPaginacionAltoTipoCodigoSriBanco;
	}
	
	public Boolean getIsPermisoCopiarTipoCodigoSriBanco() {
		return isPermisoCopiarTipoCodigoSriBanco;
	}

	public void setIsPermisoCopiarTipoCodigoSriBanco(Boolean isPermisoCopiarTipoCodigoSriBanco) {
		this.isPermisoCopiarTipoCodigoSriBanco = isPermisoCopiarTipoCodigoSriBanco;
	}
	
	public Boolean getIsPermisoVerFormTipoCodigoSriBanco() {
		return isPermisoVerFormTipoCodigoSriBanco;
	}

	public void setIsPermisoVerFormTipoCodigoSriBanco(Boolean isPermisoVerFormTipoCodigoSriBanco) {
		this.isPermisoVerFormTipoCodigoSriBanco = isPermisoVerFormTipoCodigoSriBanco;
	}
	
	public Boolean getIsPermisoDuplicarTipoCodigoSriBanco() {
		return isPermisoDuplicarTipoCodigoSriBanco;
	}

	public void setIsPermisoDuplicarTipoCodigoSriBanco(Boolean isPermisoDuplicarTipoCodigoSriBanco) {
		this.isPermisoDuplicarTipoCodigoSriBanco = isPermisoDuplicarTipoCodigoSriBanco;
	}
	
	public Boolean getIsPermisoOrdenTipoCodigoSriBanco() {
		return isPermisoOrdenTipoCodigoSriBanco;
	}

	public void setIsPermisoOrdenTipoCodigoSriBanco(Boolean isPermisoOrdenTipoCodigoSriBanco) {
		this.isPermisoOrdenTipoCodigoSriBanco = isPermisoOrdenTipoCodigoSriBanco;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCodigoSriBanco() {
		return isVisibilidadCeldaNuevoTipoCodigoSriBanco;
	}

	public void setIsVisibilidadCeldaNuevoTipoCodigoSriBanco(Boolean isVisibilidadCeldaNuevoTipoCodigoSriBanco) {
		this.isVisibilidadCeldaNuevoTipoCodigoSriBanco = isVisibilidadCeldaNuevoTipoCodigoSriBanco;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCodigoSriBanco() {
		return isVisibilidadCeldaDuplicarTipoCodigoSriBanco;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCodigoSriBanco(Boolean isVisibilidadCeldaDuplicarTipoCodigoSriBanco) {
		this.isVisibilidadCeldaDuplicarTipoCodigoSriBanco = isVisibilidadCeldaDuplicarTipoCodigoSriBanco;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCodigoSriBanco() {
		return isVisibilidadCeldaCopiarTipoCodigoSriBanco;
	}

	public void setIsVisibilidadCeldaCopiarTipoCodigoSriBanco(Boolean isVisibilidadCeldaCopiarTipoCodigoSriBanco) {
		this.isVisibilidadCeldaCopiarTipoCodigoSriBanco = isVisibilidadCeldaCopiarTipoCodigoSriBanco;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCodigoSriBanco() {
		return isVisibilidadCeldaVerFormTipoCodigoSriBanco;
	}

	public void setIsVisibilidadCeldaVerFormTipoCodigoSriBanco(Boolean isVisibilidadCeldaVerFormTipoCodigoSriBanco) {
		this.isVisibilidadCeldaVerFormTipoCodigoSriBanco = isVisibilidadCeldaVerFormTipoCodigoSriBanco;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCodigoSriBanco() {
		return isVisibilidadCeldaOrdenTipoCodigoSriBanco;
	}

	public void setIsVisibilidadCeldaOrdenTipoCodigoSriBanco(Boolean isVisibilidadCeldaOrdenTipoCodigoSriBanco) {
		this.isVisibilidadCeldaOrdenTipoCodigoSriBanco = isVisibilidadCeldaOrdenTipoCodigoSriBanco;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco() {
		return isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco(Boolean isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco = isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCodigoSriBanco() {
		return isVisibilidadCeldaModificarTipoCodigoSriBanco;
	}

	public void setIsVisibilidadCeldaModificarTipoCodigoSriBanco(Boolean isVisibilidadCeldaModificarTipoCodigoSriBanco) {
		this.isVisibilidadCeldaModificarTipoCodigoSriBanco = isVisibilidadCeldaModificarTipoCodigoSriBanco;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCodigoSriBanco() {
		return isVisibilidadCeldaActualizarTipoCodigoSriBanco;
	}

	public void setIsVisibilidadCeldaActualizarTipoCodigoSriBanco(Boolean isVisibilidadCeldaActualizarTipoCodigoSriBanco) {
		this.isVisibilidadCeldaActualizarTipoCodigoSriBanco = isVisibilidadCeldaActualizarTipoCodigoSriBanco;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCodigoSriBanco() {
		return isVisibilidadCeldaEliminarTipoCodigoSriBanco;
	}

	public void setIsVisibilidadCeldaEliminarTipoCodigoSriBanco(Boolean isVisibilidadCeldaEliminarTipoCodigoSriBanco) {
		this.isVisibilidadCeldaEliminarTipoCodigoSriBanco = isVisibilidadCeldaEliminarTipoCodigoSriBanco;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCodigoSriBanco() {
		return isVisibilidadCeldaCancelarTipoCodigoSriBanco;
	}

	public void setIsVisibilidadCeldaCancelarTipoCodigoSriBanco(Boolean isVisibilidadCeldaCancelarTipoCodigoSriBanco) {
		this.isVisibilidadCeldaCancelarTipoCodigoSriBanco = isVisibilidadCeldaCancelarTipoCodigoSriBanco;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCodigoSriBanco() {
		return isVisibilidadCeldaGuardarTipoCodigoSriBanco;
	}

	public void setIsVisibilidadCeldaGuardarTipoCodigoSriBanco(Boolean isVisibilidadCeldaGuardarTipoCodigoSriBanco) {
		this.isVisibilidadCeldaGuardarTipoCodigoSriBanco = isVisibilidadCeldaGuardarTipoCodigoSriBanco;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco() {
		return isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco(Boolean isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco) {
		this.isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco = isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco;
	}
		
	public TipoCodigoSriBancoSessionBean gettipocodigosribancoSessionBean() {
		return this.tipocodigosribancoSessionBean;
	}
	
	public void settipocodigosribancoSessionBean(TipoCodigoSriBancoSessionBean tipocodigosribancoSessionBean) {
		this.tipocodigosribancoSessionBean=tipocodigosribancoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribanco)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoCodigoSriBanco tipocodigosribanco,TipoCodigoSriBanco tipocodigosribancoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCodigoSriBanco(tipocodigosribanco);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocodigosribancoAux.setId(tipocodigosribanco.getId());
		tipocodigosribancoAux.setVersionRow(tipocodigosribanco.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCodigoSriBanco();
		
			int intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCodigoSriBanco(this.tipocodigosribanco,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoSriBanco(this.tipocodigosribanco);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocodigosribancoValidator.getInvalidValues(this.tipocodigosribanco);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocodigosribancoLogic.setDatosCliente(datosCliente);
			tipocodigosribancoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocodigosribancoAux=new  TipoCodigoSriBanco();
				
				tipocodigosribancoAux.setIsNew(true);
				tipocodigosribancoAux.setIsChanged(true);
				
				tipocodigosribancoAux.setTipoCodigoSriBancoOriginal(this.tipocodigosribanco);
				
				tipocodigosribancoAux.setId(this.tipocodigosribanco.getId());	
				tipocodigosribancoAux.setVersionRow(this.tipocodigosribanco.getVersionRow());	
				tipocodigosribancoAux.setcodigo(this.tipocodigosribanco.getcodigo());	
				tipocodigosribancoAux.setnombre(this.tipocodigosribanco.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocodigosribancoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocodigosribancoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocodigosribancoAux,tipocodigosribancoLogic.getTipoCodigoSriBancos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocodigosribancoAux,tipocodigosribancos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocodigosribancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocodigosribancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocodigosribancoLogic.saveTipoCodigoSriBancos();//WithConnection
						//tipocodigosribancoLogic.getSetVersionRowTipoCodigoSriBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocodigosribanco,tipocodigosribancoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocodigosribancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocodigosribancoLogic.saveTipoCodigoSriBancoRelaciones(tipocodigosribancoAux);//WithConnection
								//tipocodigosribancoLogic.getSetVersionRowTipoCodigoSriBancos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocodigosribanco,tipocodigosribancoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocodigosribancoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocodigosribancoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocodigosribancoAux,tipocodigosribancoLogic.getTipoCodigoSriBancos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocodigosribancoAux,tipocodigosribancos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocodigosribanco,tipocodigosribancoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocodigosribancoAux=new  TipoCodigoSriBanco();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocodigosribancoSessionBean.getEsGuardarRelacionado() && this.tipocodigosribanco.getId()>=0)) {
						
					tipocodigosribancoAux.setIsNew(false);
				}
				
				tipocodigosribancoAux.setIsDeleted(false);
			
				tipocodigosribancoAux.setId(this.tipocodigosribanco.getId());	
				tipocodigosribancoAux.setVersionRow(this.tipocodigosribanco.getVersionRow());	
				tipocodigosribancoAux.setcodigo(this.tipocodigosribanco.getcodigo());	
				tipocodigosribancoAux.setnombre(this.tipocodigosribanco.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocodigosribancoAux,tipocodigosribancoLogic.getTipoCodigoSriBancos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocodigosribancoAux,tipocodigosribancos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocodigosribancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocodigosribancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocodigosribancoLogic.saveTipoCodigoSriBancos();//WithConnection
						//tipocodigosribancoLogic.getSetVersionRowTipoCodigoSriBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocodigosribanco,tipocodigosribancoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocodigosribancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocodigosribancoLogic.saveTipoCodigoSriBancoRelaciones(tipocodigosribancoAux);//WithConnection
								//tipocodigosribancoLogic.getSetVersionRowTipoCodigoSriBancos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocodigosribanco,tipocodigosribancoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocodigosribancoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocodigosribancoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocodigosribancoAux,tipocodigosribancoLogic.getTipoCodigoSriBancos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocodigosribancoAux,tipocodigosribancos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocodigosribanco,tipocodigosribancoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocodigosribancoAux=new  TipoCodigoSriBanco();
				
				tipocodigosribancoAux.setIsNew(false);
				tipocodigosribancoAux.setIsChanged(false);
				
				tipocodigosribancoAux.setIsDeleted(true);
				
				tipocodigosribancoAux.setId(this.tipocodigosribanco.getId());	
				tipocodigosribancoAux.setVersionRow(this.tipocodigosribanco.getVersionRow());	
				tipocodigosribancoAux.setcodigo(this.tipocodigosribanco.getcodigo());	
				tipocodigosribancoAux.setnombre(this.tipocodigosribanco.getnombre());	
				
				if(this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocodigosribancoAux.getId()>=0) {	
						this.tipocodigosribancosEliminados.add(tipocodigosribancoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocodigosribancoAux,tipocodigosribancoLogic.getTipoCodigoSriBancos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocodigosribancoAux,tipocodigosribancos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocodigosribancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocodigosribancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocodigosribancoLogic.saveTipoCodigoSriBancos();//WithConnection
						//tipocodigosribancoLogic.getSetVersionRowTipoCodigoSriBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocodigosribancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocodigosribancoLogic.saveTipoCodigoSriBancoRelaciones(tipocodigosribancoAux);//WithConnection
								//tipocodigosribancoLogic.getSetVersionRowTipoCodigoSriBancos();//WithConnection
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
							if(this.tipocodigosribancoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocodigosribancoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocodigosribancoAux,tipocodigosribancoLogic.getTipoCodigoSriBancos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocodigosribancoAux,tipocodigosribancos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribancoLogic.getTipoCodigoSriBancos().addAll(this.tipocodigosribancosEliminados);
					
					tipocodigosribancoLogic.saveTipoCodigoSriBancos();//WithConnection
					//tipocodigosribancoLogic.getSetVersionRowTipoCodigoSriBancos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipocodigosribancosEliminados= new ArrayList<TipoCodigoSriBanco>();		
			}
			
			if(this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"A GUARDADO CORRECTAMENTE","MANTENIMIENTO DE A",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocodigosribanco=tipocodigosribancoAux;
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
      		//this.finishProcessTipoCodigoSriBanco();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCodigoSriBanco tipocodigosribancoLocal) throws Exception {
		
		if(this.tipocodigosribancoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCodigoSriBanco tipocodigosribancoLocal) throws Exception {	
		if(this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoCodigoSriBancoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocodigosribancoValidator.getInvalidValues(this.tipocodigosribanco);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCodigoSriBanco tipocodigosribanco,List<TipoCodigoSriBanco> tipocodigosribancos) throws Exception {
		try	{		
			TipoCodigoSriBancoConstantesFunciones.actualizarLista(tipocodigosribanco,tipocodigosribancos,this.tipocodigosribancoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCodigoSriBanco tipocodigosribanco,List<TipoCodigoSriBanco> tipocodigosribancos) throws Exception {
		try	{			
			TipoCodigoSriBancoConstantesFunciones.actualizarSelectedLista(tipocodigosribanco,tipocodigosribancos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCodigoSriBanco> tipocodigosribancosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocodigosribancosLocal=this.tipocodigosribancoLogic.getTipoCodigoSriBancos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocodigosribancosLocal=this.tipocodigosribancos;
			}
			//ARCHITECTURE
		
			for(TipoCodigoSriBanco tipocodigosribancoLocal:tipocodigosribancosLocal) {
				if(this.permiteMantenimiento(tipocodigosribancoLocal) && tipocodigosribancoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCodigoSriBancoConstantesFunciones.getTipoCodigoSriBancoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCodigoSriBancoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCodigoSriBanco.jLabelcodigoTipoCodigoSriBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCodigoSriBancoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCodigoSriBanco.jLabelnombreTipoCodigoSriBanco,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCodigoSriBanco.jLabelcodigoTipoCodigoSriBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCodigoSriBanco.jLabelnombreTipoCodigoSriBanco,"");
		
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
		this.iIdNuevoTipoCodigoSriBanco--;	
		
		
		this.tipocodigosribancoAux=new TipoCodigoSriBanco();
		
		this.tipocodigosribancoAux.setId(this.iIdNuevoTipoCodigoSriBanco);
		this.tipocodigosribancoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocodigosribancoLogic.getTipoCodigoSriBancos().add(this.tipocodigosribancoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocodigosribancos.add(this.tipocodigosribancoAux);
		}
		//ARCHITECTURE
		
		this.tipocodigosribanco=this.tipocodigosribancoAux;
		
		if(TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCodigoSriBanco(this.tipocodigosribanco);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCodigoSriBanco(this.tipocodigosribanco);
		}
				
		//this.setDefaultControlesTipoCodigoSriBanco();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCodigoSriBanco();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCodigoSriBanco();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCodigoSriBanco();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCodigoSriBanco(this.tipocodigosribancoBean,this.tipocodigosribanco,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoSriBanco(this.tipocodigosribanco);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocodigosribancoSessionBean.getConGuardarRelaciones()) {
			classes=TipoCodigoSriBancoConstantesFunciones.getClassesRelationshipsOfTipoCodigoSriBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocodigosribancoReturnGeneral=tipocodigosribancoLogic.procesarEventosTipoCodigoSriBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocodigosribancoLogic.getTipoCodigoSriBancos(),this.tipocodigosribanco,this.tipocodigosribancoParameterGeneral,this.isEsNuevoTipoCodigoSriBanco,classes);//this.tipocodigosribancoLogic.getTipoCodigoSriBanco()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCodigoSriBanco(this.tipocodigosribancoReturnGeneral,this.tipocodigosribancoBean,false);
		
		if(this.tipocodigosribancoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCodigoSriBanco(this.tipocodigosribancoReturnGeneral.getTipoCodigoSriBanco());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCodigoSriBanco(this.tipocodigosribancoReturnGeneral.getTipoCodigoSriBanco());
		}
		
		if(this.tipocodigosribancoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCodigoSriBanco(this.tipocodigosribancoReturnGeneral.getTipoCodigoSriBanco(),classes);//this.tipocodigosribancoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCodigoSriBanco(this.tipocodigosribanco,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCodigoSriBanco();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCodigoSriBanco();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.RecargarFormTipoCodigoSriBanco(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCodigoSriBanco(false);
						
			if(tipocodigosribancoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCodigoSriBanco();
			}
			
			this.actualizarVisualTableDatosTipoCodigoSriBanco();
			
			this.jTableDatosTipoCodigoSriBanco.setRowSelectionInterval(this.getIndiceNuevoTipoCodigoSriBanco(), this.getIndiceNuevoTipoCodigoSriBanco());
			
			this.seleccionarFilaTablaTipoCodigoSriBancoActual();
						
			this.actualizarEstadoCeldasBotonesTipoCodigoSriBanco("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCodigoSriBanco(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldcodigoTipoCodigoSriBanco.setEnabled(isHabilitar && this.tipocodigosribancoConstantesFunciones.activarcodigoTipoCodigoSriBanco);
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextAreanombreTipoCodigoSriBanco.setEnabled(isHabilitar && this.tipocodigosribancoConstantesFunciones.activarnombreTipoCodigoSriBanco);	
		
	};
	
	public void setDefaultControlesTipoCodigoSriBanco() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCodigoSriBanco(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocodigosribancoSessionBean.setConGuardarRelaciones(true);			
			this.tipocodigosribancoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTabbedPaneRelacionesTipoCodigoSriBanco.setVisible(true);
			
					
		} else {
			//this.tipocodigosribancoSessionBean.setConGuardarRelaciones(false);			
			this.tipocodigosribancoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTabbedPaneRelacionesTipoCodigoSriBanco.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoCodigoSriBanco() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCodigoSriBanco tipocodigosribancoAux:this.tipocodigosribancoLogic.getTipoCodigoSriBancos()) {
				if(tipocodigosribancoAux.getId().equals(this.iIdNuevoTipoCodigoSriBanco)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCodigoSriBanco tipocodigosribancoAux:this.tipocodigosribancos) {
				if(tipocodigosribancoAux.getId().equals(this.iIdNuevoTipoCodigoSriBanco)) {
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
	
	public int getIndiceActualTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribanco,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCodigoSriBanco tipocodigosribancoAux:this.tipocodigosribancoLogic.getTipoCodigoSriBancos()) {
				if(tipocodigosribancoAux.getId().equals(tipocodigosribanco.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCodigoSriBanco tipocodigosribancoAux:this.tipocodigosribancos) {
				if(tipocodigosribancoAux.getId().equals(tipocodigosribanco.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribancoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCodigoSriBanco tipocodigosribancoAux:this.tipocodigosribancoLogic.getTipoCodigoSriBancos()) {
				if(tipocodigosribancoAux.getTipoCodigoSriBancoOriginal().getId().equals(tipocodigosribancoOriginal.getId())) {
					existe=true;
					tipocodigosribancoOriginal.setId(tipocodigosribancoAux.getId());
					tipocodigosribancoOriginal.setVersionRow(tipocodigosribancoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCodigoSriBanco tipocodigosribancoAux:this.tipocodigosribancos) {
				if(tipocodigosribancoAux.getTipoCodigoSriBancoOriginal().getId().equals(tipocodigosribancoOriginal.getId())) {
					existe=true;
					tipocodigosribancoOriginal.setId(tipocodigosribancoAux.getId());
					tipocodigosribancoOriginal.setVersionRow(tipocodigosribancoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCodigoSriBanco(Boolean esParaCancelar) throws Exception {
		tipocodigosribancosAux=new ArrayList<TipoCodigoSriBanco>();
		tipocodigosribancoAux=new TipoCodigoSriBanco();
		
		if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCodigoSriBanco tipocodigosribancoAux:this.tipocodigosribancoLogic.getTipoCodigoSriBancos()) {
					if(tipocodigosribancoAux.getId()<0) {
						tipocodigosribancosAux.add(tipocodigosribancoAux);
					}		
				}
				this.iIdNuevoTipoCodigoSriBanco=0L;
				this.tipocodigosribancoLogic.getTipoCodigoSriBancos().removeAll(tipocodigosribancosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCodigoSriBanco tipocodigosribancoAux:this.tipocodigosribancos) {
					if(tipocodigosribancoAux.getId()<0) {
						tipocodigosribancosAux.add(tipocodigosribancoAux);
					}		
				}
				this.iIdNuevoTipoCodigoSriBanco=0L;
				this.tipocodigosribancos.removeAll(tipocodigosribancosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCodigoSriBanco 
					&& this.tipocodigosribancoLogic.getTipoCodigoSriBancos().size()>0
					) {
					tipocodigosribancoAux=this.tipocodigosribancoLogic.getTipoCodigoSriBancos().get(this.tipocodigosribancoLogic.getTipoCodigoSriBancos().size() - 1);
				
					if(tipocodigosribancoAux.getId()<0) {
						this.tipocodigosribancoLogic.getTipoCodigoSriBancos().remove(tipocodigosribancoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCodigoSriBanco && this.tipocodigosribancos.size()>0) {
					tipocodigosribancoAux=this.tipocodigosribancos.get(this.tipocodigosribancos.size() - 1);
				
					if(tipocodigosribancoAux.getId()<0) {
						this.tipocodigosribancos.remove(tipocodigosribancoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCodigoSriBanco(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocodigosribanco.getId()<0) {
				this.tipocodigosribancoLogic.getTipoCodigoSriBancos().remove(this.tipocodigosribanco);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocodigosribanco.getId()<0) {
				this.tipocodigosribancos.remove(this.tipocodigosribanco);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCodigoSriBanco(List<TipoCodigoSriBanco> tipocodigosribancosAux) throws Exception {
		TipoCodigoSriBancoConstantesFunciones.setEstadosInicialesTipoCodigoSriBanco(tipocodigosribancosAux);
	}
	
	public void setEstadosInicialesTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribancoAux) throws Exception {
		TipoCodigoSriBancoConstantesFunciones.setEstadosInicialesTipoCodigoSriBanco(tipocodigosribancoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCodigoSriBancoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCodigoSriBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCodigoSriBancoActual()) {
				if(!this.isEsNuevoTipoCodigoSriBanco) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCodigoSriBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCodigoSriBanco=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCodigoSriBancoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA A ?", "MANTENIMIENTO DE A", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCodigoSriBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCodigoSriBanco tipocodigosribanco) throws Exception {
		TipoCodigoSriBancoConstantesFunciones.seleccionarAsignar(this.tipocodigosribanco,tipocodigosribanco);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCodigoSriBanco=this.isPermisoActualizarOriginalTipoCodigoSriBanco;
			
			
			this.seleccionarAsignar(tipocodigosribanco);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCodigoSriBancoConstantesFunciones.quitarEspaciosTipoCodigoSriBanco(this.tipocodigosribanco,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCodigoSriBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocodigosribancoSessionBean.setsFuncionBusquedaRapida(this.tipocodigosribancoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCodigoSriBanco) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCodigoSriBanco(esParaCancelar);				
				this.cancelarNuevoTipoCodigoSriBanco(esParaCancelar);								
			}
			
			this.tipocodigosribanco=new TipoCodigoSriBanco();
			
			this.inicializarTipoCodigoSriBanco();
			
			this.actualizarEstadoCeldasBotonesTipoCodigoSriBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCodigoSriBanco() throws Exception {
		try {
			TipoCodigoSriBancoConstantesFunciones.inicializarTipoCodigoSriBanco(this.tipocodigosribanco);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocodigosribancoLogic.getTipoCodigoSriBancos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCodigoSriBancos(String sAccionBusqueda,List<TipoCodigoSriBanco> tipocodigosribancosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCodigoSriBanco"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCodigoSriBancoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCodigoSriBancoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCodigoSriBanco"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  As");		
		parameters.put("busquedapor", TipoCodigoSriBancoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCodigoSriBanco=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCodigoSriBancoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCodigoSriBancoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCodigoSriBanco=new JRBeanArrayDataSource(TipoCodigoSriBancoJInternalFrame.TraerTipoCodigoSriBancoBeans(tipocodigosribancosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCodigoSriBanco);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCodigoSriBancoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCodigoSriBancoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCodigoSriBancoBean.TraerTipoCodigoSriBancoBeans(tipocodigosribancosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCodigoSriBancos(sAccionBusqueda,sTipoArchivoReporte,tipocodigosribancosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCodigoSriBancos(sAccionBusqueda,sTipoArchivoReporte,tipocodigosribancosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCodigoSriBancoActionPerformed(null);
					//this.generarExcelReporteTipoCodigoSriBancos(sAccionBusqueda,sTipoArchivoReporte,tipocodigosribancosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCodigoSriBancos(sAccionBusqueda,sTipoArchivoReporte,tipocodigosribancosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCodigoSriBancos(sAccionBusqueda,sTipoArchivoReporte,tipocodigosribancosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCodigoSriBancos(sAccionBusqueda,sTipoArchivoReporte,tipocodigosribancosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCodigoSriBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCodigoSriBanco> tipocodigosribancosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocodigosribanco";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCodigoSriBancos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCodigoSriBanco("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCodigoSriBanco tipocodigosribanco : tipocodigosribancosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCodigoSriBancoConstantesFunciones.generarExcelReporteDataTipoCodigoSriBanco("NORMAL",row,workbook,tipocodigosribanco,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCodigoSriBanco(String sTipo,Row row,Workbook workbook) {
		
		TipoCodigoSriBancoConstantesFunciones.generarExcelReporteHeaderTipoCodigoSriBanco(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCodigoSriBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCodigoSriBanco> tipocodigosribancosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocodigosribanco_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCodigoSriBancos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCodigoSriBanco tipocodigosribanco : tipocodigosribancosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCodigoSriBancoConstantesFunciones.getTipoCodigoSriBancoDescripcion(tipocodigosribanco));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCodigoSriBancoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCodigoSriBancoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocodigosribanco.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCodigoSriBancoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCodigoSriBancoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocodigosribanco.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCodigoSriBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCodigoSriBanco> tipocodigosribancosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCodigoSriBanco> tipocodigosribancosRespaldo=null;
		
		classes=TipoCodigoSriBancoConstantesFunciones.getClassesRelationshipsOfTipoCodigoSriBanco(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocodigosribancoLogic.setDatosCliente(this.datosCliente);
		this.tipocodigosribancoLogic.setDatosDeep(this.datosDeep);
		this.tipocodigosribancoLogic.setIsConDeep(true);
		
		tipocodigosribancosRespaldo=this.tipocodigosribancoLogic.getTipoCodigoSriBancos();
		
		this.tipocodigosribancoLogic.setTipoCodigoSriBancos(tipocodigosribancosParaReportes);	
		this.tipocodigosribancoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocodigosribancosParaReportes=this.tipocodigosribancoLogic.getTipoCodigoSriBancos();
		this.tipocodigosribancoLogic.setTipoCodigoSriBancos(tipocodigosribancosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocodigosribanco_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCodigoSriBancos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCodigoSriBanco("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCodigoSriBanco tipocodigosribanco : tipocodigosribancosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCodigoSriBanco("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCodigoSriBancoConstantesFunciones.generarExcelReporteDataTipoCodigoSriBanco("NORMAL",row,workbook,tipocodigosribanco,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoCodigoSriBancoConstantesFunciones.getTipoCodigoSriBancoDescripcion(tipocodigosribanco));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCodigoSriBanco() throws Exception {		
		this.startProcessTipoCodigoSriBanco(true);
	}
	
	public void startProcessTipoCodigoSriBanco(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoCodigoSriBanco, this.jScrollPanelDatosTipoCodigoSriBanco,this.jPanelPaginacionTipoCodigoSriBanco, this.jScrollPanelDatosEdicionTipoCodigoSriBanco, this.jPanelAccionesTipoCodigoSriBanco,this.jPanelAccionesFormularioTipoCodigoSriBanco,this.jmenuBarTipoCodigoSriBanco,this.jmenuBarDetalleTipoCodigoSriBanco,this.jTtoolBarTipoCodigoSriBanco,this.jTtoolBarDetalleTipoCodigoSriBanco);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCodigoSriBanco=null; 
		
		final JPanel jPanelParametrosReportesTipoCodigoSriBanco=this.jPanelParametrosReportesTipoCodigoSriBanco;
		//final JScrollPane jScrollPanelDatosTipoCodigoSriBanco=this.jScrollPanelDatosTipoCodigoSriBanco;
		final JTable jTableDatosTipoCodigoSriBanco=this.jTableDatosTipoCodigoSriBanco;		
		final JPanel jPanelPaginacionTipoCodigoSriBanco=this.jPanelPaginacionTipoCodigoSriBanco;
		//final JScrollPane jScrollPanelDatosEdicionTipoCodigoSriBanco=this.jScrollPanelDatosEdicionTipoCodigoSriBanco;
		final JPanel jPanelAccionesTipoCodigoSriBanco=this.jPanelAccionesTipoCodigoSriBanco;
		
		JPanel jPanelCamposAuxiliarTipoCodigoSriBanco=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCodigoSriBanco=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {
			jPanelCamposAuxiliarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jPanelCamposTipoCodigoSriBanco;
			jPanelAccionesFormularioAuxiliarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jPanelAccionesFormularioTipoCodigoSriBanco;
		}
		
		final JPanel jPanelCamposTipoCodigoSriBanco=jPanelCamposAuxiliarTipoCodigoSriBanco;
		final JPanel jPanelAccionesFormularioTipoCodigoSriBanco=jPanelAccionesFormularioAuxiliarTipoCodigoSriBanco;
		
		
		final JMenuBar jmenuBarTipoCodigoSriBanco=this.jmenuBarTipoCodigoSriBanco;
		final JToolBar jTtoolBarTipoCodigoSriBanco=this.jTtoolBarTipoCodigoSriBanco;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCodigoSriBanco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCodigoSriBanco=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {
			jmenuBarDetalleAuxiliarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jmenuBarDetalleTipoCodigoSriBanco;
			jTtoolBarDetalleAuxiliarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTtoolBarDetalleTipoCodigoSriBanco;
		}
		
		final JMenuBar jmenuBarDetalleTipoCodigoSriBanco=jmenuBarDetalleAuxiliarTipoCodigoSriBanco;
		final JToolBar jTtoolBarDetalleTipoCodigoSriBanco=jTtoolBarDetalleAuxiliarTipoCodigoSriBanco;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCodigoSriBanco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCodigoSriBanco;
			processRunnable.jTableDatos=jTableDatosTipoCodigoSriBanco;
			processRunnable.jPanelCampos=jPanelCamposTipoCodigoSriBanco;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCodigoSriBanco;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCodigoSriBanco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCodigoSriBanco;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCodigoSriBanco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCodigoSriBanco;
			processRunnable.jTtoolBar=jTtoolBarTipoCodigoSriBanco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCodigoSriBanco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCodigoSriBanco ,jPanelParametrosReportesTipoCodigoSriBanco,jTableDatosTipoCodigoSriBanco, /*jScrollPanelDatosTipoCodigoSriBanco,*/jPanelCamposTipoCodigoSriBanco,jPanelPaginacionTipoCodigoSriBanco, /*jScrollPanelDatosEdicionTipoCodigoSriBanco,*/ jPanelAccionesTipoCodigoSriBanco,jPanelAccionesFormularioTipoCodigoSriBanco,jmenuBarTipoCodigoSriBanco,jmenuBarDetalleTipoCodigoSriBanco,jTtoolBarTipoCodigoSriBanco,jTtoolBarDetalleTipoCodigoSriBanco);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoCodigoSriBanco, jScrollPanelDatosTipoCodigoSriBanco,jPanelPaginacionTipoCodigoSriBanco, jScrollPanelDatosEdicionTipoCodigoSriBanco, jPanelAccionesTipoCodigoSriBanco,jPanelAccionesFormularioTipoCodigoSriBanco,jmenuBarTipoCodigoSriBanco,jmenuBarDetalleTipoCodigoSriBanco,jTtoolBarTipoCodigoSriBanco,jTtoolBarDetalleTipoCodigoSriBanco);
						
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
	
	public void finishProcessTipoCodigoSriBanco() {// throws Exception 
		this.finishProcessTipoCodigoSriBanco(true);
	}
	
	public void finishProcessTipoCodigoSriBanco(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoCodigoSriBanco, this.jScrollPanelDatosTipoCodigoSriBanco,this.jPanelPaginacionTipoCodigoSriBanco, this.jScrollPanelDatosEdicionTipoCodigoSriBanco, this.jPanelAccionesTipoCodigoSriBanco,this.jPanelAccionesFormularioTipoCodigoSriBanco,this.jmenuBarTipoCodigoSriBanco,this.jmenuBarDetalleTipoCodigoSriBanco,this.jTtoolBarTipoCodigoSriBanco,this.jTtoolBarDetalleTipoCodigoSriBanco);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCodigoSriBanco=null; 
		
		final JPanel jPanelParametrosReportesTipoCodigoSriBanco=this.jPanelParametrosReportesTipoCodigoSriBanco;
		//final JScrollPane jScrollPanelDatosTipoCodigoSriBanco=this.jScrollPanelDatosTipoCodigoSriBanco;
		final JTable jTableDatosTipoCodigoSriBanco=this.jTableDatosTipoCodigoSriBanco;		
		final JPanel jPanelPaginacionTipoCodigoSriBanco=this.jPanelPaginacionTipoCodigoSriBanco;
		//final JScrollPane jScrollPanelDatosEdicionTipoCodigoSriBanco=this.jScrollPanelDatosEdicionTipoCodigoSriBanco;
		final JPanel jPanelAccionesTipoCodigoSriBanco=this.jPanelAccionesTipoCodigoSriBanco;
		
		JPanel jPanelCamposAuxiliarTipoCodigoSriBanco=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCodigoSriBanco=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {
			jPanelCamposAuxiliarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jPanelCamposTipoCodigoSriBanco;
			jPanelAccionesFormularioAuxiliarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jPanelAccionesFormularioTipoCodigoSriBanco;
		}
		
		final JPanel jPanelCamposTipoCodigoSriBanco=jPanelCamposAuxiliarTipoCodigoSriBanco;
		final JPanel jPanelAccionesFormularioTipoCodigoSriBanco=jPanelAccionesFormularioAuxiliarTipoCodigoSriBanco;
		
		
		final JMenuBar jmenuBarTipoCodigoSriBanco=this.jmenuBarTipoCodigoSriBanco;		
		final JToolBar jTtoolBarTipoCodigoSriBanco=this.jTtoolBarTipoCodigoSriBanco;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCodigoSriBanco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCodigoSriBanco=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {
			jmenuBarDetalleAuxiliarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jmenuBarDetalleTipoCodigoSriBanco;
			jTtoolBarDetalleAuxiliarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTtoolBarDetalleTipoCodigoSriBanco;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCodigoSriBanco=jmenuBarDetalleAuxiliarTipoCodigoSriBanco;
		final JToolBar jTtoolBarDetalleTipoCodigoSriBanco=jTtoolBarDetalleAuxiliarTipoCodigoSriBanco;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCodigoSriBanco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCodigoSriBanco;
			processRunnable.jTableDatos=jTableDatosTipoCodigoSriBanco;
			processRunnable.jPanelCampos=jPanelCamposTipoCodigoSriBanco;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCodigoSriBanco;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCodigoSriBanco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCodigoSriBanco;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCodigoSriBanco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCodigoSriBanco;
			processRunnable.jTtoolBar=jTtoolBarTipoCodigoSriBanco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCodigoSriBanco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCodigoSriBanco ,jPanelParametrosReportesTipoCodigoSriBanco, jTableDatosTipoCodigoSriBanco,/*jScrollPanelDatosTipoCodigoSriBanco,*/jPanelCamposTipoCodigoSriBanco,jPanelPaginacionTipoCodigoSriBanco, /*jScrollPanelDatosEdicionTipoCodigoSriBanco,*/ jPanelAccionesTipoCodigoSriBanco,jPanelAccionesFormularioTipoCodigoSriBanco,jmenuBarTipoCodigoSriBanco,jmenuBarDetalleTipoCodigoSriBanco,jTtoolBarTipoCodigoSriBanco,jTtoolBarDetalleTipoCodigoSriBanco));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCodigoSriBanco(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCodigoSriBanco(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCodigoSriBanco(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCodigoSriBanco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCodigoSriBanco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCodigoSriBanco,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCodigoSriBanco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCodigoSriBanco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCodigoSriBanco,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocodigosribancoConstantesFunciones.getsFinalQueryTipoCodigoSriBanco();
		String  finalQueryPaginacionTodos=this.tipocodigosribancoConstantesFunciones.getsFinalQueryTipoCodigoSriBanco();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCodigoSriBancoConstantesFunciones.getArrayColumnasGlobalesNoTipoCodigoSriBanco(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCodigoSriBancoConstantesFunciones.getArrayColumnasGlobalesTipoCodigoSriBanco(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCodigoSriBancoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocodigosribancosEliminados= new ArrayList<TipoCodigoSriBanco>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCodigoSriBanco();
		
				///*TipoCodigoSriBancoSessionBean*/this.tipocodigosribancoSessionBean=new TipoCodigoSriBancoSessionBean();
			
			if(this.tipocodigosribancoSessionBean==null) {
				this.tipocodigosribancoSessionBean=new TipoCodigoSriBancoSessionBean();
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
					this.iNumeroPaginacion=TipoCodigoSriBancoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCodigoSriBancoConstantesFunciones.getClassesForeignKeysOfTipoCodigoSriBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocodigosribanco."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocodigosribancosAux= new ArrayList<TipoCodigoSriBanco>();
			
				
			tipocodigosribancoLogic.setDatosCliente(this.datosCliente);
			tipocodigosribancoLogic.setDatosDeep(this.datosDeep);
			tipocodigosribancoLogic.setIsConDeep(true);
			
			
			tipocodigosribancoLogic.getTipoCodigoSriBancoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocodigosribancoLogic.getTodosTipoCodigoSriBancos(finalQueryGlobal,pagination);
					
					//tipocodigosribancoLogic.getTodosTipoCodigoSriBancosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocodigosribancoLogic.getTipoCodigoSriBancos()==null|| tipocodigosribancoLogic.getTipoCodigoSriBancos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocodigosribancosAux= new ArrayList<TipoCodigoSriBanco>();
							tipocodigosribancosAux.addAll(tipocodigosribancoLogic.getTipoCodigoSriBancos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocodigosribancosAux= new ArrayList<TipoCodigoSriBanco>();
							tipocodigosribancosAux.addAll(tipocodigosribancos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocodigosribancoLogic.getTodosTipoCodigoSriBancos(finalQueryGlobal+"",this.pagination);												
							
							//tipocodigosribancoLogic.getTodosTipoCodigoSriBancosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCodigoSriBancos("Todos",tipocodigosribancoLogic.getTipoCodigoSriBancos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocodigosribancoLogic.setTipoCodigoSriBancos(new ArrayList<TipoCodigoSriBanco>());					
							tipocodigosribancoLogic.getTipoCodigoSriBancos().addAll(tipocodigosribancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocodigosribancos=new ArrayList<TipoCodigoSriBanco>();
							tipocodigosribancos.addAll(tipocodigosribancosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCodigoSriBanco=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCodigoSriBanco=this.idActual;
				
				} else if(this.idTipoCodigoSriBancoActual!=null && this.idTipoCodigoSriBancoActual!=0L) {
					idTipoCodigoSriBanco=idTipoCodigoSriBancoActual;
				}
				
					
				this.sDetalleReporte=TipoCodigoSriBancoConstantesFunciones.getDetalleIndicePorId(idTipoCodigoSriBanco);
				
				this.tipocodigosribancos=new ArrayList<TipoCodigoSriBanco>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocodigosribancoLogic.getEntity(idTipoCodigoSriBanco);
					
					//tipocodigosribancoLogic.getEntityWithConnection(idTipoCodigoSriBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocodigosribancoLogic.setTipoCodigoSriBancos(new ArrayList<TipoCodigoSriBanco>());
					tipocodigosribancoLogic.getTipoCodigoSriBancos().add(tipocodigosribancoLogic.getTipoCodigoSriBanco());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocodigosribancos=new ArrayList<TipoCodigoSriBanco>();
					this.tipocodigosribancos.add(tipocodigosribanco);
				}
				
				if(tipocodigosribancoLogic.getTipoCodigoSriBanco()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCodigoSriBanco();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCodigoSriBanco();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocodigosribancoLogic.getTipoCodigoSriBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocodigosribancos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocodigosribancoLogic.getTipoCodigoSriBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocodigosribancos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCodigoSriBanco tipocodigosribanco) {
		Boolean permite=true;
		
		if(this.tipocodigosribanco.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCodigoSriBancoConstantesFunciones.getOrderByListaTipoCodigoSriBanco();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCodigoSriBancoConstantesFunciones.getOrderByListaTipoCodigoSriBanco();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCodigoSriBanco tipocodigosribanco:tipocodigosribancoLogic.getTipoCodigoSriBancos()) {
				if(tipocodigosribanco.getsType().equals(Constantes2.S_TOTALES)) {
					tipocodigosribancoTotales=tipocodigosribanco;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCodigoSriBanco tipocodigosribanco:this.tipocodigosribancos) {
				if(tipocodigosribanco.getsType().equals(Constantes2.S_TOTALES)) {
					tipocodigosribancoTotales=tipocodigosribanco;
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
			this.tipocodigosribancoAux=new TipoCodigoSriBanco();
			this.tipocodigosribancoAux.setsType(Constantes2.S_TOTALES);
			this.tipocodigosribancoAux.setIsNew(false);
			this.tipocodigosribancoAux.setIsChanged(false);
			this.tipocodigosribancoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCodigoSriBancoConstantesFunciones.TotalizarValoresFilaTipoCodigoSriBanco(this.tipocodigosribancoLogic.getTipoCodigoSriBancos(),this.tipocodigosribancoAux);
				
				this.tipocodigosribancoLogic.getTipoCodigoSriBancos().add(this.tipocodigosribancoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCodigoSriBancoConstantesFunciones.TotalizarValoresFilaTipoCodigoSriBanco(this.tipocodigosribancos,this.tipocodigosribancoAux);
				
				this.tipocodigosribancos.add(this.tipocodigosribancoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocodigosribancoTotales=new TipoCodigoSriBanco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocodigosribancoLogic.getTipoCodigoSriBancos().remove(tipocodigosribancoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocodigosribancos.remove(tipocodigosribancoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocodigosribancoTotales=new TipoCodigoSriBanco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCodigoSriBanco tipocodigosribanco:tipocodigosribancoLogic.getTipoCodigoSriBancos()) {
				if(tipocodigosribanco.getsType().equals(Constantes2.S_TOTALES)) {
					tipocodigosribancoTotales=tipocodigosribanco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCodigoSriBancoConstantesFunciones.TotalizarValoresFilaTipoCodigoSriBanco(this.tipocodigosribancoLogic.getTipoCodigoSriBancos(),tipocodigosribancoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCodigoSriBanco tipocodigosribanco:this.tipocodigosribancos) {
				if(tipocodigosribanco.getsType().equals(Constantes2.S_TOTALES)) {
					tipocodigosribancoTotales=tipocodigosribanco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCodigoSriBancoConstantesFunciones.TotalizarValoresFilaTipoCodigoSriBanco(this.tipocodigosribancos,tipocodigosribancoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoCodigoSriBanco() {
		this.isPermisoTodoTipoCodigoSriBanco=false;
		this.isPermisoNuevoTipoCodigoSriBanco=false;
		this.isPermisoActualizarTipoCodigoSriBanco=false;
		this.isPermisoActualizarOriginalTipoCodigoSriBanco=false;
		this.isPermisoEliminarTipoCodigoSriBanco=false;
		this.isPermisoGuardarCambiosTipoCodigoSriBanco=false;
		this.isPermisoConsultaTipoCodigoSriBanco=false;
		this.isPermisoBusquedaTipoCodigoSriBanco=false;
		this.isPermisoReporteTipoCodigoSriBanco=false;		
		this.isPermisoOrdenTipoCodigoSriBanco=false;		
		this.isPermisoPaginacionMedioTipoCodigoSriBanco=false;		
		this.isPermisoPaginacionAltoTipoCodigoSriBanco=false;
		this.isPermisoPaginacionTodoTipoCodigoSriBanco=false;
		this.isPermisoCopiarTipoCodigoSriBanco=false;		
		this.isPermisoVerFormTipoCodigoSriBanco=false;		
		this.isPermisoDuplicarTipoCodigoSriBanco=false;		
		this.isPermisoOrdenTipoCodigoSriBanco=false;		
	}
	
	public void setPermisosUsuarioTipoCodigoSriBanco(Boolean isPermiso) {
		this.isPermisoTodoTipoCodigoSriBanco=isPermiso;
		this.isPermisoNuevoTipoCodigoSriBanco=isPermiso;
		this.isPermisoActualizarTipoCodigoSriBanco=isPermiso;
		this.isPermisoActualizarOriginalTipoCodigoSriBanco=isPermiso;
		this.isPermisoEliminarTipoCodigoSriBanco=isPermiso;
		this.isPermisoGuardarCambiosTipoCodigoSriBanco=isPermiso;
		this.isPermisoConsultaTipoCodigoSriBanco=isPermiso;
		this.isPermisoBusquedaTipoCodigoSriBanco=isPermiso;
		this.isPermisoReporteTipoCodigoSriBanco=isPermiso;
		this.isPermisoOrdenTipoCodigoSriBanco=isPermiso;		
		this.isPermisoPaginacionMedioTipoCodigoSriBanco=isPermiso;		
		this.isPermisoPaginacionAltoTipoCodigoSriBanco=isPermiso;		
		this.isPermisoPaginacionTodoTipoCodigoSriBanco=isPermiso;		
		this.isPermisoCopiarTipoCodigoSriBanco=isPermiso;		
		this.isPermisoVerFormTipoCodigoSriBanco=isPermiso;		
		this.isPermisoDuplicarTipoCodigoSriBanco=isPermiso;
		this.isPermisoOrdenTipoCodigoSriBanco=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCodigoSriBanco(Boolean isPermiso) {
		//this.isPermisoTodoTipoCodigoSriBanco=isPermiso;
		this.isPermisoNuevoTipoCodigoSriBanco=isPermiso;
		this.isPermisoActualizarTipoCodigoSriBanco=isPermiso;
		this.isPermisoActualizarOriginalTipoCodigoSriBanco=isPermiso;
		this.isPermisoEliminarTipoCodigoSriBanco=isPermiso;
		this.isPermisoGuardarCambiosTipoCodigoSriBanco=isPermiso;
		//this.isPermisoConsultaTipoCodigoSriBanco=isPermiso;
		//this.isPermisoBusquedaTipoCodigoSriBanco=isPermiso;
		//this.isPermisoReporteTipoCodigoSriBanco=isPermiso;
		//this.isPermisoOrdenTipoCodigoSriBanco=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCodigoSriBanco=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCodigoSriBanco=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCodigoSriBanco=isPermiso;		
		//this.isPermisoCopiarTipoCodigoSriBanco=isPermiso;		
		//this.isPermisoDuplicarTipoCodigoSriBanco=isPermiso;
		//this.isPermisoOrdenTipoCodigoSriBanco=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCodigoSriBancoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoCodigoSriBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCodigoSriBanco(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCodigoSriBancoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCodigoSriBancoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCodigoSriBancoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCodigoSriBancoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoCodigoSriBanco() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCodigoSriBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCodigoSriBancoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCodigoSriBanco=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCodigoSriBanco=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCodigoSriBanco=this.isPermisoActualizarTipoCodigoSriBanco;
			this.isPermisoEliminarTipoCodigoSriBanco=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCodigoSriBanco=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCodigoSriBanco=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCodigoSriBanco=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCodigoSriBanco=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCodigoSriBanco=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCodigoSriBanco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCodigoSriBanco=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCodigoSriBanco=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCodigoSriBanco=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCodigoSriBanco=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCodigoSriBanco=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCodigoSriBanco=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCodigoSriBanco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCodigoSriBanco.setToolTipText(this.jTableDatosTipoCodigoSriBanco.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCodigoSriBanco(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCodigoSriBanco(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCodigoSriBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCodigoSriBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCodigoSriBanco() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoCodigoSriBancoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCodigoSriBancoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCodigoSriBancoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCodigoSriBancoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoCodigoSriBancoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCodigoSriBanco()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoCodigoSriBanco()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCodigoSriBanco(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCodigoSriBanco()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCodigoSriBanco();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribanco)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribanco,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCodigoSriBanco()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCodigoSriBanco()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCodigoSriBanco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCodigoSriBanco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCodigoSriBanco()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCodigoSriBanco()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCodigoSriBanco(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCodigoSriBanco()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoCodigoSriBancoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCodigoSriBancoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCodigoSriBancoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocodigosribancoSessionBean=new TipoCodigoSriBancoSessionBean(); 
		this.tipocodigosribancoConstantesFunciones=new TipoCodigoSriBancoConstantesFunciones(); 
		this.tipocodigosribancoBean=new TipoCodigoSriBanco();//(this.tipocodigosribancoConstantesFunciones); 		
		this.tipocodigosribancoReturnGeneral=new TipoCodigoSriBancoParameterReturnGeneral(); 
		
		this.tipocodigosribancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocodigosribancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCodigoSriBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCodigoSriBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCodigoSriBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCodigoSriBanco(true);
			
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
			
			this.tipocodigosribancoConstantesFunciones=new TipoCodigoSriBancoConstantesFunciones(); 
			this.tipocodigosribancoBean=new TipoCodigoSriBanco();//this.tipocodigosribancoConstantesFunciones); 			
			this.tipocodigosribancoReturnGeneral=new TipoCodigoSriBancoParameterReturnGeneral(); 
		
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"A Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocodigosribanco=new TipoCodigoSriBanco();
			this.tipocodigosribancos = new ArrayList<TipoCodigoSriBanco>();
			this.tipocodigosribancosAux = new ArrayList<TipoCodigoSriBanco>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic=new TipoCodigoSriBancoLogic();
				this.tipocodigosribancoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocodigosribancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocodigosribancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCodigoSriBanco);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCodigoSriBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCodigoSriBanco);	
					}
					
					if(this.jInternalFrameImportacionTipoCodigoSriBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCodigoSriBanco);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCodigoSriBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCodigoSriBanco);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCodigoSriBanco);
				this.jInternalFrameDetalleFormTipoCodigoSriBanco.setVisible(false);
				this.jInternalFrameDetalleFormTipoCodigoSriBanco.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCodigoSriBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCodigoSriBanco);
					this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCodigoSriBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCodigoSriBanco);
					this.jInternalFrameImportacionTipoCodigoSriBanco.setVisible(false);
					this.jInternalFrameImportacionTipoCodigoSriBanco.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCodigoSriBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCodigoSriBanco);
					this.jInternalFrameOrderByTipoCodigoSriBanco.setVisible(false);
					this.jInternalFrameOrderByTipoCodigoSriBanco.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCodigoSriBancoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCodigoSriBancoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocodigosribancoReturnGeneral=new TipoCodigoSriBancoParameterReturnGeneral();
			
			this.tipocodigosribancoParameterGeneral=new TipoCodigoSriBancoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocodigosribancoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCodigoSriBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCodigoSriBancoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocodigosribancoSessionBean.getEsGuardarRelacionado(),this.tipocodigosribancoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCodigoSriBancoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocodigosribancoSessionBean.getEsGuardarRelacionado(),this.tipocodigosribancoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaDuplicarTipoCodigoSriBanco=true;
			this.isVisibilidadCeldaCopiarTipoCodigoSriBanco=true;
			this.isVisibilidadCeldaVerFormTipoCodigoSriBanco=true;
			this.isVisibilidadCeldaOrdenTipoCodigoSriBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaModificarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaActualizarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaEliminarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaCancelarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaGuardarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCodigoSriBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCodigoSriBanco();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCodigoSriBanco(false);
			
			this.setPermisosUsuarioTipoCodigoSriBanco();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocodigosribancoSessionBean.getEsGuardarRelacionado() && this.tipocodigosribancoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCodigoSriBancoClasesRelacionadas();
			}
			
			if(this.tipocodigosribancoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCodigoSriBancoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCodigoSriBanco();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCodigoSriBanco();
			}
			
			if(!this.isPermisoBusquedaTipoCodigoSriBanco) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCodigoSriBanco,this.isPermisoPaginacionMedioTipoCodigoSriBanco,this.isPermisoPaginacionTodoTipoCodigoSriBanco);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCodigoSriBancoConstantesFunciones.getTiposSeleccionarTipoCodigoSriBanco());
				
				this.tiposColumnasSelect=TipoCodigoSriBancoConstantesFunciones.getTiposSeleccionarTipoCodigoSriBanco(true);
				
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
			//if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCodigoSriBanco();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoCodigoSriBanco(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoCodigoSriBanco(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCodigoSriBanco() ;
			
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
				tipocodigosribancoImplementable= (TipoCodigoSriBancoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCodigoSriBancoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocodigosribancoImplementableHome= (TipoCodigoSriBancoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCodigoSriBancoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocodigosribancos= new ArrayList<TipoCodigoSriBanco>();
			this.tipocodigosribancosEliminados= new ArrayList<TipoCodigoSriBanco>();
						
			this.isEsNuevoTipoCodigoSriBanco=false;
			this.esParaAccionDesdeFormularioTipoCodigoSriBanco=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCodigoSriBanco(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCodigoSriBanco();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCodigoSriBancoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCodigoSriBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCodigoSriBanco(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCodigoSriBanco();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCodigoSriBanco();
			}
			
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCodigoSriBanco(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCodigoSriBanco: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCodigoSriBanco() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCodigoSriBanco")) {
				iIndex=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTabbedPaneRelacionesTipoCodigoSriBanco.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTabbedPaneRelacionesTipoCodigoSriBanco.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCodigoSriBanco();	
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
	
	public void cargarCombosForeignKeyTipoCodigoSriBanco(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCodigoSriBanco(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCodigoSriBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCodigoSriBancoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCodigoSriBanco();
		
		this.cargarCombosFrameForeignKeyTipoCodigoSriBanco();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCodigoSriBanco();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCodigoSriBanco();
		}
	}
	
	
	
	public void jButtonNuevoTipoCodigoSriBancoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocodigosribancoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
			
			
			if(jTableDatosTipoCodigoSriBanco.getRowCount()>=1) {
				jTableDatosTipoCodigoSriBanco.removeRowSelectionInterval(0, jTableDatosTipoCodigoSriBanco.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCodigoSriBanco=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCodigoSriBanco(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCodigoSriBanco(true);			
			//this.tipocodigosribanco=new TipoCodigoSriBanco();
			//this.tipocodigosribanco.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCodigoSriBanco(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCodigoSriBanco() ;
			
			if(TipoCodigoSriBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCodigoSriBanco(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocodigosribanco);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocodigosribanco);				
			
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
			
			if(this.tipocodigosribancoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCodigoSriBanco: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCodigoSriBancoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCodigoSriBanco> tipocodigosribancosSeleccionados=new ArrayList<TipoCodigoSriBanco>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCodigoSriBanco.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCodigoSriBanco.getSelectedRows().length;			
			}
			
			tipocodigosribancosSeleccionados=this.getTipoCodigoSriBancosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCodigoSriBanco--;			
				//TipoCodigoSriBanco tipocodigosribancoAux= new TipoCodigoSriBanco();			
				//tipocodigosribancoAux.setId(this.iIdNuevoTipoCodigoSriBanco);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCodigoSriBanco tipocodigosribancoOrigen=new TipoCodigoSriBanco();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCodigoSriBanco tipocodigosribancoOrigen : tipocodigosribancosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocodigosribancoOrigen =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocodigosribancoOrigen =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCodigoSriBanco();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocodigosribanco.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCodigoSriBanco(tipocodigosribancoOrigen,this.tipocodigosribanco,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoSriBanco(this.tipocodigosribanco);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocodigosribancoLogic.getTipoCodigoSriBancos().add(this.tipocodigosribancoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocodigosribancos.add(this.tipocodigosribancoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCodigoSriBanco(false);
				
				this.jTableDatosTipoCodigoSriBanco.setRowSelectionInterval(this.getIndiceNuevoTipoCodigoSriBanco(), this.getIndiceNuevoTipoCodigoSriBanco());
				
				int iLastRow =  this.jTableDatosTipoCodigoSriBanco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCodigoSriBanco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCodigoSriBanco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCodigoSriBanco(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCodigoSriBanco> tipocodigosribancosSeleccionados=new ArrayList<TipoCodigoSriBanco>();									
		
			TipoCodigoSriBanco tipocodigosribancoOrigen=new TipoCodigoSriBanco();
			TipoCodigoSriBanco tipocodigosribancoDestino=new TipoCodigoSriBanco();
				
			tipocodigosribancosSeleccionados=this.getTipoCodigoSriBancosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCodigoSriBanco.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocodigosribancosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCodigoSriBanco.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocodigosribancoOrigen =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocodigosribancoOrigen =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocodigosribancoDestino =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocodigosribancoDestino =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocodigosribancoOrigen =tipocodigosribancosSeleccionados.get(0);
				tipocodigosribancoDestino =tipocodigosribancosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCodigoSriBanco(tipocodigosribancoOrigen,tipocodigosribancoDestino,true,false);
				
				tipocodigosribancoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocodigosribancoDestino,tipocodigosribancoLogic.getTipoCodigoSriBancos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocodigosribancoDestino,tipocodigosribancos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCodigoSriBanco(false);
				
				//this.jTableDatosTipoCodigoSriBanco.setRowSelectionInterval(this.getIndiceNuevoTipoCodigoSriBanco(), this.getIndiceNuevoTipoCodigoSriBanco());
				
				int iLastRow =  this.jTableDatosTipoCodigoSriBanco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCodigoSriBanco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCodigoSriBanco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCodigoSriBanco(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCodigoSriBanco.isVisible();
			
			
			this.jPanelParametrosReportesTipoCodigoSriBanco.setVisible(!isVisible);
			this.jPanelPaginacionTipoCodigoSriBanco.setVisible(!isVisible);
			this.jPanelAccionesTipoCodigoSriBanco.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCodigoSriBanco();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCodigoSriBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCodigoSriBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCodigoSriBanco();
			
			this.abrirFrameOrderByTipoCodigoSriBanco();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCodigoSriBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCodigoSriBanco(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCodigoSriBanco);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCodigoSriBanco.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCodigoSriBanco.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCodigoSriBanco.setSize(this.jInternalFrameDetalleFormTipoCodigoSriBanco.iWidthFormulario,this.jInternalFrameDetalleFormTipoCodigoSriBanco.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCodigoSriBanco.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCodigoSriBanco.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCodigoSriBanco.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCodigoSriBanco.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCodigoSriBanco.jContentPaneDetalleTipoCodigoSriBanco.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTabbedPaneRelacionesTipoCodigoSriBanco.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCodigoSriBanco.jContentPaneDetalleTipoCodigoSriBanco.getWidth(),TipoCodigoSriBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTabbedPaneRelacionesTipoCodigoSriBanco.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCodigoSriBanco.jContentPaneDetalleTipoCodigoSriBanco.getWidth(),TipoCodigoSriBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTabbedPaneRelacionesTipoCodigoSriBanco.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCodigoSriBanco.jContentPaneDetalleTipoCodigoSriBanco.getWidth(),TipoCodigoSriBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCodigoSriBanco.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCodigoSriBanco.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCodigoSriBanco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCodigoSriBanco==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCodigoSriBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCodigoSriBanco,false,this);
				} else {
					this.jInternalFrameOrderByTipoCodigoSriBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCodigoSriBanco,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCodigoSriBanco);
				this.jInternalFrameOrderByTipoCodigoSriBanco.setVisible(false);
				this.jInternalFrameOrderByTipoCodigoSriBanco.setSelected(false);
				
				this.jInternalFrameOrderByTipoCodigoSriBanco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCodigoSriBanco"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCodigoSriBanco();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCodigoSriBanco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCodigoSriBanco==null) {
				
				this.jInternalFrameImportacionTipoCodigoSriBanco=new ImportacionJInternalFrame(TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCodigoSriBanco);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCodigoSriBanco);
				this.jInternalFrameImportacionTipoCodigoSriBanco.setVisible(false);
				this.jInternalFrameImportacionTipoCodigoSriBanco.setSelected(false);


				this.jInternalFrameImportacionTipoCodigoSriBanco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCodigoSriBanco"));
				this.jInternalFrameImportacionTipoCodigoSriBanco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCodigoSriBanco"));
				this.jInternalFrameImportacionTipoCodigoSriBanco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCodigoSriBanco"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCodigoSriBanco() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCodigoSriBanco==null) {
				this.jInternalFrameReporteDinamicoTipoCodigoSriBanco=new ReporteDinamicoJInternalFrame(TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCodigoSriBanco);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCodigoSriBanco);
				this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCodigoSriBanco"));
				this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCodigoSriBanco"));
				this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCodigoSriBanco"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCodigoSriBanco();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoCodigoSriBanco() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCodigoSriBanco);
			
	       	this.jInternalFrameDetalleFormTipoCodigoSriBanco.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCodigoSriBanco.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCodigoSriBanco.dispose();
			//this.jInternalFrameDetalleFormTipoCodigoSriBanco=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCodigoSriBanco() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCodigoSriBanco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCodigoSriBanco.setVisible(true);
	        this.jInternalFrameImportacionTipoCodigoSriBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCodigoSriBanco() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCodigoSriBanco.setVisible(true);
	        this.jInternalFrameOrderByTipoCodigoSriBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCodigoSriBanco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCodigoSriBanco.setVisible(false);
	        this.jInternalFrameOrderByTipoCodigoSriBanco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCodigoSriBanco() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCodigoSriBanco() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCodigoSriBanco.setVisible(false);
	        this.jInternalFrameImportacionTipoCodigoSriBanco.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCodigoSriBanco(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCodigoSriBanco(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCodigoSriBanco(true);
			//this.isEsNuevoTipoCodigoSriBanco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCodigoSriBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCodigoSriBanco(false) ;
			
			if(tipocodigosribancoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoCodigoSriBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCodigoSriBanco(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCodigoSriBanco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCodigoSriBancoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCodigoSriBanco(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCodigoSriBanco(true);
			//this.isEsNuevoTipoCodigoSriBanco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocodigosribanco.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCodigoSriBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCodigoSriBanco(false) ;
			
			if(TipoCodigoSriBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCodigoSriBanco(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCodigoSriBanco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCodigoSriBanco(false);
			
			//if(!this.isEsNuevoTipoCodigoSriBanco) {								
				int intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCodigoSriBanco(this.tipocodigosribanco,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoSriBanco(this.tipocodigosribanco);
				
			}
			
			if(this.permiteMantenimiento(this.tipocodigosribanco)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCodigoSriBanco=true;
					this.inicializarActualizarBindingTablaTipoCodigoSriBanco(false);
					this.isEsNuevoTipoCodigoSriBanco=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCodigoSriBanco=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCodigoSriBanco=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCodigoSriBanco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCodigoSriBanco(false);
				
				this.habilitarDeshabilitarControlesTipoCodigoSriBanco(false);
			
												
				
				if(TipoCodigoSriBancoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCodigoSriBanco();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCodigoSriBancoActionPerformed(evt,tipocodigosribancoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCodigoSriBanco(this.tipocodigosribanco,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCodigoSriBanco.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocodigosribancoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocodigosribanco.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCodigoSriBanco.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoSriBanco.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				this.tipocodigosribanco.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				this.tipocodigosribanco.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocodigosribanco)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCodigoSriBancoModel) this.jTableDatosTipoCodigoSriBanco.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCodigoSriBanco=true;
				this.inicializarActualizarBindingTablaTipoCodigoSriBanco(false);
				this.isEsNuevoTipoCodigoSriBanco=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCodigoSriBanco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCodigoSriBanco(false);
				
				this.habilitarDeshabilitarControlesTipoCodigoSriBanco(false);
				
				
				
				if(TipoCodigoSriBancoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCodigoSriBanco();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCodigoSriBanco.getRowCount()>=1) {
				jTableDatosTipoCodigoSriBanco.removeRowSelectionInterval(0, jTableDatosTipoCodigoSriBanco.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCodigoSriBanco(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCodigoSriBanco(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCodigoSriBanco(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCodigoSriBanco(false) ;
			
			this.isEsNuevoTipoCodigoSriBanco=false;
			
			if(TipoCodigoSriBancoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCodigoSriBanco();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCodigoSriBanco(false);
				
				//SI ES MANUAL
				if(TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCodigoSriBanco();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCodigoSriBanco--;			
			//TipoCodigoSriBanco tipocodigosribancoAux= new TipoCodigoSriBanco();			
			//tipocodigosribancoAux.setId(this.iIdNuevoTipoCodigoSriBanco);
			
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCodigoSriBanco();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoSriBanco(this.tipocodigosribanco);
			
			this.tipocodigosribanco.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocodigosribancoLogic.getTipoCodigoSriBancos().add(this.tipocodigosribancoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocodigosribancos.add(this.tipocodigosribancoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCodigoSriBanco(false);
			
			this.jTableDatosTipoCodigoSriBanco.setRowSelectionInterval(this.getIndiceNuevoTipoCodigoSriBanco(), this.getIndiceNuevoTipoCodigoSriBanco());
			
			int iLastRow =  this.jTableDatosTipoCodigoSriBanco.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCodigoSriBanco.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCodigoSriBanco.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCodigoSriBanco(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCodigoSriBanco(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCodigoSriBanco(false);
			
			//SI ES MANUAL
			if(TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCodigoSriBanco();
			}
			
			//this.abrirFrameTreeTipoCodigoSriBanco();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE AS ?", "MANTENIMIENTO DE A", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCodigoSriBanco.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCodigoSriBanco();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocodigosribancoReturnGeneral=tipocodigosribancoLogic.procesarImportacionTipoCodigoSriBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocodigosribancoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCodigoSriBancoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCodigoSriBanco.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCodigoSriBanco.setFileImportacion(this.jInternalFrameImportacionTipoCodigoSriBanco.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCodigoSriBanco.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCodigoSriBanco.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCodigoSriBanco.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCodigoSriBanco.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCodigoSriBanco> tipocodigosribancosSeleccionados=new ArrayList<TipoCodigoSriBanco>();		

		tipocodigosribancosSeleccionados=this.getTipoCodigoSriBancosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCodigoSriBancoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCodigoSriBancoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCodigoSriBancos("Todos",tipocodigosribancosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE A",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCodigoSriBancoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCodigoSriBancoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCodigoSriBancoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoCodigoSriBancoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCodigoSriBancoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoCodigoSriBancoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCodigoSriBancoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoCodigoSriBancoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCodigoSriBanco> tipocodigosribancosSeleccionados=new ArrayList<TipoCodigoSriBanco>();		
		
		tipocodigosribancosSeleccionados=this.getTipoCodigoSriBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocodigosribanco";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCodigoSriBancos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCodigoSriBancoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCodigoSriBancoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoCodigoSriBanco tipocodigosribanco:tipocodigosribancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocodigosribanco.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCodigoSriBancoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCodigoSriBancoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCodigoSriBanco tipocodigosribanco:tipocodigosribancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocodigosribanco.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoCodigoSriBanco(row);				
			//	iRow++;
			//}				
			
			//for(TipoCodigoSriBanco tipocodigosribancoAux:tipocodigosribancosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCodigoSriBanco(tipocodigosribancoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE A",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocodigosribancoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCodigoSriBanco(false);
			
			//SI ES MANUAL
			if(TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCodigoSriBanco();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCodigoSriBanco(false);
			
			//SI ES MANUAL
			if(TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCodigoSriBanco();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCodigoSriBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCodigoSriBanco(false);
			
			//SI ES MANUAL
			if(TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCodigoSriBanco();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigosribancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCodigoSriBanco() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCodigoSriBanco.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCodigoSriBanco.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCodigoSriBanco.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCodigoSriBanco.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCodigoSriBanco.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCodigoSriBanco.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCodigoSriBanco.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCodigoSriBanco(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCodigoSriBanco(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCodigoSriBanco(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCodigoSriBanco(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCodigoSriBanco(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCodigoSriBanco(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCodigoSriBanco(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCodigoSriBanco(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCodigoSriBanco() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCodigoSriBanco();
		
		this.inicializarActualizarBindingBotonesManualTipoCodigoSriBanco(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCodigoSriBanco();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCodigoSriBanco() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCodigoSriBanco(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCodigoSriBanco(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCodigoSriBanco.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCodigoSriBanco.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCodigoSriBanco.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jCheckBoxPostAccionNuevoTipoCodigoSriBanco.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jCheckBoxPostAccionSinCerrarTipoCodigoSriBanco.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jCheckBoxPostAccionSinMensajeTipoCodigoSriBanco.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCodigoSriBanco.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCodigoSriBanco.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCodigoSriBanco.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {
				this.jInternalFrameDetalleFormTipoCodigoSriBanco.jCheckBoxPostAccionNuevoTipoCodigoSriBanco.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCodigoSriBanco.jCheckBoxPostAccionSinCerrarTipoCodigoSriBanco.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCodigoSriBanco.jCheckBoxPostAccionSinMensajeTipoCodigoSriBanco.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCodigoSriBanco.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCodigoSriBanco.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCodigoSriBanco.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCodigoSriBanco.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCodigoSriBanco!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCodigoSriBanco.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCodigoSriBanco.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCodigoSriBanco.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCodigoSriBanco.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCodigoSriBanco!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCodigoSriBanco.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCodigoSriBanco.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCodigoSriBanco(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCodigoSriBanco(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCodigoSriBanco() throws Exception {
		try	{
			if(TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCodigoSriBanco();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCodigoSriBanco() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCodigoSriBanco() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCodigoSriBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCodigoSriBanco.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCodigoSriBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCodigoSriBanco.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCodigoSriBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCodigoSriBanco.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCodigoSriBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCodigoSriBanco.addItem(reporte);
			}
			
			
			if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCodigoSriBanco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCodigoSriBanco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCodigoSriBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCodigoSriBanco.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCodigoSriBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCodigoSriBanco.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCodigoSriBanco.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCodigoSriBanco.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCodigoSriBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCodigoSriBanco.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCodigoSriBanco.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCodigoSriBanco();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCodigoSriBanco() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCodigoSriBanco!=null) {
				this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCodigoSriBanco!=null) {
				this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCodigoSriBanco!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCodigoSriBanco()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCodigoSriBanco(Boolean esInicializar) throws Exception {				
		if(TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCodigoSriBanco();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCodigoSriBanco() throws Exception {
		this.inicializarActualizarBindingTablaTipoCodigoSriBanco(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCodigoSriBanco() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCodigoSriBanco.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCodigoSriBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCodigoSriBanco.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCodigoSriBancoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCodigoSriBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCodigoSriBanco.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCodigoSriBancoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCodigoSriBancoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCodigoSriBancoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCodigoSriBancoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCodigoSriBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCodigoSriBanco.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCodigoSriBancoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCodigoSriBanco.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCodigoSriBanco(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocodigosribancoLogic.getTipoCodigoSriBancos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocodigosribancos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCodigoSriBanco.setModel(new TipoCodigoSriBancoModel(this.tipocodigosribancoLogic.getTipoCodigoSriBancos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCodigoSriBanco.setModel(new TipoCodigoSriBancoModel(this.tipocodigosribancos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCodigoSriBanco!=null && this.jInternalFrameOrderByTipoCodigoSriBanco.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCodigoSriBanco();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCodigoSriBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCodigoSriBanco,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCodigoSriBancoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO,tipocodigosribancoConstantesFunciones.resaltarSeleccionarTipoCodigoSriBanco,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO,tipocodigosribancoConstantesFunciones.resaltarSeleccionarTipoCodigoSriBanco,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCodigoSriBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCodigoSriBanco,TipoCodigoSriBancoConstantesFunciones.LABEL_ID));

		if(this.tipocodigosribancoConstantesFunciones.mostraridTipoCodigoSriBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCodigoSriBancoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocodigosribancoConstantesFunciones.resaltaridTipoCodigoSriBanco,this.tipocodigosribancoConstantesFunciones.activaridTipoCodigoSriBanco,this,true,"idTipoCodigoSriBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocodigosribancoConstantesFunciones.resaltaridTipoCodigoSriBanco,this.tipocodigosribancoConstantesFunciones.activaridTipoCodigoSriBanco,this,true,"idTipoCodigoSriBanco","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCodigoSriBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCodigoSriBanco,TipoCodigoSriBancoConstantesFunciones.LABEL_CODIGO));

		if(this.tipocodigosribancoConstantesFunciones.mostrarcodigoTipoCodigoSriBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCodigoSriBancoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocodigosribancoConstantesFunciones.resaltarcodigoTipoCodigoSriBanco,this.tipocodigosribancoConstantesFunciones.activarcodigoTipoCodigoSriBanco,this,true,"codigoTipoCodigoSriBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocodigosribancoConstantesFunciones.resaltarcodigoTipoCodigoSriBanco,this.tipocodigosribancoConstantesFunciones.activarcodigoTipoCodigoSriBanco,this,true,"codigoTipoCodigoSriBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCodigoSriBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCodigoSriBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCodigoSriBanco,TipoCodigoSriBancoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocodigosribancoConstantesFunciones.mostrarnombreTipoCodigoSriBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCodigoSriBancoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocodigosribancoConstantesFunciones.resaltarnombreTipoCodigoSriBanco,this.tipocodigosribancoConstantesFunciones.activarnombreTipoCodigoSriBanco,this,true,"nombreTipoCodigoSriBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocodigosribancoConstantesFunciones.resaltarnombreTipoCodigoSriBanco,this.tipocodigosribancoConstantesFunciones.activarnombreTipoCodigoSriBanco,this,true,"nombreTipoCodigoSriBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCodigoSriBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCodigoSriBanco.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCodigoSriBanco.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCodigoSriBanco && this.isPermisoGuardarCambiosTipoCodigoSriBanco) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCodigoSriBanco.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCodigoSriBanco.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCodigoSriBanco && this.isPermisoGuardarCambiosTipoCodigoSriBanco) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCodigoSriBanco && this.isPermisoGuardarCambiosTipoCodigoSriBanco) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCodigoSriBanco.moveColumn(this.jTableDatosTipoCodigoSriBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCodigoSriBanco.moveColumn(this.jTableDatosTipoCodigoSriBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCodigoSriBanco.moveColumn(this.jTableDatosTipoCodigoSriBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCodigoSriBanco.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCodigoSriBanco.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCodigoSriBanco,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCodigoSriBanco.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCodigoSriBanco.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCodigoSriBanco.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCodigoSriBanco.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCodigoSriBanco.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocodigosribancoLogic.getTipoCodigoSriBancos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocodigosribancos.size()-1;
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
		//this.jTableDatosTipoCodigoSriBanco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCodigoSriBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCodigoSriBanco();
			
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
				
				//this.isEsNuevoTipoCodigoSriBanco=false;
					
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
			
				if(this.tipocodigosribancoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCodigoSriBanco==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCodigoSriBanco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCodigoSriBanco.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocodigosribanco.getsType().equals("DUPLICADO")
				   || this.tipocodigosribanco.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCodigoSriBanco=true;
				
				} else {
					this.isEsNuevoTipoCodigoSriBanco=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocodigosribanco.getId()>=0 && !this.tipocodigosribanco.getIsNew()) {						
						this.isEsNuevoTipoCodigoSriBanco=false;
						
					} else {
						this.isEsNuevoTipoCodigoSriBanco=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCodigoSriBanco(esRelaciones);						
				
				this.seleccionarTipoCodigoSriBanco(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocodigosribanco.getId()<0) {
					this.isEsNuevoTipoCodigoSriBanco=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCodigoSriBanco(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCodigoSriBanco(evt,rowIndex);
				}	
				
				if(this.tipocodigosribancoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCodigoSriBanco: " + this.dDif); 
					}
				}								
				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCodigoSriBanco(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocodigosribanco)) {
					if(this.tipocodigosribanco.getId()>0) {
						this.tipocodigosribanco.setIsDeleted(true);
						
						this.tipocodigosribancosEliminados.add(this.tipocodigosribanco);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocodigosribancoLogic.getTipoCodigoSriBancos().remove(this.tipocodigosribanco);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocodigosribancos.remove(this.tipocodigosribanco);				
					}
					
					
					((TipoCodigoSriBancoModel) this.jTableDatosTipoCodigoSriBanco.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCodigoSriBanco(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCodigoSriBanco(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCodigoSriBanco) {
			
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCodigoSriBanco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCodigoSriBanco.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCodigoSriBanco(this.tipocodigosribanco);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCodigoSriBanco("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCodigoSriBanco(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCodigoSriBanco() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribanco) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCodigoSriBanco(tipocodigosribanco,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribanco,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCodigoSriBanco(tipocodigosribanco);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCodigoSriBanco(tipocodigosribanco,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCodigoSriBanco(tipocodigosribanco);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribanco) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldidTipoCodigoSriBanco.setText(tipocodigosribanco.getId().toString());
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldcodigoTipoCodigoSriBanco.setText(tipocodigosribanco.getcodigo());
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextAreanombreTipoCodigoSriBanco.setText(tipocodigosribanco.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCodigoSriBanco tipocodigosribancoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocodigosribancoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCodigoSriBanco tipocodigosribancoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocodigosribancoLocal=this.tipocodigosribanco;
			} else {
				tipocodigosribancoLocal=this.tipocodigosribancoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocodigosribancoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCodigoSriBanco(tipocodigosribancoLocal,true);
					
					if(tipocodigosribancoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocodigosribancoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocodigosribancoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribanco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCodigoSriBanco(tipocodigosribanco,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoSriBanco(tipocodigosribanco);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribanco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCodigoSriBanco(tipocodigosribanco,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribanco,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldidTipoCodigoSriBanco.getText()==null || this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldidTipoCodigoSriBanco.getText()=="" || this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldidTipoCodigoSriBanco.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldidTipoCodigoSriBanco.setText("0");
			}

			if(conColumnasBase) {tipocodigosribanco.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldidTipoCodigoSriBanco.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCodigoSriBancoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCodigoSriBanco.jLabelIdTipoCodigoSriBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocodigosribanco.setcodigo(this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldcodigoTipoCodigoSriBanco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCodigoSriBancoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCodigoSriBanco.jLabelcodigoTipoCodigoSriBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocodigosribanco.setnombre(this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextAreanombreTipoCodigoSriBanco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCodigoSriBancoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCodigoSriBanco.jLabelnombreTipoCodigoSriBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribancoBean,TipoCodigoSriBanco tipocodigosribanco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribancoOrigen,TipoCodigoSriBanco tipocodigosribanco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocodigosribancoOrigen.getId()!=null && !tipocodigosribancoOrigen.getId().equals(0L))) {tipocodigosribanco.setId(tipocodigosribancoOrigen.getId());}}
			if(conDefault || (!conDefault && tipocodigosribancoOrigen.getcodigo()!=null && !tipocodigosribancoOrigen.getcodigo().equals(""))) {tipocodigosribanco.setcodigo(tipocodigosribancoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocodigosribancoOrigen.getnombre()!=null && !tipocodigosribancoOrigen.getnombre().equals(""))) {tipocodigosribanco.setnombre(tipocodigosribancoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribanco) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldidTipoCodigoSriBanco.setText(tipocodigosribanco.getId().toString());
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldcodigoTipoCodigoSriBanco.setText(tipocodigosribanco.getcodigo());
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextAreanombreTipoCodigoSriBanco.setText(tipocodigosribanco.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCodigoSriBanco(TipoCodigoSriBancoBean tipocodigosribancoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldidTipoCodigoSriBanco.setText(tipocodigosribancoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldcodigoTipoCodigoSriBanco.setText(tipocodigosribancoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextAreanombreTipoCodigoSriBanco.setText(tipocodigosribancoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCodigoSriBanco(TipoCodigoSriBancoParameterReturnGeneral tipocodigosribancoReturnGeneral,TipoCodigoSriBancoBean tipocodigosribancoBean,Boolean conDefault) throws Exception { 
		try {
			TipoCodigoSriBanco tipocodigosribancoLocal=new TipoCodigoSriBanco();
			
			tipocodigosribancoLocal=tipocodigosribancoReturnGeneral.getTipoCodigoSriBanco();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocodigosribancoLocal.getId()!=null && !tipocodigosribancoLocal.getId().equals(0L))) {tipocodigosribancoBean.setId(tipocodigosribancoLocal.getId());}}
			if(conDefault || (!conDefault && tipocodigosribancoLocal.getcodigo()!=null && !tipocodigosribancoLocal.getcodigo().equals(""))) {tipocodigosribancoBean.setcodigo(tipocodigosribancoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocodigosribancoLocal.getnombre()!=null && !tipocodigosribancoLocal.getnombre().equals(""))) {tipocodigosribancoBean.setnombre(tipocodigosribancoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCodigoSriBancoGenerico(Long idTipoCodigoSriBancoSeleccionado,JComboBox jComboBoxTipoCodigoSriBanco,List<TipoCodigoSriBanco> tipocodigosribancosLocal)throws Exception {
		try {
			TipoCodigoSriBanco  tipocodigosribancoTemp=null;

			for(TipoCodigoSriBanco tipocodigosribancoAux:tipocodigosribancosLocal) {
				if(tipocodigosribancoAux.getId()!=null && tipocodigosribancoAux.getId().equals(idTipoCodigoSriBancoSeleccionado)) {
					tipocodigosribancoTemp=tipocodigosribancoAux;
					break;
				}
			}

			jComboBoxTipoCodigoSriBanco.setSelectedItem(tipocodigosribancoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCodigoSriBancoGenerico(JComboBox jComboBoxTipoCodigoSriBanco,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCodigoSriBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCodigoSriBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCodigoSriBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCodigoSriBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCodigoSriBanco.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCodigoSriBanco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCodigoSriBanco.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCodigoSriBanco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCodigoSriBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCodigoSriBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocodigosribanco=(TipoCodigoSriBanco) tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocodigosribanco =(TipoCodigoSriBanco) tipocodigosribancos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCodigoSriBanco tipocodigosribancoRow=new TipoCodigoSriBanco();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocodigosribancoRow=(TipoCodigoSriBanco) tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocodigosribancoRow=(TipoCodigoSriBanco) tipocodigosribancos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCodigoSriBanco(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaNuevoTipoCodigoSriBanco && this.isPermisoNuevoTipoCodigoSriBanco));			
			this.jButtonDuplicarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaDuplicarTipoCodigoSriBanco && this.isPermisoDuplicarTipoCodigoSriBanco));			
			this.jButtonCopiarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaCopiarTipoCodigoSriBanco && this.isPermisoCopiarTipoCodigoSriBanco));
			this.jButtonVerFormTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaVerFormTipoCodigoSriBanco && this.isPermisoVerFormTipoCodigoSriBanco));
			
			this.jButtonAbrirOrderByTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaOrdenTipoCodigoSriBanco && this.isPermisoOrdenTipoCodigoSriBanco));			
			
			this.jButtonNuevoRelacionesTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco && this.isPermisoNuevoTipoCodigoSriBanco));			
			this.jButtonNuevoGuardarCambiosTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaNuevoTipoCodigoSriBanco && this.isPermisoNuevoTipoCodigoSriBanco && this.isPermisoGuardarCambiosTipoCodigoSriBanco));
			
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonModificarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaModificarTipoCodigoSriBanco && this.isPermisoActualizarTipoCodigoSriBanco));	
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonActualizarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaActualizarTipoCodigoSriBanco && this.isPermisoActualizarTipoCodigoSriBanco));	
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonEliminarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaEliminarTipoCodigoSriBanco && this.isPermisoEliminarTipoCodigoSriBanco));
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonCancelarTipoCodigoSriBanco.setVisible(this.isVisibilidadCeldaCancelarTipoCodigoSriBanco);							
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonGuardarCambiosTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaGuardarTipoCodigoSriBanco && this.isPermisoGuardarCambiosTipoCodigoSriBanco));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco && this.isPermisoGuardarCambiosTipoCodigoSriBanco));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaNuevoTipoCodigoSriBanco && this.isPermisoNuevoTipoCodigoSriBanco));						
			this.jButtonDuplicarToolBarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaDuplicarTipoCodigoSriBanco && this.isPermisoDuplicarTipoCodigoSriBanco));						
			this.jButtonCopiarToolBarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaCopiarTipoCodigoSriBanco && this.isPermisoCopiarTipoCodigoSriBanco));			
			this.jButtonVerFormToolBarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaVerFormTipoCodigoSriBanco && this.isPermisoVerFormTipoCodigoSriBanco));			
			this.jButtonAbrirOrderByToolBarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaOrdenTipoCodigoSriBanco && this.isPermisoOrdenTipoCodigoSriBanco));
			this.jButtonNuevoRelacionesToolBarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco && this.isPermisoNuevoTipoCodigoSriBanco));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaNuevoTipoCodigoSriBanco && this.isPermisoNuevoTipoCodigoSriBanco && this.isPermisoGuardarCambiosTipoCodigoSriBanco));			
			
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonModificarToolBarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaModificarTipoCodigoSriBanco && this.isPermisoActualizarTipoCodigoSriBanco));	
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonActualizarToolBarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaActualizarTipoCodigoSriBanco  && this.isPermisoActualizarTipoCodigoSriBanco));	
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonEliminarToolBarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaEliminarTipoCodigoSriBanco && this.isPermisoEliminarTipoCodigoSriBanco));
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonCancelarToolBarTipoCodigoSriBanco.setVisible(this.isVisibilidadCeldaCancelarTipoCodigoSriBanco);				
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonGuardarCambiosToolBarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaGuardarTipoCodigoSriBanco && this.isPermisoGuardarCambiosTipoCodigoSriBanco));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco && this.isPermisoGuardarCambiosTipoCodigoSriBanco));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaNuevoTipoCodigoSriBanco && this.isPermisoNuevoTipoCodigoSriBanco));			
			this.jMenuItemDuplicarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaDuplicarTipoCodigoSriBanco && this.isPermisoDuplicarTipoCodigoSriBanco));			
			this.jMenuItemCopiarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaCopiarTipoCodigoSriBanco && this.isPermisoCopiarTipoCodigoSriBanco));			
			this.jMenuItemVerFormTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaVerFormTipoCodigoSriBanco && this.isPermisoVerFormTipoCodigoSriBanco));			
			this.jMenuItemAbrirOrderByTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaOrdenTipoCodigoSriBanco && this.isPermisoOrdenTipoCodigoSriBanco));			
			//this.jMenuItemMostrarOcultarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaOrdenTipoCodigoSriBanco && this.isPermisoOrdenTipoCodigoSriBanco));
			this.jMenuItemDetalleAbrirOrderByTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaOrdenTipoCodigoSriBanco && this.isPermisoOrdenTipoCodigoSriBanco));			
			//this.jMenuItemDetalleMostrarOcultarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaOrdenTipoCodigoSriBanco && this.isPermisoOrdenTipoCodigoSriBanco));			
			this.jMenuItemNuevoRelacionesTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco && this.isPermisoNuevoTipoCodigoSriBanco));			
			this.jMenuItemNuevoGuardarCambiosTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaNuevoTipoCodigoSriBanco && this.isPermisoNuevoTipoCodigoSriBanco && this.isPermisoGuardarCambiosTipoCodigoSriBanco));									
			
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jMenuItemModificarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaModificarTipoCodigoSriBanco && this.isPermisoActualizarTipoCodigoSriBanco));	
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jMenuItemActualizarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaActualizarTipoCodigoSriBanco && this.isPermisoActualizarTipoCodigoSriBanco));	
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jMenuItemEliminarTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaEliminarTipoCodigoSriBanco && this.isPermisoEliminarTipoCodigoSriBanco));
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jMenuItemCancelarTipoCodigoSriBanco.setVisible(this.isVisibilidadCeldaCancelarTipoCodigoSriBanco);				
			}
			
			this.jMenuItemGuardarCambiosTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaGuardarTipoCodigoSriBanco && this.isPermisoGuardarCambiosTipoCodigoSriBanco));						
			this.jMenuItemGuardarCambiosTablaTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco && this.isPermisoGuardarCambiosTipoCodigoSriBanco));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCodigoSriBanco=this.jButtonNuevoTipoCodigoSriBanco.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCodigoSriBanco=this.jButtonDuplicarTipoCodigoSriBanco.isVisible();
			this.isVisibilidadCeldaCopiarTipoCodigoSriBanco=this.jButtonCopiarTipoCodigoSriBanco.isVisible();
			this.isVisibilidadCeldaVerFormTipoCodigoSriBanco=this.jButtonVerFormTipoCodigoSriBanco.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCodigoSriBanco=this.jButtonAbrirOrderByTipoCodigoSriBanco.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco=this.jButtonNuevoRelacionesTipoCodigoSriBanco.isVisible();
			this.isVisibilidadCeldaModificarTipoCodigoSriBanco=this.jButtonModificarTipoCodigoSriBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {
			this.isVisibilidadCeldaActualizarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonActualizarTipoCodigoSriBanco.isVisible();
			this.isVisibilidadCeldaEliminarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonEliminarTipoCodigoSriBanco.isVisible();
			this.isVisibilidadCeldaCancelarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonCancelarTipoCodigoSriBanco.isVisible();
			this.isVisibilidadCeldaGuardarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonGuardarCambiosTipoCodigoSriBanco.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco=this.jButtonGuardarCambiosTablaTipoCodigoSriBanco.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCodigoSriBanco=this.jButtonNuevoToolBarTipoCodigoSriBanco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco=this.jButtonNuevoRelacionesToolBarTipoCodigoSriBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {
			this.isVisibilidadCeldaModificarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonModificarToolBarTipoCodigoSriBanco.isVisible();
			this.isVisibilidadCeldaActualizarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonActualizarToolBarTipoCodigoSriBanco.isVisible();
			this.isVisibilidadCeldaEliminarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonEliminarToolBarTipoCodigoSriBanco.isVisible();
			this.isVisibilidadCeldaCancelarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonCancelarToolBarTipoCodigoSriBanco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCodigoSriBanco=this.jButtonGuardarCambiosToolBarTipoCodigoSriBanco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco=this.jButtonGuardarCambiosTablaToolBarTipoCodigoSriBanco.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCodigoSriBanco=this.jMenuItemNuevoTipoCodigoSriBanco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco=this.jMenuItemNuevoRelacionesTipoCodigoSriBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {
			this.isVisibilidadCeldaModificarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jMenuItemModificarTipoCodigoSriBanco.isVisible();
			this.isVisibilidadCeldaActualizarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jMenuItemActualizarTipoCodigoSriBanco.isVisible();
			this.isVisibilidadCeldaEliminarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jMenuItemEliminarTipoCodigoSriBanco.isVisible();
			this.isVisibilidadCeldaCancelarTipoCodigoSriBanco=this.jInternalFrameDetalleFormTipoCodigoSriBanco.jMenuItemCancelarTipoCodigoSriBanco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCodigoSriBanco=this.jMenuItemGuardarCambiosTipoCodigoSriBanco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco=this.jMenuItemGuardarCambiosTablaTipoCodigoSriBanco.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCodigoSriBanco(Boolean esInicializar) {
		if(TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocodigosribancoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCodigoSriBanco();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCodigoSriBanco(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCodigoSriBanco() {
		this.jButtonNuevoTipoCodigoSriBanco.setVisible(this.isPermisoNuevoTipoCodigoSriBanco);			
		this.jButtonDuplicarTipoCodigoSriBanco.setVisible(this.isPermisoDuplicarTipoCodigoSriBanco);			
		this.jButtonCopiarTipoCodigoSriBanco.setVisible(this.isPermisoCopiarTipoCodigoSriBanco);			
		this.jButtonVerFormTipoCodigoSriBanco.setVisible(this.isPermisoVerFormTipoCodigoSriBanco);			
		
		this.jButtonAbrirOrderByTipoCodigoSriBanco.setVisible(this.isPermisoOrdenTipoCodigoSriBanco);					
		
		this.jButtonNuevoRelacionesTipoCodigoSriBanco.setVisible(this.isPermisoNuevoTipoCodigoSriBanco);			
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonModificarTipoCodigoSriBanco.setVisible(this.isPermisoActualizarTipoCodigoSriBanco);	
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonActualizarTipoCodigoSriBanco.setVisible(this.isPermisoActualizarTipoCodigoSriBanco);	
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonEliminarTipoCodigoSriBanco.setVisible(this.isPermisoEliminarTipoCodigoSriBanco);
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonCancelarTipoCodigoSriBanco.setVisible(this.isVisibilidadCeldaCancelarTipoCodigoSriBanco);						
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonGuardarCambiosTipoCodigoSriBanco.setVisible(this.isPermisoGuardarCambiosTipoCodigoSriBanco);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCodigoSriBanco.setVisible(this.isPermisoActualizarTipoCodigoSriBanco);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCodigoSriBanco() {
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonModificarTipoCodigoSriBanco.setVisible(this.isPermisoActualizarTipoCodigoSriBanco);	
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonActualizarTipoCodigoSriBanco.setVisible(this.isPermisoActualizarTipoCodigoSriBanco);	
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonEliminarTipoCodigoSriBanco.setVisible(this.isPermisoEliminarTipoCodigoSriBanco);
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonCancelarTipoCodigoSriBanco.setVisible(this.isVisibilidadCeldaCancelarTipoCodigoSriBanco);							
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonGuardarCambiosTipoCodigoSriBanco.setVisible((this.isVisibilidadCeldaGuardarTipoCodigoSriBanco && this.isPermisoGuardarCambiosTipoCodigoSriBanco));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCodigoSriBanco() {
		if(TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCodigoSriBanco();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCodigoSriBanco() {
	}
	
	public void jTableDatosTipoCodigoSriBancoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCodigoSriBanco(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCodigoSriBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCodigoSriBanco(this.gettipocodigosribanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoSriBanco(this.tipocodigosribanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocodigosribanco==null) {
						this.tipocodigosribanco = new TipoCodigoSriBanco();
					}

					this.setVariablesFormularioToObjetoActualTipoCodigoSriBanco(this.tipocodigosribanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoSriBanco(this.tipocodigosribanco);
				}

				if(this.tipocodigosribanco.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocodigosribanco.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCodigoSriBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoCodigoSriBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCodigoSriBanco(this.gettipocodigosribanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoSriBanco(this.tipocodigosribanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocodigosribanco==null) {
						this.tipocodigosribanco = new TipoCodigoSriBanco();
					}

					this.setVariablesFormularioToObjetoActualTipoCodigoSriBanco(this.tipocodigosribanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoSriBanco(this.tipocodigosribanco);
				}

				if(this.tipocodigosribanco.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocodigosribanco.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCodigoSriBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoCodigoSriBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCodigoSriBanco(this.gettipocodigosribanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoSriBanco(this.tipocodigosribanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocodigosribanco==null) {
						this.tipocodigosribanco = new TipoCodigoSriBanco();
					}

					this.setVariablesFormularioToObjetoActualTipoCodigoSriBanco(this.tipocodigosribanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoSriBanco(this.tipocodigosribanco);
				}

				if(this.tipocodigosribanco.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocodigosribanco.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCodigoSriBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoCodigoSriBanco() {
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.dispose();
			this.jInternalFrameDetalleFormTipoCodigoSriBanco=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCodigoSriBanco!=null) {
			this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.dispose();
			this.jInternalFrameReporteDinamicoTipoCodigoSriBanco=null;
		}
		
		if(this.jInternalFrameImportacionTipoCodigoSriBanco!=null) {
			this.jInternalFrameImportacionTipoCodigoSriBanco.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCodigoSriBanco.dispose();
			this.jInternalFrameImportacionTipoCodigoSriBanco=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCodigoSriBanco();
			
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCodigoSriBanco")) {
				jButtonNuevoTipoCodigoSriBancoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCodigoSriBanco")) {
				jButtonDuplicarTipoCodigoSriBancoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCodigoSriBanco")) {
				jButtonCopiarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCodigoSriBanco")) {
				jButtonVerFormTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCodigoSriBanco")) {
				jButtonNuevoTipoCodigoSriBancoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCodigoSriBanco")) {
				jButtonDuplicarTipoCodigoSriBancoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCodigoSriBanco")) {
				jButtonNuevoTipoCodigoSriBancoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCodigoSriBanco")) {
				jButtonDuplicarTipoCodigoSriBancoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCodigoSriBanco")) {
				jButtonNuevoTipoCodigoSriBancoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCodigoSriBanco")) {
				jButtonNuevoTipoCodigoSriBancoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCodigoSriBanco")) {
				jButtonNuevoTipoCodigoSriBancoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCodigoSriBanco")) {
				jButtonModificarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCodigoSriBanco")) {
				jButtonModificarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCodigoSriBanco")) {
				jButtonModificarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCodigoSriBanco")) {
				jButtonActualizarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCodigoSriBanco")) {
				jButtonActualizarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCodigoSriBanco")) {
				jButtonActualizarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCodigoSriBanco")) {
				jButtonEliminarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCodigoSriBanco")) {
				jButtonEliminarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCodigoSriBanco")) {
				jButtonEliminarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCodigoSriBanco")) {
				jButtonCancelarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCodigoSriBanco")) {
				jButtonCancelarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCodigoSriBanco")) {
				jButtonCancelarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCodigoSriBanco")) {
				jButtonCerrarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCodigoSriBanco")) {
				jButtonCerrarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCodigoSriBanco")) {
				jButtonCerrarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCodigoSriBanco")) {
				jButtonMostrarOcultarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCodigoSriBanco")) {
				jButtonCancelarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCodigoSriBanco")) {
				jButtonGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCodigoSriBanco")) {
				jButtonGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCodigoSriBanco")) {
				jButtonCopiarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCodigoSriBanco")) {
				jButtonVerFormTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCodigoSriBanco")) {
				jButtonGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCodigoSriBanco")) {
				jButtonCopiarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCodigoSriBanco")) {
				jButtonVerFormTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCodigoSriBanco")) {
				jButtonGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCodigoSriBanco")) {
				jButtonGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCodigoSriBanco")) {
				jButtonGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCodigoSriBanco")) {
				jButtonRecargarInformacionTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCodigoSriBanco")) {
				jButtonRecargarInformacionTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCodigoSriBanco")) {
				jButtonRecargarInformacionTipoCodigoSriBancoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCodigoSriBanco")) {
				jButtonAnterioresTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCodigoSriBanco")) {
				jButtonAnterioresTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCodigoSriBanco")) {
				jButtonAnterioresTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCodigoSriBanco")) {
				jButtonSiguientesTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCodigoSriBanco")) {
				jButtonSiguientesTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCodigoSriBanco")) {
				jButtonSiguientesTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCodigoSriBanco") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCodigoSriBanco")) {
				jButtonAbrirOrderByTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCodigoSriBanco") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCodigoSriBanco")) {
				jButtonMostrarOcultarTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCodigoSriBanco")) {
				jButtonNuevoGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCodigoSriBanco")) {
				jButtonNuevoGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCodigoSriBanco")) {
				jButtonNuevoGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCodigoSriBanco")) {
				jButtonCerrarReporteDinamicoTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCodigoSriBanco")) {
				jButtonGenerarReporteDinamicoTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCodigoSriBanco")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCodigoSriBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCodigoSriBanco")) {
				jButtonCerrarImportacionTipoCodigoSriBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCodigoSriBanco")) {
				
				jButtonGenerarImportacionTipoCodigoSriBancoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCodigoSriBanco")) {
				
				jButtonAbrirImportacionTipoCodigoSriBancoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCodigoSriBanco")) {
				jComboBoxTiposAccionesTipoCodigoSriBancoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCodigoSriBanco")) {
				jComboBoxTiposRelacionesTipoCodigoSriBancoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCodigoSriBanco")) {
				jComboBoxTiposAccionesTipoCodigoSriBancoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCodigoSriBanco")) {
				
				jComboBoxTiposSeleccionarTipoCodigoSriBancoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCodigoSriBanco")) {
				jTextFieldValorCampoGeneralTipoCodigoSriBancoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCodigoSriBanco")) {
				jButtonAbrirOrderByTipoCodigoSriBancoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCodigoSriBanco")) {
				jButtonAbrirOrderByTipoCodigoSriBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCodigoSriBanco")) {
				jButtonCerrarOrderByTipoCodigoSriBancoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCodigoSriBancoBusqueda")) {
				this.jButtonidTipoCodigoSriBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCodigoSriBancoBusqueda")) {
				this.jButtoncodigoTipoCodigoSriBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCodigoSriBancoBusqueda")) {
				this.jButtonnombreTipoCodigoSriBancoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCodigoSriBanco();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCodigoSriBancoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigosribanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigosribanco);
				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
				
				


				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoSriBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoSriBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCodigoSriBanco tipocodigosribancoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocodigosribancoLocal=this.tipocodigosribanco;
			} else {
				tipocodigosribancoLocal=this.tipocodigosribancoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigosribanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigosribanco);
				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
							
				
				


				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoSriBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoSriBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCodigoSriBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribancoAnterior =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocodigosribancoAnterior =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
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
			
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
			
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
			
			


			
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCodigoSriBancoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigosribanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigosribanco);
				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
								
						
				


				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoSriBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoSriBanco.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigosribanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigosribanco);
				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
								
				
				


				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoSriBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoSriBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCodigoSriBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribancoAnterior =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocodigosribancoAnterior =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigosribanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigosribanco);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCodigoSriBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribancoAnterior =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocodigosribancoAnterior =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCodigoSriBancoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigosribanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocodigosribanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigosribanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigosribanco);
				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
							
				
				


				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoSriBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoSriBanco.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCodigoSriBancoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocodigosribancoAnterior =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocodigosribancoAnterior =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
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
			
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
			
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
			
			


			
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCodigoSriBancoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigosribanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocodigosribanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigosribanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigosribanco);
				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
								
				
				


				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoSriBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoSriBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCodigoSriBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribancoAnterior =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocodigosribancoAnterior =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCodigoSriBancoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigosribanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocodigosribanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCodigoSriBancoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigosribanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigosribanco);
				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCodigoSriBanco")) {
					jCheckBoxSeleccionarTodosTipoCodigoSriBancoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCodigoSriBanco")) {
					jCheckBoxSeleccionadosTipoCodigoSriBancoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCodigoSriBanco")) {
					
				}
				
				


				
				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoSriBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoSriBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigosribanco);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocodigosribanco);
				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
												
				
				


				
				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoSriBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoSriBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCodigoSriBancoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocodigosribancoAnterior =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocodigosribancoAnterior =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCodigoSriBancoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigosribanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigosribanco);
				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
				
				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
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
			
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
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
			
			


			
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCodigoSriBancoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigosribanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigosribanco);
				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoSriBanco.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoSriBanco.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigosribanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigosribanco);
				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
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
				
				


				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoSriBanco.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoSriBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCodigoSriBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigosribancoAnterior =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocodigosribancoAnterior =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCodigoSriBanco")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCodigoSriBancoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCodigoSriBanco.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocodigosribanco =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocodigosribanco);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCodigoSriBanco")) {
				
				}
				
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCodigoSriBanco")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCodigoSriBanco.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCodigoSriBanco")) {
			
			}
			
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCodigoSriBanco();
			
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCodigoSriBanco")) {
				jButtonNuevoTipoCodigoSriBancoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCodigoSriBanco")) {
				jButtonDuplicarTipoCodigoSriBancoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCodigoSriBanco")) {
				jButtonCopiarTipoCodigoSriBancoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCodigoSriBanco")) {
				jButtonVerFormTipoCodigoSriBancoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCodigoSriBanco")) {
				jButtonNuevoTipoCodigoSriBancoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCodigoSriBanco")) {
				jButtonModificarTipoCodigoSriBancoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCodigoSriBanco")) {
				jButtonActualizarTipoCodigoSriBancoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCodigoSriBanco")) {
				jButtonEliminarTipoCodigoSriBancoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCodigoSriBanco")) {
				jButtonGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCodigoSriBanco")) {
				jButtonCancelarTipoCodigoSriBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCodigoSriBanco")) {
				jButtonCerrarTipoCodigoSriBancoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCodigoSriBanco")) {
				jButtonGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCodigoSriBanco")) {
				jButtonNuevoGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCodigoSriBanco")) {
				jButtonAbrirOrderByTipoCodigoSriBancoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCodigoSriBanco")) {
				jButtonRecargarInformacionTipoCodigoSriBancoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCodigoSriBanco")) {
				jButtonAnterioresTipoCodigoSriBancoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCodigoSriBanco")) {
				jButtonSiguientesTipoCodigoSriBancoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCodigoSriBancoBusqueda")) {
				this.jButtonidTipoCodigoSriBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCodigoSriBancoBusqueda")) {
				this.jButtoncodigoTipoCodigoSriBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCodigoSriBancoBusqueda")) {
				this.jButtonnombreTipoCodigoSriBancoBusquedaActionPerformed(evt);
			}
			
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCodigoSriBanco();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCodigoSriBanco")) {
				closingInternalFrameTipoCodigoSriBanco();
				
			} else if(sTipo.equals("jButtonCancelarTipoCodigoSriBanco")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCodigoSriBanco = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCodigoSriBancoBeanSwingJInternalFrame jInternalFrameParent=(TipoCodigoSriBancoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCodigoSriBanco.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCodigoSriBancoActionPerformed(null);
			}
			
			TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocodigosribanco,new Object(),this.tipocodigosribancoParameterGeneral,this.tipocodigosribancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCodigoSriBanco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCodigoSriBanco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCodigoSriBanco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocodigosribanco)) {
			if(!esControlTabla) {
				if(TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCodigoSriBanco(this.tipocodigosribanco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoSriBanco(this.tipocodigosribanco);			
				}
				
				if(this.tipocodigosribancoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCodigoSriBanco(this.tipocodigosribanco,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocodigosribancoReturnGeneral=tipocodigosribancoLogic.procesarEventosTipoCodigoSriBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocodigosribancoLogic.getTipoCodigoSriBancos(),this.tipocodigosribanco,this.tipocodigosribancoParameterGeneral,this.isEsNuevoTipoCodigoSriBanco,classes);//this.tipocodigosribancoLogic.getTipoCodigoSriBanco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCodigoSriBanco(this.tipocodigosribancoReturnGeneral,this.tipocodigosribancoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocodigosribancoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCodigoSriBanco(classes,this.tipocodigosribancoReturnGeneral,this.tipocodigosribancoBean,false);
					}
						
					if(this.tipocodigosribancoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCodigoSriBanco(this.tipocodigosribancoReturnGeneral.getTipoCodigoSriBanco());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCodigoSriBanco(this.tipocodigosribancoReturnGeneral.getTipoCodigoSriBanco());	
					}
						
					if(this.tipocodigosribancoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCodigoSriBanco(this.tipocodigosribancoReturnGeneral.getTipoCodigoSriBanco(),classes);//this.tipocodigosribancoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCodigoSriBanco(this.tipocodigosribanco,classes);//this.tipocodigosribancoBean);									
				}
			
				if(TipoCodigoSriBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCodigoSriBanco(this.tipocodigosribanco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoSriBanco(this.tipocodigosribanco);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocodigosribancoAnterior!=null) {
						this.tipocodigosribanco=this.tipocodigosribancoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocodigosribancoReturnGeneral=tipocodigosribancoLogic.procesarEventosTipoCodigoSriBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocodigosribancoLogic.getTipoCodigoSriBancos(),this.tipocodigosribanco,this.tipocodigosribancoParameterGeneral,this.isEsNuevoTipoCodigoSriBanco,classes);//this.tipocodigosribancoLogic.getTipoCodigoSriBanco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocodigosribancoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocodigosribancoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocodigosribancoReturnGeneral.getTipoCodigoSriBanco(),tipocodigosribancoLogic.getTipoCodigoSriBancos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocodigosribancoReturnGeneral.getTipoCodigoSriBanco(),this.tipocodigosribancos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCodigoSriBanco.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCodigoSriBanco.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCodigoSriBanco();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCodigoSriBanco() throws Exception {
		
		TipoCodigoSriBancoModel tipocodigosribancoModel=(TipoCodigoSriBancoModel)this.jTableDatosTipoCodigoSriBanco.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocodigosribancoModel.tipocodigosribancos=this.tipocodigosribancoLogic.getTipoCodigoSriBancos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocodigosribancoModel.tipocodigosribancos=this.tipocodigosribancos;
		}
		
		
		((TipoCodigoSriBancoModel) this.jTableDatosTipoCodigoSriBanco.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCodigoSriBanco() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocodigosribancoAnterior(),this.tipocodigosribancoLogic.getTipoCodigoSriBancos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocodigosribancoAnterior(),this.tipocodigosribancos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCodigoSriBanco();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribanco,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
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
										
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocodigosribanco,new Object(),generalEntityParameterGeneral,this.tipocodigosribancoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocodigosribancoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCodigoSriBancoConstantesFunciones.getClassesRelationshipsOfTipoCodigoSriBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCodigoSriBancoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCodigoSriBanco(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCodigoSriBanco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocodigosribanco,new Object(),generalEntityParameterGeneral,this.tipocodigosribancoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCodigoSriBanco(TipoCodigoSriBancoBean tipocodigosribancoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCodigoSriBanco(ArrayList<Classe> classes,TipoCodigoSriBancoReturnGeneral tipocodigosribancoReturnGeneral,TipoCodigoSriBancoBean tipocodigosribancoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribanco,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipocodigosribanco)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco = new TipoCodigoSriBancoDetalleFormJInternalFrame(jDesktopPane,this.tipocodigosribancoSessionBean.getConGuardarRelaciones(),this.tipocodigosribancoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCodigoSriBanco);
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.setVisible(false);
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.tipocodigosribancoLogic=this.tipocodigosribancoLogic;
		
		this.cargarCombosFrameForeignKeyTipoCodigoSriBanco("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCodigoSriBanco();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCodigoSriBanco();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCodigoSriBanco("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCodigoSriBanco();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCodigoSriBanco"));
		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonModificarTipoCodigoSriBanco.addActionListener(new ButtonActionListener(this,"ModificarTipoCodigoSriBanco"));

		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonModificarToolBarTipoCodigoSriBanco.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCodigoSriBanco"));
					
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jMenuItemModificarTipoCodigoSriBanco.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCodigoSriBanco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonActualizarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"ActualizarTipoCodigoSriBanco"));
		
		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonActualizarToolBarTipoCodigoSriBanco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCodigoSriBanco"));
						
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jMenuItemActualizarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCodigoSriBanco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonEliminarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"EliminarTipoCodigoSriBanco"));
		
		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonEliminarToolBarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCodigoSriBanco"));
								
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jMenuItemEliminarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCodigoSriBanco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonCancelarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"CancelarTipoCodigoSriBanco"));
		
		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonCancelarToolBarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCodigoSriBanco"));
					
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jMenuItemCancelarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCodigoSriBanco"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jMenuItemDetalleCerrarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCodigoSriBanco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonGuardarCambiosToolBarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCodigoSriBanco"));
		
		
		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonGuardarCambiosToolBarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCodigoSriBanco"));
		
		
		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCodigoSriBanco"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonidTipoCodigoSriBancoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCodigoSriBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtoncodigoTipoCodigoSriBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCodigoSriBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonnombreTipoCodigoSriBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCodigoSriBancoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTabbedPaneRelacionesTipoCodigoSriBanco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCodigoSriBanco"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCodigoSriBanco"));
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCodigoSriBanco"));
		}
		
		this.jTableDatosTipoCodigoSriBanco.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCodigoSriBanco"));
		
		this.jTableDatosTipoCodigoSriBanco.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCodigoSriBanco"));
		
		this.jButtonNuevoTipoCodigoSriBanco.addActionListener(new ButtonActionListener(this,"NuevoTipoCodigoSriBanco"));
		
		this.jButtonDuplicarTipoCodigoSriBanco.addActionListener(new ButtonActionListener(this,"DuplicarTipoCodigoSriBanco"));
		
		this.jButtonCopiarTipoCodigoSriBanco.addActionListener(new ButtonActionListener(this,"CopiarTipoCodigoSriBanco"));
		
		this.jButtonVerFormTipoCodigoSriBanco.addActionListener(new ButtonActionListener(this,"VerFormTipoCodigoSriBanco"));
		
		
		this.jButtonNuevoToolBarTipoCodigoSriBanco.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCodigoSriBanco"));
			
		this.jButtonDuplicarToolBarTipoCodigoSriBanco.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCodigoSriBanco"));
			
		this.jMenuItemNuevoTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCodigoSriBanco"));
			
		this.jMenuItemDuplicarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCodigoSriBanco"));		
		
		
		this.jButtonNuevoRelacionesTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCodigoSriBanco"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCodigoSriBanco.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCodigoSriBanco"));
			
		this.jMenuItemNuevoRelacionesTipoCodigoSriBanco.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCodigoSriBanco"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonModificarTipoCodigoSriBanco.addActionListener(new ButtonActionListener(this,"ModificarTipoCodigoSriBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonModificarToolBarTipoCodigoSriBanco.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCodigoSriBanco"));
			
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jMenuItemModificarTipoCodigoSriBanco.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCodigoSriBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonActualizarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"ActualizarTipoCodigoSriBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonActualizarToolBarTipoCodigoSriBanco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCodigoSriBanco"));
				
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jMenuItemActualizarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCodigoSriBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonEliminarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"EliminarTipoCodigoSriBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonEliminarToolBarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCodigoSriBanco"));
						
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jMenuItemEliminarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCodigoSriBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonCancelarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"CancelarTipoCodigoSriBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonCancelarToolBarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCodigoSriBanco"));
			
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jMenuItemCancelarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCodigoSriBanco"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCodigoSriBanco"));		
		
		
		this.jButtonCerrarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"CerrarTipoCodigoSriBanco"));
		
		
		this.jButtonCerrarToolBarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCodigoSriBanco"));
			
		this.jMenuItemCerrarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCodigoSriBanco"));
			
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jMenuItemDetalleCerrarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCodigoSriBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonGuardarCambiosTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCodigoSriBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonGuardarCambiosToolBarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCodigoSriBanco"));
		}
		
		this.jButtonCopiarToolBarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCodigoSriBanco"));
			
		this.jButtonVerFormToolBarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCodigoSriBanco"));
		
		this.jMenuItemGuardarCambiosTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCodigoSriBanco"));
			
		this.jMenuItemCopiarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCodigoSriBanco"));		
		
		this.jMenuItemVerFormTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCodigoSriBanco"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCodigoSriBanco"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCodigoSriBanco"));
			
		this.jMenuItemGuardarCambiosTablaTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCodigoSriBanco"));		
		
		
		
		this.jButtonRecargarInformacionTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCodigoSriBanco"));
					
		this.jButtonRecargarInformacionToolBarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCodigoSriBanco"));
		
		this.jMenuItemRecargarInformacionTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCodigoSriBanco"));		
		
		
		
		this.jButtonAnterioresTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"AnterioresTipoCodigoSriBanco"));
		
		
		this.jButtonAnterioresToolBarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCodigoSriBanco"));
		
		this.jMenuItemAnterioresTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCodigoSriBanco"));		
		
		
		this.jButtonSiguientesTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"SiguientesTipoCodigoSriBanco"));
		
		
		this.jButtonSiguientesToolBarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCodigoSriBanco"));
			
		this.jMenuItemSiguientesTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCodigoSriBanco"));
			
		this.jMenuItemAbrirOrderByTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCodigoSriBanco"));
			
		this.jMenuItemMostrarOcultarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCodigoSriBanco"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCodigoSriBanco"));
			
		this.jMenuItemDetalleMostarOcultarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCodigoSriBanco"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCodigoSriBanco"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCodigoSriBanco"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCodigoSriBanco"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCodigoSriBanco.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCodigoSriBanco"));

		this.jCheckBoxSeleccionadosTipoCodigoSriBanco.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCodigoSriBanco"));
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCodigoSriBanco"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCodigoSriBanco"));
			
		this.jComboBoxTiposAccionesTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCodigoSriBanco"));
					
		this.jComboBoxTiposSeleccionarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCodigoSriBanco"));
			
		this.jTextFieldValorCampoGeneralTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCodigoSriBanco"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonidTipoCodigoSriBancoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCodigoSriBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtoncodigoTipoCodigoSriBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCodigoSriBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonnombreTipoCodigoSriBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCodigoSriBancoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCodigoSriBanco!=null) {
				this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCodigoSriBanco"));
				this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCodigoSriBanco"));
				this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCodigoSriBanco"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCodigoSriBanco"));				
			//this.jButtonGenerarReporteDinamicoTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCodigoSriBanco"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCodigoSriBanco"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCodigoSriBanco!=null) {
				this.jInternalFrameImportacionTipoCodigoSriBanco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCodigoSriBanco"));
				this.jInternalFrameImportacionTipoCodigoSriBanco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCodigoSriBanco"));
				this.jInternalFrameImportacionTipoCodigoSriBanco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCodigoSriBanco"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCodigoSriBanco"));
			
			this.jButtonAbrirOrderByToolBarTipoCodigoSriBanco.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCodigoSriBanco"));			
			
			if(this.jInternalFrameOrderByTipoCodigoSriBanco!=null) {
				this.jInternalFrameOrderByTipoCodigoSriBanco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCodigoSriBanco"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTabbedPaneRelacionesTipoCodigoSriBanco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCodigoSriBanco"));
		
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
            		closingInternalFrameTipoCodigoSriBanco();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCodigoSriBanco = (JInternalFrameBase)event.getSource();
	            	
	            TipoCodigoSriBancoBeanSwingJInternalFrame jInternalFrameParent=(TipoCodigoSriBancoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCodigoSriBanco.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCodigoSriBancoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCodigoSriBanco.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCodigoSriBancoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCodigoSriBanco.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCodigoSriBanco.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCodigoSriBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCodigoSriBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCodigoSriBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCodigoSriBanco";
		inputMap = this.jButtonNuevoTipoCodigoSriBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCodigoSriBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCodigoSriBancoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCodigoSriBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCodigoSriBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCodigoSriBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCodigoSriBanco";
		inputMap = this.jButtonNuevoRelacionesTipoCodigoSriBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCodigoSriBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCodigoSriBancoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCodigoSriBanco";
		inputMap = this.jButtonModificarTipoCodigoSriBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCodigoSriBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCodigoSriBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCodigoSriBanco";
		inputMap = this.jButtonActualizarTipoCodigoSriBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCodigoSriBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCodigoSriBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCodigoSriBanco";
		inputMap = this.jButtonEliminarTipoCodigoSriBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCodigoSriBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCodigoSriBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCodigoSriBanco";
		inputMap = this.jButtonCancelarTipoCodigoSriBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCodigoSriBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCodigoSriBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCodigoSriBanco";
		inputMap = this.jButtonCerrarTipoCodigoSriBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCodigoSriBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCodigoSriBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonGuardarCambiosTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCodigoSriBanco";
		inputMap = this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonGuardarCambiosTipoCodigoSriBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonGuardarCambiosTipoCodigoSriBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCodigoSriBanco.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCodigoSriBancoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCodigoSriBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCodigoSriBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCodigoSriBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCodigoSriBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCodigoSriBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCodigoSriBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonidTipoCodigoSriBancoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCodigoSriBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtoncodigoTipoCodigoSriBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCodigoSriBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jButtonnombreTipoCodigoSriBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCodigoSriBancoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCodigoSriBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCodigoSriBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCodigoSriBancoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCodigoSriBanco.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCodigoSriBanco(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCodigoSriBanco tipocodigosribancoAux:this.tipocodigosribancoLogic.getTipoCodigoSriBancos()) {
					tipocodigosribancoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCodigoSriBanco tipocodigosribancoAux:tipocodigosribancos) {
					tipocodigosribancoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCodigoSriBancoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCodigoSriBanco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCodigoSriBanco tipocodigosribancoAux:this.tipocodigosribancoLogic.getTipoCodigoSriBancos()) {
						tipocodigosribancoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCodigoSriBanco tipocodigosribancoAux:tipocodigosribancos) {
						tipocodigosribancoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCodigoSriBanco tipocodigosribancoAux:this.tipocodigosribancoLogic.getTipoCodigoSriBancos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCodigoSriBanco tipocodigosribancoAux:tipocodigosribancos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCodigoSriBanco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCodigoSriBanco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCodigoSriBanco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCodigoSriBanco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCodigoSriBancoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCodigoSriBanco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCodigoSriBanco.getSelectedRows();
			
			TipoCodigoSriBanco tipocodigosribancoLocal=new TipoCodigoSriBanco();
			
			//this.seleccionarTodosTipoCodigoSriBanco(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocodigosribancoLocal =(TipoCodigoSriBanco) this.tipocodigosribancoLogic.getTipoCodigoSriBancos().toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocodigosribancoLocal =(TipoCodigoSriBanco) this.tipocodigosribancos.toArray()[this.jTableDatosTipoCodigoSriBanco.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocodigosribancoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCodigoSriBanco tipocodigosribancoAux:this.tipocodigosribancoLogic.getTipoCodigoSriBancos()) {
						tipocodigosribancoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCodigoSriBanco tipocodigosribancoAux:tipocodigosribancos) {
						tipocodigosribancoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCodigoSriBanco(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCodigoSriBanco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCodigoSriBanco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCodigoSriBanco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCodigoSriBancoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCodigoSriBancoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCodigoSriBancoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCodigoSriBanco(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCodigoSriBanco.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCodigoSriBanco tipocodigosribancoAux:this.tipocodigosribancoLogic.getTipoCodigoSriBancos()) {
				
						if(sTipoSeleccionar.equals(TipoCodigoSriBancoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocodigosribancoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCodigoSriBancoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocodigosribancoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCodigoSriBanco tipocodigosribancoAux:tipocodigosribancos) {
					
						if(sTipoSeleccionar.equals(TipoCodigoSriBancoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocodigosribancoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCodigoSriBancoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocodigosribancoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCodigoSriBanco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCodigoSriBancoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCodigoSriBanco(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCodigoSriBanco=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCodigoSriBanco.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCodigoSriBanco.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCodigoSriBanco) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCodigoSriBanco(conSplash);
				
					this.generarReporteTipoCodigoSriBancosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCodigoSriBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCodigoSriBanco.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCodigoSriBancosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCodigoSriBanco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCodigoSriBancosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCodigoSriBanco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCodigoSriBancosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCodigoSriBanco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCodigoSriBanco();
				
				this.exportarTipoCodigoSriBancosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCodigoSriBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCodigoSriBanco.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCodigoSriBancos();
				//this.importarTipoCodigoSriBancos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCodigoSriBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCodigoSriBanco.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCodigoSriBanco();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCodigoSriBancosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCodigoSriBanco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE A", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCodigoSriBanco();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCodigoSriBanco)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCodigoSriBanco(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE A",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCodigoSriBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCodigoSriBanco.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoCodigoSriBancoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoCodigoSriBanco) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoCodigoSriBanco(conSplash);
					
						//this.actualizarParametrosGeneralTipoCodigoSriBanco();
						
						this.generarReporteProcesoAccionTipoCodigoSriBancosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoCodigoSriBanco.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoCodigoSriBanco.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO AS SELECCIONADOS?", "MANTENIMIENTO DE A", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoCodigoSriBanco();
				
						this.actualizarParametrosGeneralTipoCodigoSriBanco();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipocodigosribancoReturnGeneral=tipocodigosribancoLogic.procesarAccionTipoCodigoSriBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipocodigosribancoLogic.getTipoCodigoSriBancos(),this.tipocodigosribancoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoCodigoSriBancoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCodigoSriBanco.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCodigoSriBanco.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCodigoSriBanco();
					
					TipoCodigoSriBancoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoCodigoSriBancoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCodigoSriBanco.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCodigoSriBanco.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCodigoSriBanco(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCodigoSriBancoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCodigoSriBanco();
			
			if(this.jInternalFrameDetalleFormTipoCodigoSriBanco==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCodigoSriBanco> tipocodigosribancosSeleccionados=new ArrayList<TipoCodigoSriBanco>();		
			TipoCodigoSriBanco tipocodigosribanco=new TipoCodigoSriBanco();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCodigoSriBanco(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCodigoSriBanco.getSelectedItem();
			
			
			
			
			tipocodigosribancosSeleccionados=this.getTipoCodigoSriBancosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocodigosribancosSeleccionados.size()==1) {
				for(TipoCodigoSriBanco tipocodigosribancoAux:tipocodigosribancosSeleccionados) {
					tipocodigosribanco=tipocodigosribancoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCodigoSriBanco();
			
      		//this.finishProcessTipoCodigoSriBanco(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCodigoSriBancoReturnGeneral() throws Exception {
		if(this.tipocodigosribancoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocodigosribancoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocodigosribancoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocodigosribancoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocodigosribancoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocodigosribancoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCodigoSriBanco(false);
		}
		
		if(this.tipocodigosribancoReturnGeneral.getConRetornoLista() || this.tipocodigosribancoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocodigosribancoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocodigosribancoLogic.setTipoCodigoSriBancos(this.tipocodigosribancoReturnGeneral.getTipoCodigoSriBancos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocodigosribancoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocodigosribancoLogic.setTipoCodigoSriBanco(this.tipocodigosribancoReturnGeneral.getTipoCodigoSriBanco());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCodigoSriBanco(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCodigoSriBanco() throws Exception {
		
		
	}
	
	public ArrayList<TipoCodigoSriBanco> getTipoCodigoSriBancosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCodigoSriBanco> tipocodigosribancosSeleccionados=new ArrayList<TipoCodigoSriBanco>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCodigoSriBanco) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCodigoSriBanco tipocodigosribancoAux:tipocodigosribancoLogic.getTipoCodigoSriBancos()) {
					if(tipocodigosribancoAux.getIsSelected()) {
						tipocodigosribancosSeleccionados.add(tipocodigosribancoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCodigoSriBanco tipocodigosribancoAux:this.tipocodigosribancos) {
					if(tipocodigosribancoAux.getIsSelected()) {
						tipocodigosribancosSeleccionados.add(tipocodigosribancoAux);				
					}
				}
			}
			
			if(tipocodigosribancosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocodigosribancosSeleccionados.addAll(this.tipocodigosribancoLogic.getTipoCodigoSriBancos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocodigosribancosSeleccionados.addAll(this.tipocodigosribancos);				
					}
				}
			}
		} else {
			tipocodigosribancosSeleccionados.add(this.tipocodigosribanco);
		}
		
		return tipocodigosribancosSeleccionados;
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
	
	public void generarReporteTipoCodigoSriBancosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCodigoSriBancosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCodigoSriBancosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCodigoSriBancosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCodigoSriBancosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE A",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCodigoSriBancosSeleccionados() throws Exception {
		ArrayList<TipoCodigoSriBanco> tipocodigosribancosSeleccionados=new ArrayList<TipoCodigoSriBanco>();		
		
		tipocodigosribancosSeleccionados=this.getTipoCodigoSriBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCodigoSriBancos("Todos",tipocodigosribancosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCodigoSriBancosSeleccionados() throws Exception {
		ArrayList<TipoCodigoSriBanco> tipocodigosribancosSeleccionados=new ArrayList<TipoCodigoSriBanco>();		
		
		tipocodigosribancosSeleccionados=this.getTipoCodigoSriBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCodigoSriBancos("Todos",tipocodigosribancosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCodigoSriBancosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCodigoSriBanco> tipocodigosribancosSeleccionados=new ArrayList<TipoCodigoSriBanco>();
		
		tipocodigosribancosSeleccionados=this.getTipoCodigoSriBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCodigoSriBancos("Todos",tipocodigosribancosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCodigoSriBancosSeleccionados() throws Exception {
		ArrayList<TipoCodigoSriBanco> tipocodigosribancosSeleccionados=new ArrayList<TipoCodigoSriBanco>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCodigoSriBanco();
		
		
		tipocodigosribancosSeleccionados=this.getTipoCodigoSriBancosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCodigoSriBanco();
		
		
		//this.generarReporteTipoCodigoSriBancos("Todos",tipocodigosribancosSeleccionados ,tipocodigosribancoImplementable,tipocodigosribancoImplementableHome);
	}
	
	public void mostrarImportacionTipoCodigoSriBancos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCodigoSriBanco();
		
		this.abrirFrameImportacionTipoCodigoSriBanco();		
		
			
		//this.generarReporteTipoCodigoSriBancos("Todos",tipocodigosribancosSeleccionados ,tipocodigosribancoImplementable,tipocodigosribancoImplementableHome);
	}
	
	public void importarTipoCodigoSriBancos() throws Exception {		
	
	}
	
	public void exportarTipoCodigoSriBancosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCodigoSriBancosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCodigoSriBancosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCodigoSriBancosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE A",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCodigoSriBancosSeleccionados() throws Exception {
		ArrayList<TipoCodigoSriBanco> tipocodigosribancosSeleccionados=new ArrayList<TipoCodigoSriBanco>();		
		
		tipocodigosribancosSeleccionados=this.getTipoCodigoSriBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocodigosribanco."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCodigoSriBanco(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCodigoSriBanco tipocodigosribancoAux:tipocodigosribancosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCodigoSriBanco(tipocodigosribancoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocodigosribancoAux.setsDetalleGeneralEntityReporte(tipocodigosribancoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE A",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCodigoSriBanco(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCodigoSriBancoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCodigoSriBancoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCodigoSriBancoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCodigoSriBancoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribanco,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocodigosribanco.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocodigosribanco.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocodigosribanco.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocodigosribanco.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCodigoSriBancosSeleccionados() throws Exception {
		ArrayList<TipoCodigoSriBanco> tipocodigosribancosSeleccionados=new ArrayList<TipoCodigoSriBanco>();		
		
		tipocodigosribancosSeleccionados=this.getTipoCodigoSriBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocodigosribanco.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCodigoSriBancos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCodigoSriBanco(row);				
				iRow++;
			}				
			
			for(TipoCodigoSriBanco tipocodigosribancoAux:tipocodigosribancosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCodigoSriBanco(tipocodigosribancoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE A",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCodigoSriBancosSeleccionados() throws Exception {
		ArrayList<TipoCodigoSriBanco> tipocodigosribancosSeleccionados=new ArrayList<TipoCodigoSriBanco>();		
		
		tipocodigosribancosSeleccionados=this.getTipoCodigoSriBancosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocodigosribanco.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocodigosribancos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocodigosribanco");
			//elementRoot.appendChild(element);
		
			for(TipoCodigoSriBanco tipocodigosribancoAux:tipocodigosribancosSeleccionados) {
				element = document.createElement("tipocodigosribanco");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCodigoSriBanco(tipocodigosribancoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE A",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCodigoSriBanco(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCodigoSriBancoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCodigoSriBancoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCodigoSriBancoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCodigoSriBancoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribanco,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocodigosribanco.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocodigosribanco.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocodigosribanco.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoCodigoSriBanco(TipoCodigoSriBanco tipocodigosribanco,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCodigoSriBancoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocodigosribanco.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCodigoSriBancoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocodigosribanco.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoCodigoSriBancoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocodigosribanco.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoCodigoSriBancoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocodigosribanco.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoCodigoSriBancosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCodigoSriBanco> tipocodigosribancosSeleccionados=new ArrayList<TipoCodigoSriBanco>();
		
		tipocodigosribancosSeleccionados=this.getTipoCodigoSriBancosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCodigoSriBanco(tipocodigosribancosSeleccionados);
		
		this.generarReporteTipoCodigoSriBancos("Todos",tipocodigosribancosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCodigoSriBanco(ArrayList<TipoCodigoSriBanco> tipocodigosribancosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCodigoSriBanco tipocodigosribancoAux:tipocodigosribancosSeleccionados) {
				tipocodigosribancoAux.setsDetalleGeneralEntityReporte(tipocodigosribancoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCodigoSriBancoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocodigosribancoAux.setsDescripcionGeneralEntityReporte1(tipocodigosribancoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoCodigoSriBancoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocodigosribancoAux.setsDescripcionGeneralEntityReporte1(tipocodigosribancoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoSriBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCodigoSriBanco(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCodigoSriBanco=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaActualizarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaEliminarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaCancelarTipoCodigoSriBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCodigoSriBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCodigoSriBanco=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaModificarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaActualizarTipoCodigoSriBanco=true;
			this.isVisibilidadCeldaEliminarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaCancelarTipoCodigoSriBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCodigoSriBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCodigoSriBanco=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaModificarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaActualizarTipoCodigoSriBanco=true;
			this.isVisibilidadCeldaEliminarTipoCodigoSriBanco=true;
			this.isVisibilidadCeldaCancelarTipoCodigoSriBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCodigoSriBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCodigoSriBanco=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaModificarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaActualizarTipoCodigoSriBanco=true;
			this.isVisibilidadCeldaEliminarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaCancelarTipoCodigoSriBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCodigoSriBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCodigoSriBanco=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCodigoSriBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco=true;
			this.isVisibilidadCeldaModificarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaActualizarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaEliminarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaCancelarTipoCodigoSriBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCodigoSriBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCodigoSriBanco=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaActualizarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaEliminarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaCancelarTipoCodigoSriBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCodigoSriBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCodigoSriBanco=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaModificarTipoCodigoSriBanco=true;
			this.isVisibilidadCeldaActualizarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaEliminarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaCancelarTipoCodigoSriBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCodigoSriBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCodigoSriBanco=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCodigoSriBancoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCodigoSriBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco=true;
		} else {
			this.actualizarEstadoPanelsTipoCodigoSriBanco(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCodigoSriBanco=false;
			//this.isVisibilidadCeldaVerFormTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaDuplicarTipoCodigoSriBanco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocodigosribancoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoSriBanco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
			if(!tipocodigosribancoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco=false;												
			}
			
			this.jButtonCerrarTipoCodigoSriBanco.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoSriBanco=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocodigosribanco)) {
			this.isVisibilidadCeldaActualizarTipoCodigoSriBanco=false;
			this.isVisibilidadCeldaEliminarTipoCodigoSriBanco=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCodigoSriBanco() {
	}
	
	public void actualizarEstadoPanelsTipoCodigoSriBanco(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCodigoSriBanco!=null) {
				this.jScrollPanelDatosEdicionTipoCodigoSriBanco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCodigoSriBanco!=null) {
				this.jScrollPanelDatosTipoCodigoSriBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCodigoSriBanco!=null) {
				this.jPanelPaginacionTipoCodigoSriBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCodigoSriBanco!=null) {
				this.jPanelParametrosReportesTipoCodigoSriBanco.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCodigoSriBanco!=null) {
				this.jScrollPanelDatosEdicionTipoCodigoSriBanco.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCodigoSriBanco!=null) {
				this.jScrollPanelDatosTipoCodigoSriBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCodigoSriBanco!=null) {
				this.jPanelPaginacionTipoCodigoSriBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCodigoSriBanco!=null) {
				this.jPanelParametrosReportesTipoCodigoSriBanco.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCodigoSriBanco!=null) {
				this.jScrollPanelDatosEdicionTipoCodigoSriBanco.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoCodigoSriBanco!=null) {
				this.jScrollPanelDatosTipoCodigoSriBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCodigoSriBanco!=null) {
				this.jPanelPaginacionTipoCodigoSriBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCodigoSriBanco!=null) {
				this.jPanelParametrosReportesTipoCodigoSriBanco.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCodigoSriBanco!=null) {
				this.jScrollPanelDatosEdicionTipoCodigoSriBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCodigoSriBanco!=null) {
				this.jScrollPanelDatosTipoCodigoSriBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCodigoSriBanco!=null) {
				this.jPanelPaginacionTipoCodigoSriBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCodigoSriBanco!=null) {
				this.jPanelParametrosReportesTipoCodigoSriBanco.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCodigoSriBanco!=null) {
				this.jScrollPanelDatosEdicionTipoCodigoSriBanco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCodigoSriBanco!=null) {
				this.jScrollPanelDatosTipoCodigoSriBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCodigoSriBanco!=null) {
				this.jPanelPaginacionTipoCodigoSriBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCodigoSriBanco!=null) {
				this.jPanelParametrosReportesTipoCodigoSriBanco.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCodigoSriBanco!=null) {
				this.jScrollPanelDatosEdicionTipoCodigoSriBanco.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoCodigoSriBanco!=null) {
				this.jScrollPanelDatosTipoCodigoSriBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCodigoSriBanco!=null) {
				this.jPanelPaginacionTipoCodigoSriBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCodigoSriBanco!=null) {
				this.jPanelParametrosReportesTipoCodigoSriBanco.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCodigoSriBanco!=null) {
				this.jScrollPanelDatosEdicionTipoCodigoSriBanco.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoCodigoSriBanco!=null) {
				this.jScrollPanelDatosTipoCodigoSriBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCodigoSriBanco!=null) {
				this.jPanelPaginacionTipoCodigoSriBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCodigoSriBanco!=null) {
				this.jPanelParametrosReportesTipoCodigoSriBanco.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCodigoSriBancoSessionBean tipocodigosribancoSessionBean=new TipoCodigoSriBancoSessionBean();
		
		if(this.tipocodigosribancoSessionBean==null) {
			this.tipocodigosribancoSessionBean=new TipoCodigoSriBancoSessionBean();
		}
		
		this.tipocodigosribancoSessionBean.setsUltimaBusquedaTipoCodigoSriBanco(this.getsAccionBusqueda());
		this.tipocodigosribancoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocodigosribancoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCodigoSriBancoSessionBean tipocodigosribancoSessionBean=new TipoCodigoSriBancoSessionBean();
		
		if(this.tipocodigosribancoSessionBean==null) {
			this.tipocodigosribancoSessionBean=new TipoCodigoSriBancoSessionBean();
		}
		
		if(this.tipocodigosribancoSessionBean.getsUltimaBusquedaTipoCodigoSriBanco()!=null&&!this.tipocodigosribancoSessionBean.getsUltimaBusquedaTipoCodigoSriBanco().equals("")) {
			this.setsAccionBusqueda(tipocodigosribancoSessionBean.getsUltimaBusquedaTipoCodigoSriBanco());
			this.setiNumeroPaginacion(tipocodigosribancoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocodigosribancoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipocodigosribancoSessionBean.setsUltimaBusquedaTipoCodigoSriBanco("");
		this.tipocodigosribancoSessionBean.setiNumeroPaginacion(TipoCodigoSriBancoConstantesFunciones.INUMEROPAGINACION);
		this.tipocodigosribancoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCodigoSriBanco(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCodigoSriBanco() {
		this.updateBorderResaltarBusquedasFormularioTipoCodigoSriBanco();
		this.updateVisibilidadBusquedasFormularioTipoCodigoSriBanco();
		this.updateHabilitarBusquedasFormularioTipoCodigoSriBanco();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCodigoSriBanco() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCodigoSriBanco() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoCodigoSriBanco() {
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
	
	public void updateControlesFormularioTipoCodigoSriBanco() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCodigoSriBanco();
		this.updateVisibilidadResaltarControlesFormularioTipoCodigoSriBanco();
		this.updateHabilitarResaltarControlesFormularioTipoCodigoSriBanco();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCodigoSriBanco() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocodigosribancoConstantesFunciones.resaltaridTipoCodigoSriBanco!=null && this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldidTipoCodigoSriBanco.setBorder(this.tipocodigosribancoConstantesFunciones.resaltaridTipoCodigoSriBanco);}
		if(this.tipocodigosribancoConstantesFunciones.resaltarcodigoTipoCodigoSriBanco!=null && this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldcodigoTipoCodigoSriBanco.setBorder(this.tipocodigosribancoConstantesFunciones.resaltarcodigoTipoCodigoSriBanco);}
		if(this.tipocodigosribancoConstantesFunciones.resaltarnombreTipoCodigoSriBanco!=null && this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextAreanombreTipoCodigoSriBanco.setBorder(this.tipocodigosribancoConstantesFunciones.resaltarnombreTipoCodigoSriBanco);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCodigoSriBanco() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {
	
		//this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldidTipoCodigoSriBanco.setVisible(this.tipocodigosribancoConstantesFunciones.mostraridTipoCodigoSriBanco);
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jPanelidTipoCodigoSriBanco.setVisible(this.tipocodigosribancoConstantesFunciones.mostraridTipoCodigoSriBanco);
		//this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldcodigoTipoCodigoSriBanco.setVisible(this.tipocodigosribancoConstantesFunciones.mostrarcodigoTipoCodigoSriBanco);
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jPanelcodigoTipoCodigoSriBanco.setVisible(this.tipocodigosribancoConstantesFunciones.mostrarcodigoTipoCodigoSriBanco);
		//this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextAreanombreTipoCodigoSriBanco.setVisible(this.tipocodigosribancoConstantesFunciones.mostrarnombreTipoCodigoSriBanco);
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jPanelnombreTipoCodigoSriBanco.setVisible(this.tipocodigosribancoConstantesFunciones.mostrarnombreTipoCodigoSriBanco);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCodigoSriBanco() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCodigoSriBanco!=null) {
	
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldidTipoCodigoSriBanco.setEnabled(this.tipocodigosribancoConstantesFunciones.activaridTipoCodigoSriBanco);
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextFieldcodigoTipoCodigoSriBanco.setEnabled(this.tipocodigosribancoConstantesFunciones.activarcodigoTipoCodigoSriBanco);
		this.jInternalFrameDetalleFormTipoCodigoSriBanco.jTextAreanombreTipoCodigoSriBanco.setEnabled(this.tipocodigosribancoConstantesFunciones.activarnombreTipoCodigoSriBanco);
		}
	}
	
		
}