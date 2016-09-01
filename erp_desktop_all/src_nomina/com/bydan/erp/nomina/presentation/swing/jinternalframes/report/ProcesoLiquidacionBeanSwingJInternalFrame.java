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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.nomina.util.ProcesoLiquidacionConstantesFunciones;
import com.bydan.erp.nomina.util.report.ProcesoLiquidacionParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.ProcesoLiquidacionParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.ProcesoLiquidacionBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.nomina.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.nomina.util.*;

import com.bydan.erp.nomina.util.report.*;
import com.bydan.erp.nomina.business.logic.report.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.business.entity.report.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;

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
public class ProcesoLiquidacionBeanSwingJInternalFrame extends ProcesoLiquidacionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoLiquidacionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoLiquidacion> procesoliquidacionValidator = new ClassValidator<ProcesoLiquidacion>(ProcesoLiquidacion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoLiquidacion procesoliquidacion;	
	public ProcesoLiquidacion procesoliquidacionAux;
	public ProcesoLiquidacion procesoliquidacionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoLiquidacion procesoliquidacionTotales;
	public Long idProcesoLiquidacionActual;
	public Long iIdNuevoProcesoLiquidacion=0L;
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
	
	public Boolean isPermisoTodoProcesoLiquidacion;
	public Boolean isPermisoNuevoProcesoLiquidacion;
	public Boolean isPermisoActualizarProcesoLiquidacion;
	public Boolean isPermisoActualizarOriginalProcesoLiquidacion;
	public Boolean isPermisoEliminarProcesoLiquidacion;
	public Boolean isPermisoGuardarCambiosProcesoLiquidacion;
	public Boolean isPermisoConsultaProcesoLiquidacion;
	public Boolean isPermisoBusquedaProcesoLiquidacion;
	public Boolean isPermisoReporteProcesoLiquidacion;
	public Boolean isPermisoPaginacionMedioProcesoLiquidacion;
	public Boolean isPermisoPaginacionAltoProcesoLiquidacion;
	public Boolean isPermisoPaginacionTodoProcesoLiquidacion;
	public Boolean isPermisoCopiarProcesoLiquidacion;
	public Boolean isPermisoVerFormProcesoLiquidacion;
	public Boolean isPermisoDuplicarProcesoLiquidacion;
	public Boolean isPermisoOrdenProcesoLiquidacion;
	
	
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
	
	public ProcesoLiquidacionParameterReturnGeneral procesoliquidacionReturnGeneral;
	public ProcesoLiquidacionParameterReturnGeneral procesoliquidacionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoLiquidacion=false;
	public Boolean esParaAccionDesdeFormularioProcesoLiquidacion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoLiquidacionSessionBeanAdditional procesoliquidacionSessionBeanAdditional=null;
	
	public ProcesoLiquidacionSessionBeanAdditional getProcesoLiquidacionSessionBeanAdditional() {
		return this.procesoliquidacionSessionBeanAdditional;
	}
	
	public void setProcesoLiquidacionSessionBeanAdditional(ProcesoLiquidacionSessionBeanAdditional procesoliquidacionSessionBeanAdditional) {
		try {
			this.procesoliquidacionSessionBeanAdditional=procesoliquidacionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoLiquidacionBeanSwingJInternalFrameAdditional procesoliquidacionBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoLiquidacionBeanSwingJInternalFrame
	
	public ProcesoLiquidacionBeanSwingJInternalFrameAdditional getProcesoLiquidacionBeanSwingJInternalFrameAdditional() {
		return this.procesoliquidacionBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoLiquidacionBeanSwingJInternalFrameAdditional(ProcesoLiquidacionBeanSwingJInternalFrameAdditional procesoliquidacionBeanSwingJInternalFrameAdditional) {
		try {
			this.procesoliquidacionBeanSwingJInternalFrameAdditional=procesoliquidacionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoLiquidacionLogic procesoliquidacionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoLiquidacion procesoliquidacionBean;
	public ProcesoLiquidacionConstantesFunciones procesoliquidacionConstantesFunciones;
	//public ProcesoLiquidacionParameterReturnGeneral procesoliquidacionReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<ProcesoLiquidacion> procesoliquidacions;	
	//public List<ProcesoLiquidacion> procesoliquidacionsEliminados;
	//public List<ProcesoLiquidacion> procesoliquidacionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoLiquidacion=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoLiquidacion=true;
	public Boolean isVisibilidadCeldaCopiarProcesoLiquidacion=true;
	public Boolean isVisibilidadCeldaVerFormProcesoLiquidacion=true;
	public Boolean isVisibilidadCeldaOrdenProcesoLiquidacion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion=false;
	public Boolean isVisibilidadCeldaModificarProcesoLiquidacion=false;
	public Boolean isVisibilidadCeldaActualizarProcesoLiquidacion=false;
	public Boolean isVisibilidadCeldaEliminarProcesoLiquidacion=false;
	public Boolean isVisibilidadCeldaCancelarProcesoLiquidacion=false;
	public Boolean isVisibilidadCeldaGuardarProcesoLiquidacion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoLiquidacion=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoLiquidacion=false;
	
	public Long getiIdNuevoProcesoLiquidacion() {
		return this.iIdNuevoProcesoLiquidacion;
	}

	public void setiIdNuevoProcesoLiquidacion(Long iIdNuevoProcesoLiquidacion) {
		this.iIdNuevoProcesoLiquidacion = iIdNuevoProcesoLiquidacion;
	}
	
	public Long getidProcesoLiquidacionActual() {
		return this.idProcesoLiquidacionActual;
	}

	public void setidProcesoLiquidacionActual(Long idProcesoLiquidacionActual) {
		this.idProcesoLiquidacionActual = idProcesoLiquidacionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoLiquidacion getprocesoliquidacion() {
		return this.procesoliquidacion;
	}

	public void setprocesoliquidacion(ProcesoLiquidacion procesoliquidacion) {
		this.procesoliquidacion = procesoliquidacion;
	}
	
	public ProcesoLiquidacion getprocesoliquidacionAux() {
		return this.procesoliquidacionAux;
	}

	public void setprocesoliquidacionAux(ProcesoLiquidacion procesoliquidacionAux) {
		this.procesoliquidacionAux = procesoliquidacionAux;
	}				
	
	public ProcesoLiquidacion getprocesoliquidacionAnterior() {
		return this.procesoliquidacionAnterior;
	}

	public void setprocesoliquidacionAnterior(ProcesoLiquidacion procesoliquidacionAnterior) {
		this.procesoliquidacionAnterior = procesoliquidacionAnterior;
	}	
	
	public ProcesoLiquidacion getprocesoliquidacionTotales() {
		return this.procesoliquidacionTotales;
	}

	public void setprocesoliquidacionTotales(ProcesoLiquidacion procesoliquidacionTotales) {
		this.procesoliquidacionTotales = procesoliquidacionTotales;
	}	
	
	public ProcesoLiquidacion getprocesoliquidacionBean() {
		return this.procesoliquidacionBean;
	}

	public void setprocesoliquidacionBean(ProcesoLiquidacion procesoliquidacionBean) {
		this.procesoliquidacionBean = procesoliquidacionBean;
	}	
	
	public ProcesoLiquidacionParameterReturnGeneral getprocesoliquidacionReturnGeneral() {
		return this.procesoliquidacionReturnGeneral;
	}

	public void setprocesoliquidacionReturnGeneral(ProcesoLiquidacionParameterReturnGeneral procesoliquidacionReturnGeneral) {
		this.procesoliquidacionReturnGeneral = procesoliquidacionReturnGeneral;
	}	
	
	
	public Date fechaBusquedaProcesoLiquidacion=new Date();

	public Date getfechaBusquedaProcesoLiquidacion() {
		return this.fechaBusquedaProcesoLiquidacion;
	}

	public void setfechaBusquedaProcesoLiquidacion(Date fechaBusquedaProcesoLiquidacion) {
		this.fechaBusquedaProcesoLiquidacion = fechaBusquedaProcesoLiquidacion;
	}

;
	public Boolean es_reversarBusquedaProcesoLiquidacion=false;

	public Boolean getes_reversarBusquedaProcesoLiquidacion() {
		return this.es_reversarBusquedaProcesoLiquidacion;
	}

	public void setes_reversarBusquedaProcesoLiquidacion(Boolean es_reversarBusquedaProcesoLiquidacion) {
		this.es_reversarBusquedaProcesoLiquidacion = es_reversarBusquedaProcesoLiquidacion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoLiquidacionLogic getProcesoLiquidacionLogic()	{		
		return procesoliquidacionLogic;
	}

	public void setProcesoLiquidacionLogic(ProcesoLiquidacionLogic procesoliquidacionLogic) {
		this.procesoliquidacionLogic = procesoliquidacionLogic;
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
	
	public Boolean getIsEsNuevoProcesoLiquidacion() {
		return isEsNuevoProcesoLiquidacion;
	}

	public void setIsEsNuevoProcesoLiquidacion(Boolean isEsNuevoProcesoLiquidacion) {
		this.isEsNuevoProcesoLiquidacion = isEsNuevoProcesoLiquidacion;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoLiquidacion() {
		return esParaAccionDesdeFormularioProcesoLiquidacion;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoLiquidacion(Boolean esParaAccionDesdeFormularioProcesoLiquidacion) {
		this.esParaAccionDesdeFormularioProcesoLiquidacion = esParaAccionDesdeFormularioProcesoLiquidacion;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesProcesoLiquidacion() throws Exception {
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
		
	public ProcesoLiquidacionParameterReturnGeneral getProcesoLiquidacionParameterGeneral() {
		return this.procesoliquidacionParameterGeneral;
	}
	
	public void setProcesoLiquidacionParameterGeneral(ProcesoLiquidacionParameterReturnGeneral procesoliquidacionParameterGeneral) {
		this.procesoliquidacionParameterGeneral = procesoliquidacionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoLiquidacion() {
		return isPermisoTodoProcesoLiquidacion;
	}

	public void setIsPermisoTodoProcesoLiquidacion(Boolean isPermisoTodoProcesoLiquidacion) {
		this.isPermisoTodoProcesoLiquidacion = isPermisoTodoProcesoLiquidacion;
	}

	public Boolean getIsPermisoNuevoProcesoLiquidacion() {
		return isPermisoNuevoProcesoLiquidacion;
	}

	public void setIsPermisoNuevoProcesoLiquidacion(Boolean isPermisoNuevoProcesoLiquidacion) {
		this.isPermisoNuevoProcesoLiquidacion = isPermisoNuevoProcesoLiquidacion;
	}

	public Boolean getIsPermisoActualizarProcesoLiquidacion() {
		return isPermisoActualizarProcesoLiquidacion;
	}

	public void setIsPermisoActualizarProcesoLiquidacion(Boolean isPermisoActualizarProcesoLiquidacion) {
		this.isPermisoActualizarProcesoLiquidacion = isPermisoActualizarProcesoLiquidacion;
	}

	public Boolean getIsPermisoEliminarProcesoLiquidacion() {
		return isPermisoEliminarProcesoLiquidacion;
	}

	public void setIsPermisoEliminarProcesoLiquidacion(Boolean isPermisoEliminarProcesoLiquidacion) {
		this.isPermisoEliminarProcesoLiquidacion = isPermisoEliminarProcesoLiquidacion;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoLiquidacion() {
		return isPermisoGuardarCambiosProcesoLiquidacion;
	}

	public void setIsPermisoGuardarCambiosProcesoLiquidacion(Boolean isPermisoGuardarCambiosProcesoLiquidacion) {
		this.isPermisoGuardarCambiosProcesoLiquidacion = isPermisoGuardarCambiosProcesoLiquidacion;
	}
	
	public Boolean getIsPermisoConsultaProcesoLiquidacion() {
		return isPermisoConsultaProcesoLiquidacion;
	}

	public void setIsPermisoConsultaProcesoLiquidacion(Boolean isPermisoConsultaProcesoLiquidacion) {
		this.isPermisoConsultaProcesoLiquidacion = isPermisoConsultaProcesoLiquidacion;
	}

	public Boolean getIsPermisoBusquedaProcesoLiquidacion() {
		return isPermisoBusquedaProcesoLiquidacion;
	}

	public void setIsPermisoBusquedaProcesoLiquidacion(Boolean isPermisoBusquedaProcesoLiquidacion) {
		this.isPermisoBusquedaProcesoLiquidacion = isPermisoBusquedaProcesoLiquidacion;
	}

	public Boolean getIsPermisoReporteProcesoLiquidacion() {
		return isPermisoReporteProcesoLiquidacion;
	}

	public void setIsPermisoReporteProcesoLiquidacion(Boolean isPermisoReporteProcesoLiquidacion) {
		this.isPermisoReporteProcesoLiquidacion = isPermisoReporteProcesoLiquidacion;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoLiquidacion() {
		return isPermisoPaginacionMedioProcesoLiquidacion;
	}

	public void setIsPermisoPaginacionMedioProcesoLiquidacion(Boolean isPermisoPaginacionMedioProcesoLiquidacion) {
		this.isPermisoPaginacionMedioProcesoLiquidacion = isPermisoPaginacionMedioProcesoLiquidacion;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoLiquidacion() {
		return isPermisoPaginacionTodoProcesoLiquidacion;
	}

	public void setIsPermisoPaginacionTodoProcesoLiquidacion(Boolean isPermisoPaginacionTodoProcesoLiquidacion) {
		this.isPermisoPaginacionTodoProcesoLiquidacion = isPermisoPaginacionTodoProcesoLiquidacion;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoLiquidacion() {
		return isPermisoPaginacionAltoProcesoLiquidacion;
	}

	public void setIsPermisoPaginacionAltoProcesoLiquidacion(Boolean isPermisoPaginacionAltoProcesoLiquidacion) {
		this.isPermisoPaginacionAltoProcesoLiquidacion = isPermisoPaginacionAltoProcesoLiquidacion;
	}
	
	public Boolean getIsPermisoCopiarProcesoLiquidacion() {
		return isPermisoCopiarProcesoLiquidacion;
	}

	public void setIsPermisoCopiarProcesoLiquidacion(Boolean isPermisoCopiarProcesoLiquidacion) {
		this.isPermisoCopiarProcesoLiquidacion = isPermisoCopiarProcesoLiquidacion;
	}
	
	public Boolean getIsPermisoVerFormProcesoLiquidacion() {
		return isPermisoVerFormProcesoLiquidacion;
	}

	public void setIsPermisoVerFormProcesoLiquidacion(Boolean isPermisoVerFormProcesoLiquidacion) {
		this.isPermisoVerFormProcesoLiquidacion = isPermisoVerFormProcesoLiquidacion;
	}
	
	public Boolean getIsPermisoDuplicarProcesoLiquidacion() {
		return isPermisoDuplicarProcesoLiquidacion;
	}

	public void setIsPermisoDuplicarProcesoLiquidacion(Boolean isPermisoDuplicarProcesoLiquidacion) {
		this.isPermisoDuplicarProcesoLiquidacion = isPermisoDuplicarProcesoLiquidacion;
	}
	
	public Boolean getIsPermisoOrdenProcesoLiquidacion() {
		return isPermisoOrdenProcesoLiquidacion;
	}

	public void setIsPermisoOrdenProcesoLiquidacion(Boolean isPermisoOrdenProcesoLiquidacion) {
		this.isPermisoOrdenProcesoLiquidacion = isPermisoOrdenProcesoLiquidacion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoLiquidacion() {
		return isVisibilidadCeldaNuevoProcesoLiquidacion;
	}

	public void setIsVisibilidadCeldaNuevoProcesoLiquidacion(Boolean isVisibilidadCeldaNuevoProcesoLiquidacion) {
		this.isVisibilidadCeldaNuevoProcesoLiquidacion = isVisibilidadCeldaNuevoProcesoLiquidacion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoLiquidacion() {
		return isVisibilidadCeldaDuplicarProcesoLiquidacion;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoLiquidacion(Boolean isVisibilidadCeldaDuplicarProcesoLiquidacion) {
		this.isVisibilidadCeldaDuplicarProcesoLiquidacion = isVisibilidadCeldaDuplicarProcesoLiquidacion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoLiquidacion() {
		return isVisibilidadCeldaCopiarProcesoLiquidacion;
	}

	public void setIsVisibilidadCeldaCopiarProcesoLiquidacion(Boolean isVisibilidadCeldaCopiarProcesoLiquidacion) {
		this.isVisibilidadCeldaCopiarProcesoLiquidacion = isVisibilidadCeldaCopiarProcesoLiquidacion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoLiquidacion() {
		return isVisibilidadCeldaVerFormProcesoLiquidacion;
	}

	public void setIsVisibilidadCeldaVerFormProcesoLiquidacion(Boolean isVisibilidadCeldaVerFormProcesoLiquidacion) {
		this.isVisibilidadCeldaVerFormProcesoLiquidacion = isVisibilidadCeldaVerFormProcesoLiquidacion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoLiquidacion() {
		return isVisibilidadCeldaOrdenProcesoLiquidacion;
	}

	public void setIsVisibilidadCeldaOrdenProcesoLiquidacion(Boolean isVisibilidadCeldaOrdenProcesoLiquidacion) {
		this.isVisibilidadCeldaOrdenProcesoLiquidacion = isVisibilidadCeldaOrdenProcesoLiquidacion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoLiquidacion() {
		return isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoLiquidacion(Boolean isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion = isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoLiquidacion() {
		return isVisibilidadCeldaModificarProcesoLiquidacion;
	}

	public void setIsVisibilidadCeldaModificarProcesoLiquidacion(Boolean isVisibilidadCeldaModificarProcesoLiquidacion) {
		this.isVisibilidadCeldaModificarProcesoLiquidacion = isVisibilidadCeldaModificarProcesoLiquidacion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoLiquidacion() {
		return isVisibilidadCeldaActualizarProcesoLiquidacion;
	}

	public void setIsVisibilidadCeldaActualizarProcesoLiquidacion(Boolean isVisibilidadCeldaActualizarProcesoLiquidacion) {
		this.isVisibilidadCeldaActualizarProcesoLiquidacion = isVisibilidadCeldaActualizarProcesoLiquidacion;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoLiquidacion() {
		return isVisibilidadCeldaEliminarProcesoLiquidacion;
	}

	public void setIsVisibilidadCeldaEliminarProcesoLiquidacion(Boolean isVisibilidadCeldaEliminarProcesoLiquidacion) {
		this.isVisibilidadCeldaEliminarProcesoLiquidacion = isVisibilidadCeldaEliminarProcesoLiquidacion;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoLiquidacion() {
		return isVisibilidadCeldaCancelarProcesoLiquidacion;
	}

	public void setIsVisibilidadCeldaCancelarProcesoLiquidacion(Boolean isVisibilidadCeldaCancelarProcesoLiquidacion) {
		this.isVisibilidadCeldaCancelarProcesoLiquidacion = isVisibilidadCeldaCancelarProcesoLiquidacion;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoLiquidacion() {
		return isVisibilidadCeldaGuardarProcesoLiquidacion;
	}

	public void setIsVisibilidadCeldaGuardarProcesoLiquidacion(Boolean isVisibilidadCeldaGuardarProcesoLiquidacion) {
		this.isVisibilidadCeldaGuardarProcesoLiquidacion = isVisibilidadCeldaGuardarProcesoLiquidacion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoLiquidacion() {
		return isVisibilidadCeldaGuardarCambiosProcesoLiquidacion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoLiquidacion(Boolean isVisibilidadCeldaGuardarCambiosProcesoLiquidacion) {
		this.isVisibilidadCeldaGuardarCambiosProcesoLiquidacion = isVisibilidadCeldaGuardarCambiosProcesoLiquidacion;
	}
		
	public ProcesoLiquidacionSessionBean getprocesoliquidacionSessionBean() {
		return this.procesoliquidacionSessionBean;
	}
	
	public void setprocesoliquidacionSessionBean(ProcesoLiquidacionSessionBean procesoliquidacionSessionBean) {
		this.procesoliquidacionSessionBean=procesoliquidacionSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoLiquidacion() {
		return this.isVisibilidadBusquedaProcesoLiquidacion;
	}

	public void setisVisibilidadBusquedaProcesoLiquidacion(Boolean isVisibilidadBusquedaProcesoLiquidacion) {
		this.isVisibilidadBusquedaProcesoLiquidacion=isVisibilidadBusquedaProcesoLiquidacion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoLiquidacion(ProcesoLiquidacion procesoliquidacion)throws Exception {
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
	
	public void bugActualizarReferenciaActual(ProcesoLiquidacion procesoliquidacion,ProcesoLiquidacion procesoliquidacionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoLiquidacion(procesoliquidacion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesoliquidacionAux.setId(procesoliquidacion.getId());
		procesoliquidacionAux.setVersionRow(procesoliquidacion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoLiquidacion procesoliquidacionLocal) throws Exception {
		
		if(this.procesoliquidacionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoLiquidacion procesoliquidacionLocal) throws Exception {	
		if(this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarProcesoLiquidacionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesoliquidacionValidator.getInvalidValues(this.procesoliquidacion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoLiquidacion procesoliquidacion,List<ProcesoLiquidacion> procesoliquidacions) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoLiquidacion procesoliquidacion,List<ProcesoLiquidacion> procesoliquidacions) throws Exception {
		try	{			
			ProcesoLiquidacionConstantesFunciones.actualizarSelectedLista(procesoliquidacion,procesoliquidacions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoLiquidacion> procesoliquidacionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesoliquidacionsLocal=this.procesoliquidacionLogic.getProcesoLiquidacions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesoliquidacionsLocal=this.procesoliquidacions;
			}
			//ARCHITECTURE
		
			for(ProcesoLiquidacion procesoliquidacionLocal:procesoliquidacionsLocal) {
				if(this.permiteMantenimiento(procesoliquidacionLocal) && procesoliquidacionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoLiquidacionConstantesFunciones.getProcesoLiquidacionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoLiquidacionConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoLiquidacion.jLabelfechaProcesoLiquidacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoLiquidacionConstantesFunciones.ESREVERSAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoLiquidacion.jLabeles_reversarProcesoLiquidacion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoLiquidacion.jLabelfechaProcesoLiquidacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoLiquidacion.jLabeles_reversarProcesoLiquidacion,"");
		
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
		this.iIdNuevoProcesoLiquidacion--;	
		
		
		this.procesoliquidacionAux=new ProcesoLiquidacion();
		
		this.procesoliquidacionAux.setId(this.iIdNuevoProcesoLiquidacion);
		this.procesoliquidacionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesoliquidacionLogic.getProcesoLiquidacions().add(this.procesoliquidacionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesoliquidacions.add(this.procesoliquidacionAux);
		}
		//ARCHITECTURE
		
		this.procesoliquidacion=this.procesoliquidacionAux;
		
		if(ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoLiquidacion(this.procesoliquidacion);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoLiquidacion(this.procesoliquidacion);
		}
				
		//this.setDefaultControlesProcesoLiquidacion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoLiquidacion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoLiquidacion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoLiquidacion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoLiquidacion(this.procesoliquidacionBean,this.procesoliquidacion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoLiquidacion(this.procesoliquidacion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoLiquidacion(this.procesoliquidacionReturnGeneral,this.procesoliquidacionBean,false);
		
		if(this.procesoliquidacionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoLiquidacion(this.procesoliquidacionReturnGeneral.getProcesoLiquidacion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoLiquidacion(this.procesoliquidacionReturnGeneral.getProcesoLiquidacion());
		}
		
		if(this.procesoliquidacionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoLiquidacion(this.procesoliquidacionReturnGeneral.getProcesoLiquidacion(),classes);//this.procesoliquidacionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoLiquidacion(this.procesoliquidacion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoLiquidacion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoLiquidacion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.RecargarFormProcesoLiquidacion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoLiquidacion(false);
						
			if(procesoliquidacionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoLiquidacion();
			}
			
			this.actualizarVisualTableDatosProcesoLiquidacion();
			
			this.jTableDatosProcesoLiquidacion.setRowSelectionInterval(this.getIndiceNuevoProcesoLiquidacion(), this.getIndiceNuevoProcesoLiquidacion());
			
			this.seleccionarFilaTablaProcesoLiquidacionActual();
						
			this.actualizarEstadoCeldasBotonesProcesoLiquidacion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoLiquidacion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoLiquidacion.jDateChooserfechaProcesoLiquidacion.setEnabled(isHabilitar && this.procesoliquidacionConstantesFunciones.activarfechaProcesoLiquidacion);
		this.jInternalFrameDetalleFormProcesoLiquidacion.jCheckBoxes_reversarProcesoLiquidacion.setEnabled(isHabilitar && this.procesoliquidacionConstantesFunciones.activares_reversarProcesoLiquidacion);	
		
	};
	
	public void setDefaultControlesProcesoLiquidacion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoLiquidacion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesoliquidacionSessionBean.setConGuardarRelaciones(true);			
			this.procesoliquidacionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoLiquidacion.jTabbedPaneRelacionesProcesoLiquidacion.setVisible(true);
			
					
		} else {
			//this.procesoliquidacionSessionBean.setConGuardarRelaciones(false);			
			this.procesoliquidacionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoLiquidacion.jTabbedPaneRelacionesProcesoLiquidacion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoLiquidacion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoLiquidacion procesoliquidacionAux:this.procesoliquidacionLogic.getProcesoLiquidacions()) {
				if(procesoliquidacionAux.getId().equals(this.iIdNuevoProcesoLiquidacion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoLiquidacion procesoliquidacionAux:this.procesoliquidacions) {
				if(procesoliquidacionAux.getId().equals(this.iIdNuevoProcesoLiquidacion)) {
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
	
	public int getIndiceActualProcesoLiquidacion(ProcesoLiquidacion procesoliquidacion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoLiquidacion procesoliquidacionAux:this.procesoliquidacionLogic.getProcesoLiquidacions()) {
				if(procesoliquidacionAux.getId().equals(procesoliquidacion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoLiquidacion procesoliquidacionAux:this.procesoliquidacions) {
				if(procesoliquidacionAux.getId().equals(procesoliquidacion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoLiquidacion(ProcesoLiquidacion procesoliquidacionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoLiquidacion procesoliquidacionAux:this.procesoliquidacionLogic.getProcesoLiquidacions()) {
				if(procesoliquidacionAux.getProcesoLiquidacionOriginal().getId().equals(procesoliquidacionOriginal.getId())) {
					existe=true;
					procesoliquidacionOriginal.setId(procesoliquidacionAux.getId());
					procesoliquidacionOriginal.setVersionRow(procesoliquidacionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoLiquidacion procesoliquidacionAux:this.procesoliquidacions) {
				if(procesoliquidacionAux.getProcesoLiquidacionOriginal().getId().equals(procesoliquidacionOriginal.getId())) {
					existe=true;
					procesoliquidacionOriginal.setId(procesoliquidacionAux.getId());
					procesoliquidacionOriginal.setVersionRow(procesoliquidacionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoLiquidacion(Boolean esParaCancelar) throws Exception {
		procesoliquidacionsAux=new ArrayList<ProcesoLiquidacion>();
		procesoliquidacionAux=new ProcesoLiquidacion();
		
		if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoLiquidacion procesoliquidacionAux:this.procesoliquidacionLogic.getProcesoLiquidacions()) {
					if(procesoliquidacionAux.getId()<0) {
						procesoliquidacionsAux.add(procesoliquidacionAux);
					}		
				}
				this.iIdNuevoProcesoLiquidacion=0L;
				this.procesoliquidacionLogic.getProcesoLiquidacions().removeAll(procesoliquidacionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoLiquidacion procesoliquidacionAux:this.procesoliquidacions) {
					if(procesoliquidacionAux.getId()<0) {
						procesoliquidacionsAux.add(procesoliquidacionAux);
					}		
				}
				this.iIdNuevoProcesoLiquidacion=0L;
				this.procesoliquidacions.removeAll(procesoliquidacionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoLiquidacion 
					&& this.procesoliquidacionLogic.getProcesoLiquidacions().size()>0
					) {
					procesoliquidacionAux=this.procesoliquidacionLogic.getProcesoLiquidacions().get(this.procesoliquidacionLogic.getProcesoLiquidacions().size() - 1);
				
					if(procesoliquidacionAux.getId()<0) {
						this.procesoliquidacionLogic.getProcesoLiquidacions().remove(procesoliquidacionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoLiquidacion && this.procesoliquidacions.size()>0) {
					procesoliquidacionAux=this.procesoliquidacions.get(this.procesoliquidacions.size() - 1);
				
					if(procesoliquidacionAux.getId()<0) {
						this.procesoliquidacions.remove(procesoliquidacionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoLiquidacion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesoliquidacion.getId()<0) {
				this.procesoliquidacionLogic.getProcesoLiquidacions().remove(this.procesoliquidacion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesoliquidacion.getId()<0) {
				this.procesoliquidacions.remove(this.procesoliquidacion);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoLiquidacion(List<ProcesoLiquidacion> procesoliquidacionsAux) throws Exception {
		ProcesoLiquidacionConstantesFunciones.setEstadosInicialesProcesoLiquidacion(procesoliquidacionsAux);
	}
	
	public void setEstadosInicialesProcesoLiquidacion(ProcesoLiquidacion procesoliquidacionAux) throws Exception {
		ProcesoLiquidacionConstantesFunciones.setEstadosInicialesProcesoLiquidacion(procesoliquidacionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoLiquidacionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoLiquidacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoLiquidacionActual()) {
				if(!this.isEsNuevoProcesoLiquidacion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoLiquidacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoLiquidacion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoLiquidacionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Liquidacion ?", "MANTENIMIENTO DE Proceso Liquidacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoLiquidacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoLiquidacion procesoliquidacion) throws Exception {
		ProcesoLiquidacionConstantesFunciones.seleccionarAsignar(this.procesoliquidacion,procesoliquidacion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoLiquidacion=this.isPermisoActualizarOriginalProcesoLiquidacion;
			
			
			this.seleccionarAsignar(procesoliquidacion);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoLiquidacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesoliquidacionSessionBean.setsFuncionBusquedaRapida(this.procesoliquidacionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoLiquidacion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoLiquidacion(esParaCancelar);				
				this.cancelarNuevoProcesoLiquidacion(esParaCancelar);								
			}
			
			this.procesoliquidacion=new ProcesoLiquidacion();
			
			this.inicializarProcesoLiquidacion();
			
			this.actualizarEstadoCeldasBotonesProcesoLiquidacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoLiquidacion() throws Exception {
		try {
			ProcesoLiquidacionConstantesFunciones.inicializarProcesoLiquidacion(this.procesoliquidacion);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesoliquidacionLogic.getProcesoLiquidacions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoLiquidacions(String sAccionBusqueda,List<ProcesoLiquidacion> procesoliquidacionsParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoLiquidacion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoLiquidacionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoLiquidacionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoLiquidacion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Liquidaciones");		
		parameters.put("busquedapor", ProcesoLiquidacionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoLiquidacion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoLiquidacion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoLiquidacionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoLiquidacionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoLiquidacionBean.TraerProcesoLiquidacionBeans(procesoliquidacionsParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoLiquidacions(sAccionBusqueda,sTipoArchivoReporte,procesoliquidacionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoLiquidacions(sAccionBusqueda,sTipoArchivoReporte,procesoliquidacionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoLiquidacionActionPerformed(null);
					//this.generarExcelReporteProcesoLiquidacions(sAccionBusqueda,sTipoArchivoReporte,procesoliquidacionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoLiquidacions(sAccionBusqueda,sTipoArchivoReporte,procesoliquidacionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoLiquidacions(sAccionBusqueda,sTipoArchivoReporte,procesoliquidacionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoLiquidacions(sAccionBusqueda,sTipoArchivoReporte,procesoliquidacionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoLiquidacions(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoLiquidacion> procesoliquidacionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoliquidacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoLiquidacions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoLiquidacion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoLiquidacion procesoliquidacion : procesoliquidacionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoLiquidacionConstantesFunciones.generarExcelReporteDataProcesoLiquidacion("NORMAL",row,workbook,procesoliquidacion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Liquidacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoLiquidacion(String sTipo,Row row,Workbook workbook) {
		
		ProcesoLiquidacionConstantesFunciones.generarExcelReporteHeaderProcesoLiquidacion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoLiquidacions(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoLiquidacion> procesoliquidacionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoliquidacion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoLiquidacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoLiquidacion procesoliquidacion : procesoliquidacionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoLiquidacionConstantesFunciones.getProcesoLiquidacionDescripcion(procesoliquidacion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoLiquidacionConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoLiquidacionConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesoliquidacion.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoLiquidacionConstantesFunciones.LABEL_ESREVERSAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoLiquidacionConstantesFunciones.LABEL_ESREVERSAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(procesoliquidacion.getes_reversar()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Liquidacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoLiquidacions(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoLiquidacion> procesoliquidacionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoLiquidacion> procesoliquidacionsRespaldo=null;
		
		classes=ProcesoLiquidacionConstantesFunciones.getClassesRelationshipsOfProcesoLiquidacion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesoliquidacionLogic.setDatosCliente(this.datosCliente);
		this.procesoliquidacionLogic.setDatosDeep(this.datosDeep);
		this.procesoliquidacionLogic.setIsConDeep(true);
		
		procesoliquidacionsRespaldo=this.procesoliquidacionLogic.getProcesoLiquidacions();
		
		this.procesoliquidacionLogic.setProcesoLiquidacions(procesoliquidacionsParaReportes);	
		this.procesoliquidacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesoliquidacionsParaReportes=this.procesoliquidacionLogic.getProcesoLiquidacions();
		this.procesoliquidacionLogic.setProcesoLiquidacions(procesoliquidacionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoliquidacion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoLiquidacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoLiquidacion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoLiquidacion procesoliquidacion : procesoliquidacionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoLiquidacion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoLiquidacionConstantesFunciones.generarExcelReporteDataProcesoLiquidacion("NORMAL",row,workbook,procesoliquidacion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoLiquidacionConstantesFunciones.getProcesoLiquidacionDescripcion(procesoliquidacion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Liquidacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoLiquidacion() throws Exception {		
		this.startProcessProcesoLiquidacion(true);
	}
	
	public void startProcessProcesoLiquidacion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoLiquidacion ,this.jPanelParametrosReportesProcesoLiquidacion, this.jScrollPanelDatosProcesoLiquidacion,this.jPanelPaginacionProcesoLiquidacion, this.jScrollPanelDatosEdicionProcesoLiquidacion, this.jPanelAccionesProcesoLiquidacion,this.jPanelAccionesFormularioProcesoLiquidacion,this.jmenuBarProcesoLiquidacion,this.jmenuBarDetalleProcesoLiquidacion,this.jTtoolBarProcesoLiquidacion,this.jTtoolBarDetalleProcesoLiquidacion);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoLiquidacion=this.jTabbedPaneBusquedasProcesoLiquidacion; 
		
		final JPanel jPanelParametrosReportesProcesoLiquidacion=this.jPanelParametrosReportesProcesoLiquidacion;
		//final JScrollPane jScrollPanelDatosProcesoLiquidacion=this.jScrollPanelDatosProcesoLiquidacion;
		final JTable jTableDatosProcesoLiquidacion=this.jTableDatosProcesoLiquidacion;		
		final JPanel jPanelPaginacionProcesoLiquidacion=this.jPanelPaginacionProcesoLiquidacion;
		//final JScrollPane jScrollPanelDatosEdicionProcesoLiquidacion=this.jScrollPanelDatosEdicionProcesoLiquidacion;
		final JPanel jPanelAccionesProcesoLiquidacion=this.jPanelAccionesProcesoLiquidacion;
		
		JPanel jPanelCamposAuxiliarProcesoLiquidacion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoLiquidacion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {
			jPanelCamposAuxiliarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jPanelCamposProcesoLiquidacion;
			jPanelAccionesFormularioAuxiliarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jPanelAccionesFormularioProcesoLiquidacion;
		}
		
		final JPanel jPanelCamposProcesoLiquidacion=jPanelCamposAuxiliarProcesoLiquidacion;
		final JPanel jPanelAccionesFormularioProcesoLiquidacion=jPanelAccionesFormularioAuxiliarProcesoLiquidacion;
		
		
		final JMenuBar jmenuBarProcesoLiquidacion=this.jmenuBarProcesoLiquidacion;
		final JToolBar jTtoolBarProcesoLiquidacion=this.jTtoolBarProcesoLiquidacion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoLiquidacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoLiquidacion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {
			jmenuBarDetalleAuxiliarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jmenuBarDetalleProcesoLiquidacion;
			jTtoolBarDetalleAuxiliarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jTtoolBarDetalleProcesoLiquidacion;
		}
		
		final JMenuBar jmenuBarDetalleProcesoLiquidacion=jmenuBarDetalleAuxiliarProcesoLiquidacion;
		final JToolBar jTtoolBarDetalleProcesoLiquidacion=jTtoolBarDetalleAuxiliarProcesoLiquidacion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoLiquidacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoLiquidacion;
			processRunnable.jTableDatos=jTableDatosProcesoLiquidacion;
			processRunnable.jPanelCampos=jPanelCamposProcesoLiquidacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoLiquidacion;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoLiquidacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoLiquidacion;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoLiquidacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoLiquidacion;
			processRunnable.jTtoolBar=jTtoolBarProcesoLiquidacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoLiquidacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoLiquidacion ,jPanelParametrosReportesProcesoLiquidacion,jTableDatosProcesoLiquidacion, /*jScrollPanelDatosProcesoLiquidacion,*/jPanelCamposProcesoLiquidacion,jPanelPaginacionProcesoLiquidacion, /*jScrollPanelDatosEdicionProcesoLiquidacion,*/ jPanelAccionesProcesoLiquidacion,jPanelAccionesFormularioProcesoLiquidacion,jmenuBarProcesoLiquidacion,jmenuBarDetalleProcesoLiquidacion,jTtoolBarProcesoLiquidacion,jTtoolBarDetalleProcesoLiquidacion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoLiquidacion ,jPanelParametrosReportesProcesoLiquidacion, jScrollPanelDatosProcesoLiquidacion,jPanelPaginacionProcesoLiquidacion, jScrollPanelDatosEdicionProcesoLiquidacion, jPanelAccionesProcesoLiquidacion,jPanelAccionesFormularioProcesoLiquidacion,jmenuBarProcesoLiquidacion,jmenuBarDetalleProcesoLiquidacion,jTtoolBarProcesoLiquidacion,jTtoolBarDetalleProcesoLiquidacion);
						
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
	
	public void finishProcessProcesoLiquidacion() {// throws Exception 
		this.finishProcessProcesoLiquidacion(true);
	}
	
	public void finishProcessProcesoLiquidacion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoLiquidacion ,this.jPanelParametrosReportesProcesoLiquidacion, this.jScrollPanelDatosProcesoLiquidacion,this.jPanelPaginacionProcesoLiquidacion, this.jScrollPanelDatosEdicionProcesoLiquidacion, this.jPanelAccionesProcesoLiquidacion,this.jPanelAccionesFormularioProcesoLiquidacion,this.jmenuBarProcesoLiquidacion,this.jmenuBarDetalleProcesoLiquidacion,this.jTtoolBarProcesoLiquidacion,this.jTtoolBarDetalleProcesoLiquidacion);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoLiquidacion=this.jTabbedPaneBusquedasProcesoLiquidacion; 
		
		final JPanel jPanelParametrosReportesProcesoLiquidacion=this.jPanelParametrosReportesProcesoLiquidacion;
		//final JScrollPane jScrollPanelDatosProcesoLiquidacion=this.jScrollPanelDatosProcesoLiquidacion;
		final JTable jTableDatosProcesoLiquidacion=this.jTableDatosProcesoLiquidacion;		
		final JPanel jPanelPaginacionProcesoLiquidacion=this.jPanelPaginacionProcesoLiquidacion;
		//final JScrollPane jScrollPanelDatosEdicionProcesoLiquidacion=this.jScrollPanelDatosEdicionProcesoLiquidacion;
		final JPanel jPanelAccionesProcesoLiquidacion=this.jPanelAccionesProcesoLiquidacion;
		
		JPanel jPanelCamposAuxiliarProcesoLiquidacion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoLiquidacion=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {
			jPanelCamposAuxiliarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jPanelCamposProcesoLiquidacion;
			jPanelAccionesFormularioAuxiliarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jPanelAccionesFormularioProcesoLiquidacion;
		}
		
		final JPanel jPanelCamposProcesoLiquidacion=jPanelCamposAuxiliarProcesoLiquidacion;
		final JPanel jPanelAccionesFormularioProcesoLiquidacion=jPanelAccionesFormularioAuxiliarProcesoLiquidacion;
		
		
		final JMenuBar jmenuBarProcesoLiquidacion=this.jmenuBarProcesoLiquidacion;		
		final JToolBar jTtoolBarProcesoLiquidacion=this.jTtoolBarProcesoLiquidacion;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoLiquidacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoLiquidacion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {
			jmenuBarDetalleAuxiliarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jmenuBarDetalleProcesoLiquidacion;
			jTtoolBarDetalleAuxiliarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jTtoolBarDetalleProcesoLiquidacion;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoLiquidacion=jmenuBarDetalleAuxiliarProcesoLiquidacion;
		final JToolBar jTtoolBarDetalleProcesoLiquidacion=jTtoolBarDetalleAuxiliarProcesoLiquidacion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoLiquidacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoLiquidacion;
			processRunnable.jTableDatos=jTableDatosProcesoLiquidacion;
			processRunnable.jPanelCampos=jPanelCamposProcesoLiquidacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoLiquidacion;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoLiquidacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoLiquidacion;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoLiquidacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoLiquidacion;
			processRunnable.jTtoolBar=jTtoolBarProcesoLiquidacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoLiquidacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoLiquidacion ,jPanelParametrosReportesProcesoLiquidacion, jTableDatosProcesoLiquidacion,/*jScrollPanelDatosProcesoLiquidacion,*/jPanelCamposProcesoLiquidacion,jPanelPaginacionProcesoLiquidacion, /*jScrollPanelDatosEdicionProcesoLiquidacion,*/ jPanelAccionesProcesoLiquidacion,jPanelAccionesFormularioProcesoLiquidacion,jmenuBarProcesoLiquidacion,jmenuBarDetalleProcesoLiquidacion,jTtoolBarProcesoLiquidacion,jTtoolBarDetalleProcesoLiquidacion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoLiquidacion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoLiquidacion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoLiquidacion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoLiquidacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoLiquidacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoLiquidacion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoLiquidacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoLiquidacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoLiquidacion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesoliquidacionConstantesFunciones.getsFinalQueryProcesoLiquidacion();
		String  finalQueryPaginacionTodos=this.procesoliquidacionConstantesFunciones.getsFinalQueryProcesoLiquidacion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoLiquidacionConstantesFunciones.getArrayColumnasGlobalesNoProcesoLiquidacion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoLiquidacionConstantesFunciones.getArrayColumnasGlobalesProcesoLiquidacion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoLiquidacionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesoliquidacionsEliminados= new ArrayList<ProcesoLiquidacion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoLiquidacion();
		
				///*ProcesoLiquidacionSessionBean*/this.procesoliquidacionSessionBean=new ProcesoLiquidacionSessionBean();
			
			if(this.procesoliquidacionSessionBean==null) {
				this.procesoliquidacionSessionBean=new ProcesoLiquidacionSessionBean();
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
					this.iNumeroPaginacion=ProcesoLiquidacionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoLiquidacionConstantesFunciones.getClassesForeignKeysOfProcesoLiquidacion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesoliquidacion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesoliquidacionsAux= new ArrayList<ProcesoLiquidacion>();
			
				
			procesoliquidacionLogic.setDatosCliente(this.datosCliente);
			procesoliquidacionLogic.setDatosDeep(this.datosDeep);
			procesoliquidacionLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoLiquidacion")) {
				this.sDetalleReporte=ProcesoLiquidacionConstantesFunciones.getDetalleIndiceBusquedaProcesoLiquidacion(fechaBusquedaProcesoLiquidacion,es_reversarBusquedaProcesoLiquidacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesoliquidacionLogic.getProcesoLiquidacionsBusquedaProcesoLiquidacion(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fechaBusquedaProcesoLiquidacion,es_reversarBusquedaProcesoLiquidacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoLiquidacionConstantesFunciones.getDetalleIndiceBusquedaProcesoLiquidacion(fechaBusquedaProcesoLiquidacion,es_reversarBusquedaProcesoLiquidacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoLiquidacionConstantesFunciones.getDetalleIndiceBusquedaProcesoLiquidacion(fechaBusquedaProcesoLiquidacion,es_reversarBusquedaProcesoLiquidacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesoliquidacionLogic.getProcesoLiquidacions()==null||procesoliquidacionLogic.getProcesoLiquidacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesoliquidacions==null|| procesoliquidacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoliquidacionsAux=new ArrayList<ProcesoLiquidacion>();
						procesoliquidacionsAux.addAll(procesoliquidacionLogic.getProcesoLiquidacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoliquidacionsAux=new ArrayList<ProcesoLiquidacion>();
							procesoliquidacionsAux.addAll(procesoliquidacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesoliquidacionLogic.getProcesoLiquidacionsBusquedaProcesoLiquidacion(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fechaBusquedaProcesoLiquidacion,es_reversarBusquedaProcesoLiquidacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoLiquidacionConstantesFunciones.getDetalleIndiceBusquedaProcesoLiquidacion(fechaBusquedaProcesoLiquidacion,es_reversarBusquedaProcesoLiquidacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoLiquidacionConstantesFunciones.getDetalleIndiceBusquedaProcesoLiquidacion(fechaBusquedaProcesoLiquidacion,es_reversarBusquedaProcesoLiquidacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoLiquidacions("BusquedaProcesoLiquidacion",procesoliquidacionLogic.getProcesoLiquidacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoLiquidacions("BusquedaProcesoLiquidacion",procesoliquidacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoliquidacionLogic.setProcesoLiquidacions(new ArrayList<ProcesoLiquidacion>());
						procesoliquidacionLogic.getProcesoLiquidacions().addAll(procesoliquidacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoliquidacions=new ArrayList<ProcesoLiquidacion>();
							procesoliquidacions.addAll(procesoliquidacionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoLiquidacion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoLiquidacion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesoliquidacionLogic.getProcesoLiquidacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoliquidacions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesoliquidacionLogic.getProcesoLiquidacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoliquidacions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoLiquidacion procesoliquidacion) {
		Boolean permite=true;
		
		if(this.procesoliquidacion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoLiquidacionConstantesFunciones.getOrderByListaProcesoLiquidacion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoLiquidacionConstantesFunciones.getOrderByListaProcesoLiquidacion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoLiquidacion procesoliquidacion:procesoliquidacionLogic.getProcesoLiquidacions()) {
				if(procesoliquidacion.getsType().equals(Constantes2.S_TOTALES)) {
					procesoliquidacionTotales=procesoliquidacion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoLiquidacion procesoliquidacion:this.procesoliquidacions) {
				if(procesoliquidacion.getsType().equals(Constantes2.S_TOTALES)) {
					procesoliquidacionTotales=procesoliquidacion;
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
			this.procesoliquidacionAux=new ProcesoLiquidacion();
			this.procesoliquidacionAux.setsType(Constantes2.S_TOTALES);
			this.procesoliquidacionAux.setIsNew(false);
			this.procesoliquidacionAux.setIsChanged(false);
			this.procesoliquidacionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoLiquidacionConstantesFunciones.TotalizarValoresFilaProcesoLiquidacion(this.procesoliquidacionLogic.getProcesoLiquidacions(),this.procesoliquidacionAux);
				
				//this.procesoliquidacionLogic.getProcesoLiquidacions().add(this.procesoliquidacionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoLiquidacionConstantesFunciones.TotalizarValoresFilaProcesoLiquidacion(this.procesoliquidacions,this.procesoliquidacionAux);
				
				this.procesoliquidacions.add(this.procesoliquidacionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesoliquidacionTotales=new ProcesoLiquidacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesoliquidacionLogic.getProcesoLiquidacions().remove(procesoliquidacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesoliquidacions.remove(procesoliquidacionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesoliquidacionTotales=new ProcesoLiquidacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoLiquidacion procesoliquidacion:procesoliquidacionLogic.getProcesoLiquidacions()) {
				if(procesoliquidacion.getsType().equals(Constantes2.S_TOTALES)) {
					procesoliquidacionTotales=procesoliquidacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoLiquidacionConstantesFunciones.TotalizarValoresFilaProcesoLiquidacion(this.procesoliquidacionLogic.getProcesoLiquidacions(),procesoliquidacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoLiquidacion procesoliquidacion:this.procesoliquidacions) {
				if(procesoliquidacion.getsType().equals(Constantes2.S_TOTALES)) {
					procesoliquidacionTotales=procesoliquidacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoLiquidacionConstantesFunciones.TotalizarValoresFilaProcesoLiquidacion(this.procesoliquidacions,procesoliquidacionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoLiquidacionsBusquedaProcesoLiquidacion()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoLiquidacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoLiquidacionsBusquedaProcesoLiquidacion(String sFinalQuery,Date fecha,Boolean es_reversar)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoliquidacionLogic.getProcesoLiquidacionsBusquedaProcesoLiquidacion(sFinalQuery,this.pagination,fecha,es_reversar);
				
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
	
	public void inicializarPermisosProcesoLiquidacion() {
		this.isPermisoTodoProcesoLiquidacion=false;
		this.isPermisoNuevoProcesoLiquidacion=false;
		this.isPermisoActualizarProcesoLiquidacion=false;
		this.isPermisoActualizarOriginalProcesoLiquidacion=false;
		this.isPermisoEliminarProcesoLiquidacion=false;
		this.isPermisoGuardarCambiosProcesoLiquidacion=false;
		this.isPermisoConsultaProcesoLiquidacion=true;
		this.isPermisoBusquedaProcesoLiquidacion=true;
		this.isPermisoReporteProcesoLiquidacion=true;
		this.isPermisoOrdenProcesoLiquidacion=false;		
		this.isPermisoPaginacionMedioProcesoLiquidacion=false;		
		this.isPermisoPaginacionAltoProcesoLiquidacion=false;		
		this.isPermisoPaginacionTodoProcesoLiquidacion=false;		
		this.isPermisoCopiarProcesoLiquidacion=false;		
		this.isPermisoVerFormProcesoLiquidacion=false;		
		this.isPermisoDuplicarProcesoLiquidacion=false;
		this.isPermisoOrdenProcesoLiquidacion=false;
	}
	
	public void setPermisosUsuarioProcesoLiquidacion(Boolean isPermiso) {
		this.isPermisoTodoProcesoLiquidacion=isPermiso;
		this.isPermisoNuevoProcesoLiquidacion=isPermiso;
		this.isPermisoActualizarProcesoLiquidacion=isPermiso;
		this.isPermisoActualizarOriginalProcesoLiquidacion=isPermiso;
		this.isPermisoEliminarProcesoLiquidacion=isPermiso;
		this.isPermisoGuardarCambiosProcesoLiquidacion=isPermiso;
		this.isPermisoConsultaProcesoLiquidacion=isPermiso;
		this.isPermisoBusquedaProcesoLiquidacion=isPermiso;
		this.isPermisoReporteProcesoLiquidacion=isPermiso;
		this.isPermisoOrdenProcesoLiquidacion=isPermiso;		
		this.isPermisoPaginacionMedioProcesoLiquidacion=isPermiso;		
		this.isPermisoPaginacionAltoProcesoLiquidacion=isPermiso;		
		this.isPermisoPaginacionTodoProcesoLiquidacion=isPermiso;		
		this.isPermisoCopiarProcesoLiquidacion=isPermiso;		
		this.isPermisoVerFormProcesoLiquidacion=isPermiso;		
		this.isPermisoDuplicarProcesoLiquidacion=isPermiso;
		this.isPermisoOrdenProcesoLiquidacion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoLiquidacion(Boolean isPermiso) {
		//this.isPermisoTodoProcesoLiquidacion=isPermiso;
		this.isPermisoNuevoProcesoLiquidacion=isPermiso;
		this.isPermisoActualizarProcesoLiquidacion=isPermiso;
		this.isPermisoActualizarOriginalProcesoLiquidacion=isPermiso;
		this.isPermisoEliminarProcesoLiquidacion=isPermiso;
		this.isPermisoGuardarCambiosProcesoLiquidacion=isPermiso;
		//this.isPermisoConsultaProcesoLiquidacion=isPermiso;
		//this.isPermisoBusquedaProcesoLiquidacion=isPermiso;
		//this.isPermisoReporteProcesoLiquidacion=isPermiso;
		//this.isPermisoOrdenProcesoLiquidacion=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoLiquidacion=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoLiquidacion=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoLiquidacion=isPermiso;		
		//this.isPermisoCopiarProcesoLiquidacion=isPermiso;		
		//this.isPermisoDuplicarProcesoLiquidacion=isPermiso;
		//this.isPermisoOrdenProcesoLiquidacion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoLiquidacionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoLiquidacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoLiquidacion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoLiquidacionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoLiquidacionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoLiquidacionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoLiquidacionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoLiquidacion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoLiquidacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoLiquidacionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoLiquidacion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoLiquidacion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoLiquidacion=this.isPermisoActualizarProcesoLiquidacion;
			this.isPermisoEliminarProcesoLiquidacion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoLiquidacion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoLiquidacion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoLiquidacion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoLiquidacion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoLiquidacion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoLiquidacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoLiquidacion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoLiquidacion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoLiquidacion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoLiquidacion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoLiquidacion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoLiquidacion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoLiquidacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoLiquidacion.setToolTipText(this.jTableDatosProcesoLiquidacion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoLiquidacion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoLiquidacion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoLiquidacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoLiquidacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoLiquidacion() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyProcesoLiquidacionListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoLiquidacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoLiquidacionJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoLiquidacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyProcesoLiquidacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoLiquidacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoLiquidacion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoLiquidacion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoLiquidacion(ProcesoLiquidacion procesoliquidacion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoLiquidacion(ProcesoLiquidacion procesoliquidacion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoLiquidacion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoLiquidacion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoLiquidacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoLiquidacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoLiquidacion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoLiquidacion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoLiquidacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoLiquidacion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public ProcesoLiquidacionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoLiquidacionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoLiquidacionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesoliquidacionSessionBean=new ProcesoLiquidacionSessionBean(); 
		this.procesoliquidacionConstantesFunciones=new ProcesoLiquidacionConstantesFunciones(); 
		this.procesoliquidacionBean=new ProcesoLiquidacion();//(this.procesoliquidacionConstantesFunciones); 		
		this.procesoliquidacionReturnGeneral=new ProcesoLiquidacionParameterReturnGeneral(); 
		
		this.procesoliquidacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoliquidacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoLiquidacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoLiquidacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoLiquidacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoLiquidacion(true);
			
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
			
			this.procesoliquidacionConstantesFunciones=new ProcesoLiquidacionConstantesFunciones(); 
			this.procesoliquidacionBean=new ProcesoLiquidacion();//this.procesoliquidacionConstantesFunciones); 			
			this.procesoliquidacionReturnGeneral=new ProcesoLiquidacionParameterReturnGeneral(); 
		
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Liquidacion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesoliquidacion=new ProcesoLiquidacion();
			this.procesoliquidacions = new ArrayList<ProcesoLiquidacion>();
			this.procesoliquidacionsAux = new ArrayList<ProcesoLiquidacion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic=new ProcesoLiquidacionLogic();
				this.procesoliquidacionLogic.getNewConnexionToDeep("");
			}
			
			//this.procesoliquidacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesoliquidacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoLiquidacion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoLiquidacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoLiquidacion);	
					}
					
					if(this.jInternalFrameImportacionProcesoLiquidacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoLiquidacion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoLiquidacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoLiquidacion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoLiquidacion);
				this.jInternalFrameDetalleFormProcesoLiquidacion.setVisible(false);
				this.jInternalFrameDetalleFormProcesoLiquidacion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoLiquidacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoLiquidacion);
					this.jInternalFrameReporteDinamicoProcesoLiquidacion.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoLiquidacion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoLiquidacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoLiquidacion);
					this.jInternalFrameImportacionProcesoLiquidacion.setVisible(false);
					this.jInternalFrameImportacionProcesoLiquidacion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoLiquidacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoLiquidacion);
					this.jInternalFrameOrderByProcesoLiquidacion.setVisible(false);
					this.jInternalFrameOrderByProcesoLiquidacion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoLiquidacionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoLiquidacionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesoliquidacionReturnGeneral=new ProcesoLiquidacionParameterReturnGeneral();
			
			this.procesoliquidacionParameterGeneral=new ProcesoLiquidacionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesoliquidacionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoLiquidacionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoLiquidacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesoliquidacionSessionBean.getEsGuardarRelacionado(),this.procesoliquidacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoLiquidacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesoliquidacionSessionBean.getEsGuardarRelacionado(),this.procesoliquidacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoLiquidacion=false;
			this.isVisibilidadCeldaDuplicarProcesoLiquidacion=true;
			this.isVisibilidadCeldaCopiarProcesoLiquidacion=true;
			this.isVisibilidadCeldaVerFormProcesoLiquidacion=true;
			this.isVisibilidadCeldaOrdenProcesoLiquidacion=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion=false;
			this.isVisibilidadCeldaModificarProcesoLiquidacion=false;
			this.isVisibilidadCeldaActualizarProcesoLiquidacion=false;
			this.isVisibilidadCeldaEliminarProcesoLiquidacion=false;
			this.isVisibilidadCeldaCancelarProcesoLiquidacion=false;
			this.isVisibilidadCeldaGuardarProcesoLiquidacion=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoLiquidacion=false;
			
			
			this.isVisibilidadBusquedaProcesoLiquidacion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoLiquidacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoLiquidacion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoLiquidacion(false);
			
			this.setPermisosUsuarioProcesoLiquidacion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado() 
				|| (this.procesoliquidacionSessionBean.getEsGuardarRelacionado() && this.procesoliquidacionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoLiquidacionClasesRelacionadas();
			}
			
			if(this.procesoliquidacionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoLiquidacionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoLiquidacion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoLiquidacion();
			}
			
			if(!this.isPermisoBusquedaProcesoLiquidacion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoLiquidacion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoLiquidacionConstantesFunciones.getTiposSeleccionarProcesoLiquidacion());
				
				this.tiposColumnasSelect=ProcesoLiquidacionConstantesFunciones.getTiposSeleccionarProcesoLiquidacion(true);
				
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
			//if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoLiquidacion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioProcesoLiquidacion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioProcesoLiquidacion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoLiquidacion() ;
			
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
				procesoliquidacionImplementable= (ProcesoLiquidacionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoLiquidacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesoliquidacionImplementableHome= (ProcesoLiquidacionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoLiquidacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesoliquidacions= new ArrayList<ProcesoLiquidacion>();
			this.procesoliquidacionsEliminados= new ArrayList<ProcesoLiquidacion>();
						
			this.isEsNuevoProcesoLiquidacion=false;
			this.esParaAccionDesdeFormularioProcesoLiquidacion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoLiquidacion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoLiquidacion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoLiquidacionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoLiquidacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoLiquidacion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoLiquidacion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoLiquidacion();
			}
			
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoLiquidacion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoLiquidacion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoLiquidacion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoLiquidacion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoLiquidacion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoLiquidacion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoLiquidacion")) {
				iIndex=this.jInternalFrameDetalleFormProcesoLiquidacion.jTabbedPaneRelacionesProcesoLiquidacion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoLiquidacion.jTabbedPaneRelacionesProcesoLiquidacion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoLiquidacion();	
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
	
	public void cargarCombosForeignKeyProcesoLiquidacion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoLiquidacion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoLiquidacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoLiquidacionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoLiquidacion();
		
		this.cargarCombosFrameForeignKeyProcesoLiquidacion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoLiquidacion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoLiquidacion();
		}
	}
	
	
	
	public void jButtonNuevoProcesoLiquidacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesoliquidacionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoLiquidacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
			
			
			if(jTableDatosProcesoLiquidacion.getRowCount()>=1) {
				jTableDatosProcesoLiquidacion.removeRowSelectionInterval(0, jTableDatosProcesoLiquidacion.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoLiquidacion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoLiquidacion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoLiquidacion(true);			
			//this.procesoliquidacion=new ProcesoLiquidacion();
			//this.procesoliquidacion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoLiquidacion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoLiquidacion() ;
			
			if(ProcesoLiquidacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoLiquidacion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesoliquidacion);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesoliquidacion);				
			
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
			
			if(this.procesoliquidacionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoLiquidacion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoLiquidacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoLiquidacion> procesoliquidacionsSeleccionados=new ArrayList<ProcesoLiquidacion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoLiquidacion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoLiquidacion.getSelectedRows().length;			
			}
			
			procesoliquidacionsSeleccionados=this.getProcesoLiquidacionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoLiquidacion--;			
				//ProcesoLiquidacion procesoliquidacionAux= new ProcesoLiquidacion();			
				//procesoliquidacionAux.setId(this.iIdNuevoProcesoLiquidacion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoLiquidacion procesoliquidacionOrigen=new ProcesoLiquidacion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoLiquidacion procesoliquidacionOrigen : procesoliquidacionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesoliquidacionOrigen =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoliquidacionOrigen =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoLiquidacion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesoliquidacion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoLiquidacion(procesoliquidacionOrigen,this.procesoliquidacion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoLiquidacion(this.procesoliquidacion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesoliquidacionLogic.getProcesoLiquidacions().add(this.procesoliquidacionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesoliquidacions.add(this.procesoliquidacionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoLiquidacion(false);
				
				this.jTableDatosProcesoLiquidacion.setRowSelectionInterval(this.getIndiceNuevoProcesoLiquidacion(), this.getIndiceNuevoProcesoLiquidacion());
				
				int iLastRow =  this.jTableDatosProcesoLiquidacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoLiquidacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoLiquidacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoLiquidacion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoLiquidacion> procesoliquidacionsSeleccionados=new ArrayList<ProcesoLiquidacion>();									
		
			ProcesoLiquidacion procesoliquidacionOrigen=new ProcesoLiquidacion();
			ProcesoLiquidacion procesoliquidacionDestino=new ProcesoLiquidacion();
				
			procesoliquidacionsSeleccionados=this.getProcesoLiquidacionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoLiquidacion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesoliquidacionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoLiquidacion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoliquidacionOrigen =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesoliquidacionOrigen =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoliquidacionDestino =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesoliquidacionDestino =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesoliquidacionOrigen =procesoliquidacionsSeleccionados.get(0);
				procesoliquidacionDestino =procesoliquidacionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoLiquidacion(procesoliquidacionOrigen,procesoliquidacionDestino,true,false);
				
				procesoliquidacionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesoliquidacionDestino,procesoliquidacionLogic.getProcesoLiquidacions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesoliquidacionDestino,procesoliquidacions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoLiquidacion(false);
				
				//this.jTableDatosProcesoLiquidacion.setRowSelectionInterval(this.getIndiceNuevoProcesoLiquidacion(), this.getIndiceNuevoProcesoLiquidacion());
				
				int iLastRow =  this.jTableDatosProcesoLiquidacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoLiquidacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoLiquidacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoLiquidacion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoLiquidacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoLiquidacion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoLiquidacion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoLiquidacion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoLiquidacion.setVisible(!isVisible);
			this.jPanelPaginacionProcesoLiquidacion.setVisible(!isVisible);
			this.jPanelAccionesProcesoLiquidacion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoLiquidacion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoLiquidacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoLiquidacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoLiquidacion();
			
			this.abrirFrameOrderByProcesoLiquidacion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoLiquidacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoLiquidacion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoLiquidacion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoLiquidacion.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoLiquidacion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoLiquidacion.setSize(this.jInternalFrameDetalleFormProcesoLiquidacion.iWidthFormulario,this.jInternalFrameDetalleFormProcesoLiquidacion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoLiquidacion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoLiquidacion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoLiquidacion.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoLiquidacion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoLiquidacion.jContentPaneDetalleProcesoLiquidacion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoLiquidacion.jTabbedPaneRelacionesProcesoLiquidacion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoLiquidacion.jContentPaneDetalleProcesoLiquidacion.getWidth(),ProcesoLiquidacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoLiquidacion.jTabbedPaneRelacionesProcesoLiquidacion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoLiquidacion.jContentPaneDetalleProcesoLiquidacion.getWidth(),ProcesoLiquidacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoLiquidacion.jTabbedPaneRelacionesProcesoLiquidacion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoLiquidacion.jContentPaneDetalleProcesoLiquidacion.getWidth(),ProcesoLiquidacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoLiquidacion.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoLiquidacion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoLiquidacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoLiquidacion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoLiquidacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoLiquidacion,false,this);
				} else {
					this.jInternalFrameOrderByProcesoLiquidacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoLiquidacion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoLiquidacion);
				this.jInternalFrameOrderByProcesoLiquidacion.setVisible(false);
				this.jInternalFrameOrderByProcesoLiquidacion.setSelected(false);
				
				this.jInternalFrameOrderByProcesoLiquidacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoLiquidacion"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoLiquidacion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoLiquidacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoLiquidacion==null) {
				
				this.jInternalFrameImportacionProcesoLiquidacion=new ImportacionJInternalFrame(ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoLiquidacion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoLiquidacion);
				this.jInternalFrameImportacionProcesoLiquidacion.setVisible(false);
				this.jInternalFrameImportacionProcesoLiquidacion.setSelected(false);


				this.jInternalFrameImportacionProcesoLiquidacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoLiquidacion"));
				this.jInternalFrameImportacionProcesoLiquidacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoLiquidacion"));
				this.jInternalFrameImportacionProcesoLiquidacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoLiquidacion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoLiquidacion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoLiquidacion==null) {
				this.jInternalFrameReporteDinamicoProcesoLiquidacion=new ReporteDinamicoJInternalFrame(ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoLiquidacion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoLiquidacion);
				this.jInternalFrameReporteDinamicoProcesoLiquidacion.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoLiquidacion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoLiquidacion"));
				this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoLiquidacion"));
				this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoLiquidacion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoLiquidacion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoLiquidacion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoLiquidacion);
			
	       	this.jInternalFrameDetalleFormProcesoLiquidacion.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoLiquidacion.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoLiquidacion.dispose();
			//this.jInternalFrameDetalleFormProcesoLiquidacion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoLiquidacion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoLiquidacion.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoLiquidacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoLiquidacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoLiquidacion.setVisible(true);
	        this.jInternalFrameImportacionProcesoLiquidacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoLiquidacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoLiquidacion.setVisible(true);
	        this.jInternalFrameOrderByProcesoLiquidacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoLiquidacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoLiquidacion.setVisible(false);
	        this.jInternalFrameOrderByProcesoLiquidacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoLiquidacion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoLiquidacion.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoLiquidacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoLiquidacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoLiquidacion.setVisible(false);
	        this.jInternalFrameImportacionProcesoLiquidacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoLiquidacion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoLiquidacion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoLiquidacion(true);
			//this.isEsNuevoProcesoLiquidacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoLiquidacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoLiquidacion(false) ;
			
			if(procesoliquidacionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoLiquidacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoLiquidacion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoLiquidacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoLiquidacionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoLiquidacion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoLiquidacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoLiquidacion(true);
			//this.isEsNuevoProcesoLiquidacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesoliquidacion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoLiquidacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoLiquidacion(false) ;
			
			if(ProcesoLiquidacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoLiquidacion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoLiquidacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoLiquidacion(false);
			
			//if(!this.isEsNuevoProcesoLiquidacion) {								
				int intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoLiquidacion(this.procesoliquidacion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoLiquidacion(this.procesoliquidacion);
				
			}
			
			if(this.permiteMantenimiento(this.procesoliquidacion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoLiquidacion=true;
					this.inicializarActualizarBindingTablaProcesoLiquidacion(false);
					this.isEsNuevoProcesoLiquidacion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoLiquidacion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoLiquidacion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoLiquidacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoLiquidacion(false);
				
				this.habilitarDeshabilitarControlesProcesoLiquidacion(false);
			
												
				
				if(ProcesoLiquidacionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoLiquidacion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoLiquidacionActionPerformed(evt,procesoliquidacionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoLiquidacion(this.procesoliquidacion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoLiquidacion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesoliquidacionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesoliquidacion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoLiquidacion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoLiquidacion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				this.procesoliquidacion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				this.procesoliquidacion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesoliquidacion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoLiquidacionModel) this.jTableDatosProcesoLiquidacion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoLiquidacion=true;
				this.inicializarActualizarBindingTablaProcesoLiquidacion(false);
				this.isEsNuevoProcesoLiquidacion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoLiquidacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoLiquidacion(false);
				
				this.habilitarDeshabilitarControlesProcesoLiquidacion(false);
				
				
				
				if(ProcesoLiquidacionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoLiquidacion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoLiquidacion.getRowCount()>=1) {
				jTableDatosProcesoLiquidacion.removeRowSelectionInterval(0, jTableDatosProcesoLiquidacion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoLiquidacion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoLiquidacion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoLiquidacion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoLiquidacion(false) ;
			
			this.isEsNuevoProcesoLiquidacion=false;
			
			if(ProcesoLiquidacionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoLiquidacion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoLiquidacion(false);
				
				//SI ES MANUAL
				if(ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoLiquidacion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoLiquidacion--;			
			//ProcesoLiquidacion procesoliquidacionAux= new ProcesoLiquidacion();			
			//procesoliquidacionAux.setId(this.iIdNuevoProcesoLiquidacion);
			
			if(this.jInternalFrameDetalleFormProcesoLiquidacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoLiquidacion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoLiquidacion(this.procesoliquidacion);
			
			this.procesoliquidacion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesoliquidacionLogic.getProcesoLiquidacions().add(this.procesoliquidacionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesoliquidacions.add(this.procesoliquidacionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoLiquidacion(false);
			
			this.jTableDatosProcesoLiquidacion.setRowSelectionInterval(this.getIndiceNuevoProcesoLiquidacion(), this.getIndiceNuevoProcesoLiquidacion());
			
			int iLastRow =  this.jTableDatosProcesoLiquidacion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoLiquidacion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoLiquidacion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoLiquidacion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoLiquidacion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoLiquidacion(false);
			
			//SI ES MANUAL
			if(ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoLiquidacion();
			}
			
			//this.abrirFrameTreeProcesoLiquidacion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoLiquidacion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoLiquidacion.setFileImportacion(this.jInternalFrameImportacionProcesoLiquidacion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoLiquidacion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoLiquidacion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoLiquidacion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoLiquidacion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoLiquidacion> procesoliquidacionsSeleccionados=new ArrayList<ProcesoLiquidacion>();		

		procesoliquidacionsSeleccionados=this.getProcesoLiquidacionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoLiquidacionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoLiquidacionBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoLiquidacions("Todos",procesoliquidacionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Liquidacion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoLiquidacionConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoLiquidacionConstantesFunciones.LABEL_ESREVERSAR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Reversar_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Reversar_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Reversar_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Reversar_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoLiquidacionConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case ProcesoLiquidacionConstantesFunciones.LABEL_ESREVERSAR:
					sNombreCampoCategoria="es_reversar";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoLiquidacionConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case ProcesoLiquidacionConstantesFunciones.LABEL_ESREVERSAR:
					sNombreCampoCategoriaValor="es_reversar";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoLiquidacionConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case ProcesoLiquidacionConstantesFunciones.LABEL_ESREVERSAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Reversar",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_reversar");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoLiquidacion> procesoliquidacionsSeleccionados=new ArrayList<ProcesoLiquidacion>();		
		
		procesoliquidacionsSeleccionados=this.getProcesoLiquidacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoliquidacion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoLiquidacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoLiquidacionConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoLiquidacionConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ProcesoLiquidacion procesoliquidacion:procesoliquidacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoliquidacion.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoLiquidacionConstantesFunciones.LABEL_ESREVERSAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoLiquidacionConstantesFunciones.LABEL_ESREVERSAR);
					iRow++;

					for(ProcesoLiquidacion procesoliquidacion:procesoliquidacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoliquidacion.getes_reversar());
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
			//	this.getFilaCabeceraExportarExcelProcesoLiquidacion(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoLiquidacion procesoliquidacionAux:procesoliquidacionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoLiquidacion(procesoliquidacionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Liquidacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoLiquidacion(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoLiquidacion(false);
			
			//SI ES MANUAL
			if(ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoLiquidacion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoLiquidacion(false);
			
			//SI ES MANUAL
			if(ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoLiquidacion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoLiquidacion(false);
			
			//SI ES MANUAL
			if(ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoLiquidacion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoLiquidacion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoLiquidacion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoLiquidacion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoLiquidacion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoLiquidacion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoLiquidacion.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoLiquidacion.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoLiquidacion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoLiquidacion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoLiquidacion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoLiquidacion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoLiquidacion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoLiquidacion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoLiquidacion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoLiquidacion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoLiquidacion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoLiquidacion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoLiquidacion();
		
		this.inicializarActualizarBindingBotonesManualProcesoLiquidacion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoLiquidacion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoLiquidacion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoLiquidacion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoLiquidacion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoLiquidacion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoLiquidacion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoLiquidacion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoLiquidacion.jCheckBoxPostAccionNuevoProcesoLiquidacion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoLiquidacion.jCheckBoxPostAccionSinCerrarProcesoLiquidacion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoLiquidacion.jCheckBoxPostAccionSinMensajeProcesoLiquidacion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoLiquidacion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoLiquidacion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoLiquidacion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {
				this.jInternalFrameDetalleFormProcesoLiquidacion.jCheckBoxPostAccionNuevoProcesoLiquidacion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoLiquidacion.jCheckBoxPostAccionSinCerrarProcesoLiquidacion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoLiquidacion.jCheckBoxPostAccionSinMensajeProcesoLiquidacion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoLiquidacion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoLiquidacion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoLiquidacion.jComboBoxTiposAccionesFormularioProcesoLiquidacion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoLiquidacion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoLiquidacion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoLiquidacion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoLiquidacion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoLiquidacion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoLiquidacion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoLiquidacion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoLiquidacion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoLiquidacion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoLiquidacion(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoLiquidacion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoLiquidacion() throws Exception {
		try	{
			if(ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoLiquidacion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoLiquidacion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoLiquidacion.jComboBoxTiposAccionesFormularioProcesoLiquidacion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.jComboBoxTiposAccionesFormularioProcesoLiquidacion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoLiquidacion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoLiquidacion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoLiquidacion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoLiquidacion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoLiquidacion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoLiquidacion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoLiquidacion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoLiquidacion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoLiquidacion.addItem(reporte);
			}
			
			
			if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoLiquidacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoLiquidacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoLiquidacion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoLiquidacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoLiquidacion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoLiquidacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoLiquidacion.jComboBoxTiposAccionesFormularioProcesoLiquidacion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoLiquidacion.jComboBoxTiposAccionesFormularioProcesoLiquidacion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoLiquidacion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoLiquidacion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoLiquidacion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoLiquidacion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoLiquidacion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoLiquidacion!=null) {
				this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoLiquidacion!=null) {
				this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoLiquidacion!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoLiquidacion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fechaBusquedaProcesoLiquidacion=new Date(this.jDateChooserfechaBusquedaProcesoLiquidacionProcesoLiquidacion.getDate().getTime());
		this.es_reversarBusquedaProcesoLiquidacion=this.jCheckBoxes_reversarBusquedaProcesoLiquidacionProcesoLiquidacion.isSelected();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoLiquidacion(Boolean esInicializar) throws Exception {				
		if(ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoLiquidacion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoLiquidacion() throws Exception {
		this.inicializarActualizarBindingTablaProcesoLiquidacion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoLiquidacion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoLiquidacion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoLiquidacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoLiquidacion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoLiquidacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoLiquidacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoLiquidacion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoLiquidacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoLiquidacionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoLiquidacionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoLiquidacionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoLiquidacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoLiquidacion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoLiquidacionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoLiquidacion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoLiquidacion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesoliquidacionLogic.getProcesoLiquidacions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesoliquidacions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoLiquidacion.setModel(new ProcesoLiquidacionModel(this.procesoliquidacionLogic.getProcesoLiquidacions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoLiquidacion.setModel(new ProcesoLiquidacionModel(this.procesoliquidacions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoLiquidacion!=null && this.jInternalFrameOrderByProcesoLiquidacion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoLiquidacion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoLiquidacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoLiquidacion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoLiquidacionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO,procesoliquidacionConstantesFunciones.resaltarSeleccionarProcesoLiquidacion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO,procesoliquidacionConstantesFunciones.resaltarSeleccionarProcesoLiquidacion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoLiquidacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoLiquidacion,ProcesoLiquidacionConstantesFunciones.LABEL_ID));

		if(this.procesoliquidacionConstantesFunciones.mostraridProcesoLiquidacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoLiquidacionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesoliquidacionConstantesFunciones.resaltaridProcesoLiquidacion,this.procesoliquidacionConstantesFunciones.activaridProcesoLiquidacion,this,true,"idProcesoLiquidacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesoliquidacionConstantesFunciones.resaltaridProcesoLiquidacion,this.procesoliquidacionConstantesFunciones.activaridProcesoLiquidacion,this,true,"idProcesoLiquidacion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoLiquidacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoLiquidacion,ProcesoLiquidacionConstantesFunciones.LABEL_FECHA));

		if(this.procesoliquidacionConstantesFunciones.mostrarfechaProcesoLiquidacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoLiquidacionConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.procesoliquidacionConstantesFunciones.resaltarfechaProcesoLiquidacion,this.procesoliquidacionConstantesFunciones.activarfechaProcesoLiquidacion,this,true,"fechaProcesoLiquidacion","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.procesoliquidacionConstantesFunciones.resaltarfechaProcesoLiquidacion,this.procesoliquidacionConstantesFunciones.activarfechaProcesoLiquidacion,this,true,"fechaProcesoLiquidacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ProcesoLiquidacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoLiquidacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoLiquidacion,ProcesoLiquidacionConstantesFunciones.LABEL_ESREVERSAR));

		if(this.procesoliquidacionConstantesFunciones.mostrares_reversarProcesoLiquidacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoLiquidacionConstantesFunciones.LABEL_ESREVERSAR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.procesoliquidacionConstantesFunciones.resaltares_reversarProcesoLiquidacion,this.procesoliquidacionConstantesFunciones.activares_reversarProcesoLiquidacion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.procesoliquidacionConstantesFunciones.resaltares_reversarProcesoLiquidacion,this.procesoliquidacionConstantesFunciones.activares_reversarProcesoLiquidacion,this,true,"es_reversarProcesoLiquidacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoLiquidacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesoliquidacionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesoliquidacionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoLiquidacion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesoliquidacionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesoliquidacionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoLiquidacion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoLiquidacion && this.isPermisoGuardarCambiosProcesoLiquidacion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesoliquidacionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesoliquidacionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoLiquidacion.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoLiquidacion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoLiquidacion && this.isPermisoGuardarCambiosProcesoLiquidacion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoLiquidacion && this.isPermisoGuardarCambiosProcesoLiquidacion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoLiquidacion.moveColumn(this.jTableDatosProcesoLiquidacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoLiquidacion.moveColumn(this.jTableDatosProcesoLiquidacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoLiquidacion.moveColumn(this.jTableDatosProcesoLiquidacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoLiquidacion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoLiquidacion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoLiquidacion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoLiquidacion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoLiquidacion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoLiquidacion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoLiquidacion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoLiquidacion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesoliquidacionLogic.getProcesoLiquidacions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesoliquidacions.size()-1;
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
		//this.jTableDatosProcesoLiquidacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoLiquidacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoLiquidacion();
			
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
				
				//this.isEsNuevoProcesoLiquidacion=false;
					
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
			
				if(this.procesoliquidacionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoLiquidacion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoLiquidacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoLiquidacion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesoliquidacion.getsType().equals("DUPLICADO")
				   || this.procesoliquidacion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoLiquidacion=true;
				
				} else {
					this.isEsNuevoProcesoLiquidacion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
					if(this.procesoliquidacion.getId()>=0 && !this.procesoliquidacion.getIsNew()) {						
						this.isEsNuevoProcesoLiquidacion=false;
						
					} else {
						this.isEsNuevoProcesoLiquidacion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoLiquidacion(esRelaciones);						
				
				this.seleccionarProcesoLiquidacion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesoliquidacion.getId()<0) {
					this.isEsNuevoProcesoLiquidacion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoLiquidacion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoLiquidacion(evt,rowIndex);
				}	
				
				if(this.procesoliquidacionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoLiquidacion: " + this.dDif); 
					}
				}								
				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoLiquidacion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesoliquidacion)) {
					if(this.procesoliquidacion.getId()>0) {
						this.procesoliquidacion.setIsDeleted(true);
						
						this.procesoliquidacionsEliminados.add(this.procesoliquidacion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesoliquidacionLogic.getProcesoLiquidacions().remove(this.procesoliquidacion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesoliquidacions.remove(this.procesoliquidacion);				
					}
					
					
					((ProcesoLiquidacionModel) this.jTableDatosProcesoLiquidacion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoLiquidacion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoLiquidacion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoLiquidacion) {
			
			if(this.jInternalFrameDetalleFormProcesoLiquidacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoLiquidacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoLiquidacion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoLiquidacion(this.procesoliquidacion);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoLiquidacion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoLiquidacion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoLiquidacion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoLiquidacion(ProcesoLiquidacion procesoliquidacion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoLiquidacion(procesoliquidacion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoLiquidacion(ProcesoLiquidacion procesoliquidacion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoLiquidacion(procesoliquidacion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoLiquidacion(procesoliquidacion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoLiquidacion(procesoliquidacion);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoLiquidacion(ProcesoLiquidacion procesoliquidacion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoLiquidacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoLiquidacion.jLabelidProcesoLiquidacion.setText(procesoliquidacion.getId().toString());
			this.jInternalFrameDetalleFormProcesoLiquidacion.jDateChooserfechaProcesoLiquidacion.setDate(procesoliquidacion.getfecha());
			this.jInternalFrameDetalleFormProcesoLiquidacion.jCheckBoxes_reversarProcesoLiquidacion.setSelected(procesoliquidacion.getes_reversar());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoLiquidacion procesoliquidacionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesoliquidacionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoLiquidacion procesoliquidacionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesoliquidacionLocal=this.procesoliquidacion;
			} else {
				procesoliquidacionLocal=this.procesoliquidacionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesoliquidacionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoLiquidacion(procesoliquidacionLocal,true);
					
					if(procesoliquidacionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesoliquidacionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesoliquidacionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoLiquidacion(ProcesoLiquidacion procesoliquidacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoLiquidacion(procesoliquidacion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoLiquidacion(procesoliquidacion);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoLiquidacion(ProcesoLiquidacion procesoliquidacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoLiquidacion(procesoliquidacion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoLiquidacion(ProcesoLiquidacion procesoliquidacion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoLiquidacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoLiquidacion.jLabelidProcesoLiquidacion.getText()==null || this.jInternalFrameDetalleFormProcesoLiquidacion.jLabelidProcesoLiquidacion.getText()=="" || this.jInternalFrameDetalleFormProcesoLiquidacion.jLabelidProcesoLiquidacion.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoLiquidacion.jLabelidProcesoLiquidacion.setText("0");
			}

			if(conColumnasBase) {procesoliquidacion.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoLiquidacion.jLabelidProcesoLiquidacion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoLiquidacionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoLiquidacion.jLabelIdProcesoLiquidacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesoliquidacion.setfecha(this.jInternalFrameDetalleFormProcesoLiquidacion.jDateChooserfechaProcesoLiquidacion.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoLiquidacionConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoLiquidacion.jLabelfechaProcesoLiquidacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesoliquidacion.setes_reversar(this.jInternalFrameDetalleFormProcesoLiquidacion.jCheckBoxes_reversarProcesoLiquidacion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoLiquidacionConstantesFunciones.LABEL_ESREVERSAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoLiquidacion.jLabeles_reversarProcesoLiquidacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoLiquidacion(ProcesoLiquidacion procesoliquidacionBean,ProcesoLiquidacion procesoliquidacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoLiquidacion(ProcesoLiquidacion procesoliquidacionOrigen,ProcesoLiquidacion procesoliquidacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesoliquidacionOrigen.getId()!=null && !procesoliquidacionOrigen.getId().equals(0L))) {procesoliquidacion.setId(procesoliquidacionOrigen.getId());}}
			if(conDefault || (!conDefault && procesoliquidacionOrigen.getfecha()!=null && !procesoliquidacionOrigen.getfecha().equals(new Date()))) {procesoliquidacion.setfecha(procesoliquidacionOrigen.getfecha());}
			if(conDefault || (!conDefault && procesoliquidacionOrigen.getes_reversar()!=null && !procesoliquidacionOrigen.getes_reversar().equals(false))) {procesoliquidacion.setes_reversar(procesoliquidacionOrigen.getes_reversar());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoLiquidacion(ProcesoLiquidacion procesoliquidacion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoLiquidacion.jLabelidProcesoLiquidacion.setText(procesoliquidacion.getId().toString());
			this.jInternalFrameDetalleFormProcesoLiquidacion.jDateChooserfechaProcesoLiquidacion.setDate(procesoliquidacion.getfecha());
			this.jInternalFrameDetalleFormProcesoLiquidacion.jCheckBoxes_reversarProcesoLiquidacion.setSelected(procesoliquidacion.getes_reversar());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoLiquidacion(ProcesoLiquidacionBean procesoliquidacionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoLiquidacion.jLabelidProcesoLiquidacion.setText(procesoliquidacionBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoLiquidacion.jDateChooserfechaProcesoLiquidacion.setDate(procesoliquidacionBean.getfecha());
			this.jInternalFrameDetalleFormProcesoLiquidacion.jCheckBoxes_reversarProcesoLiquidacion.setSelected(procesoliquidacionBean.getes_reversar());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoLiquidacion(ProcesoLiquidacionParameterReturnGeneral procesoliquidacionReturnGeneral,ProcesoLiquidacionBean procesoliquidacionBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoLiquidacion procesoliquidacionLocal=new ProcesoLiquidacion();
			
			procesoliquidacionLocal=procesoliquidacionReturnGeneral.getProcesoLiquidacion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesoliquidacionLocal.getId()!=null && !procesoliquidacionLocal.getId().equals(0L))) {procesoliquidacionBean.setId(procesoliquidacionLocal.getId());}}
			if(conDefault || (!conDefault && procesoliquidacionLocal.getfecha()!=null && !procesoliquidacionLocal.getfecha().equals(new Date()))) {procesoliquidacionBean.setfecha(procesoliquidacionLocal.getfecha());}
			if(conDefault || (!conDefault && procesoliquidacionLocal.getes_reversar()!=null && !procesoliquidacionLocal.getes_reversar().equals(false))) {procesoliquidacionBean.setes_reversar(procesoliquidacionLocal.getes_reversar());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoLiquidacionGenerico(Long idProcesoLiquidacionSeleccionado,JComboBox jComboBoxProcesoLiquidacion,List<ProcesoLiquidacion> procesoliquidacionsLocal)throws Exception {
		try {
			ProcesoLiquidacion  procesoliquidacionTemp=null;

			for(ProcesoLiquidacion procesoliquidacionAux:procesoliquidacionsLocal) {
				if(procesoliquidacionAux.getId()!=null && procesoliquidacionAux.getId().equals(idProcesoLiquidacionSeleccionado)) {
					procesoliquidacionTemp=procesoliquidacionAux;
					break;
				}
			}

			jComboBoxProcesoLiquidacion.setSelectedItem(procesoliquidacionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoLiquidacionGenerico(JComboBox jComboBoxProcesoLiquidacion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoLiquidacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoLiquidacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoLiquidacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoLiquidacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoLiquidacion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoLiquidacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoLiquidacion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoLiquidacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoLiquidacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoLiquidacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoliquidacion=(ProcesoLiquidacion) procesoliquidacionLogic.getProcesoLiquidacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesoliquidacion =(ProcesoLiquidacion) procesoliquidacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoLiquidacion procesoliquidacionRow=new ProcesoLiquidacion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoliquidacionRow=(ProcesoLiquidacion) procesoliquidacionLogic.getProcesoLiquidacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesoliquidacionRow=(ProcesoLiquidacion) procesoliquidacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoLiquidacion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoLiquidacion.setVisible((this.isVisibilidadCeldaNuevoProcesoLiquidacion && this.isPermisoNuevoProcesoLiquidacion));			
			this.jButtonDuplicarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaDuplicarProcesoLiquidacion && this.isPermisoDuplicarProcesoLiquidacion));			
			this.jButtonCopiarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaCopiarProcesoLiquidacion && this.isPermisoCopiarProcesoLiquidacion));
			this.jButtonVerFormProcesoLiquidacion.setVisible((this.isVisibilidadCeldaVerFormProcesoLiquidacion && this.isPermisoVerFormProcesoLiquidacion));
			
			this.jButtonAbrirOrderByProcesoLiquidacion.setVisible((this.isVisibilidadCeldaOrdenProcesoLiquidacion && this.isPermisoOrdenProcesoLiquidacion));			
			
			this.jButtonNuevoRelacionesProcesoLiquidacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion && this.isPermisoNuevoProcesoLiquidacion));			
			this.jButtonNuevoGuardarCambiosProcesoLiquidacion.setVisible((this.isVisibilidadCeldaNuevoProcesoLiquidacion && this.isPermisoNuevoProcesoLiquidacion && this.isPermisoGuardarCambiosProcesoLiquidacion));
			
			if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonModificarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaModificarProcesoLiquidacion && this.isPermisoActualizarProcesoLiquidacion));	
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonActualizarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaActualizarProcesoLiquidacion && this.isPermisoActualizarProcesoLiquidacion));	
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonEliminarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaEliminarProcesoLiquidacion && this.isPermisoEliminarProcesoLiquidacion));
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonCancelarProcesoLiquidacion.setVisible(this.isVisibilidadCeldaCancelarProcesoLiquidacion);							
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonGuardarCambiosProcesoLiquidacion.setVisible((this.isVisibilidadCeldaGuardarProcesoLiquidacion && this.isPermisoGuardarCambiosProcesoLiquidacion));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoLiquidacion.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoLiquidacion && this.isPermisoGuardarCambiosProcesoLiquidacion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaNuevoProcesoLiquidacion && this.isPermisoNuevoProcesoLiquidacion));						
			this.jButtonDuplicarToolBarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaDuplicarProcesoLiquidacion && this.isPermisoDuplicarProcesoLiquidacion));						
			this.jButtonCopiarToolBarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaCopiarProcesoLiquidacion && this.isPermisoCopiarProcesoLiquidacion));			
			this.jButtonVerFormToolBarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaVerFormProcesoLiquidacion && this.isPermisoVerFormProcesoLiquidacion));			
			this.jButtonAbrirOrderByToolBarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaOrdenProcesoLiquidacion && this.isPermisoOrdenProcesoLiquidacion));
			this.jButtonNuevoRelacionesToolBarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion && this.isPermisoNuevoProcesoLiquidacion));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaNuevoProcesoLiquidacion && this.isPermisoNuevoProcesoLiquidacion && this.isPermisoGuardarCambiosProcesoLiquidacion));			
			
			if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonModificarToolBarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaModificarProcesoLiquidacion && this.isPermisoActualizarProcesoLiquidacion));	
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonActualizarToolBarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaActualizarProcesoLiquidacion  && this.isPermisoActualizarProcesoLiquidacion));	
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonEliminarToolBarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaEliminarProcesoLiquidacion && this.isPermisoEliminarProcesoLiquidacion));
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonCancelarToolBarProcesoLiquidacion.setVisible(this.isVisibilidadCeldaCancelarProcesoLiquidacion);				
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonGuardarCambiosToolBarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaGuardarProcesoLiquidacion && this.isPermisoGuardarCambiosProcesoLiquidacion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoLiquidacion && this.isPermisoGuardarCambiosProcesoLiquidacion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoLiquidacion.setVisible((this.isVisibilidadCeldaNuevoProcesoLiquidacion && this.isPermisoNuevoProcesoLiquidacion));			
			this.jMenuItemDuplicarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaDuplicarProcesoLiquidacion && this.isPermisoDuplicarProcesoLiquidacion));			
			this.jMenuItemCopiarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaCopiarProcesoLiquidacion && this.isPermisoCopiarProcesoLiquidacion));			
			this.jMenuItemVerFormProcesoLiquidacion.setVisible((this.isVisibilidadCeldaVerFormProcesoLiquidacion && this.isPermisoVerFormProcesoLiquidacion));			
			this.jMenuItemAbrirOrderByProcesoLiquidacion.setVisible((this.isVisibilidadCeldaOrdenProcesoLiquidacion && this.isPermisoOrdenProcesoLiquidacion));			
			//this.jMenuItemMostrarOcultarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaOrdenProcesoLiquidacion && this.isPermisoOrdenProcesoLiquidacion));
			this.jMenuItemDetalleAbrirOrderByProcesoLiquidacion.setVisible((this.isVisibilidadCeldaOrdenProcesoLiquidacion && this.isPermisoOrdenProcesoLiquidacion));			
			//this.jMenuItemDetalleMostrarOcultarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaOrdenProcesoLiquidacion && this.isPermisoOrdenProcesoLiquidacion));			
			this.jMenuItemNuevoRelacionesProcesoLiquidacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion && this.isPermisoNuevoProcesoLiquidacion));			
			this.jMenuItemNuevoGuardarCambiosProcesoLiquidacion.setVisible((this.isVisibilidadCeldaNuevoProcesoLiquidacion && this.isPermisoNuevoProcesoLiquidacion && this.isPermisoGuardarCambiosProcesoLiquidacion));									
			
			if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.jMenuItemModificarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaModificarProcesoLiquidacion && this.isPermisoActualizarProcesoLiquidacion));	
			this.jInternalFrameDetalleFormProcesoLiquidacion.jMenuItemActualizarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaActualizarProcesoLiquidacion && this.isPermisoActualizarProcesoLiquidacion));	
			this.jInternalFrameDetalleFormProcesoLiquidacion.jMenuItemEliminarProcesoLiquidacion.setVisible((this.isVisibilidadCeldaEliminarProcesoLiquidacion && this.isPermisoEliminarProcesoLiquidacion));
			this.jInternalFrameDetalleFormProcesoLiquidacion.jMenuItemCancelarProcesoLiquidacion.setVisible(this.isVisibilidadCeldaCancelarProcesoLiquidacion);				
			}
			
			this.jMenuItemGuardarCambiosProcesoLiquidacion.setVisible((this.isVisibilidadCeldaGuardarProcesoLiquidacion && this.isPermisoGuardarCambiosProcesoLiquidacion));						
			this.jMenuItemGuardarCambiosTablaProcesoLiquidacion.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoLiquidacion && this.isPermisoGuardarCambiosProcesoLiquidacion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoLiquidacion=this.jButtonNuevoProcesoLiquidacion.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoLiquidacion=this.jButtonDuplicarProcesoLiquidacion.isVisible();
			this.isVisibilidadCeldaCopiarProcesoLiquidacion=this.jButtonCopiarProcesoLiquidacion.isVisible();
			this.isVisibilidadCeldaVerFormProcesoLiquidacion=this.jButtonVerFormProcesoLiquidacion.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoLiquidacion=this.jButtonAbrirOrderByProcesoLiquidacion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion=this.jButtonNuevoRelacionesProcesoLiquidacion.isVisible();
			this.isVisibilidadCeldaModificarProcesoLiquidacion=this.jButtonModificarProcesoLiquidacion.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {
			this.isVisibilidadCeldaActualizarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonActualizarProcesoLiquidacion.isVisible();
			this.isVisibilidadCeldaEliminarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonEliminarProcesoLiquidacion.isVisible();
			this.isVisibilidadCeldaCancelarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonCancelarProcesoLiquidacion.isVisible();
			this.isVisibilidadCeldaGuardarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonGuardarCambiosProcesoLiquidacion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoLiquidacion=this.jButtonGuardarCambiosTablaProcesoLiquidacion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoLiquidacion=this.jButtonNuevoToolBarProcesoLiquidacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion=this.jButtonNuevoRelacionesToolBarProcesoLiquidacion.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {
			this.isVisibilidadCeldaModificarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonModificarToolBarProcesoLiquidacion.isVisible();
			this.isVisibilidadCeldaActualizarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonActualizarToolBarProcesoLiquidacion.isVisible();
			this.isVisibilidadCeldaEliminarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonEliminarToolBarProcesoLiquidacion.isVisible();
			this.isVisibilidadCeldaCancelarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonCancelarToolBarProcesoLiquidacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoLiquidacion=this.jButtonGuardarCambiosToolBarProcesoLiquidacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoLiquidacion=this.jButtonGuardarCambiosTablaToolBarProcesoLiquidacion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoLiquidacion=this.jMenuItemNuevoProcesoLiquidacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion=this.jMenuItemNuevoRelacionesProcesoLiquidacion.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {
			this.isVisibilidadCeldaModificarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jMenuItemModificarProcesoLiquidacion.isVisible();
			this.isVisibilidadCeldaActualizarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jMenuItemActualizarProcesoLiquidacion.isVisible();
			this.isVisibilidadCeldaEliminarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jMenuItemEliminarProcesoLiquidacion.isVisible();
			this.isVisibilidadCeldaCancelarProcesoLiquidacion=this.jInternalFrameDetalleFormProcesoLiquidacion.jMenuItemCancelarProcesoLiquidacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoLiquidacion=this.jMenuItemGuardarCambiosProcesoLiquidacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoLiquidacion=this.jMenuItemGuardarCambiosTablaProcesoLiquidacion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoLiquidacion(Boolean esInicializar) {
		if(ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesoliquidacionSessionBean.getConGuardarRelaciones()) {
				//if(this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoLiquidacion();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoLiquidacion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoLiquidacion() {
		this.jButtonNuevoProcesoLiquidacion.setVisible(this.isPermisoNuevoProcesoLiquidacion);			
		this.jButtonDuplicarProcesoLiquidacion.setVisible(this.isPermisoDuplicarProcesoLiquidacion);			
		this.jButtonCopiarProcesoLiquidacion.setVisible(this.isPermisoCopiarProcesoLiquidacion);			
		this.jButtonVerFormProcesoLiquidacion.setVisible(this.isPermisoVerFormProcesoLiquidacion);			
		
		this.jButtonAbrirOrderByProcesoLiquidacion.setVisible(this.isPermisoOrdenProcesoLiquidacion);					
		
		this.jButtonNuevoRelacionesProcesoLiquidacion.setVisible(this.isPermisoNuevoProcesoLiquidacion);			
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonModificarProcesoLiquidacion.setVisible(this.isPermisoActualizarProcesoLiquidacion);	
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonActualizarProcesoLiquidacion.setVisible(this.isPermisoActualizarProcesoLiquidacion);	
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonEliminarProcesoLiquidacion.setVisible(this.isPermisoEliminarProcesoLiquidacion);
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonCancelarProcesoLiquidacion.setVisible(this.isVisibilidadCeldaCancelarProcesoLiquidacion);						
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonGuardarCambiosProcesoLiquidacion.setVisible(this.isPermisoGuardarCambiosProcesoLiquidacion);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoLiquidacion.setVisible(this.isPermisoActualizarProcesoLiquidacion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoLiquidacion() {
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonModificarProcesoLiquidacion.setVisible(this.isPermisoActualizarProcesoLiquidacion);	
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonActualizarProcesoLiquidacion.setVisible(this.isPermisoActualizarProcesoLiquidacion);	
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonEliminarProcesoLiquidacion.setVisible(this.isPermisoEliminarProcesoLiquidacion);
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonCancelarProcesoLiquidacion.setVisible(this.isVisibilidadCeldaCancelarProcesoLiquidacion);							
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonGuardarCambiosProcesoLiquidacion.setVisible((this.isVisibilidadCeldaGuardarProcesoLiquidacion && this.isPermisoGuardarCambiosProcesoLiquidacion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoLiquidacion() {
		if(ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoLiquidacion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoLiquidacion() {
	}
	
	public void jTableDatosProcesoLiquidacionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoLiquidacion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoLiquidacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoLiquidacion(this.getprocesoliquidacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoLiquidacion(this.procesoliquidacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoliquidacion==null) {
						this.procesoliquidacion = new ProcesoLiquidacion();
					}

					this.setVariablesFormularioToObjetoActualProcesoLiquidacion(this.procesoliquidacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoLiquidacion(this.procesoliquidacion);
				}

				if(this.procesoliquidacion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesoliquidacion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoLiquidacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaProcesoLiquidacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoLiquidacion(this.getprocesoliquidacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoLiquidacion(this.procesoliquidacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoliquidacion==null) {
						this.procesoliquidacion = new ProcesoLiquidacion();
					}

					this.setVariablesFormularioToObjetoActualProcesoLiquidacion(this.procesoliquidacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoLiquidacion(this.procesoliquidacion);
				}

				if(this.procesoliquidacion.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.procesoliquidacion.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoLiquidacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_reversarProcesoLiquidacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoLiquidacion(this.getprocesoliquidacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoLiquidacion(this.procesoliquidacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoliquidacion==null) {
						this.procesoliquidacion = new ProcesoLiquidacion();
					}

					this.setVariablesFormularioToObjetoActualProcesoLiquidacion(this.procesoliquidacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoLiquidacion(this.procesoliquidacion);
				}

				if(this.procesoliquidacion.getes_reversar()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_reversar = "+this.procesoliquidacion.getes_reversar().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoLiquidacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoLiquidacionProcesoLiquidacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoLiquidacion(false,false);

			this.getProcesoLiquidacionsBusquedaProcesoLiquidacion();

			this.inicializarActualizarBindingProcesoLiquidacion(false);

			//if(ProcesoLiquidacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoLiquidacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoliquidacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoLiquidacion() {
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoLiquidacion.dispose();
			this.jInternalFrameDetalleFormProcesoLiquidacion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoLiquidacion!=null) {
			this.jInternalFrameReporteDinamicoProcesoLiquidacion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoLiquidacion.dispose();
			this.jInternalFrameReporteDinamicoProcesoLiquidacion=null;
		}
		
		if(this.jInternalFrameImportacionProcesoLiquidacion!=null) {
			this.jInternalFrameImportacionProcesoLiquidacion.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoLiquidacion.dispose();
			this.jInternalFrameImportacionProcesoLiquidacion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoLiquidacion();
			
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoLiquidacion")) {
				jButtonNuevoProcesoLiquidacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoLiquidacion")) {
				jButtonDuplicarProcesoLiquidacionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoLiquidacion")) {
				jButtonCopiarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoLiquidacion")) {
				jButtonVerFormProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoLiquidacion")) {
				jButtonNuevoProcesoLiquidacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoLiquidacion")) {
				jButtonDuplicarProcesoLiquidacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoLiquidacion")) {
				jButtonNuevoProcesoLiquidacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoLiquidacion")) {
				jButtonDuplicarProcesoLiquidacionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoLiquidacion")) {
				jButtonNuevoProcesoLiquidacionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoLiquidacion")) {
				jButtonNuevoProcesoLiquidacionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoLiquidacion")) {
				jButtonNuevoProcesoLiquidacionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoLiquidacion")) {
				jButtonModificarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoLiquidacion")) {
				jButtonModificarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoLiquidacion")) {
				jButtonModificarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoLiquidacion")) {
				jButtonActualizarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoLiquidacion")) {
				jButtonActualizarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoLiquidacion")) {
				jButtonActualizarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoLiquidacion")) {
				jButtonEliminarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoLiquidacion")) {
				jButtonEliminarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoLiquidacion")) {
				jButtonEliminarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoLiquidacion")) {
				jButtonCancelarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoLiquidacion")) {
				jButtonCancelarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoLiquidacion")) {
				jButtonCancelarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoLiquidacion")) {
				jButtonCerrarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoLiquidacion")) {
				jButtonCerrarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoLiquidacion")) {
				jButtonCerrarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoLiquidacion")) {
				jButtonMostrarOcultarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoLiquidacion")) {
				jButtonCancelarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoLiquidacion")) {
				jButtonGuardarCambiosProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoLiquidacion")) {
				jButtonGuardarCambiosProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoLiquidacion")) {
				jButtonCopiarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoLiquidacion")) {
				jButtonVerFormProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoLiquidacion")) {
				jButtonGuardarCambiosProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoLiquidacion")) {
				jButtonCopiarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoLiquidacion")) {
				jButtonVerFormProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoLiquidacion")) {
				jButtonGuardarCambiosProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoLiquidacion")) {
				jButtonGuardarCambiosProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoLiquidacion")) {
				jButtonGuardarCambiosProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoLiquidacion")) {
				jButtonRecargarInformacionProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoLiquidacion")) {
				jButtonRecargarInformacionProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoLiquidacion")) {
				jButtonRecargarInformacionProcesoLiquidacionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoLiquidacion")) {
				jButtonAnterioresProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoLiquidacion")) {
				jButtonAnterioresProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoLiquidacion")) {
				jButtonAnterioresProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoLiquidacion")) {
				jButtonSiguientesProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoLiquidacion")) {
				jButtonSiguientesProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoLiquidacion")) {
				jButtonSiguientesProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoLiquidacion") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoLiquidacion")) {
				jButtonAbrirOrderByProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoLiquidacion") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoLiquidacion")) {
				jButtonMostrarOcultarProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoLiquidacion")) {
				jButtonNuevoGuardarCambiosProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoLiquidacion")) {
				jButtonNuevoGuardarCambiosProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoLiquidacion")) {
				jButtonNuevoGuardarCambiosProcesoLiquidacionActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoLiquidacion")) {
				jButtonProcesarInformacionProcesoLiquidacionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoLiquidacion")) {
				jButtonCerrarReporteDinamicoProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoLiquidacion")) {
				jButtonGenerarReporteDinamicoProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoLiquidacion")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoLiquidacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoLiquidacion")) {
				jButtonCerrarImportacionProcesoLiquidacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoLiquidacion")) {
				
				jButtonGenerarImportacionProcesoLiquidacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoLiquidacion")) {
				
				jButtonAbrirImportacionProcesoLiquidacionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoLiquidacion")) {
				jComboBoxTiposAccionesProcesoLiquidacionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoLiquidacion")) {
				jComboBoxTiposRelacionesProcesoLiquidacionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoLiquidacion")) {
				jComboBoxTiposAccionesProcesoLiquidacionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoLiquidacion")) {
				
				jComboBoxTiposSeleccionarProcesoLiquidacionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoLiquidacion")) {
				jTextFieldValorCampoGeneralProcesoLiquidacionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoLiquidacion")) {
				jButtonAbrirOrderByProcesoLiquidacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoLiquidacion")) {
				jButtonAbrirOrderByProcesoLiquidacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoLiquidacion")) {
				jButtonCerrarOrderByProcesoLiquidacionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoLiquidacionBusqueda")) {
				this.jButtonidProcesoLiquidacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaProcesoLiquidacionBusqueda")) {
				this.jButtonfechaProcesoLiquidacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_reversarProcesoLiquidacionBusqueda")) {
				this.jButtones_reversarProcesoLiquidacionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoLiquidacionProcesoLiquidacion")) {
				this.jButtonBusquedaProcesoLiquidacionProcesoLiquidacionActionPerformed(evt);
			}
			
			;
			
			
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoLiquidacion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoLiquidacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoliquidacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoliquidacion);
				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
				
				


				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoLiquidacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoLiquidacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoLiquidacion procesoliquidacionLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesoliquidacionLocal=this.procesoliquidacion;
			} else {
				procesoliquidacionLocal=this.procesoliquidacionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoliquidacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoliquidacion);
				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
							
				
				


				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoLiquidacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoLiquidacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoLiquidacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacionAnterior =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoliquidacionAnterior =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
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
			
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
			
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
			
			


			
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoLiquidacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoliquidacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoliquidacion);
				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
								
						
				


				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoLiquidacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoLiquidacion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoliquidacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoliquidacion);
				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
								
				
				


				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoLiquidacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoLiquidacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoLiquidacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacionAnterior =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoliquidacionAnterior =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoliquidacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoliquidacion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoLiquidacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacionAnterior =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoliquidacionAnterior =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoLiquidacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoliquidacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoliquidacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoliquidacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoliquidacion);
				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
							
				
				


				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoLiquidacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoLiquidacion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoLiquidacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoliquidacionAnterior =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesoliquidacionAnterior =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
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
			
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
			
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
			
			


			
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoLiquidacionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoliquidacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoliquidacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoliquidacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoliquidacion);
				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
								
				
				


				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoLiquidacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoLiquidacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoLiquidacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacionAnterior =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoliquidacionAnterior =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoLiquidacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoliquidacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoliquidacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoLiquidacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoliquidacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoliquidacion);
				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoLiquidacion")) {
					jCheckBoxSeleccionarTodosProcesoLiquidacionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoLiquidacion")) {
					jCheckBoxSeleccionadosProcesoLiquidacionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoLiquidacion")) {
					
				}
				
				


				
				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoLiquidacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoLiquidacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoliquidacion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesoliquidacion);
				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
												
				
				


				
				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoLiquidacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoLiquidacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoLiquidacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoliquidacionAnterior =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesoliquidacionAnterior =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoLiquidacionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoliquidacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoliquidacion);
				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
				
				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
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
			
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
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
			
			


			
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoLiquidacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoliquidacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoliquidacion);
				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoLiquidacion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoLiquidacion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoliquidacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoliquidacion);
				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
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
				
				


				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoLiquidacion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoLiquidacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoLiquidacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoliquidacionAnterior =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoliquidacionAnterior =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoLiquidacion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoLiquidacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoLiquidacion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesoliquidacion =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesoliquidacion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoLiquidacion")) {
				
				}
				
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoLiquidacion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoLiquidacion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoLiquidacion")) {
			
			}
			
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoLiquidacion();
			
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoLiquidacion")) {
				jButtonNuevoProcesoLiquidacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoLiquidacion")) {
				jButtonDuplicarProcesoLiquidacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoLiquidacion")) {
				jButtonCopiarProcesoLiquidacionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoLiquidacion")) {
				jButtonVerFormProcesoLiquidacionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoLiquidacion")) {
				jButtonNuevoProcesoLiquidacionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoLiquidacion")) {
				jButtonModificarProcesoLiquidacionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoLiquidacion")) {
				jButtonActualizarProcesoLiquidacionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoLiquidacion")) {
				jButtonEliminarProcesoLiquidacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoLiquidacion")) {
				jButtonGuardarCambiosProcesoLiquidacionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoLiquidacion")) {
				jButtonCancelarProcesoLiquidacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoLiquidacion")) {
				jButtonCerrarProcesoLiquidacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoLiquidacion")) {
				jButtonGuardarCambiosProcesoLiquidacionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoLiquidacion")) {
				jButtonNuevoGuardarCambiosProcesoLiquidacionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoLiquidacion")) {
				jButtonAbrirOrderByProcesoLiquidacionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoLiquidacion")) {
				jButtonRecargarInformacionProcesoLiquidacionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoLiquidacion")) {
				jButtonAnterioresProcesoLiquidacionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoLiquidacion")) {
				jButtonSiguientesProcesoLiquidacionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoLiquidacionBusqueda")) {
				this.jButtonidProcesoLiquidacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaProcesoLiquidacionBusqueda")) {
				this.jButtonfechaProcesoLiquidacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_reversarProcesoLiquidacionBusqueda")) {
				this.jButtones_reversarProcesoLiquidacionBusquedaActionPerformed(evt);
			}
			
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoLiquidacion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoLiquidacion")) {
				closingInternalFrameProcesoLiquidacion();
				
			} else if(sTipo.equals("jButtonCancelarProcesoLiquidacion")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoLiquidacion = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoLiquidacionBeanSwingJInternalFrame jInternalFrameParent=(ProcesoLiquidacionBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoLiquidacion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoLiquidacionActionPerformed(null);
			}
			
			ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesoliquidacion,new Object(),this.procesoliquidacionParameterGeneral,this.procesoliquidacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoLiquidacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoLiquidacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoLiquidacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesoliquidacion)) {
			if(!esControlTabla) {
				if(ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoLiquidacion(this.procesoliquidacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoLiquidacion(this.procesoliquidacion);			
				}
				
				if(this.procesoliquidacionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoLiquidacion(this.procesoliquidacion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoLiquidacion(this.procesoliquidacionReturnGeneral,this.procesoliquidacionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesoliquidacionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoLiquidacion(classes,this.procesoliquidacionReturnGeneral,this.procesoliquidacionBean,false);
					}
						
					if(this.procesoliquidacionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoLiquidacion(this.procesoliquidacionReturnGeneral.getProcesoLiquidacion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoLiquidacion(this.procesoliquidacionReturnGeneral.getProcesoLiquidacion());	
					}
						
					if(this.procesoliquidacionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoLiquidacion(this.procesoliquidacionReturnGeneral.getProcesoLiquidacion(),classes);//this.procesoliquidacionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoLiquidacion(this.procesoliquidacion,classes);//this.procesoliquidacionBean);									
				}
			
				if(ProcesoLiquidacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoLiquidacion(this.procesoliquidacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoLiquidacion(this.procesoliquidacion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesoliquidacionAnterior!=null) {
						this.procesoliquidacion=this.procesoliquidacionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesoliquidacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesoliquidacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesoliquidacionReturnGeneral.getProcesoLiquidacion(),procesoliquidacionLogic.getProcesoLiquidacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesoliquidacionReturnGeneral.getProcesoLiquidacion(),this.procesoliquidacions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoLiquidacion.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoLiquidacion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoLiquidacion();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoLiquidacion() throws Exception {
		
		ProcesoLiquidacionModel procesoliquidacionModel=(ProcesoLiquidacionModel)this.jTableDatosProcesoLiquidacion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoliquidacionModel.procesoliquidacions=this.procesoliquidacionLogic.getProcesoLiquidacions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesoliquidacionModel.procesoliquidacions=this.procesoliquidacions;
		}
		
		
		((ProcesoLiquidacionModel) this.jTableDatosProcesoLiquidacion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoLiquidacion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesoliquidacionAnterior(),this.procesoliquidacionLogic.getProcesoLiquidacions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesoliquidacionAnterior(),this.procesoliquidacions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoLiquidacion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoLiquidacion(ProcesoLiquidacion procesoliquidacion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
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
										
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesoliquidacion,new Object(),generalEntityParameterGeneral,this.procesoliquidacionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesoliquidacionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoLiquidacionConstantesFunciones.getClassesRelationshipsOfProcesoLiquidacion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoLiquidacionConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoLiquidacion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoLiquidacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoLiquidacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesoliquidacion,new Object(),generalEntityParameterGeneral,this.procesoliquidacionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoLiquidacion(ProcesoLiquidacionBean procesoliquidacionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoLiquidacion(ArrayList<Classe> classes,ProcesoLiquidacionReturnGeneral procesoliquidacionReturnGeneral,ProcesoLiquidacionBean procesoliquidacionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoLiquidacion(ProcesoLiquidacion procesoliquidacion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesoliquidacion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoLiquidacion = new ProcesoLiquidacionDetalleFormJInternalFrame(jDesktopPane,this.procesoliquidacionSessionBean.getConGuardarRelaciones(),this.procesoliquidacionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoLiquidacion);
		this.jInternalFrameDetalleFormProcesoLiquidacion.setVisible(false);
		this.jInternalFrameDetalleFormProcesoLiquidacion.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoLiquidacion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoLiquidacion.procesoliquidacionLogic=this.procesoliquidacionLogic;
		
		this.cargarCombosFrameForeignKeyProcesoLiquidacion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoLiquidacion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoLiquidacion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoLiquidacion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoLiquidacion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoLiquidacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoLiquidacion"));
		
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonModificarProcesoLiquidacion.addActionListener(new ButtonActionListener(this,"ModificarProcesoLiquidacion"));

		
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonModificarToolBarProcesoLiquidacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoLiquidacion"));
					
		this.jInternalFrameDetalleFormProcesoLiquidacion.jMenuItemModificarProcesoLiquidacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoLiquidacion"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonActualizarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"ActualizarProcesoLiquidacion"));
		
		
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonActualizarToolBarProcesoLiquidacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoLiquidacion"));
						
		this.jInternalFrameDetalleFormProcesoLiquidacion.jMenuItemActualizarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoLiquidacion"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonEliminarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"EliminarProcesoLiquidacion"));
		
		
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonEliminarToolBarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoLiquidacion"));
								
		this.jInternalFrameDetalleFormProcesoLiquidacion.jMenuItemEliminarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoLiquidacion"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonCancelarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"CancelarProcesoLiquidacion"));
		
		
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonCancelarToolBarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoLiquidacion"));
					
		this.jInternalFrameDetalleFormProcesoLiquidacion.jMenuItemCancelarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoLiquidacion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoLiquidacion.jMenuItemDetalleCerrarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoLiquidacion"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonGuardarCambiosToolBarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoLiquidacion"));
		
		
		
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonGuardarCambiosToolBarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoLiquidacion"));
		
		
		
		this.jInternalFrameDetalleFormProcesoLiquidacion.jComboBoxTiposAccionesFormularioProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoLiquidacion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonidProcesoLiquidacionBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoLiquidacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonfechaProcesoLiquidacionBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoLiquidacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtones_reversarProcesoLiquidacionBusqueda.addActionListener(new ButtonActionListener(this,"es_reversarProcesoLiquidacionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoLiquidacion.jTabbedPaneRelacionesProcesoLiquidacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoLiquidacion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoLiquidacion"));
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoLiquidacion"));
		}
		
		this.jTableDatosProcesoLiquidacion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoLiquidacion"));
		
		this.jTableDatosProcesoLiquidacion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoLiquidacion"));
		
		this.jButtonNuevoProcesoLiquidacion.addActionListener(new ButtonActionListener(this,"NuevoProcesoLiquidacion"));
		
		this.jButtonDuplicarProcesoLiquidacion.addActionListener(new ButtonActionListener(this,"DuplicarProcesoLiquidacion"));
		
		this.jButtonCopiarProcesoLiquidacion.addActionListener(new ButtonActionListener(this,"CopiarProcesoLiquidacion"));
		
		this.jButtonVerFormProcesoLiquidacion.addActionListener(new ButtonActionListener(this,"VerFormProcesoLiquidacion"));
		
		
		this.jButtonNuevoToolBarProcesoLiquidacion.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoLiquidacion"));
			
		this.jButtonDuplicarToolBarProcesoLiquidacion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoLiquidacion"));
			
		this.jMenuItemNuevoProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoLiquidacion"));
			
		this.jMenuItemDuplicarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoLiquidacion"));		
		
		
		this.jButtonNuevoRelacionesProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoLiquidacion"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoLiquidacion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoLiquidacion"));
			
		this.jMenuItemNuevoRelacionesProcesoLiquidacion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoLiquidacion"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonModificarProcesoLiquidacion.addActionListener(new ButtonActionListener(this,"ModificarProcesoLiquidacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonModificarToolBarProcesoLiquidacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoLiquidacion"));
			
			this.jInternalFrameDetalleFormProcesoLiquidacion.jMenuItemModificarProcesoLiquidacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoLiquidacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonActualizarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"ActualizarProcesoLiquidacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonActualizarToolBarProcesoLiquidacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoLiquidacion"));
				
			this.jInternalFrameDetalleFormProcesoLiquidacion.jMenuItemActualizarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoLiquidacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonEliminarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"EliminarProcesoLiquidacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonEliminarToolBarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoLiquidacion"));
						
			this.jInternalFrameDetalleFormProcesoLiquidacion.jMenuItemEliminarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoLiquidacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonCancelarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"CancelarProcesoLiquidacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonCancelarToolBarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoLiquidacion"));
			
			this.jInternalFrameDetalleFormProcesoLiquidacion.jMenuItemCancelarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoLiquidacion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoLiquidacion"));		
		
		
		this.jButtonCerrarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"CerrarProcesoLiquidacion"));
		
		
		this.jButtonCerrarToolBarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoLiquidacion"));
			
		this.jMenuItemCerrarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoLiquidacion"));
			
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.jMenuItemDetalleCerrarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoLiquidacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonGuardarCambiosProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoLiquidacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonGuardarCambiosToolBarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoLiquidacion"));
		}
		
		this.jButtonCopiarToolBarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoLiquidacion"));
			
		this.jButtonVerFormToolBarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoLiquidacion"));
		
		this.jMenuItemGuardarCambiosProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoLiquidacion"));
			
		this.jMenuItemCopiarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoLiquidacion"));		
		
		this.jMenuItemVerFormProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoLiquidacion"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoLiquidacion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoLiquidacion"));
			
		this.jMenuItemGuardarCambiosTablaProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoLiquidacion"));		
		
		
		
		this.jButtonRecargarInformacionProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoLiquidacion"));
					
		this.jButtonRecargarInformacionToolBarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoLiquidacion"));
		
		this.jMenuItemRecargarInformacionProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoLiquidacion"));		
		
		
		
		this.jButtonAnterioresProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"AnterioresProcesoLiquidacion"));
		
		
		this.jButtonAnterioresToolBarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoLiquidacion"));
		
		this.jMenuItemAnterioresProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoLiquidacion"));		
		
		
		this.jButtonSiguientesProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"SiguientesProcesoLiquidacion"));
		
		
		this.jButtonSiguientesToolBarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoLiquidacion"));
			
		this.jMenuItemSiguientesProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoLiquidacion"));
			
		this.jMenuItemAbrirOrderByProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoLiquidacion"));
			
		this.jMenuItemMostrarOcultarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoLiquidacion"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoLiquidacion"));
			
		this.jMenuItemDetalleMostarOcultarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoLiquidacion"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoLiquidacion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoLiquidacion"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoLiquidacion"));		
		
		
		this.jButtonProcesarInformacionProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoLiquidacion"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoLiquidacion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoLiquidacion"));

		this.jCheckBoxSeleccionadosProcesoLiquidacion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoLiquidacion"));
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.jComboBoxTiposAccionesFormularioProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoLiquidacion"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoLiquidacion"));
			
		this.jComboBoxTiposAccionesProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoLiquidacion"));
					
		this.jComboBoxTiposSeleccionarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoLiquidacion"));
			
		this.jTextFieldValorCampoGeneralProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoLiquidacion"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonidProcesoLiquidacionBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoLiquidacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonfechaProcesoLiquidacionBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoLiquidacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtones_reversarProcesoLiquidacionBusqueda.addActionListener(new ButtonActionListener(this,"es_reversarProcesoLiquidacionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoLiquidacionProcesoLiquidacion.addActionListener(new ButtonActionListener(this,"BusquedaProcesoLiquidacionProcesoLiquidacion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoLiquidacion!=null) {
				this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoLiquidacion"));
				this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoLiquidacion"));
				this.jInternalFrameReporteDinamicoProcesoLiquidacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoLiquidacion"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoLiquidacion"));				
			//this.jButtonGenerarReporteDinamicoProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoLiquidacion"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoLiquidacion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoLiquidacion!=null) {
				this.jInternalFrameImportacionProcesoLiquidacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoLiquidacion"));
				this.jInternalFrameImportacionProcesoLiquidacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoLiquidacion"));
				this.jInternalFrameImportacionProcesoLiquidacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoLiquidacion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoLiquidacion"));
			
			this.jButtonAbrirOrderByToolBarProcesoLiquidacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoLiquidacion"));			
			
			if(this.jInternalFrameOrderByProcesoLiquidacion!=null) {
				this.jInternalFrameOrderByProcesoLiquidacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoLiquidacion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoLiquidacion.jTabbedPaneRelacionesProcesoLiquidacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoLiquidacion"));
		
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
            		closingInternalFrameProcesoLiquidacion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoLiquidacion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoLiquidacion = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoLiquidacionBeanSwingJInternalFrame jInternalFrameParent=(ProcesoLiquidacionBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoLiquidacion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoLiquidacionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoLiquidacion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoLiquidacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoLiquidacion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoLiquidacion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoLiquidacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoLiquidacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoLiquidacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoLiquidacion";
		inputMap = this.jButtonNuevoProcesoLiquidacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoLiquidacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoLiquidacionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoLiquidacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoLiquidacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoLiquidacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoLiquidacion";
		inputMap = this.jButtonNuevoRelacionesProcesoLiquidacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoLiquidacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoLiquidacionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoLiquidacion";
		inputMap = this.jButtonModificarProcesoLiquidacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoLiquidacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoLiquidacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoLiquidacion";
		inputMap = this.jButtonActualizarProcesoLiquidacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoLiquidacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoLiquidacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoLiquidacion";
		inputMap = this.jButtonEliminarProcesoLiquidacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoLiquidacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoLiquidacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoLiquidacion";
		inputMap = this.jButtonCancelarProcesoLiquidacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoLiquidacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoLiquidacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoLiquidacion";
		inputMap = this.jButtonCerrarProcesoLiquidacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoLiquidacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoLiquidacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonGuardarCambiosProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoLiquidacion";
		inputMap = this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonGuardarCambiosProcesoLiquidacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonGuardarCambiosProcesoLiquidacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoLiquidacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoLiquidacion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoLiquidacionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoLiquidacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoLiquidacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoLiquidacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoLiquidacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoLiquidacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoLiquidacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonidProcesoLiquidacionBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoLiquidacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtonfechaProcesoLiquidacionBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoLiquidacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoLiquidacion.jButtones_reversarProcesoLiquidacionBusqueda.addActionListener(new ButtonActionListener(this,"es_reversarProcesoLiquidacionBusqueda"));
		
		
		this.jButtonBusquedaProcesoLiquidacionProcesoLiquidacion.addActionListener(new ButtonActionListener(this,"BusquedaProcesoLiquidacionProcesoLiquidacion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoLiquidacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoLiquidacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoLiquidacionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoLiquidacion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoLiquidacion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoLiquidacion procesoliquidacionAux:this.procesoliquidacionLogic.getProcesoLiquidacions()) {
					procesoliquidacionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoLiquidacion procesoliquidacionAux:procesoliquidacions) {
					procesoliquidacionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoLiquidacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoLiquidacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoLiquidacion procesoliquidacionAux:this.procesoliquidacionLogic.getProcesoLiquidacions()) {
						procesoliquidacionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoLiquidacion procesoliquidacionAux:procesoliquidacions) {
						procesoliquidacionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoLiquidacion procesoliquidacionAux:this.procesoliquidacionLogic.getProcesoLiquidacions()) {
					
						if(sTipoSeleccionar.equals(ProcesoLiquidacionConstantesFunciones.LABEL_ESREVERSAR)) {
							existe=true;
							procesoliquidacionAux.setes_reversar(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoLiquidacion procesoliquidacionAux:procesoliquidacions) {
						
						if(sTipoSeleccionar.equals(ProcesoLiquidacionConstantesFunciones.LABEL_ESREVERSAR)) {
							existe=true;
							procesoliquidacionAux.setes_reversar(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoLiquidacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoLiquidacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoLiquidacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoLiquidacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoLiquidacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoLiquidacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoLiquidacion.getSelectedRows();
			
			ProcesoLiquidacion procesoliquidacionLocal=new ProcesoLiquidacion();
			
			//this.seleccionarTodosProcesoLiquidacion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesoliquidacionLocal =(ProcesoLiquidacion) this.procesoliquidacionLogic.getProcesoLiquidacions().toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesoliquidacionLocal =(ProcesoLiquidacion) this.procesoliquidacions.toArray()[this.jTableDatosProcesoLiquidacion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesoliquidacionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoLiquidacion procesoliquidacionAux:this.procesoliquidacionLogic.getProcesoLiquidacions()) {
						procesoliquidacionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoLiquidacion procesoliquidacionAux:procesoliquidacions) {
						procesoliquidacionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoLiquidacion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoLiquidacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoLiquidacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoLiquidacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoLiquidacionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoLiquidacionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoLiquidacionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoLiquidacion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoLiquidacion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoLiquidacion procesoliquidacionAux:this.procesoliquidacionLogic.getProcesoLiquidacions()) {
				
						if(sTipoSeleccionar.equals(ProcesoLiquidacionConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							procesoliquidacionAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoLiquidacion procesoliquidacionAux:procesoliquidacions) {
					
						if(sTipoSeleccionar.equals(ProcesoLiquidacionConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							procesoliquidacionAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoLiquidacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoLiquidacionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoLiquidacion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoLiquidacion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoLiquidacion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoLiquidacion.jComboBoxTiposAccionesFormularioProcesoLiquidacion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoLiquidacion) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoLiquidacion(conSplash);
				
					this.generarReporteProcesoLiquidacionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoLiquidacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoLiquidacion.jComboBoxTiposAccionesFormularioProcesoLiquidacion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoLiquidacionsSeleccionados();
				//this.jComboBoxTiposAccionesProcesoLiquidacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoLiquidacionsSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoLiquidacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoLiquidacionsSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoLiquidacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoLiquidacion();
				
				this.exportarProcesoLiquidacionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoLiquidacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoLiquidacion.jComboBoxTiposAccionesFormularioProcesoLiquidacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoLiquidacions();
				//this.importarProcesoLiquidacions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoLiquidacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoLiquidacion.jComboBoxTiposAccionesFormularioProcesoLiquidacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoLiquidacion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoLiquidacionsSeleccionados();
				//this.jComboBoxTiposAccionesProcesoLiquidacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Liquidacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoLiquidacion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoLiquidacion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoLiquidacion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Liquidacion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoLiquidacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoLiquidacion.jComboBoxTiposAccionesFormularioProcesoLiquidacion.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoLiquidacionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoLiquidacion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoLiquidacion(conSplash);
					
						//this.actualizarParametrosGeneralProcesoLiquidacion();
						
						this.generarReporteProcesoAccionProcesoLiquidacionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoLiquidacion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoLiquidacion.jComboBoxTiposAccionesFormularioProcesoLiquidacion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoLiquidacionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso LiquidacionES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Liquidacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoLiquidacion();
				
						this.actualizarParametrosGeneralProcesoLiquidacion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesoliquidacionReturnGeneral=procesoliquidacionLogic.procesarAccionProcesoLiquidacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesoliquidacionLogic.getProcesoLiquidacions(),this.procesoliquidacionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoLiquidacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoLiquidacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoLiquidacion.jComboBoxTiposAccionesFormularioProcesoLiquidacion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoLiquidacion();
					
					ProcesoLiquidacionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoLiquidacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoLiquidacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoLiquidacion.jComboBoxTiposAccionesFormularioProcesoLiquidacion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoLiquidacion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoLiquidacionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoLiquidacion();
			
			if(this.jInternalFrameDetalleFormProcesoLiquidacion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoLiquidacion> procesoliquidacionsSeleccionados=new ArrayList<ProcesoLiquidacion>();		
			ProcesoLiquidacion procesoliquidacion=new ProcesoLiquidacion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoLiquidacion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoLiquidacion.getSelectedItem();
			
			
			
			
			procesoliquidacionsSeleccionados=this.getProcesoLiquidacionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesoliquidacionsSeleccionados.size()==1) {
				for(ProcesoLiquidacion procesoliquidacionAux:procesoliquidacionsSeleccionados) {
					procesoliquidacion=procesoliquidacionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoLiquidacion();
			
      		//this.finishProcessProcesoLiquidacion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoLiquidacionReturnGeneral() throws Exception {
		if(this.procesoliquidacionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesoliquidacionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesoliquidacionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesoliquidacionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesoliquidacionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesoliquidacionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoLiquidacion(false);
		}
		
		if(this.procesoliquidacionReturnGeneral.getConRetornoLista() || this.procesoliquidacionReturnGeneral.getConRetornoObjeto()) {
			if(this.procesoliquidacionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesoliquidacionLogic.setProcesoLiquidacions(this.procesoliquidacionReturnGeneral.getProcesoLiquidacions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoLiquidacion(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoLiquidacion() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoLiquidacion> getProcesoLiquidacionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoLiquidacion> procesoliquidacionsSeleccionados=new ArrayList<ProcesoLiquidacion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoLiquidacion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoLiquidacion procesoliquidacionAux:procesoliquidacionLogic.getProcesoLiquidacions()) {
					if(procesoliquidacionAux.getIsSelected()) {
						procesoliquidacionsSeleccionados.add(procesoliquidacionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoLiquidacion procesoliquidacionAux:this.procesoliquidacions) {
					if(procesoliquidacionAux.getIsSelected()) {
						procesoliquidacionsSeleccionados.add(procesoliquidacionAux);				
					}
				}
			}
			
			if(procesoliquidacionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesoliquidacionsSeleccionados.addAll(this.procesoliquidacionLogic.getProcesoLiquidacions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesoliquidacionsSeleccionados.addAll(this.procesoliquidacions);				
					}
				}
			}
		} else {
			procesoliquidacionsSeleccionados.add(this.procesoliquidacion);
		}
		
		return procesoliquidacionsSeleccionados;
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
	
	public void generarReporteProcesoLiquidacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoLiquidacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoLiquidacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoLiquidacionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoLiquidacionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Liquidacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoLiquidacionsSeleccionados() throws Exception {
		ArrayList<ProcesoLiquidacion> procesoliquidacionsSeleccionados=new ArrayList<ProcesoLiquidacion>();		
		
		procesoliquidacionsSeleccionados=this.getProcesoLiquidacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoLiquidacions("Todos",procesoliquidacionsSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoLiquidacionsSeleccionados() throws Exception {
		ArrayList<ProcesoLiquidacion> procesoliquidacionsSeleccionados=new ArrayList<ProcesoLiquidacion>();		
		
		procesoliquidacionsSeleccionados=this.getProcesoLiquidacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoLiquidacions("Todos",procesoliquidacionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoLiquidacionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoLiquidacion> procesoliquidacionsSeleccionados=new ArrayList<ProcesoLiquidacion>();
		
		procesoliquidacionsSeleccionados=this.getProcesoLiquidacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoLiquidacions("Todos",procesoliquidacionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoLiquidacionsSeleccionados() throws Exception {
		ArrayList<ProcesoLiquidacion> procesoliquidacionsSeleccionados=new ArrayList<ProcesoLiquidacion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoLiquidacion();
		
		
		procesoliquidacionsSeleccionados=this.getProcesoLiquidacionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoLiquidacion();
		
		
		//this.generarReporteProcesoLiquidacions("Todos",procesoliquidacionsSeleccionados ,procesoliquidacionImplementable,procesoliquidacionImplementableHome);
	}
	
	public void mostrarImportacionProcesoLiquidacions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoLiquidacion();
		
		this.abrirFrameImportacionProcesoLiquidacion();		
		
			
		//this.generarReporteProcesoLiquidacions("Todos",procesoliquidacionsSeleccionados ,procesoliquidacionImplementable,procesoliquidacionImplementableHome);
	}
	
	public void importarProcesoLiquidacions() throws Exception {		
	
	}
	
	public void exportarProcesoLiquidacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoLiquidacionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoLiquidacionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoLiquidacionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Liquidacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoLiquidacionsSeleccionados() throws Exception {
		ArrayList<ProcesoLiquidacion> procesoliquidacionsSeleccionados=new ArrayList<ProcesoLiquidacion>();		
		
		procesoliquidacionsSeleccionados=this.getProcesoLiquidacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoliquidacion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoLiquidacion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoLiquidacion procesoliquidacionAux:procesoliquidacionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoLiquidacion(procesoliquidacionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesoliquidacionAux.setsDetalleGeneralEntityReporte(procesoliquidacionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Liquidacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoLiquidacion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoLiquidacionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoLiquidacionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoLiquidacionConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoLiquidacionConstantesFunciones.LABEL_ESREVERSAR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoLiquidacion(ProcesoLiquidacion procesoliquidacion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesoliquidacion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoliquidacion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoliquidacion.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoliquidacion.getes_reversar().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoLiquidacionsSeleccionados() throws Exception {
		ArrayList<ProcesoLiquidacion> procesoliquidacionsSeleccionados=new ArrayList<ProcesoLiquidacion>();		
		
		procesoliquidacionsSeleccionados=this.getProcesoLiquidacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoliquidacion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoLiquidacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoLiquidacion(row);				
				iRow++;
			}				
			
			for(ProcesoLiquidacion procesoliquidacionAux:procesoliquidacionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoLiquidacion(procesoliquidacionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Liquidacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoLiquidacionsSeleccionados() throws Exception {
		ArrayList<ProcesoLiquidacion> procesoliquidacionsSeleccionados=new ArrayList<ProcesoLiquidacion>();		
		
		procesoliquidacionsSeleccionados=this.getProcesoLiquidacionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoliquidacion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesoliquidacions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesoliquidacion");
			//elementRoot.appendChild(element);
		
			for(ProcesoLiquidacion procesoliquidacionAux:procesoliquidacionsSeleccionados) {
				element = document.createElement("procesoliquidacion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoLiquidacion(procesoliquidacionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Liquidacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoLiquidacion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoLiquidacionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoLiquidacionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoLiquidacionConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoLiquidacionConstantesFunciones.LABEL_ESREVERSAR);
	}
	
	public void getFilaDatosExportarExcelProcesoLiquidacion(ProcesoLiquidacion procesoliquidacion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesoliquidacion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoliquidacion.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoliquidacion.getes_reversar());				
	}
	
	public void setFilaDatosExportarXmlProcesoLiquidacion(ProcesoLiquidacion procesoliquidacion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoLiquidacionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesoliquidacion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoLiquidacionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesoliquidacion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementfecha = document.createElement(ProcesoLiquidacionConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(procesoliquidacion.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementes_reversar = document.createElement(ProcesoLiquidacionConstantesFunciones.ESREVERSAR);
		elementes_reversar.appendChild(document.createTextNode(procesoliquidacion.getes_reversar().toString().trim()));
		element.appendChild(elementes_reversar);
	}
	
	public void generarReporteGroupGenericoProcesoLiquidacionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoLiquidacion> procesoliquidacionsSeleccionados=new ArrayList<ProcesoLiquidacion>();
		
		procesoliquidacionsSeleccionados=this.getProcesoLiquidacionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoLiquidacion(procesoliquidacionsSeleccionados);
		
		this.generarReporteProcesoLiquidacions("Todos",procesoliquidacionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoLiquidacion(ArrayList<ProcesoLiquidacion> procesoliquidacionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoLiquidacion procesoliquidacionAux:procesoliquidacionsSeleccionados) {
				procesoliquidacionAux.setsDetalleGeneralEntityReporte(procesoliquidacionAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoLiquidacionConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					procesoliquidacionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesoliquidacionAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(ProcesoLiquidacionConstantesFunciones.LABEL_ESREVERSAR)) {
					existe=true;
					procesoliquidacionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(procesoliquidacionAux.getes_reversar()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoLiquidacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoLiquidacion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoLiquidacion=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoLiquidacion=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoLiquidacion=false;
			this.isVisibilidadCeldaActualizarProcesoLiquidacion=false;
			this.isVisibilidadCeldaEliminarProcesoLiquidacion=false;
			this.isVisibilidadCeldaCancelarProcesoLiquidacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoLiquidacion=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoLiquidacion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoLiquidacion=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoLiquidacion=false;
			this.isVisibilidadCeldaModificarProcesoLiquidacion=false;
			this.isVisibilidadCeldaActualizarProcesoLiquidacion=true;
			this.isVisibilidadCeldaEliminarProcesoLiquidacion=false;
			this.isVisibilidadCeldaCancelarProcesoLiquidacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoLiquidacion=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoLiquidacion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoLiquidacion=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoLiquidacion=false;
			this.isVisibilidadCeldaModificarProcesoLiquidacion=false;
			this.isVisibilidadCeldaActualizarProcesoLiquidacion=true;
			this.isVisibilidadCeldaEliminarProcesoLiquidacion=true;
			this.isVisibilidadCeldaCancelarProcesoLiquidacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoLiquidacion=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoLiquidacion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoLiquidacion=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoLiquidacion=false;
			this.isVisibilidadCeldaModificarProcesoLiquidacion=false;
			this.isVisibilidadCeldaActualizarProcesoLiquidacion=true;
			this.isVisibilidadCeldaEliminarProcesoLiquidacion=false;
			this.isVisibilidadCeldaCancelarProcesoLiquidacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoLiquidacion=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoLiquidacion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoLiquidacion=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoLiquidacion=true;
			this.isVisibilidadCeldaModificarProcesoLiquidacion=false;
			this.isVisibilidadCeldaActualizarProcesoLiquidacion=false;
			this.isVisibilidadCeldaEliminarProcesoLiquidacion=false;
			this.isVisibilidadCeldaCancelarProcesoLiquidacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoLiquidacion=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoLiquidacion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoLiquidacion=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoLiquidacion=false;
			this.isVisibilidadCeldaActualizarProcesoLiquidacion=false;
			this.isVisibilidadCeldaEliminarProcesoLiquidacion=false;
			this.isVisibilidadCeldaCancelarProcesoLiquidacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoLiquidacion=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoLiquidacion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoLiquidacion=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoLiquidacion=false;
			this.isVisibilidadCeldaModificarProcesoLiquidacion=true;
			this.isVisibilidadCeldaActualizarProcesoLiquidacion=false;
			this.isVisibilidadCeldaEliminarProcesoLiquidacion=false;
			this.isVisibilidadCeldaCancelarProcesoLiquidacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoLiquidacion=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoLiquidacion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoLiquidacionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoLiquidacion=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoLiquidacion=true;
		} else {
			this.actualizarEstadoPanelsProcesoLiquidacion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoLiquidacion=false;
			//this.isVisibilidadCeldaVerFormProcesoLiquidacion=false;
			this.isVisibilidadCeldaDuplicarProcesoLiquidacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesoliquidacionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoLiquidacion=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoLiquidacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
			if(!procesoliquidacionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion=false;												
			}
			
			this.jButtonCerrarProcesoLiquidacion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion=false;
		}
		
		if(!this.permiteMantenimiento(this.procesoliquidacion)) {
			this.isVisibilidadCeldaActualizarProcesoLiquidacion=false;
			this.isVisibilidadCeldaEliminarProcesoLiquidacion=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoLiquidacion=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoLiquidacion=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoLiquidacion=false;
		//this.isVisibilidadCeldaModificarProcesoLiquidacion=true;
		this.isVisibilidadCeldaActualizarProcesoLiquidacion=false;
		this.isVisibilidadCeldaEliminarProcesoLiquidacion=false;
		//this.isVisibilidadCeldaCancelarProcesoLiquidacion=true;			
		this.isVisibilidadCeldaGuardarProcesoLiquidacion=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoLiquidacion() {
	}
	
	public void actualizarEstadoPanelsProcesoLiquidacion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoLiquidacion!=null) {
				this.jScrollPanelDatosEdicionProcesoLiquidacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoLiquidacion!=null) {
				this.jTabbedPaneBusquedasProcesoLiquidacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoLiquidacion!=null) {
				this.jScrollPanelDatosProcesoLiquidacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoLiquidacion!=null) {
				this.jPanelPaginacionProcesoLiquidacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoLiquidacion!=null) {
				this.jPanelParametrosReportesProcesoLiquidacion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoLiquidacion!=null) {
				this.jScrollPanelDatosEdicionProcesoLiquidacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoLiquidacion!=null) {
				this.jTabbedPaneBusquedasProcesoLiquidacion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoLiquidacion!=null) {
				this.jScrollPanelDatosProcesoLiquidacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoLiquidacion!=null) {
				this.jPanelPaginacionProcesoLiquidacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoLiquidacion!=null) {
				this.jPanelParametrosReportesProcesoLiquidacion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoLiquidacion!=null) {
				this.jScrollPanelDatosEdicionProcesoLiquidacion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoLiquidacion!=null) {
				this.jTabbedPaneBusquedasProcesoLiquidacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoLiquidacion!=null) {
				this.jScrollPanelDatosProcesoLiquidacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoLiquidacion!=null) {
				this.jPanelPaginacionProcesoLiquidacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoLiquidacion!=null) {
				this.jPanelParametrosReportesProcesoLiquidacion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoLiquidacion!=null) {
				this.jScrollPanelDatosEdicionProcesoLiquidacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoLiquidacion!=null) {
				this.jTabbedPaneBusquedasProcesoLiquidacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoLiquidacion!=null) {
				this.jScrollPanelDatosProcesoLiquidacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoLiquidacion!=null) {
				this.jPanelPaginacionProcesoLiquidacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoLiquidacion!=null) {
				this.jPanelParametrosReportesProcesoLiquidacion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoLiquidacion!=null) {
				this.jScrollPanelDatosEdicionProcesoLiquidacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoLiquidacion!=null) {
				this.jTabbedPaneBusquedasProcesoLiquidacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoLiquidacion!=null) {
				this.jScrollPanelDatosProcesoLiquidacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoLiquidacion!=null) {
				this.jPanelPaginacionProcesoLiquidacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoLiquidacion!=null) {
				this.jPanelParametrosReportesProcesoLiquidacion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoLiquidacion!=null) {
				this.jScrollPanelDatosEdicionProcesoLiquidacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoLiquidacion!=null) {
				this.jTabbedPaneBusquedasProcesoLiquidacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoLiquidacion!=null) {
				this.jScrollPanelDatosProcesoLiquidacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoLiquidacion!=null) {
				this.jPanelPaginacionProcesoLiquidacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoLiquidacion!=null) {
				this.jPanelParametrosReportesProcesoLiquidacion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoLiquidacion!=null) {
				this.jScrollPanelDatosEdicionProcesoLiquidacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoLiquidacion!=null) {
				this.jTabbedPaneBusquedasProcesoLiquidacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoLiquidacion!=null) {
				this.jScrollPanelDatosProcesoLiquidacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoLiquidacion!=null) {
				this.jPanelPaginacionProcesoLiquidacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoLiquidacion!=null) {
				this.jPanelParametrosReportesProcesoLiquidacion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoLiquidacion!=null) {
					this.jTabbedPaneBusquedasProcesoLiquidacion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoLiquidacion!=null) {
				this.jPanelParametrosReportesProcesoLiquidacion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoLiquidacion!=null) {
				this.jTabbedPaneBusquedasProcesoLiquidacion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoLiquidacion!=null) {
				this.jPanelParametrosReportesProcesoLiquidacion.setVisible(true);
			}
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
			
			this.inicializarActualizarBindingTablaProcesoLiquidacion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoLiquidacion() {
		this.updateBorderResaltarBusquedasFormularioProcesoLiquidacion();
		this.updateVisibilidadBusquedasFormularioProcesoLiquidacion();
		this.updateHabilitarBusquedasFormularioProcesoLiquidacion();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoLiquidacion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoLiquidacion.getComponents().length>0) {
	

		if(this.procesoliquidacionConstantesFunciones.resaltarBusquedaProcesoLiquidacionProcesoLiquidacion!=null) {
			index= this.jTabbedPaneBusquedasProcesoLiquidacion.indexOfComponent(this.jPanelBusquedaProcesoLiquidacionProcesoLiquidacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoLiquidacion.getComponent(index);
				jPanel.setBorder(this.procesoliquidacionConstantesFunciones.resaltarBusquedaProcesoLiquidacionProcesoLiquidacion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoLiquidacion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoLiquidacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoLiquidacion.indexOfComponent(this.jPanelBusquedaProcesoLiquidacionProcesoLiquidacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoLiquidacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesoliquidacionConstantesFunciones.mostrarBusquedaProcesoLiquidacionProcesoLiquidacion);
			if(!this.procesoliquidacionConstantesFunciones.mostrarBusquedaProcesoLiquidacionProcesoLiquidacion && index>-1) {
				this.jTabbedPaneBusquedasProcesoLiquidacion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoLiquidacion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoLiquidacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoLiquidacion.indexOfComponent(this.jPanelBusquedaProcesoLiquidacionProcesoLiquidacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoLiquidacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesoliquidacionConstantesFunciones.activarBusquedaProcesoLiquidacionProcesoLiquidacion);
				this.jTabbedPaneBusquedasProcesoLiquidacion.setEnabledAt(index,this.procesoliquidacionConstantesFunciones.activarBusquedaProcesoLiquidacionProcesoLiquidacion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoLiquidacion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoLiquidacion")) {
			index= this.jTabbedPaneBusquedasProcesoLiquidacion.indexOfComponent(this.jPanelBusquedaProcesoLiquidacionProcesoLiquidacion);

			this.jTabbedPaneBusquedasProcesoLiquidacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoLiquidacion.getComponent(index);

			this.procesoliquidacionConstantesFunciones.setResaltarBusquedaProcesoLiquidacionProcesoLiquidacion(resaltar);

			jPanel.setBorder(this.procesoliquidacionConstantesFunciones.resaltarBusquedaProcesoLiquidacionProcesoLiquidacion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoLiquidacion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoLiquidacion() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoLiquidacion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoLiquidacion();
		this.updateVisibilidadResaltarControlesFormularioProcesoLiquidacion();
		this.updateHabilitarResaltarControlesFormularioProcesoLiquidacion();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoLiquidacion() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoLiquidacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesoliquidacionConstantesFunciones.resaltaridProcesoLiquidacion!=null && this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {this.jInternalFrameDetalleFormProcesoLiquidacion.jLabelidProcesoLiquidacion.setBorder(this.procesoliquidacionConstantesFunciones.resaltaridProcesoLiquidacion);}
		if(this.procesoliquidacionConstantesFunciones.resaltarfechaProcesoLiquidacion!=null && this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {this.jInternalFrameDetalleFormProcesoLiquidacion.jDateChooserfechaProcesoLiquidacion.setBorder(this.procesoliquidacionConstantesFunciones.resaltarfechaProcesoLiquidacion);}
		if(this.procesoliquidacionConstantesFunciones.resaltares_reversarProcesoLiquidacion!=null && this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {this.jInternalFrameDetalleFormProcesoLiquidacion.jCheckBoxes_reversarProcesoLiquidacion.setBorderPainted(true);this.jInternalFrameDetalleFormProcesoLiquidacion.jCheckBoxes_reversarProcesoLiquidacion.setBorder(this.procesoliquidacionConstantesFunciones.resaltares_reversarProcesoLiquidacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoLiquidacion() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {
	
		//this.jInternalFrameDetalleFormProcesoLiquidacion.jLabelidProcesoLiquidacion.setVisible(this.procesoliquidacionConstantesFunciones.mostraridProcesoLiquidacion);
		this.jInternalFrameDetalleFormProcesoLiquidacion.jPanelidProcesoLiquidacion.setVisible(this.procesoliquidacionConstantesFunciones.mostraridProcesoLiquidacion);
		//this.jInternalFrameDetalleFormProcesoLiquidacion.jDateChooserfechaProcesoLiquidacion.setVisible(this.procesoliquidacionConstantesFunciones.mostrarfechaProcesoLiquidacion);
		this.jInternalFrameDetalleFormProcesoLiquidacion.jPanelfechaProcesoLiquidacion.setVisible(this.procesoliquidacionConstantesFunciones.mostrarfechaProcesoLiquidacion);
		//this.jInternalFrameDetalleFormProcesoLiquidacion.jCheckBoxes_reversarProcesoLiquidacion.setVisible(this.procesoliquidacionConstantesFunciones.mostrares_reversarProcesoLiquidacion);
		this.jInternalFrameDetalleFormProcesoLiquidacion.jPaneles_reversarProcesoLiquidacion.setVisible(this.procesoliquidacionConstantesFunciones.mostrares_reversarProcesoLiquidacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoLiquidacion() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoLiquidacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoLiquidacion!=null) {
	
		this.jInternalFrameDetalleFormProcesoLiquidacion.jLabelidProcesoLiquidacion.setEnabled(this.procesoliquidacionConstantesFunciones.activaridProcesoLiquidacion);
		this.jInternalFrameDetalleFormProcesoLiquidacion.jDateChooserfechaProcesoLiquidacion.setEnabled(this.procesoliquidacionConstantesFunciones.activarfechaProcesoLiquidacion);
		this.jInternalFrameDetalleFormProcesoLiquidacion.jCheckBoxes_reversarProcesoLiquidacion.setEnabled(this.procesoliquidacionConstantesFunciones.activares_reversarProcesoLiquidacion);
		}
	}
	
		
}