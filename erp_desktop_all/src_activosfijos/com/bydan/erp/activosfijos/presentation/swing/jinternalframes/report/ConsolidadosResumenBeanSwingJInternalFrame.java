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

//import com.bydan.erp.activosfijos.util.ConsolidadosResumenConstantesFunciones;
import com.bydan.erp.activosfijos.util.report.ConsolidadosResumenParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.report.ConsolidadosResumenParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.report.ConsolidadosResumenBean;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ConsolidadosResumenBeanSwingJInternalFrame extends ConsolidadosResumenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ConsolidadosResumenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ConsolidadosResumen> consolidadosresumenValidator = new ClassValidator<ConsolidadosResumen>(ConsolidadosResumen.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ConsolidadosResumen consolidadosresumen;	
	public ConsolidadosResumen consolidadosresumenAux;
	public ConsolidadosResumen consolidadosresumenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ConsolidadosResumen consolidadosresumenTotales;
	public Long idConsolidadosResumenActual;
	public Long iIdNuevoConsolidadosResumen=0L;
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
	
	public Boolean isPermisoTodoConsolidadosResumen;
	public Boolean isPermisoNuevoConsolidadosResumen;
	public Boolean isPermisoActualizarConsolidadosResumen;
	public Boolean isPermisoActualizarOriginalConsolidadosResumen;
	public Boolean isPermisoEliminarConsolidadosResumen;
	public Boolean isPermisoGuardarCambiosConsolidadosResumen;
	public Boolean isPermisoConsultaConsolidadosResumen;
	public Boolean isPermisoBusquedaConsolidadosResumen;
	public Boolean isPermisoReporteConsolidadosResumen;
	public Boolean isPermisoPaginacionMedioConsolidadosResumen;
	public Boolean isPermisoPaginacionAltoConsolidadosResumen;
	public Boolean isPermisoPaginacionTodoConsolidadosResumen;
	public Boolean isPermisoCopiarConsolidadosResumen;
	public Boolean isPermisoVerFormConsolidadosResumen;
	public Boolean isPermisoDuplicarConsolidadosResumen;
	public Boolean isPermisoOrdenConsolidadosResumen;
	
	
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
	
	public ConsolidadosResumenParameterReturnGeneral consolidadosresumenReturnGeneral;
	public ConsolidadosResumenParameterReturnGeneral consolidadosresumenParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoConsolidadosResumen=false;
	public Boolean esParaAccionDesdeFormularioConsolidadosResumen=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ConsolidadosResumenSessionBeanAdditional consolidadosresumenSessionBeanAdditional=null;
	
	public ConsolidadosResumenSessionBeanAdditional getConsolidadosResumenSessionBeanAdditional() {
		return this.consolidadosresumenSessionBeanAdditional;
	}
	
	public void setConsolidadosResumenSessionBeanAdditional(ConsolidadosResumenSessionBeanAdditional consolidadosresumenSessionBeanAdditional) {
		try {
			this.consolidadosresumenSessionBeanAdditional=consolidadosresumenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ConsolidadosResumenBeanSwingJInternalFrameAdditional consolidadosresumenBeanSwingJInternalFrameAdditional=null;
	//public class ConsolidadosResumenBeanSwingJInternalFrame
	
	public ConsolidadosResumenBeanSwingJInternalFrameAdditional getConsolidadosResumenBeanSwingJInternalFrameAdditional() {
		return this.consolidadosresumenBeanSwingJInternalFrameAdditional;
	}
	
	public void setConsolidadosResumenBeanSwingJInternalFrameAdditional(ConsolidadosResumenBeanSwingJInternalFrameAdditional consolidadosresumenBeanSwingJInternalFrameAdditional) {
		try {
			this.consolidadosresumenBeanSwingJInternalFrameAdditional=consolidadosresumenBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ConsolidadosResumenLogic consolidadosresumenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ConsolidadosResumen consolidadosresumenBean;
	public ConsolidadosResumenConstantesFunciones consolidadosresumenConstantesFunciones;
	//public ConsolidadosResumenParameterReturnGeneral consolidadosresumenReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<ConsolidadosResumen> consolidadosresumens;	
	//public List<ConsolidadosResumen> consolidadosresumensEliminados;
	//public List<ConsolidadosResumen> consolidadosresumensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoConsolidadosResumen=false;
	public Boolean isVisibilidadCeldaDuplicarConsolidadosResumen=true;
	public Boolean isVisibilidadCeldaCopiarConsolidadosResumen=true;
	public Boolean isVisibilidadCeldaVerFormConsolidadosResumen=true;
	public Boolean isVisibilidadCeldaOrdenConsolidadosResumen=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesConsolidadosResumen=false;
	public Boolean isVisibilidadCeldaModificarConsolidadosResumen=false;
	public Boolean isVisibilidadCeldaActualizarConsolidadosResumen=false;
	public Boolean isVisibilidadCeldaEliminarConsolidadosResumen=false;
	public Boolean isVisibilidadCeldaCancelarConsolidadosResumen=false;
	public Boolean isVisibilidadCeldaGuardarConsolidadosResumen=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosConsolidadosResumen=false;	
	
	
	public Boolean isVisibilidadBusquedaConsolidadosResumen=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoConsolidadosResumen() {
		return this.iIdNuevoConsolidadosResumen;
	}

	public void setiIdNuevoConsolidadosResumen(Long iIdNuevoConsolidadosResumen) {
		this.iIdNuevoConsolidadosResumen = iIdNuevoConsolidadosResumen;
	}
	
	public Long getidConsolidadosResumenActual() {
		return this.idConsolidadosResumenActual;
	}

	public void setidConsolidadosResumenActual(Long idConsolidadosResumenActual) {
		this.idConsolidadosResumenActual = idConsolidadosResumenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ConsolidadosResumen getconsolidadosresumen() {
		return this.consolidadosresumen;
	}

	public void setconsolidadosresumen(ConsolidadosResumen consolidadosresumen) {
		this.consolidadosresumen = consolidadosresumen;
	}
	
	public ConsolidadosResumen getconsolidadosresumenAux() {
		return this.consolidadosresumenAux;
	}

	public void setconsolidadosresumenAux(ConsolidadosResumen consolidadosresumenAux) {
		this.consolidadosresumenAux = consolidadosresumenAux;
	}				
	
	public ConsolidadosResumen getconsolidadosresumenAnterior() {
		return this.consolidadosresumenAnterior;
	}

	public void setconsolidadosresumenAnterior(ConsolidadosResumen consolidadosresumenAnterior) {
		this.consolidadosresumenAnterior = consolidadosresumenAnterior;
	}	
	
	public ConsolidadosResumen getconsolidadosresumenTotales() {
		return this.consolidadosresumenTotales;
	}

	public void setconsolidadosresumenTotales(ConsolidadosResumen consolidadosresumenTotales) {
		this.consolidadosresumenTotales = consolidadosresumenTotales;
	}	
	
	public ConsolidadosResumen getconsolidadosresumenBean() {
		return this.consolidadosresumenBean;
	}

	public void setconsolidadosresumenBean(ConsolidadosResumen consolidadosresumenBean) {
		this.consolidadosresumenBean = consolidadosresumenBean;
	}	
	
	public ConsolidadosResumenParameterReturnGeneral getconsolidadosresumenReturnGeneral() {
		return this.consolidadosresumenReturnGeneral;
	}

	public void setconsolidadosresumenReturnGeneral(ConsolidadosResumenParameterReturnGeneral consolidadosresumenReturnGeneral) {
		this.consolidadosresumenReturnGeneral = consolidadosresumenReturnGeneral;
	}	
	
	
	public Long idBusquedaConsolidadosResumen=0L;

	public Long getidBusquedaConsolidadosResumen() {
		return this.idBusquedaConsolidadosResumen;
	}

	public void setidBusquedaConsolidadosResumen(Long idBusquedaConsolidadosResumen) {
		this.idBusquedaConsolidadosResumen = idBusquedaConsolidadosResumen;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ConsolidadosResumenLogic getConsolidadosResumenLogic()	{		
		return consolidadosresumenLogic;
	}

	public void setConsolidadosResumenLogic(ConsolidadosResumenLogic consolidadosresumenLogic) {
		this.consolidadosresumenLogic = consolidadosresumenLogic;
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
	
	public Boolean getIsEsNuevoConsolidadosResumen() {
		return isEsNuevoConsolidadosResumen;
	}

	public void setIsEsNuevoConsolidadosResumen(Boolean isEsNuevoConsolidadosResumen) {
		this.isEsNuevoConsolidadosResumen = isEsNuevoConsolidadosResumen;
	}

	public Boolean getEsParaAccionDesdeFormularioConsolidadosResumen() {
		return esParaAccionDesdeFormularioConsolidadosResumen;
	}
	
	public void setEsParaAccionDesdeFormularioConsolidadosResumen(Boolean esParaAccionDesdeFormularioConsolidadosResumen) {
		this.esParaAccionDesdeFormularioConsolidadosResumen = esParaAccionDesdeFormularioConsolidadosResumen;
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

			if(this.consolidadosresumenSessionBean==null) {
				this.consolidadosresumenSessionBean=new ConsolidadosResumenSessionBean();
			}

			if(!this.consolidadosresumenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(consolidadosresumenSessionBean.getlidEmpresaActual());
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

					if(this.consolidadosresumen!=null) {
						this.consolidadosresumen.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
						this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxid_empresaConsolidadosResumen.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaConsolidadosResumen.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
						if(this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxid_empresaConsolidadosResumen.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxid_empresaConsolidadosResumen.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaConsolidadosResumenGenerico)throws Exception
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
				jComboBoxid_empresaConsolidadosResumenGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaConsolidadosResumenGenerico!=null && jComboBoxid_empresaConsolidadosResumenGenerico.getItemCount()>0) {
					jComboBoxid_empresaConsolidadosResumenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ConsolidadosResumen consolidadosresumen,JComboBox jComboBoxid_empresaConsolidadosResumenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaConsolidadosResumenGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxid_empresaConsolidadosResumen.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaConsolidadosResumenGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				consolidadosresumen.setid_empresa(empresaAux.getId());
				consolidadosresumen.setempresa_descripcion(ConsolidadosResumenConstantesFunciones.getEmpresaDescripcion(empresaAux));
				consolidadosresumen.setEmpresa(empresaAux);			}
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

					if(!ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { 
							this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxid_empresaConsolidadosResumen.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxid_empresaConsolidadosResumen.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { 
					}

					if(!ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
							this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxid_empresaConsolidadosResumen.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
							this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxid_empresaConsolidadosResumen.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesConsolidadosResumen() throws Exception {
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
		
	public ConsolidadosResumenParameterReturnGeneral getConsolidadosResumenParameterGeneral() {
		return this.consolidadosresumenParameterGeneral;
	}
	
	public void setConsolidadosResumenParameterGeneral(ConsolidadosResumenParameterReturnGeneral consolidadosresumenParameterGeneral) {
		this.consolidadosresumenParameterGeneral = consolidadosresumenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoConsolidadosResumen() {
		return isPermisoTodoConsolidadosResumen;
	}

	public void setIsPermisoTodoConsolidadosResumen(Boolean isPermisoTodoConsolidadosResumen) {
		this.isPermisoTodoConsolidadosResumen = isPermisoTodoConsolidadosResumen;
	}

	public Boolean getIsPermisoNuevoConsolidadosResumen() {
		return isPermisoNuevoConsolidadosResumen;
	}

	public void setIsPermisoNuevoConsolidadosResumen(Boolean isPermisoNuevoConsolidadosResumen) {
		this.isPermisoNuevoConsolidadosResumen = isPermisoNuevoConsolidadosResumen;
	}

	public Boolean getIsPermisoActualizarConsolidadosResumen() {
		return isPermisoActualizarConsolidadosResumen;
	}

	public void setIsPermisoActualizarConsolidadosResumen(Boolean isPermisoActualizarConsolidadosResumen) {
		this.isPermisoActualizarConsolidadosResumen = isPermisoActualizarConsolidadosResumen;
	}

	public Boolean getIsPermisoEliminarConsolidadosResumen() {
		return isPermisoEliminarConsolidadosResumen;
	}

	public void setIsPermisoEliminarConsolidadosResumen(Boolean isPermisoEliminarConsolidadosResumen) {
		this.isPermisoEliminarConsolidadosResumen = isPermisoEliminarConsolidadosResumen;
	}

	public Boolean getIsPermisoGuardarCambiosConsolidadosResumen() {
		return isPermisoGuardarCambiosConsolidadosResumen;
	}

	public void setIsPermisoGuardarCambiosConsolidadosResumen(Boolean isPermisoGuardarCambiosConsolidadosResumen) {
		this.isPermisoGuardarCambiosConsolidadosResumen = isPermisoGuardarCambiosConsolidadosResumen;
	}
	
	public Boolean getIsPermisoConsultaConsolidadosResumen() {
		return isPermisoConsultaConsolidadosResumen;
	}

	public void setIsPermisoConsultaConsolidadosResumen(Boolean isPermisoConsultaConsolidadosResumen) {
		this.isPermisoConsultaConsolidadosResumen = isPermisoConsultaConsolidadosResumen;
	}

	public Boolean getIsPermisoBusquedaConsolidadosResumen() {
		return isPermisoBusquedaConsolidadosResumen;
	}

	public void setIsPermisoBusquedaConsolidadosResumen(Boolean isPermisoBusquedaConsolidadosResumen) {
		this.isPermisoBusquedaConsolidadosResumen = isPermisoBusquedaConsolidadosResumen;
	}

	public Boolean getIsPermisoReporteConsolidadosResumen() {
		return isPermisoReporteConsolidadosResumen;
	}

	public void setIsPermisoReporteConsolidadosResumen(Boolean isPermisoReporteConsolidadosResumen) {
		this.isPermisoReporteConsolidadosResumen = isPermisoReporteConsolidadosResumen;
	}
	
	public Boolean getIsPermisoPaginacionMedioConsolidadosResumen() {
		return isPermisoPaginacionMedioConsolidadosResumen;
	}

	public void setIsPermisoPaginacionMedioConsolidadosResumen(Boolean isPermisoPaginacionMedioConsolidadosResumen) {
		this.isPermisoPaginacionMedioConsolidadosResumen = isPermisoPaginacionMedioConsolidadosResumen;
	}
	
	public Boolean getIsPermisoPaginacionTodoConsolidadosResumen() {
		return isPermisoPaginacionTodoConsolidadosResumen;
	}

	public void setIsPermisoPaginacionTodoConsolidadosResumen(Boolean isPermisoPaginacionTodoConsolidadosResumen) {
		this.isPermisoPaginacionTodoConsolidadosResumen = isPermisoPaginacionTodoConsolidadosResumen;
	}
	
	public Boolean getIsPermisoPaginacionAltoConsolidadosResumen() {
		return isPermisoPaginacionAltoConsolidadosResumen;
	}

	public void setIsPermisoPaginacionAltoConsolidadosResumen(Boolean isPermisoPaginacionAltoConsolidadosResumen) {
		this.isPermisoPaginacionAltoConsolidadosResumen = isPermisoPaginacionAltoConsolidadosResumen;
	}
	
	public Boolean getIsPermisoCopiarConsolidadosResumen() {
		return isPermisoCopiarConsolidadosResumen;
	}

	public void setIsPermisoCopiarConsolidadosResumen(Boolean isPermisoCopiarConsolidadosResumen) {
		this.isPermisoCopiarConsolidadosResumen = isPermisoCopiarConsolidadosResumen;
	}
	
	public Boolean getIsPermisoVerFormConsolidadosResumen() {
		return isPermisoVerFormConsolidadosResumen;
	}

	public void setIsPermisoVerFormConsolidadosResumen(Boolean isPermisoVerFormConsolidadosResumen) {
		this.isPermisoVerFormConsolidadosResumen = isPermisoVerFormConsolidadosResumen;
	}
	
	public Boolean getIsPermisoDuplicarConsolidadosResumen() {
		return isPermisoDuplicarConsolidadosResumen;
	}

	public void setIsPermisoDuplicarConsolidadosResumen(Boolean isPermisoDuplicarConsolidadosResumen) {
		this.isPermisoDuplicarConsolidadosResumen = isPermisoDuplicarConsolidadosResumen;
	}
	
	public Boolean getIsPermisoOrdenConsolidadosResumen() {
		return isPermisoOrdenConsolidadosResumen;
	}

	public void setIsPermisoOrdenConsolidadosResumen(Boolean isPermisoOrdenConsolidadosResumen) {
		this.isPermisoOrdenConsolidadosResumen = isPermisoOrdenConsolidadosResumen;
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
	
	public Boolean getIsVisibilidadCeldaNuevoConsolidadosResumen() {
		return isVisibilidadCeldaNuevoConsolidadosResumen;
	}

	public void setIsVisibilidadCeldaNuevoConsolidadosResumen(Boolean isVisibilidadCeldaNuevoConsolidadosResumen) {
		this.isVisibilidadCeldaNuevoConsolidadosResumen = isVisibilidadCeldaNuevoConsolidadosResumen;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarConsolidadosResumen() {
		return isVisibilidadCeldaDuplicarConsolidadosResumen;
	}

	public void setIsVisibilidadCeldaDuplicarConsolidadosResumen(Boolean isVisibilidadCeldaDuplicarConsolidadosResumen) {
		this.isVisibilidadCeldaDuplicarConsolidadosResumen = isVisibilidadCeldaDuplicarConsolidadosResumen;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarConsolidadosResumen() {
		return isVisibilidadCeldaCopiarConsolidadosResumen;
	}

	public void setIsVisibilidadCeldaCopiarConsolidadosResumen(Boolean isVisibilidadCeldaCopiarConsolidadosResumen) {
		this.isVisibilidadCeldaCopiarConsolidadosResumen = isVisibilidadCeldaCopiarConsolidadosResumen;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormConsolidadosResumen() {
		return isVisibilidadCeldaVerFormConsolidadosResumen;
	}

	public void setIsVisibilidadCeldaVerFormConsolidadosResumen(Boolean isVisibilidadCeldaVerFormConsolidadosResumen) {
		this.isVisibilidadCeldaVerFormConsolidadosResumen = isVisibilidadCeldaVerFormConsolidadosResumen;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenConsolidadosResumen() {
		return isVisibilidadCeldaOrdenConsolidadosResumen;
	}

	public void setIsVisibilidadCeldaOrdenConsolidadosResumen(Boolean isVisibilidadCeldaOrdenConsolidadosResumen) {
		this.isVisibilidadCeldaOrdenConsolidadosResumen = isVisibilidadCeldaOrdenConsolidadosResumen;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesConsolidadosResumen() {
		return isVisibilidadCeldaNuevoRelacionesConsolidadosResumen;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesConsolidadosResumen(Boolean isVisibilidadCeldaNuevoRelacionesConsolidadosResumen) {
		this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen = isVisibilidadCeldaNuevoRelacionesConsolidadosResumen;
	}
	
	public Boolean getIsVisibilidadCeldaModificarConsolidadosResumen() {
		return isVisibilidadCeldaModificarConsolidadosResumen;
	}

	public void setIsVisibilidadCeldaModificarConsolidadosResumen(Boolean isVisibilidadCeldaModificarConsolidadosResumen) {
		this.isVisibilidadCeldaModificarConsolidadosResumen = isVisibilidadCeldaModificarConsolidadosResumen;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarConsolidadosResumen() {
		return isVisibilidadCeldaActualizarConsolidadosResumen;
	}

	public void setIsVisibilidadCeldaActualizarConsolidadosResumen(Boolean isVisibilidadCeldaActualizarConsolidadosResumen) {
		this.isVisibilidadCeldaActualizarConsolidadosResumen = isVisibilidadCeldaActualizarConsolidadosResumen;
	}

	public Boolean getIsVisibilidadCeldaEliminarConsolidadosResumen() {
		return isVisibilidadCeldaEliminarConsolidadosResumen;
	}

	public void setIsVisibilidadCeldaEliminarConsolidadosResumen(Boolean isVisibilidadCeldaEliminarConsolidadosResumen) {
		this.isVisibilidadCeldaEliminarConsolidadosResumen = isVisibilidadCeldaEliminarConsolidadosResumen;
	}

	public Boolean getIsVisibilidadCeldaCancelarConsolidadosResumen() {
		return isVisibilidadCeldaCancelarConsolidadosResumen;
	}

	public void setIsVisibilidadCeldaCancelarConsolidadosResumen(Boolean isVisibilidadCeldaCancelarConsolidadosResumen) {
		this.isVisibilidadCeldaCancelarConsolidadosResumen = isVisibilidadCeldaCancelarConsolidadosResumen;
	}

	public Boolean getIsVisibilidadCeldaGuardarConsolidadosResumen() {
		return isVisibilidadCeldaGuardarConsolidadosResumen;
	}

	public void setIsVisibilidadCeldaGuardarConsolidadosResumen(Boolean isVisibilidadCeldaGuardarConsolidadosResumen) {
		this.isVisibilidadCeldaGuardarConsolidadosResumen = isVisibilidadCeldaGuardarConsolidadosResumen;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosConsolidadosResumen() {
		return isVisibilidadCeldaGuardarCambiosConsolidadosResumen;
	}

	public void setIsVisibilidadCeldaGuardarCambiosConsolidadosResumen(Boolean isVisibilidadCeldaGuardarCambiosConsolidadosResumen) {
		this.isVisibilidadCeldaGuardarCambiosConsolidadosResumen = isVisibilidadCeldaGuardarCambiosConsolidadosResumen;
	}
		
	public ConsolidadosResumenSessionBean getconsolidadosresumenSessionBean() {
		return this.consolidadosresumenSessionBean;
	}
	
	public void setconsolidadosresumenSessionBean(ConsolidadosResumenSessionBean consolidadosresumenSessionBean) {
		this.consolidadosresumenSessionBean=consolidadosresumenSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaConsolidadosResumen() {
		return this.isVisibilidadBusquedaConsolidadosResumen;
	}

	public void setisVisibilidadBusquedaConsolidadosResumen(Boolean isVisibilidadBusquedaConsolidadosResumen) {
		this.isVisibilidadBusquedaConsolidadosResumen=isVisibilidadBusquedaConsolidadosResumen;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(ConsolidadosResumen consolidadosresumen)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(consolidadosresumen,null);
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
	
	public void bugActualizarReferenciaActual(ConsolidadosResumen consolidadosresumen,ConsolidadosResumen consolidadosresumenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalConsolidadosResumen(consolidadosresumen);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		consolidadosresumenAux.setId(consolidadosresumen.getId());
		consolidadosresumenAux.setVersionRow(consolidadosresumen.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ConsolidadosResumen consolidadosresumenLocal) throws Exception {
		
		if(this.consolidadosresumenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ConsolidadosResumen consolidadosresumenLocal) throws Exception {	
		if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				consolidadosresumenLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarConsolidadosResumenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = consolidadosresumenValidator.getInvalidValues(this.consolidadosresumen);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ConsolidadosResumen consolidadosresumen,List<ConsolidadosResumen> consolidadosresumens) throws Exception {
	}		
	
	public void actualizarSelectedLista(ConsolidadosResumen consolidadosresumen,List<ConsolidadosResumen> consolidadosresumens) throws Exception {
		try	{			
			ConsolidadosResumenConstantesFunciones.actualizarSelectedLista(consolidadosresumen,consolidadosresumens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ConsolidadosResumen> consolidadosresumensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				consolidadosresumensLocal=this.consolidadosresumenLogic.getConsolidadosResumens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				consolidadosresumensLocal=this.consolidadosresumens;
			}
			//ARCHITECTURE
		
			for(ConsolidadosResumen consolidadosresumenLocal:consolidadosresumensLocal) {
				if(this.permiteMantenimiento(consolidadosresumenLocal) && consolidadosresumenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ConsolidadosResumenConstantesFunciones.getConsolidadosResumenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ConsolidadosResumenConstantesFunciones.NOMBREEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelnombre_empresaConsolidadosResumen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosResumenConstantesFunciones.NOMBRESUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelnombre_sucursalConsolidadosResumen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosResumenConstantesFunciones.CODIGOSUBGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelcodigo_sub_grupoConsolidadosResumen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosResumenConstantesFunciones.NOMBRESUBGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelnombre_sub_grupoConsolidadosResumen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosResumenConstantesFunciones.CODIGODETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelcodigo_detalle_grupoConsolidadosResumen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosResumenConstantesFunciones.NOMBREDETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelnombre_detalle_grupoConsolidadosResumen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosResumenConstantesFunciones.CLAVE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelclaveConsolidadosResumen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosResumenConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelnombreConsolidadosResumen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosResumenConstantesFunciones.FECHACOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelfecha_compraConsolidadosResumen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosResumenConstantesFunciones.VIDAUTIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelvida_utilConsolidadosResumen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosResumenConstantesFunciones.COSTODECOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelcosto_de_compraConsolidadosResumen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosResumenConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelcantidadConsolidadosResumen,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelnombre_empresaConsolidadosResumen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelnombre_sucursalConsolidadosResumen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelcodigo_sub_grupoConsolidadosResumen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelnombre_sub_grupoConsolidadosResumen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelcodigo_detalle_grupoConsolidadosResumen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelnombre_detalle_grupoConsolidadosResumen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelclaveConsolidadosResumen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelnombreConsolidadosResumen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelfecha_compraConsolidadosResumen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelvida_utilConsolidadosResumen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelcosto_de_compraConsolidadosResumen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelcantidadConsolidadosResumen,"");
		
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
		this.iIdNuevoConsolidadosResumen--;	
		
		
		this.consolidadosresumenAux=new ConsolidadosResumen();
		
		this.consolidadosresumenAux.setId(this.iIdNuevoConsolidadosResumen);
		this.consolidadosresumenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.consolidadosresumenLogic.getConsolidadosResumens().add(this.consolidadosresumenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.consolidadosresumens.add(this.consolidadosresumenAux);
		}
		//ARCHITECTURE
		
		this.consolidadosresumen=this.consolidadosresumenAux;
		
		if(ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioConsolidadosResumen(this.consolidadosresumen);
			this.setVariablesObjetoActualToFormularioForeignKeyConsolidadosResumen(this.consolidadosresumen);
		}
				
		//this.setDefaultControlesConsolidadosResumen();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyConsolidadosResumen();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyConsolidadosResumen();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyConsolidadosResumen();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConsolidadosResumen(this.consolidadosresumenBean,this.consolidadosresumen,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanConsolidadosResumen(this.consolidadosresumenReturnGeneral,this.consolidadosresumenBean,false);
		
		if(this.consolidadosresumenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyConsolidadosResumen(this.consolidadosresumenReturnGeneral.getConsolidadosResumen());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioConsolidadosResumen(this.consolidadosresumenReturnGeneral.getConsolidadosResumen());
		}
		
		if(this.consolidadosresumenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioConsolidadosResumen(this.consolidadosresumenReturnGeneral.getConsolidadosResumen(),classes);//this.consolidadosresumenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.consolidadosresumen,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyConsolidadosResumen();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyConsolidadosResumen();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.RecargarFormConsolidadosResumen(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingConsolidadosResumen(false);
						
			if(consolidadosresumenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConsolidadosResumen();
			}
			
			this.actualizarVisualTableDatosConsolidadosResumen();
			
			this.jTableDatosConsolidadosResumen.setRowSelectionInterval(this.getIndiceNuevoConsolidadosResumen(), this.getIndiceNuevoConsolidadosResumen());
			
			this.seleccionarFilaTablaConsolidadosResumenActual();
						
			this.actualizarEstadoCeldasBotonesConsolidadosResumen("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesConsolidadosResumen(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_empresaConsolidadosResumen.setEnabled(isHabilitar && this.consolidadosresumenConstantesFunciones.activarnombre_empresaConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_sucursalConsolidadosResumen.setEnabled(isHabilitar && this.consolidadosresumenConstantesFunciones.activarnombre_sucursalConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcodigo_sub_grupoConsolidadosResumen.setEnabled(isHabilitar && this.consolidadosresumenConstantesFunciones.activarcodigo_sub_grupoConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_sub_grupoConsolidadosResumen.setEnabled(isHabilitar && this.consolidadosresumenConstantesFunciones.activarnombre_sub_grupoConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcodigo_detalle_grupoConsolidadosResumen.setEnabled(isHabilitar && this.consolidadosresumenConstantesFunciones.activarcodigo_detalle_grupoConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_detalle_grupoConsolidadosResumen.setEnabled(isHabilitar && this.consolidadosresumenConstantesFunciones.activarnombre_detalle_grupoConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldclaveConsolidadosResumen.setEnabled(isHabilitar && this.consolidadosresumenConstantesFunciones.activarclaveConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombreConsolidadosResumen.setEnabled(isHabilitar && this.consolidadosresumenConstantesFunciones.activarnombreConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jDateChooserfecha_compraConsolidadosResumen.setEnabled(isHabilitar && this.consolidadosresumenConstantesFunciones.activarfecha_compraConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldvida_utilConsolidadosResumen.setEnabled(isHabilitar && this.consolidadosresumenConstantesFunciones.activarvida_utilConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcosto_de_compraConsolidadosResumen.setEnabled(isHabilitar && this.consolidadosresumenConstantesFunciones.activarcosto_de_compraConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcantidadConsolidadosResumen.setEnabled(isHabilitar && this.consolidadosresumenConstantesFunciones.activarcantidadConsolidadosResumen);	
		//
		this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxid_empresaConsolidadosResumen.setEnabled(isHabilitar && this.consolidadosresumenConstantesFunciones.activarid_empresaConsolidadosResumen);
	};
	
	public void setDefaultControlesConsolidadosResumen() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoConsolidadosResumen(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.consolidadosresumenSessionBean.setConGuardarRelaciones(true);			
			this.consolidadosresumenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormConsolidadosResumen.jTabbedPaneRelacionesConsolidadosResumen.setVisible(true);
			
					
		} else {
			//this.consolidadosresumenSessionBean.setConGuardarRelaciones(false);			
			this.consolidadosresumenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormConsolidadosResumen.jTabbedPaneRelacionesConsolidadosResumen.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoConsolidadosResumen() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsolidadosResumen consolidadosresumenAux:this.consolidadosresumenLogic.getConsolidadosResumens()) {
				if(consolidadosresumenAux.getId().equals(this.iIdNuevoConsolidadosResumen)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsolidadosResumen consolidadosresumenAux:this.consolidadosresumens) {
				if(consolidadosresumenAux.getId().equals(this.iIdNuevoConsolidadosResumen)) {
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
	
	public int getIndiceActualConsolidadosResumen(ConsolidadosResumen consolidadosresumen,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsolidadosResumen consolidadosresumenAux:this.consolidadosresumenLogic.getConsolidadosResumens()) {
				if(consolidadosresumenAux.getId().equals(consolidadosresumen.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsolidadosResumen consolidadosresumenAux:this.consolidadosresumens) {
				if(consolidadosresumenAux.getId().equals(consolidadosresumen.getId())) {
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
	
	public void setCamposBaseDesdeOriginalConsolidadosResumen(ConsolidadosResumen consolidadosresumenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsolidadosResumen consolidadosresumenAux:this.consolidadosresumenLogic.getConsolidadosResumens()) {
				if(consolidadosresumenAux.getConsolidadosResumenOriginal().getId().equals(consolidadosresumenOriginal.getId())) {
					existe=true;
					consolidadosresumenOriginal.setId(consolidadosresumenAux.getId());
					consolidadosresumenOriginal.setVersionRow(consolidadosresumenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsolidadosResumen consolidadosresumenAux:this.consolidadosresumens) {
				if(consolidadosresumenAux.getConsolidadosResumenOriginal().getId().equals(consolidadosresumenOriginal.getId())) {
					existe=true;
					consolidadosresumenOriginal.setId(consolidadosresumenAux.getId());
					consolidadosresumenOriginal.setVersionRow(consolidadosresumenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosConsolidadosResumen(Boolean esParaCancelar) throws Exception {
		consolidadosresumensAux=new ArrayList<ConsolidadosResumen>();
		consolidadosresumenAux=new ConsolidadosResumen();
		
		if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ConsolidadosResumen consolidadosresumenAux:this.consolidadosresumenLogic.getConsolidadosResumens()) {
					if(consolidadosresumenAux.getId()<0) {
						consolidadosresumensAux.add(consolidadosresumenAux);
					}		
				}
				this.iIdNuevoConsolidadosResumen=0L;
				this.consolidadosresumenLogic.getConsolidadosResumens().removeAll(consolidadosresumensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConsolidadosResumen consolidadosresumenAux:this.consolidadosresumens) {
					if(consolidadosresumenAux.getId()<0) {
						consolidadosresumensAux.add(consolidadosresumenAux);
					}		
				}
				this.iIdNuevoConsolidadosResumen=0L;
				this.consolidadosresumens.removeAll(consolidadosresumensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoConsolidadosResumen 
					&& this.consolidadosresumenLogic.getConsolidadosResumens().size()>0
					) {
					consolidadosresumenAux=this.consolidadosresumenLogic.getConsolidadosResumens().get(this.consolidadosresumenLogic.getConsolidadosResumens().size() - 1);
				
					if(consolidadosresumenAux.getId()<0) {
						this.consolidadosresumenLogic.getConsolidadosResumens().remove(consolidadosresumenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoConsolidadosResumen && this.consolidadosresumens.size()>0) {
					consolidadosresumenAux=this.consolidadosresumens.get(this.consolidadosresumens.size() - 1);
				
					if(consolidadosresumenAux.getId()<0) {
						this.consolidadosresumens.remove(consolidadosresumenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoConsolidadosResumen(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(consolidadosresumen.getId()<0) {
				this.consolidadosresumenLogic.getConsolidadosResumens().remove(this.consolidadosresumen);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(consolidadosresumen.getId()<0) {
				this.consolidadosresumens.remove(this.consolidadosresumen);
			}
		}			
	}
	
	public void setEstadosInicialesConsolidadosResumen(List<ConsolidadosResumen> consolidadosresumensAux) throws Exception {
		ConsolidadosResumenConstantesFunciones.setEstadosInicialesConsolidadosResumen(consolidadosresumensAux);
	}
	
	public void setEstadosInicialesConsolidadosResumen(ConsolidadosResumen consolidadosresumenAux) throws Exception {
		ConsolidadosResumenConstantesFunciones.setEstadosInicialesConsolidadosResumen(consolidadosresumenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarConsolidadosResumenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesConsolidadosResumen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarConsolidadosResumenActual()) {
				if(!this.isEsNuevoConsolidadosResumen) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesConsolidadosResumen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoConsolidadosResumen=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarConsolidadosResumenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Consolidados Resumen ?", "MANTENIMIENTO DE Consolidados Resumen", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesConsolidadosResumen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ConsolidadosResumen consolidadosresumen) throws Exception {
		ConsolidadosResumenConstantesFunciones.seleccionarAsignar(this.consolidadosresumen,consolidadosresumen);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarConsolidadosResumen=this.isPermisoActualizarOriginalConsolidadosResumen;
			
			
			this.seleccionarAsignar(consolidadosresumen);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesConsolidadosResumen("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.consolidadosresumenSessionBean.setsFuncionBusquedaRapida(this.consolidadosresumenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoConsolidadosResumen) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosConsolidadosResumen(esParaCancelar);				
				this.cancelarNuevoConsolidadosResumen(esParaCancelar);								
			}
			
			this.consolidadosresumen=new ConsolidadosResumen();
			
			this.inicializarConsolidadosResumen();
			
			this.actualizarEstadoCeldasBotonesConsolidadosResumen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarConsolidadosResumen() throws Exception {
		try {
			ConsolidadosResumenConstantesFunciones.inicializarConsolidadosResumen(this.consolidadosresumen);
			
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
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.consolidadosresumenLogic.getConsolidadosResumens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteConsolidadosResumens(String sAccionBusqueda,List<ConsolidadosResumen> consolidadosresumensParaReportes) throws Exception {
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
					sPathReporteFinal="ConsolidadosResumen"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ConsolidadosResumenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ConsolidadosResumenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ConsolidadosResumen"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Consolidados Resumenes");		
		parameters.put("busquedapor", ConsolidadosResumenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceConsolidadosResumen=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ConsolidadosResumenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ConsolidadosResumenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceConsolidadosResumen=new JRBeanArrayDataSource(ConsolidadosResumenJInternalFrame.TraerConsolidadosResumenBeans(consolidadosresumensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceConsolidadosResumen);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ConsolidadosResumenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ConsolidadosResumenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ConsolidadosResumenBean.TraerConsolidadosResumenBeans(consolidadosresumensParaReportes).toArray()));
							
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
				this.generarExcelReporteConsolidadosResumens(sAccionBusqueda,sTipoArchivoReporte,consolidadosresumensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalConsolidadosResumens(sAccionBusqueda,sTipoArchivoReporte,consolidadosresumensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoConsolidadosResumenActionPerformed(null);
					//this.generarExcelReporteConsolidadosResumens(sAccionBusqueda,sTipoArchivoReporte,consolidadosresumensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalConsolidadosResumens(sAccionBusqueda,sTipoArchivoReporte,consolidadosresumensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesConsolidadosResumens(sAccionBusqueda,sTipoArchivoReporte,consolidadosresumensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesConsolidadosResumens(sAccionBusqueda,sTipoArchivoReporte,consolidadosresumensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteConsolidadosResumens(String sAccionBusqueda,String sTipoArchivoReporte,List<ConsolidadosResumen> consolidadosresumensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consolidadosresumen";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConsolidadosResumens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConsolidadosResumen("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ConsolidadosResumen consolidadosresumen : consolidadosresumensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ConsolidadosResumenConstantesFunciones.generarExcelReporteDataConsolidadosResumen("NORMAL",row,workbook,consolidadosresumen,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consolidados Resumen",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderConsolidadosResumen(String sTipo,Row row,Workbook workbook) {
		
		ConsolidadosResumenConstantesFunciones.generarExcelReporteHeaderConsolidadosResumen(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalConsolidadosResumens(String sAccionBusqueda,String sTipoArchivoReporte,List<ConsolidadosResumen> consolidadosresumensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consolidadosresumen_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConsolidadosResumens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ConsolidadosResumen consolidadosresumen : consolidadosresumensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ConsolidadosResumenConstantesFunciones.getConsolidadosResumenDescripcion(consolidadosresumen));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosResumenConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosresumen.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosResumenConstantesFunciones.LABEL_NOMBREEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_NOMBREEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosresumen.getnombre_empresa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosresumen.getnombre_sucursal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosResumenConstantesFunciones.LABEL_CODIGOSUBGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_CODIGOSUBGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosresumen.getcodigo_sub_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUBGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUBGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosresumen.getnombre_sub_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosResumenConstantesFunciones.LABEL_CODIGODETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosresumen.getcodigo_detalle_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosResumenConstantesFunciones.LABEL_NOMBREDETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosresumen.getnombre_detalle_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosResumenConstantesFunciones.LABEL_CLAVE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_CLAVE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosresumen.getclave());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosresumen.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosResumenConstantesFunciones.LABEL_FECHACOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_FECHACOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosresumen.getfecha_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosResumenConstantesFunciones.LABEL_VIDAUTIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_VIDAUTIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosresumen.getvida_util());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosResumenConstantesFunciones.LABEL_COSTODECOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_COSTODECOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosresumen.getcosto_de_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosResumenConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosresumen.getcantidad());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consolidados Resumen",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesConsolidadosResumens(String sAccionBusqueda,String sTipoArchivoReporte,List<ConsolidadosResumen> consolidadosresumensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ConsolidadosResumen> consolidadosresumensRespaldo=null;
		
		classes=ConsolidadosResumenConstantesFunciones.getClassesRelationshipsOfConsolidadosResumen(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.consolidadosresumenLogic.setDatosCliente(this.datosCliente);
		this.consolidadosresumenLogic.setDatosDeep(this.datosDeep);
		this.consolidadosresumenLogic.setIsConDeep(true);
		
		consolidadosresumensRespaldo=this.consolidadosresumenLogic.getConsolidadosResumens();
		
		this.consolidadosresumenLogic.setConsolidadosResumens(consolidadosresumensParaReportes);	
		this.consolidadosresumenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		consolidadosresumensParaReportes=this.consolidadosresumenLogic.getConsolidadosResumens();
		this.consolidadosresumenLogic.setConsolidadosResumens(consolidadosresumensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consolidadosresumen_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConsolidadosResumens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConsolidadosResumen("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ConsolidadosResumen consolidadosresumen : consolidadosresumensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderConsolidadosResumen("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ConsolidadosResumenConstantesFunciones.generarExcelReporteDataConsolidadosResumen("NORMAL",row,workbook,consolidadosresumen,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ConsolidadosResumenConstantesFunciones.getConsolidadosResumenDescripcion(consolidadosresumen));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consolidados Resumen",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessConsolidadosResumen() throws Exception {		
		this.startProcessConsolidadosResumen(true);
	}
	
	public void startProcessConsolidadosResumen(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasConsolidadosResumen ,this.jPanelParametrosReportesConsolidadosResumen, this.jScrollPanelDatosConsolidadosResumen,this.jPanelPaginacionConsolidadosResumen, this.jScrollPanelDatosEdicionConsolidadosResumen, this.jPanelAccionesConsolidadosResumen,this.jPanelAccionesFormularioConsolidadosResumen,this.jmenuBarConsolidadosResumen,this.jmenuBarDetalleConsolidadosResumen,this.jTtoolBarConsolidadosResumen,this.jTtoolBarDetalleConsolidadosResumen);		
		
		final JTabbedPane jTabbedPaneBusquedasConsolidadosResumen=this.jTabbedPaneBusquedasConsolidadosResumen; 
		
		final JPanel jPanelParametrosReportesConsolidadosResumen=this.jPanelParametrosReportesConsolidadosResumen;
		//final JScrollPane jScrollPanelDatosConsolidadosResumen=this.jScrollPanelDatosConsolidadosResumen;
		final JTable jTableDatosConsolidadosResumen=this.jTableDatosConsolidadosResumen;		
		final JPanel jPanelPaginacionConsolidadosResumen=this.jPanelPaginacionConsolidadosResumen;
		//final JScrollPane jScrollPanelDatosEdicionConsolidadosResumen=this.jScrollPanelDatosEdicionConsolidadosResumen;
		final JPanel jPanelAccionesConsolidadosResumen=this.jPanelAccionesConsolidadosResumen;
		
		JPanel jPanelCamposAuxiliarConsolidadosResumen=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarConsolidadosResumen=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
			jPanelCamposAuxiliarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jPanelCamposConsolidadosResumen;
			jPanelAccionesFormularioAuxiliarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jPanelAccionesFormularioConsolidadosResumen;
		}
		
		final JPanel jPanelCamposConsolidadosResumen=jPanelCamposAuxiliarConsolidadosResumen;
		final JPanel jPanelAccionesFormularioConsolidadosResumen=jPanelAccionesFormularioAuxiliarConsolidadosResumen;
		
		
		final JMenuBar jmenuBarConsolidadosResumen=this.jmenuBarConsolidadosResumen;
		final JToolBar jTtoolBarConsolidadosResumen=this.jTtoolBarConsolidadosResumen;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarConsolidadosResumen=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConsolidadosResumen=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
			jmenuBarDetalleAuxiliarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jmenuBarDetalleConsolidadosResumen;
			jTtoolBarDetalleAuxiliarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jTtoolBarDetalleConsolidadosResumen;
		}
		
		final JMenuBar jmenuBarDetalleConsolidadosResumen=jmenuBarDetalleAuxiliarConsolidadosResumen;
		final JToolBar jTtoolBarDetalleConsolidadosResumen=jTtoolBarDetalleAuxiliarConsolidadosResumen;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConsolidadosResumen;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConsolidadosResumen;
			processRunnable.jTableDatos=jTableDatosConsolidadosResumen;
			processRunnable.jPanelCampos=jPanelCamposConsolidadosResumen;
			processRunnable.jPanelPaginacion=jPanelPaginacionConsolidadosResumen;
			processRunnable.jPanelAcciones=jPanelAccionesConsolidadosResumen;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConsolidadosResumen;
			
			
			processRunnable.jmenuBar=jmenuBarConsolidadosResumen;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConsolidadosResumen;
			processRunnable.jTtoolBar=jTtoolBarConsolidadosResumen;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConsolidadosResumen;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConsolidadosResumen ,jPanelParametrosReportesConsolidadosResumen,jTableDatosConsolidadosResumen, /*jScrollPanelDatosConsolidadosResumen,*/jPanelCamposConsolidadosResumen,jPanelPaginacionConsolidadosResumen, /*jScrollPanelDatosEdicionConsolidadosResumen,*/ jPanelAccionesConsolidadosResumen,jPanelAccionesFormularioConsolidadosResumen,jmenuBarConsolidadosResumen,jmenuBarDetalleConsolidadosResumen,jTtoolBarConsolidadosResumen,jTtoolBarDetalleConsolidadosResumen);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConsolidadosResumen ,jPanelParametrosReportesConsolidadosResumen, jScrollPanelDatosConsolidadosResumen,jPanelPaginacionConsolidadosResumen, jScrollPanelDatosEdicionConsolidadosResumen, jPanelAccionesConsolidadosResumen,jPanelAccionesFormularioConsolidadosResumen,jmenuBarConsolidadosResumen,jmenuBarDetalleConsolidadosResumen,jTtoolBarConsolidadosResumen,jTtoolBarDetalleConsolidadosResumen);
						
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
	
	public void finishProcessConsolidadosResumen() {// throws Exception 
		this.finishProcessConsolidadosResumen(true);
	}
	
	public void finishProcessConsolidadosResumen(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasConsolidadosResumen ,this.jPanelParametrosReportesConsolidadosResumen, this.jScrollPanelDatosConsolidadosResumen,this.jPanelPaginacionConsolidadosResumen, this.jScrollPanelDatosEdicionConsolidadosResumen, this.jPanelAccionesConsolidadosResumen,this.jPanelAccionesFormularioConsolidadosResumen,this.jmenuBarConsolidadosResumen,this.jmenuBarDetalleConsolidadosResumen,this.jTtoolBarConsolidadosResumen,this.jTtoolBarDetalleConsolidadosResumen);		
		
		final JTabbedPane jTabbedPaneBusquedasConsolidadosResumen=this.jTabbedPaneBusquedasConsolidadosResumen; 
		
		final JPanel jPanelParametrosReportesConsolidadosResumen=this.jPanelParametrosReportesConsolidadosResumen;
		//final JScrollPane jScrollPanelDatosConsolidadosResumen=this.jScrollPanelDatosConsolidadosResumen;
		final JTable jTableDatosConsolidadosResumen=this.jTableDatosConsolidadosResumen;		
		final JPanel jPanelPaginacionConsolidadosResumen=this.jPanelPaginacionConsolidadosResumen;
		//final JScrollPane jScrollPanelDatosEdicionConsolidadosResumen=this.jScrollPanelDatosEdicionConsolidadosResumen;
		final JPanel jPanelAccionesConsolidadosResumen=this.jPanelAccionesConsolidadosResumen;
		
		JPanel jPanelCamposAuxiliarConsolidadosResumen=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarConsolidadosResumen=new JPanel();
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
			jPanelCamposAuxiliarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jPanelCamposConsolidadosResumen;
			jPanelAccionesFormularioAuxiliarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jPanelAccionesFormularioConsolidadosResumen;
		}
		
		final JPanel jPanelCamposConsolidadosResumen=jPanelCamposAuxiliarConsolidadosResumen;
		final JPanel jPanelAccionesFormularioConsolidadosResumen=jPanelAccionesFormularioAuxiliarConsolidadosResumen;
		
		
		final JMenuBar jmenuBarConsolidadosResumen=this.jmenuBarConsolidadosResumen;		
		final JToolBar jTtoolBarConsolidadosResumen=this.jTtoolBarConsolidadosResumen;
				
		JMenuBar jmenuBarDetalleAuxiliarConsolidadosResumen=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConsolidadosResumen=new JToolBar();
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
			jmenuBarDetalleAuxiliarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jmenuBarDetalleConsolidadosResumen;
			jTtoolBarDetalleAuxiliarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jTtoolBarDetalleConsolidadosResumen;		
		}
		
		final JMenuBar jmenuBarDetalleConsolidadosResumen=jmenuBarDetalleAuxiliarConsolidadosResumen;
		final JToolBar jTtoolBarDetalleConsolidadosResumen=jTtoolBarDetalleAuxiliarConsolidadosResumen;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConsolidadosResumen;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConsolidadosResumen;
			processRunnable.jTableDatos=jTableDatosConsolidadosResumen;
			processRunnable.jPanelCampos=jPanelCamposConsolidadosResumen;
			processRunnable.jPanelPaginacion=jPanelPaginacionConsolidadosResumen;
			processRunnable.jPanelAcciones=jPanelAccionesConsolidadosResumen;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConsolidadosResumen;
			
			
			processRunnable.jmenuBar=jmenuBarConsolidadosResumen;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConsolidadosResumen;
			processRunnable.jTtoolBar=jTtoolBarConsolidadosResumen;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConsolidadosResumen;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasConsolidadosResumen ,jPanelParametrosReportesConsolidadosResumen, jTableDatosConsolidadosResumen,/*jScrollPanelDatosConsolidadosResumen,*/jPanelCamposConsolidadosResumen,jPanelPaginacionConsolidadosResumen, /*jScrollPanelDatosEdicionConsolidadosResumen,*/ jPanelAccionesConsolidadosResumen,jPanelAccionesFormularioConsolidadosResumen,jmenuBarConsolidadosResumen,jmenuBarDetalleConsolidadosResumen,jTtoolBarConsolidadosResumen,jTtoolBarDetalleConsolidadosResumen));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesConsolidadosResumen(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarConsolidadosResumen(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuConsolidadosResumen(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarConsolidadosResumen(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarConsolidadosResumen,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleConsolidadosResumen,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuConsolidadosResumen(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarConsolidadosResumen,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleConsolidadosResumen,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.consolidadosresumenConstantesFunciones.getsFinalQueryConsolidadosResumen();
		String  finalQueryPaginacionTodos=this.consolidadosresumenConstantesFunciones.getsFinalQueryConsolidadosResumen();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ConsolidadosResumenConstantesFunciones.getArrayColumnasGlobalesNoConsolidadosResumen(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ConsolidadosResumenConstantesFunciones.getArrayColumnasGlobalesConsolidadosResumen(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ConsolidadosResumenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.consolidadosresumensEliminados= new ArrayList<ConsolidadosResumen>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessConsolidadosResumen();
		
				///*ConsolidadosResumenSessionBean*/this.consolidadosresumenSessionBean=new ConsolidadosResumenSessionBean();
			
			if(this.consolidadosresumenSessionBean==null) {
				this.consolidadosresumenSessionBean=new ConsolidadosResumenSessionBean();
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
					this.iNumeroPaginacion=ConsolidadosResumenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ConsolidadosResumenConstantesFunciones.getClassesForeignKeysOfConsolidadosResumen(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/consolidadosresumen."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			consolidadosresumensAux= new ArrayList<ConsolidadosResumen>();
			
				
			consolidadosresumenLogic.setDatosCliente(this.datosCliente);
			consolidadosresumenLogic.setDatosDeep(this.datosDeep);
			consolidadosresumenLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaConsolidadosResumen")) {
				this.sDetalleReporte=ConsolidadosResumenConstantesFunciones.getDetalleIndiceBusquedaConsolidadosResumen(idBusquedaConsolidadosResumen);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					consolidadosresumenLogic.getConsolidadosResumensBusquedaConsolidadosResumen(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaConsolidadosResumen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConsolidadosResumenConstantesFunciones.getDetalleIndiceBusquedaConsolidadosResumen(idBusquedaConsolidadosResumen);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConsolidadosResumenConstantesFunciones.getDetalleIndiceBusquedaConsolidadosResumen(idBusquedaConsolidadosResumen);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=consolidadosresumenLogic.getConsolidadosResumens()==null||consolidadosresumenLogic.getConsolidadosResumens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=consolidadosresumens==null|| consolidadosresumens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						consolidadosresumensAux=new ArrayList<ConsolidadosResumen>();
						consolidadosresumensAux.addAll(consolidadosresumenLogic.getConsolidadosResumens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consolidadosresumensAux=new ArrayList<ConsolidadosResumen>();
							consolidadosresumensAux.addAll(consolidadosresumens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							consolidadosresumenLogic.getConsolidadosResumensBusquedaConsolidadosResumen(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaConsolidadosResumen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConsolidadosResumenConstantesFunciones.getDetalleIndiceBusquedaConsolidadosResumen(idBusquedaConsolidadosResumen);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConsolidadosResumenConstantesFunciones.getDetalleIndiceBusquedaConsolidadosResumen(idBusquedaConsolidadosResumen);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConsolidadosResumens("BusquedaConsolidadosResumen",consolidadosresumenLogic.getConsolidadosResumens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConsolidadosResumens("BusquedaConsolidadosResumen",consolidadosresumens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						consolidadosresumenLogic.setConsolidadosResumens(new ArrayList<ConsolidadosResumen>());
						consolidadosresumenLogic.getConsolidadosResumens().addAll(consolidadosresumensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consolidadosresumens=new ArrayList<ConsolidadosResumen>();
							consolidadosresumens.addAll(consolidadosresumensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesConsolidadosResumen();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessConsolidadosResumen();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=consolidadosresumenLogic.getConsolidadosResumens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consolidadosresumens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=consolidadosresumenLogic.getConsolidadosResumens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consolidadosresumens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ConsolidadosResumen consolidadosresumen) {
		Boolean permite=true;
		
		if(this.consolidadosresumen.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ConsolidadosResumenConstantesFunciones.getOrderByListaConsolidadosResumen();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ConsolidadosResumenConstantesFunciones.getOrderByListaConsolidadosResumen();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsolidadosResumen consolidadosresumen:consolidadosresumenLogic.getConsolidadosResumens()) {
				if(consolidadosresumen.getsType().equals(Constantes2.S_TOTALES)) {
					consolidadosresumenTotales=consolidadosresumen;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsolidadosResumen consolidadosresumen:this.consolidadosresumens) {
				if(consolidadosresumen.getsType().equals(Constantes2.S_TOTALES)) {
					consolidadosresumenTotales=consolidadosresumen;
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
			this.consolidadosresumenAux=new ConsolidadosResumen();
			this.consolidadosresumenAux.setsType(Constantes2.S_TOTALES);
			this.consolidadosresumenAux.setIsNew(false);
			this.consolidadosresumenAux.setIsChanged(false);
			this.consolidadosresumenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ConsolidadosResumenConstantesFunciones.TotalizarValoresFilaConsolidadosResumen(this.consolidadosresumenLogic.getConsolidadosResumens(),this.consolidadosresumenAux);
				
				//this.consolidadosresumenLogic.getConsolidadosResumens().add(this.consolidadosresumenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ConsolidadosResumenConstantesFunciones.TotalizarValoresFilaConsolidadosResumen(this.consolidadosresumens,this.consolidadosresumenAux);
				
				this.consolidadosresumens.add(this.consolidadosresumenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		consolidadosresumenTotales=new ConsolidadosResumen();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.consolidadosresumenLogic.getConsolidadosResumens().remove(consolidadosresumenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.consolidadosresumens.remove(consolidadosresumenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		consolidadosresumenTotales=new ConsolidadosResumen();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsolidadosResumen consolidadosresumen:consolidadosresumenLogic.getConsolidadosResumens()) {
				if(consolidadosresumen.getsType().equals(Constantes2.S_TOTALES)) {
					consolidadosresumenTotales=consolidadosresumen;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConsolidadosResumenConstantesFunciones.TotalizarValoresFilaConsolidadosResumen(this.consolidadosresumenLogic.getConsolidadosResumens(),consolidadosresumenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsolidadosResumen consolidadosresumen:this.consolidadosresumens) {
				if(consolidadosresumen.getsType().equals(Constantes2.S_TOTALES)) {
					consolidadosresumenTotales=consolidadosresumen;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConsolidadosResumenConstantesFunciones.TotalizarValoresFilaConsolidadosResumen(this.consolidadosresumens,consolidadosresumenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getConsolidadosResumensBusquedaConsolidadosResumen()throws Exception {
		try {
			sAccionBusqueda="BusquedaConsolidadosResumen";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConsolidadosResumensFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getConsolidadosResumensBusquedaConsolidadosResumen(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consolidadosresumenLogic.getConsolidadosResumensBusquedaConsolidadosResumen(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConsolidadosResumensFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consolidadosresumenLogic.getConsolidadosResumensFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosConsolidadosResumen() {
		this.isPermisoTodoConsolidadosResumen=false;
		this.isPermisoNuevoConsolidadosResumen=false;
		this.isPermisoActualizarConsolidadosResumen=false;
		this.isPermisoActualizarOriginalConsolidadosResumen=false;
		this.isPermisoEliminarConsolidadosResumen=false;
		this.isPermisoGuardarCambiosConsolidadosResumen=false;
		this.isPermisoConsultaConsolidadosResumen=true;
		this.isPermisoBusquedaConsolidadosResumen=true;
		this.isPermisoReporteConsolidadosResumen=true;
		this.isPermisoOrdenConsolidadosResumen=false;		
		this.isPermisoPaginacionMedioConsolidadosResumen=false;		
		this.isPermisoPaginacionAltoConsolidadosResumen=false;		
		this.isPermisoPaginacionTodoConsolidadosResumen=false;		
		this.isPermisoCopiarConsolidadosResumen=false;		
		this.isPermisoVerFormConsolidadosResumen=false;		
		this.isPermisoDuplicarConsolidadosResumen=false;
		this.isPermisoOrdenConsolidadosResumen=false;
	}
	
	public void setPermisosUsuarioConsolidadosResumen(Boolean isPermiso) {
		this.isPermisoTodoConsolidadosResumen=isPermiso;
		this.isPermisoNuevoConsolidadosResumen=isPermiso;
		this.isPermisoActualizarConsolidadosResumen=isPermiso;
		this.isPermisoActualizarOriginalConsolidadosResumen=isPermiso;
		this.isPermisoEliminarConsolidadosResumen=isPermiso;
		this.isPermisoGuardarCambiosConsolidadosResumen=isPermiso;
		this.isPermisoConsultaConsolidadosResumen=isPermiso;
		this.isPermisoBusquedaConsolidadosResumen=isPermiso;
		this.isPermisoReporteConsolidadosResumen=isPermiso;
		this.isPermisoOrdenConsolidadosResumen=isPermiso;		
		this.isPermisoPaginacionMedioConsolidadosResumen=isPermiso;		
		this.isPermisoPaginacionAltoConsolidadosResumen=isPermiso;		
		this.isPermisoPaginacionTodoConsolidadosResumen=isPermiso;		
		this.isPermisoCopiarConsolidadosResumen=isPermiso;		
		this.isPermisoVerFormConsolidadosResumen=isPermiso;		
		this.isPermisoDuplicarConsolidadosResumen=isPermiso;
		this.isPermisoOrdenConsolidadosResumen=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioConsolidadosResumen(Boolean isPermiso) {
		//this.isPermisoTodoConsolidadosResumen=isPermiso;
		this.isPermisoNuevoConsolidadosResumen=isPermiso;
		this.isPermisoActualizarConsolidadosResumen=isPermiso;
		this.isPermisoActualizarOriginalConsolidadosResumen=isPermiso;
		this.isPermisoEliminarConsolidadosResumen=isPermiso;
		this.isPermisoGuardarCambiosConsolidadosResumen=isPermiso;
		//this.isPermisoConsultaConsolidadosResumen=isPermiso;
		//this.isPermisoBusquedaConsolidadosResumen=isPermiso;
		//this.isPermisoReporteConsolidadosResumen=isPermiso;
		//this.isPermisoOrdenConsolidadosResumen=isPermiso;		
		//this.isPermisoPaginacionMedioConsolidadosResumen=isPermiso;		
		//this.isPermisoPaginacionAltoConsolidadosResumen=isPermiso;		
		//this.isPermisoPaginacionTodoConsolidadosResumen=isPermiso;		
		//this.isPermisoCopiarConsolidadosResumen=isPermiso;		
		//this.isPermisoDuplicarConsolidadosResumen=isPermiso;
		//this.isPermisoOrdenConsolidadosResumen=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioConsolidadosResumenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ConsolidadosResumenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebConsolidadosResumen(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioConsolidadosResumenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioConsolidadosResumenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionConsolidadosResumenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioConsolidadosResumenClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioConsolidadosResumen() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ConsolidadosResumenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ConsolidadosResumenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoConsolidadosResumen=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarConsolidadosResumen=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalConsolidadosResumen=this.isPermisoActualizarConsolidadosResumen;
			this.isPermisoEliminarConsolidadosResumen=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosConsolidadosResumen=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaConsolidadosResumen=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaConsolidadosResumen=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoConsolidadosResumen=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteConsolidadosResumen=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConsolidadosResumen=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioConsolidadosResumen=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoConsolidadosResumen=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoConsolidadosResumen=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarConsolidadosResumen=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormConsolidadosResumen=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarConsolidadosResumen=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConsolidadosResumen=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosConsolidadosResumen.setToolTipText(this.jTableDatosConsolidadosResumen.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioConsolidadosResumen(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioConsolidadosResumen(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ConsolidadosResumenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ConsolidadosResumenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioConsolidadosResumen() throws Exception {
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
	public void inicializarCombosForeignKeyConsolidadosResumenListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyConsolidadosResumenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ConsolidadosResumenJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyConsolidadosResumen()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.consolidadosresumenSessionBean==null) {
				this.consolidadosresumenSessionBean=new ConsolidadosResumenSessionBean();
			}

			if(!this.consolidadosresumenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyConsolidadosResumen()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyConsolidadosResumen(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyConsolidadosResumen()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyConsolidadosResumen();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyConsolidadosResumen(ConsolidadosResumen consolidadosresumen)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyConsolidadosResumen(ConsolidadosResumen consolidadosresumen,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyConsolidadosResumen()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyConsolidadosResumen()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyConsolidadosResumen()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyConsolidadosResumen()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroConsolidadosResumen()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyConsolidadosResumen()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyConsolidadosResumen(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyConsolidadosResumen()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxid_empresaConsolidadosResumen!=null && this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxid_empresaConsolidadosResumen.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxid_empresaConsolidadosResumen.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ConsolidadosResumenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ConsolidadosResumenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ConsolidadosResumenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.consolidadosresumenSessionBean=new ConsolidadosResumenSessionBean(); 
		this.consolidadosresumenConstantesFunciones=new ConsolidadosResumenConstantesFunciones(); 
		this.consolidadosresumenBean=new ConsolidadosResumen();//(this.consolidadosresumenConstantesFunciones); 		
		this.consolidadosresumenReturnGeneral=new ConsolidadosResumenParameterReturnGeneral(); 
		
		this.consolidadosresumenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consolidadosresumenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ConsolidadosResumenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ConsolidadosResumenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ConsolidadosResumenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessConsolidadosResumen(true);
			
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
			
			this.consolidadosresumenConstantesFunciones=new ConsolidadosResumenConstantesFunciones(); 
			this.consolidadosresumenBean=new ConsolidadosResumen();//this.consolidadosresumenConstantesFunciones); 			
			this.consolidadosresumenReturnGeneral=new ConsolidadosResumenParameterReturnGeneral(); 
		
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Consolidados Resumen Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.consolidadosresumen=new ConsolidadosResumen();
			this.consolidadosresumens = new ArrayList<ConsolidadosResumen>();
			this.consolidadosresumensAux = new ArrayList<ConsolidadosResumen>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic=new ConsolidadosResumenLogic();
				this.consolidadosresumenLogic.getNewConnexionToDeep("");
			}
			
			//this.consolidadosresumenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.consolidadosresumenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormConsolidadosResumen);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoConsolidadosResumen!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConsolidadosResumen);	
					}
					
					if(this.jInternalFrameImportacionConsolidadosResumen!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConsolidadosResumen);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByConsolidadosResumen!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByConsolidadosResumen);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormConsolidadosResumen);
				this.jInternalFrameDetalleFormConsolidadosResumen.setVisible(false);
				this.jInternalFrameDetalleFormConsolidadosResumen.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoConsolidadosResumen!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConsolidadosResumen);
					this.jInternalFrameReporteDinamicoConsolidadosResumen.setVisible(false);
					this.jInternalFrameReporteDinamicoConsolidadosResumen.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionConsolidadosResumen!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionConsolidadosResumen);
					this.jInternalFrameImportacionConsolidadosResumen.setVisible(false);
					this.jInternalFrameImportacionConsolidadosResumen.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByConsolidadosResumen!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByConsolidadosResumen);
					this.jInternalFrameOrderByConsolidadosResumen.setVisible(false);
					this.jInternalFrameOrderByConsolidadosResumen.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idConsolidadosResumenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ConsolidadosResumenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.consolidadosresumenReturnGeneral=new ConsolidadosResumenParameterReturnGeneral();
			
			this.consolidadosresumenParameterGeneral=new ConsolidadosResumenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.consolidadosresumenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ConsolidadosResumenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConsolidadosResumenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.consolidadosresumenSessionBean.getEsGuardarRelacionado(),this.consolidadosresumenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConsolidadosResumenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.consolidadosresumenSessionBean.getEsGuardarRelacionado(),this.consolidadosresumenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoConsolidadosResumen=false;
			this.isVisibilidadCeldaDuplicarConsolidadosResumen=true;
			this.isVisibilidadCeldaCopiarConsolidadosResumen=true;
			this.isVisibilidadCeldaVerFormConsolidadosResumen=true;
			this.isVisibilidadCeldaOrdenConsolidadosResumen=true;
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen=false;
			this.isVisibilidadCeldaModificarConsolidadosResumen=false;
			this.isVisibilidadCeldaActualizarConsolidadosResumen=false;
			this.isVisibilidadCeldaEliminarConsolidadosResumen=false;
			this.isVisibilidadCeldaCancelarConsolidadosResumen=false;
			this.isVisibilidadCeldaGuardarConsolidadosResumen=false;
			this.isVisibilidadCeldaGuardarCambiosConsolidadosResumen=false;
			
			
			this.isVisibilidadBusquedaConsolidadosResumen=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesConsolidadosResumen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosConsolidadosResumen();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioConsolidadosResumen(false);
			
			this.setPermisosUsuarioConsolidadosResumen();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado() 
				|| (this.consolidadosresumenSessionBean.getEsGuardarRelacionado() && this.consolidadosresumenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioConsolidadosResumenClasesRelacionadas();
			}
			
			if(this.consolidadosresumenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioConsolidadosResumenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosConsolidadosResumen();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualConsolidadosResumen();
			}
			
			if(!this.isPermisoBusquedaConsolidadosResumen) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasConsolidadosResumen.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ConsolidadosResumenConstantesFunciones.getTiposSeleccionarConsolidadosResumen());
				
				this.tiposColumnasSelect=ConsolidadosResumenConstantesFunciones.getTiposSeleccionarConsolidadosResumen(true);
				
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
			//if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioConsolidadosResumen();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioConsolidadosResumen(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioConsolidadosResumen(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesConsolidadosResumen() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				consolidadosresumenImplementable= (ConsolidadosResumenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConsolidadosResumenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				consolidadosresumenImplementableHome= (ConsolidadosResumenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConsolidadosResumenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.consolidadosresumens= new ArrayList<ConsolidadosResumen>();
			this.consolidadosresumensEliminados= new ArrayList<ConsolidadosResumen>();
						
			this.isEsNuevoConsolidadosResumen=false;
			this.esParaAccionDesdeFormularioConsolidadosResumen=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyConsolidadosResumen(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroConsolidadosResumen();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ConsolidadosResumenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesConsolidadosResumen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingConsolidadosResumen(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioConsolidadosResumen();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioConsolidadosResumen();
			}
			
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasConsolidadosResumen.getTabCount(); i++) {
					this.jTabbedPaneBusquedasConsolidadosResumen.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasConsolidadosResumen.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessConsolidadosResumen(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ConsolidadosResumen: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectConsolidadosResumen() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesConsolidadosResumen")) {
				iIndex=this.jInternalFrameDetalleFormConsolidadosResumen.jTabbedPaneRelacionesConsolidadosResumen.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormConsolidadosResumen.jTabbedPaneRelacionesConsolidadosResumen.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessConsolidadosResumen();	
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
	
	public void cargarCombosForeignKeyConsolidadosResumen(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyConsolidadosResumen(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyConsolidadosResumen(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyConsolidadosResumenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyConsolidadosResumen();
		
		this.cargarCombosFrameForeignKeyConsolidadosResumen();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyConsolidadosResumen();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyConsolidadosResumen();
		}
	}
	
	
	
	public void jButtonNuevoConsolidadosResumenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.consolidadosresumenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormConsolidadosResumen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
			
			
			if(jTableDatosConsolidadosResumen.getRowCount()>=1) {
				jTableDatosConsolidadosResumen.removeRowSelectionInterval(0, jTableDatosConsolidadosResumen.getRowCount()-1);						
			}
			
			this.isEsNuevoConsolidadosResumen=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoConsolidadosResumen(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesConsolidadosResumen(true);			
			//this.consolidadosresumen=new ConsolidadosResumen();
			//this.consolidadosresumen.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConsolidadosResumen(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsolidadosResumen() ;
			
			if(ConsolidadosResumenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConsolidadosResumen(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.consolidadosresumen);	
			this.actualizarInformacion("INFO_PADRE",false,this.consolidadosresumen);				
			
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
			
			if(this.consolidadosresumenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ConsolidadosResumen: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarConsolidadosResumenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ConsolidadosResumen> consolidadosresumensSeleccionados=new ArrayList<ConsolidadosResumen>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosConsolidadosResumen.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosConsolidadosResumen.getSelectedRows().length;			
			}
			
			consolidadosresumensSeleccionados=this.getConsolidadosResumensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoConsolidadosResumen--;			
				//ConsolidadosResumen consolidadosresumenAux= new ConsolidadosResumen();			
				//consolidadosresumenAux.setId(this.iIdNuevoConsolidadosResumen);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ConsolidadosResumen consolidadosresumenOrigen=new ConsolidadosResumen();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ConsolidadosResumen consolidadosresumenOrigen : consolidadosresumensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							consolidadosresumenOrigen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consolidadosresumenOrigen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaConsolidadosResumen();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.consolidadosresumen.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosConsolidadosResumen(consolidadosresumenOrigen,this.consolidadosresumen,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.consolidadosresumenLogic.getConsolidadosResumens().add(this.consolidadosresumenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.consolidadosresumens.add(this.consolidadosresumenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaConsolidadosResumen(false);
				
				this.jTableDatosConsolidadosResumen.setRowSelectionInterval(this.getIndiceNuevoConsolidadosResumen(), this.getIndiceNuevoConsolidadosResumen());
				
				int iLastRow =  this.jTableDatosConsolidadosResumen.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConsolidadosResumen.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConsolidadosResumen.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConsolidadosResumen(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ConsolidadosResumen> consolidadosresumensSeleccionados=new ArrayList<ConsolidadosResumen>();									
		
			ConsolidadosResumen consolidadosresumenOrigen=new ConsolidadosResumen();
			ConsolidadosResumen consolidadosresumenDestino=new ConsolidadosResumen();
				
			consolidadosresumensSeleccionados=this.getConsolidadosResumensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosConsolidadosResumen.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || consolidadosresumensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosConsolidadosResumen.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						consolidadosresumenOrigen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						consolidadosresumenOrigen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						consolidadosresumenDestino =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						consolidadosresumenDestino =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				consolidadosresumenOrigen =consolidadosresumensSeleccionados.get(0);
				consolidadosresumenDestino =consolidadosresumensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosConsolidadosResumen(consolidadosresumenOrigen,consolidadosresumenDestino,true,false);
				
				consolidadosresumenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(consolidadosresumenDestino,consolidadosresumenLogic.getConsolidadosResumens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(consolidadosresumenDestino,consolidadosresumens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaConsolidadosResumen(false);
				
				//this.jTableDatosConsolidadosResumen.setRowSelectionInterval(this.getIndiceNuevoConsolidadosResumen(), this.getIndiceNuevoConsolidadosResumen());
				
				int iLastRow =  this.jTableDatosConsolidadosResumen.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConsolidadosResumen.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConsolidadosResumen.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConsolidadosResumen(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConsolidadosResumen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormConsolidadosResumen.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesConsolidadosResumen.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasConsolidadosResumen.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesConsolidadosResumen.setVisible(!isVisible);
			this.jPanelPaginacionConsolidadosResumen.setVisible(!isVisible);
			this.jPanelAccionesConsolidadosResumen.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameConsolidadosResumen();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoConsolidadosResumen();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionConsolidadosResumen();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByConsolidadosResumen();
			
			this.abrirFrameOrderByConsolidadosResumen();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByConsolidadosResumen();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleConsolidadosResumen(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormConsolidadosResumen);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormConsolidadosResumen.isMaximum()) {
					this.jInternalFrameDetalleFormConsolidadosResumen.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormConsolidadosResumen.setSize(this.jInternalFrameDetalleFormConsolidadosResumen.iWidthFormulario,this.jInternalFrameDetalleFormConsolidadosResumen.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormConsolidadosResumen.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormConsolidadosResumen.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormConsolidadosResumen.isMaximum()) {
						this.jInternalFrameDetalleFormConsolidadosResumen.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormConsolidadosResumen.jContentPaneDetalleConsolidadosResumen.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormConsolidadosResumen.jTabbedPaneRelacionesConsolidadosResumen.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormConsolidadosResumen.jContentPaneDetalleConsolidadosResumen.getWidth(),ConsolidadosResumenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConsolidadosResumen.jTabbedPaneRelacionesConsolidadosResumen.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormConsolidadosResumen.jContentPaneDetalleConsolidadosResumen.getWidth(),ConsolidadosResumenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConsolidadosResumen.jTabbedPaneRelacionesConsolidadosResumen.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormConsolidadosResumen.jContentPaneDetalleConsolidadosResumen.getWidth(),ConsolidadosResumenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormConsolidadosResumen.setVisible(true);
	        this.jInternalFrameDetalleFormConsolidadosResumen.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByConsolidadosResumen() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByConsolidadosResumen==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByConsolidadosResumen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsolidadosResumen,false,this);
				} else {
					this.jInternalFrameOrderByConsolidadosResumen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsolidadosResumen,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByConsolidadosResumen);
				this.jInternalFrameOrderByConsolidadosResumen.setVisible(false);
				this.jInternalFrameOrderByConsolidadosResumen.setSelected(false);
				
				this.jInternalFrameOrderByConsolidadosResumen.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConsolidadosResumen"));
				
				this.inicializarActualizarBindingTablaOrderByConsolidadosResumen();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionConsolidadosResumen() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionConsolidadosResumen==null) {
				
				this.jInternalFrameImportacionConsolidadosResumen=new ImportacionJInternalFrame(ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConsolidadosResumen);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionConsolidadosResumen);
				this.jInternalFrameImportacionConsolidadosResumen.setVisible(false);
				this.jInternalFrameImportacionConsolidadosResumen.setSelected(false);


				this.jInternalFrameImportacionConsolidadosResumen.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConsolidadosResumen"));
				this.jInternalFrameImportacionConsolidadosResumen.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConsolidadosResumen"));
				this.jInternalFrameImportacionConsolidadosResumen.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConsolidadosResumen"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoConsolidadosResumen() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoConsolidadosResumen==null) {
				this.jInternalFrameReporteDinamicoConsolidadosResumen=new ReporteDinamicoJInternalFrame(ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConsolidadosResumen);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConsolidadosResumen);
				this.jInternalFrameReporteDinamicoConsolidadosResumen.setVisible(false);
				this.jInternalFrameReporteDinamicoConsolidadosResumen.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoConsolidadosResumen.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConsolidadosResumen"));
				this.jInternalFrameReporteDinamicoConsolidadosResumen.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConsolidadosResumen"));
				this.jInternalFrameReporteDinamicoConsolidadosResumen.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConsolidadosResumen"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConsolidadosResumen();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleConsolidadosResumen() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormConsolidadosResumen);
			
	       	this.jInternalFrameDetalleFormConsolidadosResumen.setVisible(false);
	        this.jInternalFrameDetalleFormConsolidadosResumen.setSelected(false);
			
			//this.jInternalFrameDetalleFormConsolidadosResumen.dispose();
			//this.jInternalFrameDetalleFormConsolidadosResumen=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoConsolidadosResumen() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoConsolidadosResumen.setVisible(true);
	        this.jInternalFrameReporteDinamicoConsolidadosResumen.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionConsolidadosResumen() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionConsolidadosResumen.setVisible(true);
	        this.jInternalFrameImportacionConsolidadosResumen.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByConsolidadosResumen() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByConsolidadosResumen.setVisible(true);
	        this.jInternalFrameOrderByConsolidadosResumen.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByConsolidadosResumen() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByConsolidadosResumen.setVisible(false);
	        this.jInternalFrameOrderByConsolidadosResumen.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoConsolidadosResumen() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoConsolidadosResumen.setVisible(false);
	        this.jInternalFrameReporteDinamicoConsolidadosResumen.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionConsolidadosResumen() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionConsolidadosResumen.setVisible(false);
	        this.jInternalFrameImportacionConsolidadosResumen.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarConsolidadosResumen(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarConsolidadosResumen(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesConsolidadosResumen(true);
			//this.isEsNuevoConsolidadosResumen=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesConsolidadosResumen("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConsolidadosResumen(false) ;
			
			if(consolidadosresumenSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ConsolidadosResumenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConsolidadosResumen(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsolidadosResumen(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaConsolidadosResumenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarConsolidadosResumen(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConsolidadosResumen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesConsolidadosResumen(true);
			//this.isEsNuevoConsolidadosResumen=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.consolidadosresumen.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesConsolidadosResumen("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesConsolidadosResumen(false) ;
			
			if(ConsolidadosResumenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConsolidadosResumen(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsolidadosResumen(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesConsolidadosResumen(false);
			
			//if(!this.isEsNuevoConsolidadosResumen) {								
				int intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.consolidadosresumen,true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
				
			}
			
			if(this.permiteMantenimiento(this.consolidadosresumen)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoConsolidadosResumen=true;
					this.inicializarActualizarBindingTablaConsolidadosResumen(false);
					this.isEsNuevoConsolidadosResumen=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoConsolidadosResumen=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoConsolidadosResumen=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConsolidadosResumen(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConsolidadosResumen(false);
				
				this.habilitarDeshabilitarControlesConsolidadosResumen(false);
			
												
				
				if(ConsolidadosResumenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleConsolidadosResumen();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoConsolidadosResumenActionPerformed(evt,consolidadosresumenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualConsolidadosResumen(this.consolidadosresumen,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosConsolidadosResumen.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,consolidadosresumenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.consolidadosresumen.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ConsolidadosResumen.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosResumen.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				this.consolidadosresumen.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				this.consolidadosresumen.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.consolidadosresumen)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ConsolidadosResumenModel) this.jTableDatosConsolidadosResumen.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoConsolidadosResumen=true;
				this.inicializarActualizarBindingTablaConsolidadosResumen(false);
				this.isEsNuevoConsolidadosResumen=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConsolidadosResumen(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConsolidadosResumen(false);
				
				this.habilitarDeshabilitarControlesConsolidadosResumen(false);
				
				
				
				if(ConsolidadosResumenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleConsolidadosResumen();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosConsolidadosResumen.getRowCount()>=1) {
				jTableDatosConsolidadosResumen.removeRowSelectionInterval(0, jTableDatosConsolidadosResumen.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesConsolidadosResumen(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaConsolidadosResumen(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConsolidadosResumen(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsolidadosResumen(false) ;
			
			this.isEsNuevoConsolidadosResumen=false;
			
			if(ConsolidadosResumenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleConsolidadosResumen();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingConsolidadosResumen(false);
				
				//SI ES MANUAL
				if(ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualConsolidadosResumen();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoConsolidadosResumen--;			
			//ConsolidadosResumen consolidadosresumenAux= new ConsolidadosResumen();			
			//consolidadosresumenAux.setId(this.iIdNuevoConsolidadosResumen);
			
			if(this.jInternalFrameDetalleFormConsolidadosResumen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaConsolidadosResumen();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
			
			this.consolidadosresumen.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.consolidadosresumenLogic.getConsolidadosResumens().add(this.consolidadosresumenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.consolidadosresumens.add(this.consolidadosresumenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaConsolidadosResumen(false);
			
			this.jTableDatosConsolidadosResumen.setRowSelectionInterval(this.getIndiceNuevoConsolidadosResumen(), this.getIndiceNuevoConsolidadosResumen());
			
			int iLastRow =  this.jTableDatosConsolidadosResumen.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosConsolidadosResumen.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosConsolidadosResumen.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaConsolidadosResumen(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingConsolidadosResumen(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsolidadosResumen(false);
			
			//SI ES MANUAL
			if(ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConsolidadosResumen();
			}
			
			//this.abrirFrameTreeConsolidadosResumen();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionConsolidadosResumen.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionConsolidadosResumen.setFileImportacion(this.jInternalFrameImportacionConsolidadosResumen.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionConsolidadosResumen.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionConsolidadosResumen.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionConsolidadosResumen.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionConsolidadosResumen.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ConsolidadosResumen> consolidadosresumensSeleccionados=new ArrayList<ConsolidadosResumen>();		

		consolidadosresumensSeleccionados=this.getConsolidadosResumensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ConsolidadosResumenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ConsolidadosResumenBaseDesign.jrxml";
			
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
			
			this.generarReporteConsolidadosResumens("Todos",consolidadosresumensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consolidados Resumen",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBREEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoSubGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoSubGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoSubGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoSubGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSubGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSubGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSubGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSubGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoDetalleGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoDetalleGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoDetalleGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoDetalleGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreDetalleGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreDetalleGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreDetalleGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreDetalleGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CLAVE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ave_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ave_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ave_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ave_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_FECHACOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_VIDAUTIL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_daUtil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_daUtil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_daUtil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_daUtil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_COSTODECOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoDeCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoDeCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoDeCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoDeCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoConsolidadosResumen.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBREEMPRESA:
					sNombreCampoCategoria="nombre_empresa";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoria="nombre_sucursal";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					sNombreCampoCategoria="codigo_sub_grupo";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					sNombreCampoCategoria="nombre_sub_grupo";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					sNombreCampoCategoria="codigo_detalle_grupo";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoria="nombre_detalle_grupo";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoria="clave";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoria="fecha_compra";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_VIDAUTIL:
					sNombreCampoCategoria="vida_util";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_COSTODECOMPRA:
					sNombreCampoCategoria="costo_de_compra";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBREEMPRESA:
					sNombreCampoCategoriaValor="nombre_empresa";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoriaValor="nombre_sucursal";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					sNombreCampoCategoriaValor="codigo_sub_grupo";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					sNombreCampoCategoriaValor="nombre_sub_grupo";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					sNombreCampoCategoriaValor="codigo_detalle_grupo";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoriaValor="nombre_detalle_grupo";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoriaValor="clave";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoriaValor="fecha_compra";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_VIDAUTIL:
					sNombreCampoCategoriaValor="vida_util";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_COSTODECOMPRA:
					sNombreCampoCategoriaValor="costo_de_compra";
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBREEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_empresa");
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sucursal");
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Sub Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_sub_grupo");
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sub Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sub_grupo");
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Detalle Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_detalle_grupo");
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Detalle Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_detalle_grupo");
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CLAVE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Clave",sNombreCampoCategoria,sNombreCampoCategoriaValor,"clave");
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_FECHACOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_compra");
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_VIDAUTIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Va Util",sNombreCampoCategoria,sNombreCampoCategoriaValor,"vida_util");
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_COSTODECOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_de_compra");
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
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
	
	public void jButtonGenerarExcelReporteDinamicoConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ConsolidadosResumen> consolidadosresumensSeleccionados=new ArrayList<ConsolidadosResumen>();		
		
		consolidadosresumensSeleccionados=this.getConsolidadosResumensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consolidadosresumen";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ConsolidadosResumens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ConsolidadosResumenConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ConsolidadosResumen consolidadosresumen:consolidadosresumensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosresumen.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBREEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_NOMBREEMPRESA);
					iRow++;

					for(ConsolidadosResumen consolidadosresumen:consolidadosresumensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosresumen.getnombre_empresa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUCURSAL);
					iRow++;

					for(ConsolidadosResumen consolidadosresumen:consolidadosresumensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosresumen.getnombre_sucursal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_CODIGOSUBGRUPO);
					iRow++;

					for(ConsolidadosResumen consolidadosresumen:consolidadosresumensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosresumen.getcodigo_sub_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUBGRUPO);
					iRow++;

					for(ConsolidadosResumen consolidadosresumen:consolidadosresumensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosresumen.getnombre_sub_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
					iRow++;

					for(ConsolidadosResumen consolidadosresumen:consolidadosresumensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosresumen.getcodigo_detalle_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
					iRow++;

					for(ConsolidadosResumen consolidadosresumen:consolidadosresumensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosresumen.getnombre_detalle_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CLAVE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_CLAVE);
					iRow++;

					for(ConsolidadosResumen consolidadosresumen:consolidadosresumensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosresumen.getclave());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ConsolidadosResumen consolidadosresumen:consolidadosresumensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosresumen.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_FECHACOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_FECHACOMPRA);
					iRow++;

					for(ConsolidadosResumen consolidadosresumen:consolidadosresumensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosresumen.getfecha_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_VIDAUTIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_VIDAUTIL);
					iRow++;

					for(ConsolidadosResumen consolidadosresumen:consolidadosresumensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosresumen.getvida_util());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_COSTODECOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_COSTODECOMPRA);
					iRow++;

					for(ConsolidadosResumen consolidadosresumen:consolidadosresumensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosresumen.getcosto_de_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosResumenConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ConsolidadosResumen consolidadosresumen:consolidadosresumensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosresumen.getcantidad());
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
			//	this.getFilaCabeceraExportarExcelConsolidadosResumen(row);				
			//	iRow++;
			//}				
			
			//for(ConsolidadosResumen consolidadosresumenAux:consolidadosresumensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelConsolidadosResumen(consolidadosresumenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consolidados Resumen",JOptionPane.INFORMATION_MESSAGE);
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
				this.consolidadosresumenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsolidadosResumen(false);
			
			//SI ES MANUAL
			if(ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConsolidadosResumen();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsolidadosResumen(false);
			
			//SI ES MANUAL
			if(ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConsolidadosResumen();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsolidadosResumen(false);
			
			//SI ES MANUAL
			if(ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConsolidadosResumen();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaConsolidadosResumen() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosConsolidadosResumen.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosConsolidadosResumen.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosConsolidadosResumen.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosConsolidadosResumen.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosConsolidadosResumen.setMinimumSize(dimensionMinimum);
		this.jTableDatosConsolidadosResumen.setMaximumSize(dimensionMaximum);
		this.jTableDatosConsolidadosResumen.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingConsolidadosResumen(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingConsolidadosResumen(esInicializar,true);
	}
	
	public void inicializarActualizarBindingConsolidadosResumen(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaConsolidadosResumen(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesConsolidadosResumen(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasConsolidadosResumen(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConsolidadosResumen(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesConsolidadosResumen(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualConsolidadosResumen() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaConsolidadosResumen();
		
		this.inicializarActualizarBindingBotonesManualConsolidadosResumen(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualConsolidadosResumen();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConsolidadosResumen() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualConsolidadosResumen(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualConsolidadosResumen(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosConsolidadosResumen.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosConsolidadosResumen.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteConsolidadosResumen.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormConsolidadosResumen.jCheckBoxPostAccionNuevoConsolidadosResumen.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormConsolidadosResumen.jCheckBoxPostAccionSinCerrarConsolidadosResumen.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormConsolidadosResumen.jCheckBoxPostAccionSinMensajeConsolidadosResumen.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosConsolidadosResumen.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosConsolidadosResumen.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteConsolidadosResumen.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
				this.jInternalFrameDetalleFormConsolidadosResumen.jCheckBoxPostAccionNuevoConsolidadosResumen.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormConsolidadosResumen.jCheckBoxPostAccionSinCerrarConsolidadosResumen.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormConsolidadosResumen.jCheckBoxPostAccionSinMensajeConsolidadosResumen.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionConsolidadosResumen.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionConsolidadosResumen.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxTiposAccionesFormularioConsolidadosResumen.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesConsolidadosResumen.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoConsolidadosResumen!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesConsolidadosResumen.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesConsolidadosResumen.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarConsolidadosResumen.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesConsolidadosResumen.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoConsolidadosResumen!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesConsolidadosResumen.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralConsolidadosResumen.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesConsolidadosResumen(Boolean esInicializar) throws Exception {
		try	{	
			if(ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualConsolidadosResumen(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesConsolidadosResumen() throws Exception {
		try	{
			if(ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualConsolidadosResumen();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConsolidadosResumen() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxTiposAccionesFormularioConsolidadosResumen.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxTiposAccionesFormularioConsolidadosResumen.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualConsolidadosResumen() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesConsolidadosResumen.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesConsolidadosResumen.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesConsolidadosResumen.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesConsolidadosResumen.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesConsolidadosResumen.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesConsolidadosResumen.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionConsolidadosResumen.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionConsolidadosResumen.addItem(reporte);
			}
			
			
			if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionConsolidadosResumen.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionConsolidadosResumen.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesConsolidadosResumen.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesConsolidadosResumen.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesConsolidadosResumen.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesConsolidadosResumen.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxTiposAccionesFormularioConsolidadosResumen.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxTiposAccionesFormularioConsolidadosResumen.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarConsolidadosResumen.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarConsolidadosResumen.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarConsolidadosResumen.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConsolidadosResumen();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConsolidadosResumen() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConsolidadosResumen!=null) {
				this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConsolidadosResumen!=null) {
				this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoConsolidadosResumen!=null) {
				
				if(this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ConsolidadosResumenConstantesFunciones.getTiposSeleccionarConsolidadosResumen(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ConsolidadosResumenConstantesFunciones.getTiposSeleccionarConsolidadosResumen(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ConsolidadosResumenConstantesFunciones.getTiposSeleccionarConsolidadosResumen(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConsolidadosResumen.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoConsolidadosResumen.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualConsolidadosResumen()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaConsolidadosResumen=Long.parseLong(this.jLabelidConsolidadosResumenBusquedaConsolidadosResumen.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasConsolidadosResumen(Boolean esInicializar) throws Exception {				
		if(ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualConsolidadosResumen();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaConsolidadosResumen() throws Exception {
		this.inicializarActualizarBindingTablaConsolidadosResumen(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByConsolidadosResumen() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByConsolidadosResumen.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByConsolidadosResumen.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConsolidadosResumen.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ConsolidadosResumenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByConsolidadosResumen.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConsolidadosResumen.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ConsolidadosResumenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosConsolidadosResumenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosResumenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ConsolidadosResumenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByConsolidadosResumen.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConsolidadosResumen.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ConsolidadosResumenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByConsolidadosResumen.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaConsolidadosResumen(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=consolidadosresumenLogic.getConsolidadosResumens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=consolidadosresumens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosConsolidadosResumen.setModel(new ConsolidadosResumenModel(this.consolidadosresumenLogic.getConsolidadosResumens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosConsolidadosResumen.setModel(new ConsolidadosResumenModel(this.consolidadosresumens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByConsolidadosResumen!=null && this.jInternalFrameOrderByConsolidadosResumen.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByConsolidadosResumen();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosConsolidadosResumen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosResumen,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ConsolidadosResumenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO,consolidadosresumenConstantesFunciones.resaltarSeleccionarConsolidadosResumen,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO,consolidadosresumenConstantesFunciones.resaltarSeleccionarConsolidadosResumen,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosConsolidadosResumen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosResumen,ConsolidadosResumenConstantesFunciones.LABEL_ID));

		if(this.consolidadosresumenConstantesFunciones.mostraridConsolidadosResumen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosResumenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.consolidadosresumenConstantesFunciones.resaltaridConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activaridConsolidadosResumen,iSizeTabla,this,true,"idConsolidadosResumen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosresumenConstantesFunciones.resaltaridConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activaridConsolidadosResumen,this,true,"idConsolidadosResumen","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosResumen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosResumen,ConsolidadosResumenConstantesFunciones.LABEL_NOMBREEMPRESA));

		if(this.consolidadosresumenConstantesFunciones.mostrarnombre_empresaConsolidadosResumen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosResumenConstantesFunciones.LABEL_NOMBREEMPRESA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consolidadosresumenConstantesFunciones.resaltarnombre_empresaConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarnombre_empresaConsolidadosResumen,iSizeTabla,this,true,"nombre_empresaConsolidadosResumen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosresumenConstantesFunciones.resaltarnombre_empresaConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarnombre_empresaConsolidadosResumen,this,true,"nombre_empresaConsolidadosResumen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsolidadosResumenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosResumen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosResumen,ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUCURSAL));

		if(this.consolidadosresumenConstantesFunciones.mostrarnombre_sucursalConsolidadosResumen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUCURSAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consolidadosresumenConstantesFunciones.resaltarnombre_sucursalConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarnombre_sucursalConsolidadosResumen,iSizeTabla,this,true,"nombre_sucursalConsolidadosResumen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosresumenConstantesFunciones.resaltarnombre_sucursalConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarnombre_sucursalConsolidadosResumen,this,true,"nombre_sucursalConsolidadosResumen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsolidadosResumenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosResumen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosResumen,ConsolidadosResumenConstantesFunciones.LABEL_CODIGOSUBGRUPO));

		if(this.consolidadosresumenConstantesFunciones.mostrarcodigo_sub_grupoConsolidadosResumen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosResumenConstantesFunciones.LABEL_CODIGOSUBGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consolidadosresumenConstantesFunciones.resaltarcodigo_sub_grupoConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarcodigo_sub_grupoConsolidadosResumen,iSizeTabla,this,true,"codigo_sub_grupoConsolidadosResumen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosresumenConstantesFunciones.resaltarcodigo_sub_grupoConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarcodigo_sub_grupoConsolidadosResumen,this,true,"codigo_sub_grupoConsolidadosResumen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsolidadosResumenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosResumen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosResumen,ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUBGRUPO));

		if(this.consolidadosresumenConstantesFunciones.mostrarnombre_sub_grupoConsolidadosResumen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUBGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consolidadosresumenConstantesFunciones.resaltarnombre_sub_grupoConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarnombre_sub_grupoConsolidadosResumen,iSizeTabla,this,true,"nombre_sub_grupoConsolidadosResumen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosresumenConstantesFunciones.resaltarnombre_sub_grupoConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarnombre_sub_grupoConsolidadosResumen,this,true,"nombre_sub_grupoConsolidadosResumen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsolidadosResumenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosResumen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosResumen,ConsolidadosResumenConstantesFunciones.LABEL_CODIGODETALLEGRUPO));

		if(this.consolidadosresumenConstantesFunciones.mostrarcodigo_detalle_grupoConsolidadosResumen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosResumenConstantesFunciones.LABEL_CODIGODETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consolidadosresumenConstantesFunciones.resaltarcodigo_detalle_grupoConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarcodigo_detalle_grupoConsolidadosResumen,iSizeTabla,this,true,"codigo_detalle_grupoConsolidadosResumen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosresumenConstantesFunciones.resaltarcodigo_detalle_grupoConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarcodigo_detalle_grupoConsolidadosResumen,this,true,"codigo_detalle_grupoConsolidadosResumen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsolidadosResumenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosResumen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosResumen,ConsolidadosResumenConstantesFunciones.LABEL_NOMBREDETALLEGRUPO));

		if(this.consolidadosresumenConstantesFunciones.mostrarnombre_detalle_grupoConsolidadosResumen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosResumenConstantesFunciones.LABEL_NOMBREDETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consolidadosresumenConstantesFunciones.resaltarnombre_detalle_grupoConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarnombre_detalle_grupoConsolidadosResumen,iSizeTabla,this,true,"nombre_detalle_grupoConsolidadosResumen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosresumenConstantesFunciones.resaltarnombre_detalle_grupoConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarnombre_detalle_grupoConsolidadosResumen,this,true,"nombre_detalle_grupoConsolidadosResumen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsolidadosResumenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosResumen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosResumen,ConsolidadosResumenConstantesFunciones.LABEL_CLAVE));

		if(this.consolidadosresumenConstantesFunciones.mostrarclaveConsolidadosResumen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosResumenConstantesFunciones.LABEL_CLAVE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consolidadosresumenConstantesFunciones.resaltarclaveConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarclaveConsolidadosResumen,iSizeTabla,this,true,"claveConsolidadosResumen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosresumenConstantesFunciones.resaltarclaveConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarclaveConsolidadosResumen,this,true,"claveConsolidadosResumen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsolidadosResumenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosResumen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosResumen,ConsolidadosResumenConstantesFunciones.LABEL_NOMBRE));

		if(this.consolidadosresumenConstantesFunciones.mostrarnombreConsolidadosResumen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosResumenConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consolidadosresumenConstantesFunciones.resaltarnombreConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarnombreConsolidadosResumen,iSizeTabla,this,true,"nombreConsolidadosResumen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosresumenConstantesFunciones.resaltarnombreConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarnombreConsolidadosResumen,this,true,"nombreConsolidadosResumen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsolidadosResumenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosResumen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosResumen,ConsolidadosResumenConstantesFunciones.LABEL_FECHACOMPRA));

		if(this.consolidadosresumenConstantesFunciones.mostrarfecha_compraConsolidadosResumen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosResumenConstantesFunciones.LABEL_FECHACOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.consolidadosresumenConstantesFunciones.resaltarfecha_compraConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarfecha_compraConsolidadosResumen,iSizeTabla,this,true,"fecha_compraConsolidadosResumen","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.consolidadosresumenConstantesFunciones.resaltarfecha_compraConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarfecha_compraConsolidadosResumen,this,true,"fecha_compraConsolidadosResumen","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ConsolidadosResumenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosResumen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosResumen,ConsolidadosResumenConstantesFunciones.LABEL_VIDAUTIL));

		if(this.consolidadosresumenConstantesFunciones.mostrarvida_utilConsolidadosResumen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosResumenConstantesFunciones.LABEL_VIDAUTIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.consolidadosresumenConstantesFunciones.resaltarvida_utilConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarvida_utilConsolidadosResumen,iSizeTabla,this,true,"vida_utilConsolidadosResumen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosresumenConstantesFunciones.resaltarvida_utilConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarvida_utilConsolidadosResumen,this,true,"vida_utilConsolidadosResumen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConsolidadosResumenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosResumen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosResumen,ConsolidadosResumenConstantesFunciones.LABEL_COSTODECOMPRA));

		if(this.consolidadosresumenConstantesFunciones.mostrarcosto_de_compraConsolidadosResumen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosResumenConstantesFunciones.LABEL_COSTODECOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.consolidadosresumenConstantesFunciones.resaltarcosto_de_compraConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarcosto_de_compraConsolidadosResumen,iSizeTabla,this,true,"costo_de_compraConsolidadosResumen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosresumenConstantesFunciones.resaltarcosto_de_compraConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarcosto_de_compraConsolidadosResumen,this,true,"costo_de_compraConsolidadosResumen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConsolidadosResumenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosResumen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosResumen,ConsolidadosResumenConstantesFunciones.LABEL_CANTIDAD));

		if(this.consolidadosresumenConstantesFunciones.mostrarcantidadConsolidadosResumen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosResumenConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.consolidadosresumenConstantesFunciones.resaltarcantidadConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarcantidadConsolidadosResumen,iSizeTabla,this,true,"cantidadConsolidadosResumen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosresumenConstantesFunciones.resaltarcantidadConsolidadosResumen,this.consolidadosresumenConstantesFunciones.activarcantidadConsolidadosResumen,this,true,"cantidadConsolidadosResumen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConsolidadosResumenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.consolidadosresumenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.consolidadosresumenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConsolidadosResumen.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.consolidadosresumenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.consolidadosresumenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConsolidadosResumen.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarConsolidadosResumen && this.isPermisoGuardarCambiosConsolidadosResumen) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.consolidadosresumenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.consolidadosresumenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosConsolidadosResumen.addColumn(tableColumn);
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
			
			this.jTableDatosConsolidadosResumen.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConsolidadosResumen && this.isPermisoGuardarCambiosConsolidadosResumen) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConsolidadosResumen && this.isPermisoGuardarCambiosConsolidadosResumen) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosConsolidadosResumen.moveColumn(this.jTableDatosConsolidadosResumen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosConsolidadosResumen.moveColumn(this.jTableDatosConsolidadosResumen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosConsolidadosResumen.moveColumn(this.jTableDatosConsolidadosResumen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosConsolidadosResumen.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosConsolidadosResumen.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosConsolidadosResumen,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosConsolidadosResumen.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosConsolidadosResumen.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosConsolidadosResumen.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosConsolidadosResumen.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosConsolidadosResumen.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=consolidadosresumenLogic.getConsolidadosResumens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=consolidadosresumens.size()-1;
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
		//this.jTableDatosConsolidadosResumen.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosConsolidadosResumen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosConsolidadosResumen();
			
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
				
				//this.isEsNuevoConsolidadosResumen=false;
					
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
			
				if(this.consolidadosresumenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormConsolidadosResumen==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConsolidadosResumen.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConsolidadosResumen.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.consolidadosresumen.getsType().equals("DUPLICADO")
				   || this.consolidadosresumen.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoConsolidadosResumen=true;
				
				} else {
					this.isEsNuevoConsolidadosResumen=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
					if(this.consolidadosresumen.getId()>=0 && !this.consolidadosresumen.getIsNew()) {						
						this.isEsNuevoConsolidadosResumen=false;
						
					} else {
						this.isEsNuevoConsolidadosResumen=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoConsolidadosResumen(esRelaciones);						
				
				this.seleccionarConsolidadosResumen(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.consolidadosresumen.getId()<0) {
					this.isEsNuevoConsolidadosResumen=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarConsolidadosResumen(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarConsolidadosResumen(evt,rowIndex);
				}	
				
				if(this.consolidadosresumenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ConsolidadosResumen: " + this.dDif); 
					}
				}								
				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarConsolidadosResumen(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.consolidadosresumen)) {
					if(this.consolidadosresumen.getId()>0) {
						this.consolidadosresumen.setIsDeleted(true);
						
						this.consolidadosresumensEliminados.add(this.consolidadosresumen);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.consolidadosresumenLogic.getConsolidadosResumens().remove(this.consolidadosresumen);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.consolidadosresumens.remove(this.consolidadosresumen);				
					}
					
					
					((ConsolidadosResumenModel) this.jTableDatosConsolidadosResumen.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaConsolidadosResumen(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarConsolidadosResumen(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoConsolidadosResumen) {
			
			if(this.jInternalFrameDetalleFormConsolidadosResumen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConsolidadosResumen.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConsolidadosResumen.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioConsolidadosResumen(this.consolidadosresumen);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesConsolidadosResumen("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesConsolidadosResumen(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConsolidadosResumen() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoConsolidadosResumen(ConsolidadosResumen consolidadosresumen) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoConsolidadosResumen(consolidadosresumen,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoConsolidadosResumen(ConsolidadosResumen consolidadosresumen,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioConsolidadosResumen(consolidadosresumen);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyConsolidadosResumen(consolidadosresumen,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyConsolidadosResumen(consolidadosresumen);
	}
	
	public void setVariablesObjetoActualToFormularioConsolidadosResumen(ConsolidadosResumen consolidadosresumen) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormConsolidadosResumen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormConsolidadosResumen.jLabelidConsolidadosResumen.setText(consolidadosresumen.getId().toString());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_empresaConsolidadosResumen.setText(consolidadosresumen.getnombre_empresa());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_sucursalConsolidadosResumen.setText(consolidadosresumen.getnombre_sucursal());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcodigo_sub_grupoConsolidadosResumen.setText(consolidadosresumen.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_sub_grupoConsolidadosResumen.setText(consolidadosresumen.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcodigo_detalle_grupoConsolidadosResumen.setText(consolidadosresumen.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_detalle_grupoConsolidadosResumen.setText(consolidadosresumen.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldclaveConsolidadosResumen.setText(consolidadosresumen.getclave());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombreConsolidadosResumen.setText(consolidadosresumen.getnombre());
			this.jInternalFrameDetalleFormConsolidadosResumen.jDateChooserfecha_compraConsolidadosResumen.setDate(consolidadosresumen.getfecha_compra());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldvida_utilConsolidadosResumen.setText(consolidadosresumen.getvida_util().toString());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcosto_de_compraConsolidadosResumen.setText(consolidadosresumen.getcosto_de_compra().toString());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcantidadConsolidadosResumen.setText(consolidadosresumen.getcantidad().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ConsolidadosResumen consolidadosresumenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,consolidadosresumenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ConsolidadosResumen consolidadosresumenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				consolidadosresumenLocal=this.consolidadosresumen;
			} else {
				consolidadosresumenLocal=this.consolidadosresumenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(consolidadosresumenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoConsolidadosResumen(consolidadosresumenLocal,true);
					
					if(consolidadosresumenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(consolidadosresumenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(consolidadosresumenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoConsolidadosResumen(ConsolidadosResumen consolidadosresumen,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConsolidadosResumen(consolidadosresumen,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(consolidadosresumen);
	}
	
	public void setVariablesFormularioToObjetoActualConsolidadosResumen(ConsolidadosResumen consolidadosresumen,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConsolidadosResumen(consolidadosresumen,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualConsolidadosResumen(ConsolidadosResumen consolidadosresumen,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormConsolidadosResumen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormConsolidadosResumen.jLabelidConsolidadosResumen.getText()==null || this.jInternalFrameDetalleFormConsolidadosResumen.jLabelidConsolidadosResumen.getText()=="" || this.jInternalFrameDetalleFormConsolidadosResumen.jLabelidConsolidadosResumen.getText()=="Id") {
				this.jInternalFrameDetalleFormConsolidadosResumen.jLabelidConsolidadosResumen.setText("0");
			}

			if(conColumnasBase) {consolidadosresumen.setId(Long.parseLong(this.jInternalFrameDetalleFormConsolidadosResumen.jLabelidConsolidadosResumen.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosResumenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelIdConsolidadosResumen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosresumen.setnombre_empresa(this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_empresaConsolidadosResumen.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosResumenConstantesFunciones.LABEL_NOMBREEMPRESA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelnombre_empresaConsolidadosResumen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosresumen.setnombre_sucursal(this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_sucursalConsolidadosResumen.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUCURSAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelnombre_sucursalConsolidadosResumen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosresumen.setcodigo_sub_grupo(this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcodigo_sub_grupoConsolidadosResumen.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosResumenConstantesFunciones.LABEL_CODIGOSUBGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelcodigo_sub_grupoConsolidadosResumen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosresumen.setnombre_sub_grupo(this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_sub_grupoConsolidadosResumen.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUBGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelnombre_sub_grupoConsolidadosResumen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosresumen.setcodigo_detalle_grupo(this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcodigo_detalle_grupoConsolidadosResumen.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosResumenConstantesFunciones.LABEL_CODIGODETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelcodigo_detalle_grupoConsolidadosResumen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosresumen.setnombre_detalle_grupo(this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_detalle_grupoConsolidadosResumen.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosResumenConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelnombre_detalle_grupoConsolidadosResumen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosresumen.setclave(this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldclaveConsolidadosResumen.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosResumenConstantesFunciones.LABEL_CLAVE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelclaveConsolidadosResumen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosresumen.setnombre(this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombreConsolidadosResumen.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosResumenConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelnombreConsolidadosResumen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosresumen.setfecha_compra(this.jInternalFrameDetalleFormConsolidadosResumen.jDateChooserfecha_compraConsolidadosResumen.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosResumenConstantesFunciones.LABEL_FECHACOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelfecha_compraConsolidadosResumen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosresumen.setvida_util(Double.parseDouble(this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldvida_utilConsolidadosResumen.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosResumenConstantesFunciones.LABEL_VIDAUTIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelvida_utilConsolidadosResumen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosresumen.setcosto_de_compra(Double.parseDouble(this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcosto_de_compraConsolidadosResumen.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosResumenConstantesFunciones.LABEL_COSTODECOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelcosto_de_compraConsolidadosResumen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosresumen.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcantidadConsolidadosResumen.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosResumenConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosResumen.jLabelcantidadConsolidadosResumen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConsolidadosResumen(ConsolidadosResumen consolidadosresumenBean,ConsolidadosResumen consolidadosresumen,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosConsolidadosResumen(ConsolidadosResumen consolidadosresumenOrigen,ConsolidadosResumen consolidadosresumen,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && consolidadosresumenOrigen.getId()!=null && !consolidadosresumenOrigen.getId().equals(0L))) {consolidadosresumen.setId(consolidadosresumenOrigen.getId());}}
			if(conDefault || (!conDefault && consolidadosresumenOrigen.getnombre_empresa()!=null && !consolidadosresumenOrigen.getnombre_empresa().equals(""))) {consolidadosresumen.setnombre_empresa(consolidadosresumenOrigen.getnombre_empresa());}
			if(conDefault || (!conDefault && consolidadosresumenOrigen.getnombre_sucursal()!=null && !consolidadosresumenOrigen.getnombre_sucursal().equals(""))) {consolidadosresumen.setnombre_sucursal(consolidadosresumenOrigen.getnombre_sucursal());}
			if(conDefault || (!conDefault && consolidadosresumenOrigen.getcodigo_sub_grupo()!=null && !consolidadosresumenOrigen.getcodigo_sub_grupo().equals(""))) {consolidadosresumen.setcodigo_sub_grupo(consolidadosresumenOrigen.getcodigo_sub_grupo());}
			if(conDefault || (!conDefault && consolidadosresumenOrigen.getnombre_sub_grupo()!=null && !consolidadosresumenOrigen.getnombre_sub_grupo().equals(""))) {consolidadosresumen.setnombre_sub_grupo(consolidadosresumenOrigen.getnombre_sub_grupo());}
			if(conDefault || (!conDefault && consolidadosresumenOrigen.getcodigo_detalle_grupo()!=null && !consolidadosresumenOrigen.getcodigo_detalle_grupo().equals(""))) {consolidadosresumen.setcodigo_detalle_grupo(consolidadosresumenOrigen.getcodigo_detalle_grupo());}
			if(conDefault || (!conDefault && consolidadosresumenOrigen.getnombre_detalle_grupo()!=null && !consolidadosresumenOrigen.getnombre_detalle_grupo().equals(""))) {consolidadosresumen.setnombre_detalle_grupo(consolidadosresumenOrigen.getnombre_detalle_grupo());}
			if(conDefault || (!conDefault && consolidadosresumenOrigen.getclave()!=null && !consolidadosresumenOrigen.getclave().equals(""))) {consolidadosresumen.setclave(consolidadosresumenOrigen.getclave());}
			if(conDefault || (!conDefault && consolidadosresumenOrigen.getnombre()!=null && !consolidadosresumenOrigen.getnombre().equals(""))) {consolidadosresumen.setnombre(consolidadosresumenOrigen.getnombre());}
			if(conDefault || (!conDefault && consolidadosresumenOrigen.getfecha_compra()!=null && !consolidadosresumenOrigen.getfecha_compra().equals(new Date()))) {consolidadosresumen.setfecha_compra(consolidadosresumenOrigen.getfecha_compra());}
			if(conDefault || (!conDefault && consolidadosresumenOrigen.getvida_util()!=null && !consolidadosresumenOrigen.getvida_util().equals(0.0))) {consolidadosresumen.setvida_util(consolidadosresumenOrigen.getvida_util());}
			if(conDefault || (!conDefault && consolidadosresumenOrigen.getcosto_de_compra()!=null && !consolidadosresumenOrigen.getcosto_de_compra().equals(0.0))) {consolidadosresumen.setcosto_de_compra(consolidadosresumenOrigen.getcosto_de_compra());}
			if(conDefault || (!conDefault && consolidadosresumenOrigen.getcantidad()!=null && !consolidadosresumenOrigen.getcantidad().equals(0))) {consolidadosresumen.setcantidad(consolidadosresumenOrigen.getcantidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConsolidadosResumen(ConsolidadosResumen consolidadosresumen) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConsolidadosResumen.jLabelidConsolidadosResumen.setText(consolidadosresumen.getId().toString());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_empresaConsolidadosResumen.setText(consolidadosresumen.getnombre_empresa());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_sucursalConsolidadosResumen.setText(consolidadosresumen.getnombre_sucursal());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcodigo_sub_grupoConsolidadosResumen.setText(consolidadosresumen.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_sub_grupoConsolidadosResumen.setText(consolidadosresumen.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcodigo_detalle_grupoConsolidadosResumen.setText(consolidadosresumen.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_detalle_grupoConsolidadosResumen.setText(consolidadosresumen.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldclaveConsolidadosResumen.setText(consolidadosresumen.getclave());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombreConsolidadosResumen.setText(consolidadosresumen.getnombre());
			this.jInternalFrameDetalleFormConsolidadosResumen.jDateChooserfecha_compraConsolidadosResumen.setDate(consolidadosresumen.getfecha_compra());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldvida_utilConsolidadosResumen.setText(consolidadosresumen.getvida_util().toString());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcosto_de_compraConsolidadosResumen.setText(consolidadosresumen.getcosto_de_compra().toString());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcantidadConsolidadosResumen.setText(consolidadosresumen.getcantidad().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConsolidadosResumen(ConsolidadosResumenBean consolidadosresumenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConsolidadosResumen.jLabelidConsolidadosResumen.setText(consolidadosresumenBean.getId().toString());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_empresaConsolidadosResumen.setText(consolidadosresumenBean.getnombre_empresa());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_sucursalConsolidadosResumen.setText(consolidadosresumenBean.getnombre_sucursal());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcodigo_sub_grupoConsolidadosResumen.setText(consolidadosresumenBean.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_sub_grupoConsolidadosResumen.setText(consolidadosresumenBean.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcodigo_detalle_grupoConsolidadosResumen.setText(consolidadosresumenBean.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_detalle_grupoConsolidadosResumen.setText(consolidadosresumenBean.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldclaveConsolidadosResumen.setText(consolidadosresumenBean.getclave());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombreConsolidadosResumen.setText(consolidadosresumenBean.getnombre());
			this.jInternalFrameDetalleFormConsolidadosResumen.jDateChooserfecha_compraConsolidadosResumen.setDate(consolidadosresumenBean.getfecha_compra());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldvida_utilConsolidadosResumen.setText(consolidadosresumenBean.getvida_util().toString());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcosto_de_compraConsolidadosResumen.setText(consolidadosresumenBean.getcosto_de_compra().toString());
			this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcantidadConsolidadosResumen.setText(consolidadosresumenBean.getcantidad().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanConsolidadosResumen(ConsolidadosResumenParameterReturnGeneral consolidadosresumenReturnGeneral,ConsolidadosResumenBean consolidadosresumenBean,Boolean conDefault) throws Exception { 
		try {
			ConsolidadosResumen consolidadosresumenLocal=new ConsolidadosResumen();
			
			consolidadosresumenLocal=consolidadosresumenReturnGeneral.getConsolidadosResumen();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && consolidadosresumenLocal.getId()!=null && !consolidadosresumenLocal.getId().equals(0L))) {consolidadosresumenBean.setId(consolidadosresumenLocal.getId());}}
			if(conDefault || (!conDefault && consolidadosresumenLocal.getnombre_empresa()!=null && !consolidadosresumenLocal.getnombre_empresa().equals(""))) {consolidadosresumenBean.setnombre_empresa(consolidadosresumenLocal.getnombre_empresa());}
			if(conDefault || (!conDefault && consolidadosresumenLocal.getnombre_sucursal()!=null && !consolidadosresumenLocal.getnombre_sucursal().equals(""))) {consolidadosresumenBean.setnombre_sucursal(consolidadosresumenLocal.getnombre_sucursal());}
			if(conDefault || (!conDefault && consolidadosresumenLocal.getcodigo_sub_grupo()!=null && !consolidadosresumenLocal.getcodigo_sub_grupo().equals(""))) {consolidadosresumenBean.setcodigo_sub_grupo(consolidadosresumenLocal.getcodigo_sub_grupo());}
			if(conDefault || (!conDefault && consolidadosresumenLocal.getnombre_sub_grupo()!=null && !consolidadosresumenLocal.getnombre_sub_grupo().equals(""))) {consolidadosresumenBean.setnombre_sub_grupo(consolidadosresumenLocal.getnombre_sub_grupo());}
			if(conDefault || (!conDefault && consolidadosresumenLocal.getcodigo_detalle_grupo()!=null && !consolidadosresumenLocal.getcodigo_detalle_grupo().equals(""))) {consolidadosresumenBean.setcodigo_detalle_grupo(consolidadosresumenLocal.getcodigo_detalle_grupo());}
			if(conDefault || (!conDefault && consolidadosresumenLocal.getnombre_detalle_grupo()!=null && !consolidadosresumenLocal.getnombre_detalle_grupo().equals(""))) {consolidadosresumenBean.setnombre_detalle_grupo(consolidadosresumenLocal.getnombre_detalle_grupo());}
			if(conDefault || (!conDefault && consolidadosresumenLocal.getclave()!=null && !consolidadosresumenLocal.getclave().equals(""))) {consolidadosresumenBean.setclave(consolidadosresumenLocal.getclave());}
			if(conDefault || (!conDefault && consolidadosresumenLocal.getnombre()!=null && !consolidadosresumenLocal.getnombre().equals(""))) {consolidadosresumenBean.setnombre(consolidadosresumenLocal.getnombre());}
			if(conDefault || (!conDefault && consolidadosresumenLocal.getfecha_compra()!=null && !consolidadosresumenLocal.getfecha_compra().equals(new Date()))) {consolidadosresumenBean.setfecha_compra(consolidadosresumenLocal.getfecha_compra());}
			if(conDefault || (!conDefault && consolidadosresumenLocal.getvida_util()!=null && !consolidadosresumenLocal.getvida_util().equals(0.0))) {consolidadosresumenBean.setvida_util(consolidadosresumenLocal.getvida_util());}
			if(conDefault || (!conDefault && consolidadosresumenLocal.getcosto_de_compra()!=null && !consolidadosresumenLocal.getcosto_de_compra().equals(0.0))) {consolidadosresumenBean.setcosto_de_compra(consolidadosresumenLocal.getcosto_de_compra());}
			if(conDefault || (!conDefault && consolidadosresumenLocal.getcantidad()!=null && !consolidadosresumenLocal.getcantidad().equals(0))) {consolidadosresumenBean.setcantidad(consolidadosresumenLocal.getcantidad());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxConsolidadosResumenGenerico(Long idConsolidadosResumenSeleccionado,JComboBox jComboBoxConsolidadosResumen,List<ConsolidadosResumen> consolidadosresumensLocal)throws Exception {
		try {
			ConsolidadosResumen  consolidadosresumenTemp=null;

			for(ConsolidadosResumen consolidadosresumenAux:consolidadosresumensLocal) {
				if(consolidadosresumenAux.getId()!=null && consolidadosresumenAux.getId().equals(idConsolidadosResumenSeleccionado)) {
					consolidadosresumenTemp=consolidadosresumenAux;
					break;
				}
			}

			jComboBoxConsolidadosResumen.setSelectedItem(consolidadosresumenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxConsolidadosResumenGenerico(JComboBox jComboBoxConsolidadosResumen,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxConsolidadosResumen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConsolidadosResumen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxConsolidadosResumen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConsolidadosResumen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConsolidadosResumen.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxConsolidadosResumen.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConsolidadosResumen.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxConsolidadosResumen.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxConsolidadosResumen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxConsolidadosResumen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			consolidadosresumen=(ConsolidadosResumen) consolidadosresumenLogic.getConsolidadosResumens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			consolidadosresumen =(ConsolidadosResumen) consolidadosresumens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!consolidadosresumen.getIsNew() && !consolidadosresumen.getIsChanged() && !consolidadosresumen.getIsDeleted()) {
				sDescripcion=consolidadosresumen.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=consolidadosresumen.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ConsolidadosResumen consolidadosresumenRow=new ConsolidadosResumen();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			consolidadosresumenRow=(ConsolidadosResumen) consolidadosresumenLogic.getConsolidadosResumens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			consolidadosresumenRow=(ConsolidadosResumen) consolidadosresumens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualConsolidadosResumen(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoConsolidadosResumen.setVisible((this.isVisibilidadCeldaNuevoConsolidadosResumen && this.isPermisoNuevoConsolidadosResumen));			
			this.jButtonDuplicarConsolidadosResumen.setVisible((this.isVisibilidadCeldaDuplicarConsolidadosResumen && this.isPermisoDuplicarConsolidadosResumen));			
			this.jButtonCopiarConsolidadosResumen.setVisible((this.isVisibilidadCeldaCopiarConsolidadosResumen && this.isPermisoCopiarConsolidadosResumen));
			this.jButtonVerFormConsolidadosResumen.setVisible((this.isVisibilidadCeldaVerFormConsolidadosResumen && this.isPermisoVerFormConsolidadosResumen));
			
			this.jButtonAbrirOrderByConsolidadosResumen.setVisible((this.isVisibilidadCeldaOrdenConsolidadosResumen && this.isPermisoOrdenConsolidadosResumen));			
			
			this.jButtonNuevoRelacionesConsolidadosResumen.setVisible((this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen && this.isPermisoNuevoConsolidadosResumen));			
			this.jButtonNuevoGuardarCambiosConsolidadosResumen.setVisible((this.isVisibilidadCeldaNuevoConsolidadosResumen && this.isPermisoNuevoConsolidadosResumen && this.isPermisoGuardarCambiosConsolidadosResumen));
			
			if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonModificarConsolidadosResumen.setVisible((this.isVisibilidadCeldaModificarConsolidadosResumen && this.isPermisoActualizarConsolidadosResumen));	
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonActualizarConsolidadosResumen.setVisible((this.isVisibilidadCeldaActualizarConsolidadosResumen && this.isPermisoActualizarConsolidadosResumen));	
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonEliminarConsolidadosResumen.setVisible((this.isVisibilidadCeldaEliminarConsolidadosResumen && this.isPermisoEliminarConsolidadosResumen));
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonCancelarConsolidadosResumen.setVisible(this.isVisibilidadCeldaCancelarConsolidadosResumen);							
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonGuardarCambiosConsolidadosResumen.setVisible((this.isVisibilidadCeldaGuardarConsolidadosResumen && this.isPermisoGuardarCambiosConsolidadosResumen));			
			
			}
						
			this.jButtonGuardarCambiosTablaConsolidadosResumen.setVisible((this.isVisibilidadCeldaGuardarCambiosConsolidadosResumen && this.isPermisoGuardarCambiosConsolidadosResumen));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarConsolidadosResumen.setVisible((this.isVisibilidadCeldaNuevoConsolidadosResumen && this.isPermisoNuevoConsolidadosResumen));						
			this.jButtonDuplicarToolBarConsolidadosResumen.setVisible((this.isVisibilidadCeldaDuplicarConsolidadosResumen && this.isPermisoDuplicarConsolidadosResumen));						
			this.jButtonCopiarToolBarConsolidadosResumen.setVisible((this.isVisibilidadCeldaCopiarConsolidadosResumen && this.isPermisoCopiarConsolidadosResumen));			
			this.jButtonVerFormToolBarConsolidadosResumen.setVisible((this.isVisibilidadCeldaVerFormConsolidadosResumen && this.isPermisoVerFormConsolidadosResumen));			
			this.jButtonAbrirOrderByToolBarConsolidadosResumen.setVisible((this.isVisibilidadCeldaOrdenConsolidadosResumen && this.isPermisoOrdenConsolidadosResumen));
			this.jButtonNuevoRelacionesToolBarConsolidadosResumen.setVisible((this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen && this.isPermisoNuevoConsolidadosResumen));			
			this.jButtonNuevoGuardarCambiosToolBarConsolidadosResumen.setVisible((this.isVisibilidadCeldaNuevoConsolidadosResumen && this.isPermisoNuevoConsolidadosResumen && this.isPermisoGuardarCambiosConsolidadosResumen));			
			
			if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonModificarToolBarConsolidadosResumen.setVisible((this.isVisibilidadCeldaModificarConsolidadosResumen && this.isPermisoActualizarConsolidadosResumen));	
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonActualizarToolBarConsolidadosResumen.setVisible((this.isVisibilidadCeldaActualizarConsolidadosResumen  && this.isPermisoActualizarConsolidadosResumen));	
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonEliminarToolBarConsolidadosResumen.setVisible((this.isVisibilidadCeldaEliminarConsolidadosResumen && this.isPermisoEliminarConsolidadosResumen));
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonCancelarToolBarConsolidadosResumen.setVisible(this.isVisibilidadCeldaCancelarConsolidadosResumen);				
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonGuardarCambiosToolBarConsolidadosResumen.setVisible((this.isVisibilidadCeldaGuardarConsolidadosResumen && this.isPermisoGuardarCambiosConsolidadosResumen));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarConsolidadosResumen.setVisible((this.isVisibilidadCeldaGuardarCambiosConsolidadosResumen && this.isPermisoGuardarCambiosConsolidadosResumen));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoConsolidadosResumen.setVisible((this.isVisibilidadCeldaNuevoConsolidadosResumen && this.isPermisoNuevoConsolidadosResumen));			
			this.jMenuItemDuplicarConsolidadosResumen.setVisible((this.isVisibilidadCeldaDuplicarConsolidadosResumen && this.isPermisoDuplicarConsolidadosResumen));			
			this.jMenuItemCopiarConsolidadosResumen.setVisible((this.isVisibilidadCeldaCopiarConsolidadosResumen && this.isPermisoCopiarConsolidadosResumen));			
			this.jMenuItemVerFormConsolidadosResumen.setVisible((this.isVisibilidadCeldaVerFormConsolidadosResumen && this.isPermisoVerFormConsolidadosResumen));			
			this.jMenuItemAbrirOrderByConsolidadosResumen.setVisible((this.isVisibilidadCeldaOrdenConsolidadosResumen && this.isPermisoOrdenConsolidadosResumen));			
			//this.jMenuItemMostrarOcultarConsolidadosResumen.setVisible((this.isVisibilidadCeldaOrdenConsolidadosResumen && this.isPermisoOrdenConsolidadosResumen));
			this.jMenuItemDetalleAbrirOrderByConsolidadosResumen.setVisible((this.isVisibilidadCeldaOrdenConsolidadosResumen && this.isPermisoOrdenConsolidadosResumen));			
			//this.jMenuItemDetalleMostrarOcultarConsolidadosResumen.setVisible((this.isVisibilidadCeldaOrdenConsolidadosResumen && this.isPermisoOrdenConsolidadosResumen));			
			this.jMenuItemNuevoRelacionesConsolidadosResumen.setVisible((this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen && this.isPermisoNuevoConsolidadosResumen));			
			this.jMenuItemNuevoGuardarCambiosConsolidadosResumen.setVisible((this.isVisibilidadCeldaNuevoConsolidadosResumen && this.isPermisoNuevoConsolidadosResumen && this.isPermisoGuardarCambiosConsolidadosResumen));									
			
			if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
			this.jInternalFrameDetalleFormConsolidadosResumen.jMenuItemModificarConsolidadosResumen.setVisible((this.isVisibilidadCeldaModificarConsolidadosResumen && this.isPermisoActualizarConsolidadosResumen));	
			this.jInternalFrameDetalleFormConsolidadosResumen.jMenuItemActualizarConsolidadosResumen.setVisible((this.isVisibilidadCeldaActualizarConsolidadosResumen && this.isPermisoActualizarConsolidadosResumen));	
			this.jInternalFrameDetalleFormConsolidadosResumen.jMenuItemEliminarConsolidadosResumen.setVisible((this.isVisibilidadCeldaEliminarConsolidadosResumen && this.isPermisoEliminarConsolidadosResumen));
			this.jInternalFrameDetalleFormConsolidadosResumen.jMenuItemCancelarConsolidadosResumen.setVisible(this.isVisibilidadCeldaCancelarConsolidadosResumen);				
			}
			
			this.jMenuItemGuardarCambiosConsolidadosResumen.setVisible((this.isVisibilidadCeldaGuardarConsolidadosResumen && this.isPermisoGuardarCambiosConsolidadosResumen));						
			this.jMenuItemGuardarCambiosTablaConsolidadosResumen.setVisible((this.isVisibilidadCeldaGuardarCambiosConsolidadosResumen && this.isPermisoGuardarCambiosConsolidadosResumen));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoConsolidadosResumen=this.jButtonNuevoConsolidadosResumen.isVisible();
			this.isVisibilidadCeldaDuplicarConsolidadosResumen=this.jButtonDuplicarConsolidadosResumen.isVisible();
			this.isVisibilidadCeldaCopiarConsolidadosResumen=this.jButtonCopiarConsolidadosResumen.isVisible();
			this.isVisibilidadCeldaVerFormConsolidadosResumen=this.jButtonVerFormConsolidadosResumen.isVisible();
			
			this.isVisibilidadCeldaOrdenConsolidadosResumen=this.jButtonAbrirOrderByConsolidadosResumen.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen=this.jButtonNuevoRelacionesConsolidadosResumen.isVisible();
			this.isVisibilidadCeldaModificarConsolidadosResumen=this.jButtonModificarConsolidadosResumen.isVisible();
			
			if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
			this.isVisibilidadCeldaActualizarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jButtonActualizarConsolidadosResumen.isVisible();
			this.isVisibilidadCeldaEliminarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jButtonEliminarConsolidadosResumen.isVisible();
			this.isVisibilidadCeldaCancelarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jButtonCancelarConsolidadosResumen.isVisible();
			this.isVisibilidadCeldaGuardarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jButtonGuardarCambiosConsolidadosResumen.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosConsolidadosResumen=this.jButtonGuardarCambiosTablaConsolidadosResumen.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoConsolidadosResumen=this.jButtonNuevoToolBarConsolidadosResumen.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen=this.jButtonNuevoRelacionesToolBarConsolidadosResumen.isVisible();
			
			if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
			this.isVisibilidadCeldaModificarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jButtonModificarToolBarConsolidadosResumen.isVisible();
			this.isVisibilidadCeldaActualizarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jButtonActualizarToolBarConsolidadosResumen.isVisible();
			this.isVisibilidadCeldaEliminarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jButtonEliminarToolBarConsolidadosResumen.isVisible();
			this.isVisibilidadCeldaCancelarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jButtonCancelarToolBarConsolidadosResumen.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConsolidadosResumen=this.jButtonGuardarCambiosToolBarConsolidadosResumen.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConsolidadosResumen=this.jButtonGuardarCambiosTablaToolBarConsolidadosResumen.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoConsolidadosResumen=this.jMenuItemNuevoConsolidadosResumen.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen=this.jMenuItemNuevoRelacionesConsolidadosResumen.isVisible();
			
			if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
			this.isVisibilidadCeldaModificarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jMenuItemModificarConsolidadosResumen.isVisible();
			this.isVisibilidadCeldaActualizarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jMenuItemActualizarConsolidadosResumen.isVisible();
			this.isVisibilidadCeldaEliminarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jMenuItemEliminarConsolidadosResumen.isVisible();
			this.isVisibilidadCeldaCancelarConsolidadosResumen=this.jInternalFrameDetalleFormConsolidadosResumen.jMenuItemCancelarConsolidadosResumen.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConsolidadosResumen=this.jMenuItemGuardarCambiosConsolidadosResumen.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConsolidadosResumen=this.jMenuItemGuardarCambiosTablaConsolidadosResumen.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesConsolidadosResumen(Boolean esInicializar) {
		if(ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.consolidadosresumenSessionBean.getConGuardarRelaciones()) {
				//if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesConsolidadosResumen();
			}
			
			this.inicializarActualizarBindingBotonesManualConsolidadosResumen(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualConsolidadosResumen() {
		this.jButtonNuevoConsolidadosResumen.setVisible(this.isPermisoNuevoConsolidadosResumen);			
		this.jButtonDuplicarConsolidadosResumen.setVisible(this.isPermisoDuplicarConsolidadosResumen);			
		this.jButtonCopiarConsolidadosResumen.setVisible(this.isPermisoCopiarConsolidadosResumen);			
		this.jButtonVerFormConsolidadosResumen.setVisible(this.isPermisoVerFormConsolidadosResumen);			
		
		this.jButtonAbrirOrderByConsolidadosResumen.setVisible(this.isPermisoOrdenConsolidadosResumen);					
		
		this.jButtonNuevoRelacionesConsolidadosResumen.setVisible(this.isPermisoNuevoConsolidadosResumen);			
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonModificarConsolidadosResumen.setVisible(this.isPermisoActualizarConsolidadosResumen);	
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonActualizarConsolidadosResumen.setVisible(this.isPermisoActualizarConsolidadosResumen);	
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonEliminarConsolidadosResumen.setVisible(this.isPermisoEliminarConsolidadosResumen);
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonCancelarConsolidadosResumen.setVisible(this.isVisibilidadCeldaCancelarConsolidadosResumen);						
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonGuardarCambiosConsolidadosResumen.setVisible(this.isPermisoGuardarCambiosConsolidadosResumen);							
		}
		
		this.jButtonGuardarCambiosTablaConsolidadosResumen.setVisible(this.isPermisoActualizarConsolidadosResumen);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleConsolidadosResumen() {
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonModificarConsolidadosResumen.setVisible(this.isPermisoActualizarConsolidadosResumen);	
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonActualizarConsolidadosResumen.setVisible(this.isPermisoActualizarConsolidadosResumen);	
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonEliminarConsolidadosResumen.setVisible(this.isPermisoEliminarConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonCancelarConsolidadosResumen.setVisible(this.isVisibilidadCeldaCancelarConsolidadosResumen);							
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonGuardarCambiosConsolidadosResumen.setVisible((this.isVisibilidadCeldaGuardarConsolidadosResumen && this.isPermisoGuardarCambiosConsolidadosResumen));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosConsolidadosResumen() {
		if(ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualConsolidadosResumen();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesConsolidadosResumen() {
	}
	
	public void jTableDatosConsolidadosResumenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarConsolidadosResumen(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidConsolidadosResumenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.getconsolidadosresumen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosresumen==null) {
						this.consolidadosresumen = new ConsolidadosResumen();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.consolidadosresumen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
				}

				if(this.consolidadosresumen.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.consolidadosresumen.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosResumen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaConsolidadosResumenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebConsolidadosResumen(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsolidadosResumen.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsolidadosResumen.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.getconsolidadosresumen(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.consolidadosresumenLogic.getConnexion());

				if(this.consolidadosresumen.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.consolidadosresumen.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsolidadosResumen=(TitledBorder)this.jScrollPanelDatosConsolidadosResumen.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderConsolidadosResumen.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaConsolidadosResumenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.getconsolidadosresumen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosresumen==null) {
						this.consolidadosresumen = new ConsolidadosResumen();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.consolidadosresumen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
				}

				if(this.consolidadosresumen.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.consolidadosresumen.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosResumen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_empresaConsolidadosResumenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.getconsolidadosresumen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosresumen==null) {
						this.consolidadosresumen = new ConsolidadosResumen();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.consolidadosresumen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
				}

				if(this.consolidadosresumen.getnombre_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_empresa like '%"+this.consolidadosresumen.getnombre_empresa()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosResumen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sucursalConsolidadosResumenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.getconsolidadosresumen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosresumen==null) {
						this.consolidadosresumen = new ConsolidadosResumen();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.consolidadosresumen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
				}

				if(this.consolidadosresumen.getnombre_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sucursal like '%"+this.consolidadosresumen.getnombre_sucursal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosResumen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_sub_grupoConsolidadosResumenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.getconsolidadosresumen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosresumen==null) {
						this.consolidadosresumen = new ConsolidadosResumen();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.consolidadosresumen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
				}

				if(this.consolidadosresumen.getcodigo_sub_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_sub_grupo like '%"+this.consolidadosresumen.getcodigo_sub_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosResumen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sub_grupoConsolidadosResumenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.getconsolidadosresumen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosresumen==null) {
						this.consolidadosresumen = new ConsolidadosResumen();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.consolidadosresumen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
				}

				if(this.consolidadosresumen.getnombre_sub_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sub_grupo like '%"+this.consolidadosresumen.getnombre_sub_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosResumen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_detalle_grupoConsolidadosResumenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.getconsolidadosresumen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosresumen==null) {
						this.consolidadosresumen = new ConsolidadosResumen();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.consolidadosresumen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
				}

				if(this.consolidadosresumen.getcodigo_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_detalle_grupo like '%"+this.consolidadosresumen.getcodigo_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosResumen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_detalle_grupoConsolidadosResumenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.getconsolidadosresumen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosresumen==null) {
						this.consolidadosresumen = new ConsolidadosResumen();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.consolidadosresumen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
				}

				if(this.consolidadosresumen.getnombre_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_detalle_grupo like '%"+this.consolidadosresumen.getnombre_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosResumen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonclaveConsolidadosResumenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.getconsolidadosresumen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosresumen==null) {
						this.consolidadosresumen = new ConsolidadosResumen();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.consolidadosresumen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
				}

				if(this.consolidadosresumen.getclave()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where clave like '%"+this.consolidadosresumen.getclave()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosResumen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreConsolidadosResumenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.getconsolidadosresumen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosresumen==null) {
						this.consolidadosresumen = new ConsolidadosResumen();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.consolidadosresumen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
				}

				if(this.consolidadosresumen.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.consolidadosresumen.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosResumen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_compraConsolidadosResumenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.getconsolidadosresumen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosresumen==null) {
						this.consolidadosresumen = new ConsolidadosResumen();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.consolidadosresumen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
				}

				if(this.consolidadosresumen.getfecha_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_compra = '"+Funciones2.getStringPostgresDate(this.consolidadosresumen.getfecha_compra())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosResumen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvida_utilConsolidadosResumenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.getconsolidadosresumen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosresumen==null) {
						this.consolidadosresumen = new ConsolidadosResumen();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.consolidadosresumen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
				}

				if(this.consolidadosresumen.getvida_util()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where vida_util = "+this.consolidadosresumen.getvida_util().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosResumen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_de_compraConsolidadosResumenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.getconsolidadosresumen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosresumen==null) {
						this.consolidadosresumen = new ConsolidadosResumen();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.consolidadosresumen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
				}

				if(this.consolidadosresumen.getcosto_de_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_de_compra = "+this.consolidadosresumen.getcosto_de_compra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosResumen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadConsolidadosResumenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.getconsolidadosresumen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosresumen==null) {
						this.consolidadosresumen = new ConsolidadosResumen();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.consolidadosresumen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);
				}

				if(this.consolidadosresumen.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.consolidadosresumen.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosResumen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaConsolidadosResumenConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsolidadosResumen(false,false);

			this.getConsolidadosResumensBusquedaConsolidadosResumen();

			this.inicializarActualizarBindingConsolidadosResumen(false);

			//if(ConsolidadosResumenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsolidadosResumen(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaConsolidadosResumenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsolidadosResumen(false,false);

			this.getConsolidadosResumensFK_IdEmpresa();

			this.inicializarActualizarBindingConsolidadosResumen(false);

			//if(ConsolidadosResumenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsolidadosResumen(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosresumenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameConsolidadosResumen() {
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
			this.jInternalFrameDetalleFormConsolidadosResumen.setVisible(false);	    			
			this.jInternalFrameDetalleFormConsolidadosResumen.dispose();
			this.jInternalFrameDetalleFormConsolidadosResumen=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoConsolidadosResumen!=null) {
			this.jInternalFrameReporteDinamicoConsolidadosResumen.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoConsolidadosResumen.dispose();
			this.jInternalFrameReporteDinamicoConsolidadosResumen=null;
		}
		
		if(this.jInternalFrameImportacionConsolidadosResumen!=null) {
			this.jInternalFrameImportacionConsolidadosResumen.setVisible(false);	    			
			this.jInternalFrameImportacionConsolidadosResumen.dispose();
			this.jInternalFrameImportacionConsolidadosResumen=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessConsolidadosResumen();
			
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
			
			
			if(sTipo.equals("NuevoConsolidadosResumen")) {
				jButtonNuevoConsolidadosResumenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarConsolidadosResumen")) {
				jButtonDuplicarConsolidadosResumenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarConsolidadosResumen")) {
				jButtonCopiarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("VerFormConsolidadosResumen")) {
				jButtonVerFormConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarConsolidadosResumen")) {
				jButtonNuevoConsolidadosResumenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarConsolidadosResumen")) {
				jButtonDuplicarConsolidadosResumenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoConsolidadosResumen")) {
				jButtonNuevoConsolidadosResumenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarConsolidadosResumen")) {
				jButtonDuplicarConsolidadosResumenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesConsolidadosResumen")) {
				jButtonNuevoConsolidadosResumenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarConsolidadosResumen")) {
				jButtonNuevoConsolidadosResumenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesConsolidadosResumen")) {
				jButtonNuevoConsolidadosResumenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarConsolidadosResumen")) {
				jButtonModificarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarConsolidadosResumen")) {
				jButtonModificarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarConsolidadosResumen")) {
				jButtonModificarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarConsolidadosResumen")) {
				jButtonActualizarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarConsolidadosResumen")) {
				jButtonActualizarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarConsolidadosResumen")) {
				jButtonActualizarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("EliminarConsolidadosResumen")) {
				jButtonEliminarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarConsolidadosResumen")) {
				jButtonEliminarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarConsolidadosResumen")) {
				jButtonEliminarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("CancelarConsolidadosResumen")) {
				jButtonCancelarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarConsolidadosResumen")) {
				jButtonCancelarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarConsolidadosResumen")) {
				jButtonCancelarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("CerrarConsolidadosResumen")) {
				jButtonCerrarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarConsolidadosResumen")) {
				jButtonCerrarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarConsolidadosResumen")) {
				jButtonCerrarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarConsolidadosResumen")) {
				jButtonMostrarOcultarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarConsolidadosResumen")) {
				jButtonCancelarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosConsolidadosResumen")) {
				jButtonGuardarCambiosConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarConsolidadosResumen")) {
				jButtonGuardarCambiosConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarConsolidadosResumen")) {
				jButtonCopiarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarConsolidadosResumen")) {
				jButtonVerFormConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosConsolidadosResumen")) {
				jButtonGuardarCambiosConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarConsolidadosResumen")) {
				jButtonCopiarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormConsolidadosResumen")) {
				jButtonVerFormConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaConsolidadosResumen")) {
				jButtonGuardarCambiosConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarConsolidadosResumen")) {
				jButtonGuardarCambiosConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaConsolidadosResumen")) {
				jButtonGuardarCambiosConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionConsolidadosResumen")) {
				jButtonRecargarInformacionConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarConsolidadosResumen")) {
				jButtonRecargarInformacionConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionConsolidadosResumen")) {
				jButtonRecargarInformacionConsolidadosResumenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresConsolidadosResumen")) {
				jButtonAnterioresConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarConsolidadosResumen")) {
				jButtonAnterioresConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreConsolidadosResumen")) {
				jButtonAnterioresConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesConsolidadosResumen")) {
				jButtonSiguientesConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarConsolidadosResumen")) {
				jButtonSiguientesConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesConsolidadosResumen")) {
				jButtonSiguientesConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByConsolidadosResumen") || sTipo.equals("MenuItemDetalleAbrirOrderByConsolidadosResumen")) {
				jButtonAbrirOrderByConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarConsolidadosResumen") || sTipo.equals("MenuItemDetalleMostrarOcultarConsolidadosResumen")) {
				jButtonMostrarOcultarConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosConsolidadosResumen")) {
				jButtonNuevoGuardarCambiosConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarConsolidadosResumen")) {
				jButtonNuevoGuardarCambiosConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosConsolidadosResumen")) {
				jButtonNuevoGuardarCambiosConsolidadosResumenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoConsolidadosResumen")) {
				jButtonCerrarReporteDinamicoConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoConsolidadosResumen")) {
				jButtonGenerarReporteDinamicoConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoConsolidadosResumen")) {
				
				jButtonGenerarExcelReporteDinamicoConsolidadosResumenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionConsolidadosResumen")) {
				jButtonCerrarImportacionConsolidadosResumenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionConsolidadosResumen")) {
				
				jButtonGenerarImportacionConsolidadosResumenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionConsolidadosResumen")) {
				
				jButtonAbrirImportacionConsolidadosResumenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesConsolidadosResumen")) {
				jComboBoxTiposAccionesConsolidadosResumenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesConsolidadosResumen")) {
				jComboBoxTiposRelacionesConsolidadosResumenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioConsolidadosResumen")) {
				jComboBoxTiposAccionesConsolidadosResumenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarConsolidadosResumen")) {
				
				jComboBoxTiposSeleccionarConsolidadosResumenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralConsolidadosResumen")) {
				jTextFieldValorCampoGeneralConsolidadosResumenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByConsolidadosResumen")) {
				jButtonAbrirOrderByConsolidadosResumenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarConsolidadosResumen")) {
				jButtonAbrirOrderByConsolidadosResumenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByConsolidadosResumen")) {
				jButtonCerrarOrderByConsolidadosResumenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConsolidadosResumenBusqueda")) {
				this.jButtonidConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConsolidadosResumenUpdate")) {
				this.jButtonid_empresaConsolidadosResumenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConsolidadosResumenBusqueda")) {
				this.jButtonid_empresaConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_empresaConsolidadosResumenBusqueda")) {
				this.jButtonnombre_empresaConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalConsolidadosResumenBusqueda")) {
				this.jButtonnombre_sucursalConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sub_grupoConsolidadosResumenBusqueda")) {
				this.jButtoncodigo_sub_grupoConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sub_grupoConsolidadosResumenBusqueda")) {
				this.jButtonnombre_sub_grupoConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_detalle_grupoConsolidadosResumenBusqueda")) {
				this.jButtoncodigo_detalle_grupoConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoConsolidadosResumenBusqueda")) {
				this.jButtonnombre_detalle_grupoConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveConsolidadosResumenBusqueda")) {
				this.jButtonclaveConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreConsolidadosResumenBusqueda")) {
				this.jButtonnombreConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraConsolidadosResumenBusqueda")) {
				this.jButtonfecha_compraConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("vida_utilConsolidadosResumenBusqueda")) {
				this.jButtonvida_utilConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_de_compraConsolidadosResumenBusqueda")) {
				this.jButtoncosto_de_compraConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadConsolidadosResumenBusqueda")) {
				this.jButtoncantidadConsolidadosResumenBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaConsolidadosResumenConsolidadosResumen")) {
				this.jButtonBusquedaConsolidadosResumenConsolidadosResumenActionPerformed(evt);
			}
			
			;
			
			
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessConsolidadosResumen();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsolidadosResumenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosresumen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosresumen);
				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
				
				


				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosResumen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosResumen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ConsolidadosResumen consolidadosresumenLocal=null;
			
			if(!this.getEsControlTabla()) {
				consolidadosresumenLocal=this.consolidadosresumen;
			} else {
				consolidadosresumenLocal=this.consolidadosresumenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosresumen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosresumen);
				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
							
				
				


				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosResumen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosResumen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsolidadosResumenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenAnterior =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consolidadosresumenAnterior =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
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
			
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
			
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
			
			


			
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsolidadosResumenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosresumen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosresumen);
				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
								
						
				


				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosResumen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosResumen.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosresumen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosresumen);
				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
								
				
				


				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosResumen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosResumen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsolidadosResumenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenAnterior =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consolidadosresumenAnterior =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosresumen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosresumen);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsolidadosResumenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenAnterior =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consolidadosresumenAnterior =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsolidadosResumenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosresumen);
			
			this.actualizarInformacion("INFO_PADRE",false,this.consolidadosresumen);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosresumen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosresumen);
				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
							
				
				


				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosResumen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosResumen.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsolidadosResumenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosresumenAnterior =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.consolidadosresumenAnterior =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
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
			
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
			
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
			
			


			
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsolidadosResumenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosresumen);
			
			this.actualizarInformacion("INFO_PADRE",false,this.consolidadosresumen);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosresumen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosresumen);
				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
								
				
				


				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosResumen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosResumen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsolidadosResumenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenAnterior =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consolidadosresumenAnterior =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsolidadosResumenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosresumen);
			
			this.actualizarInformacion("INFO_PADRE",false,this.consolidadosresumen);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsolidadosResumenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosresumen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosresumen);
				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosConsolidadosResumen")) {
					jCheckBoxSeleccionarTodosConsolidadosResumenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosConsolidadosResumen")) {
					jCheckBoxSeleccionadosConsolidadosResumenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarConsolidadosResumen")) {
					
				}
				
				


				
				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosResumen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosResumen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosresumen);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.consolidadosresumen);
				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
												
				
				


				
				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosResumen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosResumen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsolidadosResumenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosresumenAnterior =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.consolidadosresumenAnterior =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsolidadosResumenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosresumen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosresumen);
				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
				
				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
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
			
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
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
			
			


			
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsolidadosResumenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosresumen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosresumen);
				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosResumen.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosResumen.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosresumen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosresumen);
				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
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
				
				


				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosResumen.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosResumen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsolidadosResumenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosresumenAnterior =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consolidadosresumenAnterior =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarConsolidadosResumen")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosConsolidadosResumenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosConsolidadosResumen.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.consolidadosresumen =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.consolidadosresumen);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarConsolidadosResumen")) {
				
				}
				
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarConsolidadosResumen")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosConsolidadosResumen.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarConsolidadosResumen")) {
			
			}
			
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessConsolidadosResumen();
			
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
			
			if(sTipo.equals("NuevoConsolidadosResumen")) {
				jButtonNuevoConsolidadosResumenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarConsolidadosResumen")) {
				jButtonDuplicarConsolidadosResumenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarConsolidadosResumen")) {
				jButtonCopiarConsolidadosResumenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormConsolidadosResumen")) {
				jButtonVerFormConsolidadosResumenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesConsolidadosResumen")) {
				jButtonNuevoConsolidadosResumenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarConsolidadosResumen")) {
				jButtonModificarConsolidadosResumenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarConsolidadosResumen")) {
				jButtonActualizarConsolidadosResumenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarConsolidadosResumen")) {
				jButtonEliminarConsolidadosResumenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaConsolidadosResumen")) {
				jButtonGuardarCambiosConsolidadosResumenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarConsolidadosResumen")) {
				jButtonCancelarConsolidadosResumenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarConsolidadosResumen")) {
				jButtonCerrarConsolidadosResumenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosConsolidadosResumen")) {
				jButtonGuardarCambiosConsolidadosResumenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosConsolidadosResumen")) {
				jButtonNuevoGuardarCambiosConsolidadosResumenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByConsolidadosResumen")) {
				jButtonAbrirOrderByConsolidadosResumenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionConsolidadosResumen")) {
				jButtonRecargarInformacionConsolidadosResumenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresConsolidadosResumen")) {
				jButtonAnterioresConsolidadosResumenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesConsolidadosResumen")) {
				jButtonSiguientesConsolidadosResumenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConsolidadosResumenBusqueda")) {
				this.jButtonidConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConsolidadosResumenUpdate")) {
				this.jButtonid_empresaConsolidadosResumenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConsolidadosResumenBusqueda")) {
				this.jButtonid_empresaConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_empresaConsolidadosResumenBusqueda")) {
				this.jButtonnombre_empresaConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalConsolidadosResumenBusqueda")) {
				this.jButtonnombre_sucursalConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sub_grupoConsolidadosResumenBusqueda")) {
				this.jButtoncodigo_sub_grupoConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sub_grupoConsolidadosResumenBusqueda")) {
				this.jButtonnombre_sub_grupoConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_detalle_grupoConsolidadosResumenBusqueda")) {
				this.jButtoncodigo_detalle_grupoConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoConsolidadosResumenBusqueda")) {
				this.jButtonnombre_detalle_grupoConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveConsolidadosResumenBusqueda")) {
				this.jButtonclaveConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreConsolidadosResumenBusqueda")) {
				this.jButtonnombreConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraConsolidadosResumenBusqueda")) {
				this.jButtonfecha_compraConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("vida_utilConsolidadosResumenBusqueda")) {
				this.jButtonvida_utilConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_de_compraConsolidadosResumenBusqueda")) {
				this.jButtoncosto_de_compraConsolidadosResumenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadConsolidadosResumenBusqueda")) {
				this.jButtoncantidadConsolidadosResumenBusquedaActionPerformed(evt);
			}
			
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessConsolidadosResumen();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameConsolidadosResumen")) {
				closingInternalFrameConsolidadosResumen();
				
			} else if(sTipo.equals("jButtonCancelarConsolidadosResumen")) {
				JInternalFrameBase jInternalFrameDetalleFormConsolidadosResumen = (JInternalFrameBase)evt.getSource();
	            	
	            ConsolidadosResumenBeanSwingJInternalFrame jInternalFrameParent=(ConsolidadosResumenBeanSwingJInternalFrame)jInternalFrameDetalleFormConsolidadosResumen.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarConsolidadosResumenActionPerformed(null);
			}
			
			ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.consolidadosresumen,new Object(),this.consolidadosresumenParameterGeneral,this.consolidadosresumenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormConsolidadosResumen(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormConsolidadosResumen(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormConsolidadosResumen(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.consolidadosresumen)) {
			if(!esControlTabla) {
				if(ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.consolidadosresumen,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);			
				}
				
				if(this.consolidadosresumenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualConsolidadosResumen(this.consolidadosresumen,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanConsolidadosResumen(this.consolidadosresumenReturnGeneral,this.consolidadosresumenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.consolidadosresumenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanConsolidadosResumen(classes,this.consolidadosresumenReturnGeneral,this.consolidadosresumenBean,false);
					}
						
					if(this.consolidadosresumenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyConsolidadosResumen(this.consolidadosresumenReturnGeneral.getConsolidadosResumen());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioConsolidadosResumen(this.consolidadosresumenReturnGeneral.getConsolidadosResumen());	
					}
						
					if(this.consolidadosresumenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioConsolidadosResumen(this.consolidadosresumenReturnGeneral.getConsolidadosResumen(),classes);//this.consolidadosresumenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioConsolidadosResumen(this.consolidadosresumen,classes);//this.consolidadosresumenBean);									
				}
			
				if(ConsolidadosResumenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualConsolidadosResumen(this.consolidadosresumen,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosResumen(this.consolidadosresumen);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.consolidadosresumenAnterior!=null) {
						this.consolidadosresumen=this.consolidadosresumenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.consolidadosresumenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.consolidadosresumenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.consolidadosresumenReturnGeneral.getConsolidadosResumen(),consolidadosresumenLogic.getConsolidadosResumens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.consolidadosresumenReturnGeneral.getConsolidadosResumen(),this.consolidadosresumens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosConsolidadosResumen.repaint();
				
				//((AbstractTableModel) this.jTableDatosConsolidadosResumen.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosConsolidadosResumen();
			}
		}
	}
	
	public void actualizarVisualTableDatosConsolidadosResumen() throws Exception {
		
		ConsolidadosResumenModel consolidadosresumenModel=(ConsolidadosResumenModel)this.jTableDatosConsolidadosResumen.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			consolidadosresumenModel.consolidadosresumens=this.consolidadosresumenLogic.getConsolidadosResumens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			consolidadosresumenModel.consolidadosresumens=this.consolidadosresumens;
		}
		
		
		((ConsolidadosResumenModel) this.jTableDatosConsolidadosResumen.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaConsolidadosResumen() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getconsolidadosresumenAnterior(),this.consolidadosresumenLogic.getConsolidadosResumens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getconsolidadosresumenAnterior(),this.consolidadosresumens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosConsolidadosResumen();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioConsolidadosResumen(ConsolidadosResumen consolidadosresumen,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
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
										
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.consolidadosresumen,new Object(),generalEntityParameterGeneral,this.consolidadosresumenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.consolidadosresumenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ConsolidadosResumenConstantesFunciones.getClassesRelationshipsOfConsolidadosResumen(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ConsolidadosResumenConstantesFunciones.getClassesRelationshipsFromStringsOfConsolidadosResumen(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormConsolidadosResumen(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ConsolidadosResumenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.consolidadosresumen,new Object(),generalEntityParameterGeneral,this.consolidadosresumenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioConsolidadosResumen(ConsolidadosResumenBean consolidadosresumenBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanConsolidadosResumen(ArrayList<Classe> classes,ConsolidadosResumenReturnGeneral consolidadosresumenReturnGeneral,ConsolidadosResumenBean consolidadosresumenBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualConsolidadosResumen(ConsolidadosResumen consolidadosresumen,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.consolidadosresumen)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormConsolidadosResumen = new ConsolidadosResumenDetalleFormJInternalFrame(jDesktopPane,this.consolidadosresumenSessionBean.getConGuardarRelaciones(),this.consolidadosresumenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.setVisible(false);
		this.jInternalFrameDetalleFormConsolidadosResumen.setSelected(false);						
		
		this.jInternalFrameDetalleFormConsolidadosResumen.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormConsolidadosResumen.consolidadosresumenLogic=this.consolidadosresumenLogic;
		
		this.cargarCombosFrameForeignKeyConsolidadosResumen("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleConsolidadosResumen();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConsolidadosResumen();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyConsolidadosResumen("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyConsolidadosResumen();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormConsolidadosResumen.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConsolidadosResumen"));
		
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonModificarConsolidadosResumen.addActionListener(new ButtonActionListener(this,"ModificarConsolidadosResumen"));

		
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonModificarToolBarConsolidadosResumen.addActionListener(new ButtonActionListener(this,"ModificarToolBarConsolidadosResumen"));
					
		this.jInternalFrameDetalleFormConsolidadosResumen.jMenuItemModificarConsolidadosResumen.addActionListener(new ButtonActionListener(this,"MenuItemModificarConsolidadosResumen"));		
		
		
		
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonActualizarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"ActualizarConsolidadosResumen"));
		
		
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonActualizarToolBarConsolidadosResumen.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConsolidadosResumen"));
						
		this.jInternalFrameDetalleFormConsolidadosResumen.jMenuItemActualizarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConsolidadosResumen"));		
		
		
		
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonEliminarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"EliminarConsolidadosResumen"));
		
		
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonEliminarToolBarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"EliminarToolBarConsolidadosResumen"));
								
		this.jInternalFrameDetalleFormConsolidadosResumen.jMenuItemEliminarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConsolidadosResumen"));		
		
		
		
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonCancelarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"CancelarConsolidadosResumen"));
		
		
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonCancelarToolBarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"CancelarToolBarConsolidadosResumen"));
					
		this.jInternalFrameDetalleFormConsolidadosResumen.jMenuItemCancelarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConsolidadosResumen"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormConsolidadosResumen.jMenuItemDetalleCerrarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConsolidadosResumen"));		
		
		
		
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonGuardarCambiosToolBarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConsolidadosResumen"));
		
		
		
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonGuardarCambiosToolBarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConsolidadosResumen"));
		
		
		
		this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxTiposAccionesFormularioConsolidadosResumen.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConsolidadosResumen"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonidConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"idConsolidadosResumenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonid_empresaConsolidadosResumenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConsolidadosResumenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonid_empresaConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonnombre_empresaConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"nombre_empresaConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonnombre_sucursalConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtoncodigo_sub_grupoConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonnombre_sub_grupoConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtoncodigo_detalle_grupoConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonnombre_detalle_grupoConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonclaveConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"claveConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonnombreConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"nombreConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonfecha_compraConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonvida_utilConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtoncosto_de_compraConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtoncantidadConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"cantidadConsolidadosResumenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormConsolidadosResumen.jTabbedPaneRelacionesConsolidadosResumen.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConsolidadosResumen"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameConsolidadosResumen"));
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosResumen.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConsolidadosResumen"));
		}
		
		this.jTableDatosConsolidadosResumen.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarConsolidadosResumen"));
		
		this.jTableDatosConsolidadosResumen.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarConsolidadosResumen"));
		
		this.jButtonNuevoConsolidadosResumen.addActionListener(new ButtonActionListener(this,"NuevoConsolidadosResumen"));
		
		this.jButtonDuplicarConsolidadosResumen.addActionListener(new ButtonActionListener(this,"DuplicarConsolidadosResumen"));
		
		this.jButtonCopiarConsolidadosResumen.addActionListener(new ButtonActionListener(this,"CopiarConsolidadosResumen"));
		
		this.jButtonVerFormConsolidadosResumen.addActionListener(new ButtonActionListener(this,"VerFormConsolidadosResumen"));
		
		
		this.jButtonNuevoToolBarConsolidadosResumen.addActionListener(new ButtonActionListener(this,"NuevoToolBarConsolidadosResumen"));
			
		this.jButtonDuplicarToolBarConsolidadosResumen.addActionListener(new ButtonActionListener(this,"DuplicarToolBarConsolidadosResumen"));
			
		this.jMenuItemNuevoConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemNuevoConsolidadosResumen"));
			
		this.jMenuItemDuplicarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarConsolidadosResumen"));		
		
		
		this.jButtonNuevoRelacionesConsolidadosResumen.addActionListener (new ButtonActionListener(this,"NuevoRelacionesConsolidadosResumen"));
		
		
		this.jButtonNuevoRelacionesToolBarConsolidadosResumen.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarConsolidadosResumen"));
			
		this.jMenuItemNuevoRelacionesConsolidadosResumen.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesConsolidadosResumen"));		
		
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonModificarConsolidadosResumen.addActionListener(new ButtonActionListener(this,"ModificarConsolidadosResumen"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonModificarToolBarConsolidadosResumen.addActionListener(new ButtonActionListener(this,"ModificarToolBarConsolidadosResumen"));
			
			this.jInternalFrameDetalleFormConsolidadosResumen.jMenuItemModificarConsolidadosResumen.addActionListener(new ButtonActionListener(this,"MenuItemModificarConsolidadosResumen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonActualizarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"ActualizarConsolidadosResumen"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonActualizarToolBarConsolidadosResumen.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConsolidadosResumen"));
				
			this.jInternalFrameDetalleFormConsolidadosResumen.jMenuItemActualizarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConsolidadosResumen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonEliminarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"EliminarConsolidadosResumen"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonEliminarToolBarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"EliminarToolBarConsolidadosResumen"));
						
			this.jInternalFrameDetalleFormConsolidadosResumen.jMenuItemEliminarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConsolidadosResumen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonCancelarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"CancelarConsolidadosResumen"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonCancelarToolBarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"CancelarToolBarConsolidadosResumen"));
			
			this.jInternalFrameDetalleFormConsolidadosResumen.jMenuItemCancelarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConsolidadosResumen"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarConsolidadosResumen"));		
		
		
		this.jButtonCerrarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"CerrarConsolidadosResumen"));
		
		
		this.jButtonCerrarToolBarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"CerrarToolBarConsolidadosResumen"));
			
		this.jMenuItemCerrarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemCerrarConsolidadosResumen"));
			
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosResumen.jMenuItemDetalleCerrarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConsolidadosResumen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonGuardarCambiosConsolidadosResumen.addActionListener (new ButtonActionListener(this,"GuardarCambiosConsolidadosResumen"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosResumen.jButtonGuardarCambiosToolBarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConsolidadosResumen"));
		}
		
		this.jButtonCopiarToolBarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"CopiarToolBarConsolidadosResumen"));
			
		this.jButtonVerFormToolBarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"VerFormToolBarConsolidadosResumen"));
		
		this.jMenuItemGuardarCambiosConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosConsolidadosResumen"));
			
		this.jMenuItemCopiarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemCopiarConsolidadosResumen"));		
		
		this.jMenuItemVerFormConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemVerFormConsolidadosResumen"));		
		
		
		this.jButtonGuardarCambiosTablaConsolidadosResumen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConsolidadosResumen"));
		
		
		this.jButtonGuardarCambiosTablaToolBarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarConsolidadosResumen"));
			
		this.jMenuItemGuardarCambiosTablaConsolidadosResumen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConsolidadosResumen"));		
		
		
		
		this.jButtonRecargarInformacionConsolidadosResumen.addActionListener (new ButtonActionListener(this,"RecargarInformacionConsolidadosResumen"));
					
		this.jButtonRecargarInformacionToolBarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarConsolidadosResumen"));
		
		this.jMenuItemRecargarInformacionConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionConsolidadosResumen"));		
		
		
		
		this.jButtonAnterioresConsolidadosResumen.addActionListener (new ButtonActionListener(this,"AnterioresConsolidadosResumen"));
		
		
		this.jButtonAnterioresToolBarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"AnterioresToolBarConsolidadosResumen"));
		
		this.jMenuItemAnterioresConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresConsolidadosResumen"));		
		
		
		this.jButtonSiguientesConsolidadosResumen.addActionListener (new ButtonActionListener(this,"SiguientesConsolidadosResumen"));
		
		
		this.jButtonSiguientesToolBarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"SiguientesToolBarConsolidadosResumen"));
			
		this.jMenuItemSiguientesConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesConsolidadosResumen"));
			
		this.jMenuItemAbrirOrderByConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByConsolidadosResumen"));
			
		this.jMenuItemMostrarOcultarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarConsolidadosResumen"));
			
		this.jMenuItemDetalleAbrirOrderByConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByConsolidadosResumen"));
			
		this.jMenuItemDetalleMostarOcultarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarConsolidadosResumen"));		
		
		
		this.jButtonNuevoGuardarCambiosConsolidadosResumen.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosConsolidadosResumen"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarConsolidadosResumen"));
			
		this.jMenuItemNuevoGuardarCambiosConsolidadosResumen.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosConsolidadosResumen"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosConsolidadosResumen.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosConsolidadosResumen"));

		this.jCheckBoxSeleccionadosConsolidadosResumen.addItemListener(new CheckBoxItemListener(this,"SeleccionadosConsolidadosResumen"));
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxTiposAccionesFormularioConsolidadosResumen.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConsolidadosResumen"));
		}
		
		
		this.jComboBoxTiposRelacionesConsolidadosResumen.addActionListener (new ButtonActionListener(this,"TiposRelacionesConsolidadosResumen"));
			
		this.jComboBoxTiposAccionesConsolidadosResumen.addActionListener (new ButtonActionListener(this,"TiposAccionesConsolidadosResumen"));
					
		this.jComboBoxTiposSeleccionarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"TiposSeleccionarConsolidadosResumen"));
			
		this.jTextFieldValorCampoGeneralConsolidadosResumen.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralConsolidadosResumen"));		
		
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonidConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"idConsolidadosResumenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonid_empresaConsolidadosResumenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConsolidadosResumenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonid_empresaConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonnombre_empresaConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"nombre_empresaConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonnombre_sucursalConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtoncodigo_sub_grupoConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonnombre_sub_grupoConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtoncodigo_detalle_grupoConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonnombre_detalle_grupoConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonclaveConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"claveConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonnombreConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"nombreConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonfecha_compraConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonvida_utilConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtoncosto_de_compraConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtoncantidadConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"cantidadConsolidadosResumenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaConsolidadosResumenConsolidadosResumen.addActionListener(new ButtonActionListener(this,"BusquedaConsolidadosResumenConsolidadosResumen"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoConsolidadosResumen!=null) {
				this.jInternalFrameReporteDinamicoConsolidadosResumen.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConsolidadosResumen"));
				this.jInternalFrameReporteDinamicoConsolidadosResumen.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConsolidadosResumen"));
				this.jInternalFrameReporteDinamicoConsolidadosResumen.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConsolidadosResumen"));
			}
			
			//this.jButtonCerrarReporteDinamicoConsolidadosResumen.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConsolidadosResumen"));				
			//this.jButtonGenerarReporteDinamicoConsolidadosResumen.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConsolidadosResumen"));
			//this.jButtonGenerarExcelReporteDinamicoConsolidadosResumen.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConsolidadosResumen"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionConsolidadosResumen!=null) {
				this.jInternalFrameImportacionConsolidadosResumen.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConsolidadosResumen"));
				this.jInternalFrameImportacionConsolidadosResumen.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConsolidadosResumen"));
				this.jInternalFrameImportacionConsolidadosResumen.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConsolidadosResumen"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByConsolidadosResumen.addActionListener (new ButtonActionListener(this,"AbrirOrderByConsolidadosResumen"));
			
			this.jButtonAbrirOrderByToolBarConsolidadosResumen.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarConsolidadosResumen"));			
			
			if(this.jInternalFrameOrderByConsolidadosResumen!=null) {
				this.jInternalFrameOrderByConsolidadosResumen.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConsolidadosResumen"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosResumen.jTabbedPaneRelacionesConsolidadosResumen.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConsolidadosResumen"));
		
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
            		closingInternalFrameConsolidadosResumen();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormConsolidadosResumen.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormConsolidadosResumen = (JInternalFrameBase)event.getSource();
	            	
	            ConsolidadosResumenBeanSwingJInternalFrame jInternalFrameParent=(ConsolidadosResumenBeanSwingJInternalFrame)jInternalFrameDetalleFormConsolidadosResumen.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarConsolidadosResumenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosConsolidadosResumen.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosConsolidadosResumenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosConsolidadosResumen.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosConsolidadosResumen.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsolidadosResumenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsolidadosResumenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsolidadosResumenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoConsolidadosResumen";
		inputMap = this.jButtonNuevoConsolidadosResumen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoConsolidadosResumen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConsolidadosResumenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsolidadosResumenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsolidadosResumenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsolidadosResumenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesConsolidadosResumen";
		inputMap = this.jButtonNuevoRelacionesConsolidadosResumen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesConsolidadosResumen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConsolidadosResumenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarConsolidadosResumen";
		inputMap = this.jButtonModificarConsolidadosResumen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarConsolidadosResumen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarConsolidadosResumenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarConsolidadosResumen";
		inputMap = this.jButtonActualizarConsolidadosResumen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarConsolidadosResumen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarConsolidadosResumenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarConsolidadosResumen";
		inputMap = this.jButtonEliminarConsolidadosResumen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarConsolidadosResumen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarConsolidadosResumenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarConsolidadosResumen";
		inputMap = this.jButtonCancelarConsolidadosResumen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarConsolidadosResumen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarConsolidadosResumenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarConsolidadosResumen";
		inputMap = this.jButtonCerrarConsolidadosResumen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarConsolidadosResumen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarConsolidadosResumenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonGuardarCambiosConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosConsolidadosResumen";
		inputMap = this.jInternalFrameDetalleFormConsolidadosResumen.jButtonGuardarCambiosConsolidadosResumen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonGuardarCambiosConsolidadosResumen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosConsolidadosResumenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosConsolidadosResumen.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosConsolidadosResumenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesConsolidadosResumen.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesConsolidadosResumenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarConsolidadosResumen.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarConsolidadosResumenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralConsolidadosResumen.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralConsolidadosResumenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonidConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"idConsolidadosResumenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonid_empresaConsolidadosResumenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConsolidadosResumenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonid_empresaConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonnombre_empresaConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"nombre_empresaConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonnombre_sucursalConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtoncodigo_sub_grupoConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonnombre_sub_grupoConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtoncodigo_detalle_grupoConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonnombre_detalle_grupoConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonclaveConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"claveConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonnombreConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"nombreConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonfecha_compraConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtonvida_utilConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtoncosto_de_compraConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraConsolidadosResumenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosResumen.jButtoncantidadConsolidadosResumenBusqueda.addActionListener(new ButtonActionListener(this,"cantidadConsolidadosResumenBusqueda"));
		
		
		this.jButtonBusquedaConsolidadosResumenConsolidadosResumen.addActionListener(new ButtonActionListener(this,"BusquedaConsolidadosResumenConsolidadosResumen"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionConsolidadosResumen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionConsolidadosResumenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarConsolidadosResumenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarConsolidadosResumen.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosConsolidadosResumen(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ConsolidadosResumen consolidadosresumenAux:this.consolidadosresumenLogic.getConsolidadosResumens()) {
					consolidadosresumenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConsolidadosResumen consolidadosresumenAux:consolidadosresumens) {
					consolidadosresumenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosConsolidadosResumenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConsolidadosResumen(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ConsolidadosResumen consolidadosresumenAux:this.consolidadosresumenLogic.getConsolidadosResumens()) {
						consolidadosresumenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConsolidadosResumen consolidadosresumenAux:consolidadosresumens) {
						consolidadosresumenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ConsolidadosResumen consolidadosresumenAux:this.consolidadosresumenLogic.getConsolidadosResumens()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConsolidadosResumen consolidadosresumenAux:consolidadosresumens) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaConsolidadosResumen(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConsolidadosResumen.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConsolidadosResumen.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosResumen,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosConsolidadosResumenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConsolidadosResumen(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosConsolidadosResumen.getSelectedRows();
			
			ConsolidadosResumen consolidadosresumenLocal=new ConsolidadosResumen();
			
			//this.seleccionarTodosConsolidadosResumen(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					consolidadosresumenLocal =(ConsolidadosResumen) this.consolidadosresumenLogic.getConsolidadosResumens().toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					consolidadosresumenLocal =(ConsolidadosResumen) this.consolidadosresumens.toArray()[this.jTableDatosConsolidadosResumen.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				consolidadosresumenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ConsolidadosResumen consolidadosresumenAux:this.consolidadosresumenLogic.getConsolidadosResumens()) {
						consolidadosresumenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConsolidadosResumen consolidadosresumenAux:consolidadosresumens) {
						consolidadosresumenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaConsolidadosResumen(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConsolidadosResumen.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConsolidadosResumen.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosResumen,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualConsolidadosResumenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarConsolidadosResumenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralConsolidadosResumenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingConsolidadosResumen(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralConsolidadosResumen.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ConsolidadosResumen consolidadosresumenAux:this.consolidadosresumenLogic.getConsolidadosResumens()) {
				
						if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_NOMBREEMPRESA)) {
							existe=true;
							consolidadosresumenAux.setnombre_empresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							consolidadosresumenAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
							existe=true;
							consolidadosresumenAux.setcodigo_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
							existe=true;
							consolidadosresumenAux.setnombre_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
							existe=true;
							consolidadosresumenAux.setcodigo_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							consolidadosresumenAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							consolidadosresumenAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							consolidadosresumenAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							consolidadosresumenAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_VIDAUTIL)) {
							existe=true;
							consolidadosresumenAux.setvida_util(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_COSTODECOMPRA)) {
							existe=true;
							consolidadosresumenAux.setcosto_de_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							consolidadosresumenAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConsolidadosResumen consolidadosresumenAux:consolidadosresumens) {
					
						if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_NOMBREEMPRESA)) {
							existe=true;
							consolidadosresumenAux.setnombre_empresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							consolidadosresumenAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
							existe=true;
							consolidadosresumenAux.setcodigo_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
							existe=true;
							consolidadosresumenAux.setnombre_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
							existe=true;
							consolidadosresumenAux.setcodigo_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							consolidadosresumenAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							consolidadosresumenAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							consolidadosresumenAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							consolidadosresumenAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_VIDAUTIL)) {
							existe=true;
							consolidadosresumenAux.setvida_util(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_COSTODECOMPRA)) {
							existe=true;
							consolidadosresumenAux.setcosto_de_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							consolidadosresumenAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaConsolidadosResumen(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesConsolidadosResumenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingConsolidadosResumen(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioConsolidadosResumen=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesConsolidadosResumen.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxTiposAccionesFormularioConsolidadosResumen.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteConsolidadosResumen) {				
					conSplash=true;//false;										
					
					//this.startProcessConsolidadosResumen(conSplash);
				
					this.generarReporteConsolidadosResumensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsolidadosResumen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxTiposAccionesFormularioConsolidadosResumen.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoConsolidadosResumensSeleccionados();
				//this.jComboBoxTiposAccionesConsolidadosResumen.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConsolidadosResumensSeleccionados(false);
				//this.jComboBoxTiposAccionesConsolidadosResumen.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConsolidadosResumensSeleccionados(true);
				//this.jComboBoxTiposAccionesConsolidadosResumen.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConsolidadosResumen();
				
				this.exportarConsolidadosResumensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsolidadosResumen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxTiposAccionesFormularioConsolidadosResumen.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionConsolidadosResumens();
				//this.importarConsolidadosResumens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsolidadosResumen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxTiposAccionesFormularioConsolidadosResumen.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConsolidadosResumen();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelConsolidadosResumensSeleccionados();
				//this.jComboBoxTiposAccionesConsolidadosResumen.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Consolidados Resumen", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessConsolidadosResumen();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoConsolidadosResumen)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyConsolidadosResumen(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Consolidados Resumen",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsolidadosResumen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxTiposAccionesFormularioConsolidadosResumen.setSelectedIndex(0);					
				}	
			} 			
			else if(ConsolidadosResumenBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteConsolidadosResumen) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessConsolidadosResumen(conSplash);
					
						//this.actualizarParametrosGeneralConsolidadosResumen();
						
						this.generarReporteProcesoAccionConsolidadosResumensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesConsolidadosResumen.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxTiposAccionesFormularioConsolidadosResumen.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ConsolidadosResumenBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Consolidados ResumenES SELECCIONADOS?", "MANTENIMIENTO DE Consolidados Resumen", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessConsolidadosResumen();
				
						this.actualizarParametrosGeneralConsolidadosResumen();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.consolidadosresumenReturnGeneral=consolidadosresumenLogic.procesarAccionConsolidadosResumensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.consolidadosresumenLogic.getConsolidadosResumens(),this.consolidadosresumenParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarConsolidadosResumenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConsolidadosResumen.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxTiposAccionesFormularioConsolidadosResumen.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralConsolidadosResumen();
					
					ConsolidadosResumenBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarConsolidadosResumenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConsolidadosResumen.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxTiposAccionesFormularioConsolidadosResumen.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessConsolidadosResumen(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesConsolidadosResumenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessConsolidadosResumen();
			
			if(this.jInternalFrameDetalleFormConsolidadosResumen==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ConsolidadosResumen> consolidadosresumensSeleccionados=new ArrayList<ConsolidadosResumen>();		
			ConsolidadosResumen consolidadosresumen=new ConsolidadosResumen();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingConsolidadosResumen(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesConsolidadosResumen.getSelectedItem();
			
			
			
			
			consolidadosresumensSeleccionados=this.getConsolidadosResumensSeleccionados(true);
			//this.sTipoAccion;
			
			if(consolidadosresumensSeleccionados.size()==1) {
				for(ConsolidadosResumen consolidadosresumenAux:consolidadosresumensSeleccionados) {
					consolidadosresumen=consolidadosresumenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessConsolidadosResumen();
			
      		//this.finishProcessConsolidadosResumen(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarConsolidadosResumenReturnGeneral() throws Exception {
		if(this.consolidadosresumenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.consolidadosresumenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.consolidadosresumenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.consolidadosresumenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.consolidadosresumenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.consolidadosresumenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingConsolidadosResumen(false);
		}
		
		if(this.consolidadosresumenReturnGeneral.getConRetornoLista() || this.consolidadosresumenReturnGeneral.getConRetornoObjeto()) {
			if(this.consolidadosresumenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.consolidadosresumenLogic.setConsolidadosResumens(this.consolidadosresumenReturnGeneral.getConsolidadosResumens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingConsolidadosResumen(false);
		}
	}
	
	public void actualizarParametrosGeneralConsolidadosResumen() throws Exception {
		
		
	}
	
	public ArrayList<ConsolidadosResumen> getConsolidadosResumensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ConsolidadosResumen> consolidadosresumensSeleccionados=new ArrayList<ConsolidadosResumen>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioConsolidadosResumen) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ConsolidadosResumen consolidadosresumenAux:consolidadosresumenLogic.getConsolidadosResumens()) {
					if(consolidadosresumenAux.getIsSelected()) {
						consolidadosresumensSeleccionados.add(consolidadosresumenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConsolidadosResumen consolidadosresumenAux:this.consolidadosresumens) {
					if(consolidadosresumenAux.getIsSelected()) {
						consolidadosresumensSeleccionados.add(consolidadosresumenAux);				
					}
				}
			}
			
			if(consolidadosresumensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						consolidadosresumensSeleccionados.addAll(this.consolidadosresumenLogic.getConsolidadosResumens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						consolidadosresumensSeleccionados.addAll(this.consolidadosresumens);				
					}
				}
			}
		} else {
			consolidadosresumensSeleccionados.add(this.consolidadosresumen);
		}
		
		return consolidadosresumensSeleccionados;
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
	
	public void generarReporteConsolidadosResumensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalConsolidadosResumensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoConsolidadosResumensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConsolidadosResumensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConsolidadosResumensSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Consolidados Resumen",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesConsolidadosResumensSeleccionados() throws Exception {
		ArrayList<ConsolidadosResumen> consolidadosresumensSeleccionados=new ArrayList<ConsolidadosResumen>();		
		
		consolidadosresumensSeleccionados=this.getConsolidadosResumensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteConsolidadosResumens("Todos",consolidadosresumensSeleccionados);
		
	}	
	
	public void generarReporteNormalConsolidadosResumensSeleccionados() throws Exception {
		ArrayList<ConsolidadosResumen> consolidadosresumensSeleccionados=new ArrayList<ConsolidadosResumen>();		
		
		consolidadosresumensSeleccionados=this.getConsolidadosResumensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteConsolidadosResumens("Todos",consolidadosresumensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionConsolidadosResumensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ConsolidadosResumen> consolidadosresumensSeleccionados=new ArrayList<ConsolidadosResumen>();
		
		consolidadosresumensSeleccionados=this.getConsolidadosResumensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteConsolidadosResumens("Todos",consolidadosresumensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoConsolidadosResumensSeleccionados() throws Exception {
		ArrayList<ConsolidadosResumen> consolidadosresumensSeleccionados=new ArrayList<ConsolidadosResumen>();		
		
		
		this.abrirInicializarFrameReporteDinamicoConsolidadosResumen();
		
		
		consolidadosresumensSeleccionados=this.getConsolidadosResumensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoConsolidadosResumen();
		
		
		//this.generarReporteConsolidadosResumens("Todos",consolidadosresumensSeleccionados ,consolidadosresumenImplementable,consolidadosresumenImplementableHome);
	}
	
	public void mostrarImportacionConsolidadosResumens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionConsolidadosResumen();
		
		this.abrirFrameImportacionConsolidadosResumen();		
		
			
		//this.generarReporteConsolidadosResumens("Todos",consolidadosresumensSeleccionados ,consolidadosresumenImplementable,consolidadosresumenImplementableHome);
	}
	
	public void importarConsolidadosResumens() throws Exception {		
	
	}
	
	public void exportarConsolidadosResumensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelConsolidadosResumensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoConsolidadosResumensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlConsolidadosResumensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Consolidados Resumen",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoConsolidadosResumensSeleccionados() throws Exception {
		ArrayList<ConsolidadosResumen> consolidadosresumensSeleccionados=new ArrayList<ConsolidadosResumen>();		
		
		consolidadosresumensSeleccionados=this.getConsolidadosResumensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consolidadosresumen."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarConsolidadosResumen(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ConsolidadosResumen consolidadosresumenAux:consolidadosresumensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarConsolidadosResumen(consolidadosresumenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//consolidadosresumenAux.setsDetalleGeneralEntityReporte(consolidadosresumenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consolidados Resumen",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarConsolidadosResumen(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ConsolidadosResumenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosResumenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosResumenConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosResumenConstantesFunciones.LABEL_NOMBREEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosResumenConstantesFunciones.LABEL_CODIGOSUBGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUBGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosResumenConstantesFunciones.LABEL_CODIGODETALLEGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosResumenConstantesFunciones.LABEL_NOMBREDETALLEGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosResumenConstantesFunciones.LABEL_CLAVE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosResumenConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosResumenConstantesFunciones.LABEL_FECHACOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosResumenConstantesFunciones.LABEL_VIDAUTIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosResumenConstantesFunciones.LABEL_COSTODECOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosResumenConstantesFunciones.LABEL_CANTIDAD;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarConsolidadosResumen(ConsolidadosResumen consolidadosresumen,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=consolidadosresumen.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosresumen.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosresumen.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosresumen.getnombre_empresa();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosresumen.getnombre_sucursal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosresumen.getcodigo_sub_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosresumen.getnombre_sub_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosresumen.getcodigo_detalle_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosresumen.getnombre_detalle_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosresumen.getclave();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosresumen.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosresumen.getfecha_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosresumen.getvida_util().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosresumen.getcosto_de_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosresumen.getcantidad().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelConsolidadosResumensSeleccionados() throws Exception {
		ArrayList<ConsolidadosResumen> consolidadosresumensSeleccionados=new ArrayList<ConsolidadosResumen>();		
		
		consolidadosresumensSeleccionados=this.getConsolidadosResumensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consolidadosresumen.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ConsolidadosResumens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelConsolidadosResumen(row);				
				iRow++;
			}				
			
			for(ConsolidadosResumen consolidadosresumenAux:consolidadosresumensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelConsolidadosResumen(consolidadosresumenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consolidados Resumen",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlConsolidadosResumensSeleccionados() throws Exception {
		ArrayList<ConsolidadosResumen> consolidadosresumensSeleccionados=new ArrayList<ConsolidadosResumen>();		
		
		consolidadosresumensSeleccionados=this.getConsolidadosResumensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consolidadosresumen.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("consolidadosresumens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("consolidadosresumen");
			//elementRoot.appendChild(element);
		
			for(ConsolidadosResumen consolidadosresumenAux:consolidadosresumensSeleccionados) {
				element = document.createElement("consolidadosresumen");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlConsolidadosResumen(consolidadosresumenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consolidados Resumen",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelConsolidadosResumen(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_NOMBREEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_CODIGOSUBGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUBGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_CLAVE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_FECHACOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_VIDAUTIL);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_COSTODECOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosResumenConstantesFunciones.LABEL_CANTIDAD);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelConsolidadosResumen(ConsolidadosResumen consolidadosresumen,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosresumen.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosresumen.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosresumen.getnombre_empresa());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosresumen.getnombre_sucursal());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosresumen.getcodigo_sub_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosresumen.getnombre_sub_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosresumen.getcodigo_detalle_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosresumen.getnombre_detalle_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosresumen.getclave());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosresumen.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosresumen.getfecha_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosresumen.getvida_util());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosresumen.getcosto_de_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosresumen.getcantidad());				
	}
	
	public void setFilaDatosExportarXmlConsolidadosResumen(ConsolidadosResumen consolidadosresumen,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ConsolidadosResumenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(consolidadosresumen.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ConsolidadosResumenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(consolidadosresumen.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ConsolidadosResumenConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(consolidadosresumen.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre_empresa = document.createElement(ConsolidadosResumenConstantesFunciones.NOMBREEMPRESA);
		elementnombre_empresa.appendChild(document.createTextNode(consolidadosresumen.getnombre_empresa().trim()));
		element.appendChild(elementnombre_empresa);

		Element elementnombre_sucursal = document.createElement(ConsolidadosResumenConstantesFunciones.NOMBRESUCURSAL);
		elementnombre_sucursal.appendChild(document.createTextNode(consolidadosresumen.getnombre_sucursal().trim()));
		element.appendChild(elementnombre_sucursal);

		Element elementcodigo_sub_grupo = document.createElement(ConsolidadosResumenConstantesFunciones.CODIGOSUBGRUPO);
		elementcodigo_sub_grupo.appendChild(document.createTextNode(consolidadosresumen.getcodigo_sub_grupo().trim()));
		element.appendChild(elementcodigo_sub_grupo);

		Element elementnombre_sub_grupo = document.createElement(ConsolidadosResumenConstantesFunciones.NOMBRESUBGRUPO);
		elementnombre_sub_grupo.appendChild(document.createTextNode(consolidadosresumen.getnombre_sub_grupo().trim()));
		element.appendChild(elementnombre_sub_grupo);

		Element elementcodigo_detalle_grupo = document.createElement(ConsolidadosResumenConstantesFunciones.CODIGODETALLEGRUPO);
		elementcodigo_detalle_grupo.appendChild(document.createTextNode(consolidadosresumen.getcodigo_detalle_grupo().trim()));
		element.appendChild(elementcodigo_detalle_grupo);

		Element elementnombre_detalle_grupo = document.createElement(ConsolidadosResumenConstantesFunciones.NOMBREDETALLEGRUPO);
		elementnombre_detalle_grupo.appendChild(document.createTextNode(consolidadosresumen.getnombre_detalle_grupo().trim()));
		element.appendChild(elementnombre_detalle_grupo);

		Element elementclave = document.createElement(ConsolidadosResumenConstantesFunciones.CLAVE);
		elementclave.appendChild(document.createTextNode(consolidadosresumen.getclave().trim()));
		element.appendChild(elementclave);

		Element elementnombre = document.createElement(ConsolidadosResumenConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(consolidadosresumen.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementfecha_compra = document.createElement(ConsolidadosResumenConstantesFunciones.FECHACOMPRA);
		elementfecha_compra.appendChild(document.createTextNode(consolidadosresumen.getfecha_compra().toString().trim()));
		element.appendChild(elementfecha_compra);

		Element elementvida_util = document.createElement(ConsolidadosResumenConstantesFunciones.VIDAUTIL);
		elementvida_util.appendChild(document.createTextNode(consolidadosresumen.getvida_util().toString().trim()));
		element.appendChild(elementvida_util);

		Element elementcosto_de_compra = document.createElement(ConsolidadosResumenConstantesFunciones.COSTODECOMPRA);
		elementcosto_de_compra.appendChild(document.createTextNode(consolidadosresumen.getcosto_de_compra().toString().trim()));
		element.appendChild(elementcosto_de_compra);

		Element elementcantidad = document.createElement(ConsolidadosResumenConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(consolidadosresumen.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);
	}
	
	public void generarReporteGroupGenericoConsolidadosResumensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ConsolidadosResumen> consolidadosresumensSeleccionados=new ArrayList<ConsolidadosResumen>();
		
		consolidadosresumensSeleccionados=this.getConsolidadosResumensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoConsolidadosResumen(consolidadosresumensSeleccionados);
		
		this.generarReporteConsolidadosResumens("Todos",consolidadosresumensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoConsolidadosResumen(ArrayList<ConsolidadosResumen> consolidadosresumensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ConsolidadosResumen consolidadosresumenAux:consolidadosresumensSeleccionados) {
				consolidadosresumenAux.setsDetalleGeneralEntityReporte(consolidadosresumenAux.toString());
			
				if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					consolidadosresumenAux.setsDescripcionGeneralEntityReporte1(consolidadosresumenAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_NOMBREEMPRESA)) {
					existe=true;
					consolidadosresumenAux.setsDescripcionGeneralEntityReporte1(consolidadosresumenAux.getnombre_empresa());
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
					existe=true;
					consolidadosresumenAux.setsDescripcionGeneralEntityReporte1(consolidadosresumenAux.getnombre_sucursal());
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
					existe=true;
					consolidadosresumenAux.setsDescripcionGeneralEntityReporte1(consolidadosresumenAux.getcodigo_sub_grupo());
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
					existe=true;
					consolidadosresumenAux.setsDescripcionGeneralEntityReporte1(consolidadosresumenAux.getnombre_sub_grupo());
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
					existe=true;
					consolidadosresumenAux.setsDescripcionGeneralEntityReporte1(consolidadosresumenAux.getcodigo_detalle_grupo());
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
					existe=true;
					consolidadosresumenAux.setsDescripcionGeneralEntityReporte1(consolidadosresumenAux.getnombre_detalle_grupo());
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_CLAVE)) {
					existe=true;
					consolidadosresumenAux.setsDescripcionGeneralEntityReporte1(consolidadosresumenAux.getclave());
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					consolidadosresumenAux.setsDescripcionGeneralEntityReporte1(consolidadosresumenAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_FECHACOMPRA)) {
					existe=true;
					consolidadosresumenAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(consolidadosresumenAux.getfecha_compra()));
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosResumenConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					consolidadosresumenAux.setsDescripcionGeneralEntityReporte1(consolidadosresumenAux.getcantidad().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosResumenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesConsolidadosResumen(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoConsolidadosResumen=true;
				this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen=true;
				this.isVisibilidadCeldaGuardarCambiosConsolidadosResumen=true;
			}
			
			this.isVisibilidadCeldaModificarConsolidadosResumen=false;
			this.isVisibilidadCeldaActualizarConsolidadosResumen=false;
			this.isVisibilidadCeldaEliminarConsolidadosResumen=false;
			this.isVisibilidadCeldaCancelarConsolidadosResumen=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsolidadosResumen=true;
				} else {
					this.isVisibilidadCeldaGuardarConsolidadosResumen=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoConsolidadosResumen=false;
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen=false;
			this.isVisibilidadCeldaGuardarCambiosConsolidadosResumen=false;
			this.isVisibilidadCeldaModificarConsolidadosResumen=false;
			this.isVisibilidadCeldaActualizarConsolidadosResumen=true;
			this.isVisibilidadCeldaEliminarConsolidadosResumen=false;
			this.isVisibilidadCeldaCancelarConsolidadosResumen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsolidadosResumen=true;
				} else {
					this.isVisibilidadCeldaGuardarConsolidadosResumen=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoConsolidadosResumen=false;
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen=false;
			this.isVisibilidadCeldaGuardarCambiosConsolidadosResumen=false;
			this.isVisibilidadCeldaModificarConsolidadosResumen=false;
			this.isVisibilidadCeldaActualizarConsolidadosResumen=true;
			this.isVisibilidadCeldaEliminarConsolidadosResumen=true;
			this.isVisibilidadCeldaCancelarConsolidadosResumen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsolidadosResumen=true;
				} else {
					this.isVisibilidadCeldaGuardarConsolidadosResumen=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoConsolidadosResumen=false;
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen=false;
			this.isVisibilidadCeldaGuardarCambiosConsolidadosResumen=false;
			this.isVisibilidadCeldaModificarConsolidadosResumen=false;
			this.isVisibilidadCeldaActualizarConsolidadosResumen=true;
			this.isVisibilidadCeldaEliminarConsolidadosResumen=false;
			this.isVisibilidadCeldaCancelarConsolidadosResumen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsolidadosResumen=false;
				} else {
					this.isVisibilidadCeldaGuardarConsolidadosResumen=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoConsolidadosResumen=true;
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen=true;
			this.isVisibilidadCeldaGuardarCambiosConsolidadosResumen=true;
			this.isVisibilidadCeldaModificarConsolidadosResumen=false;
			this.isVisibilidadCeldaActualizarConsolidadosResumen=false;
			this.isVisibilidadCeldaEliminarConsolidadosResumen=false;
			this.isVisibilidadCeldaCancelarConsolidadosResumen=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsolidadosResumen=true;
				} else {
					this.isVisibilidadCeldaGuardarConsolidadosResumen=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoConsolidadosResumen=false;
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen=false;
			this.isVisibilidadCeldaGuardarCambiosConsolidadosResumen=false;
			this.isVisibilidadCeldaActualizarConsolidadosResumen=false;
			this.isVisibilidadCeldaEliminarConsolidadosResumen=false;
			this.isVisibilidadCeldaCancelarConsolidadosResumen=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsolidadosResumen=false;
				} else {
					this.isVisibilidadCeldaGuardarConsolidadosResumen=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoConsolidadosResumen=false;
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen=false;
			this.isVisibilidadCeldaGuardarCambiosConsolidadosResumen=false;
			this.isVisibilidadCeldaModificarConsolidadosResumen=true;
			this.isVisibilidadCeldaActualizarConsolidadosResumen=false;
			this.isVisibilidadCeldaEliminarConsolidadosResumen=false;
			this.isVisibilidadCeldaCancelarConsolidadosResumen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsolidadosResumen=false;
				} else {
					this.isVisibilidadCeldaGuardarConsolidadosResumen=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ConsolidadosResumenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoConsolidadosResumen=true;
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen=true;
			this.isVisibilidadCeldaGuardarCambiosConsolidadosResumen=true;
		} else {
			this.actualizarEstadoPanelsConsolidadosResumen(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarConsolidadosResumen=false;
			//this.isVisibilidadCeldaVerFormConsolidadosResumen=false;
			this.isVisibilidadCeldaDuplicarConsolidadosResumen=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!consolidadosresumenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen=false;
		} else {
			this.isVisibilidadCeldaNuevoConsolidadosResumen=false;
			this.isVisibilidadCeldaGuardarCambiosConsolidadosResumen=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
			if(!consolidadosresumenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen=false;												
			}
			
			this.jButtonCerrarConsolidadosResumen.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen=false;
		}
		
		if(!this.permiteMantenimiento(this.consolidadosresumen)) {
			this.isVisibilidadCeldaActualizarConsolidadosResumen=false;
			this.isVisibilidadCeldaEliminarConsolidadosResumen=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoConsolidadosResumen=false;
		this.isVisibilidadCeldaNuevoRelacionesConsolidadosResumen=false;
		this.isVisibilidadCeldaGuardarCambiosConsolidadosResumen=false;
		//this.isVisibilidadCeldaModificarConsolidadosResumen=true;
		this.isVisibilidadCeldaActualizarConsolidadosResumen=false;
		this.isVisibilidadCeldaEliminarConsolidadosResumen=false;
		//this.isVisibilidadCeldaCancelarConsolidadosResumen=true;			
		this.isVisibilidadCeldaGuardarConsolidadosResumen=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesConsolidadosResumen() {
	}
	
	public void actualizarEstadoPanelsConsolidadosResumen(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionConsolidadosResumen!=null) {
				this.jScrollPanelDatosEdicionConsolidadosResumen.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsolidadosResumen!=null) {
				this.jTabbedPaneBusquedasConsolidadosResumen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsolidadosResumen!=null) {
				this.jScrollPanelDatosConsolidadosResumen.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsolidadosResumen!=null) {
				this.jPanelPaginacionConsolidadosResumen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsolidadosResumen!=null) {
				this.jPanelParametrosReportesConsolidadosResumen.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionConsolidadosResumen!=null) {
				this.jScrollPanelDatosEdicionConsolidadosResumen.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsolidadosResumen!=null) {
				this.jTabbedPaneBusquedasConsolidadosResumen.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosConsolidadosResumen!=null) {
				this.jScrollPanelDatosConsolidadosResumen.setVisible(false);
			}
			
			if(this.jPanelPaginacionConsolidadosResumen!=null) {
				this.jPanelPaginacionConsolidadosResumen.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConsolidadosResumen!=null) {
				this.jPanelParametrosReportesConsolidadosResumen.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionConsolidadosResumen!=null) {
				this.jScrollPanelDatosEdicionConsolidadosResumen.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsolidadosResumen!=null) {
				this.jTabbedPaneBusquedasConsolidadosResumen.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConsolidadosResumen!=null) {
				this.jScrollPanelDatosConsolidadosResumen.setVisible(false);
			}
			
			if(this.jPanelPaginacionConsolidadosResumen!=null) {
				this.jPanelPaginacionConsolidadosResumen.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConsolidadosResumen!=null) {
				this.jPanelParametrosReportesConsolidadosResumen.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionConsolidadosResumen!=null) {
				this.jScrollPanelDatosEdicionConsolidadosResumen.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsolidadosResumen!=null) {
				this.jTabbedPaneBusquedasConsolidadosResumen.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConsolidadosResumen!=null) {
				this.jScrollPanelDatosConsolidadosResumen.setVisible(false);
			}
			
			if(this.jPanelPaginacionConsolidadosResumen!=null) {
				this.jPanelPaginacionConsolidadosResumen.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConsolidadosResumen!=null) {
				this.jPanelParametrosReportesConsolidadosResumen.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionConsolidadosResumen!=null) {
				this.jScrollPanelDatosEdicionConsolidadosResumen.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsolidadosResumen!=null) {
				this.jTabbedPaneBusquedasConsolidadosResumen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsolidadosResumen!=null) {
				this.jScrollPanelDatosConsolidadosResumen.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsolidadosResumen!=null) {
				this.jPanelPaginacionConsolidadosResumen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsolidadosResumen!=null) {
				this.jPanelParametrosReportesConsolidadosResumen.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionConsolidadosResumen!=null) {
				this.jScrollPanelDatosEdicionConsolidadosResumen.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsolidadosResumen!=null) {
				this.jTabbedPaneBusquedasConsolidadosResumen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsolidadosResumen!=null) {
				this.jScrollPanelDatosConsolidadosResumen.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsolidadosResumen!=null) {
				this.jPanelPaginacionConsolidadosResumen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsolidadosResumen!=null) {
				this.jPanelParametrosReportesConsolidadosResumen.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionConsolidadosResumen!=null) {
				this.jScrollPanelDatosEdicionConsolidadosResumen.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsolidadosResumen!=null) {
				this.jTabbedPaneBusquedasConsolidadosResumen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsolidadosResumen!=null) {
				this.jScrollPanelDatosConsolidadosResumen.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsolidadosResumen!=null) {
				this.jPanelPaginacionConsolidadosResumen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsolidadosResumen!=null) {
				this.jPanelParametrosReportesConsolidadosResumen.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasConsolidadosResumen!=null) {
					this.jTabbedPaneBusquedasConsolidadosResumen.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesConsolidadosResumen!=null) {
				this.jPanelParametrosReportesConsolidadosResumen.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsolidadosResumen!=null) {
				this.jTabbedPaneBusquedasConsolidadosResumen.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesConsolidadosResumen!=null) {
				this.jPanelParametrosReportesConsolidadosResumen.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaConsolidadosResumen=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaConsolidadosResumen) {this.jTabbedPaneBusquedasConsolidadosResumen.remove(jPanelBusquedaConsolidadosResumenConsolidadosResumen);}
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
			
			this.inicializarActualizarBindingTablaConsolidadosResumen(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioConsolidadosResumen() {
		this.updateBorderResaltarBusquedasFormularioConsolidadosResumen();
		this.updateVisibilidadBusquedasFormularioConsolidadosResumen();
		this.updateHabilitarBusquedasFormularioConsolidadosResumen();
	}
	
	public void updateBorderResaltarBusquedasFormularioConsolidadosResumen() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasConsolidadosResumen.getComponents().length>0) {
	

		if(this.consolidadosresumenConstantesFunciones.resaltarBusquedaConsolidadosResumenConsolidadosResumen!=null) {
			index= this.jTabbedPaneBusquedasConsolidadosResumen.indexOfComponent(this.jPanelBusquedaConsolidadosResumenConsolidadosResumen);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConsolidadosResumen.getComponent(index);
				jPanel.setBorder(this.consolidadosresumenConstantesFunciones.resaltarBusquedaConsolidadosResumenConsolidadosResumen);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioConsolidadosResumen() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasConsolidadosResumen.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConsolidadosResumen.indexOfComponent(this.jPanelBusquedaConsolidadosResumenConsolidadosResumen);
			jPanel=(JPanel)this.jTabbedPaneBusquedasConsolidadosResumen.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.consolidadosresumenConstantesFunciones.mostrarBusquedaConsolidadosResumenConsolidadosResumen);
			if(!this.consolidadosresumenConstantesFunciones.mostrarBusquedaConsolidadosResumenConsolidadosResumen && index>-1) {
				this.jTabbedPaneBusquedasConsolidadosResumen.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioConsolidadosResumen() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasConsolidadosResumen.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConsolidadosResumen.indexOfComponent(this.jPanelBusquedaConsolidadosResumenConsolidadosResumen);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasConsolidadosResumen.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.consolidadosresumenConstantesFunciones.activarBusquedaConsolidadosResumenConsolidadosResumen);
				this.jTabbedPaneBusquedasConsolidadosResumen.setEnabledAt(index,this.consolidadosresumenConstantesFunciones.activarBusquedaConsolidadosResumenConsolidadosResumen);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaConsolidadosResumen(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaConsolidadosResumen")) {
			index= this.jTabbedPaneBusquedasConsolidadosResumen.indexOfComponent(this.jPanelBusquedaConsolidadosResumenConsolidadosResumen);

			this.jTabbedPaneBusquedasConsolidadosResumen.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConsolidadosResumen.getComponent(index);

			this.consolidadosresumenConstantesFunciones.setResaltarBusquedaConsolidadosResumenConsolidadosResumen(resaltar);

			jPanel.setBorder(this.consolidadosresumenConstantesFunciones.resaltarBusquedaConsolidadosResumenConsolidadosResumen);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarConsolidadosResumen.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioConsolidadosResumen() throws Exception {

		if(this.jInternalFrameDetalleFormConsolidadosResumen==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioConsolidadosResumen();
		this.updateVisibilidadResaltarControlesFormularioConsolidadosResumen();
		this.updateHabilitarResaltarControlesFormularioConsolidadosResumen();
		
	}
	
	public void updateBorderResaltarControlesFormularioConsolidadosResumen() throws Exception {
		if(this.jInternalFrameDetalleFormConsolidadosResumen==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.consolidadosresumenConstantesFunciones.resaltaridConsolidadosResumen!=null && this.jInternalFrameDetalleFormConsolidadosResumen!=null) {this.jInternalFrameDetalleFormConsolidadosResumen.jLabelidConsolidadosResumen.setBorder(this.consolidadosresumenConstantesFunciones.resaltaridConsolidadosResumen);}
		if(this.consolidadosresumenConstantesFunciones.resaltarid_empresaConsolidadosResumen!=null && this.jInternalFrameDetalleFormConsolidadosResumen!=null) {this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxid_empresaConsolidadosResumen.setBorder(this.consolidadosresumenConstantesFunciones.resaltarid_empresaConsolidadosResumen);}
		if(this.consolidadosresumenConstantesFunciones.resaltarnombre_empresaConsolidadosResumen!=null && this.jInternalFrameDetalleFormConsolidadosResumen!=null) {this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_empresaConsolidadosResumen.setBorder(this.consolidadosresumenConstantesFunciones.resaltarnombre_empresaConsolidadosResumen);}
		if(this.consolidadosresumenConstantesFunciones.resaltarnombre_sucursalConsolidadosResumen!=null && this.jInternalFrameDetalleFormConsolidadosResumen!=null) {this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_sucursalConsolidadosResumen.setBorder(this.consolidadosresumenConstantesFunciones.resaltarnombre_sucursalConsolidadosResumen);}
		if(this.consolidadosresumenConstantesFunciones.resaltarcodigo_sub_grupoConsolidadosResumen!=null && this.jInternalFrameDetalleFormConsolidadosResumen!=null) {this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcodigo_sub_grupoConsolidadosResumen.setBorder(this.consolidadosresumenConstantesFunciones.resaltarcodigo_sub_grupoConsolidadosResumen);}
		if(this.consolidadosresumenConstantesFunciones.resaltarnombre_sub_grupoConsolidadosResumen!=null && this.jInternalFrameDetalleFormConsolidadosResumen!=null) {this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_sub_grupoConsolidadosResumen.setBorder(this.consolidadosresumenConstantesFunciones.resaltarnombre_sub_grupoConsolidadosResumen);}
		if(this.consolidadosresumenConstantesFunciones.resaltarcodigo_detalle_grupoConsolidadosResumen!=null && this.jInternalFrameDetalleFormConsolidadosResumen!=null) {this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcodigo_detalle_grupoConsolidadosResumen.setBorder(this.consolidadosresumenConstantesFunciones.resaltarcodigo_detalle_grupoConsolidadosResumen);}
		if(this.consolidadosresumenConstantesFunciones.resaltarnombre_detalle_grupoConsolidadosResumen!=null && this.jInternalFrameDetalleFormConsolidadosResumen!=null) {this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_detalle_grupoConsolidadosResumen.setBorder(this.consolidadosresumenConstantesFunciones.resaltarnombre_detalle_grupoConsolidadosResumen);}
		if(this.consolidadosresumenConstantesFunciones.resaltarclaveConsolidadosResumen!=null && this.jInternalFrameDetalleFormConsolidadosResumen!=null) {this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldclaveConsolidadosResumen.setBorder(this.consolidadosresumenConstantesFunciones.resaltarclaveConsolidadosResumen);}
		if(this.consolidadosresumenConstantesFunciones.resaltarnombreConsolidadosResumen!=null && this.jInternalFrameDetalleFormConsolidadosResumen!=null) {this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombreConsolidadosResumen.setBorder(this.consolidadosresumenConstantesFunciones.resaltarnombreConsolidadosResumen);}
		if(this.consolidadosresumenConstantesFunciones.resaltarfecha_compraConsolidadosResumen!=null && this.jInternalFrameDetalleFormConsolidadosResumen!=null) {this.jInternalFrameDetalleFormConsolidadosResumen.jDateChooserfecha_compraConsolidadosResumen.setBorder(this.consolidadosresumenConstantesFunciones.resaltarfecha_compraConsolidadosResumen);}
		if(this.consolidadosresumenConstantesFunciones.resaltarvida_utilConsolidadosResumen!=null && this.jInternalFrameDetalleFormConsolidadosResumen!=null) {this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldvida_utilConsolidadosResumen.setBorder(this.consolidadosresumenConstantesFunciones.resaltarvida_utilConsolidadosResumen);}
		if(this.consolidadosresumenConstantesFunciones.resaltarcosto_de_compraConsolidadosResumen!=null && this.jInternalFrameDetalleFormConsolidadosResumen!=null) {this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcosto_de_compraConsolidadosResumen.setBorder(this.consolidadosresumenConstantesFunciones.resaltarcosto_de_compraConsolidadosResumen);}
		if(this.consolidadosresumenConstantesFunciones.resaltarcantidadConsolidadosResumen!=null && this.jInternalFrameDetalleFormConsolidadosResumen!=null) {this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcantidadConsolidadosResumen.setBorder(this.consolidadosresumenConstantesFunciones.resaltarcantidadConsolidadosResumen);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioConsolidadosResumen() throws Exception {		
		if(this.jInternalFrameDetalleFormConsolidadosResumen==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
	
		//this.jInternalFrameDetalleFormConsolidadosResumen.jLabelidConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostraridConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jPanelidConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostraridConsolidadosResumen);
		//this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxid_empresaConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarid_empresaConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jPanelid_empresaConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarid_empresaConsolidadosResumen);
		//this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_empresaConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarnombre_empresaConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jPanelnombre_empresaConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarnombre_empresaConsolidadosResumen);
		//this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_sucursalConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarnombre_sucursalConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jPanelnombre_sucursalConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarnombre_sucursalConsolidadosResumen);
		//this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcodigo_sub_grupoConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarcodigo_sub_grupoConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jPanelcodigo_sub_grupoConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarcodigo_sub_grupoConsolidadosResumen);
		//this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_sub_grupoConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarnombre_sub_grupoConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jPanelnombre_sub_grupoConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarnombre_sub_grupoConsolidadosResumen);
		//this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcodigo_detalle_grupoConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarcodigo_detalle_grupoConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jPanelcodigo_detalle_grupoConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarcodigo_detalle_grupoConsolidadosResumen);
		//this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_detalle_grupoConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarnombre_detalle_grupoConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jPanelnombre_detalle_grupoConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarnombre_detalle_grupoConsolidadosResumen);
		//this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldclaveConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarclaveConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jPanelclaveConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarclaveConsolidadosResumen);
		//this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombreConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarnombreConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jPanelnombreConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarnombreConsolidadosResumen);
		//this.jInternalFrameDetalleFormConsolidadosResumen.jDateChooserfecha_compraConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarfecha_compraConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jPanelfecha_compraConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarfecha_compraConsolidadosResumen);
		//this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldvida_utilConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarvida_utilConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jPanelvida_utilConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarvida_utilConsolidadosResumen);
		//this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcosto_de_compraConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarcosto_de_compraConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jPanelcosto_de_compraConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarcosto_de_compraConsolidadosResumen);
		//this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcantidadConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarcantidadConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jPanelcantidadConsolidadosResumen.setVisible(this.consolidadosresumenConstantesFunciones.mostrarcantidadConsolidadosResumen);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioConsolidadosResumen() throws Exception {
		if(this.jInternalFrameDetalleFormConsolidadosResumen==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConsolidadosResumen!=null) {
	
		this.jInternalFrameDetalleFormConsolidadosResumen.jLabelidConsolidadosResumen.setEnabled(this.consolidadosresumenConstantesFunciones.activaridConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jComboBoxid_empresaConsolidadosResumen.setEnabled(this.consolidadosresumenConstantesFunciones.activarid_empresaConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_empresaConsolidadosResumen.setEnabled(this.consolidadosresumenConstantesFunciones.activarnombre_empresaConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_sucursalConsolidadosResumen.setEnabled(this.consolidadosresumenConstantesFunciones.activarnombre_sucursalConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcodigo_sub_grupoConsolidadosResumen.setEnabled(this.consolidadosresumenConstantesFunciones.activarcodigo_sub_grupoConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_sub_grupoConsolidadosResumen.setEnabled(this.consolidadosresumenConstantesFunciones.activarnombre_sub_grupoConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcodigo_detalle_grupoConsolidadosResumen.setEnabled(this.consolidadosresumenConstantesFunciones.activarcodigo_detalle_grupoConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombre_detalle_grupoConsolidadosResumen.setEnabled(this.consolidadosresumenConstantesFunciones.activarnombre_detalle_grupoConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldclaveConsolidadosResumen.setEnabled(this.consolidadosresumenConstantesFunciones.activarclaveConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextAreanombreConsolidadosResumen.setEnabled(this.consolidadosresumenConstantesFunciones.activarnombreConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jDateChooserfecha_compraConsolidadosResumen.setEnabled(this.consolidadosresumenConstantesFunciones.activarfecha_compraConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldvida_utilConsolidadosResumen.setEnabled(this.consolidadosresumenConstantesFunciones.activarvida_utilConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcosto_de_compraConsolidadosResumen.setEnabled(this.consolidadosresumenConstantesFunciones.activarcosto_de_compraConsolidadosResumen);
		this.jInternalFrameDetalleFormConsolidadosResumen.jTextFieldcantidadConsolidadosResumen.setEnabled(this.consolidadosresumenConstantesFunciones.activarcantidadConsolidadosResumen);
		}
	}
	
		
}