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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.TelefonoReferenciaConstantesFunciones;
import com.bydan.erp.nomina.util.TelefonoReferenciaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TelefonoReferenciaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TelefonoReferenciaBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
public class TelefonoReferenciaBeanSwingJInternalFrame extends TelefonoReferenciaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TelefonoReferenciaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TelefonoReferencia> telefonoreferenciaValidator = new ClassValidator<TelefonoReferencia>(TelefonoReferencia.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TelefonoReferencia telefonoreferencia;	
	public TelefonoReferencia telefonoreferenciaAux;
	public TelefonoReferencia telefonoreferenciaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TelefonoReferencia telefonoreferenciaTotales;
	public Long idTelefonoReferenciaActual;
	public Long iIdNuevoTelefonoReferencia=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboReferencia="";

	public List<Referencia> referenciasForeignKey;

	public List<Referencia> getreferenciasForeignKey() {
		return referenciasForeignKey;
	}

	public void setreferenciasForeignKey(List<Referencia> referenciasForeignKey) {
		this.referenciasForeignKey = referenciasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Referencia referenciaForeignKey;

	public Referencia getreferenciaForeignKey() {
		return referenciaForeignKey;
	}

	public void setreferenciaForeignKey(Referencia referenciaForeignKey) {
		this.referenciaForeignKey = referenciaForeignKey;
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
	
	public Boolean isPermisoTodoTelefonoReferencia;
	public Boolean isPermisoNuevoTelefonoReferencia;
	public Boolean isPermisoActualizarTelefonoReferencia;
	public Boolean isPermisoActualizarOriginalTelefonoReferencia;
	public Boolean isPermisoEliminarTelefonoReferencia;
	public Boolean isPermisoGuardarCambiosTelefonoReferencia;
	public Boolean isPermisoConsultaTelefonoReferencia;
	public Boolean isPermisoBusquedaTelefonoReferencia;
	public Boolean isPermisoReporteTelefonoReferencia;
	public Boolean isPermisoPaginacionMedioTelefonoReferencia;
	public Boolean isPermisoPaginacionAltoTelefonoReferencia;
	public Boolean isPermisoPaginacionTodoTelefonoReferencia;
	public Boolean isPermisoCopiarTelefonoReferencia;
	public Boolean isPermisoVerFormTelefonoReferencia;
	public Boolean isPermisoDuplicarTelefonoReferencia;
	public Boolean isPermisoOrdenTelefonoReferencia;
	
	
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
	
	public TelefonoReferenciaParameterReturnGeneral telefonoreferenciaReturnGeneral;
	public TelefonoReferenciaParameterReturnGeneral telefonoreferenciaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTelefonoReferencia=false;
	public Boolean esParaAccionDesdeFormularioTelefonoReferencia=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TelefonoReferenciaSessionBeanAdditional telefonoreferenciaSessionBeanAdditional=null;
	
	public TelefonoReferenciaSessionBeanAdditional getTelefonoReferenciaSessionBeanAdditional() {
		return this.telefonoreferenciaSessionBeanAdditional;
	}
	
	public void setTelefonoReferenciaSessionBeanAdditional(TelefonoReferenciaSessionBeanAdditional telefonoreferenciaSessionBeanAdditional) {
		try {
			this.telefonoreferenciaSessionBeanAdditional=telefonoreferenciaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TelefonoReferenciaBeanSwingJInternalFrameAdditional telefonoreferenciaBeanSwingJInternalFrameAdditional=null;
	//public class TelefonoReferenciaBeanSwingJInternalFrame
	
	public TelefonoReferenciaBeanSwingJInternalFrameAdditional getTelefonoReferenciaBeanSwingJInternalFrameAdditional() {
		return this.telefonoreferenciaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTelefonoReferenciaBeanSwingJInternalFrameAdditional(TelefonoReferenciaBeanSwingJInternalFrameAdditional telefonoreferenciaBeanSwingJInternalFrameAdditional) {
		try {
			this.telefonoreferenciaBeanSwingJInternalFrameAdditional=telefonoreferenciaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TelefonoReferenciaLogic telefonoreferenciaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TelefonoReferencia telefonoreferenciaBean;
	public TelefonoReferenciaConstantesFunciones telefonoreferenciaConstantesFunciones;
	//public TelefonoReferenciaParameterReturnGeneral telefonoreferenciaReturnGeneral;
	
	//FK
	
	public ReferenciaLogic referenciaLogic;
	
	//PARAMETROS
	
	
	//public List<TelefonoReferencia> telefonoreferencias;	
	//public List<TelefonoReferencia> telefonoreferenciasEliminados;
	//public List<TelefonoReferencia> telefonoreferenciasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTelefonoReferencia=false;
	public Boolean isVisibilidadCeldaDuplicarTelefonoReferencia=true;
	public Boolean isVisibilidadCeldaCopiarTelefonoReferencia=true;
	public Boolean isVisibilidadCeldaVerFormTelefonoReferencia=true;
	public Boolean isVisibilidadCeldaOrdenTelefonoReferencia=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTelefonoReferencia=false;
	public Boolean isVisibilidadCeldaModificarTelefonoReferencia=false;
	public Boolean isVisibilidadCeldaActualizarTelefonoReferencia=false;
	public Boolean isVisibilidadCeldaEliminarTelefonoReferencia=false;
	public Boolean isVisibilidadCeldaCancelarTelefonoReferencia=false;
	public Boolean isVisibilidadCeldaGuardarTelefonoReferencia=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTelefonoReferencia=false;	
	
	
	public Boolean isVisibilidadFK_IdReferencia=false;
	
	public Long getiIdNuevoTelefonoReferencia() {
		return this.iIdNuevoTelefonoReferencia;
	}

	public void setiIdNuevoTelefonoReferencia(Long iIdNuevoTelefonoReferencia) {
		this.iIdNuevoTelefonoReferencia = iIdNuevoTelefonoReferencia;
	}
	
	public Long getidTelefonoReferenciaActual() {
		return this.idTelefonoReferenciaActual;
	}

	public void setidTelefonoReferenciaActual(Long idTelefonoReferenciaActual) {
		this.idTelefonoReferenciaActual = idTelefonoReferenciaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TelefonoReferencia gettelefonoreferencia() {
		return this.telefonoreferencia;
	}

	public void settelefonoreferencia(TelefonoReferencia telefonoreferencia) {
		this.telefonoreferencia = telefonoreferencia;
	}
	
	public TelefonoReferencia gettelefonoreferenciaAux() {
		return this.telefonoreferenciaAux;
	}

	public void settelefonoreferenciaAux(TelefonoReferencia telefonoreferenciaAux) {
		this.telefonoreferenciaAux = telefonoreferenciaAux;
	}				
	
	public TelefonoReferencia gettelefonoreferenciaAnterior() {
		return this.telefonoreferenciaAnterior;
	}

	public void settelefonoreferenciaAnterior(TelefonoReferencia telefonoreferenciaAnterior) {
		this.telefonoreferenciaAnterior = telefonoreferenciaAnterior;
	}	
	
	public TelefonoReferencia gettelefonoreferenciaTotales() {
		return this.telefonoreferenciaTotales;
	}

	public void settelefonoreferenciaTotales(TelefonoReferencia telefonoreferenciaTotales) {
		this.telefonoreferenciaTotales = telefonoreferenciaTotales;
	}	
	
	public TelefonoReferencia gettelefonoreferenciaBean() {
		return this.telefonoreferenciaBean;
	}

	public void settelefonoreferenciaBean(TelefonoReferencia telefonoreferenciaBean) {
		this.telefonoreferenciaBean = telefonoreferenciaBean;
	}	
	
	public TelefonoReferenciaParameterReturnGeneral gettelefonoreferenciaReturnGeneral() {
		return this.telefonoreferenciaReturnGeneral;
	}

	public void settelefonoreferenciaReturnGeneral(TelefonoReferenciaParameterReturnGeneral telefonoreferenciaReturnGeneral) {
		this.telefonoreferenciaReturnGeneral = telefonoreferenciaReturnGeneral;
	}	
	
	
	public Long id_referenciaFK_IdReferencia=-1L;

	public Long getid_referenciaFK_IdReferencia() {
		return this.id_referenciaFK_IdReferencia;
	}

	public void setid_referenciaFK_IdReferencia(Long id_referenciaFK_IdReferencia) {
		this.id_referenciaFK_IdReferencia = id_referenciaFK_IdReferencia;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TelefonoReferenciaLogic getTelefonoReferenciaLogic()	{		
		return telefonoreferenciaLogic;
	}

	public void setTelefonoReferenciaLogic(TelefonoReferenciaLogic telefonoreferenciaLogic) {
		this.telefonoreferenciaLogic = telefonoreferenciaLogic;
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
	
	public Boolean getIsEsNuevoTelefonoReferencia() {
		return isEsNuevoTelefonoReferencia;
	}

	public void setIsEsNuevoTelefonoReferencia(Boolean isEsNuevoTelefonoReferencia) {
		this.isEsNuevoTelefonoReferencia = isEsNuevoTelefonoReferencia;
	}

	public Boolean getEsParaAccionDesdeFormularioTelefonoReferencia() {
		return esParaAccionDesdeFormularioTelefonoReferencia;
	}
	
	public void setEsParaAccionDesdeFormularioTelefonoReferencia(Boolean esParaAccionDesdeFormularioTelefonoReferencia) {
		this.esParaAccionDesdeFormularioTelefonoReferencia = esParaAccionDesdeFormularioTelefonoReferencia;
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
	
	
	public void cargarCombosReferenciasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.referenciasForeignKey=new ArrayList<Referencia>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ReferenciaLogic referenciaLogic=new ReferenciaLogic();

			referenciaLogic.getReferenciaDataAccess().setIsForForeingKeyData(true);

			if(this.telefonoreferenciaSessionBean==null) {
				this.telefonoreferenciaSessionBean=new TelefonoReferenciaSessionBean();
			}

			if(!this.telefonoreferenciaSessionBean.getisBusquedaDesdeForeignKeySesionReferencia()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciaLogic.getReferenciaDataAccess().setIsForForeingKeyData(true);

					referenciaLogic.getTodosReferenciasWithConnection(sFinalQuery,new Pagination());

					this.referenciasForeignKey=referenciaLogic.getReferencias();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaReferencia(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciaLogic.getEntityWithConnection(telefonoreferenciaSessionBean.getlidReferenciaActual());
					this.referenciasForeignKey.add(referenciaLogic.getReferencia());
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

	
	
	public void setActualReferenciaForeignKey(Long idReferenciaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Referencia  referenciaTemp=null;

			for(Referencia referenciaAux:referenciasForeignKey) {
				if(referenciaAux.getId()!=null && referenciaAux.getId().equals(idReferenciaSeleccionado)) {
					referenciaTemp=referenciaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(referenciaTemp!=null) {

					if(this.telefonoreferencia!=null) {
						this.telefonoreferencia.setReferencia(referenciaTemp);
					}

					if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
						this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxid_referenciaTelefonoReferencia.setSelectedItem(referenciaTemp);
					}
				} else {
					//jComboBoxid_referenciaTelefonoReferencia.setSelectedItem(referenciaTemp);
					if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
						if(this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxid_referenciaTelefonoReferencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxid_referenciaTelefonoReferencia.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdReferencia") || sFormularioTipoBusqueda.equals("Todos")){
					if(referenciaTemp!=null && jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia!=null) {
						jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia.setSelectedItem(referenciaTemp);
					} else {
						if(jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia!=null) {
							//jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia.setSelectedItem(referenciaTemp);
							if(jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia.getItemCount()>0) {
								jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia.setSelectedIndex(0);
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

	public String getActualReferenciaForeignKeyDescripcion(Long idReferenciaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Referencia  referenciaTemp=null;

			for(Referencia referenciaAux:referenciasForeignKey) {
				if(referenciaAux.getId()!=null && referenciaAux.getId().equals(idReferenciaSeleccionado)) {
					referenciaTemp=referenciaAux;
					break;
				}
			}


			sDescripcion=ReferenciaConstantesFunciones.getReferenciaDescripcion(referenciaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualReferenciaForeignKeyGenerico(Long idReferenciaSeleccionado,JComboBox jComboBoxid_referenciaTelefonoReferenciaGenerico)throws Exception
	{
		try
		{
			Referencia  referenciaTemp=null;

			for(Referencia referenciaAux:referenciasForeignKey) {
				if(referenciaAux.getId()!=null && referenciaAux.getId().equals(idReferenciaSeleccionado)) {
					referenciaTemp=referenciaAux;
					break;
				}
			}

			if(referenciaTemp!=null) {
				jComboBoxid_referenciaTelefonoReferenciaGenerico.setSelectedItem(referenciaTemp);
			} else {
				if(jComboBoxid_referenciaTelefonoReferenciaGenerico!=null && jComboBoxid_referenciaTelefonoReferenciaGenerico.getItemCount()>0) {
					jComboBoxid_referenciaTelefonoReferenciaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarReferenciaForeignKey(TelefonoReferencia telefonoreferencia,JComboBox jComboBoxid_referenciaTelefonoReferenciaGenerico)throws Exception
	{
		try
		{
			Referencia  referenciaAux=new Referencia();

			if(jComboBoxid_referenciaTelefonoReferenciaGenerico==null) {
				referenciaAux=(Referencia)this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxid_referenciaTelefonoReferencia.getSelectedItem();
			} else {
				referenciaAux=(Referencia)jComboBoxid_referenciaTelefonoReferenciaGenerico.getSelectedItem();
			}

			if(referenciaAux!=null && referenciaAux.getId()!=null) {
				telefonoreferencia.setid_referencia(referenciaAux.getId());
				telefonoreferencia.setreferencia_descripcion(TelefonoReferenciaConstantesFunciones.getReferenciaDescripcion(referenciaAux));
				telefonoreferencia.setReferencia(referenciaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameReferenciasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingReferencia=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { 
							this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxid_referenciaTelefonoReferencia.removeAllItems();

							for(Referencia referencia:this.referenciasForeignKey) {
								this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxid_referenciaTelefonoReferencia.addItem(referencia);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { 
					}

					if(!TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdReferencia") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia.removeAllItems();

							for(Referencia referencia:this.referenciasForeignKey) {
								this.jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia.addItem(referencia);
							}
						}

						if(!TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameReferenciaForeignKey(Referencia referencia,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
							this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxid_referenciaTelefonoReferencia.setSelectedItem(referencia);
						}
					} else {
						if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
							this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxid_referenciaTelefonoReferencia.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia.setSelectedItem(referencia);
						} else {
							this.jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTelefonoReferencia() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TelefonoReferenciaConstantesFunciones.refrescarForeignKeysDescripcionesTelefonoReferencia(this.telefonoreferenciaLogic.getTelefonoReferencias());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TelefonoReferenciaConstantesFunciones.refrescarForeignKeysDescripcionesTelefonoReferencia(this.telefonoreferencias);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Referencia.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//telefonoreferenciaLogic.setTelefonoReferencias(this.telefonoreferencias);
			telefonoreferenciaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TelefonoReferenciaParameterReturnGeneral getTelefonoReferenciaParameterGeneral() {
		return this.telefonoreferenciaParameterGeneral;
	}
	
	public void setTelefonoReferenciaParameterGeneral(TelefonoReferenciaParameterReturnGeneral telefonoreferenciaParameterGeneral) {
		this.telefonoreferenciaParameterGeneral = telefonoreferenciaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTelefonoReferencia() {
		return isPermisoTodoTelefonoReferencia;
	}

	public void setIsPermisoTodoTelefonoReferencia(Boolean isPermisoTodoTelefonoReferencia) {
		this.isPermisoTodoTelefonoReferencia = isPermisoTodoTelefonoReferencia;
	}

	public Boolean getIsPermisoNuevoTelefonoReferencia() {
		return isPermisoNuevoTelefonoReferencia;
	}

	public void setIsPermisoNuevoTelefonoReferencia(Boolean isPermisoNuevoTelefonoReferencia) {
		this.isPermisoNuevoTelefonoReferencia = isPermisoNuevoTelefonoReferencia;
	}

	public Boolean getIsPermisoActualizarTelefonoReferencia() {
		return isPermisoActualizarTelefonoReferencia;
	}

	public void setIsPermisoActualizarTelefonoReferencia(Boolean isPermisoActualizarTelefonoReferencia) {
		this.isPermisoActualizarTelefonoReferencia = isPermisoActualizarTelefonoReferencia;
	}

	public Boolean getIsPermisoEliminarTelefonoReferencia() {
		return isPermisoEliminarTelefonoReferencia;
	}

	public void setIsPermisoEliminarTelefonoReferencia(Boolean isPermisoEliminarTelefonoReferencia) {
		this.isPermisoEliminarTelefonoReferencia = isPermisoEliminarTelefonoReferencia;
	}

	public Boolean getIsPermisoGuardarCambiosTelefonoReferencia() {
		return isPermisoGuardarCambiosTelefonoReferencia;
	}

	public void setIsPermisoGuardarCambiosTelefonoReferencia(Boolean isPermisoGuardarCambiosTelefonoReferencia) {
		this.isPermisoGuardarCambiosTelefonoReferencia = isPermisoGuardarCambiosTelefonoReferencia;
	}
	
	public Boolean getIsPermisoConsultaTelefonoReferencia() {
		return isPermisoConsultaTelefonoReferencia;
	}

	public void setIsPermisoConsultaTelefonoReferencia(Boolean isPermisoConsultaTelefonoReferencia) {
		this.isPermisoConsultaTelefonoReferencia = isPermisoConsultaTelefonoReferencia;
	}

	public Boolean getIsPermisoBusquedaTelefonoReferencia() {
		return isPermisoBusquedaTelefonoReferencia;
	}

	public void setIsPermisoBusquedaTelefonoReferencia(Boolean isPermisoBusquedaTelefonoReferencia) {
		this.isPermisoBusquedaTelefonoReferencia = isPermisoBusquedaTelefonoReferencia;
	}

	public Boolean getIsPermisoReporteTelefonoReferencia() {
		return isPermisoReporteTelefonoReferencia;
	}

	public void setIsPermisoReporteTelefonoReferencia(Boolean isPermisoReporteTelefonoReferencia) {
		this.isPermisoReporteTelefonoReferencia = isPermisoReporteTelefonoReferencia;
	}
	
	public Boolean getIsPermisoPaginacionMedioTelefonoReferencia() {
		return isPermisoPaginacionMedioTelefonoReferencia;
	}

	public void setIsPermisoPaginacionMedioTelefonoReferencia(Boolean isPermisoPaginacionMedioTelefonoReferencia) {
		this.isPermisoPaginacionMedioTelefonoReferencia = isPermisoPaginacionMedioTelefonoReferencia;
	}
	
	public Boolean getIsPermisoPaginacionTodoTelefonoReferencia() {
		return isPermisoPaginacionTodoTelefonoReferencia;
	}

	public void setIsPermisoPaginacionTodoTelefonoReferencia(Boolean isPermisoPaginacionTodoTelefonoReferencia) {
		this.isPermisoPaginacionTodoTelefonoReferencia = isPermisoPaginacionTodoTelefonoReferencia;
	}
	
	public Boolean getIsPermisoPaginacionAltoTelefonoReferencia() {
		return isPermisoPaginacionAltoTelefonoReferencia;
	}

	public void setIsPermisoPaginacionAltoTelefonoReferencia(Boolean isPermisoPaginacionAltoTelefonoReferencia) {
		this.isPermisoPaginacionAltoTelefonoReferencia = isPermisoPaginacionAltoTelefonoReferencia;
	}
	
	public Boolean getIsPermisoCopiarTelefonoReferencia() {
		return isPermisoCopiarTelefonoReferencia;
	}

	public void setIsPermisoCopiarTelefonoReferencia(Boolean isPermisoCopiarTelefonoReferencia) {
		this.isPermisoCopiarTelefonoReferencia = isPermisoCopiarTelefonoReferencia;
	}
	
	public Boolean getIsPermisoVerFormTelefonoReferencia() {
		return isPermisoVerFormTelefonoReferencia;
	}

	public void setIsPermisoVerFormTelefonoReferencia(Boolean isPermisoVerFormTelefonoReferencia) {
		this.isPermisoVerFormTelefonoReferencia = isPermisoVerFormTelefonoReferencia;
	}
	
	public Boolean getIsPermisoDuplicarTelefonoReferencia() {
		return isPermisoDuplicarTelefonoReferencia;
	}

	public void setIsPermisoDuplicarTelefonoReferencia(Boolean isPermisoDuplicarTelefonoReferencia) {
		this.isPermisoDuplicarTelefonoReferencia = isPermisoDuplicarTelefonoReferencia;
	}
	
	public Boolean getIsPermisoOrdenTelefonoReferencia() {
		return isPermisoOrdenTelefonoReferencia;
	}

	public void setIsPermisoOrdenTelefonoReferencia(Boolean isPermisoOrdenTelefonoReferencia) {
		this.isPermisoOrdenTelefonoReferencia = isPermisoOrdenTelefonoReferencia;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTelefonoReferencia() {
		return isVisibilidadCeldaNuevoTelefonoReferencia;
	}

	public void setIsVisibilidadCeldaNuevoTelefonoReferencia(Boolean isVisibilidadCeldaNuevoTelefonoReferencia) {
		this.isVisibilidadCeldaNuevoTelefonoReferencia = isVisibilidadCeldaNuevoTelefonoReferencia;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTelefonoReferencia() {
		return isVisibilidadCeldaDuplicarTelefonoReferencia;
	}

	public void setIsVisibilidadCeldaDuplicarTelefonoReferencia(Boolean isVisibilidadCeldaDuplicarTelefonoReferencia) {
		this.isVisibilidadCeldaDuplicarTelefonoReferencia = isVisibilidadCeldaDuplicarTelefonoReferencia;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTelefonoReferencia() {
		return isVisibilidadCeldaCopiarTelefonoReferencia;
	}

	public void setIsVisibilidadCeldaCopiarTelefonoReferencia(Boolean isVisibilidadCeldaCopiarTelefonoReferencia) {
		this.isVisibilidadCeldaCopiarTelefonoReferencia = isVisibilidadCeldaCopiarTelefonoReferencia;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTelefonoReferencia() {
		return isVisibilidadCeldaVerFormTelefonoReferencia;
	}

	public void setIsVisibilidadCeldaVerFormTelefonoReferencia(Boolean isVisibilidadCeldaVerFormTelefonoReferencia) {
		this.isVisibilidadCeldaVerFormTelefonoReferencia = isVisibilidadCeldaVerFormTelefonoReferencia;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTelefonoReferencia() {
		return isVisibilidadCeldaOrdenTelefonoReferencia;
	}

	public void setIsVisibilidadCeldaOrdenTelefonoReferencia(Boolean isVisibilidadCeldaOrdenTelefonoReferencia) {
		this.isVisibilidadCeldaOrdenTelefonoReferencia = isVisibilidadCeldaOrdenTelefonoReferencia;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTelefonoReferencia() {
		return isVisibilidadCeldaNuevoRelacionesTelefonoReferencia;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTelefonoReferencia(Boolean isVisibilidadCeldaNuevoRelacionesTelefonoReferencia) {
		this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia = isVisibilidadCeldaNuevoRelacionesTelefonoReferencia;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTelefonoReferencia() {
		return isVisibilidadCeldaModificarTelefonoReferencia;
	}

	public void setIsVisibilidadCeldaModificarTelefonoReferencia(Boolean isVisibilidadCeldaModificarTelefonoReferencia) {
		this.isVisibilidadCeldaModificarTelefonoReferencia = isVisibilidadCeldaModificarTelefonoReferencia;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTelefonoReferencia() {
		return isVisibilidadCeldaActualizarTelefonoReferencia;
	}

	public void setIsVisibilidadCeldaActualizarTelefonoReferencia(Boolean isVisibilidadCeldaActualizarTelefonoReferencia) {
		this.isVisibilidadCeldaActualizarTelefonoReferencia = isVisibilidadCeldaActualizarTelefonoReferencia;
	}

	public Boolean getIsVisibilidadCeldaEliminarTelefonoReferencia() {
		return isVisibilidadCeldaEliminarTelefonoReferencia;
	}

	public void setIsVisibilidadCeldaEliminarTelefonoReferencia(Boolean isVisibilidadCeldaEliminarTelefonoReferencia) {
		this.isVisibilidadCeldaEliminarTelefonoReferencia = isVisibilidadCeldaEliminarTelefonoReferencia;
	}

	public Boolean getIsVisibilidadCeldaCancelarTelefonoReferencia() {
		return isVisibilidadCeldaCancelarTelefonoReferencia;
	}

	public void setIsVisibilidadCeldaCancelarTelefonoReferencia(Boolean isVisibilidadCeldaCancelarTelefonoReferencia) {
		this.isVisibilidadCeldaCancelarTelefonoReferencia = isVisibilidadCeldaCancelarTelefonoReferencia;
	}

	public Boolean getIsVisibilidadCeldaGuardarTelefonoReferencia() {
		return isVisibilidadCeldaGuardarTelefonoReferencia;
	}

	public void setIsVisibilidadCeldaGuardarTelefonoReferencia(Boolean isVisibilidadCeldaGuardarTelefonoReferencia) {
		this.isVisibilidadCeldaGuardarTelefonoReferencia = isVisibilidadCeldaGuardarTelefonoReferencia;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTelefonoReferencia() {
		return isVisibilidadCeldaGuardarCambiosTelefonoReferencia;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTelefonoReferencia(Boolean isVisibilidadCeldaGuardarCambiosTelefonoReferencia) {
		this.isVisibilidadCeldaGuardarCambiosTelefonoReferencia = isVisibilidadCeldaGuardarCambiosTelefonoReferencia;
	}
		
	public TelefonoReferenciaSessionBean gettelefonoreferenciaSessionBean() {
		return this.telefonoreferenciaSessionBean;
	}
	
	public void settelefonoreferenciaSessionBean(TelefonoReferenciaSessionBean telefonoreferenciaSessionBean) {
		this.telefonoreferenciaSessionBean=telefonoreferenciaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdReferencia() {
		return this.isVisibilidadFK_IdReferencia;
	}

	public void setisVisibilidadFK_IdReferencia(Boolean isVisibilidadFK_IdReferencia) {
		this.isVisibilidadFK_IdReferencia=isVisibilidadFK_IdReferencia;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTelefonoReferencia(TelefonoReferencia telefonoreferencia)throws Exception {
		try {
			
				this.setActualParaGuardarReferenciaForeignKey(telefonoreferencia,null);
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
	
	public void bugActualizarReferenciaActual(TelefonoReferencia telefonoreferencia,TelefonoReferencia telefonoreferenciaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTelefonoReferencia(telefonoreferencia);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		telefonoreferenciaAux.setId(telefonoreferencia.getId());
		telefonoreferenciaAux.setVersionRow(telefonoreferencia.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTelefonoReferencia();
		
			int intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTelefonoReferencia(this.telefonoreferencia,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTelefonoReferencia(this.telefonoreferencia);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = telefonoreferenciaValidator.getInvalidValues(this.telefonoreferencia);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			telefonoreferenciaLogic.setDatosCliente(datosCliente);
			telefonoreferenciaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				telefonoreferenciaAux=new  TelefonoReferencia();
				
				telefonoreferenciaAux.setIsNew(true);
				telefonoreferenciaAux.setIsChanged(true);
				
				telefonoreferenciaAux.setTelefonoReferenciaOriginal(this.telefonoreferencia);
				
				telefonoreferenciaAux.setId(this.telefonoreferencia.getId());	
				telefonoreferenciaAux.setVersionRow(this.telefonoreferencia.getVersionRow());	
				telefonoreferenciaAux.setid_referencia(this.telefonoreferencia.getid_referencia());	
				telefonoreferenciaAux.setnumero(this.telefonoreferencia.getnumero());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.telefonoreferenciaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.telefonoreferenciaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(telefonoreferenciaAux,telefonoreferenciaLogic.getTelefonoReferencias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(telefonoreferenciaAux,telefonoreferencias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.telefonoreferenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.telefonoreferenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonoreferenciaLogic.saveTelefonoReferencias();//WithConnection
						//telefonoreferenciaLogic.getSetVersionRowTelefonoReferencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.telefonoreferencia,telefonoreferenciaAux);
					
					this.refrescarForeignKeysDescripcionesTelefonoReferencia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.telefonoreferenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								telefonoreferenciaLogic.saveTelefonoReferenciaRelaciones(telefonoreferenciaAux);//WithConnection
								//telefonoreferenciaLogic.getSetVersionRowTelefonoReferencias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.telefonoreferencia,telefonoreferenciaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.telefonoreferenciaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.telefonoreferenciaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(telefonoreferenciaAux,telefonoreferenciaLogic.getTelefonoReferencias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(telefonoreferenciaAux,telefonoreferencias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.telefonoreferencia,telefonoreferenciaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				telefonoreferenciaAux=new  TelefonoReferencia();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado() 
					|| (this.telefonoreferenciaSessionBean.getEsGuardarRelacionado() && this.telefonoreferencia.getId()>=0)) {
						
					telefonoreferenciaAux.setIsNew(false);
				}
				
				telefonoreferenciaAux.setIsDeleted(false);
			
				telefonoreferenciaAux.setId(this.telefonoreferencia.getId());	
				telefonoreferenciaAux.setVersionRow(this.telefonoreferencia.getVersionRow());	
				telefonoreferenciaAux.setid_referencia(this.telefonoreferencia.getid_referencia());	
				telefonoreferenciaAux.setnumero(this.telefonoreferencia.getnumero());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(telefonoreferenciaAux,telefonoreferenciaLogic.getTelefonoReferencias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(telefonoreferenciaAux,telefonoreferencias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.telefonoreferenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.telefonoreferenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonoreferenciaLogic.saveTelefonoReferencias();//WithConnection
						//telefonoreferenciaLogic.getSetVersionRowTelefonoReferencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.telefonoreferencia,telefonoreferenciaAux);
					
					this.refrescarForeignKeysDescripcionesTelefonoReferencia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.telefonoreferenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								telefonoreferenciaLogic.saveTelefonoReferenciaRelaciones(telefonoreferenciaAux);//WithConnection
								//telefonoreferenciaLogic.getSetVersionRowTelefonoReferencias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.telefonoreferencia,telefonoreferenciaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.telefonoreferenciaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.telefonoreferenciaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(telefonoreferenciaAux,telefonoreferenciaLogic.getTelefonoReferencias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(telefonoreferenciaAux,telefonoreferencias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.telefonoreferencia,telefonoreferenciaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				telefonoreferenciaAux=new  TelefonoReferencia();
				
				telefonoreferenciaAux.setIsNew(false);
				telefonoreferenciaAux.setIsChanged(false);
				
				telefonoreferenciaAux.setIsDeleted(true);
				
				telefonoreferenciaAux.setId(this.telefonoreferencia.getId());	
				telefonoreferenciaAux.setVersionRow(this.telefonoreferencia.getVersionRow());	
				telefonoreferenciaAux.setid_referencia(this.telefonoreferencia.getid_referencia());	
				telefonoreferenciaAux.setnumero(this.telefonoreferencia.getnumero());	
				
				if(this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.telefonoreferenciaAux.getId()>=0) {	
						this.telefonoreferenciasEliminados.add(telefonoreferenciaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(telefonoreferenciaAux,telefonoreferenciaLogic.getTelefonoReferencias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(telefonoreferenciaAux,telefonoreferencias);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.telefonoreferenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.telefonoreferenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonoreferenciaLogic.saveTelefonoReferencias();//WithConnection
						//telefonoreferenciaLogic.getSetVersionRowTelefonoReferencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.telefonoreferenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								telefonoreferenciaLogic.saveTelefonoReferenciaRelaciones(telefonoreferenciaAux);//WithConnection
								//telefonoreferenciaLogic.getSetVersionRowTelefonoReferencias();//WithConnection
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
							if(this.telefonoreferenciaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.telefonoreferenciaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(telefonoreferenciaAux,telefonoreferenciaLogic.getTelefonoReferencias());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(telefonoreferenciaAux,telefonoreferencias);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferenciaLogic.getTelefonoReferencias().addAll(this.telefonoreferenciasEliminados);
					
					telefonoreferenciaLogic.saveTelefonoReferencias();//WithConnection
					//telefonoreferenciaLogic.getSetVersionRowTelefonoReferencias();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTelefonoReferencia();
				
				this.telefonoreferenciasEliminados= new ArrayList<TelefonoReferencia>();		
			}
			
			if(this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Telefono Referencia GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Telefono Referencia",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.telefonoreferencia=telefonoreferenciaAux;
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
      		//this.finishProcessTelefonoReferencia();
      	}
		
	}	
	
	public void actualizarRelaciones(TelefonoReferencia telefonoreferenciaLocal) throws Exception {
		
		if(this.telefonoreferenciaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TelefonoReferencia telefonoreferenciaLocal) throws Exception {	
		if(this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ReferenciaDetalleFormJInternalFrame.class)) {
				ReferenciaBeanSwingJInternalFrame referenciaBeanSwingJInternalFrameLocal=(ReferenciaBeanSwingJInternalFrame) ((ReferenciaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				referenciaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoReferencia(referenciaBeanSwingJInternalFrameLocal.getreferencia(),true);
				referenciaBeanSwingJInternalFrameLocal.actualizarLista(referenciaBeanSwingJInternalFrameLocal.referencia,this.referenciasForeignKey);

				referenciaBeanSwingJInternalFrameLocal.actualizarRelaciones(referenciaBeanSwingJInternalFrameLocal.referencia);

				telefonoreferenciaLocal.setReferencia(referenciaBeanSwingJInternalFrameLocal.referencia);

				this.addItemDefectoCombosForeignKeyReferencia();
				this.cargarCombosFrameReferenciasForeignKey("Formulario");
				this.setActualReferenciaForeignKey(referenciaBeanSwingJInternalFrameLocal.referencia.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTelefonoReferenciaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = telefonoreferenciaValidator.getInvalidValues(this.telefonoreferencia);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TelefonoReferencia telefonoreferencia,List<TelefonoReferencia> telefonoreferencias) throws Exception {
		try	{		
			TelefonoReferenciaConstantesFunciones.actualizarLista(telefonoreferencia,telefonoreferencias,this.telefonoreferenciaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TelefonoReferencia telefonoreferencia,List<TelefonoReferencia> telefonoreferencias) throws Exception {
		try	{			
			TelefonoReferenciaConstantesFunciones.actualizarSelectedLista(telefonoreferencia,telefonoreferencias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TelefonoReferencia> telefonoreferenciasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				telefonoreferenciasLocal=this.telefonoreferenciaLogic.getTelefonoReferencias();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				telefonoreferenciasLocal=this.telefonoreferencias;
			}
			//ARCHITECTURE
		
			for(TelefonoReferencia telefonoreferenciaLocal:telefonoreferenciasLocal) {
				if(this.permiteMantenimiento(telefonoreferenciaLocal) && telefonoreferenciaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TelefonoReferenciaConstantesFunciones.getTelefonoReferenciaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TelefonoReferenciaConstantesFunciones.IDREFERENCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefonoReferencia.jLabelid_referenciaTelefonoReferencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TelefonoReferenciaConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefonoReferencia.jLabelnumeroTelefonoReferencia,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTelefonoReferencia.jLabelid_referenciaTelefonoReferencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTelefonoReferencia.jLabelnumeroTelefonoReferencia,"");
		
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
		this.iIdNuevoTelefonoReferencia--;	
		
		
		this.telefonoreferenciaAux=new TelefonoReferencia();
		
		this.telefonoreferenciaAux.setId(this.iIdNuevoTelefonoReferencia);
		this.telefonoreferenciaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.telefonoreferenciaLogic.getTelefonoReferencias().add(this.telefonoreferenciaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.telefonoreferencias.add(this.telefonoreferenciaAux);
		}
		//ARCHITECTURE
		
		this.telefonoreferencia=this.telefonoreferenciaAux;
		
		if(TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTelefonoReferencia(this.telefonoreferencia);
			this.setVariablesObjetoActualToFormularioForeignKeyTelefonoReferencia(this.telefonoreferencia);
		}
				
		//this.setDefaultControlesTelefonoReferencia();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTelefonoReferencia();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTelefonoReferencia();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTelefonoReferencia();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTelefonoReferencia(this.telefonoreferenciaBean,this.telefonoreferencia,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTelefonoReferencia(this.telefonoreferencia);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.telefonoreferenciaSessionBean.getConGuardarRelaciones()) {
			classes=TelefonoReferenciaConstantesFunciones.getClassesRelationshipsOfTelefonoReferencia(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.telefonoreferenciaReturnGeneral=telefonoreferenciaLogic.procesarEventosTelefonoReferenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.telefonoreferenciaLogic.getTelefonoReferencias(),this.telefonoreferencia,this.telefonoreferenciaParameterGeneral,this.isEsNuevoTelefonoReferencia,classes);//this.telefonoreferenciaLogic.getTelefonoReferencia()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTelefonoReferencia(this.telefonoreferenciaReturnGeneral,this.telefonoreferenciaBean,false);
		
		if(this.telefonoreferenciaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTelefonoReferencia(this.telefonoreferenciaReturnGeneral.getTelefonoReferencia());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTelefonoReferencia(this.telefonoreferenciaReturnGeneral.getTelefonoReferencia());
		}
		
		if(this.telefonoreferenciaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTelefonoReferencia(this.telefonoreferenciaReturnGeneral.getTelefonoReferencia(),classes);//this.telefonoreferenciaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTelefonoReferencia(this.telefonoreferencia,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTelefonoReferencia();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTelefonoReferencia();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.RecargarFormTelefonoReferencia(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTelefonoReferencia(false);
						
			if(telefonoreferenciaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTelefonoReferencia();
			}
			
			this.actualizarVisualTableDatosTelefonoReferencia();
			
			this.jTableDatosTelefonoReferencia.setRowSelectionInterval(this.getIndiceNuevoTelefonoReferencia(), this.getIndiceNuevoTelefonoReferencia());
			
			this.seleccionarFilaTablaTelefonoReferenciaActual();
						
			this.actualizarEstadoCeldasBotonesTelefonoReferencia("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTelefonoReferencia(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTelefonoReferencia.jTextFieldnumeroTelefonoReferencia.setEnabled(isHabilitar && this.telefonoreferenciaConstantesFunciones.activarnumeroTelefonoReferencia);	
		
		this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxid_referenciaTelefonoReferencia.setEnabled(isHabilitar && this.telefonoreferenciaConstantesFunciones.activarid_referenciaTelefonoReferencia);
	};
	
	public void setDefaultControlesTelefonoReferencia() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTelefonoReferencia(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.telefonoreferenciaSessionBean.setConGuardarRelaciones(true);			
			this.telefonoreferenciaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTelefonoReferencia.jTabbedPaneRelacionesTelefonoReferencia.setVisible(true);
			
					
		} else {
			//this.telefonoreferenciaSessionBean.setConGuardarRelaciones(false);			
			this.telefonoreferenciaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTelefonoReferencia.jTabbedPaneRelacionesTelefonoReferencia.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTelefonoReferencia() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TelefonoReferencia telefonoreferenciaAux:this.telefonoreferenciaLogic.getTelefonoReferencias()) {
				if(telefonoreferenciaAux.getId().equals(this.iIdNuevoTelefonoReferencia)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TelefonoReferencia telefonoreferenciaAux:this.telefonoreferencias) {
				if(telefonoreferenciaAux.getId().equals(this.iIdNuevoTelefonoReferencia)) {
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
	
	public int getIndiceActualTelefonoReferencia(TelefonoReferencia telefonoreferencia,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TelefonoReferencia telefonoreferenciaAux:this.telefonoreferenciaLogic.getTelefonoReferencias()) {
				if(telefonoreferenciaAux.getId().equals(telefonoreferencia.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TelefonoReferencia telefonoreferenciaAux:this.telefonoreferencias) {
				if(telefonoreferenciaAux.getId().equals(telefonoreferencia.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTelefonoReferencia(TelefonoReferencia telefonoreferenciaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TelefonoReferencia telefonoreferenciaAux:this.telefonoreferenciaLogic.getTelefonoReferencias()) {
				if(telefonoreferenciaAux.getTelefonoReferenciaOriginal().getId().equals(telefonoreferenciaOriginal.getId())) {
					existe=true;
					telefonoreferenciaOriginal.setId(telefonoreferenciaAux.getId());
					telefonoreferenciaOriginal.setVersionRow(telefonoreferenciaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TelefonoReferencia telefonoreferenciaAux:this.telefonoreferencias) {
				if(telefonoreferenciaAux.getTelefonoReferenciaOriginal().getId().equals(telefonoreferenciaOriginal.getId())) {
					existe=true;
					telefonoreferenciaOriginal.setId(telefonoreferenciaAux.getId());
					telefonoreferenciaOriginal.setVersionRow(telefonoreferenciaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTelefonoReferencia(Boolean esParaCancelar) throws Exception {
		telefonoreferenciasAux=new ArrayList<TelefonoReferencia>();
		telefonoreferenciaAux=new TelefonoReferencia();
		
		if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TelefonoReferencia telefonoreferenciaAux:this.telefonoreferenciaLogic.getTelefonoReferencias()) {
					if(telefonoreferenciaAux.getId()<0) {
						telefonoreferenciasAux.add(telefonoreferenciaAux);
					}		
				}
				this.iIdNuevoTelefonoReferencia=0L;
				this.telefonoreferenciaLogic.getTelefonoReferencias().removeAll(telefonoreferenciasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TelefonoReferencia telefonoreferenciaAux:this.telefonoreferencias) {
					if(telefonoreferenciaAux.getId()<0) {
						telefonoreferenciasAux.add(telefonoreferenciaAux);
					}		
				}
				this.iIdNuevoTelefonoReferencia=0L;
				this.telefonoreferencias.removeAll(telefonoreferenciasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTelefonoReferencia 
					&& this.telefonoreferenciaLogic.getTelefonoReferencias().size()>0
					) {
					telefonoreferenciaAux=this.telefonoreferenciaLogic.getTelefonoReferencias().get(this.telefonoreferenciaLogic.getTelefonoReferencias().size() - 1);
				
					if(telefonoreferenciaAux.getId()<0) {
						this.telefonoreferenciaLogic.getTelefonoReferencias().remove(telefonoreferenciaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTelefonoReferencia && this.telefonoreferencias.size()>0) {
					telefonoreferenciaAux=this.telefonoreferencias.get(this.telefonoreferencias.size() - 1);
				
					if(telefonoreferenciaAux.getId()<0) {
						this.telefonoreferencias.remove(telefonoreferenciaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTelefonoReferencia(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(telefonoreferencia.getId()<0) {
				this.telefonoreferenciaLogic.getTelefonoReferencias().remove(this.telefonoreferencia);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(telefonoreferencia.getId()<0) {
				this.telefonoreferencias.remove(this.telefonoreferencia);
			}
		}			
	}
	
	public void setEstadosInicialesTelefonoReferencia(List<TelefonoReferencia> telefonoreferenciasAux) throws Exception {
		TelefonoReferenciaConstantesFunciones.setEstadosInicialesTelefonoReferencia(telefonoreferenciasAux);
	}
	
	public void setEstadosInicialesTelefonoReferencia(TelefonoReferencia telefonoreferenciaAux) throws Exception {
		TelefonoReferenciaConstantesFunciones.setEstadosInicialesTelefonoReferencia(telefonoreferenciaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTelefonoReferenciaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTelefonoReferencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTelefonoReferenciaActual()) {
				if(!this.isEsNuevoTelefonoReferencia) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTelefonoReferencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTelefonoReferencia=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTelefonoReferenciaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Telefono Referencia ?", "MANTENIMIENTO DE Telefono Referencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTelefonoReferencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TelefonoReferencia telefonoreferencia) throws Exception {
		TelefonoReferenciaConstantesFunciones.seleccionarAsignar(this.telefonoreferencia,telefonoreferencia);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTelefonoReferencia=this.isPermisoActualizarOriginalTelefonoReferencia;
			
			
			this.seleccionarAsignar(telefonoreferencia);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TelefonoReferenciaConstantesFunciones.quitarEspaciosTelefonoReferencia(this.telefonoreferencia,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTelefonoReferencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.telefonoreferenciaSessionBean.setsFuncionBusquedaRapida(this.telefonoreferenciaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTelefonoReferencia) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTelefonoReferencia(esParaCancelar);				
				this.cancelarNuevoTelefonoReferencia(esParaCancelar);								
			}
			
			this.telefonoreferencia=new TelefonoReferencia();
			
			this.inicializarTelefonoReferencia();
			
			this.actualizarEstadoCeldasBotonesTelefonoReferencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTelefonoReferencia() throws Exception {
		try {
			TelefonoReferenciaConstantesFunciones.inicializarTelefonoReferencia(this.telefonoreferencia);
			
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
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.telefonoreferenciaLogic.getTelefonoReferencias().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTelefonoReferencias(String sAccionBusqueda,List<TelefonoReferencia> telefonoreferenciasParaReportes) throws Exception {
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
					sPathReporteFinal="TelefonoReferencia"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TelefonoReferenciaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TelefonoReferenciaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TelefonoReferencia"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Telefono Referencias");		
		parameters.put("busquedapor", TelefonoReferenciaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTelefonoReferencia=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TelefonoReferenciaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TelefonoReferenciaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTelefonoReferencia=new JRBeanArrayDataSource(TelefonoReferenciaJInternalFrame.TraerTelefonoReferenciaBeans(telefonoreferenciasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTelefonoReferencia);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TelefonoReferenciaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TelefonoReferenciaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TelefonoReferenciaBean.TraerTelefonoReferenciaBeans(telefonoreferenciasParaReportes).toArray()));
							
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
				this.generarExcelReporteTelefonoReferencias(sAccionBusqueda,sTipoArchivoReporte,telefonoreferenciasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTelefonoReferencias(sAccionBusqueda,sTipoArchivoReporte,telefonoreferenciasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTelefonoReferenciaActionPerformed(null);
					//this.generarExcelReporteTelefonoReferencias(sAccionBusqueda,sTipoArchivoReporte,telefonoreferenciasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTelefonoReferencias(sAccionBusqueda,sTipoArchivoReporte,telefonoreferenciasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTelefonoReferencias(sAccionBusqueda,sTipoArchivoReporte,telefonoreferenciasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTelefonoReferencias(sAccionBusqueda,sTipoArchivoReporte,telefonoreferenciasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTelefonoReferencias(String sAccionBusqueda,String sTipoArchivoReporte,List<TelefonoReferencia> telefonoreferenciasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefonoreferencia";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TelefonoReferencias");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTelefonoReferencia("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TelefonoReferencia telefonoreferencia : telefonoreferenciasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TelefonoReferenciaConstantesFunciones.generarExcelReporteDataTelefonoReferencia("NORMAL",row,workbook,telefonoreferencia,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono Referencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTelefonoReferencia(String sTipo,Row row,Workbook workbook) {
		
		TelefonoReferenciaConstantesFunciones.generarExcelReporteHeaderTelefonoReferencia(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTelefonoReferencias(String sAccionBusqueda,String sTipoArchivoReporte,List<TelefonoReferencia> telefonoreferenciasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefonoreferencia_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TelefonoReferencias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TelefonoReferencia telefonoreferencia : telefonoreferenciasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TelefonoReferenciaConstantesFunciones.getTelefonoReferenciaDescripcion(telefonoreferencia));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TelefonoReferenciaConstantesFunciones.LABEL_IDREFERENCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TelefonoReferenciaConstantesFunciones.LABEL_IDREFERENCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(telefonoreferencia.getreferencia_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TelefonoReferenciaConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TelefonoReferenciaConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(telefonoreferencia.getnumero());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono Referencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTelefonoReferencias(String sAccionBusqueda,String sTipoArchivoReporte,List<TelefonoReferencia> telefonoreferenciasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TelefonoReferencia> telefonoreferenciasRespaldo=null;
		
		classes=TelefonoReferenciaConstantesFunciones.getClassesRelationshipsOfTelefonoReferencia(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.telefonoreferenciaLogic.setDatosCliente(this.datosCliente);
		this.telefonoreferenciaLogic.setDatosDeep(this.datosDeep);
		this.telefonoreferenciaLogic.setIsConDeep(true);
		
		telefonoreferenciasRespaldo=this.telefonoreferenciaLogic.getTelefonoReferencias();
		
		this.telefonoreferenciaLogic.setTelefonoReferencias(telefonoreferenciasParaReportes);	
		this.telefonoreferenciaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		telefonoreferenciasParaReportes=this.telefonoreferenciaLogic.getTelefonoReferencias();
		this.telefonoreferenciaLogic.setTelefonoReferencias(telefonoreferenciasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefonoreferencia_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TelefonoReferencias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTelefonoReferencia("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TelefonoReferencia telefonoreferencia : telefonoreferenciasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTelefonoReferencia("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TelefonoReferenciaConstantesFunciones.generarExcelReporteDataTelefonoReferencia("NORMAL",row,workbook,telefonoreferencia,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TelefonoReferenciaConstantesFunciones.getTelefonoReferenciaDescripcion(telefonoreferencia));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono Referencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTelefonoReferencia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTelefonoReferencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTelefonoReferencia.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTelefonoReferencia.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTelefonoReferencia() throws Exception {		
		this.startProcessTelefonoReferencia(true);
	}
	
	public void startProcessTelefonoReferencia(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTelefonoReferencia ,this.jPanelParametrosReportesTelefonoReferencia, this.jScrollPanelDatosTelefonoReferencia,this.jPanelPaginacionTelefonoReferencia, this.jScrollPanelDatosEdicionTelefonoReferencia, this.jPanelAccionesTelefonoReferencia,this.jPanelAccionesFormularioTelefonoReferencia,this.jmenuBarTelefonoReferencia,this.jmenuBarDetalleTelefonoReferencia,this.jTtoolBarTelefonoReferencia,this.jTtoolBarDetalleTelefonoReferencia);		
		
		final JTabbedPane jTabbedPaneBusquedasTelefonoReferencia=this.jTabbedPaneBusquedasTelefonoReferencia; 
		
		final JPanel jPanelParametrosReportesTelefonoReferencia=this.jPanelParametrosReportesTelefonoReferencia;
		//final JScrollPane jScrollPanelDatosTelefonoReferencia=this.jScrollPanelDatosTelefonoReferencia;
		final JTable jTableDatosTelefonoReferencia=this.jTableDatosTelefonoReferencia;		
		final JPanel jPanelPaginacionTelefonoReferencia=this.jPanelPaginacionTelefonoReferencia;
		//final JScrollPane jScrollPanelDatosEdicionTelefonoReferencia=this.jScrollPanelDatosEdicionTelefonoReferencia;
		final JPanel jPanelAccionesTelefonoReferencia=this.jPanelAccionesTelefonoReferencia;
		
		JPanel jPanelCamposAuxiliarTelefonoReferencia=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTelefonoReferencia=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
			jPanelCamposAuxiliarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jPanelCamposTelefonoReferencia;
			jPanelAccionesFormularioAuxiliarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jPanelAccionesFormularioTelefonoReferencia;
		}
		
		final JPanel jPanelCamposTelefonoReferencia=jPanelCamposAuxiliarTelefonoReferencia;
		final JPanel jPanelAccionesFormularioTelefonoReferencia=jPanelAccionesFormularioAuxiliarTelefonoReferencia;
		
		
		final JMenuBar jmenuBarTelefonoReferencia=this.jmenuBarTelefonoReferencia;
		final JToolBar jTtoolBarTelefonoReferencia=this.jTtoolBarTelefonoReferencia;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTelefonoReferencia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTelefonoReferencia=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
			jmenuBarDetalleAuxiliarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jmenuBarDetalleTelefonoReferencia;
			jTtoolBarDetalleAuxiliarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jTtoolBarDetalleTelefonoReferencia;
		}
		
		final JMenuBar jmenuBarDetalleTelefonoReferencia=jmenuBarDetalleAuxiliarTelefonoReferencia;
		final JToolBar jTtoolBarDetalleTelefonoReferencia=jTtoolBarDetalleAuxiliarTelefonoReferencia;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTelefonoReferencia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTelefonoReferencia;
			processRunnable.jTableDatos=jTableDatosTelefonoReferencia;
			processRunnable.jPanelCampos=jPanelCamposTelefonoReferencia;
			processRunnable.jPanelPaginacion=jPanelPaginacionTelefonoReferencia;
			processRunnable.jPanelAcciones=jPanelAccionesTelefonoReferencia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTelefonoReferencia;
			
			
			processRunnable.jmenuBar=jmenuBarTelefonoReferencia;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTelefonoReferencia;
			processRunnable.jTtoolBar=jTtoolBarTelefonoReferencia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTelefonoReferencia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTelefonoReferencia ,jPanelParametrosReportesTelefonoReferencia,jTableDatosTelefonoReferencia, /*jScrollPanelDatosTelefonoReferencia,*/jPanelCamposTelefonoReferencia,jPanelPaginacionTelefonoReferencia, /*jScrollPanelDatosEdicionTelefonoReferencia,*/ jPanelAccionesTelefonoReferencia,jPanelAccionesFormularioTelefonoReferencia,jmenuBarTelefonoReferencia,jmenuBarDetalleTelefonoReferencia,jTtoolBarTelefonoReferencia,jTtoolBarDetalleTelefonoReferencia);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTelefonoReferencia ,jPanelParametrosReportesTelefonoReferencia, jScrollPanelDatosTelefonoReferencia,jPanelPaginacionTelefonoReferencia, jScrollPanelDatosEdicionTelefonoReferencia, jPanelAccionesTelefonoReferencia,jPanelAccionesFormularioTelefonoReferencia,jmenuBarTelefonoReferencia,jmenuBarDetalleTelefonoReferencia,jTtoolBarTelefonoReferencia,jTtoolBarDetalleTelefonoReferencia);
						
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
	
	public void finishProcessTelefonoReferencia() {// throws Exception 
		this.finishProcessTelefonoReferencia(true);
	}
	
	public void finishProcessTelefonoReferencia(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTelefonoReferencia ,this.jPanelParametrosReportesTelefonoReferencia, this.jScrollPanelDatosTelefonoReferencia,this.jPanelPaginacionTelefonoReferencia, this.jScrollPanelDatosEdicionTelefonoReferencia, this.jPanelAccionesTelefonoReferencia,this.jPanelAccionesFormularioTelefonoReferencia,this.jmenuBarTelefonoReferencia,this.jmenuBarDetalleTelefonoReferencia,this.jTtoolBarTelefonoReferencia,this.jTtoolBarDetalleTelefonoReferencia);		
		
		final JTabbedPane jTabbedPaneBusquedasTelefonoReferencia=this.jTabbedPaneBusquedasTelefonoReferencia; 
		
		final JPanel jPanelParametrosReportesTelefonoReferencia=this.jPanelParametrosReportesTelefonoReferencia;
		//final JScrollPane jScrollPanelDatosTelefonoReferencia=this.jScrollPanelDatosTelefonoReferencia;
		final JTable jTableDatosTelefonoReferencia=this.jTableDatosTelefonoReferencia;		
		final JPanel jPanelPaginacionTelefonoReferencia=this.jPanelPaginacionTelefonoReferencia;
		//final JScrollPane jScrollPanelDatosEdicionTelefonoReferencia=this.jScrollPanelDatosEdicionTelefonoReferencia;
		final JPanel jPanelAccionesTelefonoReferencia=this.jPanelAccionesTelefonoReferencia;
		
		JPanel jPanelCamposAuxiliarTelefonoReferencia=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTelefonoReferencia=new JPanel();
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
			jPanelCamposAuxiliarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jPanelCamposTelefonoReferencia;
			jPanelAccionesFormularioAuxiliarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jPanelAccionesFormularioTelefonoReferencia;
		}
		
		final JPanel jPanelCamposTelefonoReferencia=jPanelCamposAuxiliarTelefonoReferencia;
		final JPanel jPanelAccionesFormularioTelefonoReferencia=jPanelAccionesFormularioAuxiliarTelefonoReferencia;
		
		
		final JMenuBar jmenuBarTelefonoReferencia=this.jmenuBarTelefonoReferencia;		
		final JToolBar jTtoolBarTelefonoReferencia=this.jTtoolBarTelefonoReferencia;
				
		JMenuBar jmenuBarDetalleAuxiliarTelefonoReferencia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTelefonoReferencia=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
			jmenuBarDetalleAuxiliarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jmenuBarDetalleTelefonoReferencia;
			jTtoolBarDetalleAuxiliarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jTtoolBarDetalleTelefonoReferencia;		
		}
		
		final JMenuBar jmenuBarDetalleTelefonoReferencia=jmenuBarDetalleAuxiliarTelefonoReferencia;
		final JToolBar jTtoolBarDetalleTelefonoReferencia=jTtoolBarDetalleAuxiliarTelefonoReferencia;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTelefonoReferencia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTelefonoReferencia;
			processRunnable.jTableDatos=jTableDatosTelefonoReferencia;
			processRunnable.jPanelCampos=jPanelCamposTelefonoReferencia;
			processRunnable.jPanelPaginacion=jPanelPaginacionTelefonoReferencia;
			processRunnable.jPanelAcciones=jPanelAccionesTelefonoReferencia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTelefonoReferencia;
			
			
			processRunnable.jmenuBar=jmenuBarTelefonoReferencia;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTelefonoReferencia;
			processRunnable.jTtoolBar=jTtoolBarTelefonoReferencia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTelefonoReferencia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTelefonoReferencia ,jPanelParametrosReportesTelefonoReferencia, jTableDatosTelefonoReferencia,/*jScrollPanelDatosTelefonoReferencia,*/jPanelCamposTelefonoReferencia,jPanelPaginacionTelefonoReferencia, /*jScrollPanelDatosEdicionTelefonoReferencia,*/ jPanelAccionesTelefonoReferencia,jPanelAccionesFormularioTelefonoReferencia,jmenuBarTelefonoReferencia,jmenuBarDetalleTelefonoReferencia,jTtoolBarTelefonoReferencia,jTtoolBarDetalleTelefonoReferencia));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTelefonoReferencia(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTelefonoReferencia(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTelefonoReferencia(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTelefonoReferencia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTelefonoReferencia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTelefonoReferencia,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTelefonoReferencia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTelefonoReferencia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTelefonoReferencia,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.telefonoreferenciaConstantesFunciones.getsFinalQueryTelefonoReferencia();
		String  finalQueryPaginacionTodos=this.telefonoreferenciaConstantesFunciones.getsFinalQueryTelefonoReferencia();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TelefonoReferenciaConstantesFunciones.getArrayColumnasGlobalesNoTelefonoReferencia(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TelefonoReferenciaConstantesFunciones.getArrayColumnasGlobalesTelefonoReferencia(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TelefonoReferenciaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.telefonoreferenciasEliminados= new ArrayList<TelefonoReferencia>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTelefonoReferencia();
		
				///*TelefonoReferenciaSessionBean*/this.telefonoreferenciaSessionBean=new TelefonoReferenciaSessionBean();
			
			if(this.telefonoreferenciaSessionBean==null) {
				this.telefonoreferenciaSessionBean=new TelefonoReferenciaSessionBean();
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
					this.iNumeroPaginacion=TelefonoReferenciaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TelefonoReferenciaConstantesFunciones.getClassesForeignKeysOfTelefonoReferencia(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/telefonoreferencia."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			telefonoreferenciasAux= new ArrayList<TelefonoReferencia>();
			
				
			telefonoreferenciaLogic.setDatosCliente(this.datosCliente);
			telefonoreferenciaLogic.setDatosDeep(this.datosDeep);
			telefonoreferenciaLogic.setIsConDeep(true);
			
			
			telefonoreferenciaLogic.getTelefonoReferenciaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					telefonoreferenciaLogic.getTodosTelefonoReferencias(finalQueryGlobal,pagination);
					
					//telefonoreferenciaLogic.getTodosTelefonoReferenciasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(telefonoreferenciaLogic.getTelefonoReferencias()==null|| telefonoreferenciaLogic.getTelefonoReferencias().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							telefonoreferenciasAux= new ArrayList<TelefonoReferencia>();
							telefonoreferenciasAux.addAll(telefonoreferenciaLogic.getTelefonoReferencias());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefonoreferenciasAux= new ArrayList<TelefonoReferencia>();
							telefonoreferenciasAux.addAll(telefonoreferencias);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							telefonoreferenciaLogic.getTodosTelefonoReferencias(finalQueryGlobal+"",this.pagination);												
							
							//telefonoreferenciaLogic.getTodosTelefonoReferenciasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTelefonoReferencias("Todos",telefonoreferenciaLogic.getTelefonoReferencias() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							telefonoreferenciaLogic.setTelefonoReferencias(new ArrayList<TelefonoReferencia>());					
							telefonoreferenciaLogic.getTelefonoReferencias().addAll(telefonoreferenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefonoreferencias=new ArrayList<TelefonoReferencia>();
							telefonoreferencias.addAll(telefonoreferenciasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTelefonoReferencia=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTelefonoReferencia=this.idActual;
				
				} else if(this.idTelefonoReferenciaActual!=null && this.idTelefonoReferenciaActual!=0L) {
					idTelefonoReferencia=idTelefonoReferenciaActual;
				}
				
					
				this.sDetalleReporte=TelefonoReferenciaConstantesFunciones.getDetalleIndicePorId(idTelefonoReferencia);
				
				this.telefonoreferencias=new ArrayList<TelefonoReferencia>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					telefonoreferenciaLogic.getEntity(idTelefonoReferencia);
					
					//telefonoreferenciaLogic.getEntityWithConnection(idTelefonoReferencia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					telefonoreferenciaLogic.setTelefonoReferencias(new ArrayList<TelefonoReferencia>());
					telefonoreferenciaLogic.getTelefonoReferencias().add(telefonoreferenciaLogic.getTelefonoReferencia());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.telefonoreferencias=new ArrayList<TelefonoReferencia>();
					this.telefonoreferencias.add(telefonoreferencia);
				}
				
				if(telefonoreferenciaLogic.getTelefonoReferencia()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdReferencia")) {
				this.sDetalleReporte=TelefonoReferenciaConstantesFunciones.getDetalleIndiceFK_IdReferencia(id_referenciaFK_IdReferencia);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					telefonoreferenciaLogic.getTelefonoReferenciasFK_IdReferencia(finalQueryGlobal,pagination,id_referenciaFK_IdReferencia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TelefonoReferenciaConstantesFunciones.getDetalleIndiceFK_IdReferencia(id_referenciaFK_IdReferencia);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TelefonoReferenciaConstantesFunciones.getDetalleIndiceFK_IdReferencia(id_referenciaFK_IdReferencia);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=telefonoreferenciaLogic.getTelefonoReferencias()==null||telefonoreferenciaLogic.getTelefonoReferencias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=telefonoreferencias==null|| telefonoreferencias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonoreferenciasAux=new ArrayList<TelefonoReferencia>();
						telefonoreferenciasAux.addAll(telefonoreferenciaLogic.getTelefonoReferencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefonoreferenciasAux=new ArrayList<TelefonoReferencia>();
							telefonoreferenciasAux.addAll(telefonoreferencias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							telefonoreferenciaLogic.getTelefonoReferenciasFK_IdReferencia(finalQueryGlobal,pagination,id_referenciaFK_IdReferencia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TelefonoReferenciaConstantesFunciones.getDetalleIndiceFK_IdReferencia(id_referenciaFK_IdReferencia);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TelefonoReferenciaConstantesFunciones.getDetalleIndiceFK_IdReferencia(id_referenciaFK_IdReferencia);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTelefonoReferencias("FK_IdReferencia",telefonoreferenciaLogic.getTelefonoReferencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTelefonoReferencias("FK_IdReferencia",telefonoreferencias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonoreferenciaLogic.setTelefonoReferencias(new ArrayList<TelefonoReferencia>());
						telefonoreferenciaLogic.getTelefonoReferencias().addAll(telefonoreferenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefonoreferencias=new ArrayList<TelefonoReferencia>();
							telefonoreferencias.addAll(telefonoreferenciasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTelefonoReferencia();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTelefonoReferencia();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=telefonoreferenciaLogic.getTelefonoReferencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=telefonoreferencias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=telefonoreferenciaLogic.getTelefonoReferencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=telefonoreferencias.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TelefonoReferencia telefonoreferencia) {
		Boolean permite=true;
		
		if(this.telefonoreferencia.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TelefonoReferenciaConstantesFunciones.getOrderByListaTelefonoReferencia();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TelefonoReferenciaConstantesFunciones.getOrderByListaTelefonoReferencia();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TelefonoReferencia telefonoreferencia:telefonoreferenciaLogic.getTelefonoReferencias()) {
				if(telefonoreferencia.getsType().equals(Constantes2.S_TOTALES)) {
					telefonoreferenciaTotales=telefonoreferencia;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TelefonoReferencia telefonoreferencia:this.telefonoreferencias) {
				if(telefonoreferencia.getsType().equals(Constantes2.S_TOTALES)) {
					telefonoreferenciaTotales=telefonoreferencia;
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
			this.telefonoreferenciaAux=new TelefonoReferencia();
			this.telefonoreferenciaAux.setsType(Constantes2.S_TOTALES);
			this.telefonoreferenciaAux.setIsNew(false);
			this.telefonoreferenciaAux.setIsChanged(false);
			this.telefonoreferenciaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TelefonoReferenciaConstantesFunciones.TotalizarValoresFilaTelefonoReferencia(this.telefonoreferenciaLogic.getTelefonoReferencias(),this.telefonoreferenciaAux);
				
				this.telefonoreferenciaLogic.getTelefonoReferencias().add(this.telefonoreferenciaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TelefonoReferenciaConstantesFunciones.TotalizarValoresFilaTelefonoReferencia(this.telefonoreferencias,this.telefonoreferenciaAux);
				
				this.telefonoreferencias.add(this.telefonoreferenciaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		telefonoreferenciaTotales=new TelefonoReferencia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.telefonoreferenciaLogic.getTelefonoReferencias().remove(telefonoreferenciaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.telefonoreferencias.remove(telefonoreferenciaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		telefonoreferenciaTotales=new TelefonoReferencia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TelefonoReferencia telefonoreferencia:telefonoreferenciaLogic.getTelefonoReferencias()) {
				if(telefonoreferencia.getsType().equals(Constantes2.S_TOTALES)) {
					telefonoreferenciaTotales=telefonoreferencia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TelefonoReferenciaConstantesFunciones.TotalizarValoresFilaTelefonoReferencia(this.telefonoreferenciaLogic.getTelefonoReferencias(),telefonoreferenciaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TelefonoReferencia telefonoreferencia:this.telefonoreferencias) {
				if(telefonoreferencia.getsType().equals(Constantes2.S_TOTALES)) {
					telefonoreferenciaTotales=telefonoreferencia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TelefonoReferenciaConstantesFunciones.TotalizarValoresFilaTelefonoReferencia(this.telefonoreferencias,telefonoreferenciaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTelefonoReferenciasFK_IdReferencia()throws Exception {
		try {
			sAccionBusqueda="FK_IdReferencia";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTelefonoReferenciasFK_IdReferencia(String sFinalQuery,Long id_referencia)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					telefonoreferenciaLogic.getTelefonoReferenciasFK_IdReferencia(sFinalQuery,this.pagination,id_referencia);
				
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
	
	public void inicializarPermisosTelefonoReferencia() {
		this.isPermisoTodoTelefonoReferencia=false;
		this.isPermisoNuevoTelefonoReferencia=false;
		this.isPermisoActualizarTelefonoReferencia=false;
		this.isPermisoActualizarOriginalTelefonoReferencia=false;
		this.isPermisoEliminarTelefonoReferencia=false;
		this.isPermisoGuardarCambiosTelefonoReferencia=false;
		this.isPermisoConsultaTelefonoReferencia=false;
		this.isPermisoBusquedaTelefonoReferencia=false;
		this.isPermisoReporteTelefonoReferencia=false;		
		this.isPermisoOrdenTelefonoReferencia=false;		
		this.isPermisoPaginacionMedioTelefonoReferencia=false;		
		this.isPermisoPaginacionAltoTelefonoReferencia=false;
		this.isPermisoPaginacionTodoTelefonoReferencia=false;
		this.isPermisoCopiarTelefonoReferencia=false;		
		this.isPermisoVerFormTelefonoReferencia=false;		
		this.isPermisoDuplicarTelefonoReferencia=false;		
		this.isPermisoOrdenTelefonoReferencia=false;		
	}
	
	public void setPermisosUsuarioTelefonoReferencia(Boolean isPermiso) {
		this.isPermisoTodoTelefonoReferencia=isPermiso;
		this.isPermisoNuevoTelefonoReferencia=isPermiso;
		this.isPermisoActualizarTelefonoReferencia=isPermiso;
		this.isPermisoActualizarOriginalTelefonoReferencia=isPermiso;
		this.isPermisoEliminarTelefonoReferencia=isPermiso;
		this.isPermisoGuardarCambiosTelefonoReferencia=isPermiso;
		this.isPermisoConsultaTelefonoReferencia=isPermiso;
		this.isPermisoBusquedaTelefonoReferencia=isPermiso;
		this.isPermisoReporteTelefonoReferencia=isPermiso;
		this.isPermisoOrdenTelefonoReferencia=isPermiso;		
		this.isPermisoPaginacionMedioTelefonoReferencia=isPermiso;		
		this.isPermisoPaginacionAltoTelefonoReferencia=isPermiso;		
		this.isPermisoPaginacionTodoTelefonoReferencia=isPermiso;		
		this.isPermisoCopiarTelefonoReferencia=isPermiso;		
		this.isPermisoVerFormTelefonoReferencia=isPermiso;		
		this.isPermisoDuplicarTelefonoReferencia=isPermiso;
		this.isPermisoOrdenTelefonoReferencia=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTelefonoReferencia(Boolean isPermiso) {
		//this.isPermisoTodoTelefonoReferencia=isPermiso;
		this.isPermisoNuevoTelefonoReferencia=isPermiso;
		this.isPermisoActualizarTelefonoReferencia=isPermiso;
		this.isPermisoActualizarOriginalTelefonoReferencia=isPermiso;
		this.isPermisoEliminarTelefonoReferencia=isPermiso;
		this.isPermisoGuardarCambiosTelefonoReferencia=isPermiso;
		//this.isPermisoConsultaTelefonoReferencia=isPermiso;
		//this.isPermisoBusquedaTelefonoReferencia=isPermiso;
		//this.isPermisoReporteTelefonoReferencia=isPermiso;
		//this.isPermisoOrdenTelefonoReferencia=isPermiso;		
		//this.isPermisoPaginacionMedioTelefonoReferencia=isPermiso;		
		//this.isPermisoPaginacionAltoTelefonoReferencia=isPermiso;		
		//this.isPermisoPaginacionTodoTelefonoReferencia=isPermiso;		
		//this.isPermisoCopiarTelefonoReferencia=isPermiso;		
		//this.isPermisoDuplicarTelefonoReferencia=isPermiso;
		//this.isPermisoOrdenTelefonoReferencia=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTelefonoReferenciaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TelefonoReferenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTelefonoReferencia(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTelefonoReferenciaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTelefonoReferenciaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTelefonoReferenciaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTelefonoReferenciaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTelefonoReferencia() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TelefonoReferenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TelefonoReferenciaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTelefonoReferencia=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTelefonoReferencia=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTelefonoReferencia=this.isPermisoActualizarTelefonoReferencia;
			this.isPermisoEliminarTelefonoReferencia=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTelefonoReferencia=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTelefonoReferencia=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTelefonoReferencia=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTelefonoReferencia=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTelefonoReferencia=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTelefonoReferencia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTelefonoReferencia=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTelefonoReferencia=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTelefonoReferencia=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTelefonoReferencia=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTelefonoReferencia=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTelefonoReferencia=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTelefonoReferencia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTelefonoReferencia.setToolTipText(this.jTableDatosTelefonoReferencia.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTelefonoReferencia(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTelefonoReferencia(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TelefonoReferenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TelefonoReferenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTelefonoReferencia() throws Exception {
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
	public void inicializarCombosForeignKeyTelefonoReferenciaListas()throws Exception {
		try	{						
			
				this.referenciasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTelefonoReferenciaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TelefonoReferenciaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTelefonoReferenciaListas(false);
			} else {
			
				this.cargarCombosForeignKeyReferenciaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyReferenciaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.referenciasForeignKey==null||this.referenciasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ReferenciaConstantesFunciones.getArrayColumnasGlobalesReferencia(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ReferenciaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ReferenciaConstantesFunciones.SFINALQUERY;

				this.cargarCombosReferenciasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTelefonoReferenciaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TelefonoReferenciaParameterReturnGeneral telefonoreferenciaReturnGeneral=new TelefonoReferenciaParameterReturnGeneral();
						
			


				String finalQueryGlobalReferencia="";

				if(((this.referenciasForeignKey==null||this.referenciasForeignKey.size()<=0) && this.telefonoreferenciaConstantesFunciones.cargarid_referenciaTelefonoReferencia)
					 || (this.esRecargarFks && this.telefonoreferenciaConstantesFunciones.cargarid_referenciaTelefonoReferencia)) {

					if(!this.telefonoreferenciaSessionBean.getisBusquedaDesdeForeignKeySesionReferencia()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ReferenciaConstantesFunciones.getArrayColumnasGlobalesReferencia(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalReferencia=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ReferenciaConstantesFunciones.TABLENAME);

						finalQueryGlobalReferencia=Funciones.GetFinalQueryAppend(finalQueryGlobalReferencia, "");
						finalQueryGlobalReferencia+=ReferenciaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosReferenciasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalReferencia=" WHERE " + ConstantesSql.ID + "="+telefonoreferenciaSessionBean.getlidReferenciaActual();
					}
				} else {
					finalQueryGlobalReferencia="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				telefonoreferenciaReturnGeneral=telefonoreferenciaLogic.cargarCombosLoteForeignKeyTelefonoReferencia(finalQueryGlobalReferencia);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalReferencia.equals("NONE")) {
				this.referenciasForeignKey=telefonoreferenciaReturnGeneral.getreferenciasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTelefonoReferencia()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyReferencia();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyReferencia()throws Exception {
		try {
			if(this.telefonoreferenciaSessionBean==null) {
				this.telefonoreferenciaSessionBean=new TelefonoReferenciaSessionBean();
			}

			if(!this.telefonoreferenciaSessionBean.getisBusquedaDesdeForeignKeySesionReferencia()) {
				Referencia referencia=new Referencia();
				ReferenciaConstantesFunciones.setReferenciaDescripcion(referencia,Constantes.SMENSAJE_ESCOJA_OPCION);
				referencia.setId(null);

				if(!ReferenciaConstantesFunciones.ExisteEnLista(this.referenciasForeignKey,referencia,true)) {

					this.referenciasForeignKey.add(0,referencia);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTelefonoReferencia()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTelefonoReferencia(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTelefonoReferencia()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTelefonoReferencia();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTelefonoReferencia(TelefonoReferencia telefonoreferencia)throws Exception {	
		try {
			
			this.setActualReferenciaForeignKey(telefonoreferencia.getid_referencia(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTelefonoReferencia(TelefonoReferencia telefonoreferencia,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTelefonoReferencia()throws Exception {	
		try {
			
			this.setActualReferenciaForeignKey(this.telefonoreferenciaConstantesFunciones.getid_referencia(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTelefonoReferencia()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTelefonoReferencia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTelefonoReferencia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTelefonoReferencia()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTelefonoReferencia()throws Exception {
		try {
			

			this.cargarCombosFrameReferenciasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTelefonoReferencia(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameReferenciasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTelefonoReferencia()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxid_referenciaTelefonoReferencia!=null && this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxid_referenciaTelefonoReferencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxid_referenciaTelefonoReferencia.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TelefonoReferenciaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TelefonoReferenciaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TelefonoReferenciaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.telefonoreferenciaSessionBean=new TelefonoReferenciaSessionBean(); 
		this.telefonoreferenciaConstantesFunciones=new TelefonoReferenciaConstantesFunciones(); 
		this.telefonoreferenciaBean=new TelefonoReferencia();//(this.telefonoreferenciaConstantesFunciones); 		
		this.telefonoreferenciaReturnGeneral=new TelefonoReferenciaParameterReturnGeneral(); 
		
		this.telefonoreferenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.telefonoreferenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TelefonoReferenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TelefonoReferenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TelefonoReferenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTelefonoReferencia(true);
			
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
			
			this.telefonoreferenciaConstantesFunciones=new TelefonoReferenciaConstantesFunciones(); 
			this.telefonoreferenciaBean=new TelefonoReferencia();//this.telefonoreferenciaConstantesFunciones); 			
			this.telefonoreferenciaReturnGeneral=new TelefonoReferenciaParameterReturnGeneral(); 
		
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Telefono Referencia Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.telefonoreferencia=new TelefonoReferencia();
			this.telefonoreferencias = new ArrayList<TelefonoReferencia>();
			this.telefonoreferenciasAux = new ArrayList<TelefonoReferencia>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic=new TelefonoReferenciaLogic();
				this.telefonoreferenciaLogic.getNewConnexionToDeep("");
			}
			
			//this.telefonoreferenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.telefonoreferenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTelefonoReferencia);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTelefonoReferencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTelefonoReferencia);	
					}
					
					if(this.jInternalFrameImportacionTelefonoReferencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTelefonoReferencia);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTelefonoReferencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTelefonoReferencia);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTelefonoReferencia);
				this.jInternalFrameDetalleFormTelefonoReferencia.setVisible(false);
				this.jInternalFrameDetalleFormTelefonoReferencia.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTelefonoReferencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTelefonoReferencia);
					this.jInternalFrameReporteDinamicoTelefonoReferencia.setVisible(false);
					this.jInternalFrameReporteDinamicoTelefonoReferencia.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTelefonoReferencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTelefonoReferencia);
					this.jInternalFrameImportacionTelefonoReferencia.setVisible(false);
					this.jInternalFrameImportacionTelefonoReferencia.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTelefonoReferencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTelefonoReferencia);
					this.jInternalFrameOrderByTelefonoReferencia.setVisible(false);
					this.jInternalFrameOrderByTelefonoReferencia.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTelefonoReferenciaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TelefonoReferenciaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.telefonoreferenciaReturnGeneral=new TelefonoReferenciaParameterReturnGeneral();
			
			this.telefonoreferenciaParameterGeneral=new TelefonoReferenciaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.telefonoreferenciaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TelefonoReferenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TelefonoReferenciaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.telefonoreferenciaSessionBean.getEsGuardarRelacionado(),this.telefonoreferenciaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TelefonoReferenciaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.telefonoreferenciaSessionBean.getEsGuardarRelacionado(),this.telefonoreferenciaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTelefonoReferencia=false;
			this.isVisibilidadCeldaDuplicarTelefonoReferencia=true;
			this.isVisibilidadCeldaCopiarTelefonoReferencia=true;
			this.isVisibilidadCeldaVerFormTelefonoReferencia=true;
			this.isVisibilidadCeldaOrdenTelefonoReferencia=true;
			this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia=false;
			this.isVisibilidadCeldaModificarTelefonoReferencia=false;
			this.isVisibilidadCeldaActualizarTelefonoReferencia=false;
			this.isVisibilidadCeldaEliminarTelefonoReferencia=false;
			this.isVisibilidadCeldaCancelarTelefonoReferencia=false;
			this.isVisibilidadCeldaGuardarTelefonoReferencia=false;
			this.isVisibilidadCeldaGuardarCambiosTelefonoReferencia=false;
			
			
			this.isVisibilidadFK_IdReferencia=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTelefonoReferencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTelefonoReferencia();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTelefonoReferencia(false);
			
			this.setPermisosUsuarioTelefonoReferencia();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado() 
				|| (this.telefonoreferenciaSessionBean.getEsGuardarRelacionado() && this.telefonoreferenciaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTelefonoReferenciaClasesRelacionadas();
			}
			
			if(this.telefonoreferenciaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTelefonoReferenciaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTelefonoReferencia();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTelefonoReferencia();
			}
			
			if(!this.isPermisoBusquedaTelefonoReferencia) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTelefonoReferencia.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTelefonoReferencia,this.isPermisoPaginacionMedioTelefonoReferencia,this.isPermisoPaginacionTodoTelefonoReferencia);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TelefonoReferenciaConstantesFunciones.getTiposSeleccionarTelefonoReferencia());
				
				this.tiposColumnasSelect=TelefonoReferenciaConstantesFunciones.getTiposSeleccionarTelefonoReferencia(true);
				
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
			//if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTelefonoReferencia();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTelefonoReferencia(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTelefonoReferencia(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTelefonoReferencia() ;
			
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
			
			this.referenciaLogic=new ReferenciaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				telefonoreferenciaImplementable= (TelefonoReferenciaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TelefonoReferenciaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				telefonoreferenciaImplementableHome= (TelefonoReferenciaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TelefonoReferenciaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.telefonoreferencias= new ArrayList<TelefonoReferencia>();
			this.telefonoreferenciasEliminados= new ArrayList<TelefonoReferencia>();
						
			this.isEsNuevoTelefonoReferencia=false;
			this.esParaAccionDesdeFormularioTelefonoReferencia=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.referenciasForeignKey=new ArrayList<Referencia>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTelefonoReferencia(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTelefonoReferencia();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TelefonoReferenciaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTelefonoReferencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTelefonoReferencia(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTelefonoReferencia();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTelefonoReferencia();
			}
			
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTelefonoReferencia.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTelefonoReferencia.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTelefonoReferencia.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTelefonoReferencia(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TelefonoReferencia: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTelefonoReferencia() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTelefonoReferencia")) {
				iIndex=this.jInternalFrameDetalleFormTelefonoReferencia.jTabbedPaneRelacionesTelefonoReferencia.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTelefonoReferencia.jTabbedPaneRelacionesTelefonoReferencia.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTelefonoReferencia();	
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
	
	public void cargarCombosForeignKeyTelefonoReferencia(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTelefonoReferencia(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTelefonoReferencia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTelefonoReferenciaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTelefonoReferencia();
		
		this.cargarCombosFrameForeignKeyTelefonoReferencia();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTelefonoReferencia();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTelefonoReferencia();
		}
	}
	
	

	public void cargarCombosForeignKeyReferencia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyReferenciaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyReferencia();
				this.cargarCombosFrameReferenciasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaReferencia(this.referenciasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTelefonoReferenciaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.telefonoreferenciaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTelefonoReferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
			
			
			if(jTableDatosTelefonoReferencia.getRowCount()>=1) {
				jTableDatosTelefonoReferencia.removeRowSelectionInterval(0, jTableDatosTelefonoReferencia.getRowCount()-1);						
			}
			
			this.isEsNuevoTelefonoReferencia=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTelefonoReferencia(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTelefonoReferencia(true);			
			//this.telefonoreferencia=new TelefonoReferencia();
			//this.telefonoreferencia.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTelefonoReferencia(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTelefonoReferencia() ;
			
			if(TelefonoReferenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTelefonoReferencia(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.telefonoreferencia);	
			this.actualizarInformacion("INFO_PADRE",false,this.telefonoreferencia);				
			
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
			
			if(this.telefonoreferenciaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TelefonoReferencia: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTelefonoReferenciaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TelefonoReferencia> telefonoreferenciasSeleccionados=new ArrayList<TelefonoReferencia>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTelefonoReferencia.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTelefonoReferencia.getSelectedRows().length;			
			}
			
			telefonoreferenciasSeleccionados=this.getTelefonoReferenciasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTelefonoReferencia--;			
				//TelefonoReferencia telefonoreferenciaAux= new TelefonoReferencia();			
				//telefonoreferenciaAux.setId(this.iIdNuevoTelefonoReferencia);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TelefonoReferencia telefonoreferenciaOrigen=new TelefonoReferencia();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TelefonoReferencia telefonoreferenciaOrigen : telefonoreferenciasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							telefonoreferenciaOrigen =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefonoreferenciaOrigen =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTelefonoReferencia();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.telefonoreferencia.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTelefonoReferencia(telefonoreferenciaOrigen,this.telefonoreferencia,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTelefonoReferencia(this.telefonoreferencia);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.telefonoreferenciaLogic.getTelefonoReferencias().add(this.telefonoreferenciaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.telefonoreferencias.add(this.telefonoreferenciaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTelefonoReferencia(false);
				
				this.jTableDatosTelefonoReferencia.setRowSelectionInterval(this.getIndiceNuevoTelefonoReferencia(), this.getIndiceNuevoTelefonoReferencia());
				
				int iLastRow =  this.jTableDatosTelefonoReferencia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTelefonoReferencia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTelefonoReferencia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTelefonoReferencia(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TelefonoReferencia> telefonoreferenciasSeleccionados=new ArrayList<TelefonoReferencia>();									
		
			TelefonoReferencia telefonoreferenciaOrigen=new TelefonoReferencia();
			TelefonoReferencia telefonoreferenciaDestino=new TelefonoReferencia();
				
			telefonoreferenciasSeleccionados=this.getTelefonoReferenciasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTelefonoReferencia.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || telefonoreferenciasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTelefonoReferencia.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonoreferenciaOrigen =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						telefonoreferenciaOrigen =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonoreferenciaDestino =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						telefonoreferenciaDestino =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				telefonoreferenciaOrigen =telefonoreferenciasSeleccionados.get(0);
				telefonoreferenciaDestino =telefonoreferenciasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTelefonoReferencia(telefonoreferenciaOrigen,telefonoreferenciaDestino,true,false);
				
				telefonoreferenciaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(telefonoreferenciaDestino,telefonoreferenciaLogic.getTelefonoReferencias());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(telefonoreferenciaDestino,telefonoreferencias);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTelefonoReferencia(false);
				
				//this.jTableDatosTelefonoReferencia.setRowSelectionInterval(this.getIndiceNuevoTelefonoReferencia(), this.getIndiceNuevoTelefonoReferencia());
				
				int iLastRow =  this.jTableDatosTelefonoReferencia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTelefonoReferencia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTelefonoReferencia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTelefonoReferencia(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTelefonoReferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTelefonoReferencia.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTelefonoReferencia.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTelefonoReferencia.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTelefonoReferencia.setVisible(!isVisible);
			this.jPanelPaginacionTelefonoReferencia.setVisible(!isVisible);
			this.jPanelAccionesTelefonoReferencia.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTelefonoReferencia();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTelefonoReferencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTelefonoReferencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTelefonoReferencia();
			
			this.abrirFrameOrderByTelefonoReferencia();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTelefonoReferencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTelefonoReferencia(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTelefonoReferencia);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTelefonoReferencia.isMaximum()) {
					this.jInternalFrameDetalleFormTelefonoReferencia.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTelefonoReferencia.setSize(this.jInternalFrameDetalleFormTelefonoReferencia.iWidthFormulario,this.jInternalFrameDetalleFormTelefonoReferencia.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTelefonoReferencia.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTelefonoReferencia.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTelefonoReferencia.isMaximum()) {
						this.jInternalFrameDetalleFormTelefonoReferencia.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTelefonoReferencia.jContentPaneDetalleTelefonoReferencia.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTelefonoReferencia.jTabbedPaneRelacionesTelefonoReferencia.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTelefonoReferencia.jContentPaneDetalleTelefonoReferencia.getWidth(),TelefonoReferenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTelefonoReferencia.jTabbedPaneRelacionesTelefonoReferencia.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTelefonoReferencia.jContentPaneDetalleTelefonoReferencia.getWidth(),TelefonoReferenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTelefonoReferencia.jTabbedPaneRelacionesTelefonoReferencia.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTelefonoReferencia.jContentPaneDetalleTelefonoReferencia.getWidth(),TelefonoReferenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTelefonoReferencia.setVisible(true);
	        this.jInternalFrameDetalleFormTelefonoReferencia.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTelefonoReferencia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTelefonoReferencia==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTelefonoReferencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTelefonoReferencia,false,this);
				} else {
					this.jInternalFrameOrderByTelefonoReferencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTelefonoReferencia,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTelefonoReferencia);
				this.jInternalFrameOrderByTelefonoReferencia.setVisible(false);
				this.jInternalFrameOrderByTelefonoReferencia.setSelected(false);
				
				this.jInternalFrameOrderByTelefonoReferencia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTelefonoReferencia"));
				
				this.inicializarActualizarBindingTablaOrderByTelefonoReferencia();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTelefonoReferencia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTelefonoReferencia==null) {
				
				this.jInternalFrameImportacionTelefonoReferencia=new ImportacionJInternalFrame(TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTelefonoReferencia);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTelefonoReferencia);
				this.jInternalFrameImportacionTelefonoReferencia.setVisible(false);
				this.jInternalFrameImportacionTelefonoReferencia.setSelected(false);


				this.jInternalFrameImportacionTelefonoReferencia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTelefonoReferencia"));
				this.jInternalFrameImportacionTelefonoReferencia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTelefonoReferencia"));
				this.jInternalFrameImportacionTelefonoReferencia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTelefonoReferencia"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTelefonoReferencia() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTelefonoReferencia==null) {
				this.jInternalFrameReporteDinamicoTelefonoReferencia=new ReporteDinamicoJInternalFrame(TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTelefonoReferencia);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTelefonoReferencia);
				this.jInternalFrameReporteDinamicoTelefonoReferencia.setVisible(false);
				this.jInternalFrameReporteDinamicoTelefonoReferencia.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTelefonoReferencia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTelefonoReferencia"));
				this.jInternalFrameReporteDinamicoTelefonoReferencia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTelefonoReferencia"));
				this.jInternalFrameReporteDinamicoTelefonoReferencia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTelefonoReferencia"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTelefonoReferencia();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTelefonoReferencia() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTelefonoReferencia);
			
	       	this.jInternalFrameDetalleFormTelefonoReferencia.setVisible(false);
	        this.jInternalFrameDetalleFormTelefonoReferencia.setSelected(false);
			
			//this.jInternalFrameDetalleFormTelefonoReferencia.dispose();
			//this.jInternalFrameDetalleFormTelefonoReferencia=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTelefonoReferencia() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTelefonoReferencia.setVisible(true);
	        this.jInternalFrameReporteDinamicoTelefonoReferencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTelefonoReferencia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTelefonoReferencia.setVisible(true);
	        this.jInternalFrameImportacionTelefonoReferencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTelefonoReferencia() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTelefonoReferencia.setVisible(true);
	        this.jInternalFrameOrderByTelefonoReferencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTelefonoReferencia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTelefonoReferencia.setVisible(false);
	        this.jInternalFrameOrderByTelefonoReferencia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTelefonoReferencia() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTelefonoReferencia.setVisible(false);
	        this.jInternalFrameReporteDinamicoTelefonoReferencia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTelefonoReferencia() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTelefonoReferencia.setVisible(false);
	        this.jInternalFrameImportacionTelefonoReferencia.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTelefonoReferencia(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTelefonoReferencia(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTelefonoReferencia(true);
			//this.isEsNuevoTelefonoReferencia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTelefonoReferencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTelefonoReferencia(false) ;
			
			if(telefonoreferenciaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TelefonoReferenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTelefonoReferencia(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTelefonoReferencia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTelefonoReferenciaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTelefonoReferencia(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTelefonoReferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTelefonoReferencia(true);
			//this.isEsNuevoTelefonoReferencia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.telefonoreferencia.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTelefonoReferencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTelefonoReferencia(false) ;
			
			if(TelefonoReferenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTelefonoReferencia(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTelefonoReferencia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaReferencia(List<Referencia> referenciasForeignKey)throws Exception{
		TableColumn tableColumnReferencia=this.jTableDatosTelefonoReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefonoReferencia,TelefonoReferenciaConstantesFunciones.LABEL_IDREFERENCIA));
		TableCellEditor tableCellEditorReferencia =tableColumnReferencia.getCellEditor();

		ReferenciaTableCell referenciaTableCellFk=(ReferenciaTableCell)tableCellEditorReferencia;

		if(referenciaTableCellFk!=null) {
			referenciaTableCellFk.setreferenciasForeignKey(referenciasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTelefonoReferencia.getSelectedRow();

		//if(intSelectedRow<=0) {
			//referenciaTableCellFk.setRowActual(intSelectedRow);
			//referenciaTableCellFk.setreferenciasForeignKeyActual(referenciasForeignKey);
		//}


		if(referenciaTableCellFk!=null) {
			referenciaTableCellFk.RecargarReferenciasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTelefonoReferencia(false);
			
			//if(!this.isEsNuevoTelefonoReferencia) {								
				int intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTelefonoReferencia(this.telefonoreferencia,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTelefonoReferencia(this.telefonoreferencia);
				
			}
			
			if(this.permiteMantenimiento(this.telefonoreferencia)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTelefonoReferencia=true;
					this.inicializarActualizarBindingTablaTelefonoReferencia(false);
					this.isEsNuevoTelefonoReferencia=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTelefonoReferencia=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTelefonoReferencia=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTelefonoReferencia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTelefonoReferencia(false);
				
				this.habilitarDeshabilitarControlesTelefonoReferencia(false);
			
												
				
				if(TelefonoReferenciaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTelefonoReferencia();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTelefonoReferenciaActionPerformed(evt,telefonoreferenciaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTelefonoReferencia(this.telefonoreferencia,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTelefonoReferencia.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,telefonoreferenciaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.telefonoreferencia.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TelefonoReferencia.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TelefonoReferencia.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				this.telefonoreferencia.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				this.telefonoreferencia.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.telefonoreferencia)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TelefonoReferenciaModel) this.jTableDatosTelefonoReferencia.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTelefonoReferencia=true;
				this.inicializarActualizarBindingTablaTelefonoReferencia(false);
				this.isEsNuevoTelefonoReferencia=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTelefonoReferencia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTelefonoReferencia(false);
				
				this.habilitarDeshabilitarControlesTelefonoReferencia(false);
				
				
				
				if(TelefonoReferenciaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTelefonoReferencia();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTelefonoReferencia.getRowCount()>=1) {
				jTableDatosTelefonoReferencia.removeRowSelectionInterval(0, jTableDatosTelefonoReferencia.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTelefonoReferencia(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTelefonoReferencia(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTelefonoReferencia(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTelefonoReferencia(false) ;
			
			this.isEsNuevoTelefonoReferencia=false;
			
			if(TelefonoReferenciaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTelefonoReferencia();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTelefonoReferencia(false);
				
				//SI ES MANUAL
				if(TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTelefonoReferencia();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTelefonoReferencia--;			
			//TelefonoReferencia telefonoreferenciaAux= new TelefonoReferencia();			
			//telefonoreferenciaAux.setId(this.iIdNuevoTelefonoReferencia);
			
			if(this.jInternalFrameDetalleFormTelefonoReferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTelefonoReferencia();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTelefonoReferencia(this.telefonoreferencia);
			
			this.telefonoreferencia.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.telefonoreferenciaLogic.getTelefonoReferencias().add(this.telefonoreferenciaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.telefonoreferencias.add(this.telefonoreferenciaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTelefonoReferencia(false);
			
			this.jTableDatosTelefonoReferencia.setRowSelectionInterval(this.getIndiceNuevoTelefonoReferencia(), this.getIndiceNuevoTelefonoReferencia());
			
			int iLastRow =  this.jTableDatosTelefonoReferencia.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTelefonoReferencia.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTelefonoReferencia.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTelefonoReferencia(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTelefonoReferencia(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTelefonoReferencia(false);
			
			//SI ES MANUAL
			if(TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTelefonoReferencia();
			}
			
			//this.abrirFrameTreeTelefonoReferencia();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Telefono ReferenciaS ?", "MANTENIMIENTO DE Telefono Referencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTelefonoReferencia.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTelefonoReferencia();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.telefonoreferenciaReturnGeneral=telefonoreferenciaLogic.procesarImportacionTelefonoReferenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.telefonoreferenciaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTelefonoReferenciaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTelefonoReferencia.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTelefonoReferencia.setFileImportacion(this.jInternalFrameImportacionTelefonoReferencia.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTelefonoReferencia.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTelefonoReferencia.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTelefonoReferencia.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTelefonoReferencia.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TelefonoReferencia> telefonoreferenciasSeleccionados=new ArrayList<TelefonoReferencia>();		

		telefonoreferenciasSeleccionados=this.getTelefonoReferenciasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTelefonoReferencia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTelefonoReferencia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TelefonoReferenciaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TelefonoReferenciaBaseDesign.jrxml";
			
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
			
			this.generarReporteTelefonoReferencias("Todos",telefonoreferenciasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono Referencia",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTelefonoReferencia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTelefonoReferencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TelefonoReferenciaConstantesFunciones.LABEL_IDREFERENCIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Referencia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Referencia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Referencia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Referencia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TelefonoReferenciaConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTelefonoReferencia.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTelefonoReferencia.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTelefonoReferencia.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TelefonoReferenciaConstantesFunciones.LABEL_IDREFERENCIA:
					sNombreCampoCategoria="id_referencia";
					break;

				case TelefonoReferenciaConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTelefonoReferencia.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TelefonoReferenciaConstantesFunciones.LABEL_IDREFERENCIA:
					sNombreCampoCategoriaValor="id_referencia";
					break;

				case TelefonoReferenciaConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTelefonoReferencia.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTelefonoReferencia.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TelefonoReferenciaConstantesFunciones.LABEL_IDREFERENCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Referencia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_referencia");
					break;

				case TelefonoReferenciaConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
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
	
	public void jButtonGenerarExcelReporteDinamicoTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TelefonoReferencia> telefonoreferenciasSeleccionados=new ArrayList<TelefonoReferencia>();		
		
		telefonoreferenciasSeleccionados=this.getTelefonoReferenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefonoreferencia";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TelefonoReferencias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTelefonoReferencia.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTelefonoReferencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TelefonoReferenciaConstantesFunciones.LABEL_IDREFERENCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TelefonoReferenciaConstantesFunciones.LABEL_IDREFERENCIA);
					iRow++;

					for(TelefonoReferencia telefonoreferencia:telefonoreferenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(telefonoreferencia.getreferencia_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TelefonoReferenciaConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TelefonoReferenciaConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(TelefonoReferencia telefonoreferencia:telefonoreferenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(telefonoreferencia.getnumero());
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
			//	this.getFilaCabeceraExportarExcelTelefonoReferencia(row);				
			//	iRow++;
			//}				
			
			//for(TelefonoReferencia telefonoreferenciaAux:telefonoreferenciasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTelefonoReferencia(telefonoreferenciaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono Referencia",JOptionPane.INFORMATION_MESSAGE);
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
				this.telefonoreferenciaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTelefonoReferencia(false);
			
			//SI ES MANUAL
			if(TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTelefonoReferencia();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTelefonoReferencia(false);
			
			//SI ES MANUAL
			if(TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTelefonoReferencia();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTelefonoReferencia(false);
			
			//SI ES MANUAL
			if(TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTelefonoReferencia();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTelefonoReferencia() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTelefonoReferencia.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTelefonoReferencia.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTelefonoReferencia.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTelefonoReferencia.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTelefonoReferencia.setMinimumSize(dimensionMinimum);
		this.jTableDatosTelefonoReferencia.setMaximumSize(dimensionMaximum);
		this.jTableDatosTelefonoReferencia.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTelefonoReferencia(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTelefonoReferencia(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTelefonoReferencia(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTelefonoReferencia(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTelefonoReferencia(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTelefonoReferencia(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTelefonoReferencia(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTelefonoReferencia(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTelefonoReferencia() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTelefonoReferencia();
		
		this.inicializarActualizarBindingBotonesManualTelefonoReferencia(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTelefonoReferencia();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTelefonoReferencia() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTelefonoReferencia(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTelefonoReferencia(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTelefonoReferencia.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTelefonoReferencia.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTelefonoReferencia.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTelefonoReferencia.jCheckBoxPostAccionNuevoTelefonoReferencia.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTelefonoReferencia.jCheckBoxPostAccionSinCerrarTelefonoReferencia.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTelefonoReferencia.jCheckBoxPostAccionSinMensajeTelefonoReferencia.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTelefonoReferencia.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTelefonoReferencia.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTelefonoReferencia.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
				this.jInternalFrameDetalleFormTelefonoReferencia.jCheckBoxPostAccionNuevoTelefonoReferencia.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTelefonoReferencia.jCheckBoxPostAccionSinCerrarTelefonoReferencia.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTelefonoReferencia.jCheckBoxPostAccionSinMensajeTelefonoReferencia.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTelefonoReferencia.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTelefonoReferencia.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxTiposAccionesFormularioTelefonoReferencia.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTelefonoReferencia.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTelefonoReferencia!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTelefonoReferencia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTelefonoReferencia.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTelefonoReferencia.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTelefonoReferencia.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTelefonoReferencia.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTelefonoReferencia!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTelefonoReferencia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTelefonoReferencia.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTelefonoReferencia.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTelefonoReferencia(Boolean esInicializar) throws Exception {
		try	{	
			if(TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTelefonoReferencia(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTelefonoReferencia() throws Exception {
		try	{
			if(TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTelefonoReferencia();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTelefonoReferencia() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxTiposAccionesFormularioTelefonoReferencia.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxTiposAccionesFormularioTelefonoReferencia.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTelefonoReferencia() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTelefonoReferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTelefonoReferencia.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTelefonoReferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTelefonoReferencia.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTelefonoReferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTelefonoReferencia.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTelefonoReferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTelefonoReferencia.addItem(reporte);
			}
			
			
			if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTelefonoReferencia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTelefonoReferencia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTelefonoReferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTelefonoReferencia.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTelefonoReferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTelefonoReferencia.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxTiposAccionesFormularioTelefonoReferencia.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxTiposAccionesFormularioTelefonoReferencia.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTelefonoReferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTelefonoReferencia.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTelefonoReferencia.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTelefonoReferencia();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTelefonoReferencia() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTelefonoReferencia!=null) {
				this.jInternalFrameReporteDinamicoTelefonoReferencia.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTelefonoReferencia.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTelefonoReferencia!=null) {
				this.jInternalFrameReporteDinamicoTelefonoReferencia.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTelefonoReferencia.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTelefonoReferencia!=null) {
				
				if(this.jInternalFrameReporteDinamicoTelefonoReferencia.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTelefonoReferencia.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTelefonoReferencia.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTelefonoReferencia.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTelefonoReferencia.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTelefonoReferencia.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTelefonoReferencia()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia.getSelectedItem()!=null){this.id_referenciaFK_IdReferencia=((Referencia)this.jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTelefonoReferencia(Boolean esInicializar) throws Exception {				
		if(TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTelefonoReferencia();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTelefonoReferencia() throws Exception {
		this.inicializarActualizarBindingTablaTelefonoReferencia(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTelefonoReferencia() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTelefonoReferencia.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTelefonoReferencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTelefonoReferencia.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TelefonoReferenciaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTelefonoReferencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTelefonoReferencia.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TelefonoReferenciaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTelefonoReferenciaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefonoReferenciaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TelefonoReferenciaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTelefonoReferencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTelefonoReferencia.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TelefonoReferenciaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTelefonoReferencia.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTelefonoReferencia(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=telefonoreferenciaLogic.getTelefonoReferencias().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=telefonoreferencias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTelefonoReferencia.setModel(new TelefonoReferenciaModel(this.telefonoreferenciaLogic.getTelefonoReferencias(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTelefonoReferencia.setModel(new TelefonoReferenciaModel(this.telefonoreferencias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTelefonoReferencia!=null && this.jInternalFrameOrderByTelefonoReferencia.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTelefonoReferencia();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTelefonoReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefonoReferencia,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TelefonoReferenciaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO,telefonoreferenciaConstantesFunciones.resaltarSeleccionarTelefonoReferencia,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO,telefonoreferenciaConstantesFunciones.resaltarSeleccionarTelefonoReferencia,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTelefonoReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefonoReferencia,TelefonoReferenciaConstantesFunciones.LABEL_ID));

		if(this.telefonoreferenciaConstantesFunciones.mostraridTelefonoReferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TelefonoReferenciaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.telefonoreferenciaConstantesFunciones.resaltaridTelefonoReferencia,this.telefonoreferenciaConstantesFunciones.activaridTelefonoReferencia,this,true,"idTelefonoReferencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.telefonoreferenciaConstantesFunciones.resaltaridTelefonoReferencia,this.telefonoreferenciaConstantesFunciones.activaridTelefonoReferencia,this,true,"idTelefonoReferencia","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTelefonoReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefonoReferencia,TelefonoReferenciaConstantesFunciones.LABEL_IDREFERENCIA));

		if(this.telefonoreferenciaConstantesFunciones.mostrarid_referenciaTelefonoReferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TelefonoReferenciaConstantesFunciones.LABEL_IDREFERENCIA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ReferenciaTableCell(this.referenciasForeignKey,this.telefonoreferenciaConstantesFunciones.resaltarid_referenciaTelefonoReferencia,this,this.telefonoreferenciaConstantesFunciones.activarid_referenciaTelefonoReferencia));
			tableColumn.setCellEditor(new ReferenciaTableCell(this.referenciasForeignKey,this.telefonoreferenciaConstantesFunciones.resaltarid_referenciaTelefonoReferencia,this,this.telefonoreferenciaConstantesFunciones.activarid_referenciaTelefonoReferencia,true,"id_referenciaTelefonoReferencia","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TelefonoReferenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTelefonoReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefonoReferencia,TelefonoReferenciaConstantesFunciones.LABEL_NUMERO));

		if(this.telefonoreferenciaConstantesFunciones.mostrarnumeroTelefonoReferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TelefonoReferenciaConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.telefonoreferenciaConstantesFunciones.resaltarnumeroTelefonoReferencia,this.telefonoreferenciaConstantesFunciones.activarnumeroTelefonoReferencia,this,true,"numeroTelefonoReferencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.telefonoreferenciaConstantesFunciones.resaltarnumeroTelefonoReferencia,this.telefonoreferenciaConstantesFunciones.activarnumeroTelefonoReferencia,this,true,"numeroTelefonoReferencia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TelefonoReferenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTelefonoReferencia.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTelefonoReferencia.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTelefonoReferencia && this.isPermisoGuardarCambiosTelefonoReferencia) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTelefonoReferencia.addColumn(tableColumn);
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
			
			this.jTableDatosTelefonoReferencia.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTelefonoReferencia && this.isPermisoGuardarCambiosTelefonoReferencia) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTelefonoReferencia && this.isPermisoGuardarCambiosTelefonoReferencia) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTelefonoReferencia.moveColumn(this.jTableDatosTelefonoReferencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTelefonoReferencia.moveColumn(this.jTableDatosTelefonoReferencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTelefonoReferencia.moveColumn(this.jTableDatosTelefonoReferencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTelefonoReferencia.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTelefonoReferencia.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTelefonoReferencia,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTelefonoReferencia.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTelefonoReferencia.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTelefonoReferencia.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTelefonoReferencia.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTelefonoReferencia.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=telefonoreferenciaLogic.getTelefonoReferencias().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=telefonoreferencias.size()-1;
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
		//this.jTableDatosTelefonoReferencia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTelefonoReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTelefonoReferencia();
			
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
				
				//this.isEsNuevoTelefonoReferencia=false;
					
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
			
				if(this.telefonoreferenciaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTelefonoReferencia==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTelefonoReferencia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTelefonoReferencia.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.telefonoreferencia.getsType().equals("DUPLICADO")
				   || this.telefonoreferencia.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTelefonoReferencia=true;
				
				} else {
					this.isEsNuevoTelefonoReferencia=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
					if(this.telefonoreferencia.getId()>=0 && !this.telefonoreferencia.getIsNew()) {						
						this.isEsNuevoTelefonoReferencia=false;
						
					} else {
						this.isEsNuevoTelefonoReferencia=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTelefonoReferencia(esRelaciones);						
				
				this.seleccionarTelefonoReferencia(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.telefonoreferencia.getId()<0) {
					this.isEsNuevoTelefonoReferencia=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTelefonoReferencia(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTelefonoReferencia(evt,rowIndex);
				}	
				
				if(this.telefonoreferenciaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TelefonoReferencia: " + this.dDif); 
					}
				}								
				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTelefonoReferencia(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.telefonoreferencia)) {
					if(this.telefonoreferencia.getId()>0) {
						this.telefonoreferencia.setIsDeleted(true);
						
						this.telefonoreferenciasEliminados.add(this.telefonoreferencia);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.telefonoreferenciaLogic.getTelefonoReferencias().remove(this.telefonoreferencia);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.telefonoreferencias.remove(this.telefonoreferencia);				
					}
					
					
					((TelefonoReferenciaModel) this.jTableDatosTelefonoReferencia.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTelefonoReferencia(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTelefonoReferencia(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTelefonoReferencia) {
			
			if(this.jInternalFrameDetalleFormTelefonoReferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTelefonoReferencia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTelefonoReferencia.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTelefonoReferencia(this.telefonoreferencia);
				}
				
				//ARCHITECTURE
				try {
					

					//Referencia
					if(!this.telefonoreferenciaConstantesFunciones.cargarid_referenciaTelefonoReferencia || this.telefonoreferenciaConstantesFunciones.event_dependid_referenciaTelefonoReferencia) {
						//this.cargarCombosReferenciasForeignKeyLista(" where id="+this.telefonoreferencia.getid_referencia());
									//this.inicializarActualizarBindingTelefonoReferencia(false,false);
						this.referenciasForeignKey=new ArrayList<Referencia>();

						if(telefonoreferencia.getReferencia()!=null) {
							this.referenciasForeignKey.add(telefonoreferencia.getReferencia());
						}

						this.addItemDefectoCombosForeignKeyReferencia();
						this.cargarCombosFrameReferenciasForeignKey("Todos");
					}
					this.setActualReferenciaForeignKey(this.telefonoreferencia.getid_referencia(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTelefonoReferencia("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTelefonoReferencia(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTelefonoReferencia() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTelefonoReferencia(TelefonoReferencia telefonoreferencia) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTelefonoReferencia(telefonoreferencia,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTelefonoReferencia(TelefonoReferencia telefonoreferencia,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTelefonoReferencia(telefonoreferencia);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTelefonoReferencia(telefonoreferencia,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTelefonoReferencia(telefonoreferencia);
	}
	
	public void setVariablesObjetoActualToFormularioTelefonoReferencia(TelefonoReferencia telefonoreferencia) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTelefonoReferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTelefonoReferencia.jLabelidTelefonoReferencia.setText(telefonoreferencia.getId().toString());
			this.jInternalFrameDetalleFormTelefonoReferencia.jTextFieldnumeroTelefonoReferencia.setText(telefonoreferencia.getnumero());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TelefonoReferencia telefonoreferenciaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,telefonoreferenciaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TelefonoReferencia telefonoreferenciaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				telefonoreferenciaLocal=this.telefonoreferencia;
			} else {
				telefonoreferenciaLocal=this.telefonoreferenciaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(telefonoreferenciaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTelefonoReferencia(telefonoreferenciaLocal,true);
					
					if(telefonoreferenciaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(telefonoreferenciaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(telefonoreferenciaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTelefonoReferencia(TelefonoReferencia telefonoreferencia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTelefonoReferencia(telefonoreferencia,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTelefonoReferencia(telefonoreferencia);
	}
	
	public void setVariablesFormularioToObjetoActualTelefonoReferencia(TelefonoReferencia telefonoreferencia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTelefonoReferencia(telefonoreferencia,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTelefonoReferencia(TelefonoReferencia telefonoreferencia,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTelefonoReferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTelefonoReferencia.jLabelidTelefonoReferencia.getText()==null || this.jInternalFrameDetalleFormTelefonoReferencia.jLabelidTelefonoReferencia.getText()=="" || this.jInternalFrameDetalleFormTelefonoReferencia.jLabelidTelefonoReferencia.getText()=="Id") {
				this.jInternalFrameDetalleFormTelefonoReferencia.jLabelidTelefonoReferencia.setText("0");
			}

			if(conColumnasBase) {telefonoreferencia.setId(Long.parseLong(this.jInternalFrameDetalleFormTelefonoReferencia.jLabelidTelefonoReferencia.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TelefonoReferenciaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefonoReferencia.jLabelIdTelefonoReferencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			telefonoreferencia.setnumero(this.jInternalFrameDetalleFormTelefonoReferencia.jTextFieldnumeroTelefonoReferencia.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TelefonoReferenciaConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefonoReferencia.jLabelnumeroTelefonoReferencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTelefonoReferencia(TelefonoReferencia telefonoreferenciaBean,TelefonoReferencia telefonoreferencia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && telefonoreferenciaBean.getid_referencia()!=null && !telefonoreferenciaBean.getid_referencia().equals(-1L))) {telefonoreferencia.setid_referencia(telefonoreferenciaBean.getid_referencia());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTelefonoReferencia(TelefonoReferencia telefonoreferenciaOrigen,TelefonoReferencia telefonoreferencia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && telefonoreferenciaOrigen.getId()!=null && !telefonoreferenciaOrigen.getId().equals(0L))) {telefonoreferencia.setId(telefonoreferenciaOrigen.getId());}}
			if(conDefault || (!conDefault && telefonoreferenciaOrigen.getid_referencia()!=null && !telefonoreferenciaOrigen.getid_referencia().equals(-1L))) {telefonoreferencia.setid_referencia(telefonoreferenciaOrigen.getid_referencia());}
			if(conDefault || (!conDefault && telefonoreferenciaOrigen.getnumero()!=null && !telefonoreferenciaOrigen.getnumero().equals(""))) {telefonoreferencia.setnumero(telefonoreferenciaOrigen.getnumero());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTelefonoReferencia(TelefonoReferencia telefonoreferencia) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTelefonoReferencia.jLabelidTelefonoReferencia.setText(telefonoreferencia.getId().toString());
			this.jInternalFrameDetalleFormTelefonoReferencia.jTextFieldnumeroTelefonoReferencia.setText(telefonoreferencia.getnumero());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTelefonoReferencia(TelefonoReferenciaBean telefonoreferenciaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTelefonoReferencia.jLabelidTelefonoReferencia.setText(telefonoreferenciaBean.getId().toString());
			this.jInternalFrameDetalleFormTelefonoReferencia.jTextFieldnumeroTelefonoReferencia.setText(telefonoreferenciaBean.getnumero());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTelefonoReferencia(TelefonoReferenciaParameterReturnGeneral telefonoreferenciaReturnGeneral,TelefonoReferenciaBean telefonoreferenciaBean,Boolean conDefault) throws Exception { 
		try {
			TelefonoReferencia telefonoreferenciaLocal=new TelefonoReferencia();
			
			telefonoreferenciaLocal=telefonoreferenciaReturnGeneral.getTelefonoReferencia();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && telefonoreferenciaLocal.getId()!=null && !telefonoreferenciaLocal.getId().equals(0L))) {telefonoreferenciaBean.setId(telefonoreferenciaLocal.getId());}}
			if(conDefault || (!conDefault && telefonoreferenciaLocal.getid_referencia()!=null && !telefonoreferenciaLocal.getid_referencia().equals(-1L))) {telefonoreferenciaBean.setid_referencia(telefonoreferenciaLocal.getid_referencia());}
			if(conDefault || (!conDefault && telefonoreferenciaLocal.getnumero()!=null && !telefonoreferenciaLocal.getnumero().equals(""))) {telefonoreferenciaBean.setnumero(telefonoreferenciaLocal.getnumero());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTelefonoReferenciaGenerico(Long idTelefonoReferenciaSeleccionado,JComboBox jComboBoxTelefonoReferencia,List<TelefonoReferencia> telefonoreferenciasLocal)throws Exception {
		try {
			TelefonoReferencia  telefonoreferenciaTemp=null;

			for(TelefonoReferencia telefonoreferenciaAux:telefonoreferenciasLocal) {
				if(telefonoreferenciaAux.getId()!=null && telefonoreferenciaAux.getId().equals(idTelefonoReferenciaSeleccionado)) {
					telefonoreferenciaTemp=telefonoreferenciaAux;
					break;
				}
			}

			jComboBoxTelefonoReferencia.setSelectedItem(telefonoreferenciaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTelefonoReferenciaGenerico(JComboBox jComboBoxTelefonoReferencia,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTelefonoReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTelefonoReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTelefonoReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTelefonoReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTelefonoReferencia.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTelefonoReferencia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTelefonoReferencia.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTelefonoReferencia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTelefonoReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTelefonoReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			telefonoreferencia=(TelefonoReferencia) telefonoreferenciaLogic.getTelefonoReferencias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			telefonoreferencia =(TelefonoReferencia) telefonoreferencias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Referencia")) {
			//sDescripcion=this.getActualReferenciaForeignKeyDescripcion((Long)value);
			if(!telefonoreferencia.getIsNew() && !telefonoreferencia.getIsChanged() && !telefonoreferencia.getIsDeleted()) {
				sDescripcion=telefonoreferencia.getreferencia_descripcion();
			} else {
				//sDescripcion=this.getActualReferenciaForeignKeyDescripcion((Long)value);
				sDescripcion=telefonoreferencia.getreferencia_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TelefonoReferencia telefonoreferenciaRow=new TelefonoReferencia();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			telefonoreferenciaRow=(TelefonoReferencia) telefonoreferenciaLogic.getTelefonoReferencias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			telefonoreferenciaRow=(TelefonoReferencia) telefonoreferencias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTelefonoReferencia(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTelefonoReferencia.setVisible((this.isVisibilidadCeldaNuevoTelefonoReferencia && this.isPermisoNuevoTelefonoReferencia));			
			this.jButtonDuplicarTelefonoReferencia.setVisible((this.isVisibilidadCeldaDuplicarTelefonoReferencia && this.isPermisoDuplicarTelefonoReferencia));			
			this.jButtonCopiarTelefonoReferencia.setVisible((this.isVisibilidadCeldaCopiarTelefonoReferencia && this.isPermisoCopiarTelefonoReferencia));
			this.jButtonVerFormTelefonoReferencia.setVisible((this.isVisibilidadCeldaVerFormTelefonoReferencia && this.isPermisoVerFormTelefonoReferencia));
			
			this.jButtonAbrirOrderByTelefonoReferencia.setVisible((this.isVisibilidadCeldaOrdenTelefonoReferencia && this.isPermisoOrdenTelefonoReferencia));			
			
			this.jButtonNuevoRelacionesTelefonoReferencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia && this.isPermisoNuevoTelefonoReferencia));			
			this.jButtonNuevoGuardarCambiosTelefonoReferencia.setVisible((this.isVisibilidadCeldaNuevoTelefonoReferencia && this.isPermisoNuevoTelefonoReferencia && this.isPermisoGuardarCambiosTelefonoReferencia));
			
			if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonModificarTelefonoReferencia.setVisible((this.isVisibilidadCeldaModificarTelefonoReferencia && this.isPermisoActualizarTelefonoReferencia));	
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonActualizarTelefonoReferencia.setVisible((this.isVisibilidadCeldaActualizarTelefonoReferencia && this.isPermisoActualizarTelefonoReferencia));	
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonEliminarTelefonoReferencia.setVisible((this.isVisibilidadCeldaEliminarTelefonoReferencia && this.isPermisoEliminarTelefonoReferencia));
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonCancelarTelefonoReferencia.setVisible(this.isVisibilidadCeldaCancelarTelefonoReferencia);							
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonGuardarCambiosTelefonoReferencia.setVisible((this.isVisibilidadCeldaGuardarTelefonoReferencia && this.isPermisoGuardarCambiosTelefonoReferencia));			
			
			}
						
			this.jButtonGuardarCambiosTablaTelefonoReferencia.setVisible((this.isVisibilidadCeldaGuardarCambiosTelefonoReferencia && this.isPermisoGuardarCambiosTelefonoReferencia));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTelefonoReferencia.setVisible((this.isVisibilidadCeldaNuevoTelefonoReferencia && this.isPermisoNuevoTelefonoReferencia));						
			this.jButtonDuplicarToolBarTelefonoReferencia.setVisible((this.isVisibilidadCeldaDuplicarTelefonoReferencia && this.isPermisoDuplicarTelefonoReferencia));						
			this.jButtonCopiarToolBarTelefonoReferencia.setVisible((this.isVisibilidadCeldaCopiarTelefonoReferencia && this.isPermisoCopiarTelefonoReferencia));			
			this.jButtonVerFormToolBarTelefonoReferencia.setVisible((this.isVisibilidadCeldaVerFormTelefonoReferencia && this.isPermisoVerFormTelefonoReferencia));			
			this.jButtonAbrirOrderByToolBarTelefonoReferencia.setVisible((this.isVisibilidadCeldaOrdenTelefonoReferencia && this.isPermisoOrdenTelefonoReferencia));
			this.jButtonNuevoRelacionesToolBarTelefonoReferencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia && this.isPermisoNuevoTelefonoReferencia));			
			this.jButtonNuevoGuardarCambiosToolBarTelefonoReferencia.setVisible((this.isVisibilidadCeldaNuevoTelefonoReferencia && this.isPermisoNuevoTelefonoReferencia && this.isPermisoGuardarCambiosTelefonoReferencia));			
			
			if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonModificarToolBarTelefonoReferencia.setVisible((this.isVisibilidadCeldaModificarTelefonoReferencia && this.isPermisoActualizarTelefonoReferencia));	
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonActualizarToolBarTelefonoReferencia.setVisible((this.isVisibilidadCeldaActualizarTelefonoReferencia  && this.isPermisoActualizarTelefonoReferencia));	
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonEliminarToolBarTelefonoReferencia.setVisible((this.isVisibilidadCeldaEliminarTelefonoReferencia && this.isPermisoEliminarTelefonoReferencia));
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonCancelarToolBarTelefonoReferencia.setVisible(this.isVisibilidadCeldaCancelarTelefonoReferencia);				
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonGuardarCambiosToolBarTelefonoReferencia.setVisible((this.isVisibilidadCeldaGuardarTelefonoReferencia && this.isPermisoGuardarCambiosTelefonoReferencia));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTelefonoReferencia.setVisible((this.isVisibilidadCeldaGuardarCambiosTelefonoReferencia && this.isPermisoGuardarCambiosTelefonoReferencia));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTelefonoReferencia.setVisible((this.isVisibilidadCeldaNuevoTelefonoReferencia && this.isPermisoNuevoTelefonoReferencia));			
			this.jMenuItemDuplicarTelefonoReferencia.setVisible((this.isVisibilidadCeldaDuplicarTelefonoReferencia && this.isPermisoDuplicarTelefonoReferencia));			
			this.jMenuItemCopiarTelefonoReferencia.setVisible((this.isVisibilidadCeldaCopiarTelefonoReferencia && this.isPermisoCopiarTelefonoReferencia));			
			this.jMenuItemVerFormTelefonoReferencia.setVisible((this.isVisibilidadCeldaVerFormTelefonoReferencia && this.isPermisoVerFormTelefonoReferencia));			
			this.jMenuItemAbrirOrderByTelefonoReferencia.setVisible((this.isVisibilidadCeldaOrdenTelefonoReferencia && this.isPermisoOrdenTelefonoReferencia));			
			//this.jMenuItemMostrarOcultarTelefonoReferencia.setVisible((this.isVisibilidadCeldaOrdenTelefonoReferencia && this.isPermisoOrdenTelefonoReferencia));
			this.jMenuItemDetalleAbrirOrderByTelefonoReferencia.setVisible((this.isVisibilidadCeldaOrdenTelefonoReferencia && this.isPermisoOrdenTelefonoReferencia));			
			//this.jMenuItemDetalleMostrarOcultarTelefonoReferencia.setVisible((this.isVisibilidadCeldaOrdenTelefonoReferencia && this.isPermisoOrdenTelefonoReferencia));			
			this.jMenuItemNuevoRelacionesTelefonoReferencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia && this.isPermisoNuevoTelefonoReferencia));			
			this.jMenuItemNuevoGuardarCambiosTelefonoReferencia.setVisible((this.isVisibilidadCeldaNuevoTelefonoReferencia && this.isPermisoNuevoTelefonoReferencia && this.isPermisoGuardarCambiosTelefonoReferencia));									
			
			if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
			this.jInternalFrameDetalleFormTelefonoReferencia.jMenuItemModificarTelefonoReferencia.setVisible((this.isVisibilidadCeldaModificarTelefonoReferencia && this.isPermisoActualizarTelefonoReferencia));	
			this.jInternalFrameDetalleFormTelefonoReferencia.jMenuItemActualizarTelefonoReferencia.setVisible((this.isVisibilidadCeldaActualizarTelefonoReferencia && this.isPermisoActualizarTelefonoReferencia));	
			this.jInternalFrameDetalleFormTelefonoReferencia.jMenuItemEliminarTelefonoReferencia.setVisible((this.isVisibilidadCeldaEliminarTelefonoReferencia && this.isPermisoEliminarTelefonoReferencia));
			this.jInternalFrameDetalleFormTelefonoReferencia.jMenuItemCancelarTelefonoReferencia.setVisible(this.isVisibilidadCeldaCancelarTelefonoReferencia);				
			}
			
			this.jMenuItemGuardarCambiosTelefonoReferencia.setVisible((this.isVisibilidadCeldaGuardarTelefonoReferencia && this.isPermisoGuardarCambiosTelefonoReferencia));						
			this.jMenuItemGuardarCambiosTablaTelefonoReferencia.setVisible((this.isVisibilidadCeldaGuardarCambiosTelefonoReferencia && this.isPermisoGuardarCambiosTelefonoReferencia));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTelefonoReferencia=this.jButtonNuevoTelefonoReferencia.isVisible();
			this.isVisibilidadCeldaDuplicarTelefonoReferencia=this.jButtonDuplicarTelefonoReferencia.isVisible();
			this.isVisibilidadCeldaCopiarTelefonoReferencia=this.jButtonCopiarTelefonoReferencia.isVisible();
			this.isVisibilidadCeldaVerFormTelefonoReferencia=this.jButtonVerFormTelefonoReferencia.isVisible();
			
			this.isVisibilidadCeldaOrdenTelefonoReferencia=this.jButtonAbrirOrderByTelefonoReferencia.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia=this.jButtonNuevoRelacionesTelefonoReferencia.isVisible();
			this.isVisibilidadCeldaModificarTelefonoReferencia=this.jButtonModificarTelefonoReferencia.isVisible();
			
			if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
			this.isVisibilidadCeldaActualizarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jButtonActualizarTelefonoReferencia.isVisible();
			this.isVisibilidadCeldaEliminarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jButtonEliminarTelefonoReferencia.isVisible();
			this.isVisibilidadCeldaCancelarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jButtonCancelarTelefonoReferencia.isVisible();
			this.isVisibilidadCeldaGuardarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jButtonGuardarCambiosTelefonoReferencia.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTelefonoReferencia=this.jButtonGuardarCambiosTablaTelefonoReferencia.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTelefonoReferencia=this.jButtonNuevoToolBarTelefonoReferencia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia=this.jButtonNuevoRelacionesToolBarTelefonoReferencia.isVisible();
			
			if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
			this.isVisibilidadCeldaModificarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jButtonModificarToolBarTelefonoReferencia.isVisible();
			this.isVisibilidadCeldaActualizarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jButtonActualizarToolBarTelefonoReferencia.isVisible();
			this.isVisibilidadCeldaEliminarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jButtonEliminarToolBarTelefonoReferencia.isVisible();
			this.isVisibilidadCeldaCancelarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jButtonCancelarToolBarTelefonoReferencia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTelefonoReferencia=this.jButtonGuardarCambiosToolBarTelefonoReferencia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTelefonoReferencia=this.jButtonGuardarCambiosTablaToolBarTelefonoReferencia.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTelefonoReferencia=this.jMenuItemNuevoTelefonoReferencia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia=this.jMenuItemNuevoRelacionesTelefonoReferencia.isVisible();
			
			if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
			this.isVisibilidadCeldaModificarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jMenuItemModificarTelefonoReferencia.isVisible();
			this.isVisibilidadCeldaActualizarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jMenuItemActualizarTelefonoReferencia.isVisible();
			this.isVisibilidadCeldaEliminarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jMenuItemEliminarTelefonoReferencia.isVisible();
			this.isVisibilidadCeldaCancelarTelefonoReferencia=this.jInternalFrameDetalleFormTelefonoReferencia.jMenuItemCancelarTelefonoReferencia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTelefonoReferencia=this.jMenuItemGuardarCambiosTelefonoReferencia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTelefonoReferencia=this.jMenuItemGuardarCambiosTablaTelefonoReferencia.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTelefonoReferencia(Boolean esInicializar) {
		if(TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.telefonoreferenciaSessionBean.getConGuardarRelaciones()) {
				//if(this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTelefonoReferencia();
			}
			
			this.inicializarActualizarBindingBotonesManualTelefonoReferencia(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTelefonoReferencia() {
		this.jButtonNuevoTelefonoReferencia.setVisible(this.isPermisoNuevoTelefonoReferencia);			
		this.jButtonDuplicarTelefonoReferencia.setVisible(this.isPermisoDuplicarTelefonoReferencia);			
		this.jButtonCopiarTelefonoReferencia.setVisible(this.isPermisoCopiarTelefonoReferencia);			
		this.jButtonVerFormTelefonoReferencia.setVisible(this.isPermisoVerFormTelefonoReferencia);			
		
		this.jButtonAbrirOrderByTelefonoReferencia.setVisible(this.isPermisoOrdenTelefonoReferencia);					
		
		this.jButtonNuevoRelacionesTelefonoReferencia.setVisible(this.isPermisoNuevoTelefonoReferencia);			
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonModificarTelefonoReferencia.setVisible(this.isPermisoActualizarTelefonoReferencia);	
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonActualizarTelefonoReferencia.setVisible(this.isPermisoActualizarTelefonoReferencia);	
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonEliminarTelefonoReferencia.setVisible(this.isPermisoEliminarTelefonoReferencia);
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonCancelarTelefonoReferencia.setVisible(this.isVisibilidadCeldaCancelarTelefonoReferencia);						
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonGuardarCambiosTelefonoReferencia.setVisible(this.isPermisoGuardarCambiosTelefonoReferencia);							
		}
		
		this.jButtonGuardarCambiosTablaTelefonoReferencia.setVisible(this.isPermisoActualizarTelefonoReferencia);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTelefonoReferencia() {
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonModificarTelefonoReferencia.setVisible(this.isPermisoActualizarTelefonoReferencia);	
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonActualizarTelefonoReferencia.setVisible(this.isPermisoActualizarTelefonoReferencia);	
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonEliminarTelefonoReferencia.setVisible(this.isPermisoEliminarTelefonoReferencia);
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonCancelarTelefonoReferencia.setVisible(this.isVisibilidadCeldaCancelarTelefonoReferencia);							
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonGuardarCambiosTelefonoReferencia.setVisible((this.isVisibilidadCeldaGuardarTelefonoReferencia && this.isPermisoGuardarCambiosTelefonoReferencia));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTelefonoReferencia() {
		if(TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTelefonoReferencia();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTelefonoReferencia() {
	}
	
	public void jTableDatosTelefonoReferenciaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTelefonoReferencia(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTelefonoReferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTelefonoReferencia(this.gettelefonoreferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefonoReferencia(this.telefonoreferencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.telefonoreferencia==null) {
						this.telefonoreferencia = new TelefonoReferencia();
					}

					this.setVariablesFormularioToObjetoActualTelefonoReferencia(this.telefonoreferencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefonoReferencia(this.telefonoreferencia);
				}

				if(this.telefonoreferencia.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.telefonoreferencia.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTelefonoReferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_referenciaTelefonoReferenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoreferencia=true;

			idTienePermisoreferencia=this.tienePermisosUsuarioEnPaginaWebTelefonoReferencia(ReferenciaConstantesFunciones.CLASSNAME);

			if(idTienePermisoreferencia) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTelefonoReferencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTelefonoReferencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTelefonoReferencia(this.gettelefonoreferencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTelefonoReferencia(this.telefonoreferencia);

				this.referenciaBeanSwingJInternalFrame=new ReferenciaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.referenciaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.referenciaBeanSwingJInternalFrame.getReferenciaLogic().setConnexion(this.telefonoreferenciaLogic.getConnexion());

				if(this.telefonoreferencia.getid_referencia()!=null) {
					this.referenciaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.referenciaBeanSwingJInternalFrame.setIdActual(this.telefonoreferencia.getid_referencia());
					this.referenciaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.referenciaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.referenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferencia();
				}

				JInternalFrameBase jinternalFrame =this.referenciaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTelefonoReferencia=(TitledBorder)this.jScrollPanelDatosTelefonoReferencia.getBorder();
				TitledBorder titledBorderreferencia=(TitledBorder)this.referenciaBeanSwingJInternalFrame.jScrollPanelDatosReferencia.getBorder();

				titledBorderreferencia.setTitle(titledBorderTelefonoReferencia.getTitle() + " -> Referencia");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_referenciaTelefonoReferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTelefonoReferencia(this.gettelefonoreferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefonoReferencia(this.telefonoreferencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.telefonoreferencia==null) {
						this.telefonoreferencia = new TelefonoReferencia();
					}

					this.setVariablesFormularioToObjetoActualTelefonoReferencia(this.telefonoreferencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefonoReferencia(this.telefonoreferencia);
				}

				if(this.telefonoreferencia.getid_referencia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_referencia = "+this.telefonoreferencia.getid_referencia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTelefonoReferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroTelefonoReferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTelefonoReferencia(this.gettelefonoreferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefonoReferencia(this.telefonoreferencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.telefonoreferencia==null) {
						this.telefonoreferencia = new TelefonoReferencia();
					}

					this.setVariablesFormularioToObjetoActualTelefonoReferencia(this.telefonoreferencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefonoReferencia(this.telefonoreferencia);
				}

				if(this.telefonoreferencia.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero like '%"+this.telefonoreferencia.getnumero()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTelefonoReferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdReferenciaTelefonoReferenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTelefonoReferencia(false,false);

			this.getTelefonoReferenciasFK_IdReferencia();

			this.inicializarActualizarBindingTelefonoReferencia(false);

			//if(TelefonoReferenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTelefonoReferencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoreferenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTelefonoReferencia() {
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
			this.jInternalFrameDetalleFormTelefonoReferencia.setVisible(false);	    			
			this.jInternalFrameDetalleFormTelefonoReferencia.dispose();
			this.jInternalFrameDetalleFormTelefonoReferencia=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTelefonoReferencia!=null) {
			this.jInternalFrameReporteDinamicoTelefonoReferencia.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTelefonoReferencia.dispose();
			this.jInternalFrameReporteDinamicoTelefonoReferencia=null;
		}
		
		if(this.jInternalFrameImportacionTelefonoReferencia!=null) {
			this.jInternalFrameImportacionTelefonoReferencia.setVisible(false);	    			
			this.jInternalFrameImportacionTelefonoReferencia.dispose();
			this.jInternalFrameImportacionTelefonoReferencia=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTelefonoReferencia();
			
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTelefonoReferencia")) {
				jButtonNuevoTelefonoReferenciaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTelefonoReferencia")) {
				jButtonDuplicarTelefonoReferenciaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTelefonoReferencia")) {
				jButtonCopiarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTelefonoReferencia")) {
				jButtonVerFormTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTelefonoReferencia")) {
				jButtonNuevoTelefonoReferenciaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTelefonoReferencia")) {
				jButtonDuplicarTelefonoReferenciaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTelefonoReferencia")) {
				jButtonNuevoTelefonoReferenciaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTelefonoReferencia")) {
				jButtonDuplicarTelefonoReferenciaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTelefonoReferencia")) {
				jButtonNuevoTelefonoReferenciaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTelefonoReferencia")) {
				jButtonNuevoTelefonoReferenciaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTelefonoReferencia")) {
				jButtonNuevoTelefonoReferenciaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTelefonoReferencia")) {
				jButtonModificarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTelefonoReferencia")) {
				jButtonModificarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTelefonoReferencia")) {
				jButtonModificarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTelefonoReferencia")) {
				jButtonActualizarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTelefonoReferencia")) {
				jButtonActualizarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTelefonoReferencia")) {
				jButtonActualizarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTelefonoReferencia")) {
				jButtonEliminarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTelefonoReferencia")) {
				jButtonEliminarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTelefonoReferencia")) {
				jButtonEliminarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTelefonoReferencia")) {
				jButtonCancelarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTelefonoReferencia")) {
				jButtonCancelarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTelefonoReferencia")) {
				jButtonCancelarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTelefonoReferencia")) {
				jButtonCerrarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTelefonoReferencia")) {
				jButtonCerrarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTelefonoReferencia")) {
				jButtonCerrarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTelefonoReferencia")) {
				jButtonMostrarOcultarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTelefonoReferencia")) {
				jButtonCancelarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTelefonoReferencia")) {
				jButtonGuardarCambiosTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTelefonoReferencia")) {
				jButtonGuardarCambiosTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTelefonoReferencia")) {
				jButtonCopiarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTelefonoReferencia")) {
				jButtonVerFormTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTelefonoReferencia")) {
				jButtonGuardarCambiosTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTelefonoReferencia")) {
				jButtonCopiarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTelefonoReferencia")) {
				jButtonVerFormTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTelefonoReferencia")) {
				jButtonGuardarCambiosTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTelefonoReferencia")) {
				jButtonGuardarCambiosTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTelefonoReferencia")) {
				jButtonGuardarCambiosTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTelefonoReferencia")) {
				jButtonRecargarInformacionTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTelefonoReferencia")) {
				jButtonRecargarInformacionTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTelefonoReferencia")) {
				jButtonRecargarInformacionTelefonoReferenciaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTelefonoReferencia")) {
				jButtonAnterioresTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTelefonoReferencia")) {
				jButtonAnterioresTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTelefonoReferencia")) {
				jButtonAnterioresTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTelefonoReferencia")) {
				jButtonSiguientesTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTelefonoReferencia")) {
				jButtonSiguientesTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTelefonoReferencia")) {
				jButtonSiguientesTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTelefonoReferencia") || sTipo.equals("MenuItemDetalleAbrirOrderByTelefonoReferencia")) {
				jButtonAbrirOrderByTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTelefonoReferencia") || sTipo.equals("MenuItemDetalleMostrarOcultarTelefonoReferencia")) {
				jButtonMostrarOcultarTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTelefonoReferencia")) {
				jButtonNuevoGuardarCambiosTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTelefonoReferencia")) {
				jButtonNuevoGuardarCambiosTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTelefonoReferencia")) {
				jButtonNuevoGuardarCambiosTelefonoReferenciaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTelefonoReferencia")) {
				jButtonCerrarReporteDinamicoTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTelefonoReferencia")) {
				jButtonGenerarReporteDinamicoTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTelefonoReferencia")) {
				
				jButtonGenerarExcelReporteDinamicoTelefonoReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTelefonoReferencia")) {
				jButtonCerrarImportacionTelefonoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTelefonoReferencia")) {
				
				jButtonGenerarImportacionTelefonoReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTelefonoReferencia")) {
				
				jButtonAbrirImportacionTelefonoReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTelefonoReferencia")) {
				jComboBoxTiposAccionesTelefonoReferenciaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTelefonoReferencia")) {
				jComboBoxTiposRelacionesTelefonoReferenciaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTelefonoReferencia")) {
				jComboBoxTiposAccionesTelefonoReferenciaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTelefonoReferencia")) {
				
				jComboBoxTiposSeleccionarTelefonoReferenciaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTelefonoReferencia")) {
				jTextFieldValorCampoGeneralTelefonoReferenciaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTelefonoReferencia")) {
				jButtonAbrirOrderByTelefonoReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTelefonoReferencia")) {
				jButtonAbrirOrderByTelefonoReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTelefonoReferencia")) {
				jButtonCerrarOrderByTelefonoReferenciaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTelefonoReferenciaBusqueda")) {
				this.jButtonidTelefonoReferenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_referenciaTelefonoReferenciaUpdate")) {
				this.jButtonid_referenciaTelefonoReferenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_referenciaTelefonoReferenciaBusqueda")) {
				this.jButtonid_referenciaTelefonoReferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroTelefonoReferenciaBusqueda")) {
				this.jButtonnumeroTelefonoReferenciaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdReferenciaTelefonoReferencia")) {
				this.jButtonFK_IdReferenciaTelefonoReferenciaActionPerformed(evt);
			}
			
			;
			
			
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTelefonoReferencia();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefonoReferenciaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefonoreferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefonoreferencia);
				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
				
				


				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TelefonoReferencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TelefonoReferencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TelefonoReferencia telefonoreferenciaLocal=null;
			
			if(!this.getEsControlTabla()) {
				telefonoreferenciaLocal=this.telefonoreferencia;
			} else {
				telefonoreferenciaLocal=this.telefonoreferenciaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefonoreferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefonoreferencia);
				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
							
				
				


				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TelefonoReferencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TelefonoReferencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefonoReferenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferenciaAnterior =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefonoreferenciaAnterior =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
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
			
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
			
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
			
			


			
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefonoReferenciaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefonoreferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefonoreferencia);
				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
								
						
				


				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TelefonoReferencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TelefonoReferencia.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefonoreferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefonoreferencia);
				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
								
				
				


				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TelefonoReferencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TelefonoReferencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefonoReferenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferenciaAnterior =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefonoreferenciaAnterior =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefonoreferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefonoreferencia);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefonoReferenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferenciaAnterior =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefonoreferenciaAnterior =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefonoReferenciaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.telefonoreferencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.telefonoreferencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefonoreferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefonoreferencia);
				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
							
				
				


				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TelefonoReferencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TelefonoReferencia.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefonoReferenciaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefonoreferenciaAnterior =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.telefonoreferenciaAnterior =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
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
			
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
			
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
			
			


			
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefonoReferenciaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.telefonoreferencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.telefonoreferencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefonoreferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefonoreferencia);
				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
								
				
				


				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TelefonoReferencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TelefonoReferencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefonoReferenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferenciaAnterior =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefonoreferenciaAnterior =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefonoReferenciaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.telefonoreferencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.telefonoreferencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefonoReferenciaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefonoreferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefonoreferencia);
				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTelefonoReferencia")) {
					jCheckBoxSeleccionarTodosTelefonoReferenciaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTelefonoReferencia")) {
					jCheckBoxSeleccionadosTelefonoReferenciaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTelefonoReferencia")) {
					
				}
				
				


				
				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TelefonoReferencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TelefonoReferencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.telefonoreferencia);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.telefonoreferencia);
				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
												
				
				


				
				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TelefonoReferencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TelefonoReferencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefonoReferenciaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefonoreferenciaAnterior =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.telefonoreferenciaAnterior =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefonoReferenciaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefonoreferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefonoreferencia);
				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
				
				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
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
			
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
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
			
			


			
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefonoReferenciaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefonoreferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefonoreferencia);
				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TelefonoReferencia.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TelefonoReferencia.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefonoreferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefonoreferencia);
				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
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
				
				


				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TelefonoReferencia.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TelefonoReferencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefonoReferenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoreferenciaAnterior =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefonoreferenciaAnterior =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTelefonoReferencia")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTelefonoReferenciaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTelefonoReferencia.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.telefonoreferencia =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.telefonoreferencia);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTelefonoReferencia")) {
				
				}
				
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTelefonoReferencia")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTelefonoReferencia.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTelefonoReferencia")) {
			
			}
			
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTelefonoReferencia();
			
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
			
			if(sTipo.equals("NuevoTelefonoReferencia")) {
				jButtonNuevoTelefonoReferenciaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTelefonoReferencia")) {
				jButtonDuplicarTelefonoReferenciaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTelefonoReferencia")) {
				jButtonCopiarTelefonoReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTelefonoReferencia")) {
				jButtonVerFormTelefonoReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTelefonoReferencia")) {
				jButtonNuevoTelefonoReferenciaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTelefonoReferencia")) {
				jButtonModificarTelefonoReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTelefonoReferencia")) {
				jButtonActualizarTelefonoReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTelefonoReferencia")) {
				jButtonEliminarTelefonoReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTelefonoReferencia")) {
				jButtonGuardarCambiosTelefonoReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTelefonoReferencia")) {
				jButtonCancelarTelefonoReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTelefonoReferencia")) {
				jButtonCerrarTelefonoReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTelefonoReferencia")) {
				jButtonGuardarCambiosTelefonoReferenciaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTelefonoReferencia")) {
				jButtonNuevoGuardarCambiosTelefonoReferenciaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTelefonoReferencia")) {
				jButtonAbrirOrderByTelefonoReferenciaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTelefonoReferencia")) {
				jButtonRecargarInformacionTelefonoReferenciaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTelefonoReferencia")) {
				jButtonAnterioresTelefonoReferenciaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTelefonoReferencia")) {
				jButtonSiguientesTelefonoReferenciaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTelefonoReferenciaBusqueda")) {
				this.jButtonidTelefonoReferenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_referenciaTelefonoReferenciaUpdate")) {
				this.jButtonid_referenciaTelefonoReferenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_referenciaTelefonoReferenciaBusqueda")) {
				this.jButtonid_referenciaTelefonoReferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroTelefonoReferenciaBusqueda")) {
				this.jButtonnumeroTelefonoReferenciaBusquedaActionPerformed(evt);
			}
			
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTelefonoReferencia();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTelefonoReferencia")) {
				closingInternalFrameTelefonoReferencia();
				
			} else if(sTipo.equals("jButtonCancelarTelefonoReferencia")) {
				JInternalFrameBase jInternalFrameDetalleFormTelefonoReferencia = (JInternalFrameBase)evt.getSource();
	            	
	            TelefonoReferenciaBeanSwingJInternalFrame jInternalFrameParent=(TelefonoReferenciaBeanSwingJInternalFrame)jInternalFrameDetalleFormTelefonoReferencia.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTelefonoReferenciaActionPerformed(null);
			}
			
			TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.telefonoreferencia,new Object(),this.telefonoreferenciaParameterGeneral,this.telefonoreferenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTelefonoReferencia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTelefonoReferencia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTelefonoReferencia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.telefonoreferencia)) {
			if(!esControlTabla) {
				if(TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTelefonoReferencia(this.telefonoreferencia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefonoReferencia(this.telefonoreferencia);			
				}
				
				if(this.telefonoreferenciaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTelefonoReferencia(this.telefonoreferencia,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.telefonoreferenciaReturnGeneral=telefonoreferenciaLogic.procesarEventosTelefonoReferenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.telefonoreferenciaLogic.getTelefonoReferencias(),this.telefonoreferencia,this.telefonoreferenciaParameterGeneral,this.isEsNuevoTelefonoReferencia,classes);//this.telefonoreferenciaLogic.getTelefonoReferencia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTelefonoReferencia(this.telefonoreferenciaReturnGeneral,this.telefonoreferenciaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.telefonoreferenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTelefonoReferencia(classes,this.telefonoreferenciaReturnGeneral,this.telefonoreferenciaBean,false);
					}
						
					if(this.telefonoreferenciaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTelefonoReferencia(this.telefonoreferenciaReturnGeneral.getTelefonoReferencia());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTelefonoReferencia(this.telefonoreferenciaReturnGeneral.getTelefonoReferencia());	
					}
						
					if(this.telefonoreferenciaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTelefonoReferencia(this.telefonoreferenciaReturnGeneral.getTelefonoReferencia(),classes);//this.telefonoreferenciaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTelefonoReferencia(this.telefonoreferencia,classes);//this.telefonoreferenciaBean);									
				}
			
				if(TelefonoReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTelefonoReferencia(this.telefonoreferencia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefonoReferencia(this.telefonoreferencia);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.telefonoreferenciaAnterior!=null) {
						this.telefonoreferencia=this.telefonoreferenciaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.telefonoreferenciaReturnGeneral=telefonoreferenciaLogic.procesarEventosTelefonoReferenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.telefonoreferenciaLogic.getTelefonoReferencias(),this.telefonoreferencia,this.telefonoreferenciaParameterGeneral,this.isEsNuevoTelefonoReferencia,classes);//this.telefonoreferenciaLogic.getTelefonoReferencia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.telefonoreferenciaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.telefonoreferenciaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.telefonoreferenciaReturnGeneral.getTelefonoReferencia(),telefonoreferenciaLogic.getTelefonoReferencias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.telefonoreferenciaReturnGeneral.getTelefonoReferencia(),this.telefonoreferencias);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTelefonoReferencia.repaint();
				
				//((AbstractTableModel) this.jTableDatosTelefonoReferencia.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTelefonoReferencia();
			}
		}
	}
	
	public void actualizarVisualTableDatosTelefonoReferencia() throws Exception {
		
		TelefonoReferenciaModel telefonoreferenciaModel=(TelefonoReferenciaModel)this.jTableDatosTelefonoReferencia.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			telefonoreferenciaModel.telefonoreferencias=this.telefonoreferenciaLogic.getTelefonoReferencias();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			telefonoreferenciaModel.telefonoreferencias=this.telefonoreferencias;
		}
		
		
		((TelefonoReferenciaModel) this.jTableDatosTelefonoReferencia.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTelefonoReferencia() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettelefonoreferenciaAnterior(),this.telefonoreferenciaLogic.getTelefonoReferencias());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettelefonoreferenciaAnterior(),this.telefonoreferencias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTelefonoReferencia();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTelefonoReferencia(TelefonoReferencia telefonoreferencia,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
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
										
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.telefonoreferencia,new Object(),generalEntityParameterGeneral,this.telefonoreferenciaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.telefonoreferenciaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TelefonoReferenciaConstantesFunciones.getClassesRelationshipsOfTelefonoReferencia(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TelefonoReferenciaConstantesFunciones.getClassesRelationshipsFromStringsOfTelefonoReferencia(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTelefonoReferencia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TelefonoReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.telefonoreferencia,new Object(),generalEntityParameterGeneral,this.telefonoreferenciaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTelefonoReferencia(TelefonoReferenciaBean telefonoreferenciaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTelefonoReferencia(ArrayList<Classe> classes,TelefonoReferenciaReturnGeneral telefonoreferenciaReturnGeneral,TelefonoReferenciaBean telefonoreferenciaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTelefonoReferencia(TelefonoReferencia telefonoreferencia,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.telefonoreferencia)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTelefonoReferencia = new TelefonoReferenciaDetalleFormJInternalFrame(jDesktopPane,this.telefonoreferenciaSessionBean.getConGuardarRelaciones(),this.telefonoreferenciaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTelefonoReferencia);
		this.jInternalFrameDetalleFormTelefonoReferencia.setVisible(false);
		this.jInternalFrameDetalleFormTelefonoReferencia.setSelected(false);						
		
		this.jInternalFrameDetalleFormTelefonoReferencia.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTelefonoReferencia.telefonoreferenciaLogic=this.telefonoreferenciaLogic;
		
		this.cargarCombosFrameForeignKeyTelefonoReferencia("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTelefonoReferencia();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTelefonoReferencia();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTelefonoReferencia("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTelefonoReferencia();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTelefonoReferencia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTelefonoReferencia"));
		
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonModificarTelefonoReferencia.addActionListener(new ButtonActionListener(this,"ModificarTelefonoReferencia"));

		
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonModificarToolBarTelefonoReferencia.addActionListener(new ButtonActionListener(this,"ModificarToolBarTelefonoReferencia"));
					
		this.jInternalFrameDetalleFormTelefonoReferencia.jMenuItemModificarTelefonoReferencia.addActionListener(new ButtonActionListener(this,"MenuItemModificarTelefonoReferencia"));		
		
		
		
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonActualizarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"ActualizarTelefonoReferencia"));
		
		
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonActualizarToolBarTelefonoReferencia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTelefonoReferencia"));
						
		this.jInternalFrameDetalleFormTelefonoReferencia.jMenuItemActualizarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTelefonoReferencia"));		
		
		
		
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonEliminarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"EliminarTelefonoReferencia"));
		
		
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonEliminarToolBarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"EliminarToolBarTelefonoReferencia"));
								
		this.jInternalFrameDetalleFormTelefonoReferencia.jMenuItemEliminarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTelefonoReferencia"));		
		
		
		
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonCancelarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"CancelarTelefonoReferencia"));
		
		
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonCancelarToolBarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"CancelarToolBarTelefonoReferencia"));
					
		this.jInternalFrameDetalleFormTelefonoReferencia.jMenuItemCancelarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTelefonoReferencia"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTelefonoReferencia.jMenuItemDetalleCerrarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTelefonoReferencia"));		
		
		
		
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonGuardarCambiosToolBarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTelefonoReferencia"));
		
		
		
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonGuardarCambiosToolBarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTelefonoReferencia"));
		
		
		
		this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxTiposAccionesFormularioTelefonoReferencia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTelefonoReferencia"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonidTelefonoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"idTelefonoReferenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonid_referenciaTelefonoReferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_referenciaTelefonoReferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonid_referenciaTelefonoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_referenciaTelefonoReferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonnumeroTelefonoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"numeroTelefonoReferenciaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTelefonoReferencia.jTabbedPaneRelacionesTelefonoReferencia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTelefonoReferencia"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTelefonoReferencia"));
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefonoReferencia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTelefonoReferencia"));
		}
		
		this.jTableDatosTelefonoReferencia.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTelefonoReferencia"));
		
		this.jTableDatosTelefonoReferencia.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTelefonoReferencia"));
		
		this.jButtonNuevoTelefonoReferencia.addActionListener(new ButtonActionListener(this,"NuevoTelefonoReferencia"));
		
		this.jButtonDuplicarTelefonoReferencia.addActionListener(new ButtonActionListener(this,"DuplicarTelefonoReferencia"));
		
		this.jButtonCopiarTelefonoReferencia.addActionListener(new ButtonActionListener(this,"CopiarTelefonoReferencia"));
		
		this.jButtonVerFormTelefonoReferencia.addActionListener(new ButtonActionListener(this,"VerFormTelefonoReferencia"));
		
		
		this.jButtonNuevoToolBarTelefonoReferencia.addActionListener(new ButtonActionListener(this,"NuevoToolBarTelefonoReferencia"));
			
		this.jButtonDuplicarToolBarTelefonoReferencia.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTelefonoReferencia"));
			
		this.jMenuItemNuevoTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTelefonoReferencia"));
			
		this.jMenuItemDuplicarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTelefonoReferencia"));		
		
		
		this.jButtonNuevoRelacionesTelefonoReferencia.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTelefonoReferencia"));
		
		
		this.jButtonNuevoRelacionesToolBarTelefonoReferencia.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTelefonoReferencia"));
			
		this.jMenuItemNuevoRelacionesTelefonoReferencia.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTelefonoReferencia"));		
		
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonModificarTelefonoReferencia.addActionListener(new ButtonActionListener(this,"ModificarTelefonoReferencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonModificarToolBarTelefonoReferencia.addActionListener(new ButtonActionListener(this,"ModificarToolBarTelefonoReferencia"));
			
			this.jInternalFrameDetalleFormTelefonoReferencia.jMenuItemModificarTelefonoReferencia.addActionListener(new ButtonActionListener(this,"MenuItemModificarTelefonoReferencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonActualizarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"ActualizarTelefonoReferencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonActualizarToolBarTelefonoReferencia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTelefonoReferencia"));
				
			this.jInternalFrameDetalleFormTelefonoReferencia.jMenuItemActualizarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTelefonoReferencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonEliminarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"EliminarTelefonoReferencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonEliminarToolBarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"EliminarToolBarTelefonoReferencia"));
						
			this.jInternalFrameDetalleFormTelefonoReferencia.jMenuItemEliminarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTelefonoReferencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonCancelarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"CancelarTelefonoReferencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonCancelarToolBarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"CancelarToolBarTelefonoReferencia"));
			
			this.jInternalFrameDetalleFormTelefonoReferencia.jMenuItemCancelarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTelefonoReferencia"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTelefonoReferencia"));		
		
		
		this.jButtonCerrarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"CerrarTelefonoReferencia"));
		
		
		this.jButtonCerrarToolBarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"CerrarToolBarTelefonoReferencia"));
			
		this.jMenuItemCerrarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTelefonoReferencia"));
			
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefonoReferencia.jMenuItemDetalleCerrarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTelefonoReferencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonGuardarCambiosTelefonoReferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTelefonoReferencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefonoReferencia.jButtonGuardarCambiosToolBarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTelefonoReferencia"));
		}
		
		this.jButtonCopiarToolBarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"CopiarToolBarTelefonoReferencia"));
			
		this.jButtonVerFormToolBarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"VerFormToolBarTelefonoReferencia"));
		
		this.jMenuItemGuardarCambiosTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTelefonoReferencia"));
			
		this.jMenuItemCopiarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTelefonoReferencia"));		
		
		this.jMenuItemVerFormTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTelefonoReferencia"));		
		
		
		this.jButtonGuardarCambiosTablaTelefonoReferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTelefonoReferencia"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTelefonoReferencia"));
			
		this.jMenuItemGuardarCambiosTablaTelefonoReferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTelefonoReferencia"));		
		
		
		
		this.jButtonRecargarInformacionTelefonoReferencia.addActionListener (new ButtonActionListener(this,"RecargarInformacionTelefonoReferencia"));
					
		this.jButtonRecargarInformacionToolBarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTelefonoReferencia"));
		
		this.jMenuItemRecargarInformacionTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTelefonoReferencia"));		
		
		
		
		this.jButtonAnterioresTelefonoReferencia.addActionListener (new ButtonActionListener(this,"AnterioresTelefonoReferencia"));
		
		
		this.jButtonAnterioresToolBarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTelefonoReferencia"));
		
		this.jMenuItemAnterioresTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTelefonoReferencia"));		
		
		
		this.jButtonSiguientesTelefonoReferencia.addActionListener (new ButtonActionListener(this,"SiguientesTelefonoReferencia"));
		
		
		this.jButtonSiguientesToolBarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTelefonoReferencia"));
			
		this.jMenuItemSiguientesTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTelefonoReferencia"));
			
		this.jMenuItemAbrirOrderByTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTelefonoReferencia"));
			
		this.jMenuItemMostrarOcultarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTelefonoReferencia"));
			
		this.jMenuItemDetalleAbrirOrderByTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTelefonoReferencia"));
			
		this.jMenuItemDetalleMostarOcultarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTelefonoReferencia"));		
		
		
		this.jButtonNuevoGuardarCambiosTelefonoReferencia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTelefonoReferencia"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTelefonoReferencia"));
			
		this.jMenuItemNuevoGuardarCambiosTelefonoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTelefonoReferencia"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTelefonoReferencia.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTelefonoReferencia"));

		this.jCheckBoxSeleccionadosTelefonoReferencia.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTelefonoReferencia"));
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxTiposAccionesFormularioTelefonoReferencia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTelefonoReferencia"));
		}
		
		
		this.jComboBoxTiposRelacionesTelefonoReferencia.addActionListener (new ButtonActionListener(this,"TiposRelacionesTelefonoReferencia"));
			
		this.jComboBoxTiposAccionesTelefonoReferencia.addActionListener (new ButtonActionListener(this,"TiposAccionesTelefonoReferencia"));
					
		this.jComboBoxTiposSeleccionarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTelefonoReferencia"));
			
		this.jTextFieldValorCampoGeneralTelefonoReferencia.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTelefonoReferencia"));		
		
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonidTelefonoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"idTelefonoReferenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonid_referenciaTelefonoReferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_referenciaTelefonoReferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonid_referenciaTelefonoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_referenciaTelefonoReferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonnumeroTelefonoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"numeroTelefonoReferenciaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdReferenciaTelefonoReferencia.addActionListener(new ButtonActionListener(this,"FK_IdReferenciaTelefonoReferencia"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTelefonoReferencia!=null) {
				this.jInternalFrameReporteDinamicoTelefonoReferencia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTelefonoReferencia"));
				this.jInternalFrameReporteDinamicoTelefonoReferencia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTelefonoReferencia"));
				this.jInternalFrameReporteDinamicoTelefonoReferencia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTelefonoReferencia"));
			}
			
			//this.jButtonCerrarReporteDinamicoTelefonoReferencia.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTelefonoReferencia"));				
			//this.jButtonGenerarReporteDinamicoTelefonoReferencia.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTelefonoReferencia"));
			//this.jButtonGenerarExcelReporteDinamicoTelefonoReferencia.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTelefonoReferencia"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTelefonoReferencia!=null) {
				this.jInternalFrameImportacionTelefonoReferencia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTelefonoReferencia"));
				this.jInternalFrameImportacionTelefonoReferencia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTelefonoReferencia"));
				this.jInternalFrameImportacionTelefonoReferencia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTelefonoReferencia"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTelefonoReferencia.addActionListener (new ButtonActionListener(this,"AbrirOrderByTelefonoReferencia"));
			
			this.jButtonAbrirOrderByToolBarTelefonoReferencia.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTelefonoReferencia"));			
			
			if(this.jInternalFrameOrderByTelefonoReferencia!=null) {
				this.jInternalFrameOrderByTelefonoReferencia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTelefonoReferencia"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefonoReferencia.jTabbedPaneRelacionesTelefonoReferencia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTelefonoReferencia"));
		
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
            		closingInternalFrameTelefonoReferencia();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTelefonoReferencia.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTelefonoReferencia = (JInternalFrameBase)event.getSource();
	            	
	            TelefonoReferenciaBeanSwingJInternalFrame jInternalFrameParent=(TelefonoReferenciaBeanSwingJInternalFrame)jInternalFrameDetalleFormTelefonoReferencia.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTelefonoReferenciaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTelefonoReferencia.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTelefonoReferenciaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTelefonoReferencia.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTelefonoReferencia.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTelefonoReferenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTelefonoReferenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTelefonoReferenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTelefonoReferencia";
		inputMap = this.jButtonNuevoTelefonoReferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTelefonoReferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTelefonoReferenciaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTelefonoReferenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTelefonoReferenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTelefonoReferenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTelefonoReferencia";
		inputMap = this.jButtonNuevoRelacionesTelefonoReferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTelefonoReferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTelefonoReferenciaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTelefonoReferencia";
		inputMap = this.jButtonModificarTelefonoReferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTelefonoReferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTelefonoReferenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTelefonoReferencia";
		inputMap = this.jButtonActualizarTelefonoReferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTelefonoReferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTelefonoReferenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTelefonoReferencia";
		inputMap = this.jButtonEliminarTelefonoReferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTelefonoReferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTelefonoReferenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTelefonoReferencia";
		inputMap = this.jButtonCancelarTelefonoReferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTelefonoReferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTelefonoReferenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTelefonoReferencia";
		inputMap = this.jButtonCerrarTelefonoReferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTelefonoReferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTelefonoReferenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonGuardarCambiosTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTelefonoReferencia";
		inputMap = this.jInternalFrameDetalleFormTelefonoReferencia.jButtonGuardarCambiosTelefonoReferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonGuardarCambiosTelefonoReferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTelefonoReferenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTelefonoReferencia.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTelefonoReferenciaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTelefonoReferencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTelefonoReferenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTelefonoReferencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTelefonoReferenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTelefonoReferencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTelefonoReferenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonidTelefonoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"idTelefonoReferenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonid_referenciaTelefonoReferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_referenciaTelefonoReferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonid_referenciaTelefonoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_referenciaTelefonoReferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefonoReferencia.jButtonnumeroTelefonoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"numeroTelefonoReferenciaBusqueda"));
		
		
		this.jButtonFK_IdReferenciaTelefonoReferencia.addActionListener(new ButtonActionListener(this,"FK_IdReferenciaTelefonoReferencia"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTelefonoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTelefonoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTelefonoReferenciaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTelefonoReferencia.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTelefonoReferencia(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TelefonoReferencia telefonoreferenciaAux:this.telefonoreferenciaLogic.getTelefonoReferencias()) {
					telefonoreferenciaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TelefonoReferencia telefonoreferenciaAux:telefonoreferencias) {
					telefonoreferenciaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTelefonoReferenciaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTelefonoReferencia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TelefonoReferencia telefonoreferenciaAux:this.telefonoreferenciaLogic.getTelefonoReferencias()) {
						telefonoreferenciaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TelefonoReferencia telefonoreferenciaAux:telefonoreferencias) {
						telefonoreferenciaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TelefonoReferencia telefonoreferenciaAux:this.telefonoreferenciaLogic.getTelefonoReferencias()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TelefonoReferencia telefonoreferenciaAux:telefonoreferencias) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTelefonoReferencia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTelefonoReferencia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTelefonoReferencia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTelefonoReferencia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTelefonoReferenciaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTelefonoReferencia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTelefonoReferencia.getSelectedRows();
			
			TelefonoReferencia telefonoreferenciaLocal=new TelefonoReferencia();
			
			//this.seleccionarTodosTelefonoReferencia(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					telefonoreferenciaLocal =(TelefonoReferencia) this.telefonoreferenciaLogic.getTelefonoReferencias().toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					telefonoreferenciaLocal =(TelefonoReferencia) this.telefonoreferencias.toArray()[this.jTableDatosTelefonoReferencia.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				telefonoreferenciaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TelefonoReferencia telefonoreferenciaAux:this.telefonoreferenciaLogic.getTelefonoReferencias()) {
						telefonoreferenciaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TelefonoReferencia telefonoreferenciaAux:telefonoreferencias) {
						telefonoreferenciaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTelefonoReferencia(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTelefonoReferencia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTelefonoReferencia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTelefonoReferencia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTelefonoReferenciaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTelefonoReferenciaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTelefonoReferenciaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTelefonoReferencia(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTelefonoReferencia.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TelefonoReferencia telefonoreferenciaAux:this.telefonoreferenciaLogic.getTelefonoReferencias()) {
				
						if(sTipoSeleccionar.equals(TelefonoReferenciaConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							telefonoreferenciaAux.setnumero(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TelefonoReferencia telefonoreferenciaAux:telefonoreferencias) {
					
						if(sTipoSeleccionar.equals(TelefonoReferenciaConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							telefonoreferenciaAux.setnumero(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTelefonoReferencia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTelefonoReferenciaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTelefonoReferencia(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTelefonoReferencia=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTelefonoReferencia.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxTiposAccionesFormularioTelefonoReferencia.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTelefonoReferencia) {				
					conSplash=true;//false;										
					
					//this.startProcessTelefonoReferencia(conSplash);
				
					this.generarReporteTelefonoReferenciasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTelefonoReferencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxTiposAccionesFormularioTelefonoReferencia.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTelefonoReferenciasSeleccionados();
				//this.jComboBoxTiposAccionesTelefonoReferencia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTelefonoReferenciasSeleccionados(false);
				//this.jComboBoxTiposAccionesTelefonoReferencia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTelefonoReferenciasSeleccionados(true);
				//this.jComboBoxTiposAccionesTelefonoReferencia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTelefonoReferencia();
				
				this.exportarTelefonoReferenciasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTelefonoReferencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxTiposAccionesFormularioTelefonoReferencia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTelefonoReferencias();
				//this.importarTelefonoReferencias();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTelefonoReferencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxTiposAccionesFormularioTelefonoReferencia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTelefonoReferencia();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTelefonoReferenciasSeleccionados();
				//this.jComboBoxTiposAccionesTelefonoReferencia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Telefono Referencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTelefonoReferencia();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTelefonoReferencia)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTelefonoReferencia(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Telefono Referencia",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTelefonoReferencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxTiposAccionesFormularioTelefonoReferencia.setSelectedIndex(0);					
				}	
			} 			
			else if(TelefonoReferenciaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTelefonoReferencia) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTelefonoReferencia(conSplash);
					
						//this.actualizarParametrosGeneralTelefonoReferencia();
						
						this.generarReporteProcesoAccionTelefonoReferenciasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTelefonoReferencia.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxTiposAccionesFormularioTelefonoReferencia.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TelefonoReferenciaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Telefono ReferenciaS SELECCIONADOS?", "MANTENIMIENTO DE Telefono Referencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTelefonoReferencia();
				
						this.actualizarParametrosGeneralTelefonoReferencia();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.telefonoreferenciaReturnGeneral=telefonoreferenciaLogic.procesarAccionTelefonoReferenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.telefonoreferenciaLogic.getTelefonoReferencias(),this.telefonoreferenciaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTelefonoReferenciaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTelefonoReferencia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxTiposAccionesFormularioTelefonoReferencia.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTelefonoReferencia();
					
					TelefonoReferenciaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTelefonoReferenciaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTelefonoReferencia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxTiposAccionesFormularioTelefonoReferencia.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTelefonoReferencia(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTelefonoReferenciaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTelefonoReferencia();
			
			if(this.jInternalFrameDetalleFormTelefonoReferencia==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TelefonoReferencia> telefonoreferenciasSeleccionados=new ArrayList<TelefonoReferencia>();		
			TelefonoReferencia telefonoreferencia=new TelefonoReferencia();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTelefonoReferencia(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTelefonoReferencia.getSelectedItem();
			
			
			
			
			telefonoreferenciasSeleccionados=this.getTelefonoReferenciasSeleccionados(true);
			//this.sTipoAccion;
			
			if(telefonoreferenciasSeleccionados.size()==1) {
				for(TelefonoReferencia telefonoreferenciaAux:telefonoreferenciasSeleccionados) {
					telefonoreferencia=telefonoreferenciaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTelefonoReferencia();
			
      		//this.finishProcessTelefonoReferencia(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTelefonoReferenciaReturnGeneral() throws Exception {
		if(this.telefonoreferenciaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.telefonoreferenciaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.telefonoreferenciaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.telefonoreferenciaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.telefonoreferenciaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.telefonoreferenciaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTelefonoReferencia(false);
		}
		
		if(this.telefonoreferenciaReturnGeneral.getConRetornoLista() || this.telefonoreferenciaReturnGeneral.getConRetornoObjeto()) {
			if(this.telefonoreferenciaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.telefonoreferenciaLogic.setTelefonoReferencias(this.telefonoreferenciaReturnGeneral.getTelefonoReferencias());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.telefonoreferenciaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.telefonoreferenciaLogic.setTelefonoReferencia(this.telefonoreferenciaReturnGeneral.getTelefonoReferencia());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTelefonoReferencia(false);
		}
	}
	
	public void actualizarParametrosGeneralTelefonoReferencia() throws Exception {
		
		
	}
	
	public ArrayList<TelefonoReferencia> getTelefonoReferenciasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TelefonoReferencia> telefonoreferenciasSeleccionados=new ArrayList<TelefonoReferencia>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTelefonoReferencia) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TelefonoReferencia telefonoreferenciaAux:telefonoreferenciaLogic.getTelefonoReferencias()) {
					if(telefonoreferenciaAux.getIsSelected()) {
						telefonoreferenciasSeleccionados.add(telefonoreferenciaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TelefonoReferencia telefonoreferenciaAux:this.telefonoreferencias) {
					if(telefonoreferenciaAux.getIsSelected()) {
						telefonoreferenciasSeleccionados.add(telefonoreferenciaAux);				
					}
				}
			}
			
			if(telefonoreferenciasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						telefonoreferenciasSeleccionados.addAll(this.telefonoreferenciaLogic.getTelefonoReferencias());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						telefonoreferenciasSeleccionados.addAll(this.telefonoreferencias);				
					}
				}
			}
		} else {
			telefonoreferenciasSeleccionados.add(this.telefonoreferencia);
		}
		
		return telefonoreferenciasSeleccionados;
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
	
	public void generarReporteTelefonoReferenciasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTelefonoReferenciasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTelefonoReferenciasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTelefonoReferenciasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTelefonoReferenciasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Telefono Referencia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTelefonoReferenciasSeleccionados() throws Exception {
		ArrayList<TelefonoReferencia> telefonoreferenciasSeleccionados=new ArrayList<TelefonoReferencia>();		
		
		telefonoreferenciasSeleccionados=this.getTelefonoReferenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTelefonoReferencias("Todos",telefonoreferenciasSeleccionados);
		
	}	
	
	public void generarReporteNormalTelefonoReferenciasSeleccionados() throws Exception {
		ArrayList<TelefonoReferencia> telefonoreferenciasSeleccionados=new ArrayList<TelefonoReferencia>();		
		
		telefonoreferenciasSeleccionados=this.getTelefonoReferenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTelefonoReferencias("Todos",telefonoreferenciasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTelefonoReferenciasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TelefonoReferencia> telefonoreferenciasSeleccionados=new ArrayList<TelefonoReferencia>();
		
		telefonoreferenciasSeleccionados=this.getTelefonoReferenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTelefonoReferencias("Todos",telefonoreferenciasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTelefonoReferenciasSeleccionados() throws Exception {
		ArrayList<TelefonoReferencia> telefonoreferenciasSeleccionados=new ArrayList<TelefonoReferencia>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTelefonoReferencia();
		
		
		telefonoreferenciasSeleccionados=this.getTelefonoReferenciasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTelefonoReferencia();
		
		
		//this.generarReporteTelefonoReferencias("Todos",telefonoreferenciasSeleccionados ,telefonoreferenciaImplementable,telefonoreferenciaImplementableHome);
	}
	
	public void mostrarImportacionTelefonoReferencias() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTelefonoReferencia();
		
		this.abrirFrameImportacionTelefonoReferencia();		
		
			
		//this.generarReporteTelefonoReferencias("Todos",telefonoreferenciasSeleccionados ,telefonoreferenciaImplementable,telefonoreferenciaImplementableHome);
	}
	
	public void importarTelefonoReferencias() throws Exception {		
	
	}
	
	public void exportarTelefonoReferenciasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTelefonoReferenciasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTelefonoReferenciasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTelefonoReferenciasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Telefono Referencia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTelefonoReferenciasSeleccionados() throws Exception {
		ArrayList<TelefonoReferencia> telefonoreferenciasSeleccionados=new ArrayList<TelefonoReferencia>();		
		
		telefonoreferenciasSeleccionados=this.getTelefonoReferenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefonoreferencia."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTelefonoReferencia(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TelefonoReferencia telefonoreferenciaAux:telefonoreferenciasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTelefonoReferencia(telefonoreferenciaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//telefonoreferenciaAux.setsDetalleGeneralEntityReporte(telefonoreferenciaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono Referencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTelefonoReferencia(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TelefonoReferenciaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TelefonoReferenciaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TelefonoReferenciaConstantesFunciones.LABEL_IDREFERENCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TelefonoReferenciaConstantesFunciones.LABEL_NUMERO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTelefonoReferencia(TelefonoReferencia telefonoreferencia,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=telefonoreferencia.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=telefonoreferencia.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=telefonoreferencia.getreferencia_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=telefonoreferencia.getnumero();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTelefonoReferenciasSeleccionados() throws Exception {
		ArrayList<TelefonoReferencia> telefonoreferenciasSeleccionados=new ArrayList<TelefonoReferencia>();		
		
		telefonoreferenciasSeleccionados=this.getTelefonoReferenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefonoreferencia.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TelefonoReferencias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTelefonoReferencia(row);				
				iRow++;
			}				
			
			for(TelefonoReferencia telefonoreferenciaAux:telefonoreferenciasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTelefonoReferencia(telefonoreferenciaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono Referencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTelefonoReferenciasSeleccionados() throws Exception {
		ArrayList<TelefonoReferencia> telefonoreferenciasSeleccionados=new ArrayList<TelefonoReferencia>();		
		
		telefonoreferenciasSeleccionados=this.getTelefonoReferenciasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefonoreferencia.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("telefonoreferencias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("telefonoreferencia");
			//elementRoot.appendChild(element);
		
			for(TelefonoReferencia telefonoreferenciaAux:telefonoreferenciasSeleccionados) {
				element = document.createElement("telefonoreferencia");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTelefonoReferencia(telefonoreferenciaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono Referencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTelefonoReferencia(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TelefonoReferenciaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TelefonoReferenciaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TelefonoReferenciaConstantesFunciones.LABEL_IDREFERENCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(TelefonoReferenciaConstantesFunciones.LABEL_NUMERO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTelefonoReferencia(TelefonoReferencia telefonoreferencia,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(telefonoreferencia.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(telefonoreferencia.getreferencia_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(telefonoreferencia.getnumero());				
	}
	
	public void setFilaDatosExportarXmlTelefonoReferencia(TelefonoReferencia telefonoreferencia,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TelefonoReferenciaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(telefonoreferencia.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TelefonoReferenciaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(telefonoreferencia.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementreferencia_descripcion = document.createElement(TelefonoReferenciaConstantesFunciones.IDREFERENCIA);
		elementreferencia_descripcion.appendChild(document.createTextNode(telefonoreferencia.getreferencia_descripcion()));
		element.appendChild(elementreferencia_descripcion);

		Element elementnumero = document.createElement(TelefonoReferenciaConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(telefonoreferencia.getnumero().trim()));
		element.appendChild(elementnumero);
	}
	
	public void generarReporteGroupGenericoTelefonoReferenciasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TelefonoReferencia> telefonoreferenciasSeleccionados=new ArrayList<TelefonoReferencia>();
		
		telefonoreferenciasSeleccionados=this.getTelefonoReferenciasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTelefonoReferencia(telefonoreferenciasSeleccionados);
		
		this.generarReporteTelefonoReferencias("Todos",telefonoreferenciasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTelefonoReferencia(ArrayList<TelefonoReferencia> telefonoreferenciasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TelefonoReferencia telefonoreferenciaAux:telefonoreferenciasSeleccionados) {
				telefonoreferenciaAux.setsDetalleGeneralEntityReporte(telefonoreferenciaAux.toString());
			
				if(sTipoSeleccionar.equals(TelefonoReferenciaConstantesFunciones.LABEL_IDREFERENCIA)) {
					existe=true;
					telefonoreferenciaAux.setsDescripcionGeneralEntityReporte1(telefonoreferenciaAux.getreferencia_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TelefonoReferenciaConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					telefonoreferenciaAux.setsDescripcionGeneralEntityReporte1(telefonoreferenciaAux.getnumero());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTelefonoReferencia(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTelefonoReferencia=true;
				this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia=true;
				this.isVisibilidadCeldaGuardarCambiosTelefonoReferencia=true;
			}
			
			this.isVisibilidadCeldaModificarTelefonoReferencia=false;
			this.isVisibilidadCeldaActualizarTelefonoReferencia=false;
			this.isVisibilidadCeldaEliminarTelefonoReferencia=false;
			this.isVisibilidadCeldaCancelarTelefonoReferencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefonoReferencia=true;
				} else {
					this.isVisibilidadCeldaGuardarTelefonoReferencia=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTelefonoReferencia=false;
			this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia=false;
			this.isVisibilidadCeldaGuardarCambiosTelefonoReferencia=false;
			this.isVisibilidadCeldaModificarTelefonoReferencia=false;
			this.isVisibilidadCeldaActualizarTelefonoReferencia=true;
			this.isVisibilidadCeldaEliminarTelefonoReferencia=false;
			this.isVisibilidadCeldaCancelarTelefonoReferencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefonoReferencia=true;
				} else {
					this.isVisibilidadCeldaGuardarTelefonoReferencia=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTelefonoReferencia=false;
			this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia=false;
			this.isVisibilidadCeldaGuardarCambiosTelefonoReferencia=false;
			this.isVisibilidadCeldaModificarTelefonoReferencia=false;
			this.isVisibilidadCeldaActualizarTelefonoReferencia=true;
			this.isVisibilidadCeldaEliminarTelefonoReferencia=true;
			this.isVisibilidadCeldaCancelarTelefonoReferencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefonoReferencia=true;
				} else {
					this.isVisibilidadCeldaGuardarTelefonoReferencia=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTelefonoReferencia=false;
			this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia=false;
			this.isVisibilidadCeldaGuardarCambiosTelefonoReferencia=false;
			this.isVisibilidadCeldaModificarTelefonoReferencia=false;
			this.isVisibilidadCeldaActualizarTelefonoReferencia=true;
			this.isVisibilidadCeldaEliminarTelefonoReferencia=false;
			this.isVisibilidadCeldaCancelarTelefonoReferencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefonoReferencia=false;
				} else {
					this.isVisibilidadCeldaGuardarTelefonoReferencia=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTelefonoReferencia=true;
			this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia=true;
			this.isVisibilidadCeldaGuardarCambiosTelefonoReferencia=true;
			this.isVisibilidadCeldaModificarTelefonoReferencia=false;
			this.isVisibilidadCeldaActualizarTelefonoReferencia=false;
			this.isVisibilidadCeldaEliminarTelefonoReferencia=false;
			this.isVisibilidadCeldaCancelarTelefonoReferencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefonoReferencia=true;
				} else {
					this.isVisibilidadCeldaGuardarTelefonoReferencia=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTelefonoReferencia=false;
			this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia=false;
			this.isVisibilidadCeldaGuardarCambiosTelefonoReferencia=false;
			this.isVisibilidadCeldaActualizarTelefonoReferencia=false;
			this.isVisibilidadCeldaEliminarTelefonoReferencia=false;
			this.isVisibilidadCeldaCancelarTelefonoReferencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefonoReferencia=false;
				} else {
					this.isVisibilidadCeldaGuardarTelefonoReferencia=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTelefonoReferencia=false;
			this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia=false;
			this.isVisibilidadCeldaGuardarCambiosTelefonoReferencia=false;
			this.isVisibilidadCeldaModificarTelefonoReferencia=true;
			this.isVisibilidadCeldaActualizarTelefonoReferencia=false;
			this.isVisibilidadCeldaEliminarTelefonoReferencia=false;
			this.isVisibilidadCeldaCancelarTelefonoReferencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefonoReferencia=false;
				} else {
					this.isVisibilidadCeldaGuardarTelefonoReferencia=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TelefonoReferenciaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTelefonoReferencia=true;
			this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia=true;
			this.isVisibilidadCeldaGuardarCambiosTelefonoReferencia=true;
		} else {
			this.actualizarEstadoPanelsTelefonoReferencia(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTelefonoReferencia=false;
			//this.isVisibilidadCeldaVerFormTelefonoReferencia=false;
			this.isVisibilidadCeldaDuplicarTelefonoReferencia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!telefonoreferenciaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia=false;
		} else {
			this.isVisibilidadCeldaNuevoTelefonoReferencia=false;
			this.isVisibilidadCeldaGuardarCambiosTelefonoReferencia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
			if(!telefonoreferenciaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia=false;												
			}
			
			this.jButtonCerrarTelefonoReferencia.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTelefonoReferencia=false;
		}
		
		if(!this.permiteMantenimiento(this.telefonoreferencia)) {
			this.isVisibilidadCeldaActualizarTelefonoReferencia=false;
			this.isVisibilidadCeldaEliminarTelefonoReferencia=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTelefonoReferencia() {
	}
	
	public void actualizarEstadoPanelsTelefonoReferencia(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTelefonoReferencia!=null) {
				this.jScrollPanelDatosEdicionTelefonoReferencia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefonoReferencia!=null) {
				this.jTabbedPaneBusquedasTelefonoReferencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTelefonoReferencia!=null) {
				this.jScrollPanelDatosTelefonoReferencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionTelefonoReferencia!=null) {
				this.jPanelPaginacionTelefonoReferencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTelefonoReferencia!=null) {
				this.jPanelParametrosReportesTelefonoReferencia.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTelefonoReferencia!=null) {
				this.jScrollPanelDatosEdicionTelefonoReferencia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefonoReferencia!=null) {
				this.jTabbedPaneBusquedasTelefonoReferencia.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTelefonoReferencia!=null) {
				this.jScrollPanelDatosTelefonoReferencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionTelefonoReferencia!=null) {
				this.jPanelPaginacionTelefonoReferencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTelefonoReferencia!=null) {
				this.jPanelParametrosReportesTelefonoReferencia.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTelefonoReferencia!=null) {
				this.jScrollPanelDatosEdicionTelefonoReferencia.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefonoReferencia!=null) {
				this.jTabbedPaneBusquedasTelefonoReferencia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTelefonoReferencia!=null) {
				this.jScrollPanelDatosTelefonoReferencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionTelefonoReferencia!=null) {
				this.jPanelPaginacionTelefonoReferencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTelefonoReferencia!=null) {
				this.jPanelParametrosReportesTelefonoReferencia.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTelefonoReferencia!=null) {
				this.jScrollPanelDatosEdicionTelefonoReferencia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefonoReferencia!=null) {
				this.jTabbedPaneBusquedasTelefonoReferencia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTelefonoReferencia!=null) {
				this.jScrollPanelDatosTelefonoReferencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionTelefonoReferencia!=null) {
				this.jPanelPaginacionTelefonoReferencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTelefonoReferencia!=null) {
				this.jPanelParametrosReportesTelefonoReferencia.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTelefonoReferencia!=null) {
				this.jScrollPanelDatosEdicionTelefonoReferencia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefonoReferencia!=null) {
				this.jTabbedPaneBusquedasTelefonoReferencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTelefonoReferencia!=null) {
				this.jScrollPanelDatosTelefonoReferencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionTelefonoReferencia!=null) {
				this.jPanelPaginacionTelefonoReferencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTelefonoReferencia!=null) {
				this.jPanelParametrosReportesTelefonoReferencia.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTelefonoReferencia!=null) {
				this.jScrollPanelDatosEdicionTelefonoReferencia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefonoReferencia!=null) {
				this.jTabbedPaneBusquedasTelefonoReferencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTelefonoReferencia!=null) {
				this.jScrollPanelDatosTelefonoReferencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionTelefonoReferencia!=null) {
				this.jPanelPaginacionTelefonoReferencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTelefonoReferencia!=null) {
				this.jPanelParametrosReportesTelefonoReferencia.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTelefonoReferencia!=null) {
				this.jScrollPanelDatosEdicionTelefonoReferencia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefonoReferencia!=null) {
				this.jTabbedPaneBusquedasTelefonoReferencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTelefonoReferencia!=null) {
				this.jScrollPanelDatosTelefonoReferencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionTelefonoReferencia!=null) {
				this.jPanelPaginacionTelefonoReferencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTelefonoReferencia!=null) {
				this.jPanelParametrosReportesTelefonoReferencia.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTelefonoReferencia!=null) {
					this.jTabbedPaneBusquedasTelefonoReferencia.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTelefonoReferencia!=null) {
				this.jPanelParametrosReportesTelefonoReferencia.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefonoReferencia!=null) {
				this.jTabbedPaneBusquedasTelefonoReferencia.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTelefonoReferencia!=null) {
				this.jPanelParametrosReportesTelefonoReferencia.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaReferencia(Boolean isParaReferencia){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaReferenciaNegation=!isParaReferencia;

			this.isVisibilidadFK_IdReferencia=isParaReferencia;
			if(!this.isVisibilidadFK_IdReferencia) {this.jTabbedPaneBusquedasTelefonoReferencia.remove(jPanelFK_IdReferenciaTelefonoReferencia);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TelefonoReferenciaSessionBean telefonoreferenciaSessionBean=new TelefonoReferenciaSessionBean();
		
		if(this.telefonoreferenciaSessionBean==null) {
			this.telefonoreferenciaSessionBean=new TelefonoReferenciaSessionBean();
		}
		
		this.telefonoreferenciaSessionBean.setsUltimaBusquedaTelefonoReferencia(this.getsAccionBusqueda());
		this.telefonoreferenciaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.telefonoreferenciaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdReferencia")) {
			telefonoreferenciaSessionBean.setid_referencia(this.getid_referenciaFK_IdReferencia());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TelefonoReferenciaSessionBean telefonoreferenciaSessionBean=new TelefonoReferenciaSessionBean();
		
		if(this.telefonoreferenciaSessionBean==null) {
			this.telefonoreferenciaSessionBean=new TelefonoReferenciaSessionBean();
		}
		
		if(this.telefonoreferenciaSessionBean.getsUltimaBusquedaTelefonoReferencia()!=null&&!this.telefonoreferenciaSessionBean.getsUltimaBusquedaTelefonoReferencia().equals("")) {
			this.setsAccionBusqueda(telefonoreferenciaSessionBean.getsUltimaBusquedaTelefonoReferencia());
			this.setiNumeroPaginacion(telefonoreferenciaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(telefonoreferenciaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdReferencia")) {
				this.setid_referenciaFK_IdReferencia(telefonoreferenciaSessionBean.getid_referencia());
				telefonoreferenciaSessionBean.setid_referencia(-1L);
			}
		}
		
		this.telefonoreferenciaSessionBean.setsUltimaBusquedaTelefonoReferencia("");
		this.telefonoreferenciaSessionBean.setiNumeroPaginacion(TelefonoReferenciaConstantesFunciones.INUMEROPAGINACION);
		this.telefonoreferenciaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTelefonoReferencia(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTelefonoReferencia() {
		this.updateBorderResaltarBusquedasFormularioTelefonoReferencia();
		this.updateVisibilidadBusquedasFormularioTelefonoReferencia();
		this.updateHabilitarBusquedasFormularioTelefonoReferencia();
	}
	
	public void updateBorderResaltarBusquedasFormularioTelefonoReferencia() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTelefonoReferencia.getComponents().length>0) {
	

		if(this.telefonoreferenciaConstantesFunciones.resaltarFK_IdReferenciaTelefonoReferencia!=null) {
			index= this.jTabbedPaneBusquedasTelefonoReferencia.indexOfComponent(this.jPanelFK_IdReferenciaTelefonoReferencia);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTelefonoReferencia.getComponent(index);
				jPanel.setBorder(this.telefonoreferenciaConstantesFunciones.resaltarFK_IdReferenciaTelefonoReferencia);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTelefonoReferencia() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTelefonoReferencia.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTelefonoReferencia.indexOfComponent(this.jPanelFK_IdReferenciaTelefonoReferencia);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTelefonoReferencia.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.telefonoreferenciaConstantesFunciones.mostrarFK_IdReferenciaTelefonoReferencia);
			if(!this.telefonoreferenciaConstantesFunciones.mostrarFK_IdReferenciaTelefonoReferencia && index>-1) {
				this.jTabbedPaneBusquedasTelefonoReferencia.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTelefonoReferencia() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTelefonoReferencia.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTelefonoReferencia.indexOfComponent(this.jPanelFK_IdReferenciaTelefonoReferencia);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTelefonoReferencia.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.telefonoreferenciaConstantesFunciones.activarFK_IdReferenciaTelefonoReferencia);
				this.jTabbedPaneBusquedasTelefonoReferencia.setEnabledAt(index,this.telefonoreferenciaConstantesFunciones.activarFK_IdReferenciaTelefonoReferencia);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTelefonoReferencia(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdReferencia")) {
			index= this.jTabbedPaneBusquedasTelefonoReferencia.indexOfComponent(this.jPanelFK_IdReferenciaTelefonoReferencia);

			this.jTabbedPaneBusquedasTelefonoReferencia.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTelefonoReferencia.getComponent(index);

			this.telefonoreferenciaConstantesFunciones.setResaltarFK_IdReferenciaTelefonoReferencia(resaltar);

			jPanel.setBorder(this.telefonoreferenciaConstantesFunciones.resaltarFK_IdReferenciaTelefonoReferencia);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTelefonoReferencia.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTelefonoReferencia() throws Exception {

		if(this.jInternalFrameDetalleFormTelefonoReferencia==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTelefonoReferencia();
		this.updateVisibilidadResaltarControlesFormularioTelefonoReferencia();
		this.updateHabilitarResaltarControlesFormularioTelefonoReferencia();
		
	}
	
	public void updateBorderResaltarControlesFormularioTelefonoReferencia() throws Exception {
		if(this.jInternalFrameDetalleFormTelefonoReferencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.telefonoreferenciaConstantesFunciones.resaltaridTelefonoReferencia!=null && this.jInternalFrameDetalleFormTelefonoReferencia!=null) {this.jInternalFrameDetalleFormTelefonoReferencia.jLabelidTelefonoReferencia.setBorder(this.telefonoreferenciaConstantesFunciones.resaltaridTelefonoReferencia);}
		if(this.telefonoreferenciaConstantesFunciones.resaltarid_referenciaTelefonoReferencia!=null && this.jInternalFrameDetalleFormTelefonoReferencia!=null) {this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxid_referenciaTelefonoReferencia.setBorder(this.telefonoreferenciaConstantesFunciones.resaltarid_referenciaTelefonoReferencia);}
		if(this.telefonoreferenciaConstantesFunciones.resaltarnumeroTelefonoReferencia!=null && this.jInternalFrameDetalleFormTelefonoReferencia!=null) {this.jInternalFrameDetalleFormTelefonoReferencia.jTextFieldnumeroTelefonoReferencia.setBorder(this.telefonoreferenciaConstantesFunciones.resaltarnumeroTelefonoReferencia);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTelefonoReferencia() throws Exception {		
		if(this.jInternalFrameDetalleFormTelefonoReferencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
	
		//this.jInternalFrameDetalleFormTelefonoReferencia.jLabelidTelefonoReferencia.setVisible(this.telefonoreferenciaConstantesFunciones.mostraridTelefonoReferencia);
		this.jInternalFrameDetalleFormTelefonoReferencia.jPanelidTelefonoReferencia.setVisible(this.telefonoreferenciaConstantesFunciones.mostraridTelefonoReferencia);
		//this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxid_referenciaTelefonoReferencia.setVisible(this.telefonoreferenciaConstantesFunciones.mostrarid_referenciaTelefonoReferencia);
		this.jInternalFrameDetalleFormTelefonoReferencia.jPanelid_referenciaTelefonoReferencia.setVisible(this.telefonoreferenciaConstantesFunciones.mostrarid_referenciaTelefonoReferencia);
		//this.jInternalFrameDetalleFormTelefonoReferencia.jTextFieldnumeroTelefonoReferencia.setVisible(this.telefonoreferenciaConstantesFunciones.mostrarnumeroTelefonoReferencia);
		this.jInternalFrameDetalleFormTelefonoReferencia.jPanelnumeroTelefonoReferencia.setVisible(this.telefonoreferenciaConstantesFunciones.mostrarnumeroTelefonoReferencia);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTelefonoReferencia() throws Exception {
		if(this.jInternalFrameDetalleFormTelefonoReferencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTelefonoReferencia!=null) {
	
		this.jInternalFrameDetalleFormTelefonoReferencia.jLabelidTelefonoReferencia.setEnabled(this.telefonoreferenciaConstantesFunciones.activaridTelefonoReferencia);
		this.jInternalFrameDetalleFormTelefonoReferencia.jComboBoxid_referenciaTelefonoReferencia.setEnabled(this.telefonoreferenciaConstantesFunciones.activarid_referenciaTelefonoReferencia);
		this.jInternalFrameDetalleFormTelefonoReferencia.jTextFieldnumeroTelefonoReferencia.setEnabled(this.telefonoreferenciaConstantesFunciones.activarnumeroTelefonoReferencia);
		}
	}
	
		
}