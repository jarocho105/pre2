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

//import com.bydan.erp.activosfijos.util.ConsolidadosDetalleConstantesFunciones;
import com.bydan.erp.activosfijos.util.report.ConsolidadosDetalleParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.report.ConsolidadosDetalleParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.report.ConsolidadosDetalleBean;
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
public class ConsolidadosDetalleBeanSwingJInternalFrame extends ConsolidadosDetalleJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ConsolidadosDetalleBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ConsolidadosDetalle> consolidadosdetalleValidator = new ClassValidator<ConsolidadosDetalle>(ConsolidadosDetalle.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ConsolidadosDetalle consolidadosdetalle;	
	public ConsolidadosDetalle consolidadosdetalleAux;
	public ConsolidadosDetalle consolidadosdetalleAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ConsolidadosDetalle consolidadosdetalleTotales;
	public Long idConsolidadosDetalleActual;
	public Long iIdNuevoConsolidadosDetalle=0L;
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
	
	public Boolean isPermisoTodoConsolidadosDetalle;
	public Boolean isPermisoNuevoConsolidadosDetalle;
	public Boolean isPermisoActualizarConsolidadosDetalle;
	public Boolean isPermisoActualizarOriginalConsolidadosDetalle;
	public Boolean isPermisoEliminarConsolidadosDetalle;
	public Boolean isPermisoGuardarCambiosConsolidadosDetalle;
	public Boolean isPermisoConsultaConsolidadosDetalle;
	public Boolean isPermisoBusquedaConsolidadosDetalle;
	public Boolean isPermisoReporteConsolidadosDetalle;
	public Boolean isPermisoPaginacionMedioConsolidadosDetalle;
	public Boolean isPermisoPaginacionAltoConsolidadosDetalle;
	public Boolean isPermisoPaginacionTodoConsolidadosDetalle;
	public Boolean isPermisoCopiarConsolidadosDetalle;
	public Boolean isPermisoVerFormConsolidadosDetalle;
	public Boolean isPermisoDuplicarConsolidadosDetalle;
	public Boolean isPermisoOrdenConsolidadosDetalle;
	
	
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
	
	public ConsolidadosDetalleParameterReturnGeneral consolidadosdetalleReturnGeneral;
	public ConsolidadosDetalleParameterReturnGeneral consolidadosdetalleParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoConsolidadosDetalle=false;
	public Boolean esParaAccionDesdeFormularioConsolidadosDetalle=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ConsolidadosDetalleSessionBeanAdditional consolidadosdetalleSessionBeanAdditional=null;
	
	public ConsolidadosDetalleSessionBeanAdditional getConsolidadosDetalleSessionBeanAdditional() {
		return this.consolidadosdetalleSessionBeanAdditional;
	}
	
	public void setConsolidadosDetalleSessionBeanAdditional(ConsolidadosDetalleSessionBeanAdditional consolidadosdetalleSessionBeanAdditional) {
		try {
			this.consolidadosdetalleSessionBeanAdditional=consolidadosdetalleSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ConsolidadosDetalleBeanSwingJInternalFrameAdditional consolidadosdetalleBeanSwingJInternalFrameAdditional=null;
	//public class ConsolidadosDetalleBeanSwingJInternalFrame
	
	public ConsolidadosDetalleBeanSwingJInternalFrameAdditional getConsolidadosDetalleBeanSwingJInternalFrameAdditional() {
		return this.consolidadosdetalleBeanSwingJInternalFrameAdditional;
	}
	
	public void setConsolidadosDetalleBeanSwingJInternalFrameAdditional(ConsolidadosDetalleBeanSwingJInternalFrameAdditional consolidadosdetalleBeanSwingJInternalFrameAdditional) {
		try {
			this.consolidadosdetalleBeanSwingJInternalFrameAdditional=consolidadosdetalleBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ConsolidadosDetalleLogic consolidadosdetalleLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ConsolidadosDetalle consolidadosdetalleBean;
	public ConsolidadosDetalleConstantesFunciones consolidadosdetalleConstantesFunciones;
	//public ConsolidadosDetalleParameterReturnGeneral consolidadosdetalleReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<ConsolidadosDetalle> consolidadosdetalles;	
	//public List<ConsolidadosDetalle> consolidadosdetallesEliminados;
	//public List<ConsolidadosDetalle> consolidadosdetallesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoConsolidadosDetalle=false;
	public Boolean isVisibilidadCeldaDuplicarConsolidadosDetalle=true;
	public Boolean isVisibilidadCeldaCopiarConsolidadosDetalle=true;
	public Boolean isVisibilidadCeldaVerFormConsolidadosDetalle=true;
	public Boolean isVisibilidadCeldaOrdenConsolidadosDetalle=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle=false;
	public Boolean isVisibilidadCeldaModificarConsolidadosDetalle=false;
	public Boolean isVisibilidadCeldaActualizarConsolidadosDetalle=false;
	public Boolean isVisibilidadCeldaEliminarConsolidadosDetalle=false;
	public Boolean isVisibilidadCeldaCancelarConsolidadosDetalle=false;
	public Boolean isVisibilidadCeldaGuardarConsolidadosDetalle=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosConsolidadosDetalle=false;	
	
	
	public Boolean isVisibilidadBusquedaConsolidadosDetalle=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoConsolidadosDetalle() {
		return this.iIdNuevoConsolidadosDetalle;
	}

	public void setiIdNuevoConsolidadosDetalle(Long iIdNuevoConsolidadosDetalle) {
		this.iIdNuevoConsolidadosDetalle = iIdNuevoConsolidadosDetalle;
	}
	
	public Long getidConsolidadosDetalleActual() {
		return this.idConsolidadosDetalleActual;
	}

	public void setidConsolidadosDetalleActual(Long idConsolidadosDetalleActual) {
		this.idConsolidadosDetalleActual = idConsolidadosDetalleActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ConsolidadosDetalle getconsolidadosdetalle() {
		return this.consolidadosdetalle;
	}

	public void setconsolidadosdetalle(ConsolidadosDetalle consolidadosdetalle) {
		this.consolidadosdetalle = consolidadosdetalle;
	}
	
	public ConsolidadosDetalle getconsolidadosdetalleAux() {
		return this.consolidadosdetalleAux;
	}

	public void setconsolidadosdetalleAux(ConsolidadosDetalle consolidadosdetalleAux) {
		this.consolidadosdetalleAux = consolidadosdetalleAux;
	}				
	
	public ConsolidadosDetalle getconsolidadosdetalleAnterior() {
		return this.consolidadosdetalleAnterior;
	}

	public void setconsolidadosdetalleAnterior(ConsolidadosDetalle consolidadosdetalleAnterior) {
		this.consolidadosdetalleAnterior = consolidadosdetalleAnterior;
	}	
	
	public ConsolidadosDetalle getconsolidadosdetalleTotales() {
		return this.consolidadosdetalleTotales;
	}

	public void setconsolidadosdetalleTotales(ConsolidadosDetalle consolidadosdetalleTotales) {
		this.consolidadosdetalleTotales = consolidadosdetalleTotales;
	}	
	
	public ConsolidadosDetalle getconsolidadosdetalleBean() {
		return this.consolidadosdetalleBean;
	}

	public void setconsolidadosdetalleBean(ConsolidadosDetalle consolidadosdetalleBean) {
		this.consolidadosdetalleBean = consolidadosdetalleBean;
	}	
	
	public ConsolidadosDetalleParameterReturnGeneral getconsolidadosdetalleReturnGeneral() {
		return this.consolidadosdetalleReturnGeneral;
	}

	public void setconsolidadosdetalleReturnGeneral(ConsolidadosDetalleParameterReturnGeneral consolidadosdetalleReturnGeneral) {
		this.consolidadosdetalleReturnGeneral = consolidadosdetalleReturnGeneral;
	}	
	
	
	public Long idBusquedaConsolidadosDetalle=0L;

	public Long getidBusquedaConsolidadosDetalle() {
		return this.idBusquedaConsolidadosDetalle;
	}

	public void setidBusquedaConsolidadosDetalle(Long idBusquedaConsolidadosDetalle) {
		this.idBusquedaConsolidadosDetalle = idBusquedaConsolidadosDetalle;
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
	
	
	public ConsolidadosDetalleLogic getConsolidadosDetalleLogic()	{		
		return consolidadosdetalleLogic;
	}

	public void setConsolidadosDetalleLogic(ConsolidadosDetalleLogic consolidadosdetalleLogic) {
		this.consolidadosdetalleLogic = consolidadosdetalleLogic;
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
	
	public Boolean getIsEsNuevoConsolidadosDetalle() {
		return isEsNuevoConsolidadosDetalle;
	}

	public void setIsEsNuevoConsolidadosDetalle(Boolean isEsNuevoConsolidadosDetalle) {
		this.isEsNuevoConsolidadosDetalle = isEsNuevoConsolidadosDetalle;
	}

	public Boolean getEsParaAccionDesdeFormularioConsolidadosDetalle() {
		return esParaAccionDesdeFormularioConsolidadosDetalle;
	}
	
	public void setEsParaAccionDesdeFormularioConsolidadosDetalle(Boolean esParaAccionDesdeFormularioConsolidadosDetalle) {
		this.esParaAccionDesdeFormularioConsolidadosDetalle = esParaAccionDesdeFormularioConsolidadosDetalle;
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

			if(this.consolidadosdetalleSessionBean==null) {
				this.consolidadosdetalleSessionBean=new ConsolidadosDetalleSessionBean();
			}

			if(!this.consolidadosdetalleSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(consolidadosdetalleSessionBean.getlidEmpresaActual());
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

					if(this.consolidadosdetalle!=null) {
						this.consolidadosdetalle.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
						this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxid_empresaConsolidadosDetalle.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaConsolidadosDetalle.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
						if(this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxid_empresaConsolidadosDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxid_empresaConsolidadosDetalle.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaConsolidadosDetalleGenerico)throws Exception
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
				jComboBoxid_empresaConsolidadosDetalleGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaConsolidadosDetalleGenerico!=null && jComboBoxid_empresaConsolidadosDetalleGenerico.getItemCount()>0) {
					jComboBoxid_empresaConsolidadosDetalleGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ConsolidadosDetalle consolidadosdetalle,JComboBox jComboBoxid_empresaConsolidadosDetalleGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaConsolidadosDetalleGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxid_empresaConsolidadosDetalle.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaConsolidadosDetalleGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				consolidadosdetalle.setid_empresa(empresaAux.getId());
				consolidadosdetalle.setempresa_descripcion(ConsolidadosDetalleConstantesFunciones.getEmpresaDescripcion(empresaAux));
				consolidadosdetalle.setEmpresa(empresaAux);			}
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

					if(!ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { 
							this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxid_empresaConsolidadosDetalle.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxid_empresaConsolidadosDetalle.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { 
					}

					if(!ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
							this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxid_empresaConsolidadosDetalle.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
							this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxid_empresaConsolidadosDetalle.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesConsolidadosDetalle() throws Exception {
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
		
	public ConsolidadosDetalleParameterReturnGeneral getConsolidadosDetalleParameterGeneral() {
		return this.consolidadosdetalleParameterGeneral;
	}
	
	public void setConsolidadosDetalleParameterGeneral(ConsolidadosDetalleParameterReturnGeneral consolidadosdetalleParameterGeneral) {
		this.consolidadosdetalleParameterGeneral = consolidadosdetalleParameterGeneral;
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
	
	public Boolean getIsPermisoTodoConsolidadosDetalle() {
		return isPermisoTodoConsolidadosDetalle;
	}

	public void setIsPermisoTodoConsolidadosDetalle(Boolean isPermisoTodoConsolidadosDetalle) {
		this.isPermisoTodoConsolidadosDetalle = isPermisoTodoConsolidadosDetalle;
	}

	public Boolean getIsPermisoNuevoConsolidadosDetalle() {
		return isPermisoNuevoConsolidadosDetalle;
	}

	public void setIsPermisoNuevoConsolidadosDetalle(Boolean isPermisoNuevoConsolidadosDetalle) {
		this.isPermisoNuevoConsolidadosDetalle = isPermisoNuevoConsolidadosDetalle;
	}

	public Boolean getIsPermisoActualizarConsolidadosDetalle() {
		return isPermisoActualizarConsolidadosDetalle;
	}

	public void setIsPermisoActualizarConsolidadosDetalle(Boolean isPermisoActualizarConsolidadosDetalle) {
		this.isPermisoActualizarConsolidadosDetalle = isPermisoActualizarConsolidadosDetalle;
	}

	public Boolean getIsPermisoEliminarConsolidadosDetalle() {
		return isPermisoEliminarConsolidadosDetalle;
	}

	public void setIsPermisoEliminarConsolidadosDetalle(Boolean isPermisoEliminarConsolidadosDetalle) {
		this.isPermisoEliminarConsolidadosDetalle = isPermisoEliminarConsolidadosDetalle;
	}

	public Boolean getIsPermisoGuardarCambiosConsolidadosDetalle() {
		return isPermisoGuardarCambiosConsolidadosDetalle;
	}

	public void setIsPermisoGuardarCambiosConsolidadosDetalle(Boolean isPermisoGuardarCambiosConsolidadosDetalle) {
		this.isPermisoGuardarCambiosConsolidadosDetalle = isPermisoGuardarCambiosConsolidadosDetalle;
	}
	
	public Boolean getIsPermisoConsultaConsolidadosDetalle() {
		return isPermisoConsultaConsolidadosDetalle;
	}

	public void setIsPermisoConsultaConsolidadosDetalle(Boolean isPermisoConsultaConsolidadosDetalle) {
		this.isPermisoConsultaConsolidadosDetalle = isPermisoConsultaConsolidadosDetalle;
	}

	public Boolean getIsPermisoBusquedaConsolidadosDetalle() {
		return isPermisoBusquedaConsolidadosDetalle;
	}

	public void setIsPermisoBusquedaConsolidadosDetalle(Boolean isPermisoBusquedaConsolidadosDetalle) {
		this.isPermisoBusquedaConsolidadosDetalle = isPermisoBusquedaConsolidadosDetalle;
	}

	public Boolean getIsPermisoReporteConsolidadosDetalle() {
		return isPermisoReporteConsolidadosDetalle;
	}

	public void setIsPermisoReporteConsolidadosDetalle(Boolean isPermisoReporteConsolidadosDetalle) {
		this.isPermisoReporteConsolidadosDetalle = isPermisoReporteConsolidadosDetalle;
	}
	
	public Boolean getIsPermisoPaginacionMedioConsolidadosDetalle() {
		return isPermisoPaginacionMedioConsolidadosDetalle;
	}

	public void setIsPermisoPaginacionMedioConsolidadosDetalle(Boolean isPermisoPaginacionMedioConsolidadosDetalle) {
		this.isPermisoPaginacionMedioConsolidadosDetalle = isPermisoPaginacionMedioConsolidadosDetalle;
	}
	
	public Boolean getIsPermisoPaginacionTodoConsolidadosDetalle() {
		return isPermisoPaginacionTodoConsolidadosDetalle;
	}

	public void setIsPermisoPaginacionTodoConsolidadosDetalle(Boolean isPermisoPaginacionTodoConsolidadosDetalle) {
		this.isPermisoPaginacionTodoConsolidadosDetalle = isPermisoPaginacionTodoConsolidadosDetalle;
	}
	
	public Boolean getIsPermisoPaginacionAltoConsolidadosDetalle() {
		return isPermisoPaginacionAltoConsolidadosDetalle;
	}

	public void setIsPermisoPaginacionAltoConsolidadosDetalle(Boolean isPermisoPaginacionAltoConsolidadosDetalle) {
		this.isPermisoPaginacionAltoConsolidadosDetalle = isPermisoPaginacionAltoConsolidadosDetalle;
	}
	
	public Boolean getIsPermisoCopiarConsolidadosDetalle() {
		return isPermisoCopiarConsolidadosDetalle;
	}

	public void setIsPermisoCopiarConsolidadosDetalle(Boolean isPermisoCopiarConsolidadosDetalle) {
		this.isPermisoCopiarConsolidadosDetalle = isPermisoCopiarConsolidadosDetalle;
	}
	
	public Boolean getIsPermisoVerFormConsolidadosDetalle() {
		return isPermisoVerFormConsolidadosDetalle;
	}

	public void setIsPermisoVerFormConsolidadosDetalle(Boolean isPermisoVerFormConsolidadosDetalle) {
		this.isPermisoVerFormConsolidadosDetalle = isPermisoVerFormConsolidadosDetalle;
	}
	
	public Boolean getIsPermisoDuplicarConsolidadosDetalle() {
		return isPermisoDuplicarConsolidadosDetalle;
	}

	public void setIsPermisoDuplicarConsolidadosDetalle(Boolean isPermisoDuplicarConsolidadosDetalle) {
		this.isPermisoDuplicarConsolidadosDetalle = isPermisoDuplicarConsolidadosDetalle;
	}
	
	public Boolean getIsPermisoOrdenConsolidadosDetalle() {
		return isPermisoOrdenConsolidadosDetalle;
	}

	public void setIsPermisoOrdenConsolidadosDetalle(Boolean isPermisoOrdenConsolidadosDetalle) {
		this.isPermisoOrdenConsolidadosDetalle = isPermisoOrdenConsolidadosDetalle;
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
	
	public Boolean getIsVisibilidadCeldaNuevoConsolidadosDetalle() {
		return isVisibilidadCeldaNuevoConsolidadosDetalle;
	}

	public void setIsVisibilidadCeldaNuevoConsolidadosDetalle(Boolean isVisibilidadCeldaNuevoConsolidadosDetalle) {
		this.isVisibilidadCeldaNuevoConsolidadosDetalle = isVisibilidadCeldaNuevoConsolidadosDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarConsolidadosDetalle() {
		return isVisibilidadCeldaDuplicarConsolidadosDetalle;
	}

	public void setIsVisibilidadCeldaDuplicarConsolidadosDetalle(Boolean isVisibilidadCeldaDuplicarConsolidadosDetalle) {
		this.isVisibilidadCeldaDuplicarConsolidadosDetalle = isVisibilidadCeldaDuplicarConsolidadosDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarConsolidadosDetalle() {
		return isVisibilidadCeldaCopiarConsolidadosDetalle;
	}

	public void setIsVisibilidadCeldaCopiarConsolidadosDetalle(Boolean isVisibilidadCeldaCopiarConsolidadosDetalle) {
		this.isVisibilidadCeldaCopiarConsolidadosDetalle = isVisibilidadCeldaCopiarConsolidadosDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormConsolidadosDetalle() {
		return isVisibilidadCeldaVerFormConsolidadosDetalle;
	}

	public void setIsVisibilidadCeldaVerFormConsolidadosDetalle(Boolean isVisibilidadCeldaVerFormConsolidadosDetalle) {
		this.isVisibilidadCeldaVerFormConsolidadosDetalle = isVisibilidadCeldaVerFormConsolidadosDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenConsolidadosDetalle() {
		return isVisibilidadCeldaOrdenConsolidadosDetalle;
	}

	public void setIsVisibilidadCeldaOrdenConsolidadosDetalle(Boolean isVisibilidadCeldaOrdenConsolidadosDetalle) {
		this.isVisibilidadCeldaOrdenConsolidadosDetalle = isVisibilidadCeldaOrdenConsolidadosDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesConsolidadosDetalle() {
		return isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesConsolidadosDetalle(Boolean isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle) {
		this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle = isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaModificarConsolidadosDetalle() {
		return isVisibilidadCeldaModificarConsolidadosDetalle;
	}

	public void setIsVisibilidadCeldaModificarConsolidadosDetalle(Boolean isVisibilidadCeldaModificarConsolidadosDetalle) {
		this.isVisibilidadCeldaModificarConsolidadosDetalle = isVisibilidadCeldaModificarConsolidadosDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarConsolidadosDetalle() {
		return isVisibilidadCeldaActualizarConsolidadosDetalle;
	}

	public void setIsVisibilidadCeldaActualizarConsolidadosDetalle(Boolean isVisibilidadCeldaActualizarConsolidadosDetalle) {
		this.isVisibilidadCeldaActualizarConsolidadosDetalle = isVisibilidadCeldaActualizarConsolidadosDetalle;
	}

	public Boolean getIsVisibilidadCeldaEliminarConsolidadosDetalle() {
		return isVisibilidadCeldaEliminarConsolidadosDetalle;
	}

	public void setIsVisibilidadCeldaEliminarConsolidadosDetalle(Boolean isVisibilidadCeldaEliminarConsolidadosDetalle) {
		this.isVisibilidadCeldaEliminarConsolidadosDetalle = isVisibilidadCeldaEliminarConsolidadosDetalle;
	}

	public Boolean getIsVisibilidadCeldaCancelarConsolidadosDetalle() {
		return isVisibilidadCeldaCancelarConsolidadosDetalle;
	}

	public void setIsVisibilidadCeldaCancelarConsolidadosDetalle(Boolean isVisibilidadCeldaCancelarConsolidadosDetalle) {
		this.isVisibilidadCeldaCancelarConsolidadosDetalle = isVisibilidadCeldaCancelarConsolidadosDetalle;
	}

	public Boolean getIsVisibilidadCeldaGuardarConsolidadosDetalle() {
		return isVisibilidadCeldaGuardarConsolidadosDetalle;
	}

	public void setIsVisibilidadCeldaGuardarConsolidadosDetalle(Boolean isVisibilidadCeldaGuardarConsolidadosDetalle) {
		this.isVisibilidadCeldaGuardarConsolidadosDetalle = isVisibilidadCeldaGuardarConsolidadosDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosConsolidadosDetalle() {
		return isVisibilidadCeldaGuardarCambiosConsolidadosDetalle;
	}

	public void setIsVisibilidadCeldaGuardarCambiosConsolidadosDetalle(Boolean isVisibilidadCeldaGuardarCambiosConsolidadosDetalle) {
		this.isVisibilidadCeldaGuardarCambiosConsolidadosDetalle = isVisibilidadCeldaGuardarCambiosConsolidadosDetalle;
	}
		
	public ConsolidadosDetalleSessionBean getconsolidadosdetalleSessionBean() {
		return this.consolidadosdetalleSessionBean;
	}
	
	public void setconsolidadosdetalleSessionBean(ConsolidadosDetalleSessionBean consolidadosdetalleSessionBean) {
		this.consolidadosdetalleSessionBean=consolidadosdetalleSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaConsolidadosDetalle() {
		return this.isVisibilidadBusquedaConsolidadosDetalle;
	}

	public void setisVisibilidadBusquedaConsolidadosDetalle(Boolean isVisibilidadBusquedaConsolidadosDetalle) {
		this.isVisibilidadBusquedaConsolidadosDetalle=isVisibilidadBusquedaConsolidadosDetalle;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalle)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(consolidadosdetalle,null);
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
	
	public void bugActualizarReferenciaActual(ConsolidadosDetalle consolidadosdetalle,ConsolidadosDetalle consolidadosdetalleAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalConsolidadosDetalle(consolidadosdetalle);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		consolidadosdetalleAux.setId(consolidadosdetalle.getId());
		consolidadosdetalleAux.setVersionRow(consolidadosdetalle.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ConsolidadosDetalle consolidadosdetalleLocal) throws Exception {
		
		if(this.consolidadosdetalleSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ConsolidadosDetalle consolidadosdetalleLocal) throws Exception {	
		if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				consolidadosdetalleLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarConsolidadosDetalleActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = consolidadosdetalleValidator.getInvalidValues(this.consolidadosdetalle);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ConsolidadosDetalle consolidadosdetalle,List<ConsolidadosDetalle> consolidadosdetalles) throws Exception {
	}		
	
	public void actualizarSelectedLista(ConsolidadosDetalle consolidadosdetalle,List<ConsolidadosDetalle> consolidadosdetalles) throws Exception {
		try	{			
			ConsolidadosDetalleConstantesFunciones.actualizarSelectedLista(consolidadosdetalle,consolidadosdetalles);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ConsolidadosDetalle> consolidadosdetallesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				consolidadosdetallesLocal=this.consolidadosdetalleLogic.getConsolidadosDetalles();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				consolidadosdetallesLocal=this.consolidadosdetalles;
			}
			//ARCHITECTURE
		
			for(ConsolidadosDetalle consolidadosdetalleLocal:consolidadosdetallesLocal) {
				if(this.permiteMantenimiento(consolidadosdetalleLocal) && consolidadosdetalleLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ConsolidadosDetalleConstantesFunciones.getConsolidadosDetalleLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ConsolidadosDetalleConstantesFunciones.NOMBREEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelnombre_empresaConsolidadosDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosDetalleConstantesFunciones.NOMBRESUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelnombre_sucursalConsolidadosDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosDetalleConstantesFunciones.CODIGOSUBGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelcodigo_sub_grupoConsolidadosDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosDetalleConstantesFunciones.NOMBRESUBGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelnombre_sub_grupoConsolidadosDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosDetalleConstantesFunciones.CODIGODETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelcodigo_detalle_grupoConsolidadosDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosDetalleConstantesFunciones.NOMBREDETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelnombre_detalle_grupoConsolidadosDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosDetalleConstantesFunciones.CLAVE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelclaveConsolidadosDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosDetalleConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelnombreConsolidadosDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosDetalleConstantesFunciones.FECHACOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelfecha_compraConsolidadosDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosDetalleConstantesFunciones.VIDAUTIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelvida_utilConsolidadosDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosDetalleConstantesFunciones.COSTODECOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelcosto_de_compraConsolidadosDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsolidadosDetalleConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelcantidadConsolidadosDetalle,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelnombre_empresaConsolidadosDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelnombre_sucursalConsolidadosDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelcodigo_sub_grupoConsolidadosDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelnombre_sub_grupoConsolidadosDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelcodigo_detalle_grupoConsolidadosDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelnombre_detalle_grupoConsolidadosDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelclaveConsolidadosDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelnombreConsolidadosDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelfecha_compraConsolidadosDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelvida_utilConsolidadosDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelcosto_de_compraConsolidadosDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelcantidadConsolidadosDetalle,"");
		
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
		this.iIdNuevoConsolidadosDetalle--;	
		
		
		this.consolidadosdetalleAux=new ConsolidadosDetalle();
		
		this.consolidadosdetalleAux.setId(this.iIdNuevoConsolidadosDetalle);
		this.consolidadosdetalleAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.consolidadosdetalleLogic.getConsolidadosDetalles().add(this.consolidadosdetalleAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.consolidadosdetalles.add(this.consolidadosdetalleAux);
		}
		//ARCHITECTURE
		
		this.consolidadosdetalle=this.consolidadosdetalleAux;
		
		if(ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioConsolidadosDetalle(this.consolidadosdetalle);
			this.setVariablesObjetoActualToFormularioForeignKeyConsolidadosDetalle(this.consolidadosdetalle);
		}
				
		//this.setDefaultControlesConsolidadosDetalle();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyConsolidadosDetalle();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyConsolidadosDetalle();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyConsolidadosDetalle();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConsolidadosDetalle(this.consolidadosdetalleBean,this.consolidadosdetalle,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanConsolidadosDetalle(this.consolidadosdetalleReturnGeneral,this.consolidadosdetalleBean,false);
		
		if(this.consolidadosdetalleReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyConsolidadosDetalle(this.consolidadosdetalleReturnGeneral.getConsolidadosDetalle());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioConsolidadosDetalle(this.consolidadosdetalleReturnGeneral.getConsolidadosDetalle());
		}
		
		if(this.consolidadosdetalleReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioConsolidadosDetalle(this.consolidadosdetalleReturnGeneral.getConsolidadosDetalle(),classes);//this.consolidadosdetalleBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyConsolidadosDetalle();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyConsolidadosDetalle();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.RecargarFormConsolidadosDetalle(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingConsolidadosDetalle(false);
						
			if(consolidadosdetalleSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConsolidadosDetalle();
			}
			
			this.actualizarVisualTableDatosConsolidadosDetalle();
			
			this.jTableDatosConsolidadosDetalle.setRowSelectionInterval(this.getIndiceNuevoConsolidadosDetalle(), this.getIndiceNuevoConsolidadosDetalle());
			
			this.seleccionarFilaTablaConsolidadosDetalleActual();
						
			this.actualizarEstadoCeldasBotonesConsolidadosDetalle("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesConsolidadosDetalle(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_empresaConsolidadosDetalle.setEnabled(isHabilitar && this.consolidadosdetalleConstantesFunciones.activarnombre_empresaConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_sucursalConsolidadosDetalle.setEnabled(isHabilitar && this.consolidadosdetalleConstantesFunciones.activarnombre_sucursalConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcodigo_sub_grupoConsolidadosDetalle.setEnabled(isHabilitar && this.consolidadosdetalleConstantesFunciones.activarcodigo_sub_grupoConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_sub_grupoConsolidadosDetalle.setEnabled(isHabilitar && this.consolidadosdetalleConstantesFunciones.activarnombre_sub_grupoConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcodigo_detalle_grupoConsolidadosDetalle.setEnabled(isHabilitar && this.consolidadosdetalleConstantesFunciones.activarcodigo_detalle_grupoConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_detalle_grupoConsolidadosDetalle.setEnabled(isHabilitar && this.consolidadosdetalleConstantesFunciones.activarnombre_detalle_grupoConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldclaveConsolidadosDetalle.setEnabled(isHabilitar && this.consolidadosdetalleConstantesFunciones.activarclaveConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombreConsolidadosDetalle.setEnabled(isHabilitar && this.consolidadosdetalleConstantesFunciones.activarnombreConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jDateChooserfecha_compraConsolidadosDetalle.setEnabled(isHabilitar && this.consolidadosdetalleConstantesFunciones.activarfecha_compraConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldvida_utilConsolidadosDetalle.setEnabled(isHabilitar && this.consolidadosdetalleConstantesFunciones.activarvida_utilConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcosto_de_compraConsolidadosDetalle.setEnabled(isHabilitar && this.consolidadosdetalleConstantesFunciones.activarcosto_de_compraConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcantidadConsolidadosDetalle.setEnabled(isHabilitar && this.consolidadosdetalleConstantesFunciones.activarcantidadConsolidadosDetalle);	
		//
		this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxid_empresaConsolidadosDetalle.setEnabled(isHabilitar && this.consolidadosdetalleConstantesFunciones.activarid_empresaConsolidadosDetalle);
	};
	
	public void setDefaultControlesConsolidadosDetalle() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoConsolidadosDetalle(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.consolidadosdetalleSessionBean.setConGuardarRelaciones(true);			
			this.consolidadosdetalleSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTabbedPaneRelacionesConsolidadosDetalle.setVisible(true);
			
					
		} else {
			//this.consolidadosdetalleSessionBean.setConGuardarRelaciones(false);			
			this.consolidadosdetalleSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTabbedPaneRelacionesConsolidadosDetalle.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoConsolidadosDetalle() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsolidadosDetalle consolidadosdetalleAux:this.consolidadosdetalleLogic.getConsolidadosDetalles()) {
				if(consolidadosdetalleAux.getId().equals(this.iIdNuevoConsolidadosDetalle)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsolidadosDetalle consolidadosdetalleAux:this.consolidadosdetalles) {
				if(consolidadosdetalleAux.getId().equals(this.iIdNuevoConsolidadosDetalle)) {
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
	
	public int getIndiceActualConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsolidadosDetalle consolidadosdetalleAux:this.consolidadosdetalleLogic.getConsolidadosDetalles()) {
				if(consolidadosdetalleAux.getId().equals(consolidadosdetalle.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsolidadosDetalle consolidadosdetalleAux:this.consolidadosdetalles) {
				if(consolidadosdetalleAux.getId().equals(consolidadosdetalle.getId())) {
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
	
	public void setCamposBaseDesdeOriginalConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalleOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsolidadosDetalle consolidadosdetalleAux:this.consolidadosdetalleLogic.getConsolidadosDetalles()) {
				if(consolidadosdetalleAux.getConsolidadosDetalleOriginal().getId().equals(consolidadosdetalleOriginal.getId())) {
					existe=true;
					consolidadosdetalleOriginal.setId(consolidadosdetalleAux.getId());
					consolidadosdetalleOriginal.setVersionRow(consolidadosdetalleAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsolidadosDetalle consolidadosdetalleAux:this.consolidadosdetalles) {
				if(consolidadosdetalleAux.getConsolidadosDetalleOriginal().getId().equals(consolidadosdetalleOriginal.getId())) {
					existe=true;
					consolidadosdetalleOriginal.setId(consolidadosdetalleAux.getId());
					consolidadosdetalleOriginal.setVersionRow(consolidadosdetalleAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosConsolidadosDetalle(Boolean esParaCancelar) throws Exception {
		consolidadosdetallesAux=new ArrayList<ConsolidadosDetalle>();
		consolidadosdetalleAux=new ConsolidadosDetalle();
		
		if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ConsolidadosDetalle consolidadosdetalleAux:this.consolidadosdetalleLogic.getConsolidadosDetalles()) {
					if(consolidadosdetalleAux.getId()<0) {
						consolidadosdetallesAux.add(consolidadosdetalleAux);
					}		
				}
				this.iIdNuevoConsolidadosDetalle=0L;
				this.consolidadosdetalleLogic.getConsolidadosDetalles().removeAll(consolidadosdetallesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConsolidadosDetalle consolidadosdetalleAux:this.consolidadosdetalles) {
					if(consolidadosdetalleAux.getId()<0) {
						consolidadosdetallesAux.add(consolidadosdetalleAux);
					}		
				}
				this.iIdNuevoConsolidadosDetalle=0L;
				this.consolidadosdetalles.removeAll(consolidadosdetallesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoConsolidadosDetalle 
					&& this.consolidadosdetalleLogic.getConsolidadosDetalles().size()>0
					) {
					consolidadosdetalleAux=this.consolidadosdetalleLogic.getConsolidadosDetalles().get(this.consolidadosdetalleLogic.getConsolidadosDetalles().size() - 1);
				
					if(consolidadosdetalleAux.getId()<0) {
						this.consolidadosdetalleLogic.getConsolidadosDetalles().remove(consolidadosdetalleAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoConsolidadosDetalle && this.consolidadosdetalles.size()>0) {
					consolidadosdetalleAux=this.consolidadosdetalles.get(this.consolidadosdetalles.size() - 1);
				
					if(consolidadosdetalleAux.getId()<0) {
						this.consolidadosdetalles.remove(consolidadosdetalleAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoConsolidadosDetalle(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(consolidadosdetalle.getId()<0) {
				this.consolidadosdetalleLogic.getConsolidadosDetalles().remove(this.consolidadosdetalle);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(consolidadosdetalle.getId()<0) {
				this.consolidadosdetalles.remove(this.consolidadosdetalle);
			}
		}			
	}
	
	public void setEstadosInicialesConsolidadosDetalle(List<ConsolidadosDetalle> consolidadosdetallesAux) throws Exception {
		ConsolidadosDetalleConstantesFunciones.setEstadosInicialesConsolidadosDetalle(consolidadosdetallesAux);
	}
	
	public void setEstadosInicialesConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalleAux) throws Exception {
		ConsolidadosDetalleConstantesFunciones.setEstadosInicialesConsolidadosDetalle(consolidadosdetalleAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarConsolidadosDetalleActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesConsolidadosDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarConsolidadosDetalleActual()) {
				if(!this.isEsNuevoConsolidadosDetalle) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesConsolidadosDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoConsolidadosDetalle=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarConsolidadosDetalleActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Consolidados Detalle ?", "MANTENIMIENTO DE Consolidados Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesConsolidadosDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ConsolidadosDetalle consolidadosdetalle) throws Exception {
		ConsolidadosDetalleConstantesFunciones.seleccionarAsignar(this.consolidadosdetalle,consolidadosdetalle);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarConsolidadosDetalle=this.isPermisoActualizarOriginalConsolidadosDetalle;
			
			
			this.seleccionarAsignar(consolidadosdetalle);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesConsolidadosDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.consolidadosdetalleSessionBean.setsFuncionBusquedaRapida(this.consolidadosdetalleSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoConsolidadosDetalle) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosConsolidadosDetalle(esParaCancelar);				
				this.cancelarNuevoConsolidadosDetalle(esParaCancelar);								
			}
			
			this.consolidadosdetalle=new ConsolidadosDetalle();
			
			this.inicializarConsolidadosDetalle();
			
			this.actualizarEstadoCeldasBotonesConsolidadosDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarConsolidadosDetalle() throws Exception {
		try {
			ConsolidadosDetalleConstantesFunciones.inicializarConsolidadosDetalle(this.consolidadosdetalle);
			
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
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.consolidadosdetalleLogic.getConsolidadosDetalles().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteConsolidadosDetalles(String sAccionBusqueda,List<ConsolidadosDetalle> consolidadosdetallesParaReportes) throws Exception {
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
					sPathReporteFinal="ConsolidadosDetalle"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ConsolidadosDetalleMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ConsolidadosDetalleMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ConsolidadosDetalle"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Consolidados Detalles");		
		parameters.put("busquedapor", ConsolidadosDetalleConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceConsolidadosDetalle=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ConsolidadosDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ConsolidadosDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceConsolidadosDetalle=new JRBeanArrayDataSource(ConsolidadosDetalleJInternalFrame.TraerConsolidadosDetalleBeans(consolidadosdetallesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceConsolidadosDetalle);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ConsolidadosDetalleConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ConsolidadosDetalleConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ConsolidadosDetalleBean.TraerConsolidadosDetalleBeans(consolidadosdetallesParaReportes).toArray()));
							
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
				this.generarExcelReporteConsolidadosDetalles(sAccionBusqueda,sTipoArchivoReporte,consolidadosdetallesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalConsolidadosDetalles(sAccionBusqueda,sTipoArchivoReporte,consolidadosdetallesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoConsolidadosDetalleActionPerformed(null);
					//this.generarExcelReporteConsolidadosDetalles(sAccionBusqueda,sTipoArchivoReporte,consolidadosdetallesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalConsolidadosDetalles(sAccionBusqueda,sTipoArchivoReporte,consolidadosdetallesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesConsolidadosDetalles(sAccionBusqueda,sTipoArchivoReporte,consolidadosdetallesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesConsolidadosDetalles(sAccionBusqueda,sTipoArchivoReporte,consolidadosdetallesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteConsolidadosDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<ConsolidadosDetalle> consolidadosdetallesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consolidadosdetalle";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConsolidadosDetalles");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConsolidadosDetalle("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ConsolidadosDetalle consolidadosdetalle : consolidadosdetallesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ConsolidadosDetalleConstantesFunciones.generarExcelReporteDataConsolidadosDetalle("NORMAL",row,workbook,consolidadosdetalle,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consolidados Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderConsolidadosDetalle(String sTipo,Row row,Workbook workbook) {
		
		ConsolidadosDetalleConstantesFunciones.generarExcelReporteHeaderConsolidadosDetalle(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalConsolidadosDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<ConsolidadosDetalle> consolidadosdetallesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consolidadosdetalle_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConsolidadosDetalles");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ConsolidadosDetalle consolidadosdetalle : consolidadosdetallesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ConsolidadosDetalleConstantesFunciones.getConsolidadosDetalleDescripcion(consolidadosdetalle));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosDetalleConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosdetalle.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosdetalle.getnombre_empresa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosdetalle.getnombre_sucursal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosDetalleConstantesFunciones.LABEL_CODIGOSUBGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_CODIGOSUBGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosdetalle.getcodigo_sub_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUBGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUBGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosdetalle.getnombre_sub_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosDetalleConstantesFunciones.LABEL_CODIGODETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosdetalle.getcodigo_detalle_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREDETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosdetalle.getnombre_detalle_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosDetalleConstantesFunciones.LABEL_CLAVE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_CLAVE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosdetalle.getclave());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosdetalle.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosDetalleConstantesFunciones.LABEL_FECHACOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_FECHACOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosdetalle.getfecha_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosDetalleConstantesFunciones.LABEL_VIDAUTIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_VIDAUTIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosdetalle.getvida_util());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosDetalleConstantesFunciones.LABEL_COSTODECOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_COSTODECOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosdetalle.getcosto_de_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsolidadosDetalleConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consolidadosdetalle.getcantidad());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consolidados Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesConsolidadosDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<ConsolidadosDetalle> consolidadosdetallesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ConsolidadosDetalle> consolidadosdetallesRespaldo=null;
		
		classes=ConsolidadosDetalleConstantesFunciones.getClassesRelationshipsOfConsolidadosDetalle(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.consolidadosdetalleLogic.setDatosCliente(this.datosCliente);
		this.consolidadosdetalleLogic.setDatosDeep(this.datosDeep);
		this.consolidadosdetalleLogic.setIsConDeep(true);
		
		consolidadosdetallesRespaldo=this.consolidadosdetalleLogic.getConsolidadosDetalles();
		
		this.consolidadosdetalleLogic.setConsolidadosDetalles(consolidadosdetallesParaReportes);	
		this.consolidadosdetalleLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		consolidadosdetallesParaReportes=this.consolidadosdetalleLogic.getConsolidadosDetalles();
		this.consolidadosdetalleLogic.setConsolidadosDetalles(consolidadosdetallesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consolidadosdetalle_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConsolidadosDetalles");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConsolidadosDetalle("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ConsolidadosDetalle consolidadosdetalle : consolidadosdetallesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderConsolidadosDetalle("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ConsolidadosDetalleConstantesFunciones.generarExcelReporteDataConsolidadosDetalle("NORMAL",row,workbook,consolidadosdetalle,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ConsolidadosDetalleConstantesFunciones.getConsolidadosDetalleDescripcion(consolidadosdetalle));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consolidados Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessConsolidadosDetalle() throws Exception {		
		this.startProcessConsolidadosDetalle(true);
	}
	
	public void startProcessConsolidadosDetalle(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasConsolidadosDetalle ,this.jPanelParametrosReportesConsolidadosDetalle, this.jScrollPanelDatosConsolidadosDetalle,this.jPanelPaginacionConsolidadosDetalle, this.jScrollPanelDatosEdicionConsolidadosDetalle, this.jPanelAccionesConsolidadosDetalle,this.jPanelAccionesFormularioConsolidadosDetalle,this.jmenuBarConsolidadosDetalle,this.jmenuBarDetalleConsolidadosDetalle,this.jTtoolBarConsolidadosDetalle,this.jTtoolBarDetalleConsolidadosDetalle);		
		
		final JTabbedPane jTabbedPaneBusquedasConsolidadosDetalle=this.jTabbedPaneBusquedasConsolidadosDetalle; 
		
		final JPanel jPanelParametrosReportesConsolidadosDetalle=this.jPanelParametrosReportesConsolidadosDetalle;
		//final JScrollPane jScrollPanelDatosConsolidadosDetalle=this.jScrollPanelDatosConsolidadosDetalle;
		final JTable jTableDatosConsolidadosDetalle=this.jTableDatosConsolidadosDetalle;		
		final JPanel jPanelPaginacionConsolidadosDetalle=this.jPanelPaginacionConsolidadosDetalle;
		//final JScrollPane jScrollPanelDatosEdicionConsolidadosDetalle=this.jScrollPanelDatosEdicionConsolidadosDetalle;
		final JPanel jPanelAccionesConsolidadosDetalle=this.jPanelAccionesConsolidadosDetalle;
		
		JPanel jPanelCamposAuxiliarConsolidadosDetalle=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarConsolidadosDetalle=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
			jPanelCamposAuxiliarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jPanelCamposConsolidadosDetalle;
			jPanelAccionesFormularioAuxiliarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jPanelAccionesFormularioConsolidadosDetalle;
		}
		
		final JPanel jPanelCamposConsolidadosDetalle=jPanelCamposAuxiliarConsolidadosDetalle;
		final JPanel jPanelAccionesFormularioConsolidadosDetalle=jPanelAccionesFormularioAuxiliarConsolidadosDetalle;
		
		
		final JMenuBar jmenuBarConsolidadosDetalle=this.jmenuBarConsolidadosDetalle;
		final JToolBar jTtoolBarConsolidadosDetalle=this.jTtoolBarConsolidadosDetalle;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarConsolidadosDetalle=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConsolidadosDetalle=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
			jmenuBarDetalleAuxiliarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jmenuBarDetalleConsolidadosDetalle;
			jTtoolBarDetalleAuxiliarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jTtoolBarDetalleConsolidadosDetalle;
		}
		
		final JMenuBar jmenuBarDetalleConsolidadosDetalle=jmenuBarDetalleAuxiliarConsolidadosDetalle;
		final JToolBar jTtoolBarDetalleConsolidadosDetalle=jTtoolBarDetalleAuxiliarConsolidadosDetalle;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConsolidadosDetalle;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConsolidadosDetalle;
			processRunnable.jTableDatos=jTableDatosConsolidadosDetalle;
			processRunnable.jPanelCampos=jPanelCamposConsolidadosDetalle;
			processRunnable.jPanelPaginacion=jPanelPaginacionConsolidadosDetalle;
			processRunnable.jPanelAcciones=jPanelAccionesConsolidadosDetalle;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConsolidadosDetalle;
			
			
			processRunnable.jmenuBar=jmenuBarConsolidadosDetalle;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConsolidadosDetalle;
			processRunnable.jTtoolBar=jTtoolBarConsolidadosDetalle;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConsolidadosDetalle;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConsolidadosDetalle ,jPanelParametrosReportesConsolidadosDetalle,jTableDatosConsolidadosDetalle, /*jScrollPanelDatosConsolidadosDetalle,*/jPanelCamposConsolidadosDetalle,jPanelPaginacionConsolidadosDetalle, /*jScrollPanelDatosEdicionConsolidadosDetalle,*/ jPanelAccionesConsolidadosDetalle,jPanelAccionesFormularioConsolidadosDetalle,jmenuBarConsolidadosDetalle,jmenuBarDetalleConsolidadosDetalle,jTtoolBarConsolidadosDetalle,jTtoolBarDetalleConsolidadosDetalle);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConsolidadosDetalle ,jPanelParametrosReportesConsolidadosDetalle, jScrollPanelDatosConsolidadosDetalle,jPanelPaginacionConsolidadosDetalle, jScrollPanelDatosEdicionConsolidadosDetalle, jPanelAccionesConsolidadosDetalle,jPanelAccionesFormularioConsolidadosDetalle,jmenuBarConsolidadosDetalle,jmenuBarDetalleConsolidadosDetalle,jTtoolBarConsolidadosDetalle,jTtoolBarDetalleConsolidadosDetalle);
						
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
	
	public void finishProcessConsolidadosDetalle() {// throws Exception 
		this.finishProcessConsolidadosDetalle(true);
	}
	
	public void finishProcessConsolidadosDetalle(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasConsolidadosDetalle ,this.jPanelParametrosReportesConsolidadosDetalle, this.jScrollPanelDatosConsolidadosDetalle,this.jPanelPaginacionConsolidadosDetalle, this.jScrollPanelDatosEdicionConsolidadosDetalle, this.jPanelAccionesConsolidadosDetalle,this.jPanelAccionesFormularioConsolidadosDetalle,this.jmenuBarConsolidadosDetalle,this.jmenuBarDetalleConsolidadosDetalle,this.jTtoolBarConsolidadosDetalle,this.jTtoolBarDetalleConsolidadosDetalle);		
		
		final JTabbedPane jTabbedPaneBusquedasConsolidadosDetalle=this.jTabbedPaneBusquedasConsolidadosDetalle; 
		
		final JPanel jPanelParametrosReportesConsolidadosDetalle=this.jPanelParametrosReportesConsolidadosDetalle;
		//final JScrollPane jScrollPanelDatosConsolidadosDetalle=this.jScrollPanelDatosConsolidadosDetalle;
		final JTable jTableDatosConsolidadosDetalle=this.jTableDatosConsolidadosDetalle;		
		final JPanel jPanelPaginacionConsolidadosDetalle=this.jPanelPaginacionConsolidadosDetalle;
		//final JScrollPane jScrollPanelDatosEdicionConsolidadosDetalle=this.jScrollPanelDatosEdicionConsolidadosDetalle;
		final JPanel jPanelAccionesConsolidadosDetalle=this.jPanelAccionesConsolidadosDetalle;
		
		JPanel jPanelCamposAuxiliarConsolidadosDetalle=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarConsolidadosDetalle=new JPanel();
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
			jPanelCamposAuxiliarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jPanelCamposConsolidadosDetalle;
			jPanelAccionesFormularioAuxiliarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jPanelAccionesFormularioConsolidadosDetalle;
		}
		
		final JPanel jPanelCamposConsolidadosDetalle=jPanelCamposAuxiliarConsolidadosDetalle;
		final JPanel jPanelAccionesFormularioConsolidadosDetalle=jPanelAccionesFormularioAuxiliarConsolidadosDetalle;
		
		
		final JMenuBar jmenuBarConsolidadosDetalle=this.jmenuBarConsolidadosDetalle;		
		final JToolBar jTtoolBarConsolidadosDetalle=this.jTtoolBarConsolidadosDetalle;
				
		JMenuBar jmenuBarDetalleAuxiliarConsolidadosDetalle=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConsolidadosDetalle=new JToolBar();
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
			jmenuBarDetalleAuxiliarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jmenuBarDetalleConsolidadosDetalle;
			jTtoolBarDetalleAuxiliarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jTtoolBarDetalleConsolidadosDetalle;		
		}
		
		final JMenuBar jmenuBarDetalleConsolidadosDetalle=jmenuBarDetalleAuxiliarConsolidadosDetalle;
		final JToolBar jTtoolBarDetalleConsolidadosDetalle=jTtoolBarDetalleAuxiliarConsolidadosDetalle;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConsolidadosDetalle;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConsolidadosDetalle;
			processRunnable.jTableDatos=jTableDatosConsolidadosDetalle;
			processRunnable.jPanelCampos=jPanelCamposConsolidadosDetalle;
			processRunnable.jPanelPaginacion=jPanelPaginacionConsolidadosDetalle;
			processRunnable.jPanelAcciones=jPanelAccionesConsolidadosDetalle;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConsolidadosDetalle;
			
			
			processRunnable.jmenuBar=jmenuBarConsolidadosDetalle;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConsolidadosDetalle;
			processRunnable.jTtoolBar=jTtoolBarConsolidadosDetalle;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConsolidadosDetalle;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasConsolidadosDetalle ,jPanelParametrosReportesConsolidadosDetalle, jTableDatosConsolidadosDetalle,/*jScrollPanelDatosConsolidadosDetalle,*/jPanelCamposConsolidadosDetalle,jPanelPaginacionConsolidadosDetalle, /*jScrollPanelDatosEdicionConsolidadosDetalle,*/ jPanelAccionesConsolidadosDetalle,jPanelAccionesFormularioConsolidadosDetalle,jmenuBarConsolidadosDetalle,jmenuBarDetalleConsolidadosDetalle,jTtoolBarConsolidadosDetalle,jTtoolBarDetalleConsolidadosDetalle));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesConsolidadosDetalle(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarConsolidadosDetalle(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuConsolidadosDetalle(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarConsolidadosDetalle(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarConsolidadosDetalle,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleConsolidadosDetalle,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuConsolidadosDetalle(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarConsolidadosDetalle,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleConsolidadosDetalle,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.consolidadosdetalleConstantesFunciones.getsFinalQueryConsolidadosDetalle();
		String  finalQueryPaginacionTodos=this.consolidadosdetalleConstantesFunciones.getsFinalQueryConsolidadosDetalle();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ConsolidadosDetalleConstantesFunciones.getArrayColumnasGlobalesNoConsolidadosDetalle(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ConsolidadosDetalleConstantesFunciones.getArrayColumnasGlobalesConsolidadosDetalle(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ConsolidadosDetalleConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.consolidadosdetallesEliminados= new ArrayList<ConsolidadosDetalle>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessConsolidadosDetalle();
		
				///*ConsolidadosDetalleSessionBean*/this.consolidadosdetalleSessionBean=new ConsolidadosDetalleSessionBean();
			
			if(this.consolidadosdetalleSessionBean==null) {
				this.consolidadosdetalleSessionBean=new ConsolidadosDetalleSessionBean();
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
					this.iNumeroPaginacion=ConsolidadosDetalleConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ConsolidadosDetalleConstantesFunciones.getClassesForeignKeysOfConsolidadosDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/consolidadosdetalle."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			consolidadosdetallesAux= new ArrayList<ConsolidadosDetalle>();
			
				
			consolidadosdetalleLogic.setDatosCliente(this.datosCliente);
			consolidadosdetalleLogic.setDatosDeep(this.datosDeep);
			consolidadosdetalleLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaConsolidadosDetalle")) {
				this.sDetalleReporte=ConsolidadosDetalleConstantesFunciones.getDetalleIndiceBusquedaConsolidadosDetalle(idBusquedaConsolidadosDetalle);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					consolidadosdetalleLogic.getConsolidadosDetallesBusquedaConsolidadosDetalle(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaConsolidadosDetalle);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConsolidadosDetalleConstantesFunciones.getDetalleIndiceBusquedaConsolidadosDetalle(idBusquedaConsolidadosDetalle);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConsolidadosDetalleConstantesFunciones.getDetalleIndiceBusquedaConsolidadosDetalle(idBusquedaConsolidadosDetalle);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=consolidadosdetalleLogic.getConsolidadosDetalles()==null||consolidadosdetalleLogic.getConsolidadosDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=consolidadosdetalles==null|| consolidadosdetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						consolidadosdetallesAux=new ArrayList<ConsolidadosDetalle>();
						consolidadosdetallesAux.addAll(consolidadosdetalleLogic.getConsolidadosDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consolidadosdetallesAux=new ArrayList<ConsolidadosDetalle>();
							consolidadosdetallesAux.addAll(consolidadosdetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							consolidadosdetalleLogic.getConsolidadosDetallesBusquedaConsolidadosDetalle(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaConsolidadosDetalle);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConsolidadosDetalleConstantesFunciones.getDetalleIndiceBusquedaConsolidadosDetalle(idBusquedaConsolidadosDetalle);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConsolidadosDetalleConstantesFunciones.getDetalleIndiceBusquedaConsolidadosDetalle(idBusquedaConsolidadosDetalle);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConsolidadosDetalles("BusquedaConsolidadosDetalle",consolidadosdetalleLogic.getConsolidadosDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConsolidadosDetalles("BusquedaConsolidadosDetalle",consolidadosdetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						consolidadosdetalleLogic.setConsolidadosDetalles(new ArrayList<ConsolidadosDetalle>());
						consolidadosdetalleLogic.getConsolidadosDetalles().addAll(consolidadosdetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consolidadosdetalles=new ArrayList<ConsolidadosDetalle>();
							consolidadosdetalles.addAll(consolidadosdetallesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesConsolidadosDetalle();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessConsolidadosDetalle();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=consolidadosdetalleLogic.getConsolidadosDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consolidadosdetalles.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=consolidadosdetalleLogic.getConsolidadosDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consolidadosdetalles.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ConsolidadosDetalle consolidadosdetalle) {
		Boolean permite=true;
		
		if(this.consolidadosdetalle.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ConsolidadosDetalleConstantesFunciones.getOrderByListaConsolidadosDetalle();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ConsolidadosDetalleConstantesFunciones.getOrderByListaConsolidadosDetalle();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsolidadosDetalle consolidadosdetalle:consolidadosdetalleLogic.getConsolidadosDetalles()) {
				if(consolidadosdetalle.getsType().equals(Constantes2.S_TOTALES)) {
					consolidadosdetalleTotales=consolidadosdetalle;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsolidadosDetalle consolidadosdetalle:this.consolidadosdetalles) {
				if(consolidadosdetalle.getsType().equals(Constantes2.S_TOTALES)) {
					consolidadosdetalleTotales=consolidadosdetalle;
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
			this.consolidadosdetalleAux=new ConsolidadosDetalle();
			this.consolidadosdetalleAux.setsType(Constantes2.S_TOTALES);
			this.consolidadosdetalleAux.setIsNew(false);
			this.consolidadosdetalleAux.setIsChanged(false);
			this.consolidadosdetalleAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ConsolidadosDetalleConstantesFunciones.TotalizarValoresFilaConsolidadosDetalle(this.consolidadosdetalleLogic.getConsolidadosDetalles(),this.consolidadosdetalleAux);
				
				//this.consolidadosdetalleLogic.getConsolidadosDetalles().add(this.consolidadosdetalleAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ConsolidadosDetalleConstantesFunciones.TotalizarValoresFilaConsolidadosDetalle(this.consolidadosdetalles,this.consolidadosdetalleAux);
				
				this.consolidadosdetalles.add(this.consolidadosdetalleAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		consolidadosdetalleTotales=new ConsolidadosDetalle();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.consolidadosdetalleLogic.getConsolidadosDetalles().remove(consolidadosdetalleTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.consolidadosdetalles.remove(consolidadosdetalleTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		consolidadosdetalleTotales=new ConsolidadosDetalle();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsolidadosDetalle consolidadosdetalle:consolidadosdetalleLogic.getConsolidadosDetalles()) {
				if(consolidadosdetalle.getsType().equals(Constantes2.S_TOTALES)) {
					consolidadosdetalleTotales=consolidadosdetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConsolidadosDetalleConstantesFunciones.TotalizarValoresFilaConsolidadosDetalle(this.consolidadosdetalleLogic.getConsolidadosDetalles(),consolidadosdetalleTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsolidadosDetalle consolidadosdetalle:this.consolidadosdetalles) {
				if(consolidadosdetalle.getsType().equals(Constantes2.S_TOTALES)) {
					consolidadosdetalleTotales=consolidadosdetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConsolidadosDetalleConstantesFunciones.TotalizarValoresFilaConsolidadosDetalle(this.consolidadosdetalles,consolidadosdetalleTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getConsolidadosDetallesBusquedaConsolidadosDetalle()throws Exception {
		try {
			sAccionBusqueda="BusquedaConsolidadosDetalle";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConsolidadosDetallesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getConsolidadosDetallesBusquedaConsolidadosDetalle(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consolidadosdetalleLogic.getConsolidadosDetallesBusquedaConsolidadosDetalle(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConsolidadosDetallesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consolidadosdetalleLogic.getConsolidadosDetallesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosConsolidadosDetalle() {
		this.isPermisoTodoConsolidadosDetalle=false;
		this.isPermisoNuevoConsolidadosDetalle=false;
		this.isPermisoActualizarConsolidadosDetalle=false;
		this.isPermisoActualizarOriginalConsolidadosDetalle=false;
		this.isPermisoEliminarConsolidadosDetalle=false;
		this.isPermisoGuardarCambiosConsolidadosDetalle=false;
		this.isPermisoConsultaConsolidadosDetalle=true;
		this.isPermisoBusquedaConsolidadosDetalle=true;
		this.isPermisoReporteConsolidadosDetalle=true;
		this.isPermisoOrdenConsolidadosDetalle=false;		
		this.isPermisoPaginacionMedioConsolidadosDetalle=false;		
		this.isPermisoPaginacionAltoConsolidadosDetalle=false;		
		this.isPermisoPaginacionTodoConsolidadosDetalle=false;		
		this.isPermisoCopiarConsolidadosDetalle=false;		
		this.isPermisoVerFormConsolidadosDetalle=false;		
		this.isPermisoDuplicarConsolidadosDetalle=false;
		this.isPermisoOrdenConsolidadosDetalle=false;
	}
	
	public void setPermisosUsuarioConsolidadosDetalle(Boolean isPermiso) {
		this.isPermisoTodoConsolidadosDetalle=isPermiso;
		this.isPermisoNuevoConsolidadosDetalle=isPermiso;
		this.isPermisoActualizarConsolidadosDetalle=isPermiso;
		this.isPermisoActualizarOriginalConsolidadosDetalle=isPermiso;
		this.isPermisoEliminarConsolidadosDetalle=isPermiso;
		this.isPermisoGuardarCambiosConsolidadosDetalle=isPermiso;
		this.isPermisoConsultaConsolidadosDetalle=isPermiso;
		this.isPermisoBusquedaConsolidadosDetalle=isPermiso;
		this.isPermisoReporteConsolidadosDetalle=isPermiso;
		this.isPermisoOrdenConsolidadosDetalle=isPermiso;		
		this.isPermisoPaginacionMedioConsolidadosDetalle=isPermiso;		
		this.isPermisoPaginacionAltoConsolidadosDetalle=isPermiso;		
		this.isPermisoPaginacionTodoConsolidadosDetalle=isPermiso;		
		this.isPermisoCopiarConsolidadosDetalle=isPermiso;		
		this.isPermisoVerFormConsolidadosDetalle=isPermiso;		
		this.isPermisoDuplicarConsolidadosDetalle=isPermiso;
		this.isPermisoOrdenConsolidadosDetalle=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioConsolidadosDetalle(Boolean isPermiso) {
		//this.isPermisoTodoConsolidadosDetalle=isPermiso;
		this.isPermisoNuevoConsolidadosDetalle=isPermiso;
		this.isPermisoActualizarConsolidadosDetalle=isPermiso;
		this.isPermisoActualizarOriginalConsolidadosDetalle=isPermiso;
		this.isPermisoEliminarConsolidadosDetalle=isPermiso;
		this.isPermisoGuardarCambiosConsolidadosDetalle=isPermiso;
		//this.isPermisoConsultaConsolidadosDetalle=isPermiso;
		//this.isPermisoBusquedaConsolidadosDetalle=isPermiso;
		//this.isPermisoReporteConsolidadosDetalle=isPermiso;
		//this.isPermisoOrdenConsolidadosDetalle=isPermiso;		
		//this.isPermisoPaginacionMedioConsolidadosDetalle=isPermiso;		
		//this.isPermisoPaginacionAltoConsolidadosDetalle=isPermiso;		
		//this.isPermisoPaginacionTodoConsolidadosDetalle=isPermiso;		
		//this.isPermisoCopiarConsolidadosDetalle=isPermiso;		
		//this.isPermisoDuplicarConsolidadosDetalle=isPermiso;
		//this.isPermisoOrdenConsolidadosDetalle=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioConsolidadosDetalleClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ConsolidadosDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebConsolidadosDetalle(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioConsolidadosDetalleClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioConsolidadosDetalleClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionConsolidadosDetalleClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioConsolidadosDetalleClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioConsolidadosDetalle() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ConsolidadosDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ConsolidadosDetalleConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoConsolidadosDetalle=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarConsolidadosDetalle=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalConsolidadosDetalle=this.isPermisoActualizarConsolidadosDetalle;
			this.isPermisoEliminarConsolidadosDetalle=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosConsolidadosDetalle=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaConsolidadosDetalle=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaConsolidadosDetalle=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoConsolidadosDetalle=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteConsolidadosDetalle=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConsolidadosDetalle=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioConsolidadosDetalle=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoConsolidadosDetalle=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoConsolidadosDetalle=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarConsolidadosDetalle=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormConsolidadosDetalle=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarConsolidadosDetalle=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConsolidadosDetalle=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosConsolidadosDetalle.setToolTipText(this.jTableDatosConsolidadosDetalle.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioConsolidadosDetalle(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioConsolidadosDetalle(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ConsolidadosDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ConsolidadosDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioConsolidadosDetalle() throws Exception {
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
	public void inicializarCombosForeignKeyConsolidadosDetalleListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyConsolidadosDetalleListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ConsolidadosDetalleJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyConsolidadosDetalle()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.consolidadosdetalleSessionBean==null) {
				this.consolidadosdetalleSessionBean=new ConsolidadosDetalleSessionBean();
			}

			if(!this.consolidadosdetalleSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyConsolidadosDetalle()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyConsolidadosDetalle(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyConsolidadosDetalle()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyConsolidadosDetalle();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalle)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalle,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyConsolidadosDetalle()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyConsolidadosDetalle()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyConsolidadosDetalle()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyConsolidadosDetalle()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroConsolidadosDetalle()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyConsolidadosDetalle()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyConsolidadosDetalle(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyConsolidadosDetalle()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxid_empresaConsolidadosDetalle!=null && this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxid_empresaConsolidadosDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxid_empresaConsolidadosDetalle.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ConsolidadosDetalleBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ConsolidadosDetalleBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ConsolidadosDetalleBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.consolidadosdetalleSessionBean=new ConsolidadosDetalleSessionBean(); 
		this.consolidadosdetalleConstantesFunciones=new ConsolidadosDetalleConstantesFunciones(); 
		this.consolidadosdetalleBean=new ConsolidadosDetalle();//(this.consolidadosdetalleConstantesFunciones); 		
		this.consolidadosdetalleReturnGeneral=new ConsolidadosDetalleParameterReturnGeneral(); 
		
		this.consolidadosdetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consolidadosdetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ConsolidadosDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ConsolidadosDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ConsolidadosDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessConsolidadosDetalle(true);
			
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
			
			this.consolidadosdetalleConstantesFunciones=new ConsolidadosDetalleConstantesFunciones(); 
			this.consolidadosdetalleBean=new ConsolidadosDetalle();//this.consolidadosdetalleConstantesFunciones); 			
			this.consolidadosdetalleReturnGeneral=new ConsolidadosDetalleParameterReturnGeneral(); 
		
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Consolidados Detalle Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.consolidadosdetalle=new ConsolidadosDetalle();
			this.consolidadosdetalles = new ArrayList<ConsolidadosDetalle>();
			this.consolidadosdetallesAux = new ArrayList<ConsolidadosDetalle>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic=new ConsolidadosDetalleLogic();
				this.consolidadosdetalleLogic.getNewConnexionToDeep("");
			}
			
			//this.consolidadosdetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.consolidadosdetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormConsolidadosDetalle);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoConsolidadosDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConsolidadosDetalle);	
					}
					
					if(this.jInternalFrameImportacionConsolidadosDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConsolidadosDetalle);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByConsolidadosDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByConsolidadosDetalle);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormConsolidadosDetalle);
				this.jInternalFrameDetalleFormConsolidadosDetalle.setVisible(false);
				this.jInternalFrameDetalleFormConsolidadosDetalle.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoConsolidadosDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConsolidadosDetalle);
					this.jInternalFrameReporteDinamicoConsolidadosDetalle.setVisible(false);
					this.jInternalFrameReporteDinamicoConsolidadosDetalle.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionConsolidadosDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionConsolidadosDetalle);
					this.jInternalFrameImportacionConsolidadosDetalle.setVisible(false);
					this.jInternalFrameImportacionConsolidadosDetalle.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByConsolidadosDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByConsolidadosDetalle);
					this.jInternalFrameOrderByConsolidadosDetalle.setVisible(false);
					this.jInternalFrameOrderByConsolidadosDetalle.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idConsolidadosDetalleActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ConsolidadosDetalleConstantesFunciones.INUMEROPAGINACION;
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
			
			this.consolidadosdetalleReturnGeneral=new ConsolidadosDetalleParameterReturnGeneral();
			
			this.consolidadosdetalleParameterGeneral=new ConsolidadosDetalleParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.consolidadosdetalleLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ConsolidadosDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConsolidadosDetalleConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.consolidadosdetalleSessionBean.getEsGuardarRelacionado(),this.consolidadosdetalleSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConsolidadosDetalleConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.consolidadosdetalleSessionBean.getEsGuardarRelacionado(),this.consolidadosdetalleSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoConsolidadosDetalle=false;
			this.isVisibilidadCeldaDuplicarConsolidadosDetalle=true;
			this.isVisibilidadCeldaCopiarConsolidadosDetalle=true;
			this.isVisibilidadCeldaVerFormConsolidadosDetalle=true;
			this.isVisibilidadCeldaOrdenConsolidadosDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle=false;
			this.isVisibilidadCeldaModificarConsolidadosDetalle=false;
			this.isVisibilidadCeldaActualizarConsolidadosDetalle=false;
			this.isVisibilidadCeldaEliminarConsolidadosDetalle=false;
			this.isVisibilidadCeldaCancelarConsolidadosDetalle=false;
			this.isVisibilidadCeldaGuardarConsolidadosDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosConsolidadosDetalle=false;
			
			
			this.isVisibilidadBusquedaConsolidadosDetalle=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesConsolidadosDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosConsolidadosDetalle();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioConsolidadosDetalle(false);
			
			this.setPermisosUsuarioConsolidadosDetalle();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado() 
				|| (this.consolidadosdetalleSessionBean.getEsGuardarRelacionado() && this.consolidadosdetalleSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioConsolidadosDetalleClasesRelacionadas();
			}
			
			if(this.consolidadosdetalleSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioConsolidadosDetalleClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosConsolidadosDetalle();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualConsolidadosDetalle();
			}
			
			if(!this.isPermisoBusquedaConsolidadosDetalle) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasConsolidadosDetalle.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ConsolidadosDetalleConstantesFunciones.getTiposSeleccionarConsolidadosDetalle());
				
				this.tiposColumnasSelect=ConsolidadosDetalleConstantesFunciones.getTiposSeleccionarConsolidadosDetalle(true);
				
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
			//if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioConsolidadosDetalle();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioConsolidadosDetalle(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioConsolidadosDetalle(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesConsolidadosDetalle() ;
			
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
				consolidadosdetalleImplementable= (ConsolidadosDetalleImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConsolidadosDetalleConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				consolidadosdetalleImplementableHome= (ConsolidadosDetalleImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConsolidadosDetalleConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.consolidadosdetalles= new ArrayList<ConsolidadosDetalle>();
			this.consolidadosdetallesEliminados= new ArrayList<ConsolidadosDetalle>();
						
			this.isEsNuevoConsolidadosDetalle=false;
			this.esParaAccionDesdeFormularioConsolidadosDetalle=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyConsolidadosDetalle(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroConsolidadosDetalle();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ConsolidadosDetalleConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesConsolidadosDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingConsolidadosDetalle(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioConsolidadosDetalle();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioConsolidadosDetalle();
			}
			
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasConsolidadosDetalle.getTabCount(); i++) {
					this.jTabbedPaneBusquedasConsolidadosDetalle.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasConsolidadosDetalle.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessConsolidadosDetalle(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ConsolidadosDetalle: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectConsolidadosDetalle() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesConsolidadosDetalle")) {
				iIndex=this.jInternalFrameDetalleFormConsolidadosDetalle.jTabbedPaneRelacionesConsolidadosDetalle.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormConsolidadosDetalle.jTabbedPaneRelacionesConsolidadosDetalle.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessConsolidadosDetalle();	
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
	
	public void cargarCombosForeignKeyConsolidadosDetalle(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyConsolidadosDetalle(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyConsolidadosDetalle(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyConsolidadosDetalleListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyConsolidadosDetalle();
		
		this.cargarCombosFrameForeignKeyConsolidadosDetalle();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyConsolidadosDetalle();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyConsolidadosDetalle();
		}
	}
	
	
	
	public void jButtonNuevoConsolidadosDetalleActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.consolidadosdetalleSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormConsolidadosDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
			
			
			if(jTableDatosConsolidadosDetalle.getRowCount()>=1) {
				jTableDatosConsolidadosDetalle.removeRowSelectionInterval(0, jTableDatosConsolidadosDetalle.getRowCount()-1);						
			}
			
			this.isEsNuevoConsolidadosDetalle=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoConsolidadosDetalle(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesConsolidadosDetalle(true);			
			//this.consolidadosdetalle=new ConsolidadosDetalle();
			//this.consolidadosdetalle.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConsolidadosDetalle(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsolidadosDetalle() ;
			
			if(ConsolidadosDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConsolidadosDetalle(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.consolidadosdetalle);	
			this.actualizarInformacion("INFO_PADRE",false,this.consolidadosdetalle);				
			
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
			
			if(this.consolidadosdetalleSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ConsolidadosDetalle: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarConsolidadosDetalleActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ConsolidadosDetalle> consolidadosdetallesSeleccionados=new ArrayList<ConsolidadosDetalle>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosConsolidadosDetalle.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosConsolidadosDetalle.getSelectedRows().length;			
			}
			
			consolidadosdetallesSeleccionados=this.getConsolidadosDetallesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoConsolidadosDetalle--;			
				//ConsolidadosDetalle consolidadosdetalleAux= new ConsolidadosDetalle();			
				//consolidadosdetalleAux.setId(this.iIdNuevoConsolidadosDetalle);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ConsolidadosDetalle consolidadosdetalleOrigen=new ConsolidadosDetalle();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ConsolidadosDetalle consolidadosdetalleOrigen : consolidadosdetallesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							consolidadosdetalleOrigen =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consolidadosdetalleOrigen =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaConsolidadosDetalle();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.consolidadosdetalle.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosConsolidadosDetalle(consolidadosdetalleOrigen,this.consolidadosdetalle,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.consolidadosdetalleLogic.getConsolidadosDetalles().add(this.consolidadosdetalleAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.consolidadosdetalles.add(this.consolidadosdetalleAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaConsolidadosDetalle(false);
				
				this.jTableDatosConsolidadosDetalle.setRowSelectionInterval(this.getIndiceNuevoConsolidadosDetalle(), this.getIndiceNuevoConsolidadosDetalle());
				
				int iLastRow =  this.jTableDatosConsolidadosDetalle.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConsolidadosDetalle.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConsolidadosDetalle.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConsolidadosDetalle(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ConsolidadosDetalle> consolidadosdetallesSeleccionados=new ArrayList<ConsolidadosDetalle>();									
		
			ConsolidadosDetalle consolidadosdetalleOrigen=new ConsolidadosDetalle();
			ConsolidadosDetalle consolidadosdetalleDestino=new ConsolidadosDetalle();
				
			consolidadosdetallesSeleccionados=this.getConsolidadosDetallesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosConsolidadosDetalle.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || consolidadosdetallesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosConsolidadosDetalle.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						consolidadosdetalleOrigen =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						consolidadosdetalleOrigen =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						consolidadosdetalleDestino =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						consolidadosdetalleDestino =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				consolidadosdetalleOrigen =consolidadosdetallesSeleccionados.get(0);
				consolidadosdetalleDestino =consolidadosdetallesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosConsolidadosDetalle(consolidadosdetalleOrigen,consolidadosdetalleDestino,true,false);
				
				consolidadosdetalleDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(consolidadosdetalleDestino,consolidadosdetalleLogic.getConsolidadosDetalles());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(consolidadosdetalleDestino,consolidadosdetalles);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaConsolidadosDetalle(false);
				
				//this.jTableDatosConsolidadosDetalle.setRowSelectionInterval(this.getIndiceNuevoConsolidadosDetalle(), this.getIndiceNuevoConsolidadosDetalle());
				
				int iLastRow =  this.jTableDatosConsolidadosDetalle.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConsolidadosDetalle.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConsolidadosDetalle.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConsolidadosDetalle(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConsolidadosDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormConsolidadosDetalle.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesConsolidadosDetalle.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasConsolidadosDetalle.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesConsolidadosDetalle.setVisible(!isVisible);
			this.jPanelPaginacionConsolidadosDetalle.setVisible(!isVisible);
			this.jPanelAccionesConsolidadosDetalle.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameConsolidadosDetalle();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoConsolidadosDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionConsolidadosDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByConsolidadosDetalle();
			
			this.abrirFrameOrderByConsolidadosDetalle();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByConsolidadosDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleConsolidadosDetalle(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormConsolidadosDetalle);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormConsolidadosDetalle.isMaximum()) {
					this.jInternalFrameDetalleFormConsolidadosDetalle.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormConsolidadosDetalle.setSize(this.jInternalFrameDetalleFormConsolidadosDetalle.iWidthFormulario,this.jInternalFrameDetalleFormConsolidadosDetalle.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormConsolidadosDetalle.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormConsolidadosDetalle.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormConsolidadosDetalle.isMaximum()) {
						this.jInternalFrameDetalleFormConsolidadosDetalle.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormConsolidadosDetalle.jContentPaneDetalleConsolidadosDetalle.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormConsolidadosDetalle.jTabbedPaneRelacionesConsolidadosDetalle.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormConsolidadosDetalle.jContentPaneDetalleConsolidadosDetalle.getWidth(),ConsolidadosDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConsolidadosDetalle.jTabbedPaneRelacionesConsolidadosDetalle.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormConsolidadosDetalle.jContentPaneDetalleConsolidadosDetalle.getWidth(),ConsolidadosDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConsolidadosDetalle.jTabbedPaneRelacionesConsolidadosDetalle.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormConsolidadosDetalle.jContentPaneDetalleConsolidadosDetalle.getWidth(),ConsolidadosDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormConsolidadosDetalle.setVisible(true);
	        this.jInternalFrameDetalleFormConsolidadosDetalle.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByConsolidadosDetalle() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByConsolidadosDetalle==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByConsolidadosDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsolidadosDetalle,false,this);
				} else {
					this.jInternalFrameOrderByConsolidadosDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsolidadosDetalle,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByConsolidadosDetalle);
				this.jInternalFrameOrderByConsolidadosDetalle.setVisible(false);
				this.jInternalFrameOrderByConsolidadosDetalle.setSelected(false);
				
				this.jInternalFrameOrderByConsolidadosDetalle.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConsolidadosDetalle"));
				
				this.inicializarActualizarBindingTablaOrderByConsolidadosDetalle();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionConsolidadosDetalle() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionConsolidadosDetalle==null) {
				
				this.jInternalFrameImportacionConsolidadosDetalle=new ImportacionJInternalFrame(ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConsolidadosDetalle);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionConsolidadosDetalle);
				this.jInternalFrameImportacionConsolidadosDetalle.setVisible(false);
				this.jInternalFrameImportacionConsolidadosDetalle.setSelected(false);


				this.jInternalFrameImportacionConsolidadosDetalle.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConsolidadosDetalle"));
				this.jInternalFrameImportacionConsolidadosDetalle.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConsolidadosDetalle"));
				this.jInternalFrameImportacionConsolidadosDetalle.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConsolidadosDetalle"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoConsolidadosDetalle() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoConsolidadosDetalle==null) {
				this.jInternalFrameReporteDinamicoConsolidadosDetalle=new ReporteDinamicoJInternalFrame(ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConsolidadosDetalle);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConsolidadosDetalle);
				this.jInternalFrameReporteDinamicoConsolidadosDetalle.setVisible(false);
				this.jInternalFrameReporteDinamicoConsolidadosDetalle.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConsolidadosDetalle"));
				this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConsolidadosDetalle"));
				this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConsolidadosDetalle"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConsolidadosDetalle();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleConsolidadosDetalle() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormConsolidadosDetalle);
			
	       	this.jInternalFrameDetalleFormConsolidadosDetalle.setVisible(false);
	        this.jInternalFrameDetalleFormConsolidadosDetalle.setSelected(false);
			
			//this.jInternalFrameDetalleFormConsolidadosDetalle.dispose();
			//this.jInternalFrameDetalleFormConsolidadosDetalle=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoConsolidadosDetalle() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoConsolidadosDetalle.setVisible(true);
	        this.jInternalFrameReporteDinamicoConsolidadosDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionConsolidadosDetalle() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionConsolidadosDetalle.setVisible(true);
	        this.jInternalFrameImportacionConsolidadosDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByConsolidadosDetalle() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByConsolidadosDetalle.setVisible(true);
	        this.jInternalFrameOrderByConsolidadosDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByConsolidadosDetalle() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByConsolidadosDetalle.setVisible(false);
	        this.jInternalFrameOrderByConsolidadosDetalle.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoConsolidadosDetalle() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoConsolidadosDetalle.setVisible(false);
	        this.jInternalFrameReporteDinamicoConsolidadosDetalle.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionConsolidadosDetalle() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionConsolidadosDetalle.setVisible(false);
	        this.jInternalFrameImportacionConsolidadosDetalle.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarConsolidadosDetalle(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarConsolidadosDetalle(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesConsolidadosDetalle(true);
			//this.isEsNuevoConsolidadosDetalle=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesConsolidadosDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConsolidadosDetalle(false) ;
			
			if(consolidadosdetalleSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ConsolidadosDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConsolidadosDetalle(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsolidadosDetalle(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaConsolidadosDetalleActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarConsolidadosDetalle(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConsolidadosDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesConsolidadosDetalle(true);
			//this.isEsNuevoConsolidadosDetalle=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.consolidadosdetalle.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesConsolidadosDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesConsolidadosDetalle(false) ;
			
			if(ConsolidadosDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConsolidadosDetalle(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsolidadosDetalle(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesConsolidadosDetalle(false);
			
			//if(!this.isEsNuevoConsolidadosDetalle) {								
				int intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
				
			}
			
			if(this.permiteMantenimiento(this.consolidadosdetalle)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoConsolidadosDetalle=true;
					this.inicializarActualizarBindingTablaConsolidadosDetalle(false);
					this.isEsNuevoConsolidadosDetalle=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoConsolidadosDetalle=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoConsolidadosDetalle=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConsolidadosDetalle(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConsolidadosDetalle(false);
				
				this.habilitarDeshabilitarControlesConsolidadosDetalle(false);
			
												
				
				if(ConsolidadosDetalleJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleConsolidadosDetalle();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoConsolidadosDetalleActionPerformed(evt,consolidadosdetalleSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualConsolidadosDetalle(this.consolidadosdetalle,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosConsolidadosDetalle.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,consolidadosdetalleSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.consolidadosdetalle.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ConsolidadosDetalle.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosDetalle.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				this.consolidadosdetalle.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				this.consolidadosdetalle.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.consolidadosdetalle)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ConsolidadosDetalleModel) this.jTableDatosConsolidadosDetalle.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoConsolidadosDetalle=true;
				this.inicializarActualizarBindingTablaConsolidadosDetalle(false);
				this.isEsNuevoConsolidadosDetalle=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConsolidadosDetalle(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConsolidadosDetalle(false);
				
				this.habilitarDeshabilitarControlesConsolidadosDetalle(false);
				
				
				
				if(ConsolidadosDetalleJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleConsolidadosDetalle();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosConsolidadosDetalle.getRowCount()>=1) {
				jTableDatosConsolidadosDetalle.removeRowSelectionInterval(0, jTableDatosConsolidadosDetalle.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesConsolidadosDetalle(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaConsolidadosDetalle(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConsolidadosDetalle(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsolidadosDetalle(false) ;
			
			this.isEsNuevoConsolidadosDetalle=false;
			
			if(ConsolidadosDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleConsolidadosDetalle();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingConsolidadosDetalle(false);
				
				//SI ES MANUAL
				if(ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualConsolidadosDetalle();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoConsolidadosDetalle--;			
			//ConsolidadosDetalle consolidadosdetalleAux= new ConsolidadosDetalle();			
			//consolidadosdetalleAux.setId(this.iIdNuevoConsolidadosDetalle);
			
			if(this.jInternalFrameDetalleFormConsolidadosDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaConsolidadosDetalle();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
			
			this.consolidadosdetalle.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.consolidadosdetalleLogic.getConsolidadosDetalles().add(this.consolidadosdetalleAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.consolidadosdetalles.add(this.consolidadosdetalleAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaConsolidadosDetalle(false);
			
			this.jTableDatosConsolidadosDetalle.setRowSelectionInterval(this.getIndiceNuevoConsolidadosDetalle(), this.getIndiceNuevoConsolidadosDetalle());
			
			int iLastRow =  this.jTableDatosConsolidadosDetalle.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosConsolidadosDetalle.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosConsolidadosDetalle.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaConsolidadosDetalle(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingConsolidadosDetalle(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsolidadosDetalle(false);
			
			//SI ES MANUAL
			if(ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConsolidadosDetalle();
			}
			
			//this.abrirFrameTreeConsolidadosDetalle();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionConsolidadosDetalle.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionConsolidadosDetalle.setFileImportacion(this.jInternalFrameImportacionConsolidadosDetalle.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionConsolidadosDetalle.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionConsolidadosDetalle.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionConsolidadosDetalle.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionConsolidadosDetalle.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ConsolidadosDetalle> consolidadosdetallesSeleccionados=new ArrayList<ConsolidadosDetalle>();		

		consolidadosdetallesSeleccionados=this.getConsolidadosDetallesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ConsolidadosDetalleBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ConsolidadosDetalleBaseDesign.jrxml";
			
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
			
			this.generarReporteConsolidadosDetalles("Todos",consolidadosdetallesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consolidados Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoSubGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoSubGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoSubGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoSubGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSubGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSubGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSubGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSubGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoDetalleGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoDetalleGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoDetalleGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoDetalleGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreDetalleGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreDetalleGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreDetalleGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreDetalleGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CLAVE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ave_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ave_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ave_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ave_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_FECHACOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_VIDAUTIL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_daUtil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_daUtil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_daUtil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_daUtil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_COSTODECOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoDeCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoDeCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoDeCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoDeCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CANTIDAD:
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
		
		if(this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREEMPRESA:
					sNombreCampoCategoria="nombre_empresa";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoria="nombre_sucursal";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					sNombreCampoCategoria="codigo_sub_grupo";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					sNombreCampoCategoria="nombre_sub_grupo";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					sNombreCampoCategoria="codigo_detalle_grupo";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoria="nombre_detalle_grupo";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoria="clave";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoria="fecha_compra";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_VIDAUTIL:
					sNombreCampoCategoria="vida_util";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_COSTODECOMPRA:
					sNombreCampoCategoria="costo_de_compra";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREEMPRESA:
					sNombreCampoCategoriaValor="nombre_empresa";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoriaValor="nombre_sucursal";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					sNombreCampoCategoriaValor="codigo_sub_grupo";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					sNombreCampoCategoriaValor="nombre_sub_grupo";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					sNombreCampoCategoriaValor="codigo_detalle_grupo";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoriaValor="nombre_detalle_grupo";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoriaValor="clave";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoriaValor="fecha_compra";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_VIDAUTIL:
					sNombreCampoCategoriaValor="vida_util";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_COSTODECOMPRA:
					sNombreCampoCategoriaValor="costo_de_compra";
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_empresa");
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sucursal");
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Sub Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_sub_grupo");
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sub Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sub_grupo");
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Detalle Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_detalle_grupo");
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Detalle Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_detalle_grupo");
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CLAVE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Clave",sNombreCampoCategoria,sNombreCampoCategoriaValor,"clave");
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_FECHACOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_compra");
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_VIDAUTIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Va Util",sNombreCampoCategoria,sNombreCampoCategoriaValor,"vida_util");
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_COSTODECOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_de_compra");
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CANTIDAD:
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
	
	public void jButtonGenerarExcelReporteDinamicoConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ConsolidadosDetalle> consolidadosdetallesSeleccionados=new ArrayList<ConsolidadosDetalle>();		
		
		consolidadosdetallesSeleccionados=this.getConsolidadosDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consolidadosdetalle";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ConsolidadosDetalles");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ConsolidadosDetalleConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ConsolidadosDetalle consolidadosdetalle:consolidadosdetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosdetalle.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREEMPRESA);
					iRow++;

					for(ConsolidadosDetalle consolidadosdetalle:consolidadosdetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosdetalle.getnombre_empresa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUCURSAL);
					iRow++;

					for(ConsolidadosDetalle consolidadosdetalle:consolidadosdetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosdetalle.getnombre_sucursal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_CODIGOSUBGRUPO);
					iRow++;

					for(ConsolidadosDetalle consolidadosdetalle:consolidadosdetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosdetalle.getcodigo_sub_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUBGRUPO);
					iRow++;

					for(ConsolidadosDetalle consolidadosdetalle:consolidadosdetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosdetalle.getnombre_sub_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
					iRow++;

					for(ConsolidadosDetalle consolidadosdetalle:consolidadosdetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosdetalle.getcodigo_detalle_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
					iRow++;

					for(ConsolidadosDetalle consolidadosdetalle:consolidadosdetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosdetalle.getnombre_detalle_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CLAVE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_CLAVE);
					iRow++;

					for(ConsolidadosDetalle consolidadosdetalle:consolidadosdetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosdetalle.getclave());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ConsolidadosDetalle consolidadosdetalle:consolidadosdetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosdetalle.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_FECHACOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_FECHACOMPRA);
					iRow++;

					for(ConsolidadosDetalle consolidadosdetalle:consolidadosdetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosdetalle.getfecha_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_VIDAUTIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_VIDAUTIL);
					iRow++;

					for(ConsolidadosDetalle consolidadosdetalle:consolidadosdetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosdetalle.getvida_util());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_COSTODECOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_COSTODECOMPRA);
					iRow++;

					for(ConsolidadosDetalle consolidadosdetalle:consolidadosdetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosdetalle.getcosto_de_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsolidadosDetalleConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ConsolidadosDetalle consolidadosdetalle:consolidadosdetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consolidadosdetalle.getcantidad());
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
			//	this.getFilaCabeceraExportarExcelConsolidadosDetalle(row);				
			//	iRow++;
			//}				
			
			//for(ConsolidadosDetalle consolidadosdetalleAux:consolidadosdetallesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelConsolidadosDetalle(consolidadosdetalleAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consolidados Detalle",JOptionPane.INFORMATION_MESSAGE);
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
				this.consolidadosdetalleLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsolidadosDetalle(false);
			
			//SI ES MANUAL
			if(ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConsolidadosDetalle();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsolidadosDetalle(false);
			
			//SI ES MANUAL
			if(ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConsolidadosDetalle();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsolidadosDetalle(false);
			
			//SI ES MANUAL
			if(ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConsolidadosDetalle();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaConsolidadosDetalle() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosConsolidadosDetalle.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosConsolidadosDetalle.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosConsolidadosDetalle.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosConsolidadosDetalle.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosConsolidadosDetalle.setMinimumSize(dimensionMinimum);
		this.jTableDatosConsolidadosDetalle.setMaximumSize(dimensionMaximum);
		this.jTableDatosConsolidadosDetalle.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingConsolidadosDetalle(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingConsolidadosDetalle(esInicializar,true);
	}
	
	public void inicializarActualizarBindingConsolidadosDetalle(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaConsolidadosDetalle(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesConsolidadosDetalle(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasConsolidadosDetalle(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConsolidadosDetalle(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesConsolidadosDetalle(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualConsolidadosDetalle() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaConsolidadosDetalle();
		
		this.inicializarActualizarBindingBotonesManualConsolidadosDetalle(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualConsolidadosDetalle();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConsolidadosDetalle() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualConsolidadosDetalle(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualConsolidadosDetalle(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosConsolidadosDetalle.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosConsolidadosDetalle.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteConsolidadosDetalle.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormConsolidadosDetalle.jCheckBoxPostAccionNuevoConsolidadosDetalle.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormConsolidadosDetalle.jCheckBoxPostAccionSinCerrarConsolidadosDetalle.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormConsolidadosDetalle.jCheckBoxPostAccionSinMensajeConsolidadosDetalle.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosConsolidadosDetalle.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosConsolidadosDetalle.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteConsolidadosDetalle.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
				this.jInternalFrameDetalleFormConsolidadosDetalle.jCheckBoxPostAccionNuevoConsolidadosDetalle.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormConsolidadosDetalle.jCheckBoxPostAccionSinCerrarConsolidadosDetalle.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormConsolidadosDetalle.jCheckBoxPostAccionSinMensajeConsolidadosDetalle.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionConsolidadosDetalle.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionConsolidadosDetalle.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxTiposAccionesFormularioConsolidadosDetalle.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesConsolidadosDetalle.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoConsolidadosDetalle!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesConsolidadosDetalle.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesConsolidadosDetalle.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarConsolidadosDetalle.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesConsolidadosDetalle.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoConsolidadosDetalle!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesConsolidadosDetalle.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralConsolidadosDetalle.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesConsolidadosDetalle(Boolean esInicializar) throws Exception {
		try	{	
			if(ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualConsolidadosDetalle(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesConsolidadosDetalle() throws Exception {
		try	{
			if(ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualConsolidadosDetalle();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConsolidadosDetalle() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxTiposAccionesFormularioConsolidadosDetalle.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxTiposAccionesFormularioConsolidadosDetalle.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualConsolidadosDetalle() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesConsolidadosDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesConsolidadosDetalle.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesConsolidadosDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesConsolidadosDetalle.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesConsolidadosDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesConsolidadosDetalle.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionConsolidadosDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionConsolidadosDetalle.addItem(reporte);
			}
			
			
			if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionConsolidadosDetalle.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionConsolidadosDetalle.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesConsolidadosDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesConsolidadosDetalle.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesConsolidadosDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesConsolidadosDetalle.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxTiposAccionesFormularioConsolidadosDetalle.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxTiposAccionesFormularioConsolidadosDetalle.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarConsolidadosDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarConsolidadosDetalle.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarConsolidadosDetalle.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConsolidadosDetalle();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConsolidadosDetalle() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConsolidadosDetalle!=null) {
				this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConsolidadosDetalle!=null) {
				this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoConsolidadosDetalle!=null) {
				
				if(this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ConsolidadosDetalleConstantesFunciones.getTiposSeleccionarConsolidadosDetalle(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ConsolidadosDetalleConstantesFunciones.getTiposSeleccionarConsolidadosDetalle(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ConsolidadosDetalleConstantesFunciones.getTiposSeleccionarConsolidadosDetalle(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualConsolidadosDetalle()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaConsolidadosDetalle=Long.parseLong(this.jLabelidConsolidadosDetalleBusquedaConsolidadosDetalle.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasConsolidadosDetalle(Boolean esInicializar) throws Exception {				
		if(ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualConsolidadosDetalle();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaConsolidadosDetalle() throws Exception {
		this.inicializarActualizarBindingTablaConsolidadosDetalle(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByConsolidadosDetalle() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByConsolidadosDetalle.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByConsolidadosDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConsolidadosDetalle.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ConsolidadosDetallePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByConsolidadosDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConsolidadosDetalle.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ConsolidadosDetallePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosConsolidadosDetalleOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosDetalleOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ConsolidadosDetallePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByConsolidadosDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConsolidadosDetalle.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ConsolidadosDetallePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByConsolidadosDetalle.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaConsolidadosDetalle(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=consolidadosdetalleLogic.getConsolidadosDetalles().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=consolidadosdetalles.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosConsolidadosDetalle.setModel(new ConsolidadosDetalleModel(this.consolidadosdetalleLogic.getConsolidadosDetalles(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosConsolidadosDetalle.setModel(new ConsolidadosDetalleModel(this.consolidadosdetalles,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByConsolidadosDetalle!=null && this.jInternalFrameOrderByConsolidadosDetalle.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByConsolidadosDetalle();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosConsolidadosDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosDetalle,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ConsolidadosDetallePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO,consolidadosdetalleConstantesFunciones.resaltarSeleccionarConsolidadosDetalle,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO,consolidadosdetalleConstantesFunciones.resaltarSeleccionarConsolidadosDetalle,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosConsolidadosDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosDetalle,ConsolidadosDetalleConstantesFunciones.LABEL_ID));

		if(this.consolidadosdetalleConstantesFunciones.mostraridConsolidadosDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosDetalleConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.consolidadosdetalleConstantesFunciones.resaltaridConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activaridConsolidadosDetalle,iSizeTabla,this,true,"idConsolidadosDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosdetalleConstantesFunciones.resaltaridConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activaridConsolidadosDetalle,this,true,"idConsolidadosDetalle","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosDetalle,ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREEMPRESA));

		if(this.consolidadosdetalleConstantesFunciones.mostrarnombre_empresaConsolidadosDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREEMPRESA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consolidadosdetalleConstantesFunciones.resaltarnombre_empresaConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarnombre_empresaConsolidadosDetalle,iSizeTabla,this,true,"nombre_empresaConsolidadosDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosdetalleConstantesFunciones.resaltarnombre_empresaConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarnombre_empresaConsolidadosDetalle,this,true,"nombre_empresaConsolidadosDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsolidadosDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosDetalle,ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUCURSAL));

		if(this.consolidadosdetalleConstantesFunciones.mostrarnombre_sucursalConsolidadosDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUCURSAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consolidadosdetalleConstantesFunciones.resaltarnombre_sucursalConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarnombre_sucursalConsolidadosDetalle,iSizeTabla,this,true,"nombre_sucursalConsolidadosDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosdetalleConstantesFunciones.resaltarnombre_sucursalConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarnombre_sucursalConsolidadosDetalle,this,true,"nombre_sucursalConsolidadosDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsolidadosDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosDetalle,ConsolidadosDetalleConstantesFunciones.LABEL_CODIGOSUBGRUPO));

		if(this.consolidadosdetalleConstantesFunciones.mostrarcodigo_sub_grupoConsolidadosDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosDetalleConstantesFunciones.LABEL_CODIGOSUBGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consolidadosdetalleConstantesFunciones.resaltarcodigo_sub_grupoConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarcodigo_sub_grupoConsolidadosDetalle,iSizeTabla,this,true,"codigo_sub_grupoConsolidadosDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosdetalleConstantesFunciones.resaltarcodigo_sub_grupoConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarcodigo_sub_grupoConsolidadosDetalle,this,true,"codigo_sub_grupoConsolidadosDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsolidadosDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosDetalle,ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUBGRUPO));

		if(this.consolidadosdetalleConstantesFunciones.mostrarnombre_sub_grupoConsolidadosDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUBGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consolidadosdetalleConstantesFunciones.resaltarnombre_sub_grupoConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarnombre_sub_grupoConsolidadosDetalle,iSizeTabla,this,true,"nombre_sub_grupoConsolidadosDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosdetalleConstantesFunciones.resaltarnombre_sub_grupoConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarnombre_sub_grupoConsolidadosDetalle,this,true,"nombre_sub_grupoConsolidadosDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsolidadosDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosDetalle,ConsolidadosDetalleConstantesFunciones.LABEL_CODIGODETALLEGRUPO));

		if(this.consolidadosdetalleConstantesFunciones.mostrarcodigo_detalle_grupoConsolidadosDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosDetalleConstantesFunciones.LABEL_CODIGODETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consolidadosdetalleConstantesFunciones.resaltarcodigo_detalle_grupoConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarcodigo_detalle_grupoConsolidadosDetalle,iSizeTabla,this,true,"codigo_detalle_grupoConsolidadosDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosdetalleConstantesFunciones.resaltarcodigo_detalle_grupoConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarcodigo_detalle_grupoConsolidadosDetalle,this,true,"codigo_detalle_grupoConsolidadosDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsolidadosDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosDetalle,ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREDETALLEGRUPO));

		if(this.consolidadosdetalleConstantesFunciones.mostrarnombre_detalle_grupoConsolidadosDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREDETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consolidadosdetalleConstantesFunciones.resaltarnombre_detalle_grupoConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarnombre_detalle_grupoConsolidadosDetalle,iSizeTabla,this,true,"nombre_detalle_grupoConsolidadosDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosdetalleConstantesFunciones.resaltarnombre_detalle_grupoConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarnombre_detalle_grupoConsolidadosDetalle,this,true,"nombre_detalle_grupoConsolidadosDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsolidadosDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosDetalle,ConsolidadosDetalleConstantesFunciones.LABEL_CLAVE));

		if(this.consolidadosdetalleConstantesFunciones.mostrarclaveConsolidadosDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosDetalleConstantesFunciones.LABEL_CLAVE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consolidadosdetalleConstantesFunciones.resaltarclaveConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarclaveConsolidadosDetalle,iSizeTabla,this,true,"claveConsolidadosDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosdetalleConstantesFunciones.resaltarclaveConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarclaveConsolidadosDetalle,this,true,"claveConsolidadosDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsolidadosDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosDetalle,ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRE));

		if(this.consolidadosdetalleConstantesFunciones.mostrarnombreConsolidadosDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consolidadosdetalleConstantesFunciones.resaltarnombreConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarnombreConsolidadosDetalle,iSizeTabla,this,true,"nombreConsolidadosDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosdetalleConstantesFunciones.resaltarnombreConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarnombreConsolidadosDetalle,this,true,"nombreConsolidadosDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsolidadosDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosDetalle,ConsolidadosDetalleConstantesFunciones.LABEL_FECHACOMPRA));

		if(this.consolidadosdetalleConstantesFunciones.mostrarfecha_compraConsolidadosDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosDetalleConstantesFunciones.LABEL_FECHACOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.consolidadosdetalleConstantesFunciones.resaltarfecha_compraConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarfecha_compraConsolidadosDetalle,iSizeTabla,this,true,"fecha_compraConsolidadosDetalle","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.consolidadosdetalleConstantesFunciones.resaltarfecha_compraConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarfecha_compraConsolidadosDetalle,this,true,"fecha_compraConsolidadosDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ConsolidadosDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosDetalle,ConsolidadosDetalleConstantesFunciones.LABEL_VIDAUTIL));

		if(this.consolidadosdetalleConstantesFunciones.mostrarvida_utilConsolidadosDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosDetalleConstantesFunciones.LABEL_VIDAUTIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.consolidadosdetalleConstantesFunciones.resaltarvida_utilConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarvida_utilConsolidadosDetalle,iSizeTabla,this,true,"vida_utilConsolidadosDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosdetalleConstantesFunciones.resaltarvida_utilConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarvida_utilConsolidadosDetalle,this,true,"vida_utilConsolidadosDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConsolidadosDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosDetalle,ConsolidadosDetalleConstantesFunciones.LABEL_COSTODECOMPRA));

		if(this.consolidadosdetalleConstantesFunciones.mostrarcosto_de_compraConsolidadosDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosDetalleConstantesFunciones.LABEL_COSTODECOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.consolidadosdetalleConstantesFunciones.resaltarcosto_de_compraConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarcosto_de_compraConsolidadosDetalle,iSizeTabla,this,true,"costo_de_compraConsolidadosDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosdetalleConstantesFunciones.resaltarcosto_de_compraConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarcosto_de_compraConsolidadosDetalle,this,true,"costo_de_compraConsolidadosDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConsolidadosDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsolidadosDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosDetalle,ConsolidadosDetalleConstantesFunciones.LABEL_CANTIDAD));

		if(this.consolidadosdetalleConstantesFunciones.mostrarcantidadConsolidadosDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsolidadosDetalleConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.consolidadosdetalleConstantesFunciones.resaltarcantidadConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarcantidadConsolidadosDetalle,iSizeTabla,this,true,"cantidadConsolidadosDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consolidadosdetalleConstantesFunciones.resaltarcantidadConsolidadosDetalle,this.consolidadosdetalleConstantesFunciones.activarcantidadConsolidadosDetalle,this,true,"cantidadConsolidadosDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConsolidadosDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.consolidadosdetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.consolidadosdetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConsolidadosDetalle.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.consolidadosdetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.consolidadosdetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConsolidadosDetalle.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarConsolidadosDetalle && this.isPermisoGuardarCambiosConsolidadosDetalle) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.consolidadosdetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.consolidadosdetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosConsolidadosDetalle.addColumn(tableColumn);
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
			
			this.jTableDatosConsolidadosDetalle.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConsolidadosDetalle && this.isPermisoGuardarCambiosConsolidadosDetalle) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConsolidadosDetalle && this.isPermisoGuardarCambiosConsolidadosDetalle) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosConsolidadosDetalle.moveColumn(this.jTableDatosConsolidadosDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosConsolidadosDetalle.moveColumn(this.jTableDatosConsolidadosDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosConsolidadosDetalle.moveColumn(this.jTableDatosConsolidadosDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosConsolidadosDetalle.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosConsolidadosDetalle.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosConsolidadosDetalle,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosConsolidadosDetalle.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosConsolidadosDetalle.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosConsolidadosDetalle.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosConsolidadosDetalle.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosConsolidadosDetalle.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=consolidadosdetalleLogic.getConsolidadosDetalles().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=consolidadosdetalles.size()-1;
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
		//this.jTableDatosConsolidadosDetalle.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosConsolidadosDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosConsolidadosDetalle();
			
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
				
				//this.isEsNuevoConsolidadosDetalle=false;
					
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
			
				if(this.consolidadosdetalleSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormConsolidadosDetalle==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConsolidadosDetalle.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConsolidadosDetalle.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.consolidadosdetalle.getsType().equals("DUPLICADO")
				   || this.consolidadosdetalle.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoConsolidadosDetalle=true;
				
				} else {
					this.isEsNuevoConsolidadosDetalle=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
					if(this.consolidadosdetalle.getId()>=0 && !this.consolidadosdetalle.getIsNew()) {						
						this.isEsNuevoConsolidadosDetalle=false;
						
					} else {
						this.isEsNuevoConsolidadosDetalle=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoConsolidadosDetalle(esRelaciones);						
				
				this.seleccionarConsolidadosDetalle(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.consolidadosdetalle.getId()<0) {
					this.isEsNuevoConsolidadosDetalle=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarConsolidadosDetalle(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarConsolidadosDetalle(evt,rowIndex);
				}	
				
				if(this.consolidadosdetalleSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ConsolidadosDetalle: " + this.dDif); 
					}
				}								
				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarConsolidadosDetalle(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.consolidadosdetalle)) {
					if(this.consolidadosdetalle.getId()>0) {
						this.consolidadosdetalle.setIsDeleted(true);
						
						this.consolidadosdetallesEliminados.add(this.consolidadosdetalle);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.consolidadosdetalleLogic.getConsolidadosDetalles().remove(this.consolidadosdetalle);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.consolidadosdetalles.remove(this.consolidadosdetalle);				
					}
					
					
					((ConsolidadosDetalleModel) this.jTableDatosConsolidadosDetalle.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaConsolidadosDetalle(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarConsolidadosDetalle(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoConsolidadosDetalle) {
			
			if(this.jInternalFrameDetalleFormConsolidadosDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConsolidadosDetalle.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConsolidadosDetalle.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioConsolidadosDetalle(this.consolidadosdetalle);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesConsolidadosDetalle("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesConsolidadosDetalle(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConsolidadosDetalle() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalle) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoConsolidadosDetalle(consolidadosdetalle,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalle,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioConsolidadosDetalle(consolidadosdetalle);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyConsolidadosDetalle(consolidadosdetalle,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyConsolidadosDetalle(consolidadosdetalle);
	}
	
	public void setVariablesObjetoActualToFormularioConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalle) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormConsolidadosDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelidConsolidadosDetalle.setText(consolidadosdetalle.getId().toString());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_empresaConsolidadosDetalle.setText(consolidadosdetalle.getnombre_empresa());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_sucursalConsolidadosDetalle.setText(consolidadosdetalle.getnombre_sucursal());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcodigo_sub_grupoConsolidadosDetalle.setText(consolidadosdetalle.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_sub_grupoConsolidadosDetalle.setText(consolidadosdetalle.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcodigo_detalle_grupoConsolidadosDetalle.setText(consolidadosdetalle.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_detalle_grupoConsolidadosDetalle.setText(consolidadosdetalle.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldclaveConsolidadosDetalle.setText(consolidadosdetalle.getclave());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombreConsolidadosDetalle.setText(consolidadosdetalle.getnombre());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jDateChooserfecha_compraConsolidadosDetalle.setDate(consolidadosdetalle.getfecha_compra());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldvida_utilConsolidadosDetalle.setText(consolidadosdetalle.getvida_util().toString());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcosto_de_compraConsolidadosDetalle.setText(consolidadosdetalle.getcosto_de_compra().toString());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcantidadConsolidadosDetalle.setText(consolidadosdetalle.getcantidad().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ConsolidadosDetalle consolidadosdetalleLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,consolidadosdetalleLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ConsolidadosDetalle consolidadosdetalleLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				consolidadosdetalleLocal=this.consolidadosdetalle;
			} else {
				consolidadosdetalleLocal=this.consolidadosdetalleAnterior;
			}
		}
		
		if(this.permiteMantenimiento(consolidadosdetalleLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoConsolidadosDetalle(consolidadosdetalleLocal,true);
					
					if(consolidadosdetalleSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(consolidadosdetalleLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(consolidadosdetalleLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConsolidadosDetalle(consolidadosdetalle,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(consolidadosdetalle);
	}
	
	public void setVariablesFormularioToObjetoActualConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConsolidadosDetalle(consolidadosdetalle,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalle,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormConsolidadosDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelidConsolidadosDetalle.getText()==null || this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelidConsolidadosDetalle.getText()=="" || this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelidConsolidadosDetalle.getText()=="Id") {
				this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelidConsolidadosDetalle.setText("0");
			}

			if(conColumnasBase) {consolidadosdetalle.setId(Long.parseLong(this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelidConsolidadosDetalle.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosDetalleConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelIdConsolidadosDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosdetalle.setnombre_empresa(this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_empresaConsolidadosDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREEMPRESA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelnombre_empresaConsolidadosDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosdetalle.setnombre_sucursal(this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_sucursalConsolidadosDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUCURSAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelnombre_sucursalConsolidadosDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosdetalle.setcodigo_sub_grupo(this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcodigo_sub_grupoConsolidadosDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosDetalleConstantesFunciones.LABEL_CODIGOSUBGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelcodigo_sub_grupoConsolidadosDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosdetalle.setnombre_sub_grupo(this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_sub_grupoConsolidadosDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUBGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelnombre_sub_grupoConsolidadosDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosdetalle.setcodigo_detalle_grupo(this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcodigo_detalle_grupoConsolidadosDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosDetalleConstantesFunciones.LABEL_CODIGODETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelcodigo_detalle_grupoConsolidadosDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosdetalle.setnombre_detalle_grupo(this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_detalle_grupoConsolidadosDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelnombre_detalle_grupoConsolidadosDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosdetalle.setclave(this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldclaveConsolidadosDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosDetalleConstantesFunciones.LABEL_CLAVE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelclaveConsolidadosDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosdetalle.setnombre(this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombreConsolidadosDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelnombreConsolidadosDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosdetalle.setfecha_compra(this.jInternalFrameDetalleFormConsolidadosDetalle.jDateChooserfecha_compraConsolidadosDetalle.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosDetalleConstantesFunciones.LABEL_FECHACOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelfecha_compraConsolidadosDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosdetalle.setvida_util(Double.parseDouble(this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldvida_utilConsolidadosDetalle.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosDetalleConstantesFunciones.LABEL_VIDAUTIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelvida_utilConsolidadosDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosdetalle.setcosto_de_compra(Double.parseDouble(this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcosto_de_compraConsolidadosDetalle.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosDetalleConstantesFunciones.LABEL_COSTODECOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelcosto_de_compraConsolidadosDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consolidadosdetalle.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcantidadConsolidadosDetalle.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsolidadosDetalleConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelcantidadConsolidadosDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalleBean,ConsolidadosDetalle consolidadosdetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalleOrigen,ConsolidadosDetalle consolidadosdetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && consolidadosdetalleOrigen.getId()!=null && !consolidadosdetalleOrigen.getId().equals(0L))) {consolidadosdetalle.setId(consolidadosdetalleOrigen.getId());}}
			if(conDefault || (!conDefault && consolidadosdetalleOrigen.getnombre_empresa()!=null && !consolidadosdetalleOrigen.getnombre_empresa().equals(""))) {consolidadosdetalle.setnombre_empresa(consolidadosdetalleOrigen.getnombre_empresa());}
			if(conDefault || (!conDefault && consolidadosdetalleOrigen.getnombre_sucursal()!=null && !consolidadosdetalleOrigen.getnombre_sucursal().equals(""))) {consolidadosdetalle.setnombre_sucursal(consolidadosdetalleOrigen.getnombre_sucursal());}
			if(conDefault || (!conDefault && consolidadosdetalleOrigen.getcodigo_sub_grupo()!=null && !consolidadosdetalleOrigen.getcodigo_sub_grupo().equals(""))) {consolidadosdetalle.setcodigo_sub_grupo(consolidadosdetalleOrigen.getcodigo_sub_grupo());}
			if(conDefault || (!conDefault && consolidadosdetalleOrigen.getnombre_sub_grupo()!=null && !consolidadosdetalleOrigen.getnombre_sub_grupo().equals(""))) {consolidadosdetalle.setnombre_sub_grupo(consolidadosdetalleOrigen.getnombre_sub_grupo());}
			if(conDefault || (!conDefault && consolidadosdetalleOrigen.getcodigo_detalle_grupo()!=null && !consolidadosdetalleOrigen.getcodigo_detalle_grupo().equals(""))) {consolidadosdetalle.setcodigo_detalle_grupo(consolidadosdetalleOrigen.getcodigo_detalle_grupo());}
			if(conDefault || (!conDefault && consolidadosdetalleOrigen.getnombre_detalle_grupo()!=null && !consolidadosdetalleOrigen.getnombre_detalle_grupo().equals(""))) {consolidadosdetalle.setnombre_detalle_grupo(consolidadosdetalleOrigen.getnombre_detalle_grupo());}
			if(conDefault || (!conDefault && consolidadosdetalleOrigen.getclave()!=null && !consolidadosdetalleOrigen.getclave().equals(""))) {consolidadosdetalle.setclave(consolidadosdetalleOrigen.getclave());}
			if(conDefault || (!conDefault && consolidadosdetalleOrigen.getnombre()!=null && !consolidadosdetalleOrigen.getnombre().equals(""))) {consolidadosdetalle.setnombre(consolidadosdetalleOrigen.getnombre());}
			if(conDefault || (!conDefault && consolidadosdetalleOrigen.getfecha_compra()!=null && !consolidadosdetalleOrigen.getfecha_compra().equals(new Date()))) {consolidadosdetalle.setfecha_compra(consolidadosdetalleOrigen.getfecha_compra());}
			if(conDefault || (!conDefault && consolidadosdetalleOrigen.getvida_util()!=null && !consolidadosdetalleOrigen.getvida_util().equals(0.0))) {consolidadosdetalle.setvida_util(consolidadosdetalleOrigen.getvida_util());}
			if(conDefault || (!conDefault && consolidadosdetalleOrigen.getcosto_de_compra()!=null && !consolidadosdetalleOrigen.getcosto_de_compra().equals(0.0))) {consolidadosdetalle.setcosto_de_compra(consolidadosdetalleOrigen.getcosto_de_compra());}
			if(conDefault || (!conDefault && consolidadosdetalleOrigen.getcantidad()!=null && !consolidadosdetalleOrigen.getcantidad().equals(0))) {consolidadosdetalle.setcantidad(consolidadosdetalleOrigen.getcantidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalle) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelidConsolidadosDetalle.setText(consolidadosdetalle.getId().toString());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_empresaConsolidadosDetalle.setText(consolidadosdetalle.getnombre_empresa());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_sucursalConsolidadosDetalle.setText(consolidadosdetalle.getnombre_sucursal());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcodigo_sub_grupoConsolidadosDetalle.setText(consolidadosdetalle.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_sub_grupoConsolidadosDetalle.setText(consolidadosdetalle.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcodigo_detalle_grupoConsolidadosDetalle.setText(consolidadosdetalle.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_detalle_grupoConsolidadosDetalle.setText(consolidadosdetalle.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldclaveConsolidadosDetalle.setText(consolidadosdetalle.getclave());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombreConsolidadosDetalle.setText(consolidadosdetalle.getnombre());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jDateChooserfecha_compraConsolidadosDetalle.setDate(consolidadosdetalle.getfecha_compra());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldvida_utilConsolidadosDetalle.setText(consolidadosdetalle.getvida_util().toString());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcosto_de_compraConsolidadosDetalle.setText(consolidadosdetalle.getcosto_de_compra().toString());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcantidadConsolidadosDetalle.setText(consolidadosdetalle.getcantidad().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConsolidadosDetalle(ConsolidadosDetalleBean consolidadosdetalleBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelidConsolidadosDetalle.setText(consolidadosdetalleBean.getId().toString());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_empresaConsolidadosDetalle.setText(consolidadosdetalleBean.getnombre_empresa());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_sucursalConsolidadosDetalle.setText(consolidadosdetalleBean.getnombre_sucursal());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcodigo_sub_grupoConsolidadosDetalle.setText(consolidadosdetalleBean.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_sub_grupoConsolidadosDetalle.setText(consolidadosdetalleBean.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcodigo_detalle_grupoConsolidadosDetalle.setText(consolidadosdetalleBean.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_detalle_grupoConsolidadosDetalle.setText(consolidadosdetalleBean.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldclaveConsolidadosDetalle.setText(consolidadosdetalleBean.getclave());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombreConsolidadosDetalle.setText(consolidadosdetalleBean.getnombre());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jDateChooserfecha_compraConsolidadosDetalle.setDate(consolidadosdetalleBean.getfecha_compra());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldvida_utilConsolidadosDetalle.setText(consolidadosdetalleBean.getvida_util().toString());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcosto_de_compraConsolidadosDetalle.setText(consolidadosdetalleBean.getcosto_de_compra().toString());
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcantidadConsolidadosDetalle.setText(consolidadosdetalleBean.getcantidad().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanConsolidadosDetalle(ConsolidadosDetalleParameterReturnGeneral consolidadosdetalleReturnGeneral,ConsolidadosDetalleBean consolidadosdetalleBean,Boolean conDefault) throws Exception { 
		try {
			ConsolidadosDetalle consolidadosdetalleLocal=new ConsolidadosDetalle();
			
			consolidadosdetalleLocal=consolidadosdetalleReturnGeneral.getConsolidadosDetalle();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && consolidadosdetalleLocal.getId()!=null && !consolidadosdetalleLocal.getId().equals(0L))) {consolidadosdetalleBean.setId(consolidadosdetalleLocal.getId());}}
			if(conDefault || (!conDefault && consolidadosdetalleLocal.getnombre_empresa()!=null && !consolidadosdetalleLocal.getnombre_empresa().equals(""))) {consolidadosdetalleBean.setnombre_empresa(consolidadosdetalleLocal.getnombre_empresa());}
			if(conDefault || (!conDefault && consolidadosdetalleLocal.getnombre_sucursal()!=null && !consolidadosdetalleLocal.getnombre_sucursal().equals(""))) {consolidadosdetalleBean.setnombre_sucursal(consolidadosdetalleLocal.getnombre_sucursal());}
			if(conDefault || (!conDefault && consolidadosdetalleLocal.getcodigo_sub_grupo()!=null && !consolidadosdetalleLocal.getcodigo_sub_grupo().equals(""))) {consolidadosdetalleBean.setcodigo_sub_grupo(consolidadosdetalleLocal.getcodigo_sub_grupo());}
			if(conDefault || (!conDefault && consolidadosdetalleLocal.getnombre_sub_grupo()!=null && !consolidadosdetalleLocal.getnombre_sub_grupo().equals(""))) {consolidadosdetalleBean.setnombre_sub_grupo(consolidadosdetalleLocal.getnombre_sub_grupo());}
			if(conDefault || (!conDefault && consolidadosdetalleLocal.getcodigo_detalle_grupo()!=null && !consolidadosdetalleLocal.getcodigo_detalle_grupo().equals(""))) {consolidadosdetalleBean.setcodigo_detalle_grupo(consolidadosdetalleLocal.getcodigo_detalle_grupo());}
			if(conDefault || (!conDefault && consolidadosdetalleLocal.getnombre_detalle_grupo()!=null && !consolidadosdetalleLocal.getnombre_detalle_grupo().equals(""))) {consolidadosdetalleBean.setnombre_detalle_grupo(consolidadosdetalleLocal.getnombre_detalle_grupo());}
			if(conDefault || (!conDefault && consolidadosdetalleLocal.getclave()!=null && !consolidadosdetalleLocal.getclave().equals(""))) {consolidadosdetalleBean.setclave(consolidadosdetalleLocal.getclave());}
			if(conDefault || (!conDefault && consolidadosdetalleLocal.getnombre()!=null && !consolidadosdetalleLocal.getnombre().equals(""))) {consolidadosdetalleBean.setnombre(consolidadosdetalleLocal.getnombre());}
			if(conDefault || (!conDefault && consolidadosdetalleLocal.getfecha_compra()!=null && !consolidadosdetalleLocal.getfecha_compra().equals(new Date()))) {consolidadosdetalleBean.setfecha_compra(consolidadosdetalleLocal.getfecha_compra());}
			if(conDefault || (!conDefault && consolidadosdetalleLocal.getvida_util()!=null && !consolidadosdetalleLocal.getvida_util().equals(0.0))) {consolidadosdetalleBean.setvida_util(consolidadosdetalleLocal.getvida_util());}
			if(conDefault || (!conDefault && consolidadosdetalleLocal.getcosto_de_compra()!=null && !consolidadosdetalleLocal.getcosto_de_compra().equals(0.0))) {consolidadosdetalleBean.setcosto_de_compra(consolidadosdetalleLocal.getcosto_de_compra());}
			if(conDefault || (!conDefault && consolidadosdetalleLocal.getcantidad()!=null && !consolidadosdetalleLocal.getcantidad().equals(0))) {consolidadosdetalleBean.setcantidad(consolidadosdetalleLocal.getcantidad());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxConsolidadosDetalleGenerico(Long idConsolidadosDetalleSeleccionado,JComboBox jComboBoxConsolidadosDetalle,List<ConsolidadosDetalle> consolidadosdetallesLocal)throws Exception {
		try {
			ConsolidadosDetalle  consolidadosdetalleTemp=null;

			for(ConsolidadosDetalle consolidadosdetalleAux:consolidadosdetallesLocal) {
				if(consolidadosdetalleAux.getId()!=null && consolidadosdetalleAux.getId().equals(idConsolidadosDetalleSeleccionado)) {
					consolidadosdetalleTemp=consolidadosdetalleAux;
					break;
				}
			}

			jComboBoxConsolidadosDetalle.setSelectedItem(consolidadosdetalleTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxConsolidadosDetalleGenerico(JComboBox jComboBoxConsolidadosDetalle,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxConsolidadosDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConsolidadosDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxConsolidadosDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConsolidadosDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConsolidadosDetalle.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxConsolidadosDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConsolidadosDetalle.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxConsolidadosDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxConsolidadosDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxConsolidadosDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			consolidadosdetalle=(ConsolidadosDetalle) consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			consolidadosdetalle =(ConsolidadosDetalle) consolidadosdetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!consolidadosdetalle.getIsNew() && !consolidadosdetalle.getIsChanged() && !consolidadosdetalle.getIsDeleted()) {
				sDescripcion=consolidadosdetalle.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=consolidadosdetalle.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ConsolidadosDetalle consolidadosdetalleRow=new ConsolidadosDetalle();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			consolidadosdetalleRow=(ConsolidadosDetalle) consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			consolidadosdetalleRow=(ConsolidadosDetalle) consolidadosdetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualConsolidadosDetalle(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoConsolidadosDetalle.setVisible((this.isVisibilidadCeldaNuevoConsolidadosDetalle && this.isPermisoNuevoConsolidadosDetalle));			
			this.jButtonDuplicarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaDuplicarConsolidadosDetalle && this.isPermisoDuplicarConsolidadosDetalle));			
			this.jButtonCopiarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaCopiarConsolidadosDetalle && this.isPermisoCopiarConsolidadosDetalle));
			this.jButtonVerFormConsolidadosDetalle.setVisible((this.isVisibilidadCeldaVerFormConsolidadosDetalle && this.isPermisoVerFormConsolidadosDetalle));
			
			this.jButtonAbrirOrderByConsolidadosDetalle.setVisible((this.isVisibilidadCeldaOrdenConsolidadosDetalle && this.isPermisoOrdenConsolidadosDetalle));			
			
			this.jButtonNuevoRelacionesConsolidadosDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle && this.isPermisoNuevoConsolidadosDetalle));			
			this.jButtonNuevoGuardarCambiosConsolidadosDetalle.setVisible((this.isVisibilidadCeldaNuevoConsolidadosDetalle && this.isPermisoNuevoConsolidadosDetalle && this.isPermisoGuardarCambiosConsolidadosDetalle));
			
			if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonModificarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaModificarConsolidadosDetalle && this.isPermisoActualizarConsolidadosDetalle));	
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonActualizarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaActualizarConsolidadosDetalle && this.isPermisoActualizarConsolidadosDetalle));	
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonEliminarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaEliminarConsolidadosDetalle && this.isPermisoEliminarConsolidadosDetalle));
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonCancelarConsolidadosDetalle.setVisible(this.isVisibilidadCeldaCancelarConsolidadosDetalle);							
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonGuardarCambiosConsolidadosDetalle.setVisible((this.isVisibilidadCeldaGuardarConsolidadosDetalle && this.isPermisoGuardarCambiosConsolidadosDetalle));			
			
			}
						
			this.jButtonGuardarCambiosTablaConsolidadosDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosConsolidadosDetalle && this.isPermisoGuardarCambiosConsolidadosDetalle));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaNuevoConsolidadosDetalle && this.isPermisoNuevoConsolidadosDetalle));						
			this.jButtonDuplicarToolBarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaDuplicarConsolidadosDetalle && this.isPermisoDuplicarConsolidadosDetalle));						
			this.jButtonCopiarToolBarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaCopiarConsolidadosDetalle && this.isPermisoCopiarConsolidadosDetalle));			
			this.jButtonVerFormToolBarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaVerFormConsolidadosDetalle && this.isPermisoVerFormConsolidadosDetalle));			
			this.jButtonAbrirOrderByToolBarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaOrdenConsolidadosDetalle && this.isPermisoOrdenConsolidadosDetalle));
			this.jButtonNuevoRelacionesToolBarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle && this.isPermisoNuevoConsolidadosDetalle));			
			this.jButtonNuevoGuardarCambiosToolBarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaNuevoConsolidadosDetalle && this.isPermisoNuevoConsolidadosDetalle && this.isPermisoGuardarCambiosConsolidadosDetalle));			
			
			if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonModificarToolBarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaModificarConsolidadosDetalle && this.isPermisoActualizarConsolidadosDetalle));	
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonActualizarToolBarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaActualizarConsolidadosDetalle  && this.isPermisoActualizarConsolidadosDetalle));	
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonEliminarToolBarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaEliminarConsolidadosDetalle && this.isPermisoEliminarConsolidadosDetalle));
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonCancelarToolBarConsolidadosDetalle.setVisible(this.isVisibilidadCeldaCancelarConsolidadosDetalle);				
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonGuardarCambiosToolBarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaGuardarConsolidadosDetalle && this.isPermisoGuardarCambiosConsolidadosDetalle));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosConsolidadosDetalle && this.isPermisoGuardarCambiosConsolidadosDetalle));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoConsolidadosDetalle.setVisible((this.isVisibilidadCeldaNuevoConsolidadosDetalle && this.isPermisoNuevoConsolidadosDetalle));			
			this.jMenuItemDuplicarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaDuplicarConsolidadosDetalle && this.isPermisoDuplicarConsolidadosDetalle));			
			this.jMenuItemCopiarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaCopiarConsolidadosDetalle && this.isPermisoCopiarConsolidadosDetalle));			
			this.jMenuItemVerFormConsolidadosDetalle.setVisible((this.isVisibilidadCeldaVerFormConsolidadosDetalle && this.isPermisoVerFormConsolidadosDetalle));			
			this.jMenuItemAbrirOrderByConsolidadosDetalle.setVisible((this.isVisibilidadCeldaOrdenConsolidadosDetalle && this.isPermisoOrdenConsolidadosDetalle));			
			//this.jMenuItemMostrarOcultarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaOrdenConsolidadosDetalle && this.isPermisoOrdenConsolidadosDetalle));
			this.jMenuItemDetalleAbrirOrderByConsolidadosDetalle.setVisible((this.isVisibilidadCeldaOrdenConsolidadosDetalle && this.isPermisoOrdenConsolidadosDetalle));			
			//this.jMenuItemDetalleMostrarOcultarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaOrdenConsolidadosDetalle && this.isPermisoOrdenConsolidadosDetalle));			
			this.jMenuItemNuevoRelacionesConsolidadosDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle && this.isPermisoNuevoConsolidadosDetalle));			
			this.jMenuItemNuevoGuardarCambiosConsolidadosDetalle.setVisible((this.isVisibilidadCeldaNuevoConsolidadosDetalle && this.isPermisoNuevoConsolidadosDetalle && this.isPermisoGuardarCambiosConsolidadosDetalle));									
			
			if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.jMenuItemModificarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaModificarConsolidadosDetalle && this.isPermisoActualizarConsolidadosDetalle));	
			this.jInternalFrameDetalleFormConsolidadosDetalle.jMenuItemActualizarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaActualizarConsolidadosDetalle && this.isPermisoActualizarConsolidadosDetalle));	
			this.jInternalFrameDetalleFormConsolidadosDetalle.jMenuItemEliminarConsolidadosDetalle.setVisible((this.isVisibilidadCeldaEliminarConsolidadosDetalle && this.isPermisoEliminarConsolidadosDetalle));
			this.jInternalFrameDetalleFormConsolidadosDetalle.jMenuItemCancelarConsolidadosDetalle.setVisible(this.isVisibilidadCeldaCancelarConsolidadosDetalle);				
			}
			
			this.jMenuItemGuardarCambiosConsolidadosDetalle.setVisible((this.isVisibilidadCeldaGuardarConsolidadosDetalle && this.isPermisoGuardarCambiosConsolidadosDetalle));						
			this.jMenuItemGuardarCambiosTablaConsolidadosDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosConsolidadosDetalle && this.isPermisoGuardarCambiosConsolidadosDetalle));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoConsolidadosDetalle=this.jButtonNuevoConsolidadosDetalle.isVisible();
			this.isVisibilidadCeldaDuplicarConsolidadosDetalle=this.jButtonDuplicarConsolidadosDetalle.isVisible();
			this.isVisibilidadCeldaCopiarConsolidadosDetalle=this.jButtonCopiarConsolidadosDetalle.isVisible();
			this.isVisibilidadCeldaVerFormConsolidadosDetalle=this.jButtonVerFormConsolidadosDetalle.isVisible();
			
			this.isVisibilidadCeldaOrdenConsolidadosDetalle=this.jButtonAbrirOrderByConsolidadosDetalle.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle=this.jButtonNuevoRelacionesConsolidadosDetalle.isVisible();
			this.isVisibilidadCeldaModificarConsolidadosDetalle=this.jButtonModificarConsolidadosDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
			this.isVisibilidadCeldaActualizarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonActualizarConsolidadosDetalle.isVisible();
			this.isVisibilidadCeldaEliminarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonEliminarConsolidadosDetalle.isVisible();
			this.isVisibilidadCeldaCancelarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonCancelarConsolidadosDetalle.isVisible();
			this.isVisibilidadCeldaGuardarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonGuardarCambiosConsolidadosDetalle.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosConsolidadosDetalle=this.jButtonGuardarCambiosTablaConsolidadosDetalle.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoConsolidadosDetalle=this.jButtonNuevoToolBarConsolidadosDetalle.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle=this.jButtonNuevoRelacionesToolBarConsolidadosDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
			this.isVisibilidadCeldaModificarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonModificarToolBarConsolidadosDetalle.isVisible();
			this.isVisibilidadCeldaActualizarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonActualizarToolBarConsolidadosDetalle.isVisible();
			this.isVisibilidadCeldaEliminarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonEliminarToolBarConsolidadosDetalle.isVisible();
			this.isVisibilidadCeldaCancelarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonCancelarToolBarConsolidadosDetalle.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConsolidadosDetalle=this.jButtonGuardarCambiosToolBarConsolidadosDetalle.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConsolidadosDetalle=this.jButtonGuardarCambiosTablaToolBarConsolidadosDetalle.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoConsolidadosDetalle=this.jMenuItemNuevoConsolidadosDetalle.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle=this.jMenuItemNuevoRelacionesConsolidadosDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
			this.isVisibilidadCeldaModificarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jMenuItemModificarConsolidadosDetalle.isVisible();
			this.isVisibilidadCeldaActualizarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jMenuItemActualizarConsolidadosDetalle.isVisible();
			this.isVisibilidadCeldaEliminarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jMenuItemEliminarConsolidadosDetalle.isVisible();
			this.isVisibilidadCeldaCancelarConsolidadosDetalle=this.jInternalFrameDetalleFormConsolidadosDetalle.jMenuItemCancelarConsolidadosDetalle.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConsolidadosDetalle=this.jMenuItemGuardarCambiosConsolidadosDetalle.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConsolidadosDetalle=this.jMenuItemGuardarCambiosTablaConsolidadosDetalle.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesConsolidadosDetalle(Boolean esInicializar) {
		if(ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL) {			
			if(this.consolidadosdetalleSessionBean.getConGuardarRelaciones()) {
				//if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesConsolidadosDetalle();
			}
			
			this.inicializarActualizarBindingBotonesManualConsolidadosDetalle(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualConsolidadosDetalle() {
		this.jButtonNuevoConsolidadosDetalle.setVisible(this.isPermisoNuevoConsolidadosDetalle);			
		this.jButtonDuplicarConsolidadosDetalle.setVisible(this.isPermisoDuplicarConsolidadosDetalle);			
		this.jButtonCopiarConsolidadosDetalle.setVisible(this.isPermisoCopiarConsolidadosDetalle);			
		this.jButtonVerFormConsolidadosDetalle.setVisible(this.isPermisoVerFormConsolidadosDetalle);			
		
		this.jButtonAbrirOrderByConsolidadosDetalle.setVisible(this.isPermisoOrdenConsolidadosDetalle);					
		
		this.jButtonNuevoRelacionesConsolidadosDetalle.setVisible(this.isPermisoNuevoConsolidadosDetalle);			
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonModificarConsolidadosDetalle.setVisible(this.isPermisoActualizarConsolidadosDetalle);	
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonActualizarConsolidadosDetalle.setVisible(this.isPermisoActualizarConsolidadosDetalle);	
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonEliminarConsolidadosDetalle.setVisible(this.isPermisoEliminarConsolidadosDetalle);
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonCancelarConsolidadosDetalle.setVisible(this.isVisibilidadCeldaCancelarConsolidadosDetalle);						
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonGuardarCambiosConsolidadosDetalle.setVisible(this.isPermisoGuardarCambiosConsolidadosDetalle);							
		}
		
		this.jButtonGuardarCambiosTablaConsolidadosDetalle.setVisible(this.isPermisoActualizarConsolidadosDetalle);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleConsolidadosDetalle() {
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonModificarConsolidadosDetalle.setVisible(this.isPermisoActualizarConsolidadosDetalle);	
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonActualizarConsolidadosDetalle.setVisible(this.isPermisoActualizarConsolidadosDetalle);	
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonEliminarConsolidadosDetalle.setVisible(this.isPermisoEliminarConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonCancelarConsolidadosDetalle.setVisible(this.isVisibilidadCeldaCancelarConsolidadosDetalle);							
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonGuardarCambiosConsolidadosDetalle.setVisible((this.isVisibilidadCeldaGuardarConsolidadosDetalle && this.isPermisoGuardarCambiosConsolidadosDetalle));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosConsolidadosDetalle() {
		if(ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualConsolidadosDetalle();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesConsolidadosDetalle() {
	}
	
	public void jTableDatosConsolidadosDetalleListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarConsolidadosDetalle(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidConsolidadosDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.getconsolidadosdetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosdetalle==null) {
						this.consolidadosdetalle = new ConsolidadosDetalle();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
				}

				if(this.consolidadosdetalle.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.consolidadosdetalle.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaConsolidadosDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebConsolidadosDetalle(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsolidadosDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsolidadosDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.getconsolidadosdetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.consolidadosdetalleLogic.getConnexion());

				if(this.consolidadosdetalle.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.consolidadosdetalle.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsolidadosDetalle=(TitledBorder)this.jScrollPanelDatosConsolidadosDetalle.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderConsolidadosDetalle.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaConsolidadosDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.getconsolidadosdetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosdetalle==null) {
						this.consolidadosdetalle = new ConsolidadosDetalle();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
				}

				if(this.consolidadosdetalle.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.consolidadosdetalle.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_empresaConsolidadosDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.getconsolidadosdetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosdetalle==null) {
						this.consolidadosdetalle = new ConsolidadosDetalle();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
				}

				if(this.consolidadosdetalle.getnombre_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_empresa like '%"+this.consolidadosdetalle.getnombre_empresa()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sucursalConsolidadosDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.getconsolidadosdetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosdetalle==null) {
						this.consolidadosdetalle = new ConsolidadosDetalle();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
				}

				if(this.consolidadosdetalle.getnombre_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sucursal like '%"+this.consolidadosdetalle.getnombre_sucursal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_sub_grupoConsolidadosDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.getconsolidadosdetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosdetalle==null) {
						this.consolidadosdetalle = new ConsolidadosDetalle();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
				}

				if(this.consolidadosdetalle.getcodigo_sub_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_sub_grupo like '%"+this.consolidadosdetalle.getcodigo_sub_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sub_grupoConsolidadosDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.getconsolidadosdetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosdetalle==null) {
						this.consolidadosdetalle = new ConsolidadosDetalle();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
				}

				if(this.consolidadosdetalle.getnombre_sub_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sub_grupo like '%"+this.consolidadosdetalle.getnombre_sub_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_detalle_grupoConsolidadosDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.getconsolidadosdetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosdetalle==null) {
						this.consolidadosdetalle = new ConsolidadosDetalle();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
				}

				if(this.consolidadosdetalle.getcodigo_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_detalle_grupo like '%"+this.consolidadosdetalle.getcodigo_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_detalle_grupoConsolidadosDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.getconsolidadosdetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosdetalle==null) {
						this.consolidadosdetalle = new ConsolidadosDetalle();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
				}

				if(this.consolidadosdetalle.getnombre_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_detalle_grupo like '%"+this.consolidadosdetalle.getnombre_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonclaveConsolidadosDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.getconsolidadosdetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosdetalle==null) {
						this.consolidadosdetalle = new ConsolidadosDetalle();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
				}

				if(this.consolidadosdetalle.getclave()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where clave like '%"+this.consolidadosdetalle.getclave()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreConsolidadosDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.getconsolidadosdetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosdetalle==null) {
						this.consolidadosdetalle = new ConsolidadosDetalle();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
				}

				if(this.consolidadosdetalle.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.consolidadosdetalle.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_compraConsolidadosDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.getconsolidadosdetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosdetalle==null) {
						this.consolidadosdetalle = new ConsolidadosDetalle();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
				}

				if(this.consolidadosdetalle.getfecha_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_compra = '"+Funciones2.getStringPostgresDate(this.consolidadosdetalle.getfecha_compra())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvida_utilConsolidadosDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.getconsolidadosdetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosdetalle==null) {
						this.consolidadosdetalle = new ConsolidadosDetalle();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
				}

				if(this.consolidadosdetalle.getvida_util()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where vida_util = "+this.consolidadosdetalle.getvida_util().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_de_compraConsolidadosDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.getconsolidadosdetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosdetalle==null) {
						this.consolidadosdetalle = new ConsolidadosDetalle();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
				}

				if(this.consolidadosdetalle.getcosto_de_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_de_compra = "+this.consolidadosdetalle.getcosto_de_compra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadConsolidadosDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.getconsolidadosdetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consolidadosdetalle==null) {
						this.consolidadosdetalle = new ConsolidadosDetalle();
					}

					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);
				}

				if(this.consolidadosdetalle.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.consolidadosdetalle.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsolidadosDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaConsolidadosDetalleConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsolidadosDetalle(false,false);

			this.getConsolidadosDetallesBusquedaConsolidadosDetalle();

			this.inicializarActualizarBindingConsolidadosDetalle(false);

			//if(ConsolidadosDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsolidadosDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaConsolidadosDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsolidadosDetalle(false,false);

			this.getConsolidadosDetallesFK_IdEmpresa();

			this.inicializarActualizarBindingConsolidadosDetalle(false);

			//if(ConsolidadosDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsolidadosDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consolidadosdetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameConsolidadosDetalle() {
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.setVisible(false);	    			
			this.jInternalFrameDetalleFormConsolidadosDetalle.dispose();
			this.jInternalFrameDetalleFormConsolidadosDetalle=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoConsolidadosDetalle!=null) {
			this.jInternalFrameReporteDinamicoConsolidadosDetalle.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoConsolidadosDetalle.dispose();
			this.jInternalFrameReporteDinamicoConsolidadosDetalle=null;
		}
		
		if(this.jInternalFrameImportacionConsolidadosDetalle!=null) {
			this.jInternalFrameImportacionConsolidadosDetalle.setVisible(false);	    			
			this.jInternalFrameImportacionConsolidadosDetalle.dispose();
			this.jInternalFrameImportacionConsolidadosDetalle=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessConsolidadosDetalle();
			
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
			
			
			if(sTipo.equals("NuevoConsolidadosDetalle")) {
				jButtonNuevoConsolidadosDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarConsolidadosDetalle")) {
				jButtonDuplicarConsolidadosDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarConsolidadosDetalle")) {
				jButtonCopiarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("VerFormConsolidadosDetalle")) {
				jButtonVerFormConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarConsolidadosDetalle")) {
				jButtonNuevoConsolidadosDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarConsolidadosDetalle")) {
				jButtonDuplicarConsolidadosDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoConsolidadosDetalle")) {
				jButtonNuevoConsolidadosDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarConsolidadosDetalle")) {
				jButtonDuplicarConsolidadosDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesConsolidadosDetalle")) {
				jButtonNuevoConsolidadosDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarConsolidadosDetalle")) {
				jButtonNuevoConsolidadosDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesConsolidadosDetalle")) {
				jButtonNuevoConsolidadosDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarConsolidadosDetalle")) {
				jButtonModificarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarConsolidadosDetalle")) {
				jButtonModificarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarConsolidadosDetalle")) {
				jButtonModificarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("ActualizarConsolidadosDetalle")) {
				jButtonActualizarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarConsolidadosDetalle")) {
				jButtonActualizarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarConsolidadosDetalle")) {
				jButtonActualizarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("EliminarConsolidadosDetalle")) {
				jButtonEliminarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarConsolidadosDetalle")) {
				jButtonEliminarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarConsolidadosDetalle")) {
				jButtonEliminarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("CancelarConsolidadosDetalle")) {
				jButtonCancelarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarConsolidadosDetalle")) {
				jButtonCancelarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarConsolidadosDetalle")) {
				jButtonCancelarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("CerrarConsolidadosDetalle")) {
				jButtonCerrarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarConsolidadosDetalle")) {
				jButtonCerrarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarConsolidadosDetalle")) {
				jButtonCerrarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarConsolidadosDetalle")) {
				jButtonMostrarOcultarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarConsolidadosDetalle")) {
				jButtonCancelarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosConsolidadosDetalle")) {
				jButtonGuardarCambiosConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarConsolidadosDetalle")) {
				jButtonGuardarCambiosConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarConsolidadosDetalle")) {
				jButtonCopiarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarConsolidadosDetalle")) {
				jButtonVerFormConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosConsolidadosDetalle")) {
				jButtonGuardarCambiosConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarConsolidadosDetalle")) {
				jButtonCopiarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormConsolidadosDetalle")) {
				jButtonVerFormConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaConsolidadosDetalle")) {
				jButtonGuardarCambiosConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarConsolidadosDetalle")) {
				jButtonGuardarCambiosConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaConsolidadosDetalle")) {
				jButtonGuardarCambiosConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionConsolidadosDetalle")) {
				jButtonRecargarInformacionConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarConsolidadosDetalle")) {
				jButtonRecargarInformacionConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionConsolidadosDetalle")) {
				jButtonRecargarInformacionConsolidadosDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresConsolidadosDetalle")) {
				jButtonAnterioresConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarConsolidadosDetalle")) {
				jButtonAnterioresConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreConsolidadosDetalle")) {
				jButtonAnterioresConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("SiguientesConsolidadosDetalle")) {
				jButtonSiguientesConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarConsolidadosDetalle")) {
				jButtonSiguientesConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesConsolidadosDetalle")) {
				jButtonSiguientesConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByConsolidadosDetalle") || sTipo.equals("MenuItemDetalleAbrirOrderByConsolidadosDetalle")) {
				jButtonAbrirOrderByConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarConsolidadosDetalle") || sTipo.equals("MenuItemDetalleMostrarOcultarConsolidadosDetalle")) {
				jButtonMostrarOcultarConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosConsolidadosDetalle")) {
				jButtonNuevoGuardarCambiosConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarConsolidadosDetalle")) {
				jButtonNuevoGuardarCambiosConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosConsolidadosDetalle")) {
				jButtonNuevoGuardarCambiosConsolidadosDetalleActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoConsolidadosDetalle")) {
				jButtonCerrarReporteDinamicoConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoConsolidadosDetalle")) {
				jButtonGenerarReporteDinamicoConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoConsolidadosDetalle")) {
				
				jButtonGenerarExcelReporteDinamicoConsolidadosDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionConsolidadosDetalle")) {
				jButtonCerrarImportacionConsolidadosDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionConsolidadosDetalle")) {
				
				jButtonGenerarImportacionConsolidadosDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionConsolidadosDetalle")) {
				
				jButtonAbrirImportacionConsolidadosDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesConsolidadosDetalle")) {
				jComboBoxTiposAccionesConsolidadosDetalleActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesConsolidadosDetalle")) {
				jComboBoxTiposRelacionesConsolidadosDetalleActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioConsolidadosDetalle")) {
				jComboBoxTiposAccionesConsolidadosDetalleActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarConsolidadosDetalle")) {
				
				jComboBoxTiposSeleccionarConsolidadosDetalleActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralConsolidadosDetalle")) {
				jTextFieldValorCampoGeneralConsolidadosDetalleActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByConsolidadosDetalle")) {
				jButtonAbrirOrderByConsolidadosDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarConsolidadosDetalle")) {
				jButtonAbrirOrderByConsolidadosDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByConsolidadosDetalle")) {
				jButtonCerrarOrderByConsolidadosDetalleActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConsolidadosDetalleBusqueda")) {
				this.jButtonidConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConsolidadosDetalleUpdate")) {
				this.jButtonid_empresaConsolidadosDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConsolidadosDetalleBusqueda")) {
				this.jButtonid_empresaConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_empresaConsolidadosDetalleBusqueda")) {
				this.jButtonnombre_empresaConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalConsolidadosDetalleBusqueda")) {
				this.jButtonnombre_sucursalConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sub_grupoConsolidadosDetalleBusqueda")) {
				this.jButtoncodigo_sub_grupoConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sub_grupoConsolidadosDetalleBusqueda")) {
				this.jButtonnombre_sub_grupoConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_detalle_grupoConsolidadosDetalleBusqueda")) {
				this.jButtoncodigo_detalle_grupoConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoConsolidadosDetalleBusqueda")) {
				this.jButtonnombre_detalle_grupoConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveConsolidadosDetalleBusqueda")) {
				this.jButtonclaveConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreConsolidadosDetalleBusqueda")) {
				this.jButtonnombreConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraConsolidadosDetalleBusqueda")) {
				this.jButtonfecha_compraConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("vida_utilConsolidadosDetalleBusqueda")) {
				this.jButtonvida_utilConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_de_compraConsolidadosDetalleBusqueda")) {
				this.jButtoncosto_de_compraConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadConsolidadosDetalleBusqueda")) {
				this.jButtoncantidadConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaConsolidadosDetalleConsolidadosDetalle")) {
				this.jButtonBusquedaConsolidadosDetalleConsolidadosDetalleActionPerformed(evt);
			}
			
			;
			
			
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessConsolidadosDetalle();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsolidadosDetalleActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosdetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosdetalle);
				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
				
				


				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ConsolidadosDetalle consolidadosdetalleLocal=null;
			
			if(!this.getEsControlTabla()) {
				consolidadosdetalleLocal=this.consolidadosdetalle;
			} else {
				consolidadosdetalleLocal=this.consolidadosdetalleAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosdetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosdetalle);
				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
							
				
				


				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsolidadosDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleAnterior =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consolidadosdetalleAnterior =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
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
			
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
			
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
			
			


			
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsolidadosDetalleActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosdetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosdetalle);
				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
								
						
				


				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosDetalle.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosdetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosdetalle);
				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
								
				
				


				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsolidadosDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleAnterior =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consolidadosdetalleAnterior =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosdetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosdetalle);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsolidadosDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleAnterior =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consolidadosdetalleAnterior =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsolidadosDetalleActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosdetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.consolidadosdetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosdetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosdetalle);
				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
							
				
				


				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosDetalle.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsolidadosDetalleActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosdetalleAnterior =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.consolidadosdetalleAnterior =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
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
			
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
			
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
			
			


			
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsolidadosDetalleActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosdetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.consolidadosdetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosdetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosdetalle);
				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
								
				
				


				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsolidadosDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleAnterior =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consolidadosdetalleAnterior =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsolidadosDetalleActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosdetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.consolidadosdetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsolidadosDetalleActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosdetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosdetalle);
				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosConsolidadosDetalle")) {
					jCheckBoxSeleccionarTodosConsolidadosDetalleItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosConsolidadosDetalle")) {
					jCheckBoxSeleccionadosConsolidadosDetalleItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarConsolidadosDetalle")) {
					
				}
				
				


				
				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosdetalle);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.consolidadosdetalle);
				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
												
				
				


				
				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsolidadosDetalleActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consolidadosdetalleAnterior =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.consolidadosdetalleAnterior =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsolidadosDetalleActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosdetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosdetalle);
				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
				
				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
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
			
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
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
			
			


			
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsolidadosDetalleActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosdetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosdetalle);
				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosDetalle.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosDetalle.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consolidadosdetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consolidadosdetalle);
				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
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
				
				


				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsolidadosDetalle.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsolidadosDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsolidadosDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consolidadosdetalleAnterior =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consolidadosdetalleAnterior =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarConsolidadosDetalle")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosConsolidadosDetalleListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosConsolidadosDetalle.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.consolidadosdetalle =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.consolidadosdetalle);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarConsolidadosDetalle")) {
				
				}
				
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarConsolidadosDetalle")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosConsolidadosDetalle.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarConsolidadosDetalle")) {
			
			}
			
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessConsolidadosDetalle();
			
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
			
			if(sTipo.equals("NuevoConsolidadosDetalle")) {
				jButtonNuevoConsolidadosDetalleActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarConsolidadosDetalle")) {
				jButtonDuplicarConsolidadosDetalleActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarConsolidadosDetalle")) {
				jButtonCopiarConsolidadosDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormConsolidadosDetalle")) {
				jButtonVerFormConsolidadosDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesConsolidadosDetalle")) {
				jButtonNuevoConsolidadosDetalleActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarConsolidadosDetalle")) {
				jButtonModificarConsolidadosDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarConsolidadosDetalle")) {
				jButtonActualizarConsolidadosDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarConsolidadosDetalle")) {
				jButtonEliminarConsolidadosDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaConsolidadosDetalle")) {
				jButtonGuardarCambiosConsolidadosDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarConsolidadosDetalle")) {
				jButtonCancelarConsolidadosDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarConsolidadosDetalle")) {
				jButtonCerrarConsolidadosDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosConsolidadosDetalle")) {
				jButtonGuardarCambiosConsolidadosDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosConsolidadosDetalle")) {
				jButtonNuevoGuardarCambiosConsolidadosDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByConsolidadosDetalle")) {
				jButtonAbrirOrderByConsolidadosDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionConsolidadosDetalle")) {
				jButtonRecargarInformacionConsolidadosDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresConsolidadosDetalle")) {
				jButtonAnterioresConsolidadosDetalleActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesConsolidadosDetalle")) {
				jButtonSiguientesConsolidadosDetalleActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConsolidadosDetalleBusqueda")) {
				this.jButtonidConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConsolidadosDetalleUpdate")) {
				this.jButtonid_empresaConsolidadosDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConsolidadosDetalleBusqueda")) {
				this.jButtonid_empresaConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_empresaConsolidadosDetalleBusqueda")) {
				this.jButtonnombre_empresaConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalConsolidadosDetalleBusqueda")) {
				this.jButtonnombre_sucursalConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sub_grupoConsolidadosDetalleBusqueda")) {
				this.jButtoncodigo_sub_grupoConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sub_grupoConsolidadosDetalleBusqueda")) {
				this.jButtonnombre_sub_grupoConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_detalle_grupoConsolidadosDetalleBusqueda")) {
				this.jButtoncodigo_detalle_grupoConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoConsolidadosDetalleBusqueda")) {
				this.jButtonnombre_detalle_grupoConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveConsolidadosDetalleBusqueda")) {
				this.jButtonclaveConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreConsolidadosDetalleBusqueda")) {
				this.jButtonnombreConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraConsolidadosDetalleBusqueda")) {
				this.jButtonfecha_compraConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("vida_utilConsolidadosDetalleBusqueda")) {
				this.jButtonvida_utilConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_de_compraConsolidadosDetalleBusqueda")) {
				this.jButtoncosto_de_compraConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadConsolidadosDetalleBusqueda")) {
				this.jButtoncantidadConsolidadosDetalleBusquedaActionPerformed(evt);
			}
			
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessConsolidadosDetalle();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameConsolidadosDetalle")) {
				closingInternalFrameConsolidadosDetalle();
				
			} else if(sTipo.equals("jButtonCancelarConsolidadosDetalle")) {
				JInternalFrameBase jInternalFrameDetalleFormConsolidadosDetalle = (JInternalFrameBase)evt.getSource();
	            	
	            ConsolidadosDetalleBeanSwingJInternalFrame jInternalFrameParent=(ConsolidadosDetalleBeanSwingJInternalFrame)jInternalFrameDetalleFormConsolidadosDetalle.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarConsolidadosDetalleActionPerformed(null);
			}
			
			ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.consolidadosdetalle,new Object(),this.consolidadosdetalleParameterGeneral,this.consolidadosdetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormConsolidadosDetalle(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormConsolidadosDetalle(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormConsolidadosDetalle(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.consolidadosdetalle)) {
			if(!esControlTabla) {
				if(ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);			
				}
				
				if(this.consolidadosdetalleSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanConsolidadosDetalle(this.consolidadosdetalleReturnGeneral,this.consolidadosdetalleBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.consolidadosdetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanConsolidadosDetalle(classes,this.consolidadosdetalleReturnGeneral,this.consolidadosdetalleBean,false);
					}
						
					if(this.consolidadosdetalleReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyConsolidadosDetalle(this.consolidadosdetalleReturnGeneral.getConsolidadosDetalle());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioConsolidadosDetalle(this.consolidadosdetalleReturnGeneral.getConsolidadosDetalle());	
					}
						
					if(this.consolidadosdetalleReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioConsolidadosDetalle(this.consolidadosdetalleReturnGeneral.getConsolidadosDetalle(),classes);//this.consolidadosdetalleBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioConsolidadosDetalle(this.consolidadosdetalle,classes);//this.consolidadosdetalleBean);									
				}
			
				if(ConsolidadosDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualConsolidadosDetalle(this.consolidadosdetalle,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConsolidadosDetalle(this.consolidadosdetalle);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.consolidadosdetalleAnterior!=null) {
						this.consolidadosdetalle=this.consolidadosdetalleAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.consolidadosdetalleSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.consolidadosdetalleSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.consolidadosdetalleReturnGeneral.getConsolidadosDetalle(),consolidadosdetalleLogic.getConsolidadosDetalles());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.consolidadosdetalleReturnGeneral.getConsolidadosDetalle(),this.consolidadosdetalles);
				}
				//ARCHITECTURE
				
				//this.jTableDatosConsolidadosDetalle.repaint();
				
				//((AbstractTableModel) this.jTableDatosConsolidadosDetalle.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosConsolidadosDetalle();
			}
		}
	}
	
	public void actualizarVisualTableDatosConsolidadosDetalle() throws Exception {
		
		ConsolidadosDetalleModel consolidadosdetalleModel=(ConsolidadosDetalleModel)this.jTableDatosConsolidadosDetalle.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			consolidadosdetalleModel.consolidadosdetalles=this.consolidadosdetalleLogic.getConsolidadosDetalles();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			consolidadosdetalleModel.consolidadosdetalles=this.consolidadosdetalles;
		}
		
		
		((ConsolidadosDetalleModel) this.jTableDatosConsolidadosDetalle.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaConsolidadosDetalle() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getconsolidadosdetalleAnterior(),this.consolidadosdetalleLogic.getConsolidadosDetalles());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getconsolidadosdetalleAnterior(),this.consolidadosdetalles);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosConsolidadosDetalle();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalle,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
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
										
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.consolidadosdetalle,new Object(),generalEntityParameterGeneral,this.consolidadosdetalleReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.consolidadosdetalleSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ConsolidadosDetalleConstantesFunciones.getClassesRelationshipsOfConsolidadosDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ConsolidadosDetalleConstantesFunciones.getClassesRelationshipsFromStringsOfConsolidadosDetalle(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormConsolidadosDetalle(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ConsolidadosDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.consolidadosdetalle,new Object(),generalEntityParameterGeneral,this.consolidadosdetalleReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioConsolidadosDetalle(ConsolidadosDetalleBean consolidadosdetalleBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanConsolidadosDetalle(ArrayList<Classe> classes,ConsolidadosDetalleReturnGeneral consolidadosdetalleReturnGeneral,ConsolidadosDetalleBean consolidadosdetalleBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalle,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.consolidadosdetalle)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormConsolidadosDetalle = new ConsolidadosDetalleDetalleFormJInternalFrame(jDesktopPane,this.consolidadosdetalleSessionBean.getConGuardarRelaciones(),this.consolidadosdetalleSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.setVisible(false);
		this.jInternalFrameDetalleFormConsolidadosDetalle.setSelected(false);						
		
		this.jInternalFrameDetalleFormConsolidadosDetalle.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormConsolidadosDetalle.consolidadosdetalleLogic=this.consolidadosdetalleLogic;
		
		this.cargarCombosFrameForeignKeyConsolidadosDetalle("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleConsolidadosDetalle();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConsolidadosDetalle();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyConsolidadosDetalle("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyConsolidadosDetalle();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormConsolidadosDetalle.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConsolidadosDetalle"));
		
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonModificarConsolidadosDetalle.addActionListener(new ButtonActionListener(this,"ModificarConsolidadosDetalle"));

		
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonModificarToolBarConsolidadosDetalle.addActionListener(new ButtonActionListener(this,"ModificarToolBarConsolidadosDetalle"));
					
		this.jInternalFrameDetalleFormConsolidadosDetalle.jMenuItemModificarConsolidadosDetalle.addActionListener(new ButtonActionListener(this,"MenuItemModificarConsolidadosDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonActualizarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"ActualizarConsolidadosDetalle"));
		
		
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonActualizarToolBarConsolidadosDetalle.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConsolidadosDetalle"));
						
		this.jInternalFrameDetalleFormConsolidadosDetalle.jMenuItemActualizarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConsolidadosDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonEliminarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"EliminarConsolidadosDetalle"));
		
		
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonEliminarToolBarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"EliminarToolBarConsolidadosDetalle"));
								
		this.jInternalFrameDetalleFormConsolidadosDetalle.jMenuItemEliminarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConsolidadosDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonCancelarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"CancelarConsolidadosDetalle"));
		
		
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonCancelarToolBarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"CancelarToolBarConsolidadosDetalle"));
					
		this.jInternalFrameDetalleFormConsolidadosDetalle.jMenuItemCancelarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConsolidadosDetalle"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormConsolidadosDetalle.jMenuItemDetalleCerrarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConsolidadosDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonGuardarCambiosToolBarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConsolidadosDetalle"));
		
		
		
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonGuardarCambiosToolBarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConsolidadosDetalle"));
		
		
		
		this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxTiposAccionesFormularioConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConsolidadosDetalle"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonidConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idConsolidadosDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonid_empresaConsolidadosDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConsolidadosDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonid_empresaConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonnombre_empresaConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_empresaConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonnombre_sucursalConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtoncodigo_sub_grupoConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonnombre_sub_grupoConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtoncodigo_detalle_grupoConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonnombre_detalle_grupoConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonclaveConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"claveConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonnombreConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombreConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonfecha_compraConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonvida_utilConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtoncosto_de_compraConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtoncantidadConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"cantidadConsolidadosDetalleBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTabbedPaneRelacionesConsolidadosDetalle.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConsolidadosDetalle"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameConsolidadosDetalle"));
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConsolidadosDetalle"));
		}
		
		this.jTableDatosConsolidadosDetalle.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarConsolidadosDetalle"));
		
		this.jTableDatosConsolidadosDetalle.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarConsolidadosDetalle"));
		
		this.jButtonNuevoConsolidadosDetalle.addActionListener(new ButtonActionListener(this,"NuevoConsolidadosDetalle"));
		
		this.jButtonDuplicarConsolidadosDetalle.addActionListener(new ButtonActionListener(this,"DuplicarConsolidadosDetalle"));
		
		this.jButtonCopiarConsolidadosDetalle.addActionListener(new ButtonActionListener(this,"CopiarConsolidadosDetalle"));
		
		this.jButtonVerFormConsolidadosDetalle.addActionListener(new ButtonActionListener(this,"VerFormConsolidadosDetalle"));
		
		
		this.jButtonNuevoToolBarConsolidadosDetalle.addActionListener(new ButtonActionListener(this,"NuevoToolBarConsolidadosDetalle"));
			
		this.jButtonDuplicarToolBarConsolidadosDetalle.addActionListener(new ButtonActionListener(this,"DuplicarToolBarConsolidadosDetalle"));
			
		this.jMenuItemNuevoConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemNuevoConsolidadosDetalle"));
			
		this.jMenuItemDuplicarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarConsolidadosDetalle"));		
		
		
		this.jButtonNuevoRelacionesConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"NuevoRelacionesConsolidadosDetalle"));
		
		
		this.jButtonNuevoRelacionesToolBarConsolidadosDetalle.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarConsolidadosDetalle"));
			
		this.jMenuItemNuevoRelacionesConsolidadosDetalle.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesConsolidadosDetalle"));		
		
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonModificarConsolidadosDetalle.addActionListener(new ButtonActionListener(this,"ModificarConsolidadosDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonModificarToolBarConsolidadosDetalle.addActionListener(new ButtonActionListener(this,"ModificarToolBarConsolidadosDetalle"));
			
			this.jInternalFrameDetalleFormConsolidadosDetalle.jMenuItemModificarConsolidadosDetalle.addActionListener(new ButtonActionListener(this,"MenuItemModificarConsolidadosDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonActualizarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"ActualizarConsolidadosDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonActualizarToolBarConsolidadosDetalle.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConsolidadosDetalle"));
				
			this.jInternalFrameDetalleFormConsolidadosDetalle.jMenuItemActualizarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConsolidadosDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonEliminarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"EliminarConsolidadosDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonEliminarToolBarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"EliminarToolBarConsolidadosDetalle"));
						
			this.jInternalFrameDetalleFormConsolidadosDetalle.jMenuItemEliminarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConsolidadosDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonCancelarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"CancelarConsolidadosDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonCancelarToolBarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"CancelarToolBarConsolidadosDetalle"));
			
			this.jInternalFrameDetalleFormConsolidadosDetalle.jMenuItemCancelarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConsolidadosDetalle"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarConsolidadosDetalle"));		
		
		
		this.jButtonCerrarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"CerrarConsolidadosDetalle"));
		
		
		this.jButtonCerrarToolBarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"CerrarToolBarConsolidadosDetalle"));
			
		this.jMenuItemCerrarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCerrarConsolidadosDetalle"));
			
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.jMenuItemDetalleCerrarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConsolidadosDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonGuardarCambiosConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosConsolidadosDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonGuardarCambiosToolBarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConsolidadosDetalle"));
		}
		
		this.jButtonCopiarToolBarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"CopiarToolBarConsolidadosDetalle"));
			
		this.jButtonVerFormToolBarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"VerFormToolBarConsolidadosDetalle"));
		
		this.jMenuItemGuardarCambiosConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosConsolidadosDetalle"));
			
		this.jMenuItemCopiarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCopiarConsolidadosDetalle"));		
		
		this.jMenuItemVerFormConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemVerFormConsolidadosDetalle"));		
		
		
		this.jButtonGuardarCambiosTablaConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConsolidadosDetalle"));
		
		
		this.jButtonGuardarCambiosTablaToolBarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarConsolidadosDetalle"));
			
		this.jMenuItemGuardarCambiosTablaConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConsolidadosDetalle"));		
		
		
		
		this.jButtonRecargarInformacionConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"RecargarInformacionConsolidadosDetalle"));
					
		this.jButtonRecargarInformacionToolBarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarConsolidadosDetalle"));
		
		this.jMenuItemRecargarInformacionConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionConsolidadosDetalle"));		
		
		
		
		this.jButtonAnterioresConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"AnterioresConsolidadosDetalle"));
		
		
		this.jButtonAnterioresToolBarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"AnterioresToolBarConsolidadosDetalle"));
		
		this.jMenuItemAnterioresConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresConsolidadosDetalle"));		
		
		
		this.jButtonSiguientesConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"SiguientesConsolidadosDetalle"));
		
		
		this.jButtonSiguientesToolBarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"SiguientesToolBarConsolidadosDetalle"));
			
		this.jMenuItemSiguientesConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesConsolidadosDetalle"));
			
		this.jMenuItemAbrirOrderByConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByConsolidadosDetalle"));
			
		this.jMenuItemMostrarOcultarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarConsolidadosDetalle"));
			
		this.jMenuItemDetalleAbrirOrderByConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByConsolidadosDetalle"));
			
		this.jMenuItemDetalleMostarOcultarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarConsolidadosDetalle"));		
		
		
		this.jButtonNuevoGuardarCambiosConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosConsolidadosDetalle"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarConsolidadosDetalle"));
			
		this.jMenuItemNuevoGuardarCambiosConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosConsolidadosDetalle"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosConsolidadosDetalle.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosConsolidadosDetalle"));

		this.jCheckBoxSeleccionadosConsolidadosDetalle.addItemListener(new CheckBoxItemListener(this,"SeleccionadosConsolidadosDetalle"));
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxTiposAccionesFormularioConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConsolidadosDetalle"));
		}
		
		
		this.jComboBoxTiposRelacionesConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"TiposRelacionesConsolidadosDetalle"));
			
		this.jComboBoxTiposAccionesConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesConsolidadosDetalle"));
					
		this.jComboBoxTiposSeleccionarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"TiposSeleccionarConsolidadosDetalle"));
			
		this.jTextFieldValorCampoGeneralConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralConsolidadosDetalle"));		
		
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonidConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idConsolidadosDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonid_empresaConsolidadosDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConsolidadosDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonid_empresaConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonnombre_empresaConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_empresaConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonnombre_sucursalConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtoncodigo_sub_grupoConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonnombre_sub_grupoConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtoncodigo_detalle_grupoConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonnombre_detalle_grupoConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonclaveConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"claveConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonnombreConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombreConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonfecha_compraConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonvida_utilConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtoncosto_de_compraConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtoncantidadConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"cantidadConsolidadosDetalleBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaConsolidadosDetalleConsolidadosDetalle.addActionListener(new ButtonActionListener(this,"BusquedaConsolidadosDetalleConsolidadosDetalle"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoConsolidadosDetalle!=null) {
				this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConsolidadosDetalle"));
				this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConsolidadosDetalle"));
				this.jInternalFrameReporteDinamicoConsolidadosDetalle.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConsolidadosDetalle"));
			}
			
			//this.jButtonCerrarReporteDinamicoConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConsolidadosDetalle"));				
			//this.jButtonGenerarReporteDinamicoConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConsolidadosDetalle"));
			//this.jButtonGenerarExcelReporteDinamicoConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConsolidadosDetalle"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionConsolidadosDetalle!=null) {
				this.jInternalFrameImportacionConsolidadosDetalle.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConsolidadosDetalle"));
				this.jInternalFrameImportacionConsolidadosDetalle.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConsolidadosDetalle"));
				this.jInternalFrameImportacionConsolidadosDetalle.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConsolidadosDetalle"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"AbrirOrderByConsolidadosDetalle"));
			
			this.jButtonAbrirOrderByToolBarConsolidadosDetalle.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarConsolidadosDetalle"));			
			
			if(this.jInternalFrameOrderByConsolidadosDetalle!=null) {
				this.jInternalFrameOrderByConsolidadosDetalle.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConsolidadosDetalle"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsolidadosDetalle.jTabbedPaneRelacionesConsolidadosDetalle.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConsolidadosDetalle"));
		
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
            		closingInternalFrameConsolidadosDetalle();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormConsolidadosDetalle.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormConsolidadosDetalle = (JInternalFrameBase)event.getSource();
	            	
	            ConsolidadosDetalleBeanSwingJInternalFrame jInternalFrameParent=(ConsolidadosDetalleBeanSwingJInternalFrame)jInternalFrameDetalleFormConsolidadosDetalle.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarConsolidadosDetalleActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosConsolidadosDetalle.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosConsolidadosDetalleListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosConsolidadosDetalle.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosConsolidadosDetalle.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsolidadosDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsolidadosDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsolidadosDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoConsolidadosDetalle";
		inputMap = this.jButtonNuevoConsolidadosDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoConsolidadosDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConsolidadosDetalleActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsolidadosDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsolidadosDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsolidadosDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesConsolidadosDetalle";
		inputMap = this.jButtonNuevoRelacionesConsolidadosDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesConsolidadosDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConsolidadosDetalleActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarConsolidadosDetalle";
		inputMap = this.jButtonModificarConsolidadosDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarConsolidadosDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarConsolidadosDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarConsolidadosDetalle";
		inputMap = this.jButtonActualizarConsolidadosDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarConsolidadosDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarConsolidadosDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarConsolidadosDetalle";
		inputMap = this.jButtonEliminarConsolidadosDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarConsolidadosDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarConsolidadosDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarConsolidadosDetalle";
		inputMap = this.jButtonCancelarConsolidadosDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarConsolidadosDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarConsolidadosDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarConsolidadosDetalle";
		inputMap = this.jButtonCerrarConsolidadosDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarConsolidadosDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarConsolidadosDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonGuardarCambiosConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosConsolidadosDetalle";
		inputMap = this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonGuardarCambiosConsolidadosDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonGuardarCambiosConsolidadosDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosConsolidadosDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosConsolidadosDetalle.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosConsolidadosDetalleItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesConsolidadosDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesConsolidadosDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarConsolidadosDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarConsolidadosDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralConsolidadosDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralConsolidadosDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonidConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idConsolidadosDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonid_empresaConsolidadosDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConsolidadosDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonid_empresaConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonnombre_empresaConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_empresaConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonnombre_sucursalConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtoncodigo_sub_grupoConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonnombre_sub_grupoConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtoncodigo_detalle_grupoConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonnombre_detalle_grupoConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonclaveConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"claveConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonnombreConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombreConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonfecha_compraConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtonvida_utilConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtoncosto_de_compraConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraConsolidadosDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsolidadosDetalle.jButtoncantidadConsolidadosDetalleBusqueda.addActionListener(new ButtonActionListener(this,"cantidadConsolidadosDetalleBusqueda"));
		
		
		this.jButtonBusquedaConsolidadosDetalleConsolidadosDetalle.addActionListener(new ButtonActionListener(this,"BusquedaConsolidadosDetalleConsolidadosDetalle"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionConsolidadosDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionConsolidadosDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarConsolidadosDetalleActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarConsolidadosDetalle.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosConsolidadosDetalle(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ConsolidadosDetalle consolidadosdetalleAux:this.consolidadosdetalleLogic.getConsolidadosDetalles()) {
					consolidadosdetalleAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConsolidadosDetalle consolidadosdetalleAux:consolidadosdetalles) {
					consolidadosdetalleAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosConsolidadosDetalleItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConsolidadosDetalle(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ConsolidadosDetalle consolidadosdetalleAux:this.consolidadosdetalleLogic.getConsolidadosDetalles()) {
						consolidadosdetalleAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConsolidadosDetalle consolidadosdetalleAux:consolidadosdetalles) {
						consolidadosdetalleAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ConsolidadosDetalle consolidadosdetalleAux:this.consolidadosdetalleLogic.getConsolidadosDetalles()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConsolidadosDetalle consolidadosdetalleAux:consolidadosdetalles) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaConsolidadosDetalle(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConsolidadosDetalle.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConsolidadosDetalle.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosDetalle,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosConsolidadosDetalleItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConsolidadosDetalle(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosConsolidadosDetalle.getSelectedRows();
			
			ConsolidadosDetalle consolidadosdetalleLocal=new ConsolidadosDetalle();
			
			//this.seleccionarTodosConsolidadosDetalle(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					consolidadosdetalleLocal =(ConsolidadosDetalle) this.consolidadosdetalleLogic.getConsolidadosDetalles().toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					consolidadosdetalleLocal =(ConsolidadosDetalle) this.consolidadosdetalles.toArray()[this.jTableDatosConsolidadosDetalle.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				consolidadosdetalleLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ConsolidadosDetalle consolidadosdetalleAux:this.consolidadosdetalleLogic.getConsolidadosDetalles()) {
						consolidadosdetalleAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConsolidadosDetalle consolidadosdetalleAux:consolidadosdetalles) {
						consolidadosdetalleAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaConsolidadosDetalle(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConsolidadosDetalle.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConsolidadosDetalle.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConsolidadosDetalle,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualConsolidadosDetalleItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarConsolidadosDetalleParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralConsolidadosDetalleActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingConsolidadosDetalle(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralConsolidadosDetalle.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ConsolidadosDetalle consolidadosdetalleAux:this.consolidadosdetalleLogic.getConsolidadosDetalles()) {
				
						if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREEMPRESA)) {
							existe=true;
							consolidadosdetalleAux.setnombre_empresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							consolidadosdetalleAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
							existe=true;
							consolidadosdetalleAux.setcodigo_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
							existe=true;
							consolidadosdetalleAux.setnombre_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
							existe=true;
							consolidadosdetalleAux.setcodigo_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							consolidadosdetalleAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							consolidadosdetalleAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							consolidadosdetalleAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							consolidadosdetalleAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_VIDAUTIL)) {
							existe=true;
							consolidadosdetalleAux.setvida_util(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_COSTODECOMPRA)) {
							existe=true;
							consolidadosdetalleAux.setcosto_de_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							consolidadosdetalleAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConsolidadosDetalle consolidadosdetalleAux:consolidadosdetalles) {
					
						if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREEMPRESA)) {
							existe=true;
							consolidadosdetalleAux.setnombre_empresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							consolidadosdetalleAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
							existe=true;
							consolidadosdetalleAux.setcodigo_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
							existe=true;
							consolidadosdetalleAux.setnombre_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
							existe=true;
							consolidadosdetalleAux.setcodigo_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							consolidadosdetalleAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							consolidadosdetalleAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							consolidadosdetalleAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							consolidadosdetalleAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_VIDAUTIL)) {
							existe=true;
							consolidadosdetalleAux.setvida_util(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_COSTODECOMPRA)) {
							existe=true;
							consolidadosdetalleAux.setcosto_de_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							consolidadosdetalleAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaConsolidadosDetalle(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesConsolidadosDetalleActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingConsolidadosDetalle(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioConsolidadosDetalle=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesConsolidadosDetalle.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxTiposAccionesFormularioConsolidadosDetalle.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteConsolidadosDetalle) {				
					conSplash=true;//false;										
					
					//this.startProcessConsolidadosDetalle(conSplash);
				
					this.generarReporteConsolidadosDetallesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsolidadosDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxTiposAccionesFormularioConsolidadosDetalle.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoConsolidadosDetallesSeleccionados();
				//this.jComboBoxTiposAccionesConsolidadosDetalle.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConsolidadosDetallesSeleccionados(false);
				//this.jComboBoxTiposAccionesConsolidadosDetalle.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConsolidadosDetallesSeleccionados(true);
				//this.jComboBoxTiposAccionesConsolidadosDetalle.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConsolidadosDetalle();
				
				this.exportarConsolidadosDetallesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsolidadosDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxTiposAccionesFormularioConsolidadosDetalle.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionConsolidadosDetalles();
				//this.importarConsolidadosDetalles();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsolidadosDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxTiposAccionesFormularioConsolidadosDetalle.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConsolidadosDetalle();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelConsolidadosDetallesSeleccionados();
				//this.jComboBoxTiposAccionesConsolidadosDetalle.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Consolidados Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessConsolidadosDetalle();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoConsolidadosDetalle)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyConsolidadosDetalle(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Consolidados Detalle",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsolidadosDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxTiposAccionesFormularioConsolidadosDetalle.setSelectedIndex(0);					
				}	
			} 			
			else if(ConsolidadosDetalleBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteConsolidadosDetalle) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessConsolidadosDetalle(conSplash);
					
						//this.actualizarParametrosGeneralConsolidadosDetalle();
						
						this.generarReporteProcesoAccionConsolidadosDetallesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesConsolidadosDetalle.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxTiposAccionesFormularioConsolidadosDetalle.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ConsolidadosDetalleBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Consolidados DetalleS SELECCIONADOS?", "MANTENIMIENTO DE Consolidados Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessConsolidadosDetalle();
				
						this.actualizarParametrosGeneralConsolidadosDetalle();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.consolidadosdetalleReturnGeneral=consolidadosdetalleLogic.procesarAccionConsolidadosDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.consolidadosdetalleLogic.getConsolidadosDetalles(),this.consolidadosdetalleParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarConsolidadosDetalleReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConsolidadosDetalle.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxTiposAccionesFormularioConsolidadosDetalle.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralConsolidadosDetalle();
					
					ConsolidadosDetalleBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarConsolidadosDetalleReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConsolidadosDetalle.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxTiposAccionesFormularioConsolidadosDetalle.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessConsolidadosDetalle(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesConsolidadosDetalleActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessConsolidadosDetalle();
			
			if(this.jInternalFrameDetalleFormConsolidadosDetalle==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ConsolidadosDetalle> consolidadosdetallesSeleccionados=new ArrayList<ConsolidadosDetalle>();		
			ConsolidadosDetalle consolidadosdetalle=new ConsolidadosDetalle();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingConsolidadosDetalle(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesConsolidadosDetalle.getSelectedItem();
			
			
			
			
			consolidadosdetallesSeleccionados=this.getConsolidadosDetallesSeleccionados(true);
			//this.sTipoAccion;
			
			if(consolidadosdetallesSeleccionados.size()==1) {
				for(ConsolidadosDetalle consolidadosdetalleAux:consolidadosdetallesSeleccionados) {
					consolidadosdetalle=consolidadosdetalleAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessConsolidadosDetalle();
			
      		//this.finishProcessConsolidadosDetalle(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarConsolidadosDetalleReturnGeneral() throws Exception {
		if(this.consolidadosdetalleReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.consolidadosdetalleReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.consolidadosdetalleReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.consolidadosdetalleReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.consolidadosdetalleReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.consolidadosdetalleReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingConsolidadosDetalle(false);
		}
		
		if(this.consolidadosdetalleReturnGeneral.getConRetornoLista() || this.consolidadosdetalleReturnGeneral.getConRetornoObjeto()) {
			if(this.consolidadosdetalleReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.consolidadosdetalleLogic.setConsolidadosDetalles(this.consolidadosdetalleReturnGeneral.getConsolidadosDetalles());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingConsolidadosDetalle(false);
		}
	}
	
	public void actualizarParametrosGeneralConsolidadosDetalle() throws Exception {
		
		
	}
	
	public ArrayList<ConsolidadosDetalle> getConsolidadosDetallesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ConsolidadosDetalle> consolidadosdetallesSeleccionados=new ArrayList<ConsolidadosDetalle>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioConsolidadosDetalle) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ConsolidadosDetalle consolidadosdetalleAux:consolidadosdetalleLogic.getConsolidadosDetalles()) {
					if(consolidadosdetalleAux.getIsSelected()) {
						consolidadosdetallesSeleccionados.add(consolidadosdetalleAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConsolidadosDetalle consolidadosdetalleAux:this.consolidadosdetalles) {
					if(consolidadosdetalleAux.getIsSelected()) {
						consolidadosdetallesSeleccionados.add(consolidadosdetalleAux);				
					}
				}
			}
			
			if(consolidadosdetallesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						consolidadosdetallesSeleccionados.addAll(this.consolidadosdetalleLogic.getConsolidadosDetalles());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						consolidadosdetallesSeleccionados.addAll(this.consolidadosdetalles);				
					}
				}
			}
		} else {
			consolidadosdetallesSeleccionados.add(this.consolidadosdetalle);
		}
		
		return consolidadosdetallesSeleccionados;
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
	
	public void generarReporteConsolidadosDetallesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalConsolidadosDetallesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoConsolidadosDetallesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConsolidadosDetallesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConsolidadosDetallesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Consolidados Detalle",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesConsolidadosDetallesSeleccionados() throws Exception {
		ArrayList<ConsolidadosDetalle> consolidadosdetallesSeleccionados=new ArrayList<ConsolidadosDetalle>();		
		
		consolidadosdetallesSeleccionados=this.getConsolidadosDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteConsolidadosDetalles("Todos",consolidadosdetallesSeleccionados);
		
	}	
	
	public void generarReporteNormalConsolidadosDetallesSeleccionados() throws Exception {
		ArrayList<ConsolidadosDetalle> consolidadosdetallesSeleccionados=new ArrayList<ConsolidadosDetalle>();		
		
		consolidadosdetallesSeleccionados=this.getConsolidadosDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteConsolidadosDetalles("Todos",consolidadosdetallesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionConsolidadosDetallesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ConsolidadosDetalle> consolidadosdetallesSeleccionados=new ArrayList<ConsolidadosDetalle>();
		
		consolidadosdetallesSeleccionados=this.getConsolidadosDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteConsolidadosDetalles("Todos",consolidadosdetallesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoConsolidadosDetallesSeleccionados() throws Exception {
		ArrayList<ConsolidadosDetalle> consolidadosdetallesSeleccionados=new ArrayList<ConsolidadosDetalle>();		
		
		
		this.abrirInicializarFrameReporteDinamicoConsolidadosDetalle();
		
		
		consolidadosdetallesSeleccionados=this.getConsolidadosDetallesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoConsolidadosDetalle();
		
		
		//this.generarReporteConsolidadosDetalles("Todos",consolidadosdetallesSeleccionados ,consolidadosdetalleImplementable,consolidadosdetalleImplementableHome);
	}
	
	public void mostrarImportacionConsolidadosDetalles() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionConsolidadosDetalle();
		
		this.abrirFrameImportacionConsolidadosDetalle();		
		
			
		//this.generarReporteConsolidadosDetalles("Todos",consolidadosdetallesSeleccionados ,consolidadosdetalleImplementable,consolidadosdetalleImplementableHome);
	}
	
	public void importarConsolidadosDetalles() throws Exception {		
	
	}
	
	public void exportarConsolidadosDetallesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelConsolidadosDetallesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoConsolidadosDetallesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlConsolidadosDetallesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Consolidados Detalle",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoConsolidadosDetallesSeleccionados() throws Exception {
		ArrayList<ConsolidadosDetalle> consolidadosdetallesSeleccionados=new ArrayList<ConsolidadosDetalle>();		
		
		consolidadosdetallesSeleccionados=this.getConsolidadosDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consolidadosdetalle."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarConsolidadosDetalle(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ConsolidadosDetalle consolidadosdetalleAux:consolidadosdetallesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarConsolidadosDetalle(consolidadosdetalleAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//consolidadosdetalleAux.setsDetalleGeneralEntityReporte(consolidadosdetalleAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consolidados Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarConsolidadosDetalle(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ConsolidadosDetalleConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosDetalleConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosDetalleConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosDetalleConstantesFunciones.LABEL_CODIGOSUBGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUBGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosDetalleConstantesFunciones.LABEL_CODIGODETALLEGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREDETALLEGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosDetalleConstantesFunciones.LABEL_CLAVE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosDetalleConstantesFunciones.LABEL_FECHACOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosDetalleConstantesFunciones.LABEL_VIDAUTIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosDetalleConstantesFunciones.LABEL_COSTODECOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsolidadosDetalleConstantesFunciones.LABEL_CANTIDAD;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalle,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=consolidadosdetalle.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosdetalle.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosdetalle.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosdetalle.getnombre_empresa();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosdetalle.getnombre_sucursal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosdetalle.getcodigo_sub_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosdetalle.getnombre_sub_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosdetalle.getcodigo_detalle_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosdetalle.getnombre_detalle_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosdetalle.getclave();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosdetalle.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosdetalle.getfecha_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosdetalle.getvida_util().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosdetalle.getcosto_de_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consolidadosdetalle.getcantidad().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelConsolidadosDetallesSeleccionados() throws Exception {
		ArrayList<ConsolidadosDetalle> consolidadosdetallesSeleccionados=new ArrayList<ConsolidadosDetalle>();		
		
		consolidadosdetallesSeleccionados=this.getConsolidadosDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consolidadosdetalle.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ConsolidadosDetalles");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelConsolidadosDetalle(row);				
				iRow++;
			}				
			
			for(ConsolidadosDetalle consolidadosdetalleAux:consolidadosdetallesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelConsolidadosDetalle(consolidadosdetalleAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consolidados Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlConsolidadosDetallesSeleccionados() throws Exception {
		ArrayList<ConsolidadosDetalle> consolidadosdetallesSeleccionados=new ArrayList<ConsolidadosDetalle>();		
		
		consolidadosdetallesSeleccionados=this.getConsolidadosDetallesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consolidadosdetalle.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("consolidadosdetalles");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("consolidadosdetalle");
			//elementRoot.appendChild(element);
		
			for(ConsolidadosDetalle consolidadosdetalleAux:consolidadosdetallesSeleccionados) {
				element = document.createElement("consolidadosdetalle");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlConsolidadosDetalle(consolidadosdetalleAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consolidados Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelConsolidadosDetalle(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_CODIGOSUBGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUBGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_CLAVE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_FECHACOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_VIDAUTIL);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_COSTODECOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsolidadosDetalleConstantesFunciones.LABEL_CANTIDAD);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalle,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosdetalle.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosdetalle.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosdetalle.getnombre_empresa());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosdetalle.getnombre_sucursal());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosdetalle.getcodigo_sub_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosdetalle.getnombre_sub_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosdetalle.getcodigo_detalle_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosdetalle.getnombre_detalle_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosdetalle.getclave());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosdetalle.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosdetalle.getfecha_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosdetalle.getvida_util());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosdetalle.getcosto_de_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(consolidadosdetalle.getcantidad());				
	}
	
	public void setFilaDatosExportarXmlConsolidadosDetalle(ConsolidadosDetalle consolidadosdetalle,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ConsolidadosDetalleConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(consolidadosdetalle.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ConsolidadosDetalleConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(consolidadosdetalle.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ConsolidadosDetalleConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(consolidadosdetalle.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre_empresa = document.createElement(ConsolidadosDetalleConstantesFunciones.NOMBREEMPRESA);
		elementnombre_empresa.appendChild(document.createTextNode(consolidadosdetalle.getnombre_empresa().trim()));
		element.appendChild(elementnombre_empresa);

		Element elementnombre_sucursal = document.createElement(ConsolidadosDetalleConstantesFunciones.NOMBRESUCURSAL);
		elementnombre_sucursal.appendChild(document.createTextNode(consolidadosdetalle.getnombre_sucursal().trim()));
		element.appendChild(elementnombre_sucursal);

		Element elementcodigo_sub_grupo = document.createElement(ConsolidadosDetalleConstantesFunciones.CODIGOSUBGRUPO);
		elementcodigo_sub_grupo.appendChild(document.createTextNode(consolidadosdetalle.getcodigo_sub_grupo().trim()));
		element.appendChild(elementcodigo_sub_grupo);

		Element elementnombre_sub_grupo = document.createElement(ConsolidadosDetalleConstantesFunciones.NOMBRESUBGRUPO);
		elementnombre_sub_grupo.appendChild(document.createTextNode(consolidadosdetalle.getnombre_sub_grupo().trim()));
		element.appendChild(elementnombre_sub_grupo);

		Element elementcodigo_detalle_grupo = document.createElement(ConsolidadosDetalleConstantesFunciones.CODIGODETALLEGRUPO);
		elementcodigo_detalle_grupo.appendChild(document.createTextNode(consolidadosdetalle.getcodigo_detalle_grupo().trim()));
		element.appendChild(elementcodigo_detalle_grupo);

		Element elementnombre_detalle_grupo = document.createElement(ConsolidadosDetalleConstantesFunciones.NOMBREDETALLEGRUPO);
		elementnombre_detalle_grupo.appendChild(document.createTextNode(consolidadosdetalle.getnombre_detalle_grupo().trim()));
		element.appendChild(elementnombre_detalle_grupo);

		Element elementclave = document.createElement(ConsolidadosDetalleConstantesFunciones.CLAVE);
		elementclave.appendChild(document.createTextNode(consolidadosdetalle.getclave().trim()));
		element.appendChild(elementclave);

		Element elementnombre = document.createElement(ConsolidadosDetalleConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(consolidadosdetalle.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementfecha_compra = document.createElement(ConsolidadosDetalleConstantesFunciones.FECHACOMPRA);
		elementfecha_compra.appendChild(document.createTextNode(consolidadosdetalle.getfecha_compra().toString().trim()));
		element.appendChild(elementfecha_compra);

		Element elementvida_util = document.createElement(ConsolidadosDetalleConstantesFunciones.VIDAUTIL);
		elementvida_util.appendChild(document.createTextNode(consolidadosdetalle.getvida_util().toString().trim()));
		element.appendChild(elementvida_util);

		Element elementcosto_de_compra = document.createElement(ConsolidadosDetalleConstantesFunciones.COSTODECOMPRA);
		elementcosto_de_compra.appendChild(document.createTextNode(consolidadosdetalle.getcosto_de_compra().toString().trim()));
		element.appendChild(elementcosto_de_compra);

		Element elementcantidad = document.createElement(ConsolidadosDetalleConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(consolidadosdetalle.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);
	}
	
	public void generarReporteGroupGenericoConsolidadosDetallesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ConsolidadosDetalle> consolidadosdetallesSeleccionados=new ArrayList<ConsolidadosDetalle>();
		
		consolidadosdetallesSeleccionados=this.getConsolidadosDetallesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoConsolidadosDetalle(consolidadosdetallesSeleccionados);
		
		this.generarReporteConsolidadosDetalles("Todos",consolidadosdetallesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoConsolidadosDetalle(ArrayList<ConsolidadosDetalle> consolidadosdetallesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ConsolidadosDetalle consolidadosdetalleAux:consolidadosdetallesSeleccionados) {
				consolidadosdetalleAux.setsDetalleGeneralEntityReporte(consolidadosdetalleAux.toString());
			
				if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					consolidadosdetalleAux.setsDescripcionGeneralEntityReporte1(consolidadosdetalleAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREEMPRESA)) {
					existe=true;
					consolidadosdetalleAux.setsDescripcionGeneralEntityReporte1(consolidadosdetalleAux.getnombre_empresa());
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
					existe=true;
					consolidadosdetalleAux.setsDescripcionGeneralEntityReporte1(consolidadosdetalleAux.getnombre_sucursal());
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
					existe=true;
					consolidadosdetalleAux.setsDescripcionGeneralEntityReporte1(consolidadosdetalleAux.getcodigo_sub_grupo());
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
					existe=true;
					consolidadosdetalleAux.setsDescripcionGeneralEntityReporte1(consolidadosdetalleAux.getnombre_sub_grupo());
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
					existe=true;
					consolidadosdetalleAux.setsDescripcionGeneralEntityReporte1(consolidadosdetalleAux.getcodigo_detalle_grupo());
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
					existe=true;
					consolidadosdetalleAux.setsDescripcionGeneralEntityReporte1(consolidadosdetalleAux.getnombre_detalle_grupo());
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_CLAVE)) {
					existe=true;
					consolidadosdetalleAux.setsDescripcionGeneralEntityReporte1(consolidadosdetalleAux.getclave());
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					consolidadosdetalleAux.setsDescripcionGeneralEntityReporte1(consolidadosdetalleAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_FECHACOMPRA)) {
					existe=true;
					consolidadosdetalleAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(consolidadosdetalleAux.getfecha_compra()));
				}
				 else if(sTipoSeleccionar.equals(ConsolidadosDetalleConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					consolidadosdetalleAux.setsDescripcionGeneralEntityReporte1(consolidadosdetalleAux.getcantidad().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsolidadosDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesConsolidadosDetalle(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoConsolidadosDetalle=true;
				this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle=true;
				this.isVisibilidadCeldaGuardarCambiosConsolidadosDetalle=true;
			}
			
			this.isVisibilidadCeldaModificarConsolidadosDetalle=false;
			this.isVisibilidadCeldaActualizarConsolidadosDetalle=false;
			this.isVisibilidadCeldaEliminarConsolidadosDetalle=false;
			this.isVisibilidadCeldaCancelarConsolidadosDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsolidadosDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarConsolidadosDetalle=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoConsolidadosDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosConsolidadosDetalle=false;
			this.isVisibilidadCeldaModificarConsolidadosDetalle=false;
			this.isVisibilidadCeldaActualizarConsolidadosDetalle=true;
			this.isVisibilidadCeldaEliminarConsolidadosDetalle=false;
			this.isVisibilidadCeldaCancelarConsolidadosDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsolidadosDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarConsolidadosDetalle=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoConsolidadosDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosConsolidadosDetalle=false;
			this.isVisibilidadCeldaModificarConsolidadosDetalle=false;
			this.isVisibilidadCeldaActualizarConsolidadosDetalle=true;
			this.isVisibilidadCeldaEliminarConsolidadosDetalle=true;
			this.isVisibilidadCeldaCancelarConsolidadosDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsolidadosDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarConsolidadosDetalle=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoConsolidadosDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosConsolidadosDetalle=false;
			this.isVisibilidadCeldaModificarConsolidadosDetalle=false;
			this.isVisibilidadCeldaActualizarConsolidadosDetalle=true;
			this.isVisibilidadCeldaEliminarConsolidadosDetalle=false;
			this.isVisibilidadCeldaCancelarConsolidadosDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsolidadosDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarConsolidadosDetalle=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoConsolidadosDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle=true;
			this.isVisibilidadCeldaGuardarCambiosConsolidadosDetalle=true;
			this.isVisibilidadCeldaModificarConsolidadosDetalle=false;
			this.isVisibilidadCeldaActualizarConsolidadosDetalle=false;
			this.isVisibilidadCeldaEliminarConsolidadosDetalle=false;
			this.isVisibilidadCeldaCancelarConsolidadosDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsolidadosDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarConsolidadosDetalle=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoConsolidadosDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosConsolidadosDetalle=false;
			this.isVisibilidadCeldaActualizarConsolidadosDetalle=false;
			this.isVisibilidadCeldaEliminarConsolidadosDetalle=false;
			this.isVisibilidadCeldaCancelarConsolidadosDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsolidadosDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarConsolidadosDetalle=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoConsolidadosDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosConsolidadosDetalle=false;
			this.isVisibilidadCeldaModificarConsolidadosDetalle=true;
			this.isVisibilidadCeldaActualizarConsolidadosDetalle=false;
			this.isVisibilidadCeldaEliminarConsolidadosDetalle=false;
			this.isVisibilidadCeldaCancelarConsolidadosDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsolidadosDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarConsolidadosDetalle=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ConsolidadosDetalleJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoConsolidadosDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle=true;
			this.isVisibilidadCeldaGuardarCambiosConsolidadosDetalle=true;
		} else {
			this.actualizarEstadoPanelsConsolidadosDetalle(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarConsolidadosDetalle=false;
			//this.isVisibilidadCeldaVerFormConsolidadosDetalle=false;
			this.isVisibilidadCeldaDuplicarConsolidadosDetalle=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!consolidadosdetalleSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle=false;
		} else {
			this.isVisibilidadCeldaNuevoConsolidadosDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosConsolidadosDetalle=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
			if(!consolidadosdetalleSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle=false;												
			}
			
			this.jButtonCerrarConsolidadosDetalle.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle=false;
		}
		
		if(!this.permiteMantenimiento(this.consolidadosdetalle)) {
			this.isVisibilidadCeldaActualizarConsolidadosDetalle=false;
			this.isVisibilidadCeldaEliminarConsolidadosDetalle=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoConsolidadosDetalle=false;
		this.isVisibilidadCeldaNuevoRelacionesConsolidadosDetalle=false;
		this.isVisibilidadCeldaGuardarCambiosConsolidadosDetalle=false;
		//this.isVisibilidadCeldaModificarConsolidadosDetalle=true;
		this.isVisibilidadCeldaActualizarConsolidadosDetalle=false;
		this.isVisibilidadCeldaEliminarConsolidadosDetalle=false;
		//this.isVisibilidadCeldaCancelarConsolidadosDetalle=true;			
		this.isVisibilidadCeldaGuardarConsolidadosDetalle=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesConsolidadosDetalle() {
	}
	
	public void actualizarEstadoPanelsConsolidadosDetalle(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionConsolidadosDetalle!=null) {
				this.jScrollPanelDatosEdicionConsolidadosDetalle.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsolidadosDetalle!=null) {
				this.jTabbedPaneBusquedasConsolidadosDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsolidadosDetalle!=null) {
				this.jScrollPanelDatosConsolidadosDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsolidadosDetalle!=null) {
				this.jPanelPaginacionConsolidadosDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsolidadosDetalle!=null) {
				this.jPanelParametrosReportesConsolidadosDetalle.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionConsolidadosDetalle!=null) {
				this.jScrollPanelDatosEdicionConsolidadosDetalle.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsolidadosDetalle!=null) {
				this.jTabbedPaneBusquedasConsolidadosDetalle.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosConsolidadosDetalle!=null) {
				this.jScrollPanelDatosConsolidadosDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionConsolidadosDetalle!=null) {
				this.jPanelPaginacionConsolidadosDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConsolidadosDetalle!=null) {
				this.jPanelParametrosReportesConsolidadosDetalle.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionConsolidadosDetalle!=null) {
				this.jScrollPanelDatosEdicionConsolidadosDetalle.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsolidadosDetalle!=null) {
				this.jTabbedPaneBusquedasConsolidadosDetalle.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConsolidadosDetalle!=null) {
				this.jScrollPanelDatosConsolidadosDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionConsolidadosDetalle!=null) {
				this.jPanelPaginacionConsolidadosDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConsolidadosDetalle!=null) {
				this.jPanelParametrosReportesConsolidadosDetalle.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionConsolidadosDetalle!=null) {
				this.jScrollPanelDatosEdicionConsolidadosDetalle.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsolidadosDetalle!=null) {
				this.jTabbedPaneBusquedasConsolidadosDetalle.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConsolidadosDetalle!=null) {
				this.jScrollPanelDatosConsolidadosDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionConsolidadosDetalle!=null) {
				this.jPanelPaginacionConsolidadosDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConsolidadosDetalle!=null) {
				this.jPanelParametrosReportesConsolidadosDetalle.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionConsolidadosDetalle!=null) {
				this.jScrollPanelDatosEdicionConsolidadosDetalle.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsolidadosDetalle!=null) {
				this.jTabbedPaneBusquedasConsolidadosDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsolidadosDetalle!=null) {
				this.jScrollPanelDatosConsolidadosDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsolidadosDetalle!=null) {
				this.jPanelPaginacionConsolidadosDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsolidadosDetalle!=null) {
				this.jPanelParametrosReportesConsolidadosDetalle.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionConsolidadosDetalle!=null) {
				this.jScrollPanelDatosEdicionConsolidadosDetalle.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsolidadosDetalle!=null) {
				this.jTabbedPaneBusquedasConsolidadosDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsolidadosDetalle!=null) {
				this.jScrollPanelDatosConsolidadosDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsolidadosDetalle!=null) {
				this.jPanelPaginacionConsolidadosDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsolidadosDetalle!=null) {
				this.jPanelParametrosReportesConsolidadosDetalle.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionConsolidadosDetalle!=null) {
				this.jScrollPanelDatosEdicionConsolidadosDetalle.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsolidadosDetalle!=null) {
				this.jTabbedPaneBusquedasConsolidadosDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsolidadosDetalle!=null) {
				this.jScrollPanelDatosConsolidadosDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsolidadosDetalle!=null) {
				this.jPanelPaginacionConsolidadosDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsolidadosDetalle!=null) {
				this.jPanelParametrosReportesConsolidadosDetalle.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasConsolidadosDetalle!=null) {
					this.jTabbedPaneBusquedasConsolidadosDetalle.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesConsolidadosDetalle!=null) {
				this.jPanelParametrosReportesConsolidadosDetalle.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsolidadosDetalle!=null) {
				this.jTabbedPaneBusquedasConsolidadosDetalle.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesConsolidadosDetalle!=null) {
				this.jPanelParametrosReportesConsolidadosDetalle.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaConsolidadosDetalle=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaConsolidadosDetalle) {this.jTabbedPaneBusquedasConsolidadosDetalle.remove(jPanelBusquedaConsolidadosDetalleConsolidadosDetalle);}
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
			
			this.inicializarActualizarBindingTablaConsolidadosDetalle(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioConsolidadosDetalle() {
		this.updateBorderResaltarBusquedasFormularioConsolidadosDetalle();
		this.updateVisibilidadBusquedasFormularioConsolidadosDetalle();
		this.updateHabilitarBusquedasFormularioConsolidadosDetalle();
	}
	
	public void updateBorderResaltarBusquedasFormularioConsolidadosDetalle() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasConsolidadosDetalle.getComponents().length>0) {
	

		if(this.consolidadosdetalleConstantesFunciones.resaltarBusquedaConsolidadosDetalleConsolidadosDetalle!=null) {
			index= this.jTabbedPaneBusquedasConsolidadosDetalle.indexOfComponent(this.jPanelBusquedaConsolidadosDetalleConsolidadosDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConsolidadosDetalle.getComponent(index);
				jPanel.setBorder(this.consolidadosdetalleConstantesFunciones.resaltarBusquedaConsolidadosDetalleConsolidadosDetalle);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioConsolidadosDetalle() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasConsolidadosDetalle.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConsolidadosDetalle.indexOfComponent(this.jPanelBusquedaConsolidadosDetalleConsolidadosDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasConsolidadosDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarBusquedaConsolidadosDetalleConsolidadosDetalle);
			if(!this.consolidadosdetalleConstantesFunciones.mostrarBusquedaConsolidadosDetalleConsolidadosDetalle && index>-1) {
				this.jTabbedPaneBusquedasConsolidadosDetalle.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioConsolidadosDetalle() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasConsolidadosDetalle.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConsolidadosDetalle.indexOfComponent(this.jPanelBusquedaConsolidadosDetalleConsolidadosDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasConsolidadosDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.consolidadosdetalleConstantesFunciones.activarBusquedaConsolidadosDetalleConsolidadosDetalle);
				this.jTabbedPaneBusquedasConsolidadosDetalle.setEnabledAt(index,this.consolidadosdetalleConstantesFunciones.activarBusquedaConsolidadosDetalleConsolidadosDetalle);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaConsolidadosDetalle(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaConsolidadosDetalle")) {
			index= this.jTabbedPaneBusquedasConsolidadosDetalle.indexOfComponent(this.jPanelBusquedaConsolidadosDetalleConsolidadosDetalle);

			this.jTabbedPaneBusquedasConsolidadosDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConsolidadosDetalle.getComponent(index);

			this.consolidadosdetalleConstantesFunciones.setResaltarBusquedaConsolidadosDetalleConsolidadosDetalle(resaltar);

			jPanel.setBorder(this.consolidadosdetalleConstantesFunciones.resaltarBusquedaConsolidadosDetalleConsolidadosDetalle);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarConsolidadosDetalle.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioConsolidadosDetalle() throws Exception {

		if(this.jInternalFrameDetalleFormConsolidadosDetalle==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioConsolidadosDetalle();
		this.updateVisibilidadResaltarControlesFormularioConsolidadosDetalle();
		this.updateHabilitarResaltarControlesFormularioConsolidadosDetalle();
		
	}
	
	public void updateBorderResaltarControlesFormularioConsolidadosDetalle() throws Exception {
		if(this.jInternalFrameDetalleFormConsolidadosDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.consolidadosdetalleConstantesFunciones.resaltaridConsolidadosDetalle!=null && this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelidConsolidadosDetalle.setBorder(this.consolidadosdetalleConstantesFunciones.resaltaridConsolidadosDetalle);}
		if(this.consolidadosdetalleConstantesFunciones.resaltarid_empresaConsolidadosDetalle!=null && this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxid_empresaConsolidadosDetalle.setBorder(this.consolidadosdetalleConstantesFunciones.resaltarid_empresaConsolidadosDetalle);}
		if(this.consolidadosdetalleConstantesFunciones.resaltarnombre_empresaConsolidadosDetalle!=null && this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_empresaConsolidadosDetalle.setBorder(this.consolidadosdetalleConstantesFunciones.resaltarnombre_empresaConsolidadosDetalle);}
		if(this.consolidadosdetalleConstantesFunciones.resaltarnombre_sucursalConsolidadosDetalle!=null && this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_sucursalConsolidadosDetalle.setBorder(this.consolidadosdetalleConstantesFunciones.resaltarnombre_sucursalConsolidadosDetalle);}
		if(this.consolidadosdetalleConstantesFunciones.resaltarcodigo_sub_grupoConsolidadosDetalle!=null && this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcodigo_sub_grupoConsolidadosDetalle.setBorder(this.consolidadosdetalleConstantesFunciones.resaltarcodigo_sub_grupoConsolidadosDetalle);}
		if(this.consolidadosdetalleConstantesFunciones.resaltarnombre_sub_grupoConsolidadosDetalle!=null && this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_sub_grupoConsolidadosDetalle.setBorder(this.consolidadosdetalleConstantesFunciones.resaltarnombre_sub_grupoConsolidadosDetalle);}
		if(this.consolidadosdetalleConstantesFunciones.resaltarcodigo_detalle_grupoConsolidadosDetalle!=null && this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcodigo_detalle_grupoConsolidadosDetalle.setBorder(this.consolidadosdetalleConstantesFunciones.resaltarcodigo_detalle_grupoConsolidadosDetalle);}
		if(this.consolidadosdetalleConstantesFunciones.resaltarnombre_detalle_grupoConsolidadosDetalle!=null && this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_detalle_grupoConsolidadosDetalle.setBorder(this.consolidadosdetalleConstantesFunciones.resaltarnombre_detalle_grupoConsolidadosDetalle);}
		if(this.consolidadosdetalleConstantesFunciones.resaltarclaveConsolidadosDetalle!=null && this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldclaveConsolidadosDetalle.setBorder(this.consolidadosdetalleConstantesFunciones.resaltarclaveConsolidadosDetalle);}
		if(this.consolidadosdetalleConstantesFunciones.resaltarnombreConsolidadosDetalle!=null && this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombreConsolidadosDetalle.setBorder(this.consolidadosdetalleConstantesFunciones.resaltarnombreConsolidadosDetalle);}
		if(this.consolidadosdetalleConstantesFunciones.resaltarfecha_compraConsolidadosDetalle!=null && this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {this.jInternalFrameDetalleFormConsolidadosDetalle.jDateChooserfecha_compraConsolidadosDetalle.setBorder(this.consolidadosdetalleConstantesFunciones.resaltarfecha_compraConsolidadosDetalle);}
		if(this.consolidadosdetalleConstantesFunciones.resaltarvida_utilConsolidadosDetalle!=null && this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldvida_utilConsolidadosDetalle.setBorder(this.consolidadosdetalleConstantesFunciones.resaltarvida_utilConsolidadosDetalle);}
		if(this.consolidadosdetalleConstantesFunciones.resaltarcosto_de_compraConsolidadosDetalle!=null && this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcosto_de_compraConsolidadosDetalle.setBorder(this.consolidadosdetalleConstantesFunciones.resaltarcosto_de_compraConsolidadosDetalle);}
		if(this.consolidadosdetalleConstantesFunciones.resaltarcantidadConsolidadosDetalle!=null && this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcantidadConsolidadosDetalle.setBorder(this.consolidadosdetalleConstantesFunciones.resaltarcantidadConsolidadosDetalle);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioConsolidadosDetalle() throws Exception {		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
	
		//this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelidConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostraridConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jPanelidConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostraridConsolidadosDetalle);
		//this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxid_empresaConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarid_empresaConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jPanelid_empresaConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarid_empresaConsolidadosDetalle);
		//this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_empresaConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarnombre_empresaConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jPanelnombre_empresaConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarnombre_empresaConsolidadosDetalle);
		//this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_sucursalConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarnombre_sucursalConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jPanelnombre_sucursalConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarnombre_sucursalConsolidadosDetalle);
		//this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcodigo_sub_grupoConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarcodigo_sub_grupoConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jPanelcodigo_sub_grupoConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarcodigo_sub_grupoConsolidadosDetalle);
		//this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_sub_grupoConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarnombre_sub_grupoConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jPanelnombre_sub_grupoConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarnombre_sub_grupoConsolidadosDetalle);
		//this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcodigo_detalle_grupoConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarcodigo_detalle_grupoConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jPanelcodigo_detalle_grupoConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarcodigo_detalle_grupoConsolidadosDetalle);
		//this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_detalle_grupoConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarnombre_detalle_grupoConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jPanelnombre_detalle_grupoConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarnombre_detalle_grupoConsolidadosDetalle);
		//this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldclaveConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarclaveConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jPanelclaveConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarclaveConsolidadosDetalle);
		//this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombreConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarnombreConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jPanelnombreConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarnombreConsolidadosDetalle);
		//this.jInternalFrameDetalleFormConsolidadosDetalle.jDateChooserfecha_compraConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarfecha_compraConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jPanelfecha_compraConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarfecha_compraConsolidadosDetalle);
		//this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldvida_utilConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarvida_utilConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jPanelvida_utilConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarvida_utilConsolidadosDetalle);
		//this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcosto_de_compraConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarcosto_de_compraConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jPanelcosto_de_compraConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarcosto_de_compraConsolidadosDetalle);
		//this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcantidadConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarcantidadConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jPanelcantidadConsolidadosDetalle.setVisible(this.consolidadosdetalleConstantesFunciones.mostrarcantidadConsolidadosDetalle);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioConsolidadosDetalle() throws Exception {
		if(this.jInternalFrameDetalleFormConsolidadosDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConsolidadosDetalle!=null) {
	
		this.jInternalFrameDetalleFormConsolidadosDetalle.jLabelidConsolidadosDetalle.setEnabled(this.consolidadosdetalleConstantesFunciones.activaridConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jComboBoxid_empresaConsolidadosDetalle.setEnabled(this.consolidadosdetalleConstantesFunciones.activarid_empresaConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_empresaConsolidadosDetalle.setEnabled(this.consolidadosdetalleConstantesFunciones.activarnombre_empresaConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_sucursalConsolidadosDetalle.setEnabled(this.consolidadosdetalleConstantesFunciones.activarnombre_sucursalConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcodigo_sub_grupoConsolidadosDetalle.setEnabled(this.consolidadosdetalleConstantesFunciones.activarcodigo_sub_grupoConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_sub_grupoConsolidadosDetalle.setEnabled(this.consolidadosdetalleConstantesFunciones.activarnombre_sub_grupoConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcodigo_detalle_grupoConsolidadosDetalle.setEnabled(this.consolidadosdetalleConstantesFunciones.activarcodigo_detalle_grupoConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombre_detalle_grupoConsolidadosDetalle.setEnabled(this.consolidadosdetalleConstantesFunciones.activarnombre_detalle_grupoConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldclaveConsolidadosDetalle.setEnabled(this.consolidadosdetalleConstantesFunciones.activarclaveConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextAreanombreConsolidadosDetalle.setEnabled(this.consolidadosdetalleConstantesFunciones.activarnombreConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jDateChooserfecha_compraConsolidadosDetalle.setEnabled(this.consolidadosdetalleConstantesFunciones.activarfecha_compraConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldvida_utilConsolidadosDetalle.setEnabled(this.consolidadosdetalleConstantesFunciones.activarvida_utilConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcosto_de_compraConsolidadosDetalle.setEnabled(this.consolidadosdetalleConstantesFunciones.activarcosto_de_compraConsolidadosDetalle);
		this.jInternalFrameDetalleFormConsolidadosDetalle.jTextFieldcantidadConsolidadosDetalle.setEnabled(this.consolidadosdetalleConstantesFunciones.activarcantidadConsolidadosDetalle);
		}
	}
	
		
}